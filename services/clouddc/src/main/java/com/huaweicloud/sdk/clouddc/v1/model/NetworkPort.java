package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 网络端口的详细信息，如型号、厂商等
 */
public class NetworkPort {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_port_number")

    private String physicalPortNumber;

    /**
     * 网络端口的物理连接状态
     */
    public static final class LinkStatusEnum {

        /**
         * Enum UP for value: "Up"
         */
        public static final LinkStatusEnum UP = new LinkStatusEnum("Up");

        /**
         * Enum DOWN for value: "Down"
         */
        public static final LinkStatusEnum DOWN = new LinkStatusEnum("Down");

        private static final Map<String, LinkStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LinkStatusEnum> createStaticFields() {
            Map<String, LinkStatusEnum> map = new HashMap<>();
            map.put("Up", UP);
            map.put("Down", DOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LinkStatusEnum(String value) {
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
        public static LinkStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LinkStatusEnum(value));
        }

        public static LinkStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LinkStatusEnum) {
                return this.value.equals(((LinkStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link_status")

    private LinkStatusEnum linkStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_network_addresses")

    private String associatedNetworkAddresses;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_link_technology")

    private String activeLinkTechnology;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_type")

    private String portType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_max_speed")

    private String portMaxSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_package_version")

    private String firmwarePackageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bdf")

    private String bdf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_neg")

    private String autoNeg;

    public NetworkPort withPhysicalPortNumber(String physicalPortNumber) {
        this.physicalPortNumber = physicalPortNumber;
        return this;
    }

    /**
     * 网络端口的物理端口号
     * @return physicalPortNumber
     */
    public String getPhysicalPortNumber() {
        return physicalPortNumber;
    }

    public void setPhysicalPortNumber(String physicalPortNumber) {
        this.physicalPortNumber = physicalPortNumber;
    }

    public NetworkPort withLinkStatus(LinkStatusEnum linkStatus) {
        this.linkStatus = linkStatus;
        return this;
    }

    /**
     * 网络端口的物理连接状态
     * @return linkStatus
     */
    public LinkStatusEnum getLinkStatus() {
        return linkStatus;
    }

    public void setLinkStatus(LinkStatusEnum linkStatus) {
        this.linkStatus = linkStatus;
    }

    public NetworkPort withAssociatedNetworkAddresses(String associatedNetworkAddresses) {
        this.associatedNetworkAddresses = associatedNetworkAddresses;
        return this;
    }

    /**
     * 网络端口的网络地址
     * @return associatedNetworkAddresses
     */
    public String getAssociatedNetworkAddresses() {
        return associatedNetworkAddresses;
    }

    public void setAssociatedNetworkAddresses(String associatedNetworkAddresses) {
        this.associatedNetworkAddresses = associatedNetworkAddresses;
    }

    public NetworkPort withActiveLinkTechnology(String activeLinkTechnology) {
        this.activeLinkTechnology = activeLinkTechnology;
        return this;
    }

    /**
     * 网络端口的网络协议
     * @return activeLinkTechnology
     */
    public String getActiveLinkTechnology() {
        return activeLinkTechnology;
    }

    public void setActiveLinkTechnology(String activeLinkTechnology) {
        this.activeLinkTechnology = activeLinkTechnology;
    }

    public NetworkPort withPortType(String portType) {
        this.portType = portType;
        return this;
    }

    /**
     * 网络端口的网口类型
     * @return portType
     */
    public String getPortType() {
        return portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public NetworkPort withPortMaxSpeed(String portMaxSpeed) {
        this.portMaxSpeed = portMaxSpeed;
        return this;
    }

    /**
     * 网络端口的最大速率
     * @return portMaxSpeed
     */
    public String getPortMaxSpeed() {
        return portMaxSpeed;
    }

    public void setPortMaxSpeed(String portMaxSpeed) {
        this.portMaxSpeed = portMaxSpeed;
    }

    public NetworkPort withFirmwarePackageVersion(String firmwarePackageVersion) {
        this.firmwarePackageVersion = firmwarePackageVersion;
        return this;
    }

    /**
     * 网络端口的固件版本
     * @return firmwarePackageVersion
     */
    public String getFirmwarePackageVersion() {
        return firmwarePackageVersion;
    }

    public void setFirmwarePackageVersion(String firmwarePackageVersion) {
        this.firmwarePackageVersion = firmwarePackageVersion;
    }

    public NetworkPort withBdf(String bdf) {
        this.bdf = bdf;
        return this;
    }

    /**
     * 网络端口的BDF
     * @return bdf
     */
    public String getBdf() {
        return bdf;
    }

    public void setBdf(String bdf) {
        this.bdf = bdf;
    }

    public NetworkPort withAutoNeg(String autoNeg) {
        this.autoNeg = autoNeg;
        return this;
    }

    /**
     * 协议
     * @return autoNeg
     */
    public String getAutoNeg() {
        return autoNeg;
    }

    public void setAutoNeg(String autoNeg) {
        this.autoNeg = autoNeg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkPort that = (NetworkPort) obj;
        return Objects.equals(this.physicalPortNumber, that.physicalPortNumber)
            && Objects.equals(this.linkStatus, that.linkStatus)
            && Objects.equals(this.associatedNetworkAddresses, that.associatedNetworkAddresses)
            && Objects.equals(this.activeLinkTechnology, that.activeLinkTechnology)
            && Objects.equals(this.portType, that.portType) && Objects.equals(this.portMaxSpeed, that.portMaxSpeed)
            && Objects.equals(this.firmwarePackageVersion, that.firmwarePackageVersion)
            && Objects.equals(this.bdf, that.bdf) && Objects.equals(this.autoNeg, that.autoNeg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(physicalPortNumber,
            linkStatus,
            associatedNetworkAddresses,
            activeLinkTechnology,
            portType,
            portMaxSpeed,
            firmwarePackageVersion,
            bdf,
            autoNeg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkPort {\n");
        sb.append("    physicalPortNumber: ").append(toIndentedString(physicalPortNumber)).append("\n");
        sb.append("    linkStatus: ").append(toIndentedString(linkStatus)).append("\n");
        sb.append("    associatedNetworkAddresses: ").append(toIndentedString(associatedNetworkAddresses)).append("\n");
        sb.append("    activeLinkTechnology: ").append(toIndentedString(activeLinkTechnology)).append("\n");
        sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
        sb.append("    portMaxSpeed: ").append(toIndentedString(portMaxSpeed)).append("\n");
        sb.append("    firmwarePackageVersion: ").append(toIndentedString(firmwarePackageVersion)).append("\n");
        sb.append("    bdf: ").append(toIndentedString(bdf)).append("\n");
        sb.append("    autoNeg: ").append(toIndentedString(autoNeg)).append("\n");
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
