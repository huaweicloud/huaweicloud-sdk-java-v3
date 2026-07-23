package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOpsEvaluationTasksChartsCompareResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private ShowOpsEvaluationTasksChartsCompareResultResponseBodyData data;

    public ShowOpsEvaluationTasksChartsCompareResultResponse withData(
        ShowOpsEvaluationTasksChartsCompareResultResponseBodyData data) {
        this.data = data;
        return this;
    }

    public ShowOpsEvaluationTasksChartsCompareResultResponse withData(
        Consumer<ShowOpsEvaluationTasksChartsCompareResultResponseBodyData> dataSetter) {
        if (this.data == null) {
            this.data = new ShowOpsEvaluationTasksChartsCompareResultResponseBodyData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public ShowOpsEvaluationTasksChartsCompareResultResponseBodyData getData() {
        return data;
    }

    public void setData(ShowOpsEvaluationTasksChartsCompareResultResponseBodyData data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsEvaluationTasksChartsCompareResultResponse that =
            (ShowOpsEvaluationTasksChartsCompareResultResponse) obj;
        return Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsEvaluationTasksChartsCompareResultResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
