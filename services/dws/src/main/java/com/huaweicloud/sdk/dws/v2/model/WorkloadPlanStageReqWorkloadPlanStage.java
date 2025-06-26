package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 资源管理计划阶段详情。 **取值范围**： 不涉及。
 */
public class WorkloadPlanStageReqWorkloadPlanStage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day")

    private String day;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "month")

    private String month;

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
    @JsonProperty(value = "queue_list")

    private List<QueueResourceItem> queueList = null;

    public WorkloadPlanStageReqWorkloadPlanStage withDay(String day) {
        this.day = day;
        return this;
    }

    /**
     * **参数解释**： 日期。 **取值范围**： 不涉及。
     * @return day
     */
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public WorkloadPlanStageReqWorkloadPlanStage withMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * **参数解释**： 月份。 **取值范围**： 不涉及。
     * @return month
     */
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public WorkloadPlanStageReqWorkloadPlanStage withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * **参数解释**： 计划阶段。 **取值范围**： 不涉及。
     * @return stageName
     */
    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public WorkloadPlanStageReqWorkloadPlanStage withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 开始时间。 **取值范围**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public WorkloadPlanStageReqWorkloadPlanStage withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间。 **取值范围**： 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public WorkloadPlanStageReqWorkloadPlanStage withQueueList(List<QueueResourceItem> queueList) {
        this.queueList = queueList;
        return this;
    }

    public WorkloadPlanStageReqWorkloadPlanStage addQueueListItem(QueueResourceItem queueListItem) {
        if (this.queueList == null) {
            this.queueList = new ArrayList<>();
        }
        this.queueList.add(queueListItem);
        return this;
    }

    public WorkloadPlanStageReqWorkloadPlanStage withQueueList(Consumer<List<QueueResourceItem>> queueListSetter) {
        if (this.queueList == null) {
            this.queueList = new ArrayList<>();
        }
        queueListSetter.accept(this.queueList);
        return this;
    }

    /**
     * **参数解释**： 资源队列。 **取值范围**： 不涉及。
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
        WorkloadPlanStageReqWorkloadPlanStage that = (WorkloadPlanStageReqWorkloadPlanStage) obj;
        return Objects.equals(this.day, that.day) && Objects.equals(this.month, that.month)
            && Objects.equals(this.stageName, that.stageName) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.queueList, that.queueList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, stageName, startTime, endTime, queueList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadPlanStageReqWorkloadPlanStage {\n");
        sb.append("    day: ").append(toIndentedString(day)).append("\n");
        sb.append("    month: ").append(toIndentedString(month)).append("\n");
        sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
