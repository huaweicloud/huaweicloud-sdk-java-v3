package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateScheduleTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_status")

    private ScheduleTaskStatus lastStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private ScheduleTaskTypeEnum taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_cron")

    private String taskCron;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_execution_time")

    private String nextExecutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_task_policy")

    private ScheduleTaskPolicy scheduleTaskPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_type")

    private ScheduledTypeEnum scheduledType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day_interval")

    private Integer dayInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "week_list")

    private String weekList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "month_list")

    private String monthList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_list")

    private String dateList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_date")

    private String scheduledDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduled_time")

    private String scheduledTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private OffsetDateTime expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enable")

    private Boolean isEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public UpdateScheduleTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 定时任务主键id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateScheduleTaskResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public UpdateScheduleTaskResponse withLastStatus(ScheduleTaskStatus lastStatus) {
        this.lastStatus = lastStatus;
        return this;
    }

    /**
     * Get lastStatus
     * @return lastStatus
     */
    public ScheduleTaskStatus getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(ScheduleTaskStatus lastStatus) {
        this.lastStatus = lastStatus;
    }

    public UpdateScheduleTaskResponse withTaskType(ScheduleTaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * Get taskType
     * @return taskType
     */
    public ScheduleTaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(ScheduleTaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public UpdateScheduleTaskResponse withTaskCron(String taskCron) {
        this.taskCron = taskCron;
        return this;
    }

    /**
     * 定时任务表达式。
     * @return taskCron
     */
    public String getTaskCron() {
        return taskCron;
    }

    public void setTaskCron(String taskCron) {
        this.taskCron = taskCron;
    }

    public UpdateScheduleTaskResponse withNextExecutionTime(String nextExecutionTime) {
        this.nextExecutionTime = nextExecutionTime;
        return this;
    }

    /**
     * 下一次执行时间。
     * @return nextExecutionTime
     */
    public String getNextExecutionTime() {
        return nextExecutionTime;
    }

    public void setNextExecutionTime(String nextExecutionTime) {
        this.nextExecutionTime = nextExecutionTime;
    }

    public UpdateScheduleTaskResponse withScheduleTaskPolicy(ScheduleTaskPolicy scheduleTaskPolicy) {
        this.scheduleTaskPolicy = scheduleTaskPolicy;
        return this;
    }

    public UpdateScheduleTaskResponse withScheduleTaskPolicy(Consumer<ScheduleTaskPolicy> scheduleTaskPolicySetter) {
        if (this.scheduleTaskPolicy == null) {
            this.scheduleTaskPolicy = new ScheduleTaskPolicy();
            scheduleTaskPolicySetter.accept(this.scheduleTaskPolicy);
        }

        return this;
    }

    /**
     * Get scheduleTaskPolicy
     * @return scheduleTaskPolicy
     */
    public ScheduleTaskPolicy getScheduleTaskPolicy() {
        return scheduleTaskPolicy;
    }

    public void setScheduleTaskPolicy(ScheduleTaskPolicy scheduleTaskPolicy) {
        this.scheduleTaskPolicy = scheduleTaskPolicy;
    }

    public UpdateScheduleTaskResponse withScheduledType(ScheduledTypeEnum scheduledType) {
        this.scheduledType = scheduledType;
        return this;
    }

    /**
     * Get scheduledType
     * @return scheduledType
     */
    public ScheduledTypeEnum getScheduledType() {
        return scheduledType;
    }

    public void setScheduledType(ScheduledTypeEnum scheduledType) {
        this.scheduledType = scheduledType;
    }

    public UpdateScheduleTaskResponse withDayInterval(Integer dayInterval) {
        this.dayInterval = dayInterval;
        return this;
    }

    /**
     * 周期按天时：按x天间隔执行。
     * @return dayInterval
     */
    public Integer getDayInterval() {
        return dayInterval;
    }

    public void setDayInterval(Integer dayInterval) {
        this.dayInterval = dayInterval;
    }

    public UpdateScheduleTaskResponse withWeekList(String weekList) {
        this.weekList = weekList;
        return this;
    }

    /**
     * 周期按周时：取值1~7，英文逗号分隔，如1,2,7。
     * @return weekList
     */
    public String getWeekList() {
        return weekList;
    }

    public void setWeekList(String weekList) {
        this.weekList = weekList;
    }

    public UpdateScheduleTaskResponse withMonthList(String monthList) {
        this.monthList = monthList;
        return this;
    }

    /**
     * 周期按月时：取值1~12，英文逗号分隔，如1,3,12。
     * @return monthList
     */
    public String getMonthList() {
        return monthList;
    }

    public void setMonthList(String monthList) {
        this.monthList = monthList;
    }

    public UpdateScheduleTaskResponse withDateList(String dateList) {
        this.dateList = dateList;
        return this;
    }

    /**
     * 周期按月时：取值1~31及L(代表当月最后一天)，英文逗号分隔，如1,2,28,L。
     * @return dateList
     */
    public String getDateList() {
        return dateList;
    }

    public void setDateList(String dateList) {
        this.dateList = dateList;
    }

    public UpdateScheduleTaskResponse withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * 时区。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public UpdateScheduleTaskResponse withScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
        return this;
    }

    /**
     * 周期指定时间时：表示指定的日期，格式为yyyy-MM-dd。
     * @return scheduledDate
     */
    public String getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public UpdateScheduleTaskResponse withScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }

    /**
     * 指定的执行时间点，格式为HH:mm:ss。
     * @return scheduledTime
     */
    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public UpdateScheduleTaskResponse withExpireTime(OffsetDateTime expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 到期时间。
     * @return expireTime
     */
    public OffsetDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(OffsetDateTime expireTime) {
        this.expireTime = expireTime;
    }

    public UpdateScheduleTaskResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateScheduleTaskResponse withIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }

    /**
     * 是否是开启状态。
     * @return isEnable
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public UpdateScheduleTaskResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public UpdateScheduleTaskResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateScheduleTaskResponse that = (UpdateScheduleTaskResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.lastStatus, that.lastStatus) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.taskCron, that.taskCron)
            && Objects.equals(this.nextExecutionTime, that.nextExecutionTime)
            && Objects.equals(this.scheduleTaskPolicy, that.scheduleTaskPolicy)
            && Objects.equals(this.scheduledType, that.scheduledType)
            && Objects.equals(this.dayInterval, that.dayInterval) && Objects.equals(this.weekList, that.weekList)
            && Objects.equals(this.monthList, that.monthList) && Objects.equals(this.dateList, that.dateList)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.scheduledDate, that.scheduledDate)
            && Objects.equals(this.scheduledTime, that.scheduledTime)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.description, that.description)
            && Objects.equals(this.isEnable, that.isEnable) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            taskName,
            lastStatus,
            taskType,
            taskCron,
            nextExecutionTime,
            scheduleTaskPolicy,
            scheduledType,
            dayInterval,
            weekList,
            monthList,
            dateList,
            timeZone,
            scheduledDate,
            scheduledTime,
            expireTime,
            description,
            isEnable,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScheduleTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    lastStatus: ").append(toIndentedString(lastStatus)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    taskCron: ").append(toIndentedString(taskCron)).append("\n");
        sb.append("    nextExecutionTime: ").append(toIndentedString(nextExecutionTime)).append("\n");
        sb.append("    scheduleTaskPolicy: ").append(toIndentedString(scheduleTaskPolicy)).append("\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    dayInterval: ").append(toIndentedString(dayInterval)).append("\n");
        sb.append("    weekList: ").append(toIndentedString(weekList)).append("\n");
        sb.append("    monthList: ").append(toIndentedString(monthList)).append("\n");
        sb.append("    dateList: ").append(toIndentedString(dateList)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
        sb.append("    scheduledTime: ").append(toIndentedString(scheduledTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
