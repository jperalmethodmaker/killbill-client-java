/*
 * Copyright 2010-2014 Ning, Inc.
 * Copyright 2014-2020 Groupon, Inc
 * Copyright 2020-2021 Equinix, Inc
 * Copyright 2014-2021 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import org.joda.time.LocalDate;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class UsageRecord {

    private LocalDate recordDate = null;

    private Long amount = null;


    public UsageRecord() {
    }

    public UsageRecord(final LocalDate recordDate,
                     final Long amount) {
        this.recordDate = recordDate;
        this.amount = amount;

    }


    public UsageRecord setRecordDate(final LocalDate recordDate) {
        this.recordDate = recordDate;
        return this;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public UsageRecord setAmount(final Long amount) {
        this.amount = amount;
        return this;
    }

    public Long getAmount() {
        return amount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsageRecord usageRecord = (UsageRecord) o;
        return Objects.equals(this.recordDate, usageRecord.recordDate) &&
            Objects.equals(this.amount, usageRecord.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordDate,
            amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageRecord {\n");
        
        sb.append("    recordDate: ").append(toIndentedString(recordDate)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

