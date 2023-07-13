package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeviceMessage
 */
public class DeviceMessage {

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
    @JsonProperty(value = "encoding")

    private String encoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payload_format")

    private String payloadFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private PropertiesDTO properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private ErrorInfoDTO errorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_time")

    private String finishedTime;

    public DeviceMessage withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * 设备消息ID，用于唯一标识一条消息，在下发设备消息时由物联网平台分配获得。
     * @return messageId
     */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public DeviceMessage withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 消息名称,在下发消息时由用户指定。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceMessage withMessage(Object message) {
        this.message = message;
        return this;
    }

    /**
     * 消息内容。
     * @return message
     */
    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public DeviceMessage withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * 消息内容编码格式，取值范围none|base64,默认值none, base64格式仅支持透传。
     * @return encoding
     */
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public DeviceMessage withPayloadFormat(String payloadFormat) {
        this.payloadFormat = payloadFormat;
        return this;
    }

    /**
     * 有效负载格式，在消息内容编码格式为none时有效，取值范围standard|raw，默认值standard（平台封装的标准格式），取值为raw时直接将消息内容作为有效负载下发。
     * @return payloadFormat
     */
    public String getPayloadFormat() {
        return payloadFormat;
    }

    public void setPayloadFormat(String payloadFormat) {
        this.payloadFormat = payloadFormat;
    }

    public DeviceMessage withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 消息topic
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public DeviceMessage withProperties(PropertiesDTO properties) {
        this.properties = properties;
        return this;
    }

    public DeviceMessage withProperties(Consumer<PropertiesDTO> propertiesSetter) {
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

    public DeviceMessage withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 消息状态，包含PENDING，DELIVERED，FAILED和TIMEOUT，PENDING指设备不在线，消息被缓存起来，等设备上线之后下发； DELIVERED指消息发送成功；FAILED消息发送失败；TIMEOUT指消息在平台默认时间内（1天）还没有下发送给设备，则平台会将消息设置为超时，状态为TIMEOUT。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeviceMessage withErrorInfo(ErrorInfoDTO errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public DeviceMessage withErrorInfo(Consumer<ErrorInfoDTO> errorInfoSetter) {
        if (this.errorInfo == null) {
            this.errorInfo = new ErrorInfoDTO();
            errorInfoSetter.accept(this.errorInfo);
        }

        return this;
    }

    /**
     * Get errorInfo
     * @return errorInfo
     */
    public ErrorInfoDTO getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfoDTO errorInfo) {
        this.errorInfo = errorInfo;
    }

    public DeviceMessage withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 消息的创建时间，\"yyyyMMdd'T'HHmmss'Z'\"格式的UTC字符串。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public DeviceMessage withFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }

    /**
     * 消息结束时间, \"yyyyMMdd'T'HHmmss'Z'\"格式的UTC字符串，包含消息转换到DELIVERED和TIMEOUT两个状态的时间。
     * @return finishedTime
     */
    public String getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceMessage that = (DeviceMessage) obj;
        return Objects.equals(this.messageId, that.messageId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.message, that.message) && Objects.equals(this.encoding, that.encoding)
            && Objects.equals(this.payloadFormat, that.payloadFormat) && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.properties, that.properties) && Objects.equals(this.status, that.status)
            && Objects.equals(this.errorInfo, that.errorInfo) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.finishedTime, that.finishedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId,
            name,
            message,
            encoding,
            payloadFormat,
            topic,
            properties,
            status,
            errorInfo,
            createdTime,
            finishedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceMessage {\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
        sb.append("    payloadFormat: ").append(toIndentedString(payloadFormat)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    finishedTime: ").append(toIndentedString(finishedTime)).append("\n");
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
