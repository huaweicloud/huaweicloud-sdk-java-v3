package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddTagsRequest
 */
public class AddTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name")

    private String tagName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private String ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddTagsRequest that = (AddTagsRequest) obj;
        return Objects.equals(this.tagName, that.tagName) && Objects.equals(this.ref, that.ref)
            && Objects.equals(this.message, that.message);
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
