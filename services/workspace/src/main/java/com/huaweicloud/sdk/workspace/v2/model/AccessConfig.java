package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 接入信息
 */
public class AccessConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_mode")

    private String accessMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_access_address")

    private String internetAccessAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_access_port")

    private String internetAccessPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_access_address")

    private String dedicatedAccessAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_access_standby_address")

    private List<String> dedicatedAccessStandbyAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_address_result_code")

    private String standbyAddressResultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_cidrs")

    private String dedicatedCidrs;

    public AccessConfig withAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * 接入方式。 - INTERNET：表示互联网接入 - DEDICATED：表示专线接入 - BOTH：表示同时支持互联网接入和专线接入
     * @return accessMode
     */
    public String getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }

    public AccessConfig withInternetAccessAddress(String internetAccessAddress) {
        this.internetAccessAddress = internetAccessAddress;
        return this;
    }

    /**
     * 互联网接入地址，只有access_mode为“INTERNET”或“BOTH”时才会返回该参数
     * @return internetAccessAddress
     */
    public String getInternetAccessAddress() {
        return internetAccessAddress;
    }

    public void setInternetAccessAddress(String internetAccessAddress) {
        this.internetAccessAddress = internetAccessAddress;
    }

    public AccessConfig withInternetAccessPort(String internetAccessPort) {
        this.internetAccessPort = internetAccessPort;
        return this;
    }

    /**
     * 互联网接入端口
     * @return internetAccessPort
     */
    public String getInternetAccessPort() {
        return internetAccessPort;
    }

    public void setInternetAccessPort(String internetAccessPort) {
        this.internetAccessPort = internetAccessPort;
    }

    public AccessConfig withDedicatedAccessAddress(String dedicatedAccessAddress) {
        this.dedicatedAccessAddress = dedicatedAccessAddress;
        return this;
    }

    /**
     * 专线接入地址，只有access_mode为“DEDICATED”或“BOTH”时才会返回该参数
     * @return dedicatedAccessAddress
     */
    public String getDedicatedAccessAddress() {
        return dedicatedAccessAddress;
    }

    public void setDedicatedAccessAddress(String dedicatedAccessAddress) {
        this.dedicatedAccessAddress = dedicatedAccessAddress;
    }

    public AccessConfig withDedicatedAccessStandbyAddress(List<String> dedicatedAccessStandbyAddress) {
        this.dedicatedAccessStandbyAddress = dedicatedAccessStandbyAddress;
        return this;
    }

    public AccessConfig addDedicatedAccessStandbyAddressItem(String dedicatedAccessStandbyAddressItem) {
        if (this.dedicatedAccessStandbyAddress == null) {
            this.dedicatedAccessStandbyAddress = new ArrayList<>();
        }
        this.dedicatedAccessStandbyAddress.add(dedicatedAccessStandbyAddressItem);
        return this;
    }

    public AccessConfig withDedicatedAccessStandbyAddress(Consumer<List<String>> dedicatedAccessStandbyAddressSetter) {
        if (this.dedicatedAccessStandbyAddress == null) {
            this.dedicatedAccessStandbyAddress = new ArrayList<>();
        }
        dedicatedAccessStandbyAddressSetter.accept(this.dedicatedAccessStandbyAddress);
        return this;
    }

    /**
     * 专线接入备用地址，只有当开启专线备用线路时才会返回该参数
     * @return dedicatedAccessStandbyAddress
     */
    public List<String> getDedicatedAccessStandbyAddress() {
        return dedicatedAccessStandbyAddress;
    }

    public void setDedicatedAccessStandbyAddress(List<String> dedicatedAccessStandbyAddress) {
        this.dedicatedAccessStandbyAddress = dedicatedAccessStandbyAddress;
    }

    public AccessConfig withStandbyAddressResultCode(String standbyAddressResultCode) {
        this.standbyAddressResultCode = standbyAddressResultCode;
        return this;
    }

    /**
     * 专线备用线路失败错误码
     * @return standbyAddressResultCode
     */
    public String getStandbyAddressResultCode() {
        return standbyAddressResultCode;
    }

    public void setStandbyAddressResultCode(String standbyAddressResultCode) {
        this.standbyAddressResultCode = standbyAddressResultCode;
    }

    public AccessConfig withDedicatedCidrs(String dedicatedCidrs) {
        this.dedicatedCidrs = dedicatedCidrs;
        return this;
    }

    /**
     * 专线接入网段。接入模式包含专线方式时选填，多个网段信息用分号隔开，列表长度不超过5。
     * @return dedicatedCidrs
     */
    public String getDedicatedCidrs() {
        return dedicatedCidrs;
    }

    public void setDedicatedCidrs(String dedicatedCidrs) {
        this.dedicatedCidrs = dedicatedCidrs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessConfig that = (AccessConfig) obj;
        return Objects.equals(this.accessMode, that.accessMode)
            && Objects.equals(this.internetAccessAddress, that.internetAccessAddress)
            && Objects.equals(this.internetAccessPort, that.internetAccessPort)
            && Objects.equals(this.dedicatedAccessAddress, that.dedicatedAccessAddress)
            && Objects.equals(this.dedicatedAccessStandbyAddress, that.dedicatedAccessStandbyAddress)
            && Objects.equals(this.standbyAddressResultCode, that.standbyAddressResultCode)
            && Objects.equals(this.dedicatedCidrs, that.dedicatedCidrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessMode,
            internetAccessAddress,
            internetAccessPort,
            dedicatedAccessAddress,
            dedicatedAccessStandbyAddress,
            standbyAddressResultCode,
            dedicatedCidrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfig {\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    internetAccessAddress: ").append(toIndentedString(internetAccessAddress)).append("\n");
        sb.append("    internetAccessPort: ").append(toIndentedString(internetAccessPort)).append("\n");
        sb.append("    dedicatedAccessAddress: ").append(toIndentedString(dedicatedAccessAddress)).append("\n");
        sb.append("    dedicatedAccessStandbyAddress: ")
            .append(toIndentedString(dedicatedAccessStandbyAddress))
            .append("\n");
        sb.append("    standbyAddressResultCode: ").append(toIndentedString(standbyAddressResultCode)).append("\n");
        sb.append("    dedicatedCidrs: ").append(toIndentedString(dedicatedCidrs)).append("\n");
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
