package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowHarmonySoftBusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bus_id")

    private String busId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bus_name")

    private String busName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ShowHarmonySoftBusResponse withBusId(String busId) {
        this.busId = busId;
        return this;
    }

    /**
     * 鸿蒙软总线ID，用于唯一标识一个鸿蒙软总线，在创建鸿蒙软总线时由物联网平台分配。
     * @return busId
     */
    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public ShowHarmonySoftBusResponse withBusName(String busName) {
        this.busName = busName;
        return this;
    }

    /**
     * 鸿蒙软总线名称，单个资源空间下不可重复。
     * @return busName
     */
    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public ShowHarmonySoftBusResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 设备组ID。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowHarmonySoftBusResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * **参数说明**：资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定创建的设备组归属到哪个资源空间下，否则创建的设备组将会归属到[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)下。 **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowHarmonySoftBusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 鸿蒙软总线组信息同步状态，结果范围：Synchronized，Synchronizing，ToBeSynchronized - Synchronized：已同步。 - Synchronizing：同步中。 - ToBeSynchronized：待同步。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHarmonySoftBusResponse that = (ShowHarmonySoftBusResponse) obj;
        return Objects.equals(this.busId, that.busId) && Objects.equals(this.busName, that.busName)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busId, busName, groupId, appId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHarmonySoftBusResponse {\n");
        sb.append("    busId: ").append(toIndentedString(busId)).append("\n");
        sb.append("    busName: ").append(toIndentedString(busName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
