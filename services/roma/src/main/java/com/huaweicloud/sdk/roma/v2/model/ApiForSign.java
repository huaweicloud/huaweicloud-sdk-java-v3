package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ApiForSign
 */
public class ApiForSign {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    @JacksonXmlProperty(localName = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_env_name")

    @JacksonXmlProperty(localName = "run_env_name")

    private String runEnvName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    @JacksonXmlProperty(localName = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_id")

    @JacksonXmlProperty(localName = "publish_id")

    private String publishId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    @JacksonXmlProperty(localName = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    @JacksonXmlProperty(localName = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_env_id")

    @JacksonXmlProperty(localName = "run_env_id")

    private String runEnvId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_uri")

    @JacksonXmlProperty(localName = "req_uri")

    private String reqUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_name")

    @JacksonXmlProperty(localName = "signature_name")

    private String signatureName;

    public ApiForSign withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * API的认证方式
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public ApiForSign withRunEnvName(String runEnvName) {
        this.runEnvName = runEnvName;
        return this;
    }

    /**
     * 发布的环境名
     * @return runEnvName
     */
    public String getRunEnvName() {
        return runEnvName;
    }

    public void setRunEnvName(String runEnvName) {
        this.runEnvName = runEnvName;
    }

    public ApiForSign withGroupName(String groupName) {
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

    public ApiForSign withPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }

    /**
     * 发布记录的编号
     * @return publishId
     */
    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    public ApiForSign withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * API所属分组的编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ApiForSign withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * API名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiForSign withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * API描述
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ApiForSign withRunEnvId(String runEnvId) {
        this.runEnvId = runEnvId;
        return this;
    }

    /**
     * 发布的环境id
     * @return runEnvId
     */
    public String getRunEnvId() {
        return runEnvId;
    }

    public void setRunEnvId(String runEnvId) {
        this.runEnvId = runEnvId;
    }

    public ApiForSign withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * API编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApiForSign withReqUri(String reqUri) {
        this.reqUri = reqUri;
        return this;
    }

    /**
     * API的请求地址
     * @return reqUri
     */
    public String getReqUri() {
        return reqUri;
    }

    public void setReqUri(String reqUri) {
        this.reqUri = reqUri;
    }

    public ApiForSign withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * API类型
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ApiForSign withSignatureName(String signatureName) {
        this.signatureName = signatureName;
        return this;
    }

    /**
     * 已绑定的签名密钥名称
     * @return signatureName
     */
    public String getSignatureName() {
        return signatureName;
    }

    public void setSignatureName(String signatureName) {
        this.signatureName = signatureName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiForSign apiForSign = (ApiForSign) o;
        return Objects.equals(this.authType, apiForSign.authType)
            && Objects.equals(this.runEnvName, apiForSign.runEnvName)
            && Objects.equals(this.groupName, apiForSign.groupName)
            && Objects.equals(this.publishId, apiForSign.publishId) && Objects.equals(this.groupId, apiForSign.groupId)
            && Objects.equals(this.name, apiForSign.name) && Objects.equals(this.remark, apiForSign.remark)
            && Objects.equals(this.runEnvId, apiForSign.runEnvId) && Objects.equals(this.id, apiForSign.id)
            && Objects.equals(this.reqUri, apiForSign.reqUri) && Objects.equals(this.type, apiForSign.type)
            && Objects.equals(this.signatureName, apiForSign.signatureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authType,
            runEnvName,
            groupName,
            publishId,
            groupId,
            name,
            remark,
            runEnvId,
            id,
            reqUri,
            type,
            signatureName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiForSign {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    runEnvName: ").append(toIndentedString(runEnvName)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    publishId: ").append(toIndentedString(publishId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    runEnvId: ").append(toIndentedString(runEnvId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    reqUri: ").append(toIndentedString(reqUri)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    signatureName: ").append(toIndentedString(signatureName)).append("\n");
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
