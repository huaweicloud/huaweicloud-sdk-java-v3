package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 终端设备属性
 */
public class Devices {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devices")

    @JacksonXmlProperty(localName = "devices")

    private DevicesDevices devices;

    public Devices withDevices(DevicesDevices devices) {
        this.devices = devices;
        return this;
    }

    public Devices withDevices(Consumer<DevicesDevices> devicesSetter) {
        if (this.devices == null) {
            this.devices = new DevicesDevices();
            devicesSetter.accept(this.devices);
        }

        return this;
    }

    /**
     * Get devices
     * @return devices
     */
    public DevicesDevices getDevices() {
        return devices;
    }

    public void setDevices(DevicesDevices devices) {
        this.devices = devices;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Devices devices = (Devices) o;
        return Objects.equals(this.devices, devices.devices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Devices {\n");
        sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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
