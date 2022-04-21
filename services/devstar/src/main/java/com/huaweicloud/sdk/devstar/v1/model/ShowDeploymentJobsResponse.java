package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDeploymentJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_parameters")

    private String deployParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Integer time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    public ShowDeploymentJobsResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 部署任务编号
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowDeploymentJobsResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowDeploymentJobsResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 部署状态,-2：环境准备未就绪 -1 资源准备就绪 0 部署中 1：成功 2：失败
     * minimum: -2
     * maximum: 2
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowDeploymentJobsResponse withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 访问地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ShowDeploymentJobsResponse withDeployParameters(String deployParameters) {
        this.deployParameters = deployParameters;
        return this;
    }

    /**
     * 部署参数
     * @return deployParameters
     */
    public String getDeployParameters() {
        return deployParameters;
    }

    public void setDeployParameters(String deployParameters) {
        this.deployParameters = deployParameters;
    }

    public ShowDeploymentJobsResponse withTime(Integer time) {
        this.time = time;
        return this;
    }

    /**
     * 部署耗时
     * minimum: 0
     * maximum: 5000
     * @return time
     */
    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public ShowDeploymentJobsResponse withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ShowDeploymentJobsResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDeploymentJobsResponse showDeploymentJobsResponse = (ShowDeploymentJobsResponse) o;
        return Objects.equals(this.id, showDeploymentJobsResponse.id)
            && Objects.equals(this.jobId, showDeploymentJobsResponse.jobId)
            && Objects.equals(this.status, showDeploymentJobsResponse.status)
            && Objects.equals(this.address, showDeploymentJobsResponse.address)
            && Objects.equals(this.deployParameters, showDeploymentJobsResponse.deployParameters)
            && Objects.equals(this.time, showDeploymentJobsResponse.time)
            && Objects.equals(this.creatorName, showDeploymentJobsResponse.creatorName)
            && Objects.equals(this.createdTime, showDeploymentJobsResponse.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobId, status, address, deployParameters, time, creatorName, createdTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeploymentJobsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    deployParameters: ").append(toIndentedString(deployParameters)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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
