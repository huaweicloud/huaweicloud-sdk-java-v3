package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Tag的集合元素 
 */
@JacksonXmlRootElement(localName = "PutObjectTaggingRequestBodyTagSet")
public class PutObjectTaggingRequestBodyTagSet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Tag")

    @JacksonXmlProperty(localName = "Tag")
    private List<Tag> tag = null;

    public PutObjectTaggingRequestBodyTagSet withTag(List<Tag> tag) {
        this.tag = tag;
        return this;
    }

    public PutObjectTaggingRequestBodyTagSet addTagItem(Tag tagItem) {
        if (this.tag == null) {
            this.tag = new ArrayList<>();
        }
        this.tag.add(tagItem);
        return this;
    }

    public PutObjectTaggingRequestBodyTagSet withTag(Consumer<List<Tag>> tagSetter) {
        if (this.tag == null) {
            this.tag = new ArrayList<>();
        }
        tagSetter.accept(this.tag);
        return this;
    }

    /**
     * Tag信息的元素 
     * @return tag
     */
    public List<Tag> getTag() {
        return tag;
    }

    public void setTag(List<Tag> tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutObjectTaggingRequestBodyTagSet that = (PutObjectTaggingRequestBodyTagSet) obj;
        return Objects.equals(this.tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutObjectTaggingRequestBodyTagSet {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
