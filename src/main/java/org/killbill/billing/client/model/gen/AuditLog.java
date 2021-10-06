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
import java.util.UUID;
import org.joda.time.DateTime;
import org.killbill.billing.ObjectType;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class AuditLog<E> {

    private String changeType = null;

    private DateTime changeDate = null;

    private ObjectType objectType = null;

    private UUID objectId = null;

    private String changedBy = null;

    private String reasonCode = null;

    private String comments = null;

    private String userToken = null;

    private E history = null;


    public AuditLog() {
    }

    public AuditLog(final String changeType,
                     final DateTime changeDate,
                     final ObjectType objectType,
                     final UUID objectId,
                     final String changedBy,
                     final String reasonCode,
                     final String comments,
                     final String userToken,
                     final E history) {
        this.changeType = changeType;
        this.changeDate = changeDate;
        this.objectType = objectType;
        this.objectId = objectId;
        this.changedBy = changedBy;
        this.reasonCode = reasonCode;
        this.comments = comments;
        this.userToken = userToken;
        this.history = history;

    }


    public AuditLog setChangeType(final String changeType) {
        this.changeType = changeType;
        return this;
    }

    public String getChangeType() {
        return changeType;
    }

    public AuditLog setChangeDate(final DateTime changeDate) {
        this.changeDate = changeDate;
        return this;
    }

    public DateTime getChangeDate() {
        return changeDate;
    }

    public AuditLog setObjectType(final ObjectType objectType) {
        this.objectType = objectType;
        return this;
    }

    public ObjectType getObjectType() {
        return objectType;
    }

    public AuditLog setObjectId(final UUID objectId) {
        this.objectId = objectId;
        return this;
    }

    public UUID getObjectId() {
        return objectId;
    }

    public AuditLog setChangedBy(final String changedBy) {
        this.changedBy = changedBy;
        return this;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public AuditLog setReasonCode(final String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public AuditLog setComments(final String comments) {
        this.comments = comments;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public AuditLog setUserToken(final String userToken) {
        this.userToken = userToken;
        return this;
    }

    public String getUserToken() {
        return userToken;
    }

    public AuditLog setHistory(final E history) {
        this.history = history;
        return this;
    }

    public E getHistory() {
        return history;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuditLog auditLog = (AuditLog) o;
        return Objects.equals(this.changeType, auditLog.changeType) &&
            Objects.equals(this.changeDate, auditLog.changeDate) &&
            Objects.equals(this.objectType, auditLog.objectType) &&
            Objects.equals(this.objectId, auditLog.objectId) &&
            Objects.equals(this.changedBy, auditLog.changedBy) &&
            Objects.equals(this.reasonCode, auditLog.reasonCode) &&
            Objects.equals(this.comments, auditLog.comments) &&
            Objects.equals(this.userToken, auditLog.userToken) &&
            Objects.equals(this.history, auditLog.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeType,
            changeDate,
            objectType,
            objectId,
            changedBy,
            reasonCode,
            comments,
            userToken,
            history);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLog {\n");
        
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    changedBy: ").append(toIndentedString(changedBy)).append("\n");
        sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
        sb.append("    history: ").append(toIndentedString(history)).append("\n");
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

