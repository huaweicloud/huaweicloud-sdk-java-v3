package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量修改标签请求
 */
public class TagsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<Tag> sysTags = null;

    public TagsReq withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作字符串create或delete
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public TagsReq withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public TagsReq addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TagsReq withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签对象
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public TagsReq withSysTags(List<Tag> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public TagsReq addSysTagsItem(Tag sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public TagsReq withSysTags(Consumer<List<Tag>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 标签对象
     * @return sysTags
     */
    public List<Tag> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<Tag> sysTags) {
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
        TagsReq that = (TagsReq) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, tags, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagsReq {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
