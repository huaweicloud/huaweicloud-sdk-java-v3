package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BaseQueryAssessTaskListResponseData
 */
public class BaseQueryAssessTaskListResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<QueryAssessTaskResponse> result = null;

    public BaseQueryAssessTaskListResponseData withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总任务数
     * minimum: 0
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public BaseQueryAssessTaskListResponseData withResult(List<QueryAssessTaskResponse> result) {
        this.result = result;
        return this;
    }

    public BaseQueryAssessTaskListResponseData addResultItem(QueryAssessTaskResponse resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public BaseQueryAssessTaskListResponseData withResult(Consumer<List<QueryAssessTaskResponse>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 评估任务数据列表
     * @return result
     */
    public List<QueryAssessTaskResponse> getResult() {
        return result;
    }

    public void setResult(List<QueryAssessTaskResponse> result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseQueryAssessTaskListResponseData that = (BaseQueryAssessTaskListResponseData) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseQueryAssessTaskListResponseData {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
