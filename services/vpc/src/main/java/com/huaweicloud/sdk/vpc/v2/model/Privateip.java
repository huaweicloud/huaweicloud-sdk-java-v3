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
 * 
 */
public class Privateip  {

    /**
     * 私有IP的状态  - ACTIVE：活动的  - DOWN：不可用
     */
    public static class StatusEnum {

        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        
        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final StatusEnum DOWN = new StatusEnum("DOWN");

        

        public static Map<String, StatusEnum> staticFields =
                new HashMap<String, StatusEnum>() {
                    { 
                        put("ACTIVE", ACTIVE);
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
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;
    /**
     * 私有IP的使用者，空表示未使用 取值范围：network:dhcp，network:router_interface_distributed，compute:xxx(xxx对应具体的az名称，例如compute:aa-bb-cc表示是被aa-bb-cc上的虚拟机使用) 约束：此处的取值范围只是本服务支持的类型，其他类型未做标注
     */
    public static class DeviceOwnerEnum {

        
        /**
         * Enum NETWORK_DHCP for value: "network:dhcp"
         */
        public static final DeviceOwnerEnum NETWORK_DHCP = new DeviceOwnerEnum("network:dhcp");

        
        /**
         * Enum NETWORK_ROUTER_INTERFACE_DISTRIBUTED for value: "network:router_interface_distributed"
         */
        public static final DeviceOwnerEnum NETWORK_ROUTER_INTERFACE_DISTRIBUTED = new DeviceOwnerEnum("network:router_interface_distributed");

        
        /**
         * Enum COMPUTE_XXX for value: "compute:xxx"
         */
        public static final DeviceOwnerEnum COMPUTE_XXX = new DeviceOwnerEnum("compute:xxx");

        

        public static Map<String, DeviceOwnerEnum> staticFields =
                new HashMap<String, DeviceOwnerEnum>() {
                    { 
                        put("network:dhcp", NETWORK_DHCP);
                        put("network:router_interface_distributed", NETWORK_ROUTER_INTERFACE_DISTRIBUTED);
                        put("compute:xxx", COMPUTE_XXX);
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_address")
    
    private String ipAddress;

    public Privateip withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 私有IP的状态  - ACTIVE：活动的  - DOWN：不可用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Privateip withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 私有IP ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Privateip withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 分配IP的子网标识
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public Privateip withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 项目ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Privateip withDeviceOwner(DeviceOwnerEnum deviceOwner) {
        this.deviceOwner = deviceOwner;
        return this;
    }

    


    /**
     * 私有IP的使用者，空表示未使用 取值范围：network:dhcp，network:router_interface_distributed，compute:xxx(xxx对应具体的az名称，例如compute:aa-bb-cc表示是被aa-bb-cc上的虚拟机使用) 约束：此处的取值范围只是本服务支持的类型，其他类型未做标注
     * @return deviceOwner
     */
    public DeviceOwnerEnum getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(DeviceOwnerEnum deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public Privateip withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    


    /**
     * 申请到的私有IP
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Privateip privateip = (Privateip) o;
        return Objects.equals(this.status, privateip.status) &&
            Objects.equals(this.id, privateip.id) &&
            Objects.equals(this.subnetId, privateip.subnetId) &&
            Objects.equals(this.tenantId, privateip.tenantId) &&
            Objects.equals(this.deviceOwner, privateip.deviceOwner) &&
            Objects.equals(this.ipAddress, privateip.ipAddress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, id, subnetId, tenantId, deviceOwner, ipAddress);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Privateip {\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
            sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
            sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
            sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

