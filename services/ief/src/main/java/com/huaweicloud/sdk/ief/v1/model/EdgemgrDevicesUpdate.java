package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 终端设备属性 */
public class EdgemgrDevicesUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private EdgemgrDevicesPara device;

    public EdgemgrDevicesUpdate withDevice(EdgemgrDevicesPara device) {
        this.device = device;
        return this;
    }

    public EdgemgrDevicesUpdate withDevice(Consumer<EdgemgrDevicesPara> deviceSetter) {
        if (this.device == null) {
            this.device = new EdgemgrDevicesPara();
            deviceSetter.accept(this.device);
        }

        return this;
    }

    /** Get device
     * 
     * @return device */
    public EdgemgrDevicesPara getDevice() {
        return device;
    }

    public void setDevice(EdgemgrDevicesPara device) {
        this.device = device;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgemgrDevicesUpdate edgemgrDevicesUpdate = (EdgemgrDevicesUpdate) o;
        return Objects.equals(this.device, edgemgrDevicesUpdate.device);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgemgrDevicesUpdate {\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
