package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 更新资源标签的通用请求体。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class UpdateOpsResourceTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private List<EvaluationOpsResourceTag> records = null;

    public UpdateOpsResourceTagsRequestBody withRecords(List<EvaluationOpsResourceTag> records) {
        this.records = records;
        return this;
    }

    public UpdateOpsResourceTagsRequestBody addRecordsItem(EvaluationOpsResourceTag recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public UpdateOpsResourceTagsRequestBody withRecords(Consumer<List<EvaluationOpsResourceTag>> recordsSetter) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * **参数解释：** 包含的标签列表。 **约束限制：** 数组长度为0到200。 **取值范围：** 参考EvaluationOpsResourceTag定义。 **默认取值：** 不涉及。
     * @return records
     */
    public List<EvaluationOpsResourceTag> getRecords() {
        return records;
    }

    public void setRecords(List<EvaluationOpsResourceTag> records) {
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
        UpdateOpsResourceTagsRequestBody that = (UpdateOpsResourceTagsRequestBody) obj;
        return Objects.equals(this.records, that.records);
    }

    @Override
    public int hashCode() {
        return Objects.hash(records);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOpsResourceTagsRequestBody {\n");
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
