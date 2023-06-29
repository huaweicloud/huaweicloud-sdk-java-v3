package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设备影子数据属性结构体。
 */
public class DeviceShadowProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Object properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_time")

    private String eventTime;

    public DeviceShadowProperties withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * 设备影子的属性数据，Json格式，里面是一个个键值对，每个键都是产品模型中属性的参数名(property_name)，目前如样例所示只支持一层结构。 **注意**：JSON结构的key当前不支持特殊字符：点(.)、dollar符号($)、空char(十六进制的ASCII码为00),key为以上特殊字符无法正常刷新设备影子
     * @return properties
     */
    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public DeviceShadowProperties withEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * 事件操作时间，格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return eventTime
     */
    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceShadowProperties that = (DeviceShadowProperties) obj;
        return Objects.equals(this.properties, that.properties) && Objects.equals(this.eventTime, that.eventTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties, eventTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceShadowProperties {\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
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
