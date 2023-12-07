package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求参数。
 */
public class BatchCreateDeleteNatTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<PublicTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    public BatchCreateDeleteNatTagsRequestBody withTags(List<PublicTags> tags) {
        this.tags = tags;
        return this;
    }

    public BatchCreateDeleteNatTagsRequestBody addTagsItem(PublicTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchCreateDeleteNatTagsRequestBody withTags(Consumer<List<PublicTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。请参考表Tags字段数据结构说明
     * @return tags
     */
    public List<PublicTags> getTags() {
        return tags;
    }

    public void setTags(List<PublicTags> tags) {
        this.tags = tags;
    }

    public BatchCreateDeleteNatTagsRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作标识：仅限于create（创建）、delete（删除）
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateDeleteNatTagsRequestBody that = (BatchCreateDeleteNatTagsRequestBody) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateDeleteNatTagsRequestBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
