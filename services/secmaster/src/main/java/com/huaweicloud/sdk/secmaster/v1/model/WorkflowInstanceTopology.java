package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流程实例的拓扑图
 */
public class WorkflowInstanceTopology {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_logs")

    private List<TopologyNodeInfo> auditLogs = null;

    public WorkflowInstanceTopology withAuditLogs(List<TopologyNodeInfo> auditLogs) {
        this.auditLogs = auditLogs;
        return this;
    }

    public WorkflowInstanceTopology addAuditLogsItem(TopologyNodeInfo auditLogsItem) {
        if (this.auditLogs == null) {
            this.auditLogs = new ArrayList<>();
        }
        this.auditLogs.add(auditLogsItem);
        return this;
    }

    public WorkflowInstanceTopology withAuditLogs(Consumer<List<TopologyNodeInfo>> auditLogsSetter) {
        if (this.auditLogs == null) {
            this.auditLogs = new ArrayList<>();
        }
        auditLogsSetter.accept(this.auditLogs);
        return this;
    }

    /**
     * **参数解释**: 拓扑图节点信息 **约束限制**: 不涉及
     * @return auditLogs
     */
    public List<TopologyNodeInfo> getAuditLogs() {
        return auditLogs;
    }

    public void setAuditLogs(List<TopologyNodeInfo> auditLogs) {
        this.auditLogs = auditLogs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowInstanceTopology that = (WorkflowInstanceTopology) obj;
        return Objects.equals(this.auditLogs, that.auditLogs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditLogs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowInstanceTopology {\n");
        sb.append("    auditLogs: ").append(toIndentedString(auditLogs)).append("\n");
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
