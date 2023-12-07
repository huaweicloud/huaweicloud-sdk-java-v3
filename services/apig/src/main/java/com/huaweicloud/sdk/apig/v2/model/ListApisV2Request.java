package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListApisV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_protocol")

    private String reqProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_method")

    private String reqMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_uri")

    private String reqUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precise_search")

    private String preciseSearch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_name")

    private String vpcChannelName;

    /**
     * 指定API详情中需要包含的额外返回结果，多个参数之间使用“,”隔开，当brief和其他include参数共同使用时，brief不生效。 目前仅支持brief，include_group，include_group_backend。 brief：默认值，不包含额外信息。 include_group：返回结果中包含api_group_info。 include_group_backend：返回结果中包含backend_api。
     */
    public static final class ReturnDataModeEnum {

        /**
         * Enum BRIEF for value: "brief"
         */
        public static final ReturnDataModeEnum BRIEF = new ReturnDataModeEnum("brief");

        /**
         * Enum INCLUDE_GROUP for value: "include_group"
         */
        public static final ReturnDataModeEnum INCLUDE_GROUP = new ReturnDataModeEnum("include_group");

        /**
         * Enum INCLUDE_GROUP_BACKEND for value: "include_group_backend"
         */
        public static final ReturnDataModeEnum INCLUDE_GROUP_BACKEND = new ReturnDataModeEnum("include_group_backend");

        private static final Map<String, ReturnDataModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReturnDataModeEnum> createStaticFields() {
            Map<String, ReturnDataModeEnum> map = new HashMap<>();
            map.put("brief", BRIEF);
            map.put("include_group", INCLUDE_GROUP);
            map.put("include_group_backend", INCLUDE_GROUP_BACKEND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReturnDataModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReturnDataModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReturnDataModeEnum(value));
        }

        public static ReturnDataModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReturnDataModeEnum) {
                return this.value.equals(((ReturnDataModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_data_mode")

    private ReturnDataModeEnum returnDataMode;

    public ListApisV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，在API网关控制台的“实例信息”中获取。
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
     * 每页显示的条目数量，条目数量小于等于0时，自动转换为20，条目数量大于500时，自动转换为500
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
     * 指定需要精确匹配查找的参数名称，目前仅支持name、req_uri
     * @return preciseSearch
     */
    public String getPreciseSearch() {
        return preciseSearch;
    }

    public void setPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
    }

    public ListApisV2Request withVpcChannelName(String vpcChannelName) {
        this.vpcChannelName = vpcChannelName;
        return this;
    }

    /**
     * 负载通道名称
     * @return vpcChannelName
     */
    public String getVpcChannelName() {
        return vpcChannelName;
    }

    public void setVpcChannelName(String vpcChannelName) {
        this.vpcChannelName = vpcChannelName;
    }

    public ListApisV2Request withReturnDataMode(ReturnDataModeEnum returnDataMode) {
        this.returnDataMode = returnDataMode;
        return this;
    }

    /**
     * 指定API详情中需要包含的额外返回结果，多个参数之间使用“,”隔开，当brief和其他include参数共同使用时，brief不生效。 目前仅支持brief，include_group，include_group_backend。 brief：默认值，不包含额外信息。 include_group：返回结果中包含api_group_info。 include_group_backend：返回结果中包含backend_api。
     * @return returnDataMode
     */
    public ReturnDataModeEnum getReturnDataMode() {
        return returnDataMode;
    }

    public void setReturnDataMode(ReturnDataModeEnum returnDataMode) {
        this.returnDataMode = returnDataMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApisV2Request that = (ListApisV2Request) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.reqProtocol, that.reqProtocol) && Objects.equals(this.reqMethod, that.reqMethod)
            && Objects.equals(this.reqUri, that.reqUri) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.envId, that.envId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.preciseSearch, that.preciseSearch)
            && Objects.equals(this.vpcChannelName, that.vpcChannelName)
            && Objects.equals(this.returnDataMode, that.returnDataMode);
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
            vpcChannelName,
            returnDataMode);
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
        sb.append("    vpcChannelName: ").append(toIndentedString(vpcChannelName)).append("\n");
        sb.append("    returnDataMode: ").append(toIndentedString(returnDataMode)).append("\n");
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
