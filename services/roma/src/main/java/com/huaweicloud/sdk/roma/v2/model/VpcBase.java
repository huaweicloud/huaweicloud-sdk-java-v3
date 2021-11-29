package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** VpcBase */
public class VpcBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    /** 分发算法。 - 1：加权轮询（wrr） - 2：加权最少连接（wleastconn） - 3：源地址哈希（source） - 4：URI哈希（uri） */
    public static final class BalanceStrategyEnum {

        /** Enum NUMBER_1 for value: 1 */
        public static final BalanceStrategyEnum NUMBER_1 = new BalanceStrategyEnum(1);

        /** Enum NUMBER_2 for value: 2 */
        public static final BalanceStrategyEnum NUMBER_2 = new BalanceStrategyEnum(2);

        /** Enum NUMBER_3 for value: 3 */
        public static final BalanceStrategyEnum NUMBER_3 = new BalanceStrategyEnum(3);

        /** Enum NUMBER_4 for value: 4 */
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
            BalanceStrategyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BalanceStrategyEnum(value);
            }
            return result;
        }

        public static BalanceStrategyEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            BalanceStrategyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /** VPC通道的成员类型。[site场景必须修改成IP类型](tag:Site) - ip - ecs */
    public static final class MemberTypeEnum {

        /** Enum IP for value: "ip" */
        public static final MemberTypeEnum IP = new MemberTypeEnum("ip");

        /** Enum ECS for value: "ecs" */
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
            MemberTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MemberTypeEnum(value);
            }
            return result;
        }

        public static MemberTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MemberTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "dict_code")

    private String dictCode;

    public VpcBase withName(String name) {
        this.name = name;
        return this;
    }

    /** VPC通道的名称。 长度为3 ~ 64位的字符串，字符串由中文、英文字母、数字、中划线、下划线组成，且只能以英文或中文开头。 > 中文字符必须为UTF-8或者unicode编码。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VpcBase withPort(Integer port) {
        this.port = port;
        return this;
    }

    /** VPC通道中主机的端口号。 取值范围1 ~ 65535。
     * 
     * @return port */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public VpcBase withBalanceStrategy(BalanceStrategyEnum balanceStrategy) {
        this.balanceStrategy = balanceStrategy;
        return this;
    }

    /** 分发算法。 - 1：加权轮询（wrr） - 2：加权最少连接（wleastconn） - 3：源地址哈希（source） - 4：URI哈希（uri）
     * 
     * @return balanceStrategy */
    public BalanceStrategyEnum getBalanceStrategy() {
        return balanceStrategy;
    }

    public void setBalanceStrategy(BalanceStrategyEnum balanceStrategy) {
        this.balanceStrategy = balanceStrategy;
    }

    public VpcBase withMemberType(MemberTypeEnum memberType) {
        this.memberType = memberType;
        return this;
    }

    /** VPC通道的成员类型。[site场景必须修改成IP类型](tag:Site) - ip - ecs
     * 
     * @return memberType */
    public MemberTypeEnum getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberTypeEnum memberType) {
        this.memberType = memberType;
    }

    public VpcBase withDictCode(String dictCode) {
        this.dictCode = dictCode;
        return this;
    }

    /** VPC通道的字典编码 支持英文，数字，特殊字符（-_.） 暂不支持
     * 
     * @return dictCode */
    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpcBase vpcBase = (VpcBase) o;
        return Objects.equals(this.name, vpcBase.name) && Objects.equals(this.port, vpcBase.port)
            && Objects.equals(this.balanceStrategy, vpcBase.balanceStrategy)
            && Objects.equals(this.memberType, vpcBase.memberType) && Objects.equals(this.dictCode, vpcBase.dictCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, port, balanceStrategy, memberType, dictCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcBase {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    balanceStrategy: ").append(toIndentedString(balanceStrategy)).append("\n");
        sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
        sb.append("    dictCode: ").append(toIndentedString(dictCode)).append("\n");
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
