package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskInfo
 */
public class TaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_mode")

    private String vacuumMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_target")

    private String vacuumTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_threshold")

    private String vacuumThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_retrieving_space")

    private String vacuumRetrievingSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_priority")

    private String vacuumPriority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private List<TableInfoOpen> priority = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    public TaskInfo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**： 任务名称。 **约束限制**： 不涉及。 **取值范围**： 非null。 **默认取值**： 不涉及。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 描述信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 开始时间。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public TaskInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间。 **约束限制**： 不涉及。 **取值范围**： 非null。 **默认取值**： 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public TaskInfo withWhiteList(List<DateInfo> whiteList) {
        this.whiteList = whiteList;
        return this;
    }

    public TaskInfo addWhiteListItem(DateInfo whiteListItem) {
        if (this.whiteList == null) {
            this.whiteList = new ArrayList<>();
        }
        this.whiteList.add(whiteListItem);
        return this;
    }

    public TaskInfo withWhiteList(Consumer<List<DateInfo>> whiteListSetter) {
        if (this.whiteList == null) {
            this.whiteList = new ArrayList<>();
        }
        whiteListSetter.accept(this.whiteList);
        return this;
    }

    /**
     * **参数解释**： 执行计划。 **约束限制**： 不涉及。 **取值范围**： 非null。 **默认取值**： 不涉及。
     * @return whiteList
     */
    public List<DateInfo> getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(List<DateInfo> whiteList) {
        this.whiteList = whiteList;
    }

    public TaskInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 任务类型。 **约束限制**： 不涉及。 **取值范围**： Date：单次型任务； Window：周期型任务； **默认取值**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TaskInfo withVacuumMode(String vacuumMode) {
        this.vacuumMode = vacuumMode;
        return this;
    }

    /**
     * **参数解释**： 任务模式。 **约束限制**： 不涉及。 **取值范围**： 非null。 **默认取值**： 不涉及。
     * @return vacuumMode
     */
    public String getVacuumMode() {
        return vacuumMode;
    }

    public void setVacuumMode(String vacuumMode) {
        this.vacuumMode = vacuumMode;
    }

    public TaskInfo withVacuumTarget(String vacuumTarget) {
        this.vacuumTarget = vacuumTarget;
        return this;
    }

    /**
     * **参数解释**： 自动Vacuum目标。 **约束限制**： 不涉及。 **取值范围**： user_vacuumfull：用户表VacuumFull； system_vacuum：系统表VacuumFull； **默认取值**： 不涉及。
     * @return vacuumTarget
     */
    public String getVacuumTarget() {
        return vacuumTarget;
    }

    public void setVacuumTarget(String vacuumTarget) {
        this.vacuumTarget = vacuumTarget;
    }

    public TaskInfo withVacuumThreshold(String vacuumThreshold) {
        this.vacuumThreshold = vacuumThreshold;
        return this;
    }

    /**
     * **参数解释**： 膨胀率，单位为百分比。 **约束限制**： 不涉及。 **取值范围**： 建议设置为当前集群空间使用率+10%，且最大不超过80%。 **默认取值**： 不涉及。
     * @return vacuumThreshold
     */
    public String getVacuumThreshold() {
        return vacuumThreshold;
    }

    public void setVacuumThreshold(String vacuumThreshold) {
        this.vacuumThreshold = vacuumThreshold;
    }

    public TaskInfo withVacuumRetrievingSpace(String vacuumRetrievingSpace) {
        this.vacuumRetrievingSpace = vacuumRetrievingSpace;
        return this;
    }

    /**
     * **参数解释**： 目标表可回收空间。 **约束限制**： 不涉及。 **取值范围**： 非null。 **默认取值**： 不涉及。
     * @return vacuumRetrievingSpace
     */
    public String getVacuumRetrievingSpace() {
        return vacuumRetrievingSpace;
    }

    public void setVacuumRetrievingSpace(String vacuumRetrievingSpace) {
        this.vacuumRetrievingSpace = vacuumRetrievingSpace;
    }

    public TaskInfo withVacuumPriority(String vacuumPriority) {
        this.vacuumPriority = vacuumPriority;
        return this;
    }

    /**
     * **参数解释**： 优先级。 **约束限制**： 不涉及。 **取值范围**： 非null。 **默认取值**： 不涉及。
     * @return vacuumPriority
     */
    public String getVacuumPriority() {
        return vacuumPriority;
    }

    public void setVacuumPriority(String vacuumPriority) {
        this.vacuumPriority = vacuumPriority;
    }

    public TaskInfo withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * **参数解释**： 时区偏移信息。 **约束限制**： 不涉及。 **取值范围**： -2659~+2459 **默认取值**： 不涉及。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public TaskInfo withPriority(List<TableInfoOpen> priority) {
        this.priority = priority;
        return this;
    }

    public TaskInfo addPriorityItem(TableInfoOpen priorityItem) {
        if (this.priority == null) {
            this.priority = new ArrayList<>();
        }
        this.priority.add(priorityItem);
        return this;
    }

    public TaskInfo withPriority(Consumer<List<TableInfoOpen>> prioritySetter) {
        if (this.priority == null) {
            this.priority = new ArrayList<>();
        }
        prioritySetter.accept(this.priority);
        return this;
    }

    /**
     * **参数解释**： 优先级表信息。 **默认取值**： 不涉及。
     * @return priority
     */
    public List<TableInfoOpen> getPriority() {
        return priority;
    }

    public void setPriority(List<TableInfoOpen> priority) {
        this.priority = priority;
    }

    public TaskInfo withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 分类信息。 **默认取值**： Vacuum
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskInfo that = (TaskInfo) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.whiteList, that.whiteList) && Objects.equals(this.type, that.type)
            && Objects.equals(this.vacuumMode, that.vacuumMode) && Objects.equals(this.vacuumTarget, that.vacuumTarget)
            && Objects.equals(this.vacuumThreshold, that.vacuumThreshold)
            && Objects.equals(this.vacuumRetrievingSpace, that.vacuumRetrievingSpace)
            && Objects.equals(this.vacuumPriority, that.vacuumPriority) && Objects.equals(this.timeZone, that.timeZone)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName,
            description,
            startTime,
            endTime,
            whiteList,
            type,
            vacuumMode,
            vacuumTarget,
            vacuumThreshold,
            vacuumRetrievingSpace,
            vacuumPriority,
            timeZone,
            priority,
            category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInfo {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    whiteList: ").append(toIndentedString(whiteList)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vacuumMode: ").append(toIndentedString(vacuumMode)).append("\n");
        sb.append("    vacuumTarget: ").append(toIndentedString(vacuumTarget)).append("\n");
        sb.append("    vacuumThreshold: ").append(toIndentedString(vacuumThreshold)).append("\n");
        sb.append("    vacuumRetrievingSpace: ").append(toIndentedString(vacuumRetrievingSpace)).append("\n");
        sb.append("    vacuumPriority: ").append(toIndentedString(vacuumPriority)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
