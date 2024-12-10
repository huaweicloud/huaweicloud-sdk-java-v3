package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VpcCreate
 */
public class VpcCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    /**
     * 分发算法。 - 1：加权轮询（wrr） - 2：加权最少连接（wleastconn） - 3：源地址哈希（source） - 4：URI哈希（uri）
     */
    public static final class BalanceStrategyEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final BalanceStrategyEnum NUMBER_1 = new BalanceStrategyEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final BalanceStrategyEnum NUMBER_2 = new BalanceStrategyEnum(2);

        /**
         * Enum NUMBER_3 for value: 3
         */
        public static final BalanceStrategyEnum NUMBER_3 = new BalanceStrategyEnum(3);

        /**
         * Enum NUMBER_4 for value: 4
         */
        public static final BalanceStrategyEnum NUMBER_4 = new BalanceStrategyEnum(4);

        private static final Map<Integer, BalanceStrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, BalanceStrategyEnum> createStaticFields() {
            Map<Integer, BalanceStrategyEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(3, NUMBER_3);
            map.put(4, NUMBER_4);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        BalanceStrategyEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BalanceStrategyEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BalanceStrategyEnum(value));
        }

        public static BalanceStrategyEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BalanceStrategyEnum) {
                return this.value.equals(((BalanceStrategyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "balance_strategy")

    private BalanceStrategyEnum balanceStrategy;

    /**
     * VPC通道的成员类型。 - ip - ecs
     */
    public static final class MemberTypeEnum {

        /**
         * Enum IP for value: "ip"
         */
        public static final MemberTypeEnum IP = new MemberTypeEnum("ip");

        /**
         * Enum ECS for value: "ecs"
         */
        public static final MemberTypeEnum ECS = new MemberTypeEnum("ecs");

        private static final Map<String, MemberTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MemberTypeEnum> createStaticFields() {
            Map<String, MemberTypeEnum> map = new HashMap<>();
            map.put("ip", IP);
            map.put("ecs", ECS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MemberTypeEnum(String value) {
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
        public static MemberTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MemberTypeEnum(value));
        }

        public static MemberTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MemberTypeEnum) {
                return this.value.equals(((MemberTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_type")

    private MemberTypeEnum memberType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    /**
     * vpc通道类型。 - builtin：服务器类型 - microservice： 微服务类型 - reference：引用负载通道类型  当vpc_channel_type为空时，负载通道类型取决于type字段的取值。 当vpc_channel_type不为空，但type字段非空或不为0时，当vpc_channel_type的指定类型与type字段指定的类型冲突时会校验报错。 当vpc_channel_type不为空，且type字段为空或等于0时，直接使用vpc_channel_type字段的值指定负载通道类型。  修改负载通道时vpc通道类型不会修改，直接使用原有的vpc通道类型。
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_code")

    private String dictCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_groups")

    private List<MemberGroupCreate> memberGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<MemberInfo> members = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_health_config")

    private VpcHealthConfig vpcHealthConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "microservice_info")

    private MicroServiceCreate microserviceInfo;

    public VpcCreate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * VPC通道的名称。  长度为3 ~ 64位的字符串，字符串由中文、英文字母、数字、中划线、下划线、点组成，且只能以英文或中文开头。 > 中文字符必须为UTF-8或者unicode编码。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VpcCreate withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * VPC通道中主机的端口号。  取值范围1 ~ 65535。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public VpcCreate withBalanceStrategy(BalanceStrategyEnum balanceStrategy) {
        this.balanceStrategy = balanceStrategy;
        return this;
    }

    /**
     * 分发算法。 - 1：加权轮询（wrr） - 2：加权最少连接（wleastconn） - 3：源地址哈希（source） - 4：URI哈希（uri）
     * @return balanceStrategy
     */
    public BalanceStrategyEnum getBalanceStrategy() {
        return balanceStrategy;
    }

    public void setBalanceStrategy(BalanceStrategyEnum balanceStrategy) {
        this.balanceStrategy = balanceStrategy;
    }

    public VpcCreate withMemberType(MemberTypeEnum memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * VPC通道的成员类型。 - ip - ecs
     * @return memberType
     */
    public MemberTypeEnum getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberTypeEnum memberType) {
        this.memberType = memberType;
    }

    public VpcCreate withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * vpc通道类型，默认为服务器类型。 - 2：服务器类型 - 3：微服务类型  当vpc_channel_type字段为空时，负载通道类型由type字段控制： 当type不为3或microservice_info为空，VCP通道类型默认为服务器类型。 当type=3，microservice_info不为空，VPC通道类型为微服务类型。  修改负载通道时vpc通道类型不会修改，直接使用原有的vpc通道类型。  此字段待废弃，请使用vpc_channel_type字段指定负载通道类型。
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public VpcCreate withVpcChannelType(VpcChannelTypeEnum vpcChannelType) {
        this.vpcChannelType = vpcChannelType;
        return this;
    }

    /**
     * vpc通道类型。 - builtin：服务器类型 - microservice： 微服务类型 - reference：引用负载通道类型  当vpc_channel_type为空时，负载通道类型取决于type字段的取值。 当vpc_channel_type不为空，但type字段非空或不为0时，当vpc_channel_type的指定类型与type字段指定的类型冲突时会校验报错。 当vpc_channel_type不为空，且type字段为空或等于0时，直接使用vpc_channel_type字段的值指定负载通道类型。  修改负载通道时vpc通道类型不会修改，直接使用原有的vpc通道类型。
     * @return vpcChannelType
     */
    public VpcChannelTypeEnum getVpcChannelType() {
        return vpcChannelType;
    }

    public void setVpcChannelType(VpcChannelTypeEnum vpcChannelType) {
        this.vpcChannelType = vpcChannelType;
    }

    public VpcCreate withDictCode(String dictCode) {
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

    public VpcCreate withMemberGroups(List<MemberGroupCreate> memberGroups) {
        this.memberGroups = memberGroups;
        return this;
    }

    public VpcCreate addMemberGroupsItem(MemberGroupCreate memberGroupsItem) {
        if (this.memberGroups == null) {
            this.memberGroups = new ArrayList<>();
        }
        this.memberGroups.add(memberGroupsItem);
        return this;
    }

    public VpcCreate withMemberGroups(Consumer<List<MemberGroupCreate>> memberGroupsSetter) {
        if (this.memberGroups == null) {
            this.memberGroups = new ArrayList<>();
        }
        memberGroupsSetter.accept(this.memberGroups);
        return this;
    }

    /**
     * VPC通道后端服务器组列表。当microservice_info中service_type为NACOS类型时，服务器组的权重不支持手动设置。
     * @return memberGroups
     */
    public List<MemberGroupCreate> getMemberGroups() {
        return memberGroups;
    }

    public void setMemberGroups(List<MemberGroupCreate> memberGroups) {
        this.memberGroups = memberGroups;
    }

    public VpcCreate withMembers(List<MemberInfo> members) {
        this.members = members;
        return this;
    }

    public VpcCreate addMembersItem(MemberInfo membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public VpcCreate withMembers(Consumer<List<MemberInfo>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * VPC后端实例列表。  对于引用负载通道类型的负载通道，不会使用此字段新增或更新后端实例。
     * @return members
     */
    public List<MemberInfo> getMembers() {
        return members;
    }

    public void setMembers(List<MemberInfo> members) {
        this.members = members;
    }

    public VpcCreate withVpcHealthConfig(VpcHealthConfig vpcHealthConfig) {
        this.vpcHealthConfig = vpcHealthConfig;
        return this;
    }

    public VpcCreate withVpcHealthConfig(Consumer<VpcHealthConfig> vpcHealthConfigSetter) {
        if (this.vpcHealthConfig == null) {
            this.vpcHealthConfig = new VpcHealthConfig();
            vpcHealthConfigSetter.accept(this.vpcHealthConfig);
        }

        return this;
    }

    /**
     * Get vpcHealthConfig
     * @return vpcHealthConfig
     */
    public VpcHealthConfig getVpcHealthConfig() {
        return vpcHealthConfig;
    }

    public void setVpcHealthConfig(VpcHealthConfig vpcHealthConfig) {
        this.vpcHealthConfig = vpcHealthConfig;
    }

    public VpcCreate withMicroserviceInfo(MicroServiceCreate microserviceInfo) {
        this.microserviceInfo = microserviceInfo;
        return this;
    }

    public VpcCreate withMicroserviceInfo(Consumer<MicroServiceCreate> microserviceInfoSetter) {
        if (this.microserviceInfo == null) {
            this.microserviceInfo = new MicroServiceCreate();
            microserviceInfoSetter.accept(this.microserviceInfo);
        }

        return this;
    }

    /**
     * Get microserviceInfo
     * @return microserviceInfo
     */
    public MicroServiceCreate getMicroserviceInfo() {
        return microserviceInfo;
    }

    public void setMicroserviceInfo(MicroServiceCreate microserviceInfo) {
        this.microserviceInfo = microserviceInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpcCreate that = (VpcCreate) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.port, that.port)
            && Objects.equals(this.balanceStrategy, that.balanceStrategy)
            && Objects.equals(this.memberType, that.memberType) && Objects.equals(this.type, that.type)
            && Objects.equals(this.vpcChannelType, that.vpcChannelType) && Objects.equals(this.dictCode, that.dictCode)
            && Objects.equals(this.memberGroups, that.memberGroups) && Objects.equals(this.members, that.members)
            && Objects.equals(this.vpcHealthConfig, that.vpcHealthConfig)
            && Objects.equals(this.microserviceInfo, that.microserviceInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            port,
            balanceStrategy,
            memberType,
            type,
            vpcChannelType,
            dictCode,
            memberGroups,
            members,
            vpcHealthConfig,
            microserviceInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcCreate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    balanceStrategy: ").append(toIndentedString(balanceStrategy)).append("\n");
        sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vpcChannelType: ").append(toIndentedString(vpcChannelType)).append("\n");
        sb.append("    dictCode: ").append(toIndentedString(dictCode)).append("\n");
        sb.append("    memberGroups: ").append(toIndentedString(memberGroups)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    vpcHealthConfig: ").append(toIndentedString(vpcHealthConfig)).append("\n");
        sb.append("    microserviceInfo: ").append(toIndentedString(microserviceInfo)).append("\n");
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
