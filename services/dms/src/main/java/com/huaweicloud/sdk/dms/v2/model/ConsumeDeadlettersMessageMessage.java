package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 消息的内容。
 */
public class ConsumeDeadlettersMessageMessage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private Object body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    @JacksonXmlProperty(localName = "attributes")

    private Object attributes;

    public ConsumeDeadlettersMessageMessage withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * 消息体的内容。
     * @return body
     */
    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public ConsumeDeadlettersMessageMessage withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * 属性的列表。
     * @return attributes
     */
    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsumeDeadlettersMessageMessage consumeDeadlettersMessageMessage = (ConsumeDeadlettersMessageMessage) o;
        return Objects.equals(this.body, consumeDeadlettersMessageMessage.body)
            && Objects.equals(this.attributes, consumeDeadlettersMessageMessage.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumeDeadlettersMessageMessage {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
