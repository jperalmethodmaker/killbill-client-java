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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.joda.time.LocalDate;
import org.killbill.billing.client.model.gen.RolledUpUnit;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class RolledUpUsage {

    private UUID subscriptionId = null;

    private LocalDate startDate = null;

    private LocalDate endDate = null;

    private List<RolledUpUnit> rolledUpUnits = null;


    public RolledUpUsage() {
    }

    public RolledUpUsage(final UUID subscriptionId,
                     final LocalDate startDate,
                     final LocalDate endDate,
                     final List<RolledUpUnit> rolledUpUnits) {
        this.subscriptionId = subscriptionId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rolledUpUnits = rolledUpUnits;

    }


    public RolledUpUsage setSubscriptionId(final UUID subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public UUID getSubscriptionId() {
        return subscriptionId;
    }

    public RolledUpUsage setStartDate(final LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public RolledUpUsage setEndDate(final LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public RolledUpUsage setRolledUpUnits(final List<RolledUpUnit> rolledUpUnits) {
        this.rolledUpUnits = rolledUpUnits;
        return this;
    }

    public RolledUpUsage addRolledUpUnitsItem(final RolledUpUnit rolledUpUnitsItem) {
        if (this.rolledUpUnits == null) {
            this.rolledUpUnits = new ArrayList<RolledUpUnit>();
        }
        this.rolledUpUnits.add(rolledUpUnitsItem);
        return this;
    }

    public List<RolledUpUnit> getRolledUpUnits() {
        return rolledUpUnits;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RolledUpUsage rolledUpUsage = (RolledUpUsage) o;
        return Objects.equals(this.subscriptionId, rolledUpUsage.subscriptionId) &&
            Objects.equals(this.startDate, rolledUpUsage.startDate) &&
            Objects.equals(this.endDate, rolledUpUsage.endDate) &&
            Objects.equals(this.rolledUpUnits, rolledUpUsage.rolledUpUnits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionId,
            startDate,
            endDate,
            rolledUpUnits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RolledUpUsage {\n");
        
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    rolledUpUnits: ").append(toIndentedString(rolledUpUnits)).append("\n");
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

