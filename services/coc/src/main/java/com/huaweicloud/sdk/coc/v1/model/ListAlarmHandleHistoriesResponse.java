package com.huaweicloud.sdk.coc.v1.model;

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
public class ListAlarmHandleHistoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_handle_histories")

    private List<AlarmHandleHistory> alarmHandleHistories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved_record")

    private ResolvedRecordDTO resolvedRecord;

    public ListAlarmHandleHistoriesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListAlarmHandleHistoriesResponse withAlarmHandleHistories(List<AlarmHandleHistory> alarmHandleHistories) {
        this.alarmHandleHistories = alarmHandleHistories;
        return this;
    }

    public ListAlarmHandleHistoriesResponse addAlarmHandleHistoriesItem(AlarmHandleHistory alarmHandleHistoriesItem) {
        if (this.alarmHandleHistories == null) {
            this.alarmHandleHistories = new ArrayList<>();
        }
        this.alarmHandleHistories.add(alarmHandleHistoriesItem);
        return this;
    }

    public ListAlarmHandleHistoriesResponse withAlarmHandleHistories(
        Consumer<List<AlarmHandleHistory>> alarmHandleHistoriesSetter) {
        if (this.alarmHandleHistories == null) {
            this.alarmHandleHistories = new ArrayList<>();
        }
        alarmHandleHistoriesSetter.accept(this.alarmHandleHistories);
        return this;
    }

    /**
     * 告警工单执行结果
     * @return alarmHandleHistories
     */
    public List<AlarmHandleHistory> getAlarmHandleHistories() {
        return alarmHandleHistories;
    }

    public void setAlarmHandleHistories(List<AlarmHandleHistory> alarmHandleHistories) {
        this.alarmHandleHistories = alarmHandleHistories;
    }

    public ListAlarmHandleHistoriesResponse withResolvedRecord(ResolvedRecordDTO resolvedRecord) {
        this.resolvedRecord = resolvedRecord;
        return this;
    }

    public ListAlarmHandleHistoriesResponse withResolvedRecord(Consumer<ResolvedRecordDTO> resolvedRecordSetter) {
        if (this.resolvedRecord == null) {
            this.resolvedRecord = new ResolvedRecordDTO();
            resolvedRecordSetter.accept(this.resolvedRecord);
        }

        return this;
    }

    /**
     * Get resolvedRecord
     * @return resolvedRecord
     */
    public ResolvedRecordDTO getResolvedRecord() {
        return resolvedRecord;
    }

    public void setResolvedRecord(ResolvedRecordDTO resolvedRecord) {
        this.resolvedRecord = resolvedRecord;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmHandleHistoriesResponse that = (ListAlarmHandleHistoriesResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.alarmHandleHistories, that.alarmHandleHistories)
            && Objects.equals(this.resolvedRecord, that.resolvedRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, alarmHandleHistories, resolvedRecord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmHandleHistoriesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    alarmHandleHistories: ").append(toIndentedString(alarmHandleHistories)).append("\n");
        sb.append("    resolvedRecord: ").append(toIndentedString(resolvedRecord)).append("\n");
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
