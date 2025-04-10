package com.huaweicloud.sdk.hss.v5.model;

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
public class ListAlarmWhiteListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_num")

    private Integer remainNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_num")

    private Integer limitNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type_list")

    private List<Integer> eventTypeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<AlarmWhiteListResponseInfo> dataList = null;

    public ListAlarmWhiteListResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2147483647
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListAlarmWhiteListResponse withRemainNum(Integer remainNum) {
        this.remainNum = remainNum;
        return this;
    }

    /**
     * 可继续添加的白名单数量
     * @return remainNum
     */
    public Integer getRemainNum() {
        return remainNum;
    }

    public void setRemainNum(Integer remainNum) {
        this.remainNum = remainNum;
    }

    public ListAlarmWhiteListResponse withLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    /**
     * 白名单数量上限
     * @return limitNum
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public ListAlarmWhiteListResponse withEventTypeList(List<Integer> eventTypeList) {
        this.eventTypeList = eventTypeList;
        return this;
    }

    public ListAlarmWhiteListResponse addEventTypeListItem(Integer eventTypeListItem) {
        if (this.eventTypeList == null) {
            this.eventTypeList = new ArrayList<>();
        }
        this.eventTypeList.add(eventTypeListItem);
        return this;
    }

    public ListAlarmWhiteListResponse withEventTypeList(Consumer<List<Integer>> eventTypeListSetter) {
        if (this.eventTypeList == null) {
            this.eventTypeList = new ArrayList<>();
        }
        eventTypeListSetter.accept(this.eventTypeList);
        return this;
    }

    /**
     * 支持筛选的事件类型
     * @return eventTypeList
     */
    public List<Integer> getEventTypeList() {
        return eventTypeList;
    }

    public void setEventTypeList(List<Integer> eventTypeList) {
        this.eventTypeList = eventTypeList;
    }

    public ListAlarmWhiteListResponse withDataList(List<AlarmWhiteListResponseInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public ListAlarmWhiteListResponse addDataListItem(AlarmWhiteListResponseInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public ListAlarmWhiteListResponse withDataList(Consumer<List<AlarmWhiteListResponseInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 告警白名单详情
     * @return dataList
     */
    public List<AlarmWhiteListResponseInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<AlarmWhiteListResponseInfo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmWhiteListResponse that = (ListAlarmWhiteListResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.remainNum, that.remainNum)
            && Objects.equals(this.limitNum, that.limitNum) && Objects.equals(this.eventTypeList, that.eventTypeList)
            && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, remainNum, limitNum, eventTypeList, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmWhiteListResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    remainNum: ").append(toIndentedString(remainNum)).append("\n");
        sb.append("    limitNum: ").append(toIndentedString(limitNum)).append("\n");
        sb.append("    eventTypeList: ").append(toIndentedString(eventTypeList)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
