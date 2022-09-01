package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SQL作业。
 */
public class Schedule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cron_expression")

    @JacksonXmlProperty(localName = "cron_expression")

    private String cronExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computing_resource_id")

    @JacksonXmlProperty(localName = "computing_resource_id")

    private String computingResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    @JacksonXmlProperty(localName = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf")

    @JacksonXmlProperty(localName = "conf")

    private List<String> conf = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_status")

    @JacksonXmlProperty(localName = "schedule_status")

    private String scheduleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_fire_time")

    @JacksonXmlProperty(localName = "next_fire_time")

    private String nextFireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prev_fire_time")

    @JacksonXmlProperty(localName = "prev_fire_time")

    private String prevFireTime;

    public Schedule withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 调度开始时间。时间格式为ISO时区日期时间。例如2021-03-03T10:15:30+08:00
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public Schedule withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 调度结束时间。时间格式为ISO时区日期时间。例如2021-03-03T10:15:30+08:00
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Schedule withCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }

    /**
     * Cron表达式，格式为<秒> <分> <时> <天> <月> <星期>
     * @return cronExpression
     */
    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public Schedule withComputingResourceId(String computingResourceId) {
        this.computingResourceId = computingResourceId;
        return this;
    }

    /**
     * 计算资源ID。
     * @return computingResourceId
     */
    public String getComputingResourceId() {
        return computingResourceId;
    }

    public void setComputingResourceId(String computingResourceId) {
        this.computingResourceId = computingResourceId;
    }

    public Schedule withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 调度启用状态. true: 调度中；false：停止调度。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Schedule withConf(List<String> conf) {
        this.conf = conf;
        return this;
    }

    public Schedule addConfItem(String confItem) {
        if (this.conf == null) {
            this.conf = new ArrayList<>();
        }
        this.conf.add(confItem);
        return this;
    }

    public Schedule withConf(Consumer<List<String>> confSetter) {
        if (this.conf == null) {
            this.conf = new ArrayList<>();
        }
        confSetter.accept(this.conf);
        return this;
    }

    /**
     * 作业运行配置信息。
     * @return conf
     */
    public List<String> getConf() {
        return conf;
    }

    public void setConf(List<String> conf) {
        this.conf = conf;
    }

    public Schedule withScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }

    /**
     * 仅在查询作业和查询所有作业接口的响应返回。调度状态。1:NORMAL, 2:PAUSED, 3:COMPLETE, 4:ERROR, 5:BLOCKED
     * @return scheduleStatus
     */
    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public Schedule withNextFireTime(String nextFireTime) {
        this.nextFireTime = nextFireTime;
        return this;
    }

    /**
     * 仅在查询作业和查询所有作业接口的响应返回。上一次调度开始时间。
     * @return nextFireTime
     */
    public String getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(String nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    public Schedule withPrevFireTime(String prevFireTime) {
        this.prevFireTime = prevFireTime;
        return this;
    }

    /**
     * 仅在查询作业和查询所有作业接口的响应返回。下一次调度开始时间。
     * @return prevFireTime
     */
    public String getPrevFireTime() {
        return prevFireTime;
    }

    public void setPrevFireTime(String prevFireTime) {
        this.prevFireTime = prevFireTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Schedule schedule = (Schedule) o;
        return Objects.equals(this.startTime, schedule.startTime) && Objects.equals(this.endTime, schedule.endTime)
            && Objects.equals(this.cronExpression, schedule.cronExpression)
            && Objects.equals(this.computingResourceId, schedule.computingResourceId)
            && Objects.equals(this.enable, schedule.enable) && Objects.equals(this.conf, schedule.conf)
            && Objects.equals(this.scheduleStatus, schedule.scheduleStatus)
            && Objects.equals(this.nextFireTime, schedule.nextFireTime)
            && Objects.equals(this.prevFireTime, schedule.prevFireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime,
            endTime,
            cronExpression,
            computingResourceId,
            enable,
            conf,
            scheduleStatus,
            nextFireTime,
            prevFireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Schedule {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
        sb.append("    computingResourceId: ").append(toIndentedString(computingResourceId)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
        sb.append("    scheduleStatus: ").append(toIndentedString(scheduleStatus)).append("\n");
        sb.append("    nextFireTime: ").append(toIndentedString(nextFireTime)).append("\n");
        sb.append("    prevFireTime: ").append(toIndentedString(prevFireTime)).append("\n");
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
