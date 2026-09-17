package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建设备数据推送IoTDB
 */
public class DeviceIoTDBNodeChannelPushInfoDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_group")

    private String storageGroup;

    public DeviceIoTDBNodeChannelPushInfoDetail withStorageGroup(String storageGroup) {
        this.storageGroup = storageGroup;
        return this;
    }

    /**
     * 数据存储的存储组
     * @return storageGroup
     */
    public String getStorageGroup() {
        return storageGroup;
    }

    public void setStorageGroup(String storageGroup) {
        this.storageGroup = storageGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceIoTDBNodeChannelPushInfoDetail that = (DeviceIoTDBNodeChannelPushInfoDetail) obj;
        return Objects.equals(this.storageGroup, that.storageGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceIoTDBNodeChannelPushInfoDetail {\n");
        sb.append("    storageGroup: ").append(toIndentedString(storageGroup)).append("\n");
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
