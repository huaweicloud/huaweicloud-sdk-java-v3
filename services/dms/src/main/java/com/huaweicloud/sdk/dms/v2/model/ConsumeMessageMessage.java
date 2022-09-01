package com.huaweicloud.sdk.dms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 消息的内容。
 */
public class ConsumeMessageMessage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private Object body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    @JacksonXmlProperty(localName = "attributes")

    private Object attributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<String> tags = null;

    public ConsumeMessageMessage withBody(Object body) {
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

    public ConsumeMessageMessage withAttributes(Object attributes) {
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

    public ConsumeMessageMessage withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ConsumeMessageMessage addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ConsumeMessageMessage withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签值。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsumeMessageMessage consumeMessageMessage = (ConsumeMessageMessage) o;
        return Objects.equals(this.body, consumeMessageMessage.body)
            && Objects.equals(this.attributes, consumeMessageMessage.attributes)
            && Objects.equals(this.tags, consumeMessageMessage.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, attributes, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumeMessageMessage {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
