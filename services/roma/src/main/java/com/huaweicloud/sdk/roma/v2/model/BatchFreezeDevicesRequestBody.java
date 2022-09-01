package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchFreezeDevicesRequestBody
 */
public class BatchFreezeDevicesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_ids")

    @JacksonXmlProperty(localName = "device_ids")

    private List<Integer> deviceIds = null;

    public BatchFreezeDevicesRequestBody withDeviceIds(List<Integer> deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }

    public BatchFreezeDevicesRequestBody addDeviceIdsItem(Integer deviceIdsItem) {
        if (this.deviceIds == null) {
            this.deviceIds = new ArrayList<>();
        }
        this.deviceIds.add(deviceIdsItem);
        return this;
    }

    public BatchFreezeDevicesRequestBody withDeviceIds(Consumer<List<Integer>> deviceIdsSetter) {
        if (this.deviceIds == null) {
            this.deviceIds = new ArrayList<>();
        }
        deviceIdsSetter.accept(this.deviceIds);
        return this;
    }

    /**
     * 设备ID列表，自动向下取整
     * @return deviceIds
     */
    public List<Integer> getDeviceIds() {
        return deviceIds;
    }

    public void setDeviceIds(List<Integer> deviceIds) {
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
        BatchFreezeDevicesRequestBody batchFreezeDevicesRequestBody = (BatchFreezeDevicesRequestBody) o;
        return Objects.equals(this.deviceIds, batchFreezeDevicesRequestBody.deviceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchFreezeDevicesRequestBody {\n");
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
