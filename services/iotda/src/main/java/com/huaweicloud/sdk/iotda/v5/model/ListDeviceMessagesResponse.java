package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListDeviceMessagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "messages")

    private List<DeviceMessage> messages = null;

    public ListDeviceMessagesResponse withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /** 设备ID，用于唯一标识一个设备，在注册设备时由物联网平台分配获得。
     * 
     * @return deviceId */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ListDeviceMessagesResponse withMessages(List<DeviceMessage> messages) {
        this.messages = messages;
        return this;
    }

    public ListDeviceMessagesResponse addMessagesItem(DeviceMessage messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    public ListDeviceMessagesResponse withMessages(Consumer<List<DeviceMessage>> messagesSetter) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        messagesSetter.accept(this.messages);
        return this;
    }

    /** 设备消息列表。
     * 
     * @return messages */
    public List<DeviceMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<DeviceMessage> messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDeviceMessagesResponse listDeviceMessagesResponse = (ListDeviceMessagesResponse) o;
        return Objects.equals(this.deviceId, listDeviceMessagesResponse.deviceId)
            && Objects.equals(this.messages, listDeviceMessagesResponse.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceId, messages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeviceMessagesResponse {\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
