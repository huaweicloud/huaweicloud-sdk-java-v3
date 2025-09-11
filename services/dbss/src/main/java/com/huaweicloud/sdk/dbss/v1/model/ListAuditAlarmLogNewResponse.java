package com.huaweicloud.sdk.dbss.v1.model;

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
public class ListAuditAlarmLogNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_log")

    private List<AlarmLogResponseNewAlarmLog> alarmLog = null;

    public ListAuditAlarmLogNewResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 总条数
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListAuditAlarmLogNewResponse withAlarmLog(List<AlarmLogResponseNewAlarmLog> alarmLog) {
        this.alarmLog = alarmLog;
        return this;
    }

    public ListAuditAlarmLogNewResponse addAlarmLogItem(AlarmLogResponseNewAlarmLog alarmLogItem) {
        if (this.alarmLog == null) {
            this.alarmLog = new ArrayList<>();
        }
        this.alarmLog.add(alarmLogItem);
        return this;
    }

    public ListAuditAlarmLogNewResponse withAlarmLog(Consumer<List<AlarmLogResponseNewAlarmLog>> alarmLogSetter) {
        if (this.alarmLog == null) {
            this.alarmLog = new ArrayList<>();
        }
        alarmLogSetter.accept(this.alarmLog);
        return this;
    }

    /**
     * 告警列表
     * @return alarmLog
     */
    public List<AlarmLogResponseNewAlarmLog> getAlarmLog() {
        return alarmLog;
    }

    public void setAlarmLog(List<AlarmLogResponseNewAlarmLog> alarmLog) {
        this.alarmLog = alarmLog;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuditAlarmLogNewResponse that = (ListAuditAlarmLogNewResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.alarmLog, that.alarmLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, alarmLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditAlarmLogNewResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    alarmLog: ").append(toIndentedString(alarmLog)).append("\n");
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
