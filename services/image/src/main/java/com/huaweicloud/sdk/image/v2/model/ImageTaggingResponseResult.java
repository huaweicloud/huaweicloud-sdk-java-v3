package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 调用成功时为图片标签内容。 调用失败时无此字段。 */
public class ImageTaggingResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ImageTaggingItemBody> tags = null;

    public ImageTaggingResponseResult withTags(List<ImageTaggingItemBody> tags) {
        this.tags = tags;
        return this;
    }

    public ImageTaggingResponseResult addTagsItem(ImageTaggingItemBody tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ImageTaggingResponseResult withTags(Consumer<List<ImageTaggingItemBody>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 标签列表集合。
     * 
     * @return tags */
    public List<ImageTaggingItemBody> getTags() {
        return tags;
    }

    public void setTags(List<ImageTaggingItemBody> tags) {
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
        ImageTaggingResponseResult imageTaggingResponseResult = (ImageTaggingResponseResult) o;
        return Objects.equals(this.tags, imageTaggingResponseResult.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageTaggingResponseResult {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
