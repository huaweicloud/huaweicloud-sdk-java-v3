package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskStatusOpenResp
 */
public class TaskStatusOpenResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_dead_line")

    private String taskDeadLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_left")

    private String timeLeft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_percentage")

    private String finishedPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuumed_space")

    private String vacuumedSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_vacuum_info")

    private TableVacuumInfoOpen tableVacuumInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vacuum_info")

    private List<Object> vacuumInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_vacuum_num_info")

    private TableVacuumNumInfo tableVacuumNumInfo;

    public TaskStatusOpenResp withTaskId(String taskId) {
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

    public TaskStatusOpenResp withTaskDeadLine(String taskDeadLine) {
        this.taskDeadLine = taskDeadLine;
        return this;
    }

    /**
     * **参数解释**： 任务截止时间。 **默认取值**： 不涉及。
     * @return taskDeadLine
     */
    public String getTaskDeadLine() {
        return taskDeadLine;
    }

    public void setTaskDeadLine(String taskDeadLine) {
        this.taskDeadLine = taskDeadLine;
    }

    public TaskStatusOpenResp withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 分类信息。 **默认取值**： VacuumFull
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public TaskStatusOpenResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 状态。 **默认取值**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TaskStatusOpenResp withTimeLeft(String timeLeft) {
        this.timeLeft = timeLeft;
        return this;
    }

    /**
     * **参数解释**： 剩余时间。 **默认取值**： 不涉及。
     * @return timeLeft
     */
    public String getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(String timeLeft) {
        this.timeLeft = timeLeft;
    }

    public TaskStatusOpenResp withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 开始时间。 **默认取值**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public TaskStatusOpenResp withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 结束时间。 **默认取值**： 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public TaskStatusOpenResp withFinishedPercentage(String finishedPercentage) {
        this.finishedPercentage = finishedPercentage;
        return this;
    }

    /**
     * **参数解释**： 完成百分比。 **默认取值**： 不涉及。
     * @return finishedPercentage
     */
    public String getFinishedPercentage() {
        return finishedPercentage;
    }

    public void setFinishedPercentage(String finishedPercentage) {
        this.finishedPercentage = finishedPercentage;
    }

    public TaskStatusOpenResp withVacuumedSpace(String vacuumedSpace) {
        this.vacuumedSpace = vacuumedSpace;
        return this;
    }

    /**
     * **参数解释**： 任务ID。 **默认取值**： 不涉及。
     * @return vacuumedSpace
     */
    public String getVacuumedSpace() {
        return vacuumedSpace;
    }

    public void setVacuumedSpace(String vacuumedSpace) {
        this.vacuumedSpace = vacuumedSpace;
    }

    public TaskStatusOpenResp withTableVacuumInfo(TableVacuumInfoOpen tableVacuumInfo) {
        this.tableVacuumInfo = tableVacuumInfo;
        return this;
    }

    public TaskStatusOpenResp withTableVacuumInfo(Consumer<TableVacuumInfoOpen> tableVacuumInfoSetter) {
        if (this.tableVacuumInfo == null) {
            this.tableVacuumInfo = new TableVacuumInfoOpen();
            tableVacuumInfoSetter.accept(this.tableVacuumInfo);
        }

        return this;
    }

    /**
     * Get tableVacuumInfo
     * @return tableVacuumInfo
     */
    public TableVacuumInfoOpen getTableVacuumInfo() {
        return tableVacuumInfo;
    }

    public void setTableVacuumInfo(TableVacuumInfoOpen tableVacuumInfo) {
        this.tableVacuumInfo = tableVacuumInfo;
    }

    public TaskStatusOpenResp withVacuumInfo(List<Object> vacuumInfo) {
        this.vacuumInfo = vacuumInfo;
        return this;
    }

    public TaskStatusOpenResp addVacuumInfoItem(Object vacuumInfoItem) {
        if (this.vacuumInfo == null) {
            this.vacuumInfo = new ArrayList<>();
        }
        this.vacuumInfo.add(vacuumInfoItem);
        return this;
    }

    public TaskStatusOpenResp withVacuumInfo(Consumer<List<Object>> vacuumInfoSetter) {
        if (this.vacuumInfo == null) {
            this.vacuumInfo = new ArrayList<>();
        }
        vacuumInfoSetter.accept(this.vacuumInfo);
        return this;
    }

    /**
     * **参数解释**： Vacuum信息。 **默认取值**： 不涉及。
     * @return vacuumInfo
     */
    public List<Object> getVacuumInfo() {
        return vacuumInfo;
    }

    public void setVacuumInfo(List<Object> vacuumInfo) {
        this.vacuumInfo = vacuumInfo;
    }

    public TaskStatusOpenResp withTableVacuumNumInfo(TableVacuumNumInfo tableVacuumNumInfo) {
        this.tableVacuumNumInfo = tableVacuumNumInfo;
        return this;
    }

    public TaskStatusOpenResp withTableVacuumNumInfo(Consumer<TableVacuumNumInfo> tableVacuumNumInfoSetter) {
        if (this.tableVacuumNumInfo == null) {
            this.tableVacuumNumInfo = new TableVacuumNumInfo();
            tableVacuumNumInfoSetter.accept(this.tableVacuumNumInfo);
        }

        return this;
    }

    /**
     * Get tableVacuumNumInfo
     * @return tableVacuumNumInfo
     */
    public TableVacuumNumInfo getTableVacuumNumInfo() {
        return tableVacuumNumInfo;
    }

    public void setTableVacuumNumInfo(TableVacuumNumInfo tableVacuumNumInfo) {
        this.tableVacuumNumInfo = tableVacuumNumInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskStatusOpenResp that = (TaskStatusOpenResp) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskDeadLine, that.taskDeadLine)
            && Objects.equals(this.category, that.category) && Objects.equals(this.status, that.status)
            && Objects.equals(this.timeLeft, that.timeLeft) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.finishedPercentage, that.finishedPercentage)
            && Objects.equals(this.vacuumedSpace, that.vacuumedSpace)
            && Objects.equals(this.tableVacuumInfo, that.tableVacuumInfo)
            && Objects.equals(this.vacuumInfo, that.vacuumInfo)
            && Objects.equals(this.tableVacuumNumInfo, that.tableVacuumNumInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskDeadLine,
            category,
            status,
            timeLeft,
            startTime,
            endTime,
            finishedPercentage,
            vacuumedSpace,
            tableVacuumInfo,
            vacuumInfo,
            tableVacuumNumInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskStatusOpenResp {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskDeadLine: ").append(toIndentedString(taskDeadLine)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    timeLeft: ").append(toIndentedString(timeLeft)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    finishedPercentage: ").append(toIndentedString(finishedPercentage)).append("\n");
        sb.append("    vacuumedSpace: ").append(toIndentedString(vacuumedSpace)).append("\n");
        sb.append("    tableVacuumInfo: ").append(toIndentedString(tableVacuumInfo)).append("\n");
        sb.append("    vacuumInfo: ").append(toIndentedString(vacuumInfo)).append("\n");
        sb.append("    tableVacuumNumInfo: ").append(toIndentedString(tableVacuumNumInfo)).append("\n");
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
