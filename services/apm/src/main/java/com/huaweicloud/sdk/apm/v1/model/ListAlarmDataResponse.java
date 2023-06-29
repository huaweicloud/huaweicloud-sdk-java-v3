package com.huaweicloud.sdk.apm.v1.model;

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
public class ListAlarmDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_data_list")

    private List<AlarmDataVO> alarmDataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListAlarmDataResponse withAlarmDataList(List<AlarmDataVO> alarmDataList) {
        this.alarmDataList = alarmDataList;
        return this;
    }

    public ListAlarmDataResponse addAlarmDataListItem(AlarmDataVO alarmDataListItem) {
        if (this.alarmDataList == null) {
            this.alarmDataList = new ArrayList<>();
        }
        this.alarmDataList.add(alarmDataListItem);
        return this;
    }

    public ListAlarmDataResponse withAlarmDataList(Consumer<List<AlarmDataVO>> alarmDataListSetter) {
        if (this.alarmDataList == null) {
            this.alarmDataList = new ArrayList<>();
        }
        alarmDataListSetter.accept(this.alarmDataList);
        return this;
    }

    /**
     * 告警列表。
     * @return alarmDataList
     */
    public List<AlarmDataVO> getAlarmDataList() {
        return alarmDataList;
    }

    public void setAlarmDataList(List<AlarmDataVO> alarmDataList) {
        this.alarmDataList = alarmDataList;
    }

    public ListAlarmDataResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 消息总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmDataResponse that = (ListAlarmDataResponse) obj;
        return Objects.equals(this.alarmDataList, that.alarmDataList)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmDataList, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmDataResponse {\n");
        sb.append("    alarmDataList: ").append(toIndentedString(alarmDataList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
