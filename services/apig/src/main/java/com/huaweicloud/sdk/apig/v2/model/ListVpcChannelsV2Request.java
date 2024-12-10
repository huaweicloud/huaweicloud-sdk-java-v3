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
public class ListVpcChannelsV2Request {

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
    @JsonProperty(value = "dict_code")

    private String dictCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precise_search")

    private String preciseSearch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_host")

    private String memberHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_port")

    private Integer memberPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_name")

    private String memberGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_id")

    private String memberGroupId;

    /**
     * vpc通道类型： - builtin：服务器类型 - microservice： 微服务类型 - reference：引用负载通道类型
     */
    public static final class VpcChannelTypeEnum {

        /**
         * Enum BUILTIN for value: "builtin"
         */
        public static final VpcChannelTypeEnum BUILTIN = new VpcChannelTypeEnum("builtin");

        /**
         * Enum MICROSERVICE for value: "microservice"
         */
        public static final VpcChannelTypeEnum MICROSERVICE = new VpcChannelTypeEnum("microservice");

        /**
         * Enum REFERENCE for value: "reference"
         */
        public static final VpcChannelTypeEnum REFERENCE = new VpcChannelTypeEnum("reference");

        private static final Map<String, VpcChannelTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VpcChannelTypeEnum> createStaticFields() {
            Map<String, VpcChannelTypeEnum> map = new HashMap<>();
            map.put("builtin", BUILTIN);
            map.put("microservice", MICROSERVICE);
            map.put("reference", REFERENCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VpcChannelTypeEnum(String value) {
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
        public static VpcChannelTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VpcChannelTypeEnum(value));
        }

        public static VpcChannelTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VpcChannelTypeEnum) {
                return this.value.equals(((VpcChannelTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_type")

    private VpcChannelTypeEnum vpcChannelType;

    public ListVpcChannelsV2Request withInstanceId(String instanceId) {
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

    public ListVpcChannelsV2Request withOffset(Long offset) {
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

    public ListVpcChannelsV2Request withLimit(Integer limit) {
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

    public ListVpcChannelsV2Request withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * VPC通道的编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListVpcChannelsV2Request withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * VPC通道的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListVpcChannelsV2Request withDictCode(String dictCode) {
        this.dictCode = dictCode;
        return this;
    }

    /**
     * VPC通道的字典编码  支持英文，数字，特殊字符（-_.）  暂不支持
     * @return dictCode
     */
    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public ListVpcChannelsV2Request withPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
        return this;
    }

    /**
     * 指定需要精确匹配查找的参数名称，多个参数需要支持精确匹配时参数之间使用“,”隔开。  目前支持name，member_group_name。
     * @return preciseSearch
     */
    public String getPreciseSearch() {
        return preciseSearch;
    }

    public void setPreciseSearch(String preciseSearch) {
        this.preciseSearch = preciseSearch;
    }

    public ListVpcChannelsV2Request withMemberHost(String memberHost) {
        this.memberHost = memberHost;
        return this;
    }

    /**
     * 后端服务地址。默认精确查询，不支持模糊查询。
     * @return memberHost
     */
    public String getMemberHost() {
        return memberHost;
    }

    public void setMemberHost(String memberHost) {
        this.memberHost = memberHost;
    }

    public ListVpcChannelsV2Request withMemberPort(Integer memberPort) {
        this.memberPort = memberPort;
        return this;
    }

    /**
     * 后端服务器端口
     * minimum: 0
     * maximum: 65535
     * @return memberPort
     */
    public Integer getMemberPort() {
        return memberPort;
    }

    public void setMemberPort(Integer memberPort) {
        this.memberPort = memberPort;
    }

    public ListVpcChannelsV2Request withMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
        return this;
    }

    /**
     * 后端服务器组名称
     * @return memberGroupName
     */
    public String getMemberGroupName() {
        return memberGroupName;
    }

    public void setMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
    }

    public ListVpcChannelsV2Request withMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
        return this;
    }

    /**
     * 后端服务器组编号
     * @return memberGroupId
     */
    public String getMemberGroupId() {
        return memberGroupId;
    }

    public void setMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
    }

    public ListVpcChannelsV2Request withVpcChannelType(VpcChannelTypeEnum vpcChannelType) {
        this.vpcChannelType = vpcChannelType;
        return this;
    }

    /**
     * vpc通道类型： - builtin：服务器类型 - microservice： 微服务类型 - reference：引用负载通道类型
     * @return vpcChannelType
     */
    public VpcChannelTypeEnum getVpcChannelType() {
        return vpcChannelType;
    }

    public void setVpcChannelType(VpcChannelTypeEnum vpcChannelType) {
        this.vpcChannelType = vpcChannelType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVpcChannelsV2Request that = (ListVpcChannelsV2Request) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.dictCode, that.dictCode)
            && Objects.equals(this.preciseSearch, that.preciseSearch)
            && Objects.equals(this.memberHost, that.memberHost) && Objects.equals(this.memberPort, that.memberPort)
            && Objects.equals(this.memberGroupName, that.memberGroupName)
            && Objects.equals(this.memberGroupId, that.memberGroupId)
            && Objects.equals(this.vpcChannelType, that.vpcChannelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            offset,
            limit,
            id,
            name,
            dictCode,
            preciseSearch,
            memberHost,
            memberPort,
            memberGroupName,
            memberGroupId,
            vpcChannelType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpcChannelsV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dictCode: ").append(toIndentedString(dictCode)).append("\n");
        sb.append("    preciseSearch: ").append(toIndentedString(preciseSearch)).append("\n");
        sb.append("    memberHost: ").append(toIndentedString(memberHost)).append("\n");
        sb.append("    memberPort: ").append(toIndentedString(memberPort)).append("\n");
        sb.append("    memberGroupName: ").append(toIndentedString(memberGroupName)).append("\n");
        sb.append("    memberGroupId: ").append(toIndentedString(memberGroupId)).append("\n");
        sb.append("    vpcChannelType: ").append(toIndentedString(vpcChannelType)).append("\n");
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
