package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PublishMessageRequestBody
 */
public class PublishMessageRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_structure")

    private String messageStructure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_template_name")

    private String messageTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_to_live")

    private String timeToLive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_attributes")

    private List<MessageAttribute> messageAttributes = null;

    public PublishMessageRequestBody withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 消息标题，给邮箱订阅者发送邮件时作为邮件主题，长度不能超过512个字节。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public PublishMessageRequestBody withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 发送的消息。消息体必须是UTF-8编码的字符串，大小至多256KB。如果订阅者是手机号码，长度不超过490个字符，超出部分系统自动截断。短信内容不能包含“[]”或者“【】”符号。  对于移动推送订阅者推送消息，message消息必须符合移动推送平台的消息格式，消息格式请参见application消息体格式。否则移动app无法收到消息，目前支持的平台有HMS、APNS、APNS_SANDBOX。 说明： 三种消息发送方式  message  message_structure  message_template_name  至少设置其中一个，如果同时设置，生效的优先级为 message_structure > message_template_name > message。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PublishMessageRequestBody withMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
        return this;
    }

    /**
     * Json格式的字符串。支持“email”、“sms”、 “http”、“https”、“dms”、“functiongraph”、“functionstage”、“HMS”、“APNS”、“APNS_SANDBOX”、 \"dingding\", \"wechat\",”feishu“, \"welink\"。其中，“HMS”、“APNS”以及“APNS_SANDBOX”三种消息的格式请参见application消息体格式。必须设置默认的消息“default”，当匹配不到消息协议时，按“default”中的内容发送。其中，钉钉、微信、飞书、welink协议类型的消息需指定msgType字段；钉钉，微信和飞书机器人协议支持msgType为text（纯文本）和markdown（MD）格式消息，welink和红版welink机器人类型暂仅支持msgType为text的纯文本消息。  说明： 三种消息发送方式  message  message_structure  message_template_name  至少设置其中一个，如果同时设置，生效的优先级为 message_structure > message_template_name > message。  华为透传消息  {   \"hps\": {     \"msg\": {       \"type\": 1,       \"body\": {         \"key\": \"value\"       }     }   } }  华为系统通知栏消息  {   \"hps\": {     \"msg\": {       \"type\": 3,       \"body\": {         \"content\": \"Push message content\",         \"title\": \"Push message content\"       },       \"action\": {         \"type\": 1,         \"param\": {           \"intent\": \"#Intent;compo=com.rvr/.Activity;S.W=U;end\"         }       }     },     \"ext\": {       \"biTag\": \"Trump\",       \"icon\": \"http://upload.w.org/00/150pxsvg.png\"     }   } }  苹果平台消息格式  {   \"aps\": {     \"alert\": \"hello world\"   } }
     * @return messageStructure
     */
    public String getMessageStructure() {
        return messageStructure;
    }

    public void setMessageStructure(String messageStructure) {
        this.messageStructure = messageStructure;
    }

    public PublishMessageRequestBody withMessageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
        return this;
    }

    /**
     * 消息模板名称，可通过[查询消息模板列表](ListMessageTemplates.xml)获取名称。  说明： 三种消息发送方式:  message  message_structure  message_template_name  至少设置其中一个，如果同时设置，生效的优先级为 message_structure > message_template_name > message。
     * @return messageTemplateName
     */
    public String getMessageTemplateName() {
        return messageTemplateName;
    }

    public void setMessageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
    }

    public PublishMessageRequestBody withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public PublishMessageRequestBody putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public PublishMessageRequestBody withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * tag以及替换tag的参数组成的字典。消息模板中的标签对应的值。使用消息模板方式的消息发布必须携带该参数。字典中的key为消息模板中的参数名称，不超过21个字符。字典中的value为消息模板中的参数被替换后的值，不超过1KB。
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public PublishMessageRequestBody withTimeToLive(String timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * 指消息在SMN系统内部的最长存留时间。超过该存留时间，系统将不再发送该消息。单位是s，变量默认值是3600s，即一小时。值为正整数且小于等于3600*24。
     * @return timeToLive
     */
    public String getTimeToLive() {
        return timeToLive;
    }

    public void setTimeToLive(String timeToLive) {
        this.timeToLive = timeToLive;
    }

    public PublishMessageRequestBody withMessageAttributes(List<MessageAttribute> messageAttributes) {
        this.messageAttributes = messageAttributes;
        return this;
    }

    public PublishMessageRequestBody addMessageAttributesItem(MessageAttribute messageAttributesItem) {
        if (this.messageAttributes == null) {
            this.messageAttributes = new ArrayList<>();
        }
        this.messageAttributes.add(messageAttributesItem);
        return this;
    }

    public PublishMessageRequestBody withMessageAttributes(Consumer<List<MessageAttribute>> messageAttributesSetter) {
        if (this.messageAttributes == null) {
            this.messageAttributes = new ArrayList<>();
        }
        messageAttributesSetter.accept(this.messageAttributes);
        return this;
    }

    /**
     * 消息属性列表
     * @return messageAttributes
     */
    public List<MessageAttribute> getMessageAttributes() {
        return messageAttributes;
    }

    public void setMessageAttributes(List<MessageAttribute> messageAttributes) {
        this.messageAttributes = messageAttributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublishMessageRequestBody that = (PublishMessageRequestBody) obj;
        return Objects.equals(this.subject, that.subject) && Objects.equals(this.message, that.message)
            && Objects.equals(this.messageStructure, that.messageStructure)
            && Objects.equals(this.messageTemplateName, that.messageTemplateName)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.timeToLive, that.timeToLive)
            && Objects.equals(this.messageAttributes, that.messageAttributes);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(subject, message, messageStructure, messageTemplateName, tags, timeToLive, messageAttributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishMessageRequestBody {\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    messageStructure: ").append(toIndentedString(messageStructure)).append("\n");
        sb.append("    messageTemplateName: ").append(toIndentedString(messageTemplateName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    timeToLive: ").append(toIndentedString(timeToLive)).append("\n");
        sb.append("    messageAttributes: ").append(toIndentedString(messageAttributes)).append("\n");
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
