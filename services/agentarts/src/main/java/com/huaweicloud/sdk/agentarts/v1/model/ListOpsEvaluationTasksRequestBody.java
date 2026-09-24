package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 查询评估任务列表的请求体，用于控制分页查询。 **约束限制：** offset和limit为必填项。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class ListOpsEvaluationTasksRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key_exists")

    private List<String> tagKeyExists = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_key_matches")

    private List<String> tagKeyMatches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_value_matches")

    private List<String> tagValueMatches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_match_policy")

    private String tagMatchPolicy;

    public ListOpsEvaluationTasksRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 指定每次请求返回的偏移量，即从第几条数据开始查询。 **约束限制：** 1 到10000之间的整数。 **取值范围：** 1 到 10000。 **默认取值：** 1。 
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListOpsEvaluationTasksRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 指定每页返回的记录数量（页大小）。 **约束限制：** 1到100之间的整数。 **取值范围：** 1 到100。 **默认取值：** 10。 
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListOpsEvaluationTasksRequestBody withTagKeyExists(List<String> tagKeyExists) {
        this.tagKeyExists = tagKeyExists;
        return this;
    }

    public ListOpsEvaluationTasksRequestBody addTagKeyExistsItem(String tagKeyExistsItem) {
        if (this.tagKeyExists == null) {
            this.tagKeyExists = new ArrayList<>();
        }
        this.tagKeyExists.add(tagKeyExistsItem);
        return this;
    }

    public ListOpsEvaluationTasksRequestBody withTagKeyExists(Consumer<List<String>> tagKeyExistsSetter) {
        if (this.tagKeyExists == null) {
            this.tagKeyExists = new ArrayList<>();
        }
        tagKeyExistsSetter.accept(this.tagKeyExists);
        return this;
    }

    /**
     * **参数解释：** 需要匹配的包含该标签名称的资源。 **约束限制：** 数组元素最小数量为0，最大数量为10，每个元素最大长度为128个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return tagKeyExists
     */
    public List<String> getTagKeyExists() {
        return tagKeyExists;
    }

    public void setTagKeyExists(List<String> tagKeyExists) {
        this.tagKeyExists = tagKeyExists;
    }

    public ListOpsEvaluationTasksRequestBody withTagKeyMatches(List<String> tagKeyMatches) {
        this.tagKeyMatches = tagKeyMatches;
        return this;
    }

    public ListOpsEvaluationTasksRequestBody addTagKeyMatchesItem(String tagKeyMatchesItem) {
        if (this.tagKeyMatches == null) {
            this.tagKeyMatches = new ArrayList<>();
        }
        this.tagKeyMatches.add(tagKeyMatchesItem);
        return this;
    }

    public ListOpsEvaluationTasksRequestBody withTagKeyMatches(Consumer<List<String>> tagKeyMatchesSetter) {
        if (this.tagKeyMatches == null) {
            this.tagKeyMatches = new ArrayList<>();
        }
        tagKeyMatchesSetter.accept(this.tagKeyMatches);
        return this;
    }

    /**
     * **参数解释：** 需要匹配的包含该标签的资源，需要和tag_value_matches条件配合使用。 **约束限制：** tag_key_matches和tag_value_matches按索引位置配对。数组元素最小数量为0，最大数量为10，每个元素最大长度为128个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return tagKeyMatches
     */
    public List<String> getTagKeyMatches() {
        return tagKeyMatches;
    }

    public void setTagKeyMatches(List<String> tagKeyMatches) {
        this.tagKeyMatches = tagKeyMatches;
    }

    public ListOpsEvaluationTasksRequestBody withTagValueMatches(List<String> tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
        return this;
    }

    public ListOpsEvaluationTasksRequestBody addTagValueMatchesItem(String tagValueMatchesItem) {
        if (this.tagValueMatches == null) {
            this.tagValueMatches = new ArrayList<>();
        }
        this.tagValueMatches.add(tagValueMatchesItem);
        return this;
    }

    public ListOpsEvaluationTasksRequestBody withTagValueMatches(Consumer<List<String>> tagValueMatchesSetter) {
        if (this.tagValueMatches == null) {
            this.tagValueMatches = new ArrayList<>();
        }
        tagValueMatchesSetter.accept(this.tagValueMatches);
        return this;
    }

    /**
     * **参数解释：** 需要匹配的包含该标签值的资源，需要和tag_key_matches条件配合使用。 **约束限制：** tag_key_matches和tag_value_matches按索引位置配对。数组元素最小数量为0，最大数量为10，每个元素最大长度为255个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
     * @return tagValueMatches
     */
    public List<String> getTagValueMatches() {
        return tagValueMatches;
    }

    public void setTagValueMatches(List<String> tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
    }

    public ListOpsEvaluationTasksRequestBody withTagMatchPolicy(String tagMatchPolicy) {
        this.tagMatchPolicy = tagMatchPolicy;
        return this;
    }

    /**
     * **参数解释：** 标签匹配模式，仅针对tag_key_exists、tag_key_matches、tag_value_matches参数生效。 **约束限制：** 不涉及。 **取值范围：** - ALL：所有标签都必须匹配 - ANY：任意一个标签匹配即可 **默认取值：** ALL。 
     * @return tagMatchPolicy
     */
    public String getTagMatchPolicy() {
        return tagMatchPolicy;
    }

    public void setTagMatchPolicy(String tagMatchPolicy) {
        this.tagMatchPolicy = tagMatchPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluationTasksRequestBody that = (ListOpsEvaluationTasksRequestBody) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.tagKeyExists, that.tagKeyExists)
            && Objects.equals(this.tagKeyMatches, that.tagKeyMatches)
            && Objects.equals(this.tagValueMatches, that.tagValueMatches)
            && Objects.equals(this.tagMatchPolicy, that.tagMatchPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, tagKeyExists, tagKeyMatches, tagValueMatches, tagMatchPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluationTasksRequestBody {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    tagKeyExists: ").append(toIndentedString(tagKeyExists)).append("\n");
        sb.append("    tagKeyMatches: ").append(toIndentedString(tagKeyMatches)).append("\n");
        sb.append("    tagValueMatches: ").append(toIndentedString(tagValueMatches)).append("\n");
        sb.append("    tagMatchPolicy: ").append(toIndentedString(tagMatchPolicy)).append("\n");
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
