package com.huaweicloud.sdk.nat.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DNAT规则的响应体。
 */
public class NatGatewayDnatRuleResponseBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port_id")
    
    private String portId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_ip")
    
    private String privateIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="internal_service_port")
    
    private Integer internalServicePort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nat_gateway_id")
    
    private String natGatewayId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floating_ip_id")
    
    private String floatingIpId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floating_ip_address")
    
    private String floatingIpAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="external_service_port")
    
    private Integer externalServicePort;
    /**
     * 功能说明：DNAT规则的状态。
     */
    public static final class StatusEnum {

        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");
        
        /**
         * Enum PENDING_CREATE for value: "PENDING_CREATE"
         */
        public static final StatusEnum PENDING_CREATE = new StatusEnum("PENDING_CREATE");
        
        /**
         * Enum PENDING_UPDATE for value: "PENDING_UPDATE"
         */
        public static final StatusEnum PENDING_UPDATE = new StatusEnum("PENDING_UPDATE");
        
        /**
         * Enum PENDING_DELETE for value: "PENDING_DELETE"
         */
        public static final StatusEnum PENDING_DELETE = new StatusEnum("PENDING_DELETE");
        
        /**
         * Enum EIP_FREEZED for value: "EIP_FREEZED"
         */
        public static final StatusEnum EIP_FREEZED = new StatusEnum("EIP_FREEZED");
        
        /**
         * Enum INACTIVE for value: "INACTIVE"
         */
        public static final StatusEnum INACTIVE = new StatusEnum("INACTIVE");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("PENDING_CREATE", PENDING_CREATE);
            map.put("PENDING_UPDATE", PENDING_UPDATE);
            map.put("PENDING_DELETE", PENDING_DELETE);
            map.put("EIP_FREEZED", EIP_FREEZED);
            map.put("INACTIVE", INACTIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="internal_service_port_range")
    
    private String internalServicePortRange;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="external_service_port_range")
    
    private String externalServicePortRange;
    /**
     * 协议类型，目前支持TCP/tcp、UDP/udp、ANY/any。 对应协议号6、17、0。 
     */
    public static final class ProtocolEnum {

        
        /**
         * Enum TCP for value: "tcp"
         */
        public static final ProtocolEnum TCP = new ProtocolEnum("tcp");
        
        /**
         * Enum UDP for value: "udp"
         */
        public static final ProtocolEnum UDP = new ProtocolEnum("udp");
        
        /**
         * Enum ANY for value: "any"
         */
        public static final ProtocolEnum ANY = new ProtocolEnum("any");
        

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("tcp", TCP);
            map.put("udp", UDP);
            map.put("any", ANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private ProtocolEnum protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private OffsetDateTime createdAt;

    public NatGatewayDnatRuleResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * DNAT规则的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public NatGatewayDnatRuleResponseBody withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 项目的ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    

    public NatGatewayDnatRuleResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * DNAT规则的描述。长度限制为255。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public NatGatewayDnatRuleResponseBody withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    


    /**
     * 虚拟机或者裸机的Port ID，对应虚拟私有云场景，与private_ip参数二选一。
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    

    public NatGatewayDnatRuleResponseBody withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    


    /**
     * 用户私有IP地址，对应专线、云连接场景，与port_id参数二选一。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    

    public NatGatewayDnatRuleResponseBody withInternalServicePort(Integer internalServicePort) {
        this.internalServicePort = internalServicePort;
        return this;
    }

    


    /**
     * 虚拟机或者裸机对外提供服务的协议端口号。 取值范围：0~65535。
     * minimum: 0
     * maximum: 65535
     * @return internalServicePort
     */
    public Integer getInternalServicePort() {
        return internalServicePort;
    }

    public void setInternalServicePort(Integer internalServicePort) {
        this.internalServicePort = internalServicePort;
    }

    

    public NatGatewayDnatRuleResponseBody withNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    


    /**
     * 公网NAT网关实例的ID。
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    

    public NatGatewayDnatRuleResponseBody withFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
        return this;
    }

    


    /**
     * 弹性公网IP的id。
     * @return floatingIpId
     */
    public String getFloatingIpId() {
        return floatingIpId;
    }

    public void setFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
    }

    

    public NatGatewayDnatRuleResponseBody withFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
        return this;
    }

    


    /**
     * 弹性公网IP的IP地址。 
     * @return floatingIpAddress
     */
    public String getFloatingIpAddress() {
        return floatingIpAddress;
    }

    public void setFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
    }

    

    public NatGatewayDnatRuleResponseBody withExternalServicePort(Integer externalServicePort) {
        this.externalServicePort = externalServicePort;
        return this;
    }

    


    /**
     * Floatingip对外提供服务的端口号。 取值范围：0~65535。
     * @return externalServicePort
     */
    public Integer getExternalServicePort() {
        return externalServicePort;
    }

    public void setExternalServicePort(Integer externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    

    public NatGatewayDnatRuleResponseBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 功能说明：DNAT规则的状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public NatGatewayDnatRuleResponseBody withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * 解冻/冻结状态。 取值范围： − “true”： 解冻 − “false”： 冻结 
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    

    public NatGatewayDnatRuleResponseBody withInternalServicePortRange(String internalServicePortRange) {
        this.internalServicePortRange = internalServicePortRange;
        return this;
    }

    


    /**
     * 虚拟机或者裸机对外提供服务的协议端口号范围。 功能说明：该端口范围与external _service_port_range按顺序实现1:1映射。 取值范围：1~65535。 约束：只能以’-’字符连接端口范围。 
     * @return internalServicePortRange
     */
    public String getInternalServicePortRange() {
        return internalServicePortRange;
    }

    public void setInternalServicePortRange(String internalServicePortRange) {
        this.internalServicePortRange = internalServicePortRange;
    }

    

    public NatGatewayDnatRuleResponseBody withExternalServicePortRange(String externalServicePortRange) {
        this.externalServicePortRange = externalServicePortRange;
        return this;
    }

    


    /**
     * Floatingip对外提供服务的端口号范围。 功能说明：该端口范围与internal _service_port_range按顺序实现1:1映射。 取值范围：1~65535。 约束：只能以’-’字符连接端口范围 
     * @return externalServicePortRange
     */
    public String getExternalServicePortRange() {
        return externalServicePortRange;
    }

    public void setExternalServicePortRange(String externalServicePortRange) {
        this.externalServicePortRange = externalServicePortRange;
    }

    

    public NatGatewayDnatRuleResponseBody withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 协议类型，目前支持TCP/tcp、UDP/udp、ANY/any。 对应协议号6、17、0。 
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    

    public NatGatewayDnatRuleResponseBody withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * DNAT规则的创建时间，遵循UTC时间，格式是yyyy-mm-ddThh:mm:ssZ。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NatGatewayDnatRuleResponseBody natGatewayDnatRuleResponseBody = (NatGatewayDnatRuleResponseBody) o;
        return Objects.equals(this.id, natGatewayDnatRuleResponseBody.id) &&
            Objects.equals(this.tenantId, natGatewayDnatRuleResponseBody.tenantId) &&
            Objects.equals(this.description, natGatewayDnatRuleResponseBody.description) &&
            Objects.equals(this.portId, natGatewayDnatRuleResponseBody.portId) &&
            Objects.equals(this.privateIp, natGatewayDnatRuleResponseBody.privateIp) &&
            Objects.equals(this.internalServicePort, natGatewayDnatRuleResponseBody.internalServicePort) &&
            Objects.equals(this.natGatewayId, natGatewayDnatRuleResponseBody.natGatewayId) &&
            Objects.equals(this.floatingIpId, natGatewayDnatRuleResponseBody.floatingIpId) &&
            Objects.equals(this.floatingIpAddress, natGatewayDnatRuleResponseBody.floatingIpAddress) &&
            Objects.equals(this.externalServicePort, natGatewayDnatRuleResponseBody.externalServicePort) &&
            Objects.equals(this.status, natGatewayDnatRuleResponseBody.status) &&
            Objects.equals(this.adminStateUp, natGatewayDnatRuleResponseBody.adminStateUp) &&
            Objects.equals(this.internalServicePortRange, natGatewayDnatRuleResponseBody.internalServicePortRange) &&
            Objects.equals(this.externalServicePortRange, natGatewayDnatRuleResponseBody.externalServicePortRange) &&
            Objects.equals(this.protocol, natGatewayDnatRuleResponseBody.protocol) &&
            Objects.equals(this.createdAt, natGatewayDnatRuleResponseBody.createdAt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, tenantId, description, portId, privateIp, internalServicePort, natGatewayId, floatingIpId, floatingIpAddress, externalServicePort, status, adminStateUp, internalServicePortRange, externalServicePortRange, protocol, createdAt);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NatGatewayDnatRuleResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    internalServicePort: ").append(toIndentedString(internalServicePort)).append("\n");
        sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
        sb.append("    floatingIpId: ").append(toIndentedString(floatingIpId)).append("\n");
        sb.append("    floatingIpAddress: ").append(toIndentedString(floatingIpAddress)).append("\n");
        sb.append("    externalServicePort: ").append(toIndentedString(externalServicePort)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    internalServicePortRange: ").append(toIndentedString(internalServicePortRange)).append("\n");
        sb.append("    externalServicePortRange: ").append(toIndentedString(externalServicePortRange)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

