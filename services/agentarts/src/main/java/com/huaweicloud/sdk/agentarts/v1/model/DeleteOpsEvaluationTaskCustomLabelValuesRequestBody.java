package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 删除评估任务自定义标签值的请求体。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class DeleteOpsEvaluationTaskCustomLabelValuesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<DeleteOpsEvaluationTaskCustomLabelValues> records = null;

    public DeleteOpsEvaluationTaskCustomLabelValuesRequestBody withRecords(
        List<DeleteOpsEvaluationTaskCustomLabelValues> records) {
        this.records = records;
        return this;
    }

    public DeleteOpsEvaluationTaskCustomLabelValuesRequestBody addRecordsItem(
        DeleteOpsEvaluationTaskCustomLabelValues recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public DeleteOpsEvaluationTaskCustomLabelValuesRequestBody withRecords(
        Consumer<List<DeleteOpsEvaluationTaskCustomLabelValues>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释：** 待删除的评估任务自定义标签值记录列表。 **约束限制：** 数组长度为0到100。 
     * @return records
     */
    public List<DeleteOpsEvaluationTaskCustomLabelValues> getRecords() {
        return records;
    }

    public void setRecords(List<DeleteOpsEvaluationTaskCustomLabelValues> records) {
        this.records = records;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteOpsEvaluationTaskCustomLabelValuesRequestBody that =
            (DeleteOpsEvaluationTaskCustomLabelValuesRequestBody) obj;
        return Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteOpsEvaluationTaskCustomLabelValuesRequestBody {\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
