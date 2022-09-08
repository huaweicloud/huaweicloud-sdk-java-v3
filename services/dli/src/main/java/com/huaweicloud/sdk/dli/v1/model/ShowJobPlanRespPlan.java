package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询作业执行计划。
 */
public class ShowJobPlanRespPlan {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jid")

    private String jid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isStoppable")

    private Boolean isStoppable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start-time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end-time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    public ShowJobPlanRespPlan withJid(String jid) {
        this.jid = jid;
        return this;
    }

    /**
     * flink作业id。
     * @return jid
     */
    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public ShowJobPlanRespPlan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * flink作业名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowJobPlanRespPlan withIsStoppable(Boolean isStoppable) {
        this.isStoppable = isStoppable;
        return this;
    }

    /**
     * 是否可停止。
     * @return isStoppable
     */
    public Boolean getIsStoppable() {
        return isStoppable;
    }

    public void setIsStoppable(Boolean isStoppable) {
        this.isStoppable = isStoppable;
    }

    public ShowJobPlanRespPlan withState(String state) {
        this.state = state;
        return this;
    }

    /**
     *  作业运行状态。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowJobPlanRespPlan withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 作业启动时间。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowJobPlanRespPlan withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 作业停止时间。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowJobPlanRespPlan withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 作业运行时长。
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobPlanRespPlan showJobPlanRespPlan = (ShowJobPlanRespPlan) o;
        return Objects.equals(this.jid, showJobPlanRespPlan.jid) && Objects.equals(this.name, showJobPlanRespPlan.name)
            && Objects.equals(this.isStoppable, showJobPlanRespPlan.isStoppable)
            && Objects.equals(this.state, showJobPlanRespPlan.state)
            && Objects.equals(this.startTime, showJobPlanRespPlan.startTime)
            && Objects.equals(this.endTime, showJobPlanRespPlan.endTime)
            && Objects.equals(this.duration, showJobPlanRespPlan.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jid, name, isStoppable, state, startTime, endTime, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobPlanRespPlan {\n");
        sb.append("    jid: ").append(toIndentedString(jid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isStoppable: ").append(toIndentedString(isStoppable)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
