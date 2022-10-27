package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeviceMessageRequest
 */
public class DeviceMessageRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_id")

    private String messageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private Object message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private PropertiesDTO properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding")

    private String encoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payload_format")

    private String payloadFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_full_name")

    private String topicFullName;

    public DeviceMessageRequest withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * **参数说明**：消息id，由用户生成（推荐使用UUID），同一个设备下唯一， 如果用户填写的id在设备下不唯一， 则接口返回错误。 **取值范围**：长度不超过100，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return messageId
     */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public DeviceMessageRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：消息名称。 **取值范围**：长度不超过128，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceMessageRequest withMessage(Object message) {
        this.message = message;
        return this;
    }

    /**
     * **参数说明**：消息内容，支持string和json格式。
     * @return message
     */
    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public DeviceMessageRequest withProperties(PropertiesDTO properties) {
        this.properties = properties;
        return this;
    }

    public DeviceMessageRequest withProperties(Consumer<PropertiesDTO> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new PropertiesDTO();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public PropertiesDTO getProperties() {
        return properties;
    }

    public void setProperties(PropertiesDTO properties) {
        this.properties = properties;
    }

    public DeviceMessageRequest withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * **参数说明**：消息内容编码格式。默认值none。 **取值范围**： - none  - base64：只能通过topic_full_name字段自定义的topic发送消息,否则会发送失败。
     * @return encoding
     */
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public DeviceMessageRequest withPayloadFormat(String payloadFormat) {
        this.payloadFormat = payloadFormat;
        return this;
    }

    /**
     * **参数说明**：有效负载格式，在消息内容编码格式为none时有效。默认值standard（平台封装的标准格式）。 **取值范围**： - standard  - raw：时直接将消息内容作为有效负载下发， 注意： 取值为raw时，只能通过topic_full_name字段自定义的topic发送消息，否则会发送失败。
     * @return payloadFormat
     */
    public String getPayloadFormat() {
        return payloadFormat;
    }

    public void setPayloadFormat(String payloadFormat) {
        this.payloadFormat = payloadFormat;
    }

    public DeviceMessageRequest withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * **参数说明**：消息下行到设备的topic, 可选， 仅适用于MQTT协议接入的设备。 用户只能填写在租户产品界面配置的topic, 否则会校验不通过。 平台给消息topic添加的前缀为$oc/devices/{device_id}/user/， 用户可以在前缀的基础上增加自定义部分， 如增加messageDown，则平台拼接前缀后完整的topic为 $oc/devices/{device_id}/user/messageDown，其中device_id以实际设备的网关id替代。 如果用户指定该topic，消息会通过该topic下行到设备，如果用户不指定， 则消息通过系统默认的topic下行到设备,系统默认的topic格式为： $oc/devices/{device_id}/sys/messages/down。此字段与topic_full_name字段只可填写一个。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public DeviceMessageRequest withTopicFullName(String topicFullName) {
        this.topicFullName = topicFullName;
        return this;
    }

    /**
     * **参数说明**：消息下行到设备的完整topic名称, 可选。用户需要下发用户自定义的topic给设备时，可以使用该参数指定完整的topic名称，物联网平台不校验该topic是否在平台定义，直接透传给设备。设备需要提前订阅该topic。此字段与topic字段只可填写一个。
     * @return topicFullName
     */
    public String getTopicFullName() {
        return topicFullName;
    }

    public void setTopicFullName(String topicFullName) {
        this.topicFullName = topicFullName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceMessageRequest deviceMessageRequest = (DeviceMessageRequest) o;
        return Objects.equals(this.messageId, deviceMessageRequest.messageId)
            && Objects.equals(this.name, deviceMessageRequest.name)
            && Objects.equals(this.message, deviceMessageRequest.message)
            && Objects.equals(this.properties, deviceMessageRequest.properties)
            && Objects.equals(this.encoding, deviceMessageRequest.encoding)
            && Objects.equals(this.payloadFormat, deviceMessageRequest.payloadFormat)
            && Objects.equals(this.topic, deviceMessageRequest.topic)
            && Objects.equals(this.topicFullName, deviceMessageRequest.topicFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, name, message, properties, encoding, payloadFormat, topic, topicFullName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceMessageRequest {\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
        sb.append("    payloadFormat: ").append(toIndentedString(payloadFormat)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    topicFullName: ").append(toIndentedString(topicFullName)).append("\n");
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
