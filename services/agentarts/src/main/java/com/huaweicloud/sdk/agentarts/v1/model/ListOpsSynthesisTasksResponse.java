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
public class ListOpsSynthesisTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syntheses")

    private List<EvaluationOpsSynthesisTaskSummary> syntheses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListOpsSynthesisTasksResponse withSyntheses(List<EvaluationOpsSynthesisTaskSummary> syntheses) {
        this.syntheses = syntheses;
        return this;
    }

    public ListOpsSynthesisTasksResponse addSynthesesItem(EvaluationOpsSynthesisTaskSummary synthesesItem) {
        if (this.syntheses == null) {
            this.syntheses = new ArrayList<>();
        }
        this.syntheses.add(synthesesItem);
        return this;
    }

    public ListOpsSynthesisTasksResponse withSyntheses(
        Consumer<List<EvaluationOpsSynthesisTaskSummary>> synthesesSetter) {
        if (this.syntheses == null) {
            this.syntheses = new ArrayList<>();
        }
        synthesesSetter.accept(this.syntheses);
        return this;
    }

    /**
     * **参数解释：**   包含合成任务摘要信息的对象列表。 **取值范围：**   参考EvaluationOpsSynthesisTaskSummary定义。 
     * @return syntheses
     */
    public List<EvaluationOpsSynthesisTaskSummary> getSyntheses() {
        return syntheses;
    }

    public void setSyntheses(List<EvaluationOpsSynthesisTaskSummary> syntheses) {
        this.syntheses = syntheses;
    }

    public ListOpsSynthesisTasksResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：**   符合当前筛选条件的任务总记录数。 **取值范围：**   0-500。 
     * minimum: 0
     * maximum: 500
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsSynthesisTasksResponse that = (ListOpsSynthesisTasksResponse) obj;
        return Objects.equals(this.syntheses, that.syntheses) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syntheses, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsSynthesisTasksResponse {\n");
        sb.append("    syntheses: ").append(toIndentedString(syntheses)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
