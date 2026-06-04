package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ListTrainingJobStagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private String totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_records")

    private List<StageRecord> runningRecords = null;

    public ListTrainingJobStagesResponse withTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**：总条数。  **取值范围**：不涉及。
     * @return totalCount
     */
    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public ListTrainingJobStagesResponse withRunningRecords(List<StageRecord> runningRecords) {
        this.runningRecords = runningRecords;
        return this;
    }

    public ListTrainingJobStagesResponse addRunningRecordsItem(StageRecord runningRecordsItem) {
        if (this.runningRecords == null) {
            this.runningRecords = new ArrayList<>();
        }
        this.runningRecords.add(runningRecordsItem);
        return this;
    }

    public ListTrainingJobStagesResponse withRunningRecords(Consumer<List<StageRecord>> runningRecordsSetter) {
        if (this.runningRecords == null) {
            this.runningRecords = new ArrayList<>();
        }
        runningRecordsSetter.accept(this.runningRecords);
        return this;
    }

    /**
     * **参数解释**：阶段记录。
     * @return runningRecords
     */
    public List<StageRecord> getRunningRecords() {
        return runningRecords;
    }

    public void setRunningRecords(List<StageRecord> runningRecords) {
        this.runningRecords = runningRecords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTrainingJobStagesResponse that = (ListTrainingJobStagesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.runningRecords, that.runningRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, runningRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTrainingJobStagesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    runningRecords: ").append(toIndentedString(runningRecords)).append("\n");
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
