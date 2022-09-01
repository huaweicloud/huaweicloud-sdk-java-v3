package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * SignApiBindingBase
 */
public class SignApiBindingBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_id")

    @JacksonXmlProperty(localName = "publish_id")

    private String publishId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    @JacksonXmlProperty(localName = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    @JacksonXmlProperty(localName = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_time")

    @JacksonXmlProperty(localName = "binding_time")

    private OffsetDateTime bindingTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    @JacksonXmlProperty(localName = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    @JacksonXmlProperty(localName = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    @JacksonXmlProperty(localName = "api_type")

    private Integer apiType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    @JacksonXmlProperty(localName = "api_name")

    private String apiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_remark")

    @JacksonXmlProperty(localName = "api_remark")

    private String apiRemark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_id")

    @JacksonXmlProperty(localName = "sign_id")

    private String signId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_name")

    @JacksonXmlProperty(localName = "sign_name")

    private String signName;

    public SignApiBindingBase withPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }

    /**
     * API的发布编号
     * @return publishId
     */
    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    public SignApiBindingBase withApiId(String apiId) {
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

    public SignApiBindingBase withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * API所属分组的名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public SignApiBindingBase withBindingTime(OffsetDateTime bindingTime) {
        this.bindingTime = bindingTime;
        return this;
    }

    /**
     * 绑定时间
     * @return bindingTime
     */
    public OffsetDateTime getBindingTime() {
        return bindingTime;
    }

    public void setBindingTime(OffsetDateTime bindingTime) {
        this.bindingTime = bindingTime;
    }

    public SignApiBindingBase withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * API所属环境的编号
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public SignApiBindingBase withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * API所属环境的名称
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public SignApiBindingBase withApiType(Integer apiType) {
        this.apiType = apiType;
        return this;
    }

    /**
     * API类型
     * @return apiType
     */
    public Integer getApiType() {
        return apiType;
    }

    public void setApiType(Integer apiType) {
        this.apiType = apiType;
    }

    public SignApiBindingBase withApiName(String apiName) {
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

    public SignApiBindingBase withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 绑定关系的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SignApiBindingBase withApiRemark(String apiRemark) {
        this.apiRemark = apiRemark;
        return this;
    }

    /**
     * API描述
     * @return apiRemark
     */
    public String getApiRemark() {
        return apiRemark;
    }

    public void setApiRemark(String apiRemark) {
        this.apiRemark = apiRemark;
    }

    public SignApiBindingBase withSignId(String signId) {
        this.signId = signId;
        return this;
    }

    /**
     * 签名密钥的编号
     * @return signId
     */
    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId;
    }

    public SignApiBindingBase withSignName(String signName) {
        this.signName = signName;
        return this;
    }

    /**
     * 签名密钥的名称。支持汉字，英文，数字，下划线，且只能以英文和汉字开头，3 ~ 64字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return signName
     */
    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SignApiBindingBase signApiBindingBase = (SignApiBindingBase) o;
        return Objects.equals(this.publishId, signApiBindingBase.publishId)
            && Objects.equals(this.apiId, signApiBindingBase.apiId)
            && Objects.equals(this.groupName, signApiBindingBase.groupName)
            && Objects.equals(this.bindingTime, signApiBindingBase.bindingTime)
            && Objects.equals(this.envId, signApiBindingBase.envId)
            && Objects.equals(this.envName, signApiBindingBase.envName)
            && Objects.equals(this.apiType, signApiBindingBase.apiType)
            && Objects.equals(this.apiName, signApiBindingBase.apiName)
            && Objects.equals(this.id, signApiBindingBase.id)
            && Objects.equals(this.apiRemark, signApiBindingBase.apiRemark)
            && Objects.equals(this.signId, signApiBindingBase.signId)
            && Objects.equals(this.signName, signApiBindingBase.signName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishId,
            apiId,
            groupName,
            bindingTime,
            envId,
            envName,
            apiType,
            apiName,
            id,
            apiRemark,
            signId,
            signName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignApiBindingBase {\n");
        sb.append("    publishId: ").append(toIndentedString(publishId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    bindingTime: ").append(toIndentedString(bindingTime)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    apiRemark: ").append(toIndentedString(apiRemark)).append("\n");
        sb.append("    signId: ").append(toIndentedString(signId)).append("\n");
        sb.append("    signName: ").append(toIndentedString(signName)).append("\n");
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
