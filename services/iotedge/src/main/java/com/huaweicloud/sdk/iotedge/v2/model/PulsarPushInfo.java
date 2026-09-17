package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建Pulsar推送信息
 */
public class PulsarPushInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_data")

    private DevicePulsarPushInfo deviceData;

    public PulsarPushInfo withDeviceData(DevicePulsarPushInfo deviceData) {
        this.deviceData = deviceData;
        return this;
    }

    public PulsarPushInfo withDeviceData(Consumer<DevicePulsarPushInfo> deviceDataSetter) {
        if (this.deviceData == null) {
            this.deviceData = new DevicePulsarPushInfo();
            deviceDataSetter.accept(this.deviceData);
        }

        return this;
    }

    /**
     * Get deviceData
     * @return deviceData
     */
    public DevicePulsarPushInfo getDeviceData() {
        return deviceData;
    }

    public void setDeviceData(DevicePulsarPushInfo deviceData) {
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
        PulsarPushInfo that = (PulsarPushInfo) obj;
        return Objects.equals(this.deviceData, that.deviceData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PulsarPushInfo {\n");
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
