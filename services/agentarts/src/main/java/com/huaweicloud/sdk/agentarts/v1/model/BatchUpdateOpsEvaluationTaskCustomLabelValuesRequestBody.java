package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 批量更新评估任务自定义标签值的请求体。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class BatchUpdateOpsEvaluationTaskCustomLabelValuesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<UpdateOpsEvaluationTaskCustomLabelValuesRequestBody> records = null;

    public BatchUpdateOpsEvaluationTaskCustomLabelValuesRequestBody withRecords(
        List<UpdateOpsEvaluationTaskCustomLabelValuesRequestBody> records) {
        this.records = records;
        return this;
    }

    public BatchUpdateOpsEvaluationTaskCustomLabelValuesRequestBody addRecordsItem(
        UpdateOpsEvaluationTaskCustomLabelValuesRequestBody recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public BatchUpdateOpsEvaluationTaskCustomLabelValuesRequestBody withRecords(
        Consumer<List<UpdateOpsEvaluationTaskCustomLabelValuesRequestBody>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释：** 待批量更新的评估任务自定义标签值记录列表。 **约束限制：** 数组长度为0到100。 **取值范围：** 参考UpdateOpsEvaluationTaskCustomLabelValuesRequestBody定义。 **默认取值：** 不涉及。 
     * @return records
     */
    public List<UpdateOpsEvaluationTaskCustomLabelValuesRequestBody> getRecords() {
        return records;
    }

    public void setRecords(List<UpdateOpsEvaluationTaskCustomLabelValuesRequestBody> records) {
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
        BatchUpdateOpsEvaluationTaskCustomLabelValuesRequestBody that =
            (BatchUpdateOpsEvaluationTaskCustomLabelValuesRequestBody) obj;
        return Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateOpsEvaluationTaskCustomLabelValuesRequestBody {\n");
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
