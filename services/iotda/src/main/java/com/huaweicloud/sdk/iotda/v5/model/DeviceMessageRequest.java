package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DeviceMessageRequest
 */
public class DeviceMessageRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message_id")
    
    private String messageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private String message;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic")
    
    private String topic;

    public DeviceMessageRequest withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    


    /**
     * 消息id，由用户生成（推荐使用UUID），同一个设备下唯一， 如果用户填写的id在设备下不唯一， 则接口返回错误。
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
     * 消息名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeviceMessageRequest withMessage(String message) {
        this.message = message;
        return this;
    }

    


    /**
     * 设备执行的消息，字符串，具体格式需要应用和设备约定。 
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DeviceMessageRequest withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    


    /**
     * 消息下行到设备的topic, 可选， 仅适用于MQTT协议接入的设备。 用户只能填写在租户产品界面配置的topic, 否则会校验不通过。 平台给消息topic添加的前缀为$oc/devices/{device_id}/user/， 用户可以在前缀的基础上增加自定义部分， 如增加messageDown，则平台拼接前缀后完整的topic为 $oc/devices/{device_id}/user/messageDown，其中device_id以实际设备的网关id替代。 如果用户指定该topic，消息会通过该topic下行到设备，如果用户不指定， 则消息通过系统默认的topic下行到设备,系统默认的topic格式为： $oc/devices/{device_id}/sys/messages/down。 
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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
        return Objects.equals(this.messageId, deviceMessageRequest.messageId) &&
            Objects.equals(this.name, deviceMessageRequest.name) &&
            Objects.equals(this.message, deviceMessageRequest.message) &&
            Objects.equals(this.topic, deviceMessageRequest.topic);
    }
    @Override
    public int hashCode() {
        return Objects.hash(messageId, name, message, topic);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceMessageRequest {\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
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

