package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeviceBroadcastRequest
 */
public class DeviceBroadcastRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_full_name")

    private String topicFullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl")

    private Integer ttl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_id")

    private String messageId;

    public DeviceBroadcastRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * **参数说明**：资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定广播消息所属的资源空间，否则广播消息将会向[[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)](tag:hws)[[默认资源空间](https://support.huaweicloud.com/intl/zh-cn/usermanual-iothub/iot_01_0006.html#section0)](tag:hws_hk)下订阅指定topic的设备发送。 **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public DeviceBroadcastRequest withTopicFullName(String topicFullName) {
        this.topicFullName = topicFullName;
        return this;
    }

    /**
     * **参数说明**：接收广播消息的完整Topic名称, 必选。用户需要发布广播消息给设备时，可以使用该参数指定完整的topic名称，物联网平台会向指定资源空间下订阅了该topic的所有在线设备发送消息。广播的topic无需控制台创建，但topic的前缀必须为$oc/broadcast/
     * @return topicFullName
     */
    public String getTopicFullName() {
        return topicFullName;
    }

    public void setTopicFullName(String topicFullName) {
        this.topicFullName = topicFullName;
    }

    public DeviceBroadcastRequest withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数说明**：广播消息的内容，用户需要将消息原文使用Base64编码，Base64编码后的长度不超过128KB。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DeviceBroadcastRequest withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * **参数说明**：广播消息在平台缓存的老化时间，时间单位是分钟，默认值为0；ttl参数数值必须是5的倍数，即以5分钟为粒度；指定为0时表示不缓存消息，最大缓存时间1440分钟，即缓存一天；ttl>0时，一个topic订阅设备数限制为10，如果一个topic订阅设备数超过10，则接口返回错误。
     * minimum: 0
     * maximum: 10080
     * @return ttl
     */
    public Integer getTtl() {
        return ttl;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public DeviceBroadcastRequest withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * **参数说明**：消息id，由用户生成（推荐使用UUID）。ttl> 0时，平台会缓存消息，需确保message_id是唯一的， 否则接口返回错误。 **取值范围**：长度不超过100，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return messageId
     */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceBroadcastRequest deviceBroadcastRequest = (DeviceBroadcastRequest) o;
        return Objects.equals(this.appId, deviceBroadcastRequest.appId)
            && Objects.equals(this.topicFullName, deviceBroadcastRequest.topicFullName)
            && Objects.equals(this.message, deviceBroadcastRequest.message)
            && Objects.equals(this.ttl, deviceBroadcastRequest.ttl)
            && Objects.equals(this.messageId, deviceBroadcastRequest.messageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, topicFullName, message, ttl, messageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceBroadcastRequest {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    topicFullName: ").append(toIndentedString(topicFullName)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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
