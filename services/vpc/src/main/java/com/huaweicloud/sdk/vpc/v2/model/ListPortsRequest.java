package com.huaweicloud.sdk.vpc.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

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
    
    private Integer limit;


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
     * 按照device_owner过滤查询
     */
    public static final class DeviceOwnerEnum {

        
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
        

        private static final Map<String, DeviceOwnerEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeviceOwnerEnum> createStaticFields() {
            Map<String, DeviceOwnerEnum> map = new HashMap<>();
            map.put("network:dhcp", NETWORK_DHCP);
            map.put("network:VIP_PORT", NETWORK_VIP_PORT);
            map.put("network:router_interface_distributed", NETWORK_ROUTER_INTERFACE_DISTRIBUTED);
            map.put("network:router_centralized_snat", NETWORK_ROUTER_CENTRALIZED_SNAT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeviceOwnerEnum(String value) {
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
        public static DeviceOwnerEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DeviceOwnerEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DeviceOwnerEnum(value);
            }
            return result;
        }

        public static DeviceOwnerEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DeviceOwnerEnum result = STATIC_FIELDS.get(value);
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
     * 功能说明：按照status过滤查询  取值范围：ACTIVE、BUILD、DOWN
     */
    public static final class StatusEnum {

        
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
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("BUILD", BUILD);
            map.put("DOWN", DOWN);
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
     * 功能说明：按照name过滤查询  取值范围：最大长度不超过255
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
     * 按照port_id过滤查询
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
     * 每页返回的个数
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
     * 按照admin_state_up进行过滤
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
     * 按照network_id过滤查询
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
     * 按照mac_address过滤查询
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
     * 按照device_id过滤查询
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
     * 按照device_owner过滤查询
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
     * 功能说明：按照status过滤查询  取值范围：ACTIVE、BUILD、DOWN
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
     * 分页查询起始的资源ID，为空时查询第一页
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
     * 按照fixed_ips=ip_address或者fixed_ips=subnet_id过滤查询
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
     * 功能说明：企业项目ID，用于基于企业项目的权限管理。  取值范围：最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。  若需要查询当前用户所有企业项目绑定的端口，请传参all_granted_eps。
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

