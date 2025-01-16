package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MessageTemplate
 */
public class MessageTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_template_id")

    private String messageTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_template_name")

    private String messageTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_names")

    private List<String> tagNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public MessageTemplate withMessageTemplateId(String messageTemplateId) {
        this.messageTemplateId = messageTemplateId;
        return this;
    }

    /**
     * 模板ID。
     * @return messageTemplateId
     */
    public String getMessageTemplateId() {
        return messageTemplateId;
    }

    public void setMessageTemplateId(String messageTemplateId) {
        this.messageTemplateId = messageTemplateId;
    }

    public MessageTemplate withMessageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
        return this;
    }

    /**
     * 模板名称。
     * @return messageTemplateName
     */
    public String getMessageTemplateName() {
        return messageTemplateName;
    }

    public void setMessageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
    }

    public MessageTemplate withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 模板协议类型。  目前支持的协议包括：  “email”：邮件传输协议。  “sms”：短信传输协议。  “functionstage”：FunctionGraph（函数）传输协议。  “http”、“https”：HTTP/HTTPS传输协议。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public MessageTemplate withTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
        return this;
    }

    public MessageTemplate addTagNamesItem(String tagNamesItem) {
        if (this.tagNames == null) {
            this.tagNames = new ArrayList<>();
        }
        this.tagNames.add(tagNamesItem);
        return this;
    }

    public MessageTemplate withTagNames(Consumer<List<String>> tagNamesSetter) {
        if (this.tagNames == null) {
            this.tagNames = new ArrayList<>();
        }
        tagNamesSetter.accept(this.tagNames);
        return this;
    }

    /**
     * 模板tag列表
     * @return tagNames
     */
    public List<String> getTagNames() {
        return tagNames;
    }

    public void setTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
    }

    public MessageTemplate withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 模板创建时间 时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public MessageTemplate withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 模板最后更新时间 时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MessageTemplate that = (MessageTemplate) obj;
        return Objects.equals(this.messageTemplateId, that.messageTemplateId)
            && Objects.equals(this.messageTemplateName, that.messageTemplateName)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.tagNames, that.tagNames)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageTemplateId, messageTemplateName, protocol, tagNames, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageTemplate {\n");
        sb.append("    messageTemplateId: ").append(toIndentedString(messageTemplateId)).append("\n");
        sb.append("    messageTemplateName: ").append(toIndentedString(messageTemplateName)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
