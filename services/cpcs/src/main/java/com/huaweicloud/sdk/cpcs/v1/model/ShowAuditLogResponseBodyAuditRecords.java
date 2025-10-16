package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowAuditLogResponseBodyAuditRecords
 */
public class ShowAuditLogResponseBodyAuditRecords {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_status")

    private Integer operateStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_message")

    private String operateMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_status")

    private Integer auditStatus;

    public ShowAuditLogResponseBodyAuditRecords withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 日志ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowAuditLogResponseBodyAuditRecords withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ShowAuditLogResponseBodyAuditRecords withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowAuditLogResponseBodyAuditRecords withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 集群类型
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public ShowAuditLogResponseBodyAuditRecords withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ShowAuditLogResponseBodyAuditRecords withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 时间
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public ShowAuditLogResponseBodyAuditRecords withOperateStatus(Integer operateStatus) {
        this.operateStatus = operateStatus;
        return this;
    }

    /**
     * 操作状态
     * @return operateStatus
     */
    public Integer getOperateStatus() {
        return operateStatus;
    }

    public void setOperateStatus(Integer operateStatus) {
        this.operateStatus = operateStatus;
    }

    public ShowAuditLogResponseBodyAuditRecords withOperateMessage(String operateMessage) {
        this.operateMessage = operateMessage;
        return this;
    }

    /**
     * 操作结果消息
     * @return operateMessage
     */
    public String getOperateMessage() {
        return operateMessage;
    }

    public void setOperateMessage(String operateMessage) {
        this.operateMessage = operateMessage;
    }

    public ShowAuditLogResponseBodyAuditRecords withAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }

    /**
     * 审计状态
     * @return auditStatus
     */
    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuditLogResponseBodyAuditRecords that = (ShowAuditLogResponseBodyAuditRecords) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.operation, that.operation) && Objects.equals(this.time, that.time)
            && Objects.equals(this.operateStatus, that.operateStatus)
            && Objects.equals(this.operateMessage, that.operateMessage)
            && Objects.equals(this.auditStatus, that.auditStatus);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, tenantId, clusterId, clusterType, operation, time, operateStatus, operateMessage, auditStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditLogResponseBodyAuditRecords {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    operateStatus: ").append(toIndentedString(operateStatus)).append("\n");
        sb.append("    operateMessage: ").append(toIndentedString(operateMessage)).append("\n");
        sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
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
