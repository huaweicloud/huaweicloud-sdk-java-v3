package com.huaweicloud.sdk.antiddos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * EIP异常事件响应体
 */
public class DailyLog  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private Long startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private Long endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger_bps")
    
    private Integer triggerBps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger_pps")
    
    private Integer triggerPps;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger_http_pps")
    
    private Integer triggerHttpPps;

    public DailyLog withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public DailyLog withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public DailyLog withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 防护状态，可选范围： - 1：表示清洗 - 2：表示黑洞
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DailyLog withTriggerBps(Integer triggerBps) {
        this.triggerBps = triggerBps;
        return this;
    }

    


    /**
     * 触发时流量
     * @return triggerBps
     */
    public Integer getTriggerBps() {
        return triggerBps;
    }

    public void setTriggerBps(Integer triggerBps) {
        this.triggerBps = triggerBps;
    }

    public DailyLog withTriggerPps(Integer triggerPps) {
        this.triggerPps = triggerPps;
        return this;
    }

    


    /**
     * 触发时报文速率
     * @return triggerPps
     */
    public Integer getTriggerPps() {
        return triggerPps;
    }

    public void setTriggerPps(Integer triggerPps) {
        this.triggerPps = triggerPps;
    }

    public DailyLog withTriggerHttpPps(Integer triggerHttpPps) {
        this.triggerHttpPps = triggerHttpPps;
        return this;
    }

    


    /**
     * 触发时HTTP请求速率
     * @return triggerHttpPps
     */
    public Integer getTriggerHttpPps() {
        return triggerHttpPps;
    }

    public void setTriggerHttpPps(Integer triggerHttpPps) {
        this.triggerHttpPps = triggerHttpPps;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DailyLog dailyLog = (DailyLog) o;
        return Objects.equals(this.startTime, dailyLog.startTime) &&
            Objects.equals(this.endTime, dailyLog.endTime) &&
            Objects.equals(this.status, dailyLog.status) &&
            Objects.equals(this.triggerBps, dailyLog.triggerBps) &&
            Objects.equals(this.triggerPps, dailyLog.triggerPps) &&
            Objects.equals(this.triggerHttpPps, dailyLog.triggerHttpPps);
    }
    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, status, triggerBps, triggerPps, triggerHttpPps);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DailyLog {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    triggerBps: ").append(toIndentedString(triggerBps)).append("\n");
        sb.append("    triggerPps: ").append(toIndentedString(triggerPps)).append("\n");
        sb.append("    triggerHttpPps: ").append(toIndentedString(triggerHttpPps)).append("\n");
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

