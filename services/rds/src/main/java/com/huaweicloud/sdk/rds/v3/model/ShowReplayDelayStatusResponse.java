package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowReplayDelayStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_delay_time_mills")

    private Integer curDelayTimeMills;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_time_value_range")

    private String delayTimeValueRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_delay_time_mills")

    private Integer realDelayTimeMills;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_log_replay_paused")

    private Boolean curLogReplayPaused;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_receive_log")

    private String latestReceiveLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_replay_log")

    private String latestReplayLog;

    public ShowReplayDelayStatusResponse withCurDelayTimeMills(Integer curDelayTimeMills) {
        this.curDelayTimeMills = curDelayTimeMills;
        return this;
    }

    /**
     * 当前配置的延迟时间，单位ms
     * @return curDelayTimeMills
     */
    public Integer getCurDelayTimeMills() {
        return curDelayTimeMills;
    }

    public void setCurDelayTimeMills(Integer curDelayTimeMills) {
        this.curDelayTimeMills = curDelayTimeMills;
    }

    public ShowReplayDelayStatusResponse withDelayTimeValueRange(String delayTimeValueRange) {
        this.delayTimeValueRange = delayTimeValueRange;
        return this;
    }

    /**
     * 延迟时间参数取值范围
     * @return delayTimeValueRange
     */
    public String getDelayTimeValueRange() {
        return delayTimeValueRange;
    }

    public void setDelayTimeValueRange(String delayTimeValueRange) {
        this.delayTimeValueRange = delayTimeValueRange;
    }

    public ShowReplayDelayStatusResponse withRealDelayTimeMills(Integer realDelayTimeMills) {
        this.realDelayTimeMills = realDelayTimeMills;
        return this;
    }

    /**
     * 真实延迟时间，单位ms
     * @return realDelayTimeMills
     */
    public Integer getRealDelayTimeMills() {
        return realDelayTimeMills;
    }

    public void setRealDelayTimeMills(Integer realDelayTimeMills) {
        this.realDelayTimeMills = realDelayTimeMills;
    }

    public ShowReplayDelayStatusResponse withCurLogReplayPaused(Boolean curLogReplayPaused) {
        this.curLogReplayPaused = curLogReplayPaused;
        return this;
    }

    /**
     * 当前日志回放状态。true表示回放暂停，false表示回放正常
     * @return curLogReplayPaused
     */
    public Boolean getCurLogReplayPaused() {
        return curLogReplayPaused;
    }

    public void setCurLogReplayPaused(Boolean curLogReplayPaused) {
        this.curLogReplayPaused = curLogReplayPaused;
    }

    public ShowReplayDelayStatusResponse withLatestReceiveLog(String latestReceiveLog) {
        this.latestReceiveLog = latestReceiveLog;
        return this;
    }

    /**
     * 最新接收的日志
     * @return latestReceiveLog
     */
    public String getLatestReceiveLog() {
        return latestReceiveLog;
    }

    public void setLatestReceiveLog(String latestReceiveLog) {
        this.latestReceiveLog = latestReceiveLog;
    }

    public ShowReplayDelayStatusResponse withLatestReplayLog(String latestReplayLog) {
        this.latestReplayLog = latestReplayLog;
        return this;
    }

    /**
     * 最新回放的日志位点
     * @return latestReplayLog
     */
    public String getLatestReplayLog() {
        return latestReplayLog;
    }

    public void setLatestReplayLog(String latestReplayLog) {
        this.latestReplayLog = latestReplayLog;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReplayDelayStatusResponse that = (ShowReplayDelayStatusResponse) obj;
        return Objects.equals(this.curDelayTimeMills, that.curDelayTimeMills)
            && Objects.equals(this.delayTimeValueRange, that.delayTimeValueRange)
            && Objects.equals(this.realDelayTimeMills, that.realDelayTimeMills)
            && Objects.equals(this.curLogReplayPaused, that.curLogReplayPaused)
            && Objects.equals(this.latestReceiveLog, that.latestReceiveLog)
            && Objects.equals(this.latestReplayLog, that.latestReplayLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(curDelayTimeMills,
            delayTimeValueRange,
            realDelayTimeMills,
            curLogReplayPaused,
            latestReceiveLog,
            latestReplayLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReplayDelayStatusResponse {\n");
        sb.append("    curDelayTimeMills: ").append(toIndentedString(curDelayTimeMills)).append("\n");
        sb.append("    delayTimeValueRange: ").append(toIndentedString(delayTimeValueRange)).append("\n");
        sb.append("    realDelayTimeMills: ").append(toIndentedString(realDelayTimeMills)).append("\n");
        sb.append("    curLogReplayPaused: ").append(toIndentedString(curLogReplayPaused)).append("\n");
        sb.append("    latestReceiveLog: ").append(toIndentedString(latestReceiveLog)).append("\n");
        sb.append("    latestReplayLog: ").append(toIndentedString(latestReplayLog)).append("\n");
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
