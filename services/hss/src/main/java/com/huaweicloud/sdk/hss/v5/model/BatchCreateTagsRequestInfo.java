package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量添加标签的请求体
 */
public class BatchCreateTagsRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTagInfo> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<ResourceTagInfo> sysTags = null;

    public BatchCreateTagsRequestInfo withTags(List<ResourceTagInfo> tags) {
        this.tags = tags;
        return this;
    }

    public BatchCreateTagsRequestInfo addTagsItem(ResourceTagInfo tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchCreateTagsRequestInfo withTags(Consumer<List<ResourceTagInfo>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签对象列表
     * @return tags
     */
    public List<ResourceTagInfo> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTagInfo> tags) {
        this.tags = tags;
    }

    public BatchCreateTagsRequestInfo withSysTags(List<ResourceTagInfo> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public BatchCreateTagsRequestInfo addSysTagsItem(ResourceTagInfo sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public BatchCreateTagsRequestInfo withSysTags(Consumer<List<ResourceTagInfo>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 标签对象列表
     * @return sysTags
     */
    public List<ResourceTagInfo> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<ResourceTagInfo> sysTags) {
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
        BatchCreateTagsRequestInfo that = (BatchCreateTagsRequestInfo) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateTagsRequestInfo {\n");
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
