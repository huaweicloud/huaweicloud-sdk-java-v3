package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowQualityTaskDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private Long categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_condition")

    private String alarmCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notify")

    private Boolean alarmNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notify_type")

    private String alarmNotifyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notify_topic")

    private String alarmNotifyTopic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_type")

    private String scheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_start_date")

    private String scheduleStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_end_date")

    private String scheduleEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_period")

    private String schedulePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_interval")

    private String scheduleInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_start_time")

    private String scheduleStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_end_time")

    private String scheduleEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_run_time")

    private Long lastRunTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_rules")

    private List<QualityTaskRuleDetailForOpenApi> subRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_cron")

    private String scheduleCron;

    public ShowQualityTaskDetailResponse withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShowQualityTaskDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowQualityTaskDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 作业描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowQualityTaskDetailResponse withCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 所属目录ID
     * @return categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public ShowQualityTaskDetailResponse withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * SUGGEST:提示, MINOR:一般, MAJOR:严重, FATAL:致命
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ShowQualityTaskDetailResponse withAlarmCondition(String alarmCondition) {
        this.alarmCondition = alarmCondition;
        return this;
    }

    /**
     * 统一告警条件
     * @return alarmCondition
     */
    public String getAlarmCondition() {
        return alarmCondition;
    }

    public void setAlarmCondition(String alarmCondition) {
        this.alarmCondition = alarmCondition;
    }

    public ShowQualityTaskDetailResponse withAlarmNotify(Boolean alarmNotify) {
        this.alarmNotify = alarmNotify;
        return this;
    }

    /**
     * 是否开启通知告警
     * @return alarmNotify
     */
    public Boolean getAlarmNotify() {
        return alarmNotify;
    }

    public void setAlarmNotify(Boolean alarmNotify) {
        this.alarmNotify = alarmNotify;
    }

    public ShowQualityTaskDetailResponse withAlarmNotifyType(String alarmNotifyType) {
        this.alarmNotifyType = alarmNotifyType;
        return this;
    }

    /**
     * TRIGGER_ALARM:触发告警, RUN_SUCCESS:运行成功, TRIGGER_ALARM_AND_RUNNING_SUCCESS:触发告警和运行成功
     * @return alarmNotifyType
     */
    public String getAlarmNotifyType() {
        return alarmNotifyType;
    }

    public void setAlarmNotifyType(String alarmNotifyType) {
        this.alarmNotifyType = alarmNotifyType;
    }

    public ShowQualityTaskDetailResponse withAlarmNotifyTopic(String alarmNotifyTopic) {
        this.alarmNotifyTopic = alarmNotifyTopic;
        return this;
    }

    /**
     * 通知主题名
     * @return alarmNotifyTopic
     */
    public String getAlarmNotifyTopic() {
        return alarmNotifyTopic;
    }

    public void setAlarmNotifyTopic(String alarmNotifyTopic) {
        this.alarmNotifyTopic = alarmNotifyTopic;
    }

    public ShowQualityTaskDetailResponse withScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }

    /**
     * 调度类型，ONCE：单次调度，PERIODIC：周期性调度
     * @return scheduleType
     */
    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public ShowQualityTaskDetailResponse withScheduleStartDate(String scheduleStartDate) {
        this.scheduleStartDate = scheduleStartDate;
        return this;
    }

    /**
     * 调度开始日期
     * @return scheduleStartDate
     */
    public String getScheduleStartDate() {
        return scheduleStartDate;
    }

    public void setScheduleStartDate(String scheduleStartDate) {
        this.scheduleStartDate = scheduleStartDate;
    }

    public ShowQualityTaskDetailResponse withScheduleEndDate(String scheduleEndDate) {
        this.scheduleEndDate = scheduleEndDate;
        return this;
    }

    /**
     * 调度结束日期
     * @return scheduleEndDate
     */
    public String getScheduleEndDate() {
        return scheduleEndDate;
    }

    public void setScheduleEndDate(String scheduleEndDate) {
        this.scheduleEndDate = scheduleEndDate;
    }

    public ShowQualityTaskDetailResponse withSchedulePeriod(String schedulePeriod) {
        this.schedulePeriod = schedulePeriod;
        return this;
    }

    /**
     * 调度周期，MINUTE:按分钟调度，HOUR:按小时调度，DAY:按天调度，WEEK:按周调度
     * @return schedulePeriod
     */
    public String getSchedulePeriod() {
        return schedulePeriod;
    }

    public void setSchedulePeriod(String schedulePeriod) {
        this.schedulePeriod = schedulePeriod;
    }

    public ShowQualityTaskDetailResponse withScheduleInterval(String scheduleInterval) {
        this.scheduleInterval = scheduleInterval;
        return this;
    }

    /**
     * 调度间隔，注意：当调度周期为分钟、小时、天时，间隔时间为数字；而当调度周期为周时，调度间隔为星期的英文，如：每周一、周二调度时，schedule_interval为\"MONDAY,TUESDAY\"
     * @return scheduleInterval
     */
    public String getScheduleInterval() {
        return scheduleInterval;
    }

    public void setScheduleInterval(String scheduleInterval) {
        this.scheduleInterval = scheduleInterval;
    }

    public ShowQualityTaskDetailResponse withScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
        return this;
    }

    /**
     * 调度开始时间
     * @return scheduleStartTime
     */
    public String getScheduleStartTime() {
        return scheduleStartTime;
    }

    public void setScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    public ShowQualityTaskDetailResponse withScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
        return this;
    }

    /**
     * 调度结束时间
     * @return scheduleEndTime
     */
    public String getScheduleEndTime() {
        return scheduleEndTime;
    }

    public void setScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }

    public ShowQualityTaskDetailResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 最近运行时间,13位时间戳(精确到毫秒)
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowQualityTaskDetailResponse withLastRunTime(Long lastRunTime) {
        this.lastRunTime = lastRunTime;
        return this;
    }

    /**
     * 最近运行时间,13位时间戳(精确到毫秒)
     * @return lastRunTime
     */
    public Long getLastRunTime() {
        return lastRunTime;
    }

    public void setLastRunTime(Long lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    public ShowQualityTaskDetailResponse withSubRules(List<QualityTaskRuleDetailForOpenApi> subRules) {
        this.subRules = subRules;
        return this;
    }

    public ShowQualityTaskDetailResponse addSubRulesItem(QualityTaskRuleDetailForOpenApi subRulesItem) {
        if (this.subRules == null) {
            this.subRules = new ArrayList<>();
        }
        this.subRules.add(subRulesItem);
        return this;
    }

    public ShowQualityTaskDetailResponse withSubRules(Consumer<List<QualityTaskRuleDetailForOpenApi>> subRulesSetter) {
        if (this.subRules == null) {
            this.subRules = new ArrayList<>();
        }
        subRulesSetter.accept(this.subRules);
        return this;
    }

    /**
     * 子规则
     * @return subRules
     */
    public List<QualityTaskRuleDetailForOpenApi> getSubRules() {
        return subRules;
    }

    public void setSubRules(List<QualityTaskRuleDetailForOpenApi> subRules) {
        this.subRules = subRules;
    }

    public ShowQualityTaskDetailResponse withScheduleCron(String scheduleCron) {
        this.scheduleCron = scheduleCron;
        return this;
    }

    /**
     * 调度cron表达式
     * @return scheduleCron
     */
    public String getScheduleCron() {
        return scheduleCron;
    }

    public void setScheduleCron(String scheduleCron) {
        this.scheduleCron = scheduleCron;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQualityTaskDetailResponse showQualityTaskDetailResponse = (ShowQualityTaskDetailResponse) o;
        return Objects.equals(this.id, showQualityTaskDetailResponse.id)
            && Objects.equals(this.name, showQualityTaskDetailResponse.name)
            && Objects.equals(this.description, showQualityTaskDetailResponse.description)
            && Objects.equals(this.categoryId, showQualityTaskDetailResponse.categoryId)
            && Objects.equals(this.level, showQualityTaskDetailResponse.level)
            && Objects.equals(this.alarmCondition, showQualityTaskDetailResponse.alarmCondition)
            && Objects.equals(this.alarmNotify, showQualityTaskDetailResponse.alarmNotify)
            && Objects.equals(this.alarmNotifyType, showQualityTaskDetailResponse.alarmNotifyType)
            && Objects.equals(this.alarmNotifyTopic, showQualityTaskDetailResponse.alarmNotifyTopic)
            && Objects.equals(this.scheduleType, showQualityTaskDetailResponse.scheduleType)
            && Objects.equals(this.scheduleStartDate, showQualityTaskDetailResponse.scheduleStartDate)
            && Objects.equals(this.scheduleEndDate, showQualityTaskDetailResponse.scheduleEndDate)
            && Objects.equals(this.schedulePeriod, showQualityTaskDetailResponse.schedulePeriod)
            && Objects.equals(this.scheduleInterval, showQualityTaskDetailResponse.scheduleInterval)
            && Objects.equals(this.scheduleStartTime, showQualityTaskDetailResponse.scheduleStartTime)
            && Objects.equals(this.scheduleEndTime, showQualityTaskDetailResponse.scheduleEndTime)
            && Objects.equals(this.createTime, showQualityTaskDetailResponse.createTime)
            && Objects.equals(this.lastRunTime, showQualityTaskDetailResponse.lastRunTime)
            && Objects.equals(this.subRules, showQualityTaskDetailResponse.subRules)
            && Objects.equals(this.scheduleCron, showQualityTaskDetailResponse.scheduleCron);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            categoryId,
            level,
            alarmCondition,
            alarmNotify,
            alarmNotifyType,
            alarmNotifyTopic,
            scheduleType,
            scheduleStartDate,
            scheduleEndDate,
            schedulePeriod,
            scheduleInterval,
            scheduleStartTime,
            scheduleEndTime,
            createTime,
            lastRunTime,
            subRules,
            scheduleCron);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQualityTaskDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    alarmCondition: ").append(toIndentedString(alarmCondition)).append("\n");
        sb.append("    alarmNotify: ").append(toIndentedString(alarmNotify)).append("\n");
        sb.append("    alarmNotifyType: ").append(toIndentedString(alarmNotifyType)).append("\n");
        sb.append("    alarmNotifyTopic: ").append(toIndentedString(alarmNotifyTopic)).append("\n");
        sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
        sb.append("    scheduleStartDate: ").append(toIndentedString(scheduleStartDate)).append("\n");
        sb.append("    scheduleEndDate: ").append(toIndentedString(scheduleEndDate)).append("\n");
        sb.append("    schedulePeriod: ").append(toIndentedString(schedulePeriod)).append("\n");
        sb.append("    scheduleInterval: ").append(toIndentedString(scheduleInterval)).append("\n");
        sb.append("    scheduleStartTime: ").append(toIndentedString(scheduleStartTime)).append("\n");
        sb.append("    scheduleEndTime: ").append(toIndentedString(scheduleEndTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastRunTime: ").append(toIndentedString(lastRunTime)).append("\n");
        sb.append("    subRules: ").append(toIndentedString(subRules)).append("\n");
        sb.append("    scheduleCron: ").append(toIndentedString(scheduleCron)).append("\n");
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
