package com.huaweicloud.sdk.sa.v2.model;

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
public class ListPlaybookAuditLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_logs")

    private List<AuditLogInfo> auditLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListPlaybookAuditLogsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * tatal count
     * minimum: 0
     * maximum: 99999
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListPlaybookAuditLogsResponse withAuditLogs(List<AuditLogInfo> auditLogs) {
        this.auditLogs = auditLogs;
        return this;
    }

    public ListPlaybookAuditLogsResponse addAuditLogsItem(AuditLogInfo auditLogsItem) {
        if (this.auditLogs == null) {
            this.auditLogs = new ArrayList<>();
        }
        this.auditLogs.add(auditLogsItem);
        return this;
    }

    public ListPlaybookAuditLogsResponse withAuditLogs(Consumer<List<AuditLogInfo>> auditLogsSetter) {
        if (this.auditLogs == null) {
            this.auditLogs = new ArrayList<>();
        }
        auditLogsSetter.accept(this.auditLogs);
        return this;
    }

    /**
     * list of informations of Audit Log Info
     * @return auditLogs
     */
    public List<AuditLogInfo> getAuditLogs() {
        return auditLogs;
    }

    public void setAuditLogs(List<AuditLogInfo> auditLogs) {
        this.auditLogs = auditLogs;
    }

    public ListPlaybookAuditLogsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPlaybookAuditLogsResponse that = (ListPlaybookAuditLogsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.auditLogs, that.auditLogs)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, auditLogs, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPlaybookAuditLogsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    auditLogs: ").append(toIndentedString(auditLogs)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
