package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.VpcBase;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VpcChannelBase
 */
public class VpcChannelBase  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * VPC通道的类型。 - 1：私网ELB通道（待废弃） - 2：ROMA Connect APIC内置支持负载均衡功能的快速通道类型
     */
    public static final class TypeEnum {

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final TypeEnum NUMBER_1 = new TypeEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final TypeEnum NUMBER_2 = new TypeEnum(2);
        

        private static final Map<Integer, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TypeEnum> createStaticFields() {
            Map<Integer, TypeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private TypeEnum type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;
    /**
     * 分发算法。 - 1：加权轮询（wrr） - 2：加权最少连接（wleastconn） - 3：源地址哈希（source） - 4：URI哈希（uri）  VPC通道类型为2时必选。
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
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BalanceStrategyEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            BalanceStrategyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BalanceStrategyEnum(value);
            }
            return result;
        }

        public static BalanceStrategyEnum valueOf(Integer value) {
            if( value == null ){
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
            if (obj != null && obj instanceof BalanceStrategyEnum) {
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
    @JsonProperty(value="balance_strategy")
    
    private BalanceStrategyEnum balanceStrategy;
    /**
     * VPC通道的成员类型。 - ip - ecs  VPC通道类型为2时必选。
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MemberTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            MemberTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MemberTypeEnum(value);
            }
            return result;
        }

        public static MemberTypeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof MemberTypeEnum) {
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
    @JsonProperty(value="member_type")
    
    private MemberTypeEnum memberType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;
    /**
     * VPC通道的状态。 - 1：正常 - 2：异常
     */
    public static final class StatusEnum {

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final StatusEnum NUMBER_2 = new StatusEnum(2);
        

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;

    public VpcChannelBase withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * VPC通道的名称。  长度为3 ~ 64位的字符串，字符串由中文、英文字母、数字、中划线、下划线组成，且只能以英文或中文开头。 > 中文字符必须为UTF-8或者unicode编码。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public VpcChannelBase withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * VPC通道的类型。 - 1：私网ELB通道（待废弃） - 2：ROMA Connect APIC内置支持负载均衡功能的快速通道类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public VpcChannelBase withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * VPC通道中主机的端口号。  取值范围1 ~ 65535，仅VPC通道类型为2时有效。  VPC通道类型为2时必选。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    

    public VpcChannelBase withBalanceStrategy(BalanceStrategyEnum balanceStrategy) {
        this.balanceStrategy = balanceStrategy;
        return this;
    }

    


    /**
     * 分发算法。 - 1：加权轮询（wrr） - 2：加权最少连接（wleastconn） - 3：源地址哈希（source） - 4：URI哈希（uri）  VPC通道类型为2时必选。
     * @return balanceStrategy
     */
    public BalanceStrategyEnum getBalanceStrategy() {
        return balanceStrategy;
    }

    public void setBalanceStrategy(BalanceStrategyEnum balanceStrategy) {
        this.balanceStrategy = balanceStrategy;
    }

    

    public VpcChannelBase withMemberType(MemberTypeEnum memberType) {
        this.memberType = memberType;
        return this;
    }

    


    /**
     * VPC通道的成员类型。 - ip - ecs  VPC通道类型为2时必选。
     * @return memberType
     */
    public MemberTypeEnum getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberTypeEnum memberType) {
        this.memberType = memberType;
    }

    

    public VpcChannelBase withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * VPC通道的创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    

    public VpcChannelBase withId(String id) {
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

    

    public VpcChannelBase withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * VPC通道的状态。 - 1：正常 - 2：异常
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpcChannelBase vpcChannelBase = (VpcChannelBase) o;
        return Objects.equals(this.name, vpcChannelBase.name) &&
            Objects.equals(this.type, vpcChannelBase.type) &&
            Objects.equals(this.port, vpcChannelBase.port) &&
            Objects.equals(this.balanceStrategy, vpcChannelBase.balanceStrategy) &&
            Objects.equals(this.memberType, vpcChannelBase.memberType) &&
            Objects.equals(this.createTime, vpcChannelBase.createTime) &&
            Objects.equals(this.id, vpcChannelBase.id) &&
            Objects.equals(this.status, vpcChannelBase.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, type, port, balanceStrategy, memberType, createTime, id, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcChannelBase {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    balanceStrategy: ").append(toIndentedString(balanceStrategy)).append("\n");
        sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

