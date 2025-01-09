package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新定时任务
 */
public class UpdateScheduleTaskReq {

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
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private ScheduleTaskTypeEnum taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_task_policy")

    private ScheduleTaskPolicy scheduleTaskPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enable")

    private Boolean isEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_infos")

    private List<TargetInfo> targetInfos = null;

    public UpdateScheduleTaskReq withScheduledType(ScheduledTypeEnum scheduledType) {
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

    public UpdateScheduleTaskReq withDayInterval(Integer dayInterval) {
        this.dayInterval = dayInterval;
        return this;
    }

    /**
     * 周期按天时：按x天间隔执行。
     * minimum: 1
     * maximum: 31
     * @return dayInterval
     */
    public Integer getDayInterval() {
        return dayInterval;
    }

    public void setDayInterval(Integer dayInterval) {
        this.dayInterval = dayInterval;
    }

    public UpdateScheduleTaskReq withWeekList(String weekList) {
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

    public UpdateScheduleTaskReq withMonthList(String monthList) {
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

    public UpdateScheduleTaskReq withDateList(String dateList) {
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

    public UpdateScheduleTaskReq withTimeZone(String timeZone) {
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

    public UpdateScheduleTaskReq withScheduledDate(String scheduledDate) {
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

    public UpdateScheduleTaskReq withScheduledTime(String scheduledTime) {
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

    public UpdateScheduleTaskReq withExpireTime(OffsetDateTime expireTime) {
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

    public UpdateScheduleTaskReq withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称，名称需满足如下规则: 1. 由中文，英文大小写，数字，_-组成，不能有空格 2. 长度范围1~64个字符
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public UpdateScheduleTaskReq withTaskType(ScheduleTaskTypeEnum taskType) {
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

    public UpdateScheduleTaskReq withScheduleTaskPolicy(ScheduleTaskPolicy scheduleTaskPolicy) {
        this.scheduleTaskPolicy = scheduleTaskPolicy;
        return this;
    }

    public UpdateScheduleTaskReq withScheduleTaskPolicy(Consumer<ScheduleTaskPolicy> scheduleTaskPolicySetter) {
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

    public UpdateScheduleTaskReq withDescription(String description) {
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

    public UpdateScheduleTaskReq withIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }

    /**
     * 是否启用： 'true': 启用 'false': 禁用
     * @return isEnable
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public UpdateScheduleTaskReq withTargetInfos(List<TargetInfo> targetInfos) {
        this.targetInfos = targetInfos;
        return this;
    }

    public UpdateScheduleTaskReq addTargetInfosItem(TargetInfo targetInfosItem) {
        if (this.targetInfos == null) {
            this.targetInfos = new ArrayList<>();
        }
        this.targetInfos.add(targetInfosItem);
        return this;
    }

    public UpdateScheduleTaskReq withTargetInfos(Consumer<List<TargetInfo>> targetInfosSetter) {
        if (this.targetInfos == null) {
            this.targetInfos = new ArrayList<>();
        }
        targetInfosSetter.accept(this.targetInfos);
        return this;
    }

    /**
     * 定时任务对象列表。
     * @return targetInfos
     */
    public List<TargetInfo> getTargetInfos() {
        return targetInfos;
    }

    public void setTargetInfos(List<TargetInfo> targetInfos) {
        this.targetInfos = targetInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateScheduleTaskReq that = (UpdateScheduleTaskReq) obj;
        return Objects.equals(this.scheduledType, that.scheduledType)
            && Objects.equals(this.dayInterval, that.dayInterval) && Objects.equals(this.weekList, that.weekList)
            && Objects.equals(this.monthList, that.monthList) && Objects.equals(this.dateList, that.dateList)
            && Objects.equals(this.timeZone, that.timeZone) && Objects.equals(this.scheduledDate, that.scheduledDate)
            && Objects.equals(this.scheduledTime, that.scheduledTime)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.scheduleTaskPolicy, that.scheduleTaskPolicy)
            && Objects.equals(this.description, that.description) && Objects.equals(this.isEnable, that.isEnable)
            && Objects.equals(this.targetInfos, that.targetInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduledType,
            dayInterval,
            weekList,
            monthList,
            dateList,
            timeZone,
            scheduledDate,
            scheduledTime,
            expireTime,
            taskName,
            taskType,
            scheduleTaskPolicy,
            description,
            isEnable,
            targetInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScheduleTaskReq {\n");
        sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
        sb.append("    dayInterval: ").append(toIndentedString(dayInterval)).append("\n");
        sb.append("    weekList: ").append(toIndentedString(weekList)).append("\n");
        sb.append("    monthList: ").append(toIndentedString(monthList)).append("\n");
        sb.append("    dateList: ").append(toIndentedString(dateList)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
        sb.append("    scheduledTime: ").append(toIndentedString(scheduledTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    scheduleTaskPolicy: ").append(toIndentedString(scheduleTaskPolicy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
        sb.append("    targetInfos: ").append(toIndentedString(targetInfos)).append("\n");
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
