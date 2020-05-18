package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class ListPortsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 2000;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="network_id")
    
    private String networkId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mac_address")
    
    private String macAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_id")
    
    private String deviceId;
    /**
     * Gets or Sets deviceOwner
     */
    public static class DeviceOwnerEnum {

        
        /**
         * Enum NETWORK_DHCP for value: "network:dhcp"
         */
        public static final DeviceOwnerEnum NETWORK_DHCP = new DeviceOwnerEnum("network:dhcp");

        
        /**
         * Enum NETWORK_VIP_PORT for value: "network:VIP_PORT"
         */
        public static final DeviceOwnerEnum NETWORK_VIP_PORT = new DeviceOwnerEnum("network:VIP_PORT");

        
        /**
         * Enum NETWORK_ROUTER_INTERFACE_DISTRIBUTED for value: "network:router_interface_distributed"
         */
        public static final DeviceOwnerEnum NETWORK_ROUTER_INTERFACE_DISTRIBUTED = new DeviceOwnerEnum("network:router_interface_distributed");

        
        /**
         * Enum NETWORK_ROUTER_CENTRALIZED_SNAT for value: "network:router_centralized_snat"
         */
        public static final DeviceOwnerEnum NETWORK_ROUTER_CENTRALIZED_SNAT = new DeviceOwnerEnum("network:router_centralized_snat");

        

        public static Map<String, DeviceOwnerEnum> staticFields =
                new HashMap<String, DeviceOwnerEnum>() {
                    { 
                        put("network:dhcp", NETWORK_DHCP);
                        put("network:VIP_PORT", NETWORK_VIP_PORT);
                        put("network:router_interface_distributed", NETWORK_ROUTER_INTERFACE_DISTRIBUTED);
                        put("network:router_centralized_snat", NETWORK_ROUTER_CENTRALIZED_SNAT);
                    }
                };

        private String value;

        DeviceOwnerEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DeviceOwnerEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            DeviceOwnerEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DeviceOwnerEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DeviceOwnerEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DeviceOwnerEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DeviceOwnerEnum) {
                return this.value.equals(((DeviceOwnerEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_owner")
    
    private DeviceOwnerEnum deviceOwner;
    /**
     * Gets or Sets status
     */
    public static class StatusEnum {

        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        
        /**
         * Enum BUILD for value: "BUILD"
         */
        public static final StatusEnum BUILD = new StatusEnum("BUILD");

        
        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final StatusEnum DOWN = new StatusEnum("DOWN");

        

        public static Map<String, StatusEnum> staticFields =
                new HashMap<String, StatusEnum>() {
                    { 
                        put("ACTIVE", ACTIVE);
                        put("BUILD", BUILD);
                        put("DOWN", DOWN);
                    }
                };

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new StatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
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
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fixed_ips")
    
    private String fixedIps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public ListPortsRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListPortsRequest withId(String id) {
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

    public ListPortsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPortsRequest withAdminStateUp(Boolean adminStateUp) {
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

    public ListPortsRequest withNetworkId(String networkId) {
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

    public ListPortsRequest withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    


    /**
     * Get macAddress
     * @return macAddress
     */
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public ListPortsRequest withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    


    /**
     * Get deviceId
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ListPortsRequest withDeviceOwner(DeviceOwnerEnum deviceOwner) {
        this.deviceOwner = deviceOwner;
        return this;
    }

    


    /**
     * Get deviceOwner
     * @return deviceOwner
     */
    public DeviceOwnerEnum getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(DeviceOwnerEnum deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public ListPortsRequest withStatus(StatusEnum status) {
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

    public ListPortsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListPortsRequest withFixedIps(String fixedIps) {
        this.fixedIps = fixedIps;
        return this;
    }

    


    /**
     * Get fixedIps
     * @return fixedIps
     */
    public String getFixedIps() {
        return fixedIps;
    }

    public void setFixedIps(String fixedIps) {
        this.fixedIps = fixedIps;
    }

    public ListPortsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * Get enterpriseProjectId
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPortsRequest listPortsRequest = (ListPortsRequest) o;
        return Objects.equals(this.name, listPortsRequest.name) &&
            Objects.equals(this.id, listPortsRequest.id) &&
            Objects.equals(this.limit, listPortsRequest.limit) &&
            Objects.equals(this.adminStateUp, listPortsRequest.adminStateUp) &&
            Objects.equals(this.networkId, listPortsRequest.networkId) &&
            Objects.equals(this.macAddress, listPortsRequest.macAddress) &&
            Objects.equals(this.deviceId, listPortsRequest.deviceId) &&
            Objects.equals(this.deviceOwner, listPortsRequest.deviceOwner) &&
            Objects.equals(this.status, listPortsRequest.status) &&
            Objects.equals(this.marker, listPortsRequest.marker) &&
            Objects.equals(this.fixedIps, listPortsRequest.fixedIps) &&
            Objects.equals(this.enterpriseProjectId, listPortsRequest.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, id, limit, adminStateUp, networkId, macAddress, deviceId, deviceOwner, status, marker, fixedIps, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPortsRequest {\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
            sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
            sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
            sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
            sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
            sb.append("    fixedIps: ").append(toIndentedString(fixedIps)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

