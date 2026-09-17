package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskInfoVo
 */
public class TaskInfoVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_list")

    private List<DateInfo> whiteList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_mode")

    private String vacuumMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_target")

    private String vacuumTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_paused")

    private Integer isPaused;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_threshold")

    private String vacuumThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_retrieving_space")

    private String vacuumRetrievingSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_priority")

    private List<TableInfoOpen> vacuumPriority = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    public TaskInfoVo withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 分类。 **默认取值**： VacuumFull
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public TaskInfoVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 描述信息。 **默认取值**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskInfoVo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 任务类型。 **默认取值**： Window：周期型任务； Date：单次型任务；
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TaskInfoVo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**： 任务ID。 **默认取值**： 不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskInfoVo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**： 任务名称。 **默认取值**： 不涉及。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskInfoVo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 任务开始时间。 **默认取值**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public TaskInfoVo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 任务结束时间。 **默认取值**： 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public TaskInfoVo withWhiteList(List<DateInfo> whiteList) {
        this.whiteList = whiteList;
        return this;
    }

    public TaskInfoVo addWhiteListItem(DateInfo whiteListItem) {
        if (this.whiteList == null) {
            this.whiteList = new ArrayList<>();
        }
        this.whiteList.add(whiteListItem);
        return this;
    }

    public TaskInfoVo withWhiteList(Consumer<List<DateInfo>> whiteListSetter) {
        if (this.whiteList == null) {
            this.whiteList = new ArrayList<>();
        }
        whiteListSetter.accept(this.whiteList);
        return this;
    }

    /**
     * **参数解释**： 任务时间窗。 **默认取值**： 不涉及。
     * @return whiteList
     */
    public List<DateInfo> getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(List<DateInfo> whiteList) {
        this.whiteList = whiteList;
    }

    public TaskInfoVo withVacuumMode(String vacuumMode) {
        this.vacuumMode = vacuumMode;
        return this;
    }

    /**
     * **参数解释**： 任务模式。 **默认取值**： manual：指定目标； auto：自动；
     * @return vacuumMode
     */
    public String getVacuumMode() {
        return vacuumMode;
    }

    public void setVacuumMode(String vacuumMode) {
        this.vacuumMode = vacuumMode;
    }

    public TaskInfoVo withVacuumTarget(String vacuumTarget) {
        this.vacuumTarget = vacuumTarget;
        return this;
    }

    /**
     * **参数解释**： 自动Vacuum目标。 **默认取值**： user_vacuumfull：用户表VacuumFull； system_vacuum：系统表VacuumFull；
     * @return vacuumTarget
     */
    public String getVacuumTarget() {
        return vacuumTarget;
    }

    public void setVacuumTarget(String vacuumTarget) {
        this.vacuumTarget = vacuumTarget;
    }

    public TaskInfoVo withIsPaused(Integer isPaused) {
        this.isPaused = isPaused;
        return this;
    }

    /**
     * **参数解释**： 是否暂停。 **默认取值**： 0：否； 1：是；
     * @return isPaused
     */
    public Integer getIsPaused() {
        return isPaused;
    }

    public void setIsPaused(Integer isPaused) {
        this.isPaused = isPaused;
    }

    public TaskInfoVo withVacuumThreshold(String vacuumThreshold) {
        this.vacuumThreshold = vacuumThreshold;
        return this;
    }

    /**
     * **参数解释**： 膨胀率，单位为百分比。 **默认取值**： 不涉及。
     * @return vacuumThreshold
     */
    public String getVacuumThreshold() {
        return vacuumThreshold;
    }

    public void setVacuumThreshold(String vacuumThreshold) {
        this.vacuumThreshold = vacuumThreshold;
    }

    public TaskInfoVo withVacuumRetrievingSpace(String vacuumRetrievingSpace) {
        this.vacuumRetrievingSpace = vacuumRetrievingSpace;
        return this;
    }

    /**
     * **参数解释**： 目标表可回收空间。 **默认取值**： 不涉及。
     * @return vacuumRetrievingSpace
     */
    public String getVacuumRetrievingSpace() {
        return vacuumRetrievingSpace;
    }

    public void setVacuumRetrievingSpace(String vacuumRetrievingSpace) {
        this.vacuumRetrievingSpace = vacuumRetrievingSpace;
    }

    public TaskInfoVo withVacuumPriority(List<TableInfoOpen> vacuumPriority) {
        this.vacuumPriority = vacuumPriority;
        return this;
    }

    public TaskInfoVo addVacuumPriorityItem(TableInfoOpen vacuumPriorityItem) {
        if (this.vacuumPriority == null) {
            this.vacuumPriority = new ArrayList<>();
        }
        this.vacuumPriority.add(vacuumPriorityItem);
        return this;
    }

    public TaskInfoVo withVacuumPriority(Consumer<List<TableInfoOpen>> vacuumPrioritySetter) {
        if (this.vacuumPriority == null) {
            this.vacuumPriority = new ArrayList<>();
        }
        vacuumPrioritySetter.accept(this.vacuumPriority);
        return this;
    }

    /**
     * **参数解释**： 优先Vacuum目标。 **默认取值**： 不涉及。
     * @return vacuumPriority
     */
    public List<TableInfoOpen> getVacuumPriority() {
        return vacuumPriority;
    }

    public void setVacuumPriority(List<TableInfoOpen> vacuumPriority) {
        this.vacuumPriority = vacuumPriority;
    }

    public TaskInfoVo withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * **参数解释**： 时区信息。 **默认取值**： 一般为null。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskInfoVo that = (TaskInfoVo) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.description, that.description)
            && Objects.equals(this.type, that.type) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.whiteList, that.whiteList)
            && Objects.equals(this.vacuumMode, that.vacuumMode) && Objects.equals(this.vacuumTarget, that.vacuumTarget)
            && Objects.equals(this.isPaused, that.isPaused)
            && Objects.equals(this.vacuumThreshold, that.vacuumThreshold)
            && Objects.equals(this.vacuumRetrievingSpace, that.vacuumRetrievingSpace)
            && Objects.equals(this.vacuumPriority, that.vacuumPriority) && Objects.equals(this.timeZone, that.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category,
            description,
            type,
            taskId,
            taskName,
            startTime,
            endTime,
            whiteList,
            vacuumMode,
            vacuumTarget,
            isPaused,
            vacuumThreshold,
            vacuumRetrievingSpace,
            vacuumPriority,
            timeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInfoVo {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    whiteList: ").append(toIndentedString(whiteList)).append("\n");
        sb.append("    vacuumMode: ").append(toIndentedString(vacuumMode)).append("\n");
        sb.append("    vacuumTarget: ").append(toIndentedString(vacuumTarget)).append("\n");
        sb.append("    isPaused: ").append(toIndentedString(isPaused)).append("\n");
        sb.append("    vacuumThreshold: ").append(toIndentedString(vacuumThreshold)).append("\n");
        sb.append("    vacuumRetrievingSpace: ").append(toIndentedString(vacuumRetrievingSpace)).append("\n");
        sb.append("    vacuumPriority: ").append(toIndentedString(vacuumPriority)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
