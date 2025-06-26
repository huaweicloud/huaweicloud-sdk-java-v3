package com.huaweicloud.sdk.swr.v2.model;

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
public class ListAuditLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_logs")

    private List<AuditLog> auditLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListAuditLogsResponse withAuditLogs(List<AuditLog> auditLogs) {
        this.auditLogs = auditLogs;
        return this;
    }

    public ListAuditLogsResponse addAuditLogsItem(AuditLog auditLogsItem) {
        if (this.auditLogs == null) {
            this.auditLogs = new ArrayList<>();
        }
        this.auditLogs.add(auditLogsItem);
        return this;
    }

    public ListAuditLogsResponse withAuditLogs(Consumer<List<AuditLog>> auditLogsSetter) {
        if (this.auditLogs == null) {
            this.auditLogs = new ArrayList<>();
        }
        auditLogsSetter.accept(this.auditLogs);
        return this;
    }

    /**
     * 审计日志列表
     * @return auditLogs
     */
    public List<AuditLog> getAuditLogs() {
        return auditLogs;
    }

    public void setAuditLogs(List<AuditLog> auditLogs) {
        this.auditLogs = auditLogs;
    }

    public ListAuditLogsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 审计日志总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuditLogsResponse that = (ListAuditLogsResponse) obj;
        return Objects.equals(this.auditLogs, that.auditLogs) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditLogs, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditLogsResponse {\n");
        sb.append("    auditLogs: ").append(toIndentedString(auditLogs)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
