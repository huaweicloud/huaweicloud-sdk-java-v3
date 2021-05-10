package com.huaweicloud.sdk.iec.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExpandEdgecloudResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deployment_id")
    
    private String deploymentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    private String jobId;

    public ExpandEdgecloudResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 边缘业务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ExpandEdgecloudResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 部署计划名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ExpandEdgecloudResponse withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    


    /**
     * 部署计划ID。
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    

    public ExpandEdgecloudResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 边缘业务状态，现存状态有： - creating/scheduling/updating：部署中 - inService：运行中 - failed：创建失败 - deleting：删除中 - delFailed：删除失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ExpandEdgecloudResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExpandEdgecloudResponse expandEdgecloudResponse = (ExpandEdgecloudResponse) o;
        return Objects.equals(this.id, expandEdgecloudResponse.id) &&
            Objects.equals(this.name, expandEdgecloudResponse.name) &&
            Objects.equals(this.deploymentId, expandEdgecloudResponse.deploymentId) &&
            Objects.equals(this.status, expandEdgecloudResponse.status) &&
            Objects.equals(this.jobId, expandEdgecloudResponse.jobId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, deploymentId, status, jobId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandEdgecloudResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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

