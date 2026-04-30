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
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_message")

    private String failureMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification")

    private String verification;

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

    public ShowAuditLogResponseBodyAuditRecords withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 操作状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowAuditLogResponseBodyAuditRecords withFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
        return this;
    }

    /**
     * 操作失败消息
     * @return failureMessage
     */
    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public ShowAuditLogResponseBodyAuditRecords withVerification(String verification) {
        this.verification = verification;
        return this;
    }

    /**
     * 操作验证信息
     * @return verification
     */
    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification;
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
            && Objects.equals(this.status, that.status) && Objects.equals(this.failureMessage, that.failureMessage)
            && Objects.equals(this.verification, that.verification);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, tenantId, clusterId, clusterType, operation, time, status, failureMessage, verification);
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
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
        sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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
