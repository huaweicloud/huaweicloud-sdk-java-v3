package com.huaweicloud.sdk.gaussdb.v3.model;

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

    private List<AuditLogDetail> auditLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListAuditLogsResponse withAuditLogs(List<AuditLogDetail> auditLogs) {
        this.auditLogs = auditLogs;
        return this;
    }

    public ListAuditLogsResponse addAuditLogsItem(AuditLogDetail auditLogsItem) {
        if (this.auditLogs == null) {
            this.auditLogs = new ArrayList<>();
        }
        this.auditLogs.add(auditLogsItem);
        return this;
    }

    public ListAuditLogsResponse withAuditLogs(Consumer<List<AuditLogDetail>> auditLogsSetter) {
        if (this.auditLogs == null) {
            this.auditLogs = new ArrayList<>();
        }
        auditLogsSetter.accept(this.auditLogs);
        return this;
    }

    /**
     * **参数解释**：  记录列表。  **取值范围**：  不涉及。
     * @return auditLogs
     */
    public List<AuditLogDetail> getAuditLogs() {
        return auditLogs;
    }

    public void setAuditLogs(List<AuditLogDetail> auditLogs) {
        this.auditLogs = auditLogs;
    }

    public ListAuditLogsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**：  总记录数。  **取值范围**：  不小于0。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
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
        return Objects.equals(this.auditLogs, that.auditLogs) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditLogs, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditLogsResponse {\n");
        sb.append("    auditLogs: ").append(toIndentedString(auditLogs)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
