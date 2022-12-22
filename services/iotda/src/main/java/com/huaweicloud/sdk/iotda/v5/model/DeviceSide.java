package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 端侧设备信息
 */
public class DeviceSide {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_ids")

    private List<String> deviceIds = null;

    public DeviceSide withDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }

    public DeviceSide addDeviceIdsItem(String deviceIdsItem) {
        if (this.deviceIds == null) {
            this.deviceIds = new ArrayList<>();
        }
        this.deviceIds.add(deviceIdsItem);
        return this;
    }

    public DeviceSide withDeviceIds(Consumer<List<String>> deviceIdsSetter) {
        if (this.deviceIds == null) {
            this.deviceIds = new ArrayList<>();
        }
        deviceIdsSetter.accept(this.deviceIds);
        return this;
    }

    /**
     * **参数说明**：端侧执行下发的目标设备ID列表。设备ID，用于唯一标识一个设备，在注册设备时由物联网平台分配获得。
     * @return deviceIds
     */
    public List<String> getDeviceIds() {
        return deviceIds;
    }

    public void setDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceSide deviceSide = (DeviceSide) o;
        return Objects.equals(this.deviceIds, deviceSide.deviceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceSide {\n");
        sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
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
