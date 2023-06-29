package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 外设。
 */
public class PoliciesPeripherals {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_port_redirection")

    private PoliciesPeripheralsUsbPortRedirection usbPortRedirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_redirection")

    private PoliciesPeripheralsDeviceRedirection deviceRedirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_device_common")

    private PoliciesPeripheralsUsbDeviceCommon usbDeviceCommon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_port_redirection")

    private PoliciesPeripheralsSerialPortRedirection serialPortRedirection;

    public PoliciesPeripherals withUsbPortRedirection(PoliciesPeripheralsUsbPortRedirection usbPortRedirection) {
        this.usbPortRedirection = usbPortRedirection;
        return this;
    }

    public PoliciesPeripherals withUsbPortRedirection(
        Consumer<PoliciesPeripheralsUsbPortRedirection> usbPortRedirectionSetter) {
        if (this.usbPortRedirection == null) {
            this.usbPortRedirection = new PoliciesPeripheralsUsbPortRedirection();
            usbPortRedirectionSetter.accept(this.usbPortRedirection);
        }

        return this;
    }

    /**
     * Get usbPortRedirection
     * @return usbPortRedirection
     */
    public PoliciesPeripheralsUsbPortRedirection getUsbPortRedirection() {
        return usbPortRedirection;
    }

    public void setUsbPortRedirection(PoliciesPeripheralsUsbPortRedirection usbPortRedirection) {
        this.usbPortRedirection = usbPortRedirection;
    }

    public PoliciesPeripherals withDeviceRedirection(PoliciesPeripheralsDeviceRedirection deviceRedirection) {
        this.deviceRedirection = deviceRedirection;
        return this;
    }

    public PoliciesPeripherals withDeviceRedirection(
        Consumer<PoliciesPeripheralsDeviceRedirection> deviceRedirectionSetter) {
        if (this.deviceRedirection == null) {
            this.deviceRedirection = new PoliciesPeripheralsDeviceRedirection();
            deviceRedirectionSetter.accept(this.deviceRedirection);
        }

        return this;
    }

    /**
     * Get deviceRedirection
     * @return deviceRedirection
     */
    public PoliciesPeripheralsDeviceRedirection getDeviceRedirection() {
        return deviceRedirection;
    }

    public void setDeviceRedirection(PoliciesPeripheralsDeviceRedirection deviceRedirection) {
        this.deviceRedirection = deviceRedirection;
    }

    public PoliciesPeripherals withUsbDeviceCommon(PoliciesPeripheralsUsbDeviceCommon usbDeviceCommon) {
        this.usbDeviceCommon = usbDeviceCommon;
        return this;
    }

    public PoliciesPeripherals withUsbDeviceCommon(Consumer<PoliciesPeripheralsUsbDeviceCommon> usbDeviceCommonSetter) {
        if (this.usbDeviceCommon == null) {
            this.usbDeviceCommon = new PoliciesPeripheralsUsbDeviceCommon();
            usbDeviceCommonSetter.accept(this.usbDeviceCommon);
        }

        return this;
    }

    /**
     * Get usbDeviceCommon
     * @return usbDeviceCommon
     */
    public PoliciesPeripheralsUsbDeviceCommon getUsbDeviceCommon() {
        return usbDeviceCommon;
    }

    public void setUsbDeviceCommon(PoliciesPeripheralsUsbDeviceCommon usbDeviceCommon) {
        this.usbDeviceCommon = usbDeviceCommon;
    }

    public PoliciesPeripherals withSerialPortRedirection(
        PoliciesPeripheralsSerialPortRedirection serialPortRedirection) {
        this.serialPortRedirection = serialPortRedirection;
        return this;
    }

    public PoliciesPeripherals withSerialPortRedirection(
        Consumer<PoliciesPeripheralsSerialPortRedirection> serialPortRedirectionSetter) {
        if (this.serialPortRedirection == null) {
            this.serialPortRedirection = new PoliciesPeripheralsSerialPortRedirection();
            serialPortRedirectionSetter.accept(this.serialPortRedirection);
        }

        return this;
    }

    /**
     * Get serialPortRedirection
     * @return serialPortRedirection
     */
    public PoliciesPeripheralsSerialPortRedirection getSerialPortRedirection() {
        return serialPortRedirection;
    }

    public void setSerialPortRedirection(PoliciesPeripheralsSerialPortRedirection serialPortRedirection) {
        this.serialPortRedirection = serialPortRedirection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripherals that = (PoliciesPeripherals) obj;
        return Objects.equals(this.usbPortRedirection, that.usbPortRedirection)
            && Objects.equals(this.deviceRedirection, that.deviceRedirection)
            && Objects.equals(this.usbDeviceCommon, that.usbDeviceCommon)
            && Objects.equals(this.serialPortRedirection, that.serialPortRedirection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usbPortRedirection, deviceRedirection, usbDeviceCommon, serialPortRedirection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripherals {\n");
        sb.append("    usbPortRedirection: ").append(toIndentedString(usbPortRedirection)).append("\n");
        sb.append("    deviceRedirection: ").append(toIndentedString(deviceRedirection)).append("\n");
        sb.append("    usbDeviceCommon: ").append(toIndentedString(usbDeviceCommon)).append("\n");
        sb.append("    serialPortRedirection: ").append(toIndentedString(serialPortRedirection)).append("\n");
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
