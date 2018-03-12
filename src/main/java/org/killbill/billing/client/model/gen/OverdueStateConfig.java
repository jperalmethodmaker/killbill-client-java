/*
 * Kill Bill
 * Kill Bill is an open-source billing and payments platform
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import org.killbill.billing.client.model.gen.OverdueCondition;
import org.killbill.billing.overdue.api.OverdueCancellationPolicy;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class OverdueStateConfig extends KillBillObject {

    private String name = null;

    private Boolean isClearState = false;

    private OverdueCondition condition = null;

    private String externalMessage = null;

    private Boolean blockChanges = false;

    private Boolean disableEntitlement = false;

    private OverdueCancellationPolicy subscriptionCancellationPolicy = null;

    private Integer autoReevaluationIntervalDays = null;

    public OverdueStateConfig name(String name) {
        this.name = name;
        return this;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OverdueStateConfig isClearState(Boolean isClearState) {
        this.isClearState = isClearState;
        return this;
    }

    
    public Boolean isIsClearState() {
        return isClearState;
    }

    public void setIsClearState(Boolean isClearState) {
        this.isClearState = isClearState;
    }

    public OverdueStateConfig condition(OverdueCondition condition) {
        this.condition = condition;
        return this;
    }

    
    public OverdueCondition getCondition() {
        return condition;
    }

    public void setCondition(OverdueCondition condition) {
        this.condition = condition;
    }

    public OverdueStateConfig externalMessage(String externalMessage) {
        this.externalMessage = externalMessage;
        return this;
    }

    
    public String getExternalMessage() {
        return externalMessage;
    }

    public void setExternalMessage(String externalMessage) {
        this.externalMessage = externalMessage;
    }

    public OverdueStateConfig blockChanges(Boolean blockChanges) {
        this.blockChanges = blockChanges;
        return this;
    }

    
    public Boolean isBlockChanges() {
        return blockChanges;
    }

    public void setBlockChanges(Boolean blockChanges) {
        this.blockChanges = blockChanges;
    }

    public OverdueStateConfig disableEntitlement(Boolean disableEntitlement) {
        this.disableEntitlement = disableEntitlement;
        return this;
    }

    
    public Boolean isDisableEntitlement() {
        return disableEntitlement;
    }

    public void setDisableEntitlement(Boolean disableEntitlement) {
        this.disableEntitlement = disableEntitlement;
    }

    public OverdueStateConfig subscriptionCancellationPolicy(OverdueCancellationPolicy subscriptionCancellationPolicy) {
        this.subscriptionCancellationPolicy = subscriptionCancellationPolicy;
        return this;
    }

    
    public OverdueCancellationPolicy getSubscriptionCancellationPolicy() {
        return subscriptionCancellationPolicy;
    }

    public void setSubscriptionCancellationPolicy(OverdueCancellationPolicy subscriptionCancellationPolicy) {
        this.subscriptionCancellationPolicy = subscriptionCancellationPolicy;
    }

    public OverdueStateConfig autoReevaluationIntervalDays(Integer autoReevaluationIntervalDays) {
        this.autoReevaluationIntervalDays = autoReevaluationIntervalDays;
        return this;
    }

    
    public Integer getAutoReevaluationIntervalDays() {
        return autoReevaluationIntervalDays;
    }

    public void setAutoReevaluationIntervalDays(Integer autoReevaluationIntervalDays) {
        this.autoReevaluationIntervalDays = autoReevaluationIntervalDays;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OverdueStateConfig overdueStateConfig = (OverdueStateConfig) o;
        return Objects.equals(this.name, overdueStateConfig.name) &&
        Objects.equals(this.isClearState, overdueStateConfig.isClearState) &&
        Objects.equals(this.condition, overdueStateConfig.condition) &&
        Objects.equals(this.externalMessage, overdueStateConfig.externalMessage) &&
        Objects.equals(this.blockChanges, overdueStateConfig.blockChanges) &&
        Objects.equals(this.disableEntitlement, overdueStateConfig.disableEntitlement) &&
        Objects.equals(this.subscriptionCancellationPolicy, overdueStateConfig.subscriptionCancellationPolicy) &&
        Objects.equals(this.autoReevaluationIntervalDays, overdueStateConfig.autoReevaluationIntervalDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isClearState, condition, externalMessage, blockChanges, disableEntitlement, subscriptionCancellationPolicy, autoReevaluationIntervalDays);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverdueStateConfig {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isClearState: ").append(toIndentedString(isClearState)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    externalMessage: ").append(toIndentedString(externalMessage)).append("\n");
        sb.append("    blockChanges: ").append(toIndentedString(blockChanges)).append("\n");
        sb.append("    disableEntitlement: ").append(toIndentedString(disableEntitlement)).append("\n");
        sb.append("    subscriptionCancellationPolicy: ").append(toIndentedString(subscriptionCancellationPolicy)).append("\n");
        sb.append("    autoReevaluationIntervalDays: ").append(toIndentedString(autoReevaluationIntervalDays)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
