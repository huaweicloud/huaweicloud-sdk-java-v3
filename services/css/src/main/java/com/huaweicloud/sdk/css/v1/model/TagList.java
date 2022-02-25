package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** TagList */
public class TagList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private TagReq tag;

    public TagList withTag(TagReq tag) {
        this.tag = tag;
        return this;
    }

    public TagList withTag(Consumer<TagReq> tagSetter) {
        if (this.tag == null) {
            this.tag = new TagReq();
            tagSetter.accept(this.tag);
        }

        return this;
    }

    /** Get tag
     * 
     * @return tag */
    public TagReq getTag() {
        return tag;
    }

    public void setTag(TagReq tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagList tagList = (TagList) o;
        return Objects.equals(this.tag, tagList.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagList {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
