package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 批量添加或删除资源标签接口请求结构体 */
public class BatchAddOrRemoveResourceInstanceBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagList> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    public BatchAddOrRemoveResourceInstanceBody withTags(List<TagList> tags) {
        this.tags = tags;
        return this;
    }

    public BatchAddOrRemoveResourceInstanceBody addTagsItem(TagList tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchAddOrRemoveResourceInstanceBody withTags(Consumer<List<TagList>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 标签列表，没有标签默认为空数组。
     * 
     * @return tags */
    public List<TagList> getTags() {
        return tags;
    }

    public void setTags(List<TagList> tags) {
        this.tags = tags;
    }

    public BatchAddOrRemoveResourceInstanceBody withAction(String action) {
        this.action = action;
        return this;
    }

    /** 操作标识：仅限于 create（创建）、 delete（删除）。
     * 
     * @return action */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchAddOrRemoveResourceInstanceBody batchAddOrRemoveResourceInstanceBody =
            (BatchAddOrRemoveResourceInstanceBody) o;
        return Objects.equals(this.tags, batchAddOrRemoveResourceInstanceBody.tags)
            && Objects.equals(this.action, batchAddOrRemoveResourceInstanceBody.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddOrRemoveResourceInstanceBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
