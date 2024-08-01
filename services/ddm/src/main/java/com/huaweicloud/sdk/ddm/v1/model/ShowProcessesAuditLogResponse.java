package com.huaweicloud.sdk.ddm.v1.model;

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
public class ShowProcessesAuditLogResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_audit_logs")

    private List<UserProcessAuditLog> processAuditLogs = null;

    public ShowProcessesAuditLogResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowProcessesAuditLogResponse withProcessAuditLogs(List<UserProcessAuditLog> processAuditLogs) {
        this.processAuditLogs = processAuditLogs;
        return this;
    }

    public ShowProcessesAuditLogResponse addProcessAuditLogsItem(UserProcessAuditLog processAuditLogsItem) {
        if (this.processAuditLogs == null) {
            this.processAuditLogs = new ArrayList<>();
        }
        this.processAuditLogs.add(processAuditLogsItem);
        return this;
    }

    public ShowProcessesAuditLogResponse withProcessAuditLogs(
        Consumer<List<UserProcessAuditLog>> processAuditLogsSetter) {
        if (this.processAuditLogs == null) {
            this.processAuditLogs = new ArrayList<>();
        }
        processAuditLogsSetter.accept(this.processAuditLogs);
        return this;
    }

    /**
     * 日志记录集合
     * @return processAuditLogs
     */
    public List<UserProcessAuditLog> getProcessAuditLogs() {
        return processAuditLogs;
    }

    public void setProcessAuditLogs(List<UserProcessAuditLog> processAuditLogs) {
        this.processAuditLogs = processAuditLogs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProcessesAuditLogResponse that = (ShowProcessesAuditLogResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.processAuditLogs, that.processAuditLogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, processAuditLogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProcessesAuditLogResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    processAuditLogs: ").append(toIndentedString(processAuditLogs)).append("\n");
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
