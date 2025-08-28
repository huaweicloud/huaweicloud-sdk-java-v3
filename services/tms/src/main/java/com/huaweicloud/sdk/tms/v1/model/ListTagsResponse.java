package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagResponse> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errors")

    private List<TagListErrorItem> errors = null;

    public ListTagsResponse withTags(List<TagResponse> tags) {
        this.tags = tags;
        return this;
    }

    public ListTagsResponse addTagsItem(TagResponse tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListTagsResponse withTags(Consumer<List<TagResponse>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<TagResponse> getTags() {
        return tags;
    }

    public void setTags(List<TagResponse> tags) {
        this.tags = tags;
    }

    public ListTagsResponse withErrors(List<TagListErrorItem> errors) {
        this.errors = errors;
        return this;
    }

    public ListTagsResponse addErrorsItem(TagListErrorItem errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    public ListTagsResponse withErrors(Consumer<List<TagListErrorItem>> errorsSetter) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        errorsSetter.accept(this.errors);
        return this;
    }

    /**
     * 错误列表
     * @return errors
     */
    public List<TagListErrorItem> getErrors() {
        return errors;
    }

    public void setErrors(List<TagListErrorItem> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTagsResponse that = (ListTagsResponse) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagsResponse {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
