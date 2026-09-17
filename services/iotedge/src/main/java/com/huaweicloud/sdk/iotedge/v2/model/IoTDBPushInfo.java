package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建IoTDB推送信息
 */
public class IoTDBPushInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_data")

    private DeviceIoTDBPushInfo deviceData;

    public IoTDBPushInfo withDeviceData(DeviceIoTDBPushInfo deviceData) {
        this.deviceData = deviceData;
        return this;
    }

    public IoTDBPushInfo withDeviceData(Consumer<DeviceIoTDBPushInfo> deviceDataSetter) {
        if (this.deviceData == null) {
            this.deviceData = new DeviceIoTDBPushInfo();
            deviceDataSetter.accept(this.deviceData);
        }

        return this;
    }

    /**
     * Get deviceData
     * @return deviceData
     */
    public DeviceIoTDBPushInfo getDeviceData() {
        return deviceData;
    }

    public void setDeviceData(DeviceIoTDBPushInfo deviceData) {
        this.deviceData = deviceData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IoTDBPushInfo that = (IoTDBPushInfo) obj;
        return Objects.equals(this.deviceData, that.deviceData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IoTDBPushInfo {\n");
        sb.append("    deviceData: ").append(toIndentedString(deviceData)).append("\n");
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
