package com.huaweicloud.sdk.ces.v1.model;

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
public class ListAlarmHistoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_histories")

    private List<AlarmHistoryInfoResp> alarmHistories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private MetaDataForAlarmHistoryResp metaData;

    public ListAlarmHistoriesResponse withAlarmHistories(List<AlarmHistoryInfoResp> alarmHistories) {
        this.alarmHistories = alarmHistories;
        return this;
    }

    public ListAlarmHistoriesResponse addAlarmHistoriesItem(AlarmHistoryInfoResp alarmHistoriesItem) {
        if (this.alarmHistories == null) {
            this.alarmHistories = new ArrayList<>();
        }
        this.alarmHistories.add(alarmHistoriesItem);
        return this;
    }

    public ListAlarmHistoriesResponse withAlarmHistories(Consumer<List<AlarmHistoryInfoResp>> alarmHistoriesSetter) {
        if (this.alarmHistories == null) {
            this.alarmHistories = new ArrayList<>();
        }
        alarmHistoriesSetter.accept(this.alarmHistories);
        return this;
    }

    /**
     * **参数解释**： 一条或者多条告警历史详细信息 
     * @return alarmHistories
     */
    public List<AlarmHistoryInfoResp> getAlarmHistories() {
        return alarmHistories;
    }

    public void setAlarmHistories(List<AlarmHistoryInfoResp> alarmHistories) {
        this.alarmHistories = alarmHistories;
    }

    public ListAlarmHistoriesResponse withMetaData(MetaDataForAlarmHistoryResp metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListAlarmHistoriesResponse withMetaData(Consumer<MetaDataForAlarmHistoryResp> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new MetaDataForAlarmHistoryResp();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public MetaDataForAlarmHistoryResp getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaDataForAlarmHistoryResp metaData) {
        this.metaData = metaData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmHistoriesResponse that = (ListAlarmHistoriesResponse) obj;
        return Objects.equals(this.alarmHistories, that.alarmHistories) && Objects.equals(this.metaData, that.metaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmHistories, metaData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmHistoriesResponse {\n");
        sb.append("    alarmHistories: ").append(toIndentedString(alarmHistories)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
