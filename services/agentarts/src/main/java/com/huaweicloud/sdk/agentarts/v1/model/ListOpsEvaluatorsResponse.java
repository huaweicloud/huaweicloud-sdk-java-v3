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
public class ListOpsEvaluatorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    private Integer pageNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluators")

    private List<OpsListEvaluatorsInfo> evaluators = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_pages")

    private Long totalPages;

    public ListOpsEvaluatorsResponse withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * **参数解释：** 当前页码。 **约束限制：** 不涉及。 **取值范围：** 正整数。
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public ListOpsEvaluatorsResponse withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * **参数解释：** 每页返回的记录条数。 **约束限制：** 不涉及。 **取值范围：** 1~100。
     * minimum: 1
     * maximum: 100
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListOpsEvaluatorsResponse withEvaluators(List<OpsListEvaluatorsInfo> evaluators) {
        this.evaluators = evaluators;
        return this;
    }

    public ListOpsEvaluatorsResponse addEvaluatorsItem(OpsListEvaluatorsInfo evaluatorsItem) {
        if (this.evaluators == null) {
            this.evaluators = new ArrayList<>();
        }
        this.evaluators.add(evaluatorsItem);
        return this;
    }

    public ListOpsEvaluatorsResponse withEvaluators(Consumer<List<OpsListEvaluatorsInfo>> evaluatorsSetter) {
        if (this.evaluators == null) {
            this.evaluators = new ArrayList<>();
        }
        evaluatorsSetter.accept(this.evaluators);
        return this;
    }

    /**
     * **参数解释** 包含评估器元数据、配置信息及状态的详细信息列表。 **取值范围** 元素参考内部定义。 
     * @return evaluators
     */
    public List<OpsListEvaluatorsInfo> getEvaluators() {
        return evaluators;
    }

    public void setEvaluators(List<OpsListEvaluatorsInfo> evaluators) {
        this.evaluators = evaluators;
    }

    public ListOpsEvaluatorsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释** 符合当前过滤条件的评估器总记录数，常用于分页。 **取值范围** 非负整数。 
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListOpsEvaluatorsResponse withTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * **参数解释：** 总页数。 **约束限制：** 不涉及。 **取值范围：** 非负整数。
     * @return totalPages
     */
    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorsResponse that = (ListOpsEvaluatorsResponse) obj;
        return Objects.equals(this.pageNumber, that.pageNumber) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.evaluators, that.evaluators) && Objects.equals(this.total, that.total)
            && Objects.equals(this.totalPages, that.totalPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageNumber, pageSize, evaluators, total, totalPages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorsResponse {\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    evaluators: ").append(toIndentedString(evaluators)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
