package com.huaweicloud.sdk.ces.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.AlarmHistoryInfo;
import com.huaweicloud.sdk.ces.v1.model.MetaDataForAlarmHistory;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAlarmHistoriesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_histories")
    
    private List<AlarmHistoryInfo> alarmHistories = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="meta_data")
    
    private MetaDataForAlarmHistory metaData;

    public ListAlarmHistoriesResponse withAlarmHistories(List<AlarmHistoryInfo> alarmHistories) {
        this.alarmHistories = alarmHistories;
        return this;
    }

    
    public ListAlarmHistoriesResponse addAlarmHistoriesItem(AlarmHistoryInfo alarmHistoriesItem) {
        if(this.alarmHistories == null) {
            this.alarmHistories = new ArrayList<>();
        }
        this.alarmHistories.add(alarmHistoriesItem);
        return this;
    }

    public ListAlarmHistoriesResponse withAlarmHistories(Consumer<List<AlarmHistoryInfo>> alarmHistoriesSetter) {
        if(this.alarmHistories == null) {
            this.alarmHistories = new ArrayList<>();
        }
        alarmHistoriesSetter.accept(this.alarmHistories);
        return this;
    }

    /**
     * 一条或者多条告警历史详细信息
     * @return alarmHistories
     */
    public List<AlarmHistoryInfo> getAlarmHistories() {
        return alarmHistories;
    }

    public void setAlarmHistories(List<AlarmHistoryInfo> alarmHistories) {
        this.alarmHistories = alarmHistories;
    }

    

    public ListAlarmHistoriesResponse withMetaData(MetaDataForAlarmHistory metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListAlarmHistoriesResponse withMetaData(Consumer<MetaDataForAlarmHistory> metaDataSetter) {
        if(this.metaData == null ){
            this.metaData = new MetaDataForAlarmHistory();
            metaDataSetter.accept(this.metaData);
        }
        
        return this;
    }


    /**
     * Get metaData
     * @return metaData
     */
    public MetaDataForAlarmHistory getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaDataForAlarmHistory metaData) {
        this.metaData = metaData;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlarmHistoriesResponse listAlarmHistoriesResponse = (ListAlarmHistoriesResponse) o;
        return Objects.equals(this.alarmHistories, listAlarmHistoriesResponse.alarmHistories) &&
            Objects.equals(this.metaData, listAlarmHistoriesResponse.metaData);
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

