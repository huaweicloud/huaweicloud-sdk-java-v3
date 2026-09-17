package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 获取评估器列表信息的请求体。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class ListOpsEvaluatorsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "builtin")

    private Boolean builtin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_option")

    private EvaluationOpsFilterOption filterOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    private Integer pageNumber;

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

    public ListOpsEvaluatorsRequestBody withBuiltin(Boolean builtin) {
        this.builtin = builtin;
        return this;
    }

    /**
     * **参数解释：** 是否为系统预置评估器的过滤开关。 **约束限制：** 布尔值。 **取值范围：** - true: 仅查询预置评估器 - false: 仅查询用户自定义评估器 **默认取值：** 无（查询全部）。 
     * @return builtin
     */
    public Boolean getBuiltin() {
        return builtin;
    }

    public void setBuiltin(Boolean builtin) {
        this.builtin = builtin;
    }

    public ListOpsEvaluatorsRequestBody withFilterOption(EvaluationOpsFilterOption filterOption) {
        this.filterOption = filterOption;
        return this;
    }

    public ListOpsEvaluatorsRequestBody withFilterOption(Consumer<EvaluationOpsFilterOption> filterOptionSetter) {
        if (this.filterOption == null) {
            this.filterOption = new EvaluationOpsFilterOption();
            filterOptionSetter.accept(this.filterOption);
        }

        return this;
    }

    /**
     * Get filterOption
     * @return filterOption
     */
    public EvaluationOpsFilterOption getFilterOption() {
        return filterOption;
    }

    public void setFilterOption(EvaluationOpsFilterOption filterOption) {
        this.filterOption = filterOption;
    }

    public ListOpsEvaluatorsRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * **参数解释：** 分页查询时每页返回的记录数量。 **约束限制：** 0到10000。 **取值范围：** 0到10000之间的整数。 **默认取值：** 10。 
     * minimum: 0
     * maximum: 10000
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListOpsEvaluatorsRequestBody withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * **参数解释：** 分页查询的当前页码。 **约束限制：** 0到10000。 **取值范围：** 0到10000 之间的整数。 **默认取值：** 1。 
     * minimum: 0
     * maximum: 10000
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public ListOpsEvaluatorsRequestBody withTagKeyExists(List<String> tagKeyExists) {
        this.tagKeyExists = tagKeyExists;
        return this;
    }

    public ListOpsEvaluatorsRequestBody addTagKeyExistsItem(String tagKeyExistsItem) {
        if (this.tagKeyExists == null) {
            this.tagKeyExists = new ArrayList<>();
        }
        this.tagKeyExists.add(tagKeyExistsItem);
        return this;
    }

    public ListOpsEvaluatorsRequestBody withTagKeyExists(Consumer<List<String>> tagKeyExistsSetter) {
        if (this.tagKeyExists == null) {
            this.tagKeyExists = new ArrayList<>();
        }
        tagKeyExistsSetter.accept(this.tagKeyExists);
        return this;
    }

    /**
     * **参数解释：** 需要匹配的包含该标签名称的资源。数组元素为字符串类型，每个元素最大长度128。 **约束限制：** 数组元素最小数量为0，最大数量为10，每个元素最大长度为128个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tagKeyExists
     */
    public List<String> getTagKeyExists() {
        return tagKeyExists;
    }

    public void setTagKeyExists(List<String> tagKeyExists) {
        this.tagKeyExists = tagKeyExists;
    }

    public ListOpsEvaluatorsRequestBody withTagKeyMatches(List<String> tagKeyMatches) {
        this.tagKeyMatches = tagKeyMatches;
        return this;
    }

    public ListOpsEvaluatorsRequestBody addTagKeyMatchesItem(String tagKeyMatchesItem) {
        if (this.tagKeyMatches == null) {
            this.tagKeyMatches = new ArrayList<>();
        }
        this.tagKeyMatches.add(tagKeyMatchesItem);
        return this;
    }

    public ListOpsEvaluatorsRequestBody withTagKeyMatches(Consumer<List<String>> tagKeyMatchesSetter) {
        if (this.tagKeyMatches == null) {
            this.tagKeyMatches = new ArrayList<>();
        }
        tagKeyMatchesSetter.accept(this.tagKeyMatches);
        return this;
    }

    /**
     * **参数解释：** 需要匹配的包含该标签的资源，需要和tag_value_matches条件配合使用。数组元素为字符串类型，每个元素最大长度128。 **约束限制：** tag_key_matches和tag_value_matches按索引位置配对。数组元素最小数量为0，最大数量为10，每个元素最大长度为128个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tagKeyMatches
     */
    public List<String> getTagKeyMatches() {
        return tagKeyMatches;
    }

    public void setTagKeyMatches(List<String> tagKeyMatches) {
        this.tagKeyMatches = tagKeyMatches;
    }

    public ListOpsEvaluatorsRequestBody withTagValueMatches(List<String> tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
        return this;
    }

    public ListOpsEvaluatorsRequestBody addTagValueMatchesItem(String tagValueMatchesItem) {
        if (this.tagValueMatches == null) {
            this.tagValueMatches = new ArrayList<>();
        }
        this.tagValueMatches.add(tagValueMatchesItem);
        return this;
    }

    public ListOpsEvaluatorsRequestBody withTagValueMatches(Consumer<List<String>> tagValueMatchesSetter) {
        if (this.tagValueMatches == null) {
            this.tagValueMatches = new ArrayList<>();
        }
        tagValueMatchesSetter.accept(this.tagValueMatches);
        return this;
    }

    /**
     * **参数解释：** 需要匹配的包含该标签值的资源，需要和tag_key_matches条件配合使用。数组元素为字符串类型，每个元素最大长度255。 **约束限制：** tag_key_matches和tag_value_matches按索引位置配对。数组元素最小数量为0，最大数量为10，每个元素最大长度为255个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tagValueMatches
     */
    public List<String> getTagValueMatches() {
        return tagValueMatches;
    }

    public void setTagValueMatches(List<String> tagValueMatches) {
        this.tagValueMatches = tagValueMatches;
    }

    public ListOpsEvaluatorsRequestBody withTagMatchPolicy(String tagMatchPolicy) {
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
        ListOpsEvaluatorsRequestBody that = (ListOpsEvaluatorsRequestBody) obj;
        return Objects.equals(this.builtin, that.builtin) && Objects.equals(this.filterOption, that.filterOption)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.pageNumber, that.pageNumber)
            && Objects.equals(this.tagKeyExists, that.tagKeyExists)
            && Objects.equals(this.tagKeyMatches, that.tagKeyMatches)
            && Objects.equals(this.tagValueMatches, that.tagValueMatches)
            && Objects.equals(this.tagMatchPolicy, that.tagMatchPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(builtin,
            filterOption,
            pageSize,
            pageNumber,
            tagKeyExists,
            tagKeyMatches,
            tagValueMatches,
            tagMatchPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorsRequestBody {\n");
        sb.append("    builtin: ").append(toIndentedString(builtin)).append("\n");
        sb.append("    filterOption: ").append(toIndentedString(filterOption)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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
