package com.huaweicloud.sdk.apig.v2.model;

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
public class AddEipV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id")

    private String eipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_address")

    private String eipAddress;

    /**
     * 弹性公网IP状态。 - FREEZED：冻结 - BIND_ERROR：绑定失败 - BINDING：绑定中 - PENDING_DELETE：释放中 - PENDING_CREATE：创建中 - NOTIFYING：创建中 - NOTIFY_DELETE：释放中 - PENDING_UPDATE：更新中 - DOWN：未绑定 - ACTIVE：绑定 - ELB：绑定ELB - VPN：绑定VPN - ERROR：失败 
     */
    public static final class EipStatusEnum {

        /**
         * Enum FREEZED for value: "FREEZED"
         */
        public static final EipStatusEnum FREEZED = new EipStatusEnum("FREEZED");

        /**
         * Enum BIND_ERROR for value: "BIND_ERROR"
         */
        public static final EipStatusEnum BIND_ERROR = new EipStatusEnum("BIND_ERROR");

        /**
         * Enum BINDING for value: "BINDING"
         */
        public static final EipStatusEnum BINDING = new EipStatusEnum("BINDING");

        /**
         * Enum PENDING_DELETE for value: "PENDING_DELETE"
         */
        public static final EipStatusEnum PENDING_DELETE = new EipStatusEnum("PENDING_DELETE");

        /**
         * Enum PENDING_CREATE for value: "PENDING_CREATE"
         */
        public static final EipStatusEnum PENDING_CREATE = new EipStatusEnum("PENDING_CREATE");

        /**
         * Enum NOTIFYING for value: "NOTIFYING"
         */
        public static final EipStatusEnum NOTIFYING = new EipStatusEnum("NOTIFYING");

        /**
         * Enum NOTIFY_DELETE for value: "NOTIFY_DELETE"
         */
        public static final EipStatusEnum NOTIFY_DELETE = new EipStatusEnum("NOTIFY_DELETE");

        /**
         * Enum PENDING_UPDATE for value: "PENDING_UPDATE"
         */
        public static final EipStatusEnum PENDING_UPDATE = new EipStatusEnum("PENDING_UPDATE");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final EipStatusEnum DOWN = new EipStatusEnum("DOWN");

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final EipStatusEnum ACTIVE = new EipStatusEnum("ACTIVE");

        /**
         * Enum ELB for value: "ELB"
         */
        public static final EipStatusEnum ELB = new EipStatusEnum("ELB");

        /**
         * Enum VPN for value: "VPN"
         */
        public static final EipStatusEnum VPN = new EipStatusEnum("VPN");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final EipStatusEnum ERROR = new EipStatusEnum("ERROR");

        private static final Map<String, EipStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EipStatusEnum> createStaticFields() {
            Map<String, EipStatusEnum> map = new HashMap<>();
            map.put("FREEZED", FREEZED);
            map.put("BIND_ERROR", BIND_ERROR);
            map.put("BINDING", BINDING);
            map.put("PENDING_DELETE", PENDING_DELETE);
            map.put("PENDING_CREATE", PENDING_CREATE);
            map.put("NOTIFYING", NOTIFYING);
            map.put("NOTIFY_DELETE", NOTIFY_DELETE);
            map.put("PENDING_UPDATE", PENDING_UPDATE);
            map.put("DOWN", DOWN);
            map.put("ACTIVE", ACTIVE);
            map.put("ELB", ELB);
            map.put("VPN", VPN);
            map.put("ERROR", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EipStatusEnum(String value) {
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
        public static EipStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EipStatusEnum(value));
        }

        public static EipStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EipStatusEnum) {
                return this.value.equals(((EipStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_status")

    private EipStatusEnum eipStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_ipv6_address")

    private String eipIpv6Address;

    public AddEipV2Response withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    /**
     * 弹性公网IP编号
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    public AddEipV2Response withEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }

    /**
     * 弹性公网IP
     * @return eipAddress
     */
    public String getEipAddress() {
        return eipAddress;
    }

    public void setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
    }

    public AddEipV2Response withEipStatus(EipStatusEnum eipStatus) {
        this.eipStatus = eipStatus;
        return this;
    }

    /**
     * 弹性公网IP状态。 - FREEZED：冻结 - BIND_ERROR：绑定失败 - BINDING：绑定中 - PENDING_DELETE：释放中 - PENDING_CREATE：创建中 - NOTIFYING：创建中 - NOTIFY_DELETE：释放中 - PENDING_UPDATE：更新中 - DOWN：未绑定 - ACTIVE：绑定 - ELB：绑定ELB - VPN：绑定VPN - ERROR：失败 
     * @return eipStatus
     */
    public EipStatusEnum getEipStatus() {
        return eipStatus;
    }

    public void setEipStatus(EipStatusEnum eipStatus) {
        this.eipStatus = eipStatus;
    }

    public AddEipV2Response withEipIpv6Address(String eipIpv6Address) {
        this.eipIpv6Address = eipIpv6Address;
        return this;
    }

    /**
     * 弹性公网IP(IPV6)
     * @return eipIpv6Address
     */
    public String getEipIpv6Address() {
        return eipIpv6Address;
    }

    public void setEipIpv6Address(String eipIpv6Address) {
        this.eipIpv6Address = eipIpv6Address;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddEipV2Response that = (AddEipV2Response) obj;
        return Objects.equals(this.eipId, that.eipId) && Objects.equals(this.eipAddress, that.eipAddress)
            && Objects.equals(this.eipStatus, that.eipStatus)
            && Objects.equals(this.eipIpv6Address, that.eipIpv6Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eipId, eipAddress, eipStatus, eipIpv6Address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddEipV2Response {\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
        sb.append("    eipAddress: ").append(toIndentedString(eipAddress)).append("\n");
        sb.append("    eipStatus: ").append(toIndentedString(eipStatus)).append("\n");
        sb.append("    eipIpv6Address: ").append(toIndentedString(eipIpv6Address)).append("\n");
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
