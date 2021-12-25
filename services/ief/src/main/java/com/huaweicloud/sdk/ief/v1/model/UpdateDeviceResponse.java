package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class UpdateDeviceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private Device device;

    public UpdateDeviceResponse withDevice(Device device) {
        this.device = device;
        return this;
    }

    public UpdateDeviceResponse withDevice(Consumer<Device> deviceSetter) {
        if (this.device == null) {
            this.device = new Device();
            deviceSetter.accept(this.device);
        }

        return this;
    }

    /** Get device
     * 
     * @return device */
    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
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
        UpdateDeviceResponse updateDeviceResponse = (UpdateDeviceResponse) o;
        return Objects.equals(this.device, updateDeviceResponse.device);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeviceResponse {\n");
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
