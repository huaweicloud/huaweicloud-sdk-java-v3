package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 状态详情。
 */
public class InstanceStatusView {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private InstanceStatusType status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_replica")

    private Integer availableReplica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica")

    private Integer replica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_detail")

    private InstanceFailDetail failDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_job_id")

    private String lastJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_job_status")

    private String lastJobStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public InstanceStatusView withStatus(InstanceStatusType status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public InstanceStatusType getStatus() {
        return status;
    }

    public void setStatus(InstanceStatusType status) {
        this.status = status;
    }

    public InstanceStatusView withAvailableReplica(Integer availableReplica) {
        this.availableReplica = availableReplica;
        return this;
    }

    /**
     * 正常实例副本数。
     * @return availableReplica
     */
    public Integer getAvailableReplica() {
        return availableReplica;
    }

    public void setAvailableReplica(Integer availableReplica) {
        this.availableReplica = availableReplica;
    }

    public InstanceStatusView withReplica(Integer replica) {
        this.replica = replica;
        return this;
    }

    /**
     * 实例副本数。
     * @return replica
     */
    public Integer getReplica() {
        return replica;
    }

    public void setReplica(Integer replica) {
        this.replica = replica;
    }

    public InstanceStatusView withFailDetail(InstanceFailDetail failDetail) {
        this.failDetail = failDetail;
        return this;
    }

    /**
     * Get failDetail
     * @return failDetail
     */
    public InstanceFailDetail getFailDetail() {
        return failDetail;
    }

    public void setFailDetail(InstanceFailDetail failDetail) {
        this.failDetail = failDetail;
    }

    public InstanceStatusView withLastJobId(String lastJobId) {
        this.lastJobId = lastJobId;
        return this;
    }

    /**
     * 最近Job ID。
     * @return lastJobId
     */
    public String getLastJobId() {
        return lastJobId;
    }

    public void setLastJobId(String lastJobId) {
        this.lastJobId = lastJobId;
    }

    public InstanceStatusView withLastJobStatus(String lastJobStatus) {
        this.lastJobStatus = lastJobStatus;
        return this;
    }

    /**
     * 最近Job的状态
     * @return lastJobStatus
     */
    public String getLastJobStatus() {
        return lastJobStatus;
    }

    public void setLastJobStatus(String lastJobStatus) {
        this.lastJobStatus = lastJobStatus;
    }

    public InstanceStatusView withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceStatusView that = (InstanceStatusView) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.availableReplica, that.availableReplica)
            && Objects.equals(this.replica, that.replica) && Objects.equals(this.failDetail, that.failDetail)
            && Objects.equals(this.lastJobId, that.lastJobId) && Objects.equals(this.lastJobStatus, that.lastJobStatus)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(status, availableReplica, replica, failDetail, lastJobId, lastJobStatus, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceStatusView {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    availableReplica: ").append(toIndentedString(availableReplica)).append("\n");
        sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
        sb.append("    failDetail: ").append(toIndentedString(failDetail)).append("\n");
        sb.append("    lastJobId: ").append(toIndentedString(lastJobId)).append("\n");
        sb.append("    lastJobStatus: ").append(toIndentedString(lastJobStatus)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
