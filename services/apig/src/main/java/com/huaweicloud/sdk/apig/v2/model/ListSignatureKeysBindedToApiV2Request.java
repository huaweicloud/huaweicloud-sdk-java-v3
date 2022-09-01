package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSignatureKeysBindedToApiV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    @JacksonXmlProperty(localName = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_id")

    @JacksonXmlProperty(localName = "sign_id")

    private String signId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_name")

    @JacksonXmlProperty(localName = "sign_name")

    private String signName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    @JacksonXmlProperty(localName = "env_id")

    private String envId;

    public ListSignatureKeysBindedToApiV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListSignatureKeysBindedToApiV2Request withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，偏移量小于0时，自动转换为0
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListSignatureKeysBindedToApiV2Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSignatureKeysBindedToApiV2Request withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * API的编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public ListSignatureKeysBindedToApiV2Request withSignId(String signId) {
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

    public ListSignatureKeysBindedToApiV2Request withSignName(String signName) {
        this.signName = signName;
        return this;
    }

    /**
     * 签名密钥的名称
     * @return signName
     */
    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public ListSignatureKeysBindedToApiV2Request withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境编号
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSignatureKeysBindedToApiV2Request listSignatureKeysBindedToApiV2Request =
            (ListSignatureKeysBindedToApiV2Request) o;
        return Objects.equals(this.instanceId, listSignatureKeysBindedToApiV2Request.instanceId)
            && Objects.equals(this.offset, listSignatureKeysBindedToApiV2Request.offset)
            && Objects.equals(this.limit, listSignatureKeysBindedToApiV2Request.limit)
            && Objects.equals(this.apiId, listSignatureKeysBindedToApiV2Request.apiId)
            && Objects.equals(this.signId, listSignatureKeysBindedToApiV2Request.signId)
            && Objects.equals(this.signName, listSignatureKeysBindedToApiV2Request.signName)
            && Objects.equals(this.envId, listSignatureKeysBindedToApiV2Request.envId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, offset, limit, apiId, signId, signName, envId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSignatureKeysBindedToApiV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    signId: ").append(toIndentedString(signId)).append("\n");
        sb.append("    signName: ").append(toIndentedString(signName)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
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
