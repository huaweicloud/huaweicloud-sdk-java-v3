package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除告警白名单列表
 */
public class RemoveAlarmWhiteListRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<AlarmWhiteListRequestInfo> dataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_alarm")

    private Boolean restoreAlarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_all")

    private Boolean deleteAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private Integer eventType;

    public RemoveAlarmWhiteListRequestInfo withDataList(List<AlarmWhiteListRequestInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public RemoveAlarmWhiteListRequestInfo addDataListItem(AlarmWhiteListRequestInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public RemoveAlarmWhiteListRequestInfo withDataList(Consumer<List<AlarmWhiteListRequestInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 删除告警白名单详情
     * @return dataList
     */
    public List<AlarmWhiteListRequestInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<AlarmWhiteListRequestInfo> dataList) {
        this.dataList = dataList;
    }

    public RemoveAlarmWhiteListRequestInfo withRestoreAlarm(Boolean restoreAlarm) {
        this.restoreAlarm = restoreAlarm;
        return this;
    }

    /**
     * 是否需要恢复相关告警,默认 false
     * @return restoreAlarm
     */
    public Boolean getRestoreAlarm() {
        return restoreAlarm;
    }

    public void setRestoreAlarm(Boolean restoreAlarm) {
        this.restoreAlarm = restoreAlarm;
    }

    public RemoveAlarmWhiteListRequestInfo withDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
        return this;
    }

    /**
     * 是否删除所有白名单内容
     * @return deleteAll
     */
    public Boolean getDeleteAll() {
        return deleteAll;
    }

    public void setDeleteAll(Boolean deleteAll) {
        this.deleteAll = deleteAll;
    }

    public RemoveAlarmWhiteListRequestInfo withEventType(Integer eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型
     * @return eventType
     */
    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoveAlarmWhiteListRequestInfo that = (RemoveAlarmWhiteListRequestInfo) obj;
        return Objects.equals(this.dataList, that.dataList) && Objects.equals(this.restoreAlarm, that.restoreAlarm)
            && Objects.equals(this.deleteAll, that.deleteAll) && Objects.equals(this.eventType, that.eventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataList, restoreAlarm, deleteAll, eventType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveAlarmWhiteListRequestInfo {\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
        sb.append("    restoreAlarm: ").append(toIndentedString(restoreAlarm)).append("\n");
        sb.append("    deleteAll: ").append(toIndentedString(deleteAll)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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
