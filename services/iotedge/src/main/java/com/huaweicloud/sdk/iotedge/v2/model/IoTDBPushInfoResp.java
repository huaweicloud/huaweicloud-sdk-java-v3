package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * IoTDB推送信息详情
 */
public class IoTDBPushInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_data")

    private DeviceIoTDBPushInfoDetail deviceData;

    public IoTDBPushInfoResp withDeviceData(DeviceIoTDBPushInfoDetail deviceData) {
        this.deviceData = deviceData;
        return this;
    }

    public IoTDBPushInfoResp withDeviceData(Consumer<DeviceIoTDBPushInfoDetail> deviceDataSetter) {
        if (this.deviceData == null) {
            this.deviceData = new DeviceIoTDBPushInfoDetail();
            deviceDataSetter.accept(this.deviceData);
        }

        return this;
    }

    /**
     * Get deviceData
     * @return deviceData
     */
    public DeviceIoTDBPushInfoDetail getDeviceData() {
        return deviceData;
    }

    public void setDeviceData(DeviceIoTDBPushInfoDetail deviceData) {
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
        IoTDBPushInfoResp that = (IoTDBPushInfoResp) obj;
        return Objects.equals(this.deviceData, that.deviceData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IoTDBPushInfoResp {\n");
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
