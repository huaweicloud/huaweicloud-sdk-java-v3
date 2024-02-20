package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchCreateV2RequestBody
 */
public class BatchCreateV2RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<BatchCreateV2RequestBodyTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<BatchCreateV2RequestBodySysTags> sysTags = null;

    public BatchCreateV2RequestBody withTags(List<BatchCreateV2RequestBodyTags> tags) {
        this.tags = tags;
        return this;
    }

    public BatchCreateV2RequestBody addTagsItem(BatchCreateV2RequestBodyTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchCreateV2RequestBody withTags(Consumer<List<BatchCreateV2RequestBodyTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 全域弹性公网IP标签
     * @return tags
     */
    public List<BatchCreateV2RequestBodyTags> getTags() {
        return tags;
    }

    public void setTags(List<BatchCreateV2RequestBodyTags> tags) {
        this.tags = tags;
    }

    public BatchCreateV2RequestBody withSysTags(List<BatchCreateV2RequestBodySysTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public BatchCreateV2RequestBody addSysTagsItem(BatchCreateV2RequestBodySysTags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public BatchCreateV2RequestBody withSysTags(Consumer<List<BatchCreateV2RequestBodySysTags>> sysTagsSetter) {
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
    public List<BatchCreateV2RequestBodySysTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<BatchCreateV2RequestBodySysTags> sysTags) {
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
        BatchCreateV2RequestBody that = (BatchCreateV2RequestBody) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateV2RequestBody {\n");
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