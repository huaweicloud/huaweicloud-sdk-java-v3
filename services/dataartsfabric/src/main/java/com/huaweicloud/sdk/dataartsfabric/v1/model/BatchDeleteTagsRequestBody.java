package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除的资源标签
 */
public class BatchDeleteTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<DeleteResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<DeleteResourceTag> sysTags = null;

    public BatchDeleteTagsRequestBody withTags(List<DeleteResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public BatchDeleteTagsRequestBody addTagsItem(DeleteResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchDeleteTagsRequestBody withTags(Consumer<List<DeleteResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 批量删除请求体标签列表。
     * @return tags
     */
    public List<DeleteResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<DeleteResourceTag> tags) {
        this.tags = tags;
    }

    public BatchDeleteTagsRequestBody withSysTags(List<DeleteResourceTag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public BatchDeleteTagsRequestBody addSysTagsItem(DeleteResourceTag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public BatchDeleteTagsRequestBody withSysTags(Consumer<List<DeleteResourceTag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 批量删除请求体系统标签列表。
     * @return sysTags
     */
    public List<DeleteResourceTag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<DeleteResourceTag> sysTags) {
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
        BatchDeleteTagsRequestBody that = (BatchDeleteTagsRequestBody) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteTagsRequestBody {\n");
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
