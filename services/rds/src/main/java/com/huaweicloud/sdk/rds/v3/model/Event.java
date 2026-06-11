package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件信息
 */
public class Event {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_time")

    private String sampleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_status")

    private String sessionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_event_type")

    private String waitEventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_event_name")

    private String waitEventName;

    public Event withSampleTime(String sampleTime) {
        this.sampleTime = sampleTime;
        return this;
    }

    /**
     * 采样时间
     * @return sampleTime
     */
    public String getSampleTime() {
        return sampleTime;
    }

    public void setSampleTime(String sampleTime) {
        this.sampleTime = sampleTime;
    }

    public Event withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Event withSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }

    /**
     * 会话状态
     * @return sessionStatus
     */
    public String getSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    public Event withWaitEventType(String waitEventType) {
        this.waitEventType = waitEventType;
        return this;
    }

    /**
     * 等待事件类型
     * @return waitEventType
     */
    public String getWaitEventType() {
        return waitEventType;
    }

    public void setWaitEventType(String waitEventType) {
        this.waitEventType = waitEventType;
    }

    public Event withWaitEventName(String waitEventName) {
        this.waitEventName = waitEventName;
        return this;
    }

    /**
     * 等待事件名称
     * @return waitEventName
     */
    public String getWaitEventName() {
        return waitEventName;
    }

    public void setWaitEventName(String waitEventName) {
        this.waitEventName = waitEventName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event that = (Event) obj;
        return Objects.equals(this.sampleTime, that.sampleTime) && Objects.equals(this.count, that.count)
            && Objects.equals(this.sessionStatus, that.sessionStatus)
            && Objects.equals(this.waitEventType, that.waitEventType)
            && Objects.equals(this.waitEventName, that.waitEventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sampleTime, count, sessionStatus, waitEventType, waitEventName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        sb.append("    sampleTime: ").append(toIndentedString(sampleTime)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    sessionStatus: ").append(toIndentedString(sessionStatus)).append("\n");
        sb.append("    waitEventType: ").append(toIndentedString(waitEventType)).append("\n");
        sb.append("    waitEventName: ").append(toIndentedString(waitEventName)).append("\n");
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
