package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Content
 */
public class Content {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    @JacksonXmlProperty(localName = "content_type")

    private Integer contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    @JacksonXmlProperty(localName = "content")

    private ContentInfo content;

    public Content withContentType(Integer contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * content_type
     * minimum: 0
     * maximum: 2147483647
     * @return contentType
     */
    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public Content withContent(ContentInfo content) {
        this.content = content;
        return this;
    }

    public Content withContent(Consumer<ContentInfo> contentSetter) {
        if (this.content == null) {
            this.content = new ContentInfo();
            contentSetter.accept(this.content);
        }

        return this;
    }

    /**
     * Get content
     * @return content
     */
    public ContentInfo getContent() {
        return content;
    }

    public void setContent(ContentInfo content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Content content = (Content) o;
        return Objects.equals(this.contentType, content.contentType) && Objects.equals(this.content, content.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Content {\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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
