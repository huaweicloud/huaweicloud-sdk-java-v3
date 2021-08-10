package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListApisNotBoundWithSignatureKeyV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_id")

    private String signId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    private String apiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListApisNotBoundWithSignatureKeyV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例编号
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListApisNotBoundWithSignatureKeyV2Request withSignId(String signId) {
        this.signId = signId;
        return this;
    }

    /** 签名密钥编号
     * 
     * @return signId */
    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId;
    }

    public ListApisNotBoundWithSignatureKeyV2Request withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /** 环境编号
     * 
     * @return envId */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ListApisNotBoundWithSignatureKeyV2Request withApiId(String apiId) {
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

    public ListApisNotBoundWithSignatureKeyV2Request withApiName(String apiName) {
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

    public ListApisNotBoundWithSignatureKeyV2Request withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** API分组编号
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListApisNotBoundWithSignatureKeyV2Request withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量，表示从此偏移量开始查询，偏移量小于0时，自动转换为0
     * 
     * @return offset */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListApisNotBoundWithSignatureKeyV2Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的条目数量 minimum: 1 maximum: 500
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApisNotBoundWithSignatureKeyV2Request listApisNotBoundWithSignatureKeyV2Request =
            (ListApisNotBoundWithSignatureKeyV2Request) o;
        return Objects.equals(this.instanceId, listApisNotBoundWithSignatureKeyV2Request.instanceId)
            && Objects.equals(this.signId, listApisNotBoundWithSignatureKeyV2Request.signId)
            && Objects.equals(this.envId, listApisNotBoundWithSignatureKeyV2Request.envId)
            && Objects.equals(this.apiId, listApisNotBoundWithSignatureKeyV2Request.apiId)
            && Objects.equals(this.apiName, listApisNotBoundWithSignatureKeyV2Request.apiName)
            && Objects.equals(this.groupId, listApisNotBoundWithSignatureKeyV2Request.groupId)
            && Objects.equals(this.offset, listApisNotBoundWithSignatureKeyV2Request.offset)
            && Objects.equals(this.limit, listApisNotBoundWithSignatureKeyV2Request.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, signId, envId, apiId, apiName, groupId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApisNotBoundWithSignatureKeyV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    signId: ").append(toIndentedString(signId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
