package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 调用成功时为图片标签内容。  调用失败时无此字段。
 */
public class ImageMediaTaggingResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ImageMediaTaggingItemBody> tags = null;

    public ImageMediaTaggingResponseResult withTags(List<ImageMediaTaggingItemBody> tags) {
        this.tags = tags;
        return this;
    }

    public ImageMediaTaggingResponseResult addTagsItem(ImageMediaTaggingItemBody tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ImageMediaTaggingResponseResult withTags(Consumer<List<ImageMediaTaggingItemBody>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表集合。
     * @return tags
     */
    public List<ImageMediaTaggingItemBody> getTags() {
        return tags;
    }

    public void setTags(List<ImageMediaTaggingItemBody> tags) {
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
        ImageMediaTaggingResponseResult imageMediaTaggingResponseResult = (ImageMediaTaggingResponseResult) o;
        return Objects.equals(this.tags, imageMediaTaggingResponseResult.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageMediaTaggingResponseResult {\n");
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
