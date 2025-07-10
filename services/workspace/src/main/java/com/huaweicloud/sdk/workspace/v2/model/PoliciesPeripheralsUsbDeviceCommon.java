package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * USB和设备智能卡控制选项。
 */
public class PoliciesPeripheralsUsbDeviceCommon {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcsc_smart_card_enable")

    private String pcscSmartCardEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_options")

    private PoliciesPeripheralsUsbDeviceCommonCommonOptions commonOptions;

    public PoliciesPeripheralsUsbDeviceCommon withPcscSmartCardEnable(String pcscSmartCardEnable) {
        this.pcscSmartCardEnable = pcscSmartCardEnable;
        return this;
    }

    /**
     * 是否开启PC/SC智能卡重定向。取值为： Enable：表示已启动。 Closed：表示已关闭。 Disable：表示已禁用。
     * @return pcscSmartCardEnable
     */
    public String getPcscSmartCardEnable() {
        return pcscSmartCardEnable;
    }

    public void setPcscSmartCardEnable(String pcscSmartCardEnable) {
        this.pcscSmartCardEnable = pcscSmartCardEnable;
    }

    public PoliciesPeripheralsUsbDeviceCommon withCommonOptions(
        PoliciesPeripheralsUsbDeviceCommonCommonOptions commonOptions) {
        this.commonOptions = commonOptions;
        return this;
    }

    public PoliciesPeripheralsUsbDeviceCommon withCommonOptions(
        Consumer<PoliciesPeripheralsUsbDeviceCommonCommonOptions> commonOptionsSetter) {
        if (this.commonOptions == null) {
            this.commonOptions = new PoliciesPeripheralsUsbDeviceCommonCommonOptions();
            commonOptionsSetter.accept(this.commonOptions);
        }

        return this;
    }

    /**
     * Get commonOptions
     * @return commonOptions
     */
    public PoliciesPeripheralsUsbDeviceCommonCommonOptions getCommonOptions() {
        return commonOptions;
    }

    public void setCommonOptions(PoliciesPeripheralsUsbDeviceCommonCommonOptions commonOptions) {
        this.commonOptions = commonOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripheralsUsbDeviceCommon that = (PoliciesPeripheralsUsbDeviceCommon) obj;
        return Objects.equals(this.pcscSmartCardEnable, that.pcscSmartCardEnable)
            && Objects.equals(this.commonOptions, that.commonOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pcscSmartCardEnable, commonOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsUsbDeviceCommon {\n");
        sb.append("    pcscSmartCardEnable: ").append(toIndentedString(pcscSmartCardEnable)).append("\n");
        sb.append("    commonOptions: ").append(toIndentedString(commonOptions)).append("\n");
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
