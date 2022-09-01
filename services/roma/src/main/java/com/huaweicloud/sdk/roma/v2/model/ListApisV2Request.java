package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListApisV2Request {

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
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    @JacksonXmlProperty(localName = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_protocol")

    @JacksonXmlProperty(localName = "req_protocol")

    private String reqProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_method")

    @JacksonXmlProperty(localName = "req_method")

    private String reqMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_uri")

    @JacksonXmlProperty(localName = "req_uri")

    private String reqUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    @JacksonXmlProperty(localName = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    @JacksonXmlProperty(localName = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precise_search")

    @JacksonXmlProperty(localName = "precise_search")

    private String preciseSearch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_id")

    @JacksonXmlProperty(localName = "vpc_channel_id")

    private String vpcChannelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_name")

    @JacksonXmlProperty(localName = "vpc_channel_name")

    private String vpcChannelName;

    public ListApisV2Request withInstanceId(String instanceId) {
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

    public ListApisV2Request withOffset(Long offset) {
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

    public ListApisV2Request withLimit(Integer limit) {
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

    public ListApisV2Request withId(String id) {
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

    public ListApisV2Request withName(String name) {
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

    public ListApisV2Request withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * API分组编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListApisV2Request withReqProtocol(String reqProtocol) {
        this.reqProtocol = reqProtocol;
        return this;
    }

    /**
     * 请求协议
     * @return reqProtocol
     */
    public String getReqProtocol() {
        return reqProtocol;
    }

    public void setReqProtocol(String reqProtocol) {
        this.reqProtocol = reqProtocol;
    }

    public ListApisV2Request withReqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
        return this;
    }

    /**
     * 请求方法
     * @return reqMethod
     */
    public String getReqMethod() {
        return reqMethod;
    }

    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod;
    }

    public ListApisV2Request withReqUri(String reqUri) {
        this.reqUri = reqUri;
        return this;
    }

    /**
     * 请求路径
     * @return reqUri
     */
    public String getReqUri() {
        return reqUri;
    }

    public void setReqUri(String reqUri) {
        this.reqUri = reqUri;
    }

    public ListApisV2Request withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 授权类型
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public ListApisV2Request withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 发布的环境编号
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ListApisV2Request withType(Integer type) {
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

    public ListApisV2Request withPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
        return this;
    }

    /**
     * 指定需要精确匹配查找的参数名称，多个参数需要支持精确匹配时参数之间使用“,”隔开。  目前仅支持name，req_uri，vpc_channel_name。
     * @return preciseSearch
     */
    public String getPreciseSearch() {
        return preciseSearch;
    }

    public void setPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
    }

    public ListApisV2Request withVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
        return this;
    }

    /**
     * 负载通道编号
     * @return vpcChannelId
     */
    public String getVpcChannelId() {
        return vpcChannelId;
    }

    public void setVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
    }

    public ListApisV2Request withVpcChannelName(String vpcChannelName) {
        this.vpcChannelName = vpcChannelName;
        return this;
    }

    /**
     * 负载通道名称。
     * @return vpcChannelName
     */
    public String getVpcChannelName() {
        return vpcChannelName;
    }

    public void setVpcChannelName(String vpcChannelName) {
        this.vpcChannelName = vpcChannelName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListApisV2Request listApisV2Request = (ListApisV2Request) o;
        return Objects.equals(this.instanceId, listApisV2Request.instanceId)
            && Objects.equals(this.offset, listApisV2Request.offset)
            && Objects.equals(this.limit, listApisV2Request.limit) && Objects.equals(this.id, listApisV2Request.id)
            && Objects.equals(this.name, listApisV2Request.name)
            && Objects.equals(this.groupId, listApisV2Request.groupId)
            && Objects.equals(this.reqProtocol, listApisV2Request.reqProtocol)
            && Objects.equals(this.reqMethod, listApisV2Request.reqMethod)
            && Objects.equals(this.reqUri, listApisV2Request.reqUri)
            && Objects.equals(this.authType, listApisV2Request.authType)
            && Objects.equals(this.envId, listApisV2Request.envId) && Objects.equals(this.type, listApisV2Request.type)
            && Objects.equals(this.preciseSearch, listApisV2Request.preciseSearch)
            && Objects.equals(this.vpcChannelId, listApisV2Request.vpcChannelId)
            && Objects.equals(this.vpcChannelName, listApisV2Request.vpcChannelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            offset,
            limit,
            id,
            name,
            groupId,
            reqProtocol,
            reqMethod,
            reqUri,
            authType,
            envId,
            type,
            preciseSearch,
            vpcChannelId,
            vpcChannelName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApisV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    reqProtocol: ").append(toIndentedString(reqProtocol)).append("\n");
        sb.append("    reqMethod: ").append(toIndentedString(reqMethod)).append("\n");
        sb.append("    reqUri: ").append(toIndentedString(reqUri)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    preciseSearch: ").append(toIndentedString(preciseSearch)).append("\n");
        sb.append("    vpcChannelId: ").append(toIndentedString(vpcChannelId)).append("\n");
        sb.append("    vpcChannelName: ").append(toIndentedString(vpcChannelName)).append("\n");
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
