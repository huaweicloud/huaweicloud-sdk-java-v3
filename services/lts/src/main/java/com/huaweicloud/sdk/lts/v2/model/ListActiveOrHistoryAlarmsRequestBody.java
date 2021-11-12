package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ListActiveOrHistoryAlarmsRequestBody */
public class ListActiveOrHistoryAlarmsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private Integer step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whether_custom_field")

    private Boolean whetherCustomField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Object startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Object endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private Integer timeRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarmLevelIds")

    private List<String> alarmLevelIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private Sort sort;

    public ListActiveOrHistoryAlarmsRequestBody withStep(Integer step) {
        this.step = step;
        return this;
    }

    /** 关键字检索条件
     * 
     * @return step */
    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public ListActiveOrHistoryAlarmsRequestBody withWhetherCustomField(Boolean whetherCustomField) {
        this.whetherCustomField = whetherCustomField;
        return this;
    }

    /** 是否自定义查询时间段
     * 
     * @return whetherCustomField */
    public Boolean getWhetherCustomField() {
        return whetherCustomField;
    }

    public void setWhetherCustomField(Boolean whetherCustomField) {
        this.whetherCustomField = whetherCustomField;
    }

    public ListActiveOrHistoryAlarmsRequestBody withStartTime(Object startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 自定义时间段开始时间(时间戳)
     * 
     * @return startTime */
    public Object getStartTime() {
        return startTime;
    }

    public void setStartTime(Object startTime) {
        this.startTime = startTime;
    }

    public ListActiveOrHistoryAlarmsRequestBody withEndTime(Object endTime) {
        this.endTime = endTime;
        return this;
    }

    /** 自定义时间段结束时间(时间戳)
     * 
     * @return endTime */
    public Object getEndTime() {
        return endTime;
    }

    public void setEndTime(Object endTime) {
        this.endTime = endTime;
    }

    public ListActiveOrHistoryAlarmsRequestBody withTimeRange(Integer timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    /** 非自定义时间段时间范围(单位为分钟)
     * 
     * @return timeRange */
    public Integer getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(Integer timeRange) {
        this.timeRange = timeRange;
    }

    public ListActiveOrHistoryAlarmsRequestBody withSearch(String search) {
        this.search = search;
        return this;
    }

    /** 关键字检索条件
     * 
     * @return search */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListActiveOrHistoryAlarmsRequestBody withAlarmLevelIds(List<String> alarmLevelIds) {
        this.alarmLevelIds = alarmLevelIds;
        return this;
    }

    public ListActiveOrHistoryAlarmsRequestBody addAlarmLevelIdsItem(String alarmLevelIdsItem) {
        if (this.alarmLevelIds == null) {
            this.alarmLevelIds = new ArrayList<>();
        }
        this.alarmLevelIds.add(alarmLevelIdsItem);
        return this;
    }

    public ListActiveOrHistoryAlarmsRequestBody withAlarmLevelIds(Consumer<List<String>> alarmLevelIdsSetter) {
        if (this.alarmLevelIds == null) {
            this.alarmLevelIds = new ArrayList<>();
        }
        alarmLevelIdsSetter.accept(this.alarmLevelIds);
        return this;
    }

    /** 告警级别(\"Critical\",\"Major\",\"Minor\",\"Info\")
     * 
     * @return alarmLevelIds */
    public List<String> getAlarmLevelIds() {
        return alarmLevelIds;
    }

    public void setAlarmLevelIds(List<String> alarmLevelIds) {
        this.alarmLevelIds = alarmLevelIds;
    }

    public ListActiveOrHistoryAlarmsRequestBody withSort(Sort sort) {
        this.sort = sort;
        return this;
    }

    public ListActiveOrHistoryAlarmsRequestBody withSort(Consumer<Sort> sortSetter) {
        if (this.sort == null) {
            this.sort = new Sort();
            sortSetter.accept(this.sort);
        }

        return this;
    }

    /** 排序检索条件
     * 
     * @return sort */
    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListActiveOrHistoryAlarmsRequestBody listActiveOrHistoryAlarmsRequestBody =
            (ListActiveOrHistoryAlarmsRequestBody) o;
        return Objects.equals(this.step, listActiveOrHistoryAlarmsRequestBody.step)
            && Objects.equals(this.whetherCustomField, listActiveOrHistoryAlarmsRequestBody.whetherCustomField)
            && Objects.equals(this.startTime, listActiveOrHistoryAlarmsRequestBody.startTime)
            && Objects.equals(this.endTime, listActiveOrHistoryAlarmsRequestBody.endTime)
            && Objects.equals(this.timeRange, listActiveOrHistoryAlarmsRequestBody.timeRange)
            && Objects.equals(this.search, listActiveOrHistoryAlarmsRequestBody.search)
            && Objects.equals(this.alarmLevelIds, listActiveOrHistoryAlarmsRequestBody.alarmLevelIds)
            && Objects.equals(this.sort, listActiveOrHistoryAlarmsRequestBody.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(step, whetherCustomField, startTime, endTime, timeRange, search, alarmLevelIds, sort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListActiveOrHistoryAlarmsRequestBody {\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    whetherCustomField: ").append(toIndentedString(whetherCustomField)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    alarmLevelIds: ").append(toIndentedString(alarmLevelIds)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
