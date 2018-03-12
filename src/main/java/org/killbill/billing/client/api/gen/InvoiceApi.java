package org.killbill.billing.client.api.gen;


import org.killbill.billing.client.model.gen.CustomField;
import org.killbill.billing.client.model.gen.Invoice;
import org.killbill.billing.client.model.gen.InvoiceDryRun;
import org.killbill.billing.client.model.gen.InvoiceItem;
import org.killbill.billing.client.model.gen.InvoicePayment;
import org.killbill.billing.client.model.gen.Tag;
import java.util.UUID;
import org.killbill.billing.client.model.InvoiceItems;
import java.util.List;
import org.killbill.billing.client.model.CustomFields;
import org.killbill.billing.util.api.AuditLevel;
import org.killbill.billing.client.model.Invoices;
import org.killbill.billing.client.model.InvoicePayments;
import org.killbill.billing.client.model.Tags;


import com.google.common.collect.Multimap;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.base.MoreObjects;

import org.killbill.billing.client.KillBillClientException;
import org.killbill.billing.client.KillBillHttpClient;
import org.killbill.billing.client.RequestOptions;
import org.killbill.billing.util.api.AuditLevel;


/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
public class InvoiceApi {

    private final KillBillHttpClient httpClient;

    public InvoiceApi() {
        this(new KillBillHttpClient());
    }

    public InvoiceApi(final KillBillHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public InvoiceItem adjustInvoiceItem(final InvoiceItem body, final UUID invoiceId, final String requestedDate,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling adjustInvoiceItem");
        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling adjustInvoiceItem");

        final String uri = "/1.0/kb/invoices/{invoiceId}"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("requestedDate", String.valueOf(requestedDate));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPost(uri, body, InvoiceItem.class, requestOptions);
    }

    public void commitInvoice(final UUID invoiceId,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling commitInvoice");

        final String uri = "/1.0/kb/invoices/{invoiceId}/commitInvoice"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

         httpClient.doPut(uri, null, requestOptions);
    }

    public CustomFields createCustomFields(final UUID invoiceId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling createCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createCustomFields");

        final String uri = "/1.0/kb/invoices/{invoiceId}/customFields"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());


        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .build();

        return httpClient.doPost(uri, body, CustomFields.class, requestOptions);
    }

    public InvoiceItems createExternalCharges(final InvoiceItems body, final UUID accountId, final String requestedDate, final Boolean payInvoice, final List<String> pluginProperty, final Boolean autoCommit, final String paymentExternalKey, final String transactionExternalKey,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createExternalCharges");
        Preconditions.checkNotNull(accountId, "Missing the required parameter 'accountId' when calling createExternalCharges");

        final String uri = "/1.0/kb/invoices/charges/{accountId}"
          .replaceAll("\\{" + "accountId" + "\\}", accountId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("requestedDate", String.valueOf(requestedDate));
        queryParams.put("payInvoice", String.valueOf(payInvoice));
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));
        queryParams.put("autoCommit", String.valueOf(autoCommit));
        queryParams.put("paymentExternalKey", String.valueOf(paymentExternalKey));
        queryParams.put("transactionExternalKey", String.valueOf(transactionExternalKey));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPost(uri, body, InvoiceItems.class, requestOptions);
    }

    public void createFutureInvoice(final UUID accountId, final String targetDate,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(accountId, "Missing the required parameter 'accountId' when calling createFutureInvoice");

        final String uri = "/1.0/kb/invoices";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("accountId", String.valueOf(accountId));
        queryParams.put("targetDate", String.valueOf(targetDate));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        httpClient.doPost(uri, null, requestOptions);
    }

    public InvoicePayment createInstantPayment(final InvoicePayment body, final UUID invoiceId, final Boolean externalPayment, final List<String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createInstantPayment");
        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling createInstantPayment");

        final String uri = "/1.0/kb/invoices/{invoiceId}/payments"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("externalPayment", String.valueOf(externalPayment));
        queryParams.put("pluginProperty", String.valueOf(pluginProperty));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPost(uri, body, InvoicePayment.class, requestOptions);
    }

    public InvoiceItems createMigrationInvoice(final InvoiceItems body, final UUID accountId, final String targetDate,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createMigrationInvoice");
        Preconditions.checkNotNull(accountId, "Missing the required parameter 'accountId' when calling createMigrationInvoice");

        final String uri = "/1.0/kb/invoices/migration/{accountId}"
          .replaceAll("\\{" + "accountId" + "\\}", accountId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("targetDate", String.valueOf(targetDate));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPost(uri, body, InvoiceItems.class, requestOptions);
    }

    public void createTags(final UUID invoiceId, final String tagList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling createTags");

        final String uri = "/1.0/kb/invoices/{invoiceId}/tags"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("tagList", String.valueOf(tagList));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        httpClient.doPost(uri, null, requestOptions);
    }

    public void deleteCBA(final UUID invoiceId, final UUID invoiceItemId, final UUID accountId,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling deleteCBA");
        Preconditions.checkNotNull(invoiceItemId, "Missing the required parameter 'invoiceItemId' when calling deleteCBA");
        Preconditions.checkNotNull(accountId, "Missing the required parameter 'accountId' when calling deleteCBA");

        final String uri = "/1.0/kb/invoices/{invoiceId}/{invoiceItemId}/cba"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString())
          .replaceAll("\\{" + "invoiceItemId" + "\\}", invoiceItemId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("accountId", String.valueOf(accountId));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        httpClient.doDelete(uri, requestOptions);
    }

    public void deleteCustomFields(final UUID invoiceId, final String customFieldList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling deleteCustomFields");

        final String uri = "/1.0/kb/invoices/{invoiceId}/customFields"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("customFieldList", String.valueOf(customFieldList));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        httpClient.doDelete(uri, requestOptions);
    }

    public void deleteTags(final UUID invoiceId, final String tagList,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling deleteTags");

        final String uri = "/1.0/kb/invoices/{invoiceId}/tags"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("tagList", String.valueOf(tagList));

        final RequestOptions requestOptions = inputOptions.extend()
            .withQueryParams(queryParams)
            .build();

        httpClient.doDelete(uri, requestOptions);
    }

    public InvoiceDryRun generateDryRunInvoice(final InvoiceDryRun body, final UUID accountId, final String targetDate,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling generateDryRunInvoice");
        Preconditions.checkNotNull(accountId, "Missing the required parameter 'accountId' when calling generateDryRunInvoice");

        final String uri = "/1.0/kb/invoices/dryRun";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("accountId", String.valueOf(accountId));
        queryParams.put("targetDate", String.valueOf(targetDate));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPost(uri, body, InvoiceDryRun.class, requestOptions);
    }

    public CustomFields getCustomFields(final UUID invoiceId, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling getCustomFields");

        final String uri = "/1.0/kb/invoices/{invoiceId}/customFields"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, CustomFields.class, requestOptions);
    }

    public Invoice getInvoice(final UUID invoiceId, final Boolean withItems, final Boolean withChildrenItems, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling getInvoice");

        final String uri = "/1.0/kb/invoices/{invoiceId}"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("withItems", String.valueOf(withItems));
        queryParams.put("withChildrenItems", String.valueOf(withChildrenItems));
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Invoice.class, requestOptions);
    }

    public String getInvoiceAsHTML(final UUID invoiceId,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling getInvoiceAsHTML");

        final String uri = "/1.0/kb/invoices/{invoiceId}/html"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doGet(uri, String.class, requestOptions);
    }

    public Invoice getInvoiceByNumber(final Integer invoiceNumber, final Boolean withItems, final Boolean withChildrenItems, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(invoiceNumber, "Missing the required parameter 'invoiceNumber' when calling getInvoiceByNumber");

        final String uri = "/1.0/kb/invoices/{invoiceNumber}"
          .replaceAll("\\{" + "invoiceNumber" + "\\}", invoiceNumber.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("withItems", String.valueOf(withItems));
        queryParams.put("withChildrenItems", String.valueOf(withChildrenItems));
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Invoice.class, requestOptions);
    }

    public Invoices getInvoices(final Long offset, final Long limit, final Boolean withItems, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {


        final String uri = "/1.0/kb/invoices/pagination";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("offset", String.valueOf(offset));
        queryParams.put("limit", String.valueOf(limit));
        queryParams.put("withItems", String.valueOf(withItems));
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Invoices.class, requestOptions);
    }

    public InvoicePayments getPayments(final UUID invoiceId, final AuditLevel auditLevel, final Boolean withPluginInfo, final Boolean withAttempts,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling getPayments");

        final String uri = "/1.0/kb/invoices/{invoiceId}/payments"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));
        queryParams.put("withPluginInfo", String.valueOf(withPluginInfo));
        queryParams.put("withAttempts", String.valueOf(withAttempts));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, InvoicePayments.class, requestOptions);
    }

    public Tags getTags(final UUID invoiceId, final AuditLevel auditLevel, final Boolean includedDeleted,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling getTags");

        final String uri = "/1.0/kb/invoices/{invoiceId}/tags"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("auditLevel", String.valueOf(auditLevel));
        queryParams.put("includedDeleted", String.valueOf(includedDeleted));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Tags.class, requestOptions);
    }

    public CustomFields modifyCustomFields(final UUID invoiceId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling modifyCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling modifyCustomFields");

        final String uri = "/1.0/kb/invoices/{invoiceId}/customFields"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

        return httpClient.doPut(uri, body, CustomFields.class, requestOptions);
    }

    public Invoices searchInvoices(final String searchKey, final Long offset, final Long limit, final Boolean withItems, final AuditLevel auditLevel,  final RequestOptions inputOptions) throws KillBillClientException {

        Preconditions.checkNotNull(searchKey, "Missing the required parameter 'searchKey' when calling searchInvoices");

        final String uri = "/1.0/kb/invoices/search/{searchKey}"
          .replaceAll("\\{" + "searchKey" + "\\}", searchKey.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("offset", String.valueOf(offset));
        queryParams.put("limit", String.valueOf(limit));
        queryParams.put("withItems", String.valueOf(withItems));
        queryParams.put("auditLevel", String.valueOf(auditLevel));

        final RequestOptions requestOptions = inputOptions.extend().withQueryParams(queryParams).build();

        return httpClient.doGet(uri, Invoices.class, requestOptions);
    }

    public String uploadCatalogTranslation(final String body, final String locale, final Boolean deleteIfExists,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling uploadCatalogTranslation");
        Preconditions.checkNotNull(locale, "Missing the required parameter 'locale' when calling uploadCatalogTranslation");

        final String uri = "/1.0/kb/invoices/catalogTranslation/{locale}"
          .replaceAll("\\{" + "locale" + "\\}", locale.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("deleteIfExists", String.valueOf(deleteIfExists));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPost(uri, body, String.class, requestOptions);
    }

    public String uploadInvoiceMPTemplate(final String body, final Boolean deleteIfExists,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling uploadInvoiceMPTemplate");

        final String uri = "/1.0/kb/invoices/manualPayTemplate";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("deleteIfExists", String.valueOf(deleteIfExists));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPost(uri, body, String.class, requestOptions);
    }

    public String uploadInvoiceTemplate(final String body, final Boolean deleteIfExists,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling uploadInvoiceTemplate");

        final String uri = "/1.0/kb/invoices/template";

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("deleteIfExists", String.valueOf(deleteIfExists));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPost(uri, body, String.class, requestOptions);
    }

    public String uploadInvoiceTranslation(final String body, final String locale, final Boolean deleteIfExists,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling uploadInvoiceTranslation");
        Preconditions.checkNotNull(locale, "Missing the required parameter 'locale' when calling uploadInvoiceTranslation");

        final String uri = "/1.0/kb/invoices/translation/{locale}"
          .replaceAll("\\{" + "locale" + "\\}", locale.toString());

        final Multimap<String, String> queryParams = HashMultimap.<String, String>create(inputOptions.getQueryParams());
        queryParams.put("deleteIfExists", String.valueOf(deleteIfExists));

        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        final RequestOptions requestOptions = inputOptions.extend()
            .withFollowLocation(followLocation)
            .withQueryParams(queryParams)
            .build();

        return httpClient.doPost(uri, body, String.class, requestOptions);
    }

    public void voidInvoice(final UUID invoiceId,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(invoiceId, "Missing the required parameter 'invoiceId' when calling voidInvoice");

        final String uri = "/1.0/kb/invoices/{invoiceId}/voidInvoice"
          .replaceAll("\\{" + "invoiceId" + "\\}", invoiceId.toString());


        final RequestOptions requestOptions = inputOptions.extend().build();

         httpClient.doPut(uri, null, requestOptions);
    }

}