package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * AddTagsRequest
 */
public class AddTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name")

    @JacksonXmlProperty(localName = "tag_name")

    private String tagName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    @JacksonXmlProperty(localName = "ref")

    private String ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    public AddTagsRequest withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * 标签名称
     * @return tagName
     */
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public AddTagsRequest withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * 分支名称
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public AddTagsRequest withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 备注
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddTagsRequest addTagsRequest = (AddTagsRequest) o;
        return Objects.equals(this.tagName, addTagsRequest.tagName) && Objects.equals(this.ref, addTagsRequest.ref)
            && Objects.equals(this.message, addTagsRequest.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagName, ref, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddTagsRequest {\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
