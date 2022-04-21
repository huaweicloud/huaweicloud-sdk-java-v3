package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchTagActionDelRequestBody
 */
public class BatchTagActionDelRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagDelWithKeyValue> tags = null;

    public BatchTagActionDelRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作标识（区分大小写）：删除时为“delete”。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BatchTagActionDelRequestBody withTags(List<TagDelWithKeyValue> tags) {
        this.tags = tags;
        return this;
    }

    public BatchTagActionDelRequestBody addTagsItem(TagDelWithKeyValue tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchTagActionDelRequestBody withTags(Consumer<List<TagDelWithKeyValue>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。单个实例总标签数上限10个。
     * @return tags
     */
    public List<TagDelWithKeyValue> getTags() {
        return tags;
    }

    public void setTags(List<TagDelWithKeyValue> tags) {
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
        BatchTagActionDelRequestBody batchTagActionDelRequestBody = (BatchTagActionDelRequestBody) o;
        return Objects.equals(this.action, batchTagActionDelRequestBody.action)
            && Objects.equals(this.tags, batchTagActionDelRequestBody.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchTagActionDelRequestBody {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
