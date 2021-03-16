package com.huaweicloud.sdk.nat.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListNatGatewayDnatRulesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="external_service_port")
    
    private Integer externalServicePort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floating_ip_address")
    
    private String floatingIpAddress;
    /**
     * Gets or Sets status
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
    
    private List<StatusEnum> status = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floating_ip_id")
    
    private String floatingIpId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="internal_service_port")
    
    private Integer internalServicePort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private OffsetDateTime createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nat_gateway_id")
    
    private List<String> natGatewayId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port_id")
    
    private String portId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_ip")
    
    private String privateIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private List<String> protocol = null;
    
    public ListNatGatewayDnatRulesRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    


    /**
     * Get adminStateUp
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    

    public ListNatGatewayDnatRulesRequest withExternalServicePort(Integer externalServicePort) {
        this.externalServicePort = externalServicePort;
        return this;
    }

    


    /**
     * Get externalServicePort
     * minimum: 0
     * maximum: 65535
     * @return externalServicePort
     */
    public Integer getExternalServicePort() {
        return externalServicePort;
    }

    public void setExternalServicePort(Integer externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    

    public ListNatGatewayDnatRulesRequest withFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
        return this;
    }

    


    /**
     * Get floatingIpAddress
     * @return floatingIpAddress
     */
    public String getFloatingIpAddress() {
        return floatingIpAddress;
    }

    public void setFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
    }

    

    public ListNatGatewayDnatRulesRequest withStatus(List<StatusEnum> status) {
        this.status = status;
        return this;
    }

    
    public ListNatGatewayDnatRulesRequest addStatusItem(StatusEnum statusItem) {
        this.status.add(statusItem);
        return this;
    }

    public ListNatGatewayDnatRulesRequest withStatus(Consumer<List<StatusEnum>> statusSetter) {
        if(this.status == null ){
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public List<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(List<StatusEnum> status) {
        this.status = status;
    }

    

    public ListNatGatewayDnatRulesRequest withFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
        return this;
    }

    


    /**
     * Get floatingIpId
     * @return floatingIpId
     */
    public String getFloatingIpId() {
        return floatingIpId;
    }

    public void setFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
    }

    

    public ListNatGatewayDnatRulesRequest withInternalServicePort(Integer internalServicePort) {
        this.internalServicePort = internalServicePort;
        return this;
    }

    


    /**
     * Get internalServicePort
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

    

    public ListNatGatewayDnatRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListNatGatewayDnatRulesRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ListNatGatewayDnatRulesRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ListNatGatewayDnatRulesRequest withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * Get createdAt
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    

    public ListNatGatewayDnatRulesRequest withNatGatewayId(List<String> natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    
    public ListNatGatewayDnatRulesRequest addNatGatewayIdItem(String natGatewayIdItem) {
        this.natGatewayId.add(natGatewayIdItem);
        return this;
    }

    public ListNatGatewayDnatRulesRequest withNatGatewayId(Consumer<List<String>> natGatewayIdSetter) {
        if(this.natGatewayId == null ){
            this.natGatewayId = new ArrayList<>();
        }
        natGatewayIdSetter.accept(this.natGatewayId);
        return this;
    }

    /**
     * Get natGatewayId
     * @return natGatewayId
     */
    public List<String> getNatGatewayId() {
        return natGatewayId;
    }

    public void setNatGatewayId(List<String> natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    

    public ListNatGatewayDnatRulesRequest withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    


    /**
     * Get portId
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    

    public ListNatGatewayDnatRulesRequest withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    


    /**
     * Get privateIp
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    

    public ListNatGatewayDnatRulesRequest withProtocol(List<String> protocol) {
        this.protocol = protocol;
        return this;
    }

    
    public ListNatGatewayDnatRulesRequest addProtocolItem(String protocolItem) {
        this.protocol.add(protocolItem);
        return this;
    }

    public ListNatGatewayDnatRulesRequest withProtocol(Consumer<List<String>> protocolSetter) {
        if(this.protocol == null ){
            this.protocol = new ArrayList<>();
        }
        protocolSetter.accept(this.protocol);
        return this;
    }

    /**
     * Get protocol
     * @return protocol
     */
    public List<String> getProtocol() {
        return protocol;
    }

    public void setProtocol(List<String> protocol) {
        this.protocol = protocol;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNatGatewayDnatRulesRequest listNatGatewayDnatRulesRequest = (ListNatGatewayDnatRulesRequest) o;
        return Objects.equals(this.adminStateUp, listNatGatewayDnatRulesRequest.adminStateUp) &&
            Objects.equals(this.externalServicePort, listNatGatewayDnatRulesRequest.externalServicePort) &&
            Objects.equals(this.floatingIpAddress, listNatGatewayDnatRulesRequest.floatingIpAddress) &&
            Objects.equals(this.status, listNatGatewayDnatRulesRequest.status) &&
            Objects.equals(this.floatingIpId, listNatGatewayDnatRulesRequest.floatingIpId) &&
            Objects.equals(this.internalServicePort, listNatGatewayDnatRulesRequest.internalServicePort) &&
            Objects.equals(this.limit, listNatGatewayDnatRulesRequest.limit) &&
            Objects.equals(this.id, listNatGatewayDnatRulesRequest.id) &&
            Objects.equals(this.description, listNatGatewayDnatRulesRequest.description) &&
            Objects.equals(this.createdAt, listNatGatewayDnatRulesRequest.createdAt) &&
            Objects.equals(this.natGatewayId, listNatGatewayDnatRulesRequest.natGatewayId) &&
            Objects.equals(this.portId, listNatGatewayDnatRulesRequest.portId) &&
            Objects.equals(this.privateIp, listNatGatewayDnatRulesRequest.privateIp) &&
            Objects.equals(this.protocol, listNatGatewayDnatRulesRequest.protocol);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, externalServicePort, floatingIpAddress, status, floatingIpId, internalServicePort, limit, id, description, createdAt, natGatewayId, portId, privateIp, protocol);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNatGatewayDnatRulesRequest {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    externalServicePort: ").append(toIndentedString(externalServicePort)).append("\n");
        sb.append("    floatingIpAddress: ").append(toIndentedString(floatingIpAddress)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    floatingIpId: ").append(toIndentedString(floatingIpId)).append("\n");
        sb.append("    internalServicePort: ").append(toIndentedString(internalServicePort)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

