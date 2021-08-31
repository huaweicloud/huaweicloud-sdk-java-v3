package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** ShowTaskResqTaskinfoContent1 */
public class ShowTaskResqTaskinfoContent1 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    private Integer contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private ShowTaskResqTaskinfoContent content;

    public ShowTaskResqTaskinfoContent1 withContentType(Integer contentType) {
        this.contentType = contentType;
        return this;
    }

    /** content_type
     * 
     * @return contentType */
    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public ShowTaskResqTaskinfoContent1 withContent(ShowTaskResqTaskinfoContent content) {
        this.content = content;
        return this;
    }

    public ShowTaskResqTaskinfoContent1 withContent(Consumer<ShowTaskResqTaskinfoContent> contentSetter) {
        if (this.content == null) {
            this.content = new ShowTaskResqTaskinfoContent();
            contentSetter.accept(this.content);
        }

        return this;
    }

    /** Get content
     * 
     * @return content */
    public ShowTaskResqTaskinfoContent getContent() {
        return content;
    }

    public void setContent(ShowTaskResqTaskinfoContent content) {
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
        ShowTaskResqTaskinfoContent1 showTaskResqTaskinfoContent1 = (ShowTaskResqTaskinfoContent1) o;
        return Objects.equals(this.contentType, showTaskResqTaskinfoContent1.contentType)
            && Objects.equals(this.content, showTaskResqTaskinfoContent1.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentType, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskResqTaskinfoContent1 {\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
