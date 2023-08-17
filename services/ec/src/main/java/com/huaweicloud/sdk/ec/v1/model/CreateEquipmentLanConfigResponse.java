package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateEquipmentLanConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface_name")

    private String interfaceName;

    /**
     * 接口类型
     */
    public static final class InterfaceTypeEnum {

        /**
         * Enum L3_MAIN_INTERFACE for value: "l3 main interface"
         */
        public static final InterfaceTypeEnum L3_MAIN_INTERFACE = new InterfaceTypeEnum("l3 main interface");

        /**
         * Enum L3_SUB_INTERFACE for value: "l3 sub interface"
         */
        public static final InterfaceTypeEnum L3_SUB_INTERFACE = new InterfaceTypeEnum("l3 sub interface");

        /**
         * Enum VLAN_INTERFACE for value: "vlan interface"
         */
        public static final InterfaceTypeEnum VLAN_INTERFACE = new InterfaceTypeEnum("vlan interface");

        private static final Map<String, InterfaceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InterfaceTypeEnum> createStaticFields() {
            Map<String, InterfaceTypeEnum> map = new HashMap<>();
            map.put("l3 main interface", L3_MAIN_INTERFACE);
            map.put("l3 sub interface", L3_SUB_INTERFACE);
            map.put("vlan interface", VLAN_INTERFACE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InterfaceTypeEnum(String value) {
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
        public static InterfaceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InterfaceTypeEnum(value));
        }

        public static InterfaceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InterfaceTypeEnum) {
                return this.value.equals(((InterfaceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface_type")

    private InterfaceTypeEnum interfaceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vlan_id")

    private Integer vlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dhcp")

    private Boolean dhcp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_ip_address")

    private String startIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_ip_address")

    private String endIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lease_time")

    private Integer leaseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "post_to_cloud")

    private Boolean postToCloud;

    public CreateEquipmentLanConfigResponse withInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }

    /**
     * 接口名字
     * @return interfaceName
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public CreateEquipmentLanConfigResponse withInterfaceType(InterfaceTypeEnum interfaceType) {
        this.interfaceType = interfaceType;
        return this;
    }

    /**
     * 接口类型
     * @return interfaceType
     */
    public InterfaceTypeEnum getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(InterfaceTypeEnum interfaceType) {
        this.interfaceType = interfaceType;
    }

    public CreateEquipmentLanConfigResponse withVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * VlanID
     * minimum: 2
     * maximum: 4094
     * @return vlanId
     */
    public Integer getVlanId() {
        return vlanId;
    }

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    public CreateEquipmentLanConfigResponse withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * IPv4地址
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public CreateEquipmentLanConfigResponse withDhcp(Boolean dhcp) {
        this.dhcp = dhcp;
        return this;
    }

    /**
     * DHCP开关
     * @return dhcp
     */
    public Boolean getDhcp() {
        return dhcp;
    }

    public void setDhcp(Boolean dhcp) {
        this.dhcp = dhcp;
    }

    public CreateEquipmentLanConfigResponse withStartIpAddress(String startIpAddress) {
        this.startIpAddress = startIpAddress;
        return this;
    }

    /**
     * DHCP地址池起始IP地址
     * @return startIpAddress
     */
    public String getStartIpAddress() {
        return startIpAddress;
    }

    public void setStartIpAddress(String startIpAddress) {
        this.startIpAddress = startIpAddress;
    }

    public CreateEquipmentLanConfigResponse withEndIpAddress(String endIpAddress) {
        this.endIpAddress = endIpAddress;
        return this;
    }

    /**
     * DHCP地址池结束IP地址
     * @return endIpAddress
     */
    public String getEndIpAddress() {
        return endIpAddress;
    }

    public void setEndIpAddress(String endIpAddress) {
        this.endIpAddress = endIpAddress;
    }

    public CreateEquipmentLanConfigResponse withLeaseTime(Integer leaseTime) {
        this.leaseTime = leaseTime;
        return this;
    }

    /**
     * 地址租期(分钟)
     * minimum: 0
     * maximum: 1439999
     * @return leaseTime
     */
    public Integer getLeaseTime() {
        return leaseTime;
    }

    public void setLeaseTime(Integer leaseTime) {
        this.leaseTime = leaseTime;
    }

    public CreateEquipmentLanConfigResponse withPostToCloud(Boolean postToCloud) {
        this.postToCloud = postToCloud;
        return this;
    }

    /**
     * 发布到企业连接网络
     * @return postToCloud
     */
    public Boolean getPostToCloud() {
        return postToCloud;
    }

    public void setPostToCloud(Boolean postToCloud) {
        this.postToCloud = postToCloud;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEquipmentLanConfigResponse that = (CreateEquipmentLanConfigResponse) obj;
        return Objects.equals(this.interfaceName, that.interfaceName)
            && Objects.equals(this.interfaceType, that.interfaceType) && Objects.equals(this.vlanId, that.vlanId)
            && Objects.equals(this.ipAddress, that.ipAddress) && Objects.equals(this.dhcp, that.dhcp)
            && Objects.equals(this.startIpAddress, that.startIpAddress)
            && Objects.equals(this.endIpAddress, that.endIpAddress) && Objects.equals(this.leaseTime, that.leaseTime)
            && Objects.equals(this.postToCloud, that.postToCloud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interfaceName,
            interfaceType,
            vlanId,
            ipAddress,
            dhcp,
            startIpAddress,
            endIpAddress,
            leaseTime,
            postToCloud);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEquipmentLanConfigResponse {\n");
        sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
        sb.append("    interfaceType: ").append(toIndentedString(interfaceType)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    dhcp: ").append(toIndentedString(dhcp)).append("\n");
        sb.append("    startIpAddress: ").append(toIndentedString(startIpAddress)).append("\n");
        sb.append("    endIpAddress: ").append(toIndentedString(endIpAddress)).append("\n");
        sb.append("    leaseTime: ").append(toIndentedString(leaseTime)).append("\n");
        sb.append("    postToCloud: ").append(toIndentedString(postToCloud)).append("\n");
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
