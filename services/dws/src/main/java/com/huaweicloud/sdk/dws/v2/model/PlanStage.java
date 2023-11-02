package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作计划阶段。
 */
public class PlanStage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "month")

    private String month;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day")

    private String day;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_id")

    private String stageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_name")

    private String stageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_valid_time")

    private String nextValidTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_list")

    private List<QueueResourceItem> queueList = null;

    public PlanStage withMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * 计划月份。
     * @return month
     */
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public PlanStage withDay(String day) {
        this.day = day;
        return this;
    }

    /**
     * 计划日期。
     * @return day
     */
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public PlanStage withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 计划ID。
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public PlanStage withStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }

    /**
     * 计划阶段ID。
     * @return stageId
     */
    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId;
    }

    public PlanStage withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * 计划阶段名称。
     * @return stageName
     */
    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public PlanStage withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 计划开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public PlanStage withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 计划结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public PlanStage withNextValidTime(String nextValidTime) {
        this.nextValidTime = nextValidTime;
        return this;
    }

    /**
     * 下次校验时间
     * @return nextValidTime
     */
    public String getNextValidTime() {
        return nextValidTime;
    }

    public void setNextValidTime(String nextValidTime) {
        this.nextValidTime = nextValidTime;
    }

    public PlanStage withQueueList(List<QueueResourceItem> queueList) {
        this.queueList = queueList;
        return this;
    }

    public PlanStage addQueueListItem(QueueResourceItem queueListItem) {
        if (this.queueList == null) {
            this.queueList = new ArrayList<>();
        }
        this.queueList.add(queueListItem);
        return this;
    }

    public PlanStage withQueueList(Consumer<List<QueueResourceItem>> queueListSetter) {
        if (this.queueList == null) {
            this.queueList = new ArrayList<>();
        }
        queueListSetter.accept(this.queueList);
        return this;
    }

    /**
     * 资源队列列表
     * @return queueList
     */
    public List<QueueResourceItem> getQueueList() {
        return queueList;
    }

    public void setQueueList(List<QueueResourceItem> queueList) {
        this.queueList = queueList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlanStage that = (PlanStage) obj;
        return Objects.equals(this.month, that.month) && Objects.equals(this.day, that.day)
            && Objects.equals(this.planId, that.planId) && Objects.equals(this.stageId, that.stageId)
            && Objects.equals(this.stageName, that.stageName) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.nextValidTime, that.nextValidTime)
            && Objects.equals(this.queueList, that.queueList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, day, planId, stageId, stageName, startTime, endTime, nextValidTime, queueList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanStage {\n");
        sb.append("    month: ").append(toIndentedString(month)).append("\n");
        sb.append("    day: ").append(toIndentedString(day)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
        sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    nextValidTime: ").append(toIndentedString(nextValidTime)).append("\n");
        sb.append("    queueList: ").append(toIndentedString(queueList)).append("\n");
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
