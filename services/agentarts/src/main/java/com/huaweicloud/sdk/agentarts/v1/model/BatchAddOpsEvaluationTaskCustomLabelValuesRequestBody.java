package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 批量添加评估任务的自定义标签值请求体。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class BatchAddOpsEvaluationTaskCustomLabelValuesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<AddOpsEvaluationTaskCustomLabelValuesRequestBody> records = null;

    public BatchAddOpsEvaluationTaskCustomLabelValuesRequestBody withRecords(
        List<AddOpsEvaluationTaskCustomLabelValuesRequestBody> records) {
        this.records = records;
        return this;
    }

    public BatchAddOpsEvaluationTaskCustomLabelValuesRequestBody addRecordsItem(
        AddOpsEvaluationTaskCustomLabelValuesRequestBody recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public BatchAddOpsEvaluationTaskCustomLabelValuesRequestBody withRecords(
        Consumer<List<AddOpsEvaluationTaskCustomLabelValuesRequestBody>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释：** 评估任务的自定义标签值。 **约束限制：** 数组长度为0到100。 **取值范围：** 参考AddOpsEvaluationTaskCustomLabelValuesRequestBody定义。 **默认取值：** 不涉及。 
     * @return records
     */
    public List<AddOpsEvaluationTaskCustomLabelValuesRequestBody> getRecords() {
        return records;
    }

    public void setRecords(List<AddOpsEvaluationTaskCustomLabelValuesRequestBody> records) {
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
        BatchAddOpsEvaluationTaskCustomLabelValuesRequestBody that =
            (BatchAddOpsEvaluationTaskCustomLabelValuesRequestBody) obj;
        return Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddOpsEvaluationTaskCustomLabelValuesRequestBody {\n");
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
