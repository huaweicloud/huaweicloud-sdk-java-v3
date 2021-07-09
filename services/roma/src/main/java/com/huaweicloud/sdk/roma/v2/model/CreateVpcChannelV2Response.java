package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.VpcChannelBase;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateVpcChannelV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private Integer type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="balance_strategy")
    
    private Integer balanceStrategy;
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="elb_id")
    
    private String elbId;

    public CreateVpcChannelV2Response withName(String name) {
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

    

    public CreateVpcChannelV2Response withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * VPC通道的类型。 - 1：私网ELB通道（待废弃） - 2：ROMA Connect APIC内置支持负载均衡功能的快速通道类型
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    

    public CreateVpcChannelV2Response withPort(Integer port) {
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

    

    public CreateVpcChannelV2Response withBalanceStrategy(Integer balanceStrategy) {
        this.balanceStrategy = balanceStrategy;
        return this;
    }

    


    /**
     * 分发算法。 - 1：加权轮询（wrr） - 2：加权最少连接（wleastconn） - 3：源地址哈希（source） - 4：URI哈希（uri）  VPC通道类型为2时必选。
     * @return balanceStrategy
     */
    public Integer getBalanceStrategy() {
        return balanceStrategy;
    }

    public void setBalanceStrategy(Integer balanceStrategy) {
        this.balanceStrategy = balanceStrategy;
    }

    

    public CreateVpcChannelV2Response withMemberType(MemberTypeEnum memberType) {
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

    

    public CreateVpcChannelV2Response withCreateTime(OffsetDateTime createTime) {
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

    

    public CreateVpcChannelV2Response withId(String id) {
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

    

    public CreateVpcChannelV2Response withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * VPC通道的状态。 - 1：正常 - 2：异常
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public CreateVpcChannelV2Response withElbId(String elbId) {
        this.elbId = elbId;
        return this;
    }

    


    /**
     * 私网ELB通道的编号。  仅当VPC通道类型为1时生效
     * @return elbId
     */
    public String getElbId() {
        return elbId;
    }

    public void setElbId(String elbId) {
        this.elbId = elbId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVpcChannelV2Response createVpcChannelV2Response = (CreateVpcChannelV2Response) o;
        return Objects.equals(this.name, createVpcChannelV2Response.name) &&
            Objects.equals(this.type, createVpcChannelV2Response.type) &&
            Objects.equals(this.port, createVpcChannelV2Response.port) &&
            Objects.equals(this.balanceStrategy, createVpcChannelV2Response.balanceStrategy) &&
            Objects.equals(this.memberType, createVpcChannelV2Response.memberType) &&
            Objects.equals(this.createTime, createVpcChannelV2Response.createTime) &&
            Objects.equals(this.id, createVpcChannelV2Response.id) &&
            Objects.equals(this.status, createVpcChannelV2Response.status) &&
            Objects.equals(this.elbId, createVpcChannelV2Response.elbId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, type, port, balanceStrategy, memberType, createTime, id, status, elbId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcChannelV2Response {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    balanceStrategy: ").append(toIndentedString(balanceStrategy)).append("\n");
        sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    elbId: ").append(toIndentedString(elbId)).append("\n");
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

