package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.pageNumber, that.pageNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(builtin, filterOption, pageSize, pageNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorsRequestBody {\n");
        sb.append("    builtin: ").append(toIndentedString(builtin)).append("\n");
        sb.append("    filterOption: ").append(toIndentedString(filterOption)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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
