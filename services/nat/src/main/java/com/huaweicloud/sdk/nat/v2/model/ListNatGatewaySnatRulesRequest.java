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
public class ListNatGatewaySnatRulesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cidr")
    
    private String cidr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floating_ip_address")
    
    private String floatingIpAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floating_ip_id")
    
    private String floatingIpId;


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
    @JsonProperty(value="network_id")
    
    private String networkId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_type")
    
    private Integer sourceType;
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
    
    private StatusEnum status;

    public ListNatGatewaySnatRulesRequest withAdminStateUp(Boolean adminStateUp) {
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

    

    public ListNatGatewaySnatRulesRequest withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    


    /**
     * Get cidr
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    

    public ListNatGatewaySnatRulesRequest withLimit(Integer limit) {
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

    

    public ListNatGatewaySnatRulesRequest withFloatingIpAddress(String floatingIpAddress) {
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

    

    public ListNatGatewaySnatRulesRequest withFloatingIpId(String floatingIpId) {
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

    

    public ListNatGatewaySnatRulesRequest withId(String id) {
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

    

    public ListNatGatewaySnatRulesRequest withDescription(String description) {
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

    

    public ListNatGatewaySnatRulesRequest withCreatedAt(OffsetDateTime createdAt) {
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

    

    public ListNatGatewaySnatRulesRequest withNatGatewayId(List<String> natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    
    public ListNatGatewaySnatRulesRequest addNatGatewayIdItem(String natGatewayIdItem) {
        this.natGatewayId.add(natGatewayIdItem);
        return this;
    }

    public ListNatGatewaySnatRulesRequest withNatGatewayId(Consumer<List<String>> natGatewayIdSetter) {
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

    

    public ListNatGatewaySnatRulesRequest withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    


    /**
     * Get networkId
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    

    public ListNatGatewaySnatRulesRequest withSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    


    /**
     * Get sourceType
     * @return sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    

    public ListNatGatewaySnatRulesRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
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
        ListNatGatewaySnatRulesRequest listNatGatewaySnatRulesRequest = (ListNatGatewaySnatRulesRequest) o;
        return Objects.equals(this.adminStateUp, listNatGatewaySnatRulesRequest.adminStateUp) &&
            Objects.equals(this.cidr, listNatGatewaySnatRulesRequest.cidr) &&
            Objects.equals(this.limit, listNatGatewaySnatRulesRequest.limit) &&
            Objects.equals(this.floatingIpAddress, listNatGatewaySnatRulesRequest.floatingIpAddress) &&
            Objects.equals(this.floatingIpId, listNatGatewaySnatRulesRequest.floatingIpId) &&
            Objects.equals(this.id, listNatGatewaySnatRulesRequest.id) &&
            Objects.equals(this.description, listNatGatewaySnatRulesRequest.description) &&
            Objects.equals(this.createdAt, listNatGatewaySnatRulesRequest.createdAt) &&
            Objects.equals(this.natGatewayId, listNatGatewaySnatRulesRequest.natGatewayId) &&
            Objects.equals(this.networkId, listNatGatewaySnatRulesRequest.networkId) &&
            Objects.equals(this.sourceType, listNatGatewaySnatRulesRequest.sourceType) &&
            Objects.equals(this.status, listNatGatewaySnatRulesRequest.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp, cidr, limit, floatingIpAddress, floatingIpId, id, description, createdAt, natGatewayId, networkId, sourceType, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNatGatewaySnatRulesRequest {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    floatingIpAddress: ").append(toIndentedString(floatingIpAddress)).append("\n");
        sb.append("    floatingIpId: ").append(toIndentedString(floatingIpId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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

