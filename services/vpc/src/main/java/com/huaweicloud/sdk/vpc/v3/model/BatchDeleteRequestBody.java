package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteRequestBody
 */
public class BatchDeleteRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<BatchDeleteRequestBodyTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<BatchDeleteRequestBodySysTags> sysTags = null;

    public BatchDeleteRequestBody withTags(List<BatchDeleteRequestBodyTags> tags) {
        this.tags = tags;
        return this;
    }

    public BatchDeleteRequestBody addTagsItem(BatchDeleteRequestBodyTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchDeleteRequestBody withTags(Consumer<List<BatchDeleteRequestBodyTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签
     * @return tags
     */
    public List<BatchDeleteRequestBodyTags> getTags() {
        return tags;
    }

    public void setTags(List<BatchDeleteRequestBodyTags> tags) {
        this.tags = tags;
    }

    public BatchDeleteRequestBody withSysTags(List<BatchDeleteRequestBodySysTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public BatchDeleteRequestBody addSysTagsItem(BatchDeleteRequestBodySysTags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public BatchDeleteRequestBody withSysTags(Consumer<List<BatchDeleteRequestBodySysTags>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签
     * @return sysTags
     */
    public List<BatchDeleteRequestBodySysTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<BatchDeleteRequestBodySysTags> sysTags) {
        this.sysTags = sysTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteRequestBody that = (BatchDeleteRequestBody) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteRequestBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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
