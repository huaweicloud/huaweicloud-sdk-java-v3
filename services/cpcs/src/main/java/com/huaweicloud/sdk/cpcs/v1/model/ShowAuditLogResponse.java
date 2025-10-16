package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAuditLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_records")

    private List<ShowAuditLogResponseBodyAuditRecords> auditRecords = null;

    public ShowAuditLogResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 日志总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowAuditLogResponse withAuditRecords(List<ShowAuditLogResponseBodyAuditRecords> auditRecords) {
        this.auditRecords = auditRecords;
        return this;
    }

    public ShowAuditLogResponse addAuditRecordsItem(ShowAuditLogResponseBodyAuditRecords auditRecordsItem) {
        if (this.auditRecords == null) {
            this.auditRecords = new ArrayList<>();
        }
        this.auditRecords.add(auditRecordsItem);
        return this;
    }

    public ShowAuditLogResponse withAuditRecords(
        Consumer<List<ShowAuditLogResponseBodyAuditRecords>> auditRecordsSetter) {
        if (this.auditRecords == null) {
            this.auditRecords = new ArrayList<>();
        }
        auditRecordsSetter.accept(this.auditRecords);
        return this;
    }

    /**
     * 日志列表
     * @return auditRecords
     */
    public List<ShowAuditLogResponseBodyAuditRecords> getAuditRecords() {
        return auditRecords;
    }

    public void setAuditRecords(List<ShowAuditLogResponseBodyAuditRecords> auditRecords) {
        this.auditRecords = auditRecords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuditLogResponse that = (ShowAuditLogResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.auditRecords, that.auditRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, auditRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditLogResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    auditRecords: ").append(toIndentedString(auditRecords)).append("\n");
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
