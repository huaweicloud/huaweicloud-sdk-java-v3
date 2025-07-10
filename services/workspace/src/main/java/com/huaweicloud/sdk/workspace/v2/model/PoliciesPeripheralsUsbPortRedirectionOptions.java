package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * USB端口重定向控制的选项。
 */
public class PoliciesPeripheralsUsbPortRedirectionOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_image_enable")

    private Boolean usbImageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_video_enable")

    private Boolean usbVideoEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_printer_enable")

    private Boolean usbPrinterEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_storage_enable")

    private Boolean usbStorageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wireless_devices_enable")

    private Boolean wirelessDevicesEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_devices_enable")

    private Boolean networkDevicesEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_smart_card_enable")

    private Boolean usbSmartCardEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_usb_devices_enable")

    private Boolean otherUsbDevicesEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_redirection_customization_policy")

    private String usbRedirectionCustomizationPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_redirection_mode")

    private String usbRedirectionMode;

    public PoliciesPeripheralsUsbPortRedirectionOptions withUsbImageEnable(Boolean usbImageEnable) {
        this.usbImageEnable = usbImageEnable;
        return this;
    }

    /**
     * 是否开启图像设备（如: 扫描仪）。取值为： false：表示关闭。 true：表示开启。
     * @return usbImageEnable
     */
    public Boolean getUsbImageEnable() {
        return usbImageEnable;
    }

    public void setUsbImageEnable(Boolean usbImageEnable) {
        this.usbImageEnable = usbImageEnable;
    }

    public PoliciesPeripheralsUsbPortRedirectionOptions withUsbVideoEnable(Boolean usbVideoEnable) {
        this.usbVideoEnable = usbVideoEnable;
        return this;
    }

    /**
     * 是否开启视频设备（如: 摄像头）。取值为： false：表示关闭。 true：表示开启。
     * @return usbVideoEnable
     */
    public Boolean getUsbVideoEnable() {
        return usbVideoEnable;
    }

    public void setUsbVideoEnable(Boolean usbVideoEnable) {
        this.usbVideoEnable = usbVideoEnable;
    }

    public PoliciesPeripheralsUsbPortRedirectionOptions withUsbPrinterEnable(Boolean usbPrinterEnable) {
        this.usbPrinterEnable = usbPrinterEnable;
        return this;
    }

    /**
     * 是否开启打印设备（如: 打印机）。取值为： false：表示关闭。 true：表示开启。
     * @return usbPrinterEnable
     */
    public Boolean getUsbPrinterEnable() {
        return usbPrinterEnable;
    }

    public void setUsbPrinterEnable(Boolean usbPrinterEnable) {
        this.usbPrinterEnable = usbPrinterEnable;
    }

    public PoliciesPeripheralsUsbPortRedirectionOptions withUsbStorageEnable(Boolean usbStorageEnable) {
        this.usbStorageEnable = usbStorageEnable;
        return this;
    }

    /**
     * 是否开启存储设备（如: U盘）。取值为： false：表示关闭。 true：表示开启。
     * @return usbStorageEnable
     */
    public Boolean getUsbStorageEnable() {
        return usbStorageEnable;
    }

    public void setUsbStorageEnable(Boolean usbStorageEnable) {
        this.usbStorageEnable = usbStorageEnable;
    }

    public PoliciesPeripheralsUsbPortRedirectionOptions withWirelessDevicesEnable(Boolean wirelessDevicesEnable) {
        this.wirelessDevicesEnable = wirelessDevicesEnable;
        return this;
    }

    /**
     * 是否开启无线设备（如：蓝牙）。取值为： false：表示关闭。 true：表示开启。
     * @return wirelessDevicesEnable
     */
    public Boolean getWirelessDevicesEnable() {
        return wirelessDevicesEnable;
    }

    public void setWirelessDevicesEnable(Boolean wirelessDevicesEnable) {
        this.wirelessDevicesEnable = wirelessDevicesEnable;
    }

    public PoliciesPeripheralsUsbPortRedirectionOptions withNetworkDevicesEnable(Boolean networkDevicesEnable) {
        this.networkDevicesEnable = networkDevicesEnable;
        return this;
    }

    /**
     * 是否开启网路设备（如：无线网卡）。取值为： false：表示关闭。 true：表示开启。
     * @return networkDevicesEnable
     */
    public Boolean getNetworkDevicesEnable() {
        return networkDevicesEnable;
    }

    public void setNetworkDevicesEnable(Boolean networkDevicesEnable) {
        this.networkDevicesEnable = networkDevicesEnable;
    }

    public PoliciesPeripheralsUsbPortRedirectionOptions withUsbSmartCardEnable(Boolean usbSmartCardEnable) {
        this.usbSmartCardEnable = usbSmartCardEnable;
        return this;
    }

    /**
     * 是否开启智能卡设备（如：Ukey）。取值为： false：表示关闭。 true：表示开启。
     * @return usbSmartCardEnable
     */
    public Boolean getUsbSmartCardEnable() {
        return usbSmartCardEnable;
    }

    public void setUsbSmartCardEnable(Boolean usbSmartCardEnable) {
        this.usbSmartCardEnable = usbSmartCardEnable;
    }

    public PoliciesPeripheralsUsbPortRedirectionOptions withOtherUsbDevicesEnable(Boolean otherUsbDevicesEnable) {
        this.otherUsbDevicesEnable = otherUsbDevicesEnable;
        return this;
    }

    /**
     * 是否开启其他USB设备重定向。取值为： false：表示关闭。 true：表示开启。
     * @return otherUsbDevicesEnable
     */
    public Boolean getOtherUsbDevicesEnable() {
        return otherUsbDevicesEnable;
    }

    public void setOtherUsbDevicesEnable(Boolean otherUsbDevicesEnable) {
        this.otherUsbDevicesEnable = otherUsbDevicesEnable;
    }

    public PoliciesPeripheralsUsbPortRedirectionOptions withUsbRedirectionCustomizationPolicy(
        String usbRedirectionCustomizationPolicy) {
        this.usbRedirectionCustomizationPolicy = usbRedirectionCustomizationPolicy;
        return this;
    }

    /**
     * USB端口重定向自定义策略，长度不能超过18000个字符。
     * @return usbRedirectionCustomizationPolicy
     */
    public String getUsbRedirectionCustomizationPolicy() {
        return usbRedirectionCustomizationPolicy;
    }

    public void setUsbRedirectionCustomizationPolicy(String usbRedirectionCustomizationPolicy) {
        this.usbRedirectionCustomizationPolicy = usbRedirectionCustomizationPolicy;
    }

    public PoliciesPeripheralsUsbPortRedirectionOptions withUsbRedirectionMode(String usbRedirectionMode) {
        this.usbRedirectionMode = usbRedirectionMode;
        return this;
    }

    /**
     * USB 重定向模式。取值为： 经典模式：Classical mode。 通用模式：Common mode。
     * @return usbRedirectionMode
     */
    public String getUsbRedirectionMode() {
        return usbRedirectionMode;
    }

    public void setUsbRedirectionMode(String usbRedirectionMode) {
        this.usbRedirectionMode = usbRedirectionMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripheralsUsbPortRedirectionOptions that = (PoliciesPeripheralsUsbPortRedirectionOptions) obj;
        return Objects.equals(this.usbImageEnable, that.usbImageEnable)
            && Objects.equals(this.usbVideoEnable, that.usbVideoEnable)
            && Objects.equals(this.usbPrinterEnable, that.usbPrinterEnable)
            && Objects.equals(this.usbStorageEnable, that.usbStorageEnable)
            && Objects.equals(this.wirelessDevicesEnable, that.wirelessDevicesEnable)
            && Objects.equals(this.networkDevicesEnable, that.networkDevicesEnable)
            && Objects.equals(this.usbSmartCardEnable, that.usbSmartCardEnable)
            && Objects.equals(this.otherUsbDevicesEnable, that.otherUsbDevicesEnable)
            && Objects.equals(this.usbRedirectionCustomizationPolicy, that.usbRedirectionCustomizationPolicy)
            && Objects.equals(this.usbRedirectionMode, that.usbRedirectionMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usbImageEnable,
            usbVideoEnable,
            usbPrinterEnable,
            usbStorageEnable,
            wirelessDevicesEnable,
            networkDevicesEnable,
            usbSmartCardEnable,
            otherUsbDevicesEnable,
            usbRedirectionCustomizationPolicy,
            usbRedirectionMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsUsbPortRedirectionOptions {\n");
        sb.append("    usbImageEnable: ").append(toIndentedString(usbImageEnable)).append("\n");
        sb.append("    usbVideoEnable: ").append(toIndentedString(usbVideoEnable)).append("\n");
        sb.append("    usbPrinterEnable: ").append(toIndentedString(usbPrinterEnable)).append("\n");
        sb.append("    usbStorageEnable: ").append(toIndentedString(usbStorageEnable)).append("\n");
        sb.append("    wirelessDevicesEnable: ").append(toIndentedString(wirelessDevicesEnable)).append("\n");
        sb.append("    networkDevicesEnable: ").append(toIndentedString(networkDevicesEnable)).append("\n");
        sb.append("    usbSmartCardEnable: ").append(toIndentedString(usbSmartCardEnable)).append("\n");
        sb.append("    otherUsbDevicesEnable: ").append(toIndentedString(otherUsbDevicesEnable)).append("\n");
        sb.append("    usbRedirectionCustomizationPolicy: ")
            .append(toIndentedString(usbRedirectionCustomizationPolicy))
            .append("\n");
        sb.append("    usbRedirectionMode: ").append(toIndentedString(usbRedirectionMode)).append("\n");
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
