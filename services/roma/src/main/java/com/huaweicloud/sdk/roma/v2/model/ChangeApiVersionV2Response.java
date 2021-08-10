package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/** Response Object */
public class ChangeApiVersionV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_id")

    private String publishId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    private String apiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_time")

    private OffsetDateTime publishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    public ChangeApiVersionV2Response withPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }

    /** 发布记录的ID
     * 
     * @return publishId */
    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    public ChangeApiVersionV2Response withApiId(String apiId) {
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

    public ChangeApiVersionV2Response withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    /** API名称
     * 
     * @return apiName */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public ChangeApiVersionV2Response withEnvId(String envId) {
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

    public ChangeApiVersionV2Response withRemark(String remark) {
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

    public ChangeApiVersionV2Response withPublishTime(OffsetDateTime publishTime) {
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

    public ChangeApiVersionV2Response withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /** 在线的版本号
     * 
     * @return versionId */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeApiVersionV2Response changeApiVersionV2Response = (ChangeApiVersionV2Response) o;
        return Objects.equals(this.publishId, changeApiVersionV2Response.publishId)
            && Objects.equals(this.apiId, changeApiVersionV2Response.apiId)
            && Objects.equals(this.apiName, changeApiVersionV2Response.apiName)
            && Objects.equals(this.envId, changeApiVersionV2Response.envId)
            && Objects.equals(this.remark, changeApiVersionV2Response.remark)
            && Objects.equals(this.publishTime, changeApiVersionV2Response.publishTime)
            && Objects.equals(this.versionId, changeApiVersionV2Response.versionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishId, apiId, apiName, envId, remark, publishTime, versionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeApiVersionV2Response {\n");
        sb.append("    publishId: ").append(toIndentedString(publishId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
