package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListMessageTemplateDetailsResponse extends SdkResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListMessageTemplateDetailsResponse withMessageTemplateId(String messageTemplateId) {
        this.messageTemplateId = messageTemplateId;
        return this;
    }

    /** 模板ID。
     * 
     * @return messageTemplateId */
    public String getMessageTemplateId() {
        return messageTemplateId;
    }

    public void setMessageTemplateId(String messageTemplateId) {
        this.messageTemplateId = messageTemplateId;
    }

    public ListMessageTemplateDetailsResponse withMessageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
        return this;
    }

    /** 模板名称。
     * 
     * @return messageTemplateName */
    public String getMessageTemplateName() {
        return messageTemplateName;
    }

    public void setMessageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
    }

    public ListMessageTemplateDetailsResponse withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /** 模板支持的协议类型。 目前支持的协议包括： “default”：默认协议。 “email”：邮件传输协议。 “sms”：短信传输协议。 “functionstage”：FunctionGraph（函数）传输协议。
     * “dms”：DMS传输协议。 “http”、“https”：HTTP/HTTPS传输协议。
     * 
     * @return protocol */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public ListMessageTemplateDetailsResponse withTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
        return this;
    }

    public ListMessageTemplateDetailsResponse addTagNamesItem(String tagNamesItem) {
        if (this.tagNames == null) {
            this.tagNames = new ArrayList<>();
        }
        this.tagNames.add(tagNamesItem);
        return this;
    }

    public ListMessageTemplateDetailsResponse withTagNames(Consumer<List<String>> tagNamesSetter) {
        if (this.tagNames == null) {
            this.tagNames = new ArrayList<>();
        }
        tagNamesSetter.accept(this.tagNames);
        return this;
    }

    /** 模板tag列表。 是消息模板“{}”内的字段，在具体使用消息模板时，可根据实际情况替为该字段赋值。
     * 
     * @return tagNames */
    public List<String> getTagNames() {
        return tagNames;
    }

    public void setTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
    }

    public ListMessageTemplateDetailsResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 模板创建时间。 时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ListMessageTemplateDetailsResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** 模板最后更新时间。时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * 
     * @return updateTime */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ListMessageTemplateDetailsResponse withContent(String content) {
        this.content = content;
        return this;
    }

    /** 模板内容。
     * 
     * @return content */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ListMessageTemplateDetailsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /** 请求的唯一标识ID。
     * 
     * @return requestId */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMessageTemplateDetailsResponse listMessageTemplateDetailsResponse = (ListMessageTemplateDetailsResponse) o;
        return Objects.equals(this.messageTemplateId, listMessageTemplateDetailsResponse.messageTemplateId)
            && Objects.equals(this.messageTemplateName, listMessageTemplateDetailsResponse.messageTemplateName)
            && Objects.equals(this.protocol, listMessageTemplateDetailsResponse.protocol)
            && Objects.equals(this.tagNames, listMessageTemplateDetailsResponse.tagNames)
            && Objects.equals(this.createTime, listMessageTemplateDetailsResponse.createTime)
            && Objects.equals(this.updateTime, listMessageTemplateDetailsResponse.updateTime)
            && Objects.equals(this.content, listMessageTemplateDetailsResponse.content)
            && Objects.equals(this.requestId, listMessageTemplateDetailsResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageTemplateId,
            messageTemplateName,
            protocol,
            tagNames,
            createTime,
            updateTime,
            content,
            requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMessageTemplateDetailsResponse {\n");
        sb.append("    messageTemplateId: ").append(toIndentedString(messageTemplateId)).append("\n");
        sb.append("    messageTemplateName: ").append(toIndentedString(messageTemplateName)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    tagNames: ").append(toIndentedString(tagNames)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
