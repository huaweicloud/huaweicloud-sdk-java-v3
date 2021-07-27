package com.huaweicloud.sdk.iec.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.FixedIp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建端口参数对象。
 */
public class CreatePortOption  {

    /**
     * 端口设备所属。  取值范围：目前只支持指定\"neutron:VIP_PORT\"，neutron:VIP_PORT表示创建的是VIP
     */
    public static final class DeviceOwnerEnum {

        
        /**
         * Enum NEUTRON_VIP_PORT for value: "neutron:VIP_PORT"
         */
        public static final DeviceOwnerEnum NEUTRON_VIP_PORT = new DeviceOwnerEnum("neutron:VIP_PORT");
        

        private static final Map<String, DeviceOwnerEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DeviceOwnerEnum> createStaticFields() {
            Map<String, DeviceOwnerEnum> map = new HashMap<>();
            map.put("neutron:VIP_PORT", NEUTRON_VIP_PORT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DeviceOwnerEnum(String value) {
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
            if (obj instanceof DeviceOwnerEnum) {
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
    @JsonProperty(value="network_id")
    
    private String networkId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fixed_ips")
    
    private List<FixedIp> fixedIps = null;
    
    public CreatePortOption withDeviceOwner(DeviceOwnerEnum deviceOwner) {
        this.deviceOwner = deviceOwner;
        return this;
    }

    


    /**
     * 端口设备所属。  取值范围：目前只支持指定\"neutron:VIP_PORT\"，neutron:VIP_PORT表示创建的是VIP
     * @return deviceOwner
     */
    public DeviceOwnerEnum getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(DeviceOwnerEnum deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    

    public CreatePortOption withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    


    /**
     * 端口所属网络的ID。  约束：必须是存在的网络ID。
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    

    public CreatePortOption withFixedIps(List<FixedIp> fixedIps) {
        this.fixedIps = fixedIps;
        return this;
    }

    
    public CreatePortOption addFixedIpsItem(FixedIp fixedIpsItem) {
        if(this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        this.fixedIps.add(fixedIpsItem);
        return this;
    }

    public CreatePortOption withFixedIps(Consumer<List<FixedIp>> fixedIpsSetter) {
        if(this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        fixedIpsSetter.accept(this.fixedIps);
        return this;
    }

    /**
     * 端口IP  约束：一个端口只支持一个fixed_ip，且不支持更新。
     * @return fixedIps
     */
    public List<FixedIp> getFixedIps() {
        return fixedIps;
    }

    public void setFixedIps(List<FixedIp> fixedIps) {
        this.fixedIps = fixedIps;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePortOption createPortOption = (CreatePortOption) o;
        return Objects.equals(this.deviceOwner, createPortOption.deviceOwner) &&
            Objects.equals(this.networkId, createPortOption.networkId) &&
            Objects.equals(this.fixedIps, createPortOption.fixedIps);
    }
    @Override
    public int hashCode() {
        return Objects.hash(deviceOwner, networkId, fixedIps);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePortOption {\n");
        sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    fixedIps: ").append(toIndentedString(fixedIps)).append("\n");
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

