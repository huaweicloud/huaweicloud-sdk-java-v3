package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/** ApiVersionResp */
public class ApiVersionResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_no")

    private String versionNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_time")

    private OffsetDateTime publishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public ApiVersionResp withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /** API历史版本的ID
     * 
     * @return versionId */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public ApiVersionResp withVersionNo(String versionNo) {
        this.versionNo = versionNo;
        return this;
    }

    /** API的版本号
     * 
     * @return versionNo */
    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public ApiVersionResp withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /** API编号
     * 
     * @return apiId */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public ApiVersionResp withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /** 发布的环境编号
     * 
     * @return envId */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ApiVersionResp withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /** 发布的环境名称
     * 
     * @return envName */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public ApiVersionResp withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /** 发布描述
     * 
     * @return remark */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ApiVersionResp withPublishTime(OffsetDateTime publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /** 发布时间
     * 
     * @return publishTime */
    public OffsetDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(OffsetDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public ApiVersionResp withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 版本状态 - 1：当前生效中的版本 - 2：未生效的版本
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiVersionResp apiVersionResp = (ApiVersionResp) o;
        return Objects.equals(this.versionId, apiVersionResp.versionId)
            && Objects.equals(this.versionNo, apiVersionResp.versionNo)
            && Objects.equals(this.apiId, apiVersionResp.apiId) && Objects.equals(this.envId, apiVersionResp.envId)
            && Objects.equals(this.envName, apiVersionResp.envName)
            && Objects.equals(this.remark, apiVersionResp.remark)
            && Objects.equals(this.publishTime, apiVersionResp.publishTime)
            && Objects.equals(this.status, apiVersionResp.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionId, versionNo, apiId, envId, envName, remark, publishTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiVersionResp {\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    versionNo: ").append(toIndentedString(versionNo)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
