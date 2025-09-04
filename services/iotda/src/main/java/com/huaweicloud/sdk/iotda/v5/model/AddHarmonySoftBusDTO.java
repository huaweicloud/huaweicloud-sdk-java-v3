package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建鸿蒙软总线组请求结构体
 */
public class AddHarmonySoftBusDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bus_name")

    private String busName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    public AddHarmonySoftBusDTO withBusName(String busName) {
        this.busName = busName;
        return this;
    }

    /**
     * **参数说明**：鸿蒙软总线组名称，单个资源空间下不可重复。 **取值范围**：长度不超过64，只允许中文、字母、数字、以及_? '#().,&%@!-等字符的组合。
     * @return busName
     */
    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public AddHarmonySoftBusDTO withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数说明**：设备组ID，用于唯一标识一个设备组，在创建设备组时由物联网平台分配。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public AddHarmonySoftBusDTO withAppId(String appId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddHarmonySoftBusDTO that = (AddHarmonySoftBusDTO) obj;
        return Objects.equals(this.busName, that.busName) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.appId, that.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busName, groupId, appId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddHarmonySoftBusDTO {\n");
        sb.append("    busName: ").append(toIndentedString(busName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
