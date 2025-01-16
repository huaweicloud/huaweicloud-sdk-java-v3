package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateMessageTemplateRequestBody
 */
public class CreateMessageTemplateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_template_name")

    private String messageTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    public CreateMessageTemplateRequestBody withMessageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
        return this;
    }

    /**
     * 创建模板的名称。只能包含大写字母、小写字母、数字、-和_，且必须由大写字母、小写字母或数字开头，长度在1到64个字符之间。
     * @return messageTemplateName
     */
    public String getMessageTemplateName() {
        return messageTemplateName;
    }

    public void setMessageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
    }

    public CreateMessageTemplateRequestBody withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 模板支持的协议类型。  目前支持的协议包括：  “default”：默认协议。  “email”：邮件传输协议。  “sms”：短信传输协议。  “functionstage”：FunctionGraph（函数）传输协议。  “http”、“https”：HTTP/HTTPS传输协议。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public CreateMessageTemplateRequestBody withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 模板内容，模板目前仅支持纯文本模式。模板内容不能空，最大支持256KB。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMessageTemplateRequestBody that = (CreateMessageTemplateRequestBody) obj;
        return Objects.equals(this.messageTemplateName, that.messageTemplateName)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageTemplateName, protocol, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageTemplateRequestBody {\n");
        sb.append("    messageTemplateName: ").append(toIndentedString(messageTemplateName)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
