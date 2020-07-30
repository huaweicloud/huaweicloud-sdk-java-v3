package com.huaweicloud.sdk.servicestage.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.servicestage.v2.model.InstanceFailDetail;
import com.huaweicloud.sdk.servicestage.v2.model.InstanceStatusType;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 状态详情。
 */
public class InstanceStatusView  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private InstanceStatusType status = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available_replica")
    
    private Integer availableReplica;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replica")
    
    private Integer replica;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fail_detail")
    
    private InstanceFailDetail failDetail = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_job_id")
    
    private String lastJobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceStatusView instanceStatusView = (InstanceStatusView) o;
        return Objects.equals(this.status, instanceStatusView.status) &&
            Objects.equals(this.availableReplica, instanceStatusView.availableReplica) &&
            Objects.equals(this.replica, instanceStatusView.replica) &&
            Objects.equals(this.failDetail, instanceStatusView.failDetail) &&
            Objects.equals(this.lastJobId, instanceStatusView.lastJobId) &&
            Objects.equals(this.enterpriseProjectId, instanceStatusView.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, availableReplica, replica, failDetail, lastJobId, enterpriseProjectId);
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

