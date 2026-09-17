package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListAllOpsEvaluationTaskTmsTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<OpsTmsTagFilter> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<OpsTmsTagFilter> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListAllOpsEvaluationTaskTmsTagsResponse withTags(List<OpsTmsTagFilter> tags) {
        this.tags = tags;
        return this;
    }

    public ListAllOpsEvaluationTaskTmsTagsResponse addTagsItem(OpsTmsTagFilter tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListAllOpsEvaluationTaskTmsTagsResponse withTags(Consumer<List<OpsTmsTagFilter>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 用户标签列表，包含所有出现在账号下的用户标签键及其值集合（已分页）。数组元素为OpsTmsTagFilter对象，包含key和values字段。 **约束限制：** 不涉及。
     * @return tags
     */
    public List<OpsTmsTagFilter> getTags() {
        return tags;
    }

    public void setTags(List<OpsTmsTagFilter> tags) {
        this.tags = tags;
    }

    public ListAllOpsEvaluationTaskTmsTagsResponse withSysTags(List<OpsTmsTagFilter> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ListAllOpsEvaluationTaskTmsTagsResponse addSysTagsItem(OpsTmsTagFilter sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ListAllOpsEvaluationTaskTmsTagsResponse withSysTags(Consumer<List<OpsTmsTagFilter>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * **参数解释：** 系统标签列表，仅op_service权限可获取。包含所有出现在账号下的系统标签键及其值集合。数组元素为OpsTmsTagFilter对象，包含key和values字段。 **约束限制：** 不涉及。
     * @return sysTags
     */
    public List<OpsTmsTagFilter> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<OpsTmsTagFilter> sysTags) {
        this.sysTags = sysTags;
    }

    public ListAllOpsEvaluationTaskTmsTagsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释：** 用户标签总数数量（分页后的总数），取值为分页前tags数组的长度。 **约束限制：** 不涉及。 **取值范围：** 不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAllOpsEvaluationTaskTmsTagsResponse that = (ListAllOpsEvaluationTaskTmsTagsResponse) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.sysTags, that.sysTags)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, sysTags, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllOpsEvaluationTaskTmsTagsResponse {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
