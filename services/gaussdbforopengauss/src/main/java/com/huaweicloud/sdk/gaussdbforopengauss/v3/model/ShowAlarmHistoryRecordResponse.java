package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ShowAlarmHistoryRecordResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history_records")

    private List<AlarmHistoryRecordResult> historyRecords = null;

    public ShowAlarmHistoryRecordResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**： 总数量。 **默认取值**： 不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowAlarmHistoryRecordResponse withHistoryRecords(List<AlarmHistoryRecordResult> historyRecords) {
        this.historyRecords = historyRecords;
        return this;
    }

    public ShowAlarmHistoryRecordResponse addHistoryRecordsItem(AlarmHistoryRecordResult historyRecordsItem) {
        if (this.historyRecords == null) {
            this.historyRecords = new ArrayList<>();
        }
        this.historyRecords.add(historyRecordsItem);
        return this;
    }

    public ShowAlarmHistoryRecordResponse withHistoryRecords(
        Consumer<List<AlarmHistoryRecordResult>> historyRecordsSetter) {
        if (this.historyRecords == null) {
            this.historyRecords = new ArrayList<>();
        }
        historyRecordsSetter.accept(this.historyRecords);
        return this;
    }

    /**
     * **参数解释**： 告警记录列表。
     * @return historyRecords
     */
    public List<AlarmHistoryRecordResult> getHistoryRecords() {
        return historyRecords;
    }

    public void setHistoryRecords(List<AlarmHistoryRecordResult> historyRecords) {
        this.historyRecords = historyRecords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAlarmHistoryRecordResponse that = (ShowAlarmHistoryRecordResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.historyRecords, that.historyRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, historyRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlarmHistoryRecordResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    historyRecords: ").append(toIndentedString(historyRecords)).append("\n");
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
