package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设备控制默认值请求结构体
 */
public class DeviceControlDefaultValuesReqDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "devices")

    private List<DeviceDefaultValues> devices = null;

    public DeviceControlDefaultValuesReqDTO withDevices(List<DeviceDefaultValues> devices) {
        this.devices = devices;
        return this;
    }

    public DeviceControlDefaultValuesReqDTO addDevicesItem(DeviceDefaultValues devicesItem) {
        if (this.devices == null) {
            this.devices = new ArrayList<>();
        }
        this.devices.add(devicesItem);
        return this;
    }

    public DeviceControlDefaultValuesReqDTO withDevices(Consumer<List<DeviceDefaultValues>> devicesSetter) {
        if (this.devices == null) {
            this.devices = new ArrayList<>();
        }
        devicesSetter.accept(this.devices);
        return this;
    }

    /**
     * 设备默认值数组
     * @return devices
     */
    public List<DeviceDefaultValues> getDevices() {
        return devices;
    }

    public void setDevices(List<DeviceDefaultValues> devices) {
        this.devices = devices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceControlDefaultValuesReqDTO that = (DeviceControlDefaultValuesReqDTO) obj;
        return Objects.equals(this.devices, that.devices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceControlDefaultValuesReqDTO {\n");
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
