package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** BatchAddOrDeleteTagOnClusterReq */
public class BatchAddOrDeleteTagOnClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagList> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sysTags")

    private List<SysTags> sysTags = null;

    public BatchAddOrDeleteTagOnClusterReq withAction(String action) {
        this.action = action;
        return this;
    }

    /** 操作类型。 说明：通过该属性标识当前所需的操作类型。 - create：批量添加标签。 - delete：批量删除标签。
     * 
     * @return action */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BatchAddOrDeleteTagOnClusterReq withTags(List<TagList> tags) {
        this.tags = tags;
        return this;
    }

    public BatchAddOrDeleteTagOnClusterReq addTagsItem(TagList tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchAddOrDeleteTagOnClusterReq withTags(Consumer<List<TagList>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 标签列表
     * 
     * @return tags */
    public List<TagList> getTags() {
        return tags;
    }

    public void setTags(List<TagList> tags) {
        this.tags = tags;
    }

    public BatchAddOrDeleteTagOnClusterReq withSysTags(List<SysTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public BatchAddOrDeleteTagOnClusterReq addSysTagsItem(SysTags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public BatchAddOrDeleteTagOnClusterReq withSysTags(Consumer<List<SysTags>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /** 标签列表
     * 
     * @return sysTags */
    public List<SysTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SysTags> sysTags) {
        this.sysTags = sysTags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchAddOrDeleteTagOnClusterReq batchAddOrDeleteTagOnClusterReq = (BatchAddOrDeleteTagOnClusterReq) o;
        return Objects.equals(this.action, batchAddOrDeleteTagOnClusterReq.action)
            && Objects.equals(this.tags, batchAddOrDeleteTagOnClusterReq.tags)
            && Objects.equals(this.sysTags, batchAddOrDeleteTagOnClusterReq.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, tags, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddOrDeleteTagOnClusterReq {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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
