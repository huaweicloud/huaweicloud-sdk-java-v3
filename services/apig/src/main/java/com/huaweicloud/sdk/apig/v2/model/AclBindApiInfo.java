package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * AclBindApiInfo
 */
public class AclBindApiInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    private String apiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    private Long apiType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_remark")

    private String apiRemark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_id")

    private String bindId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_time")

    private OffsetDateTime bindTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_id")

    private String publishId;

    public AclBindApiInfo withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * API编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public AclBindApiInfo withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    /**
     * API名称
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public AclBindApiInfo withApiType(Long apiType) {
        this.apiType = apiType;
        return this;
    }

    /**
     * API类型
     * @return apiType
     */
    public Long getApiType() {
        return apiType;
    }

    public void setApiType(Long apiType) {
        this.apiType = apiType;
    }

    public AclBindApiInfo withApiRemark(String apiRemark) {
        this.apiRemark = apiRemark;
        return this;
    }

    /**
     * API的描述信息
     * @return apiRemark
     */
    public String getApiRemark() {
        return apiRemark;
    }

    public void setApiRemark(String apiRemark) {
        this.apiRemark = apiRemark;
    }

    public AclBindApiInfo withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 生效的环境编号
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public AclBindApiInfo withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * 生效的环境名称
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public AclBindApiInfo withBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }

    /**
     * 绑定关系编号
     * @return bindId
     */
    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    public AclBindApiInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * API分组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public AclBindApiInfo withBindTime(OffsetDateTime bindTime) {
        this.bindTime = bindTime;
        return this;
    }

    /**
     * 绑定时间
     * @return bindTime
     */
    public OffsetDateTime getBindTime() {
        return bindTime;
    }

    public void setBindTime(OffsetDateTime bindTime) {
        this.bindTime = bindTime;
    }

    public AclBindApiInfo withPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }

    /**
     * API发布记录编号
     * @return publishId
     */
    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AclBindApiInfo aclBindApiInfo = (AclBindApiInfo) o;
        return Objects.equals(this.apiId, aclBindApiInfo.apiId) && Objects.equals(this.apiName, aclBindApiInfo.apiName)
            && Objects.equals(this.apiType, aclBindApiInfo.apiType)
            && Objects.equals(this.apiRemark, aclBindApiInfo.apiRemark)
            && Objects.equals(this.envId, aclBindApiInfo.envId) && Objects.equals(this.envName, aclBindApiInfo.envName)
            && Objects.equals(this.bindId, aclBindApiInfo.bindId)
            && Objects.equals(this.groupName, aclBindApiInfo.groupName)
            && Objects.equals(this.bindTime, aclBindApiInfo.bindTime)
            && Objects.equals(this.publishId, aclBindApiInfo.publishId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiId, apiName, apiType, apiRemark, envId, envName, bindId, groupName, bindTime, publishId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AclBindApiInfo {\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    apiRemark: ").append(toIndentedString(apiRemark)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    bindId: ").append(toIndentedString(bindId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    bindTime: ").append(toIndentedString(bindTime)).append("\n");
        sb.append("    publishId: ").append(toIndentedString(publishId)).append("\n");
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
