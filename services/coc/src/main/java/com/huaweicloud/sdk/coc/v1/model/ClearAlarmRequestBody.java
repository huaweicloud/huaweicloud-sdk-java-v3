package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClearAlarmRequestBody
 */
public class ClearAlarmRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_ids")

    private String alarmIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_service_interrupt")

    private Boolean isServiceInterrupt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault_recovery_time")

    private Long faultRecoveryTime;

    public ClearAlarmRequestBody withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 清除备注
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public ClearAlarmRequestBody withAlarmIds(String alarmIds) {
        this.alarmIds = alarmIds;
        return this;
    }

    /**
     * 告警id拼接字符串，以”，“分隔
     * @return alarmIds
     */
    public String getAlarmIds() {
        return alarmIds;
    }

    public void setAlarmIds(String alarmIds) {
        this.alarmIds = alarmIds;
    }

    public ClearAlarmRequestBody withIsServiceInterrupt(Boolean isServiceInterrupt) {
        this.isServiceInterrupt = isServiceInterrupt;
        return this;
    }

    /**
     * 业务是否中断
     * @return isServiceInterrupt
     */
    public Boolean getIsServiceInterrupt() {
        return isServiceInterrupt;
    }

    public void setIsServiceInterrupt(Boolean isServiceInterrupt) {
        this.isServiceInterrupt = isServiceInterrupt;
    }

    public ClearAlarmRequestBody withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 故障发生时间
     * minimum: 0
     * maximum: 9000000000000000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ClearAlarmRequestBody withFaultRecoveryTime(Long faultRecoveryTime) {
        this.faultRecoveryTime = faultRecoveryTime;
        return this;
    }

    /**
     * 故障恢复时间
     * minimum: 0
     * maximum: 9000000000000000
     * @return faultRecoveryTime
     */
    public Long getFaultRecoveryTime() {
        return faultRecoveryTime;
    }

    public void setFaultRecoveryTime(Long faultRecoveryTime) {
        this.faultRecoveryTime = faultRecoveryTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClearAlarmRequestBody that = (ClearAlarmRequestBody) obj;
        return Objects.equals(this.remarks, that.remarks) && Objects.equals(this.alarmIds, that.alarmIds)
            && Objects.equals(this.isServiceInterrupt, that.isServiceInterrupt)
            && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.faultRecoveryTime, that.faultRecoveryTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remarks, alarmIds, isServiceInterrupt, startTime, faultRecoveryTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClearAlarmRequestBody {\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    alarmIds: ").append(toIndentedString(alarmIds)).append("\n");
        sb.append("    isServiceInterrupt: ").append(toIndentedString(isServiceInterrupt)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    faultRecoveryTime: ").append(toIndentedString(faultRecoveryTime)).append("\n");
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
