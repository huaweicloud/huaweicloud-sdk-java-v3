package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建策略信息。
 */
public class JobScheduleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_defined")

    private Boolean userDefined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_type")

    private String scheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_schedule_type")

    private String jobScheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "one_time_occurrence")

    private JobScheduleOneTimeOccurrenceInfo oneTimeOccurrence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private JobScheduleFrequencyInfo frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daily_frequency")

    private JobScheduleDailyFrequencyInfo dailyFrequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private JobScheduleDurationInfo duration;

    public JobScheduleInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 策略id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JobScheduleInfo withUserDefined(Boolean userDefined) {
        this.userDefined = userDefined;
        return this;
    }

    /**
     * 是否是用户自定义模板。false表示为系统默认模板。true表示为用户自定义模板。
     * @return userDefined
     */
    public Boolean getUserDefined() {
        return userDefined;
    }

    public void setUserDefined(Boolean userDefined) {
        this.userDefined = userDefined;
    }

    public JobScheduleInfo withScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }

    /**
     * 策略类型，snapshot:快照策略, sync:同步策略。
     * @return scheduleType
     */
    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public JobScheduleInfo withJobScheduleType(String jobScheduleType) {
        this.jobScheduleType = jobScheduleType;
        return this;
    }

    /**
     * 计划类型。  automatically：SQL Server代理启动时自动启动。 cpu_idle：CPU空闲时启动。 recurring：重复执行。 one_time：执行一次。
     * @return jobScheduleType
     */
    public String getJobScheduleType() {
        return jobScheduleType;
    }

    public void setJobScheduleType(String jobScheduleType) {
        this.jobScheduleType = jobScheduleType;
    }

    public JobScheduleInfo withOneTimeOccurrence(JobScheduleOneTimeOccurrenceInfo oneTimeOccurrence) {
        this.oneTimeOccurrence = oneTimeOccurrence;
        return this;
    }

    public JobScheduleInfo withOneTimeOccurrence(Consumer<JobScheduleOneTimeOccurrenceInfo> oneTimeOccurrenceSetter) {
        if (this.oneTimeOccurrence == null) {
            this.oneTimeOccurrence = new JobScheduleOneTimeOccurrenceInfo();
            oneTimeOccurrenceSetter.accept(this.oneTimeOccurrence);
        }

        return this;
    }

    /**
     * Get oneTimeOccurrence
     * @return oneTimeOccurrence
     */
    public JobScheduleOneTimeOccurrenceInfo getOneTimeOccurrence() {
        return oneTimeOccurrence;
    }

    public void setOneTimeOccurrence(JobScheduleOneTimeOccurrenceInfo oneTimeOccurrence) {
        this.oneTimeOccurrence = oneTimeOccurrence;
    }

    public JobScheduleInfo withFrequency(JobScheduleFrequencyInfo frequency) {
        this.frequency = frequency;
        return this;
    }

    public JobScheduleInfo withFrequency(Consumer<JobScheduleFrequencyInfo> frequencySetter) {
        if (this.frequency == null) {
            this.frequency = new JobScheduleFrequencyInfo();
            frequencySetter.accept(this.frequency);
        }

        return this;
    }

    /**
     * Get frequency
     * @return frequency
     */
    public JobScheduleFrequencyInfo getFrequency() {
        return frequency;
    }

    public void setFrequency(JobScheduleFrequencyInfo frequency) {
        this.frequency = frequency;
    }

    public JobScheduleInfo withDailyFrequency(JobScheduleDailyFrequencyInfo dailyFrequency) {
        this.dailyFrequency = dailyFrequency;
        return this;
    }

    public JobScheduleInfo withDailyFrequency(Consumer<JobScheduleDailyFrequencyInfo> dailyFrequencySetter) {
        if (this.dailyFrequency == null) {
            this.dailyFrequency = new JobScheduleDailyFrequencyInfo();
            dailyFrequencySetter.accept(this.dailyFrequency);
        }

        return this;
    }

    /**
     * Get dailyFrequency
     * @return dailyFrequency
     */
    public JobScheduleDailyFrequencyInfo getDailyFrequency() {
        return dailyFrequency;
    }

    public void setDailyFrequency(JobScheduleDailyFrequencyInfo dailyFrequency) {
        this.dailyFrequency = dailyFrequency;
    }

    public JobScheduleInfo withDuration(JobScheduleDurationInfo duration) {
        this.duration = duration;
        return this;
    }

    public JobScheduleInfo withDuration(Consumer<JobScheduleDurationInfo> durationSetter) {
        if (this.duration == null) {
            this.duration = new JobScheduleDurationInfo();
            durationSetter.accept(this.duration);
        }

        return this;
    }

    /**
     * Get duration
     * @return duration
     */
    public JobScheduleDurationInfo getDuration() {
        return duration;
    }

    public void setDuration(JobScheduleDurationInfo duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobScheduleInfo that = (JobScheduleInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.userDefined, that.userDefined)
            && Objects.equals(this.scheduleType, that.scheduleType)
            && Objects.equals(this.jobScheduleType, that.jobScheduleType)
            && Objects.equals(this.oneTimeOccurrence, that.oneTimeOccurrence)
            && Objects.equals(this.frequency, that.frequency)
            && Objects.equals(this.dailyFrequency, that.dailyFrequency) && Objects.equals(this.duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            userDefined,
            scheduleType,
            jobScheduleType,
            oneTimeOccurrence,
            frequency,
            dailyFrequency,
            duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobScheduleInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
        sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
        sb.append("    jobScheduleType: ").append(toIndentedString(jobScheduleType)).append("\n");
        sb.append("    oneTimeOccurrence: ").append(toIndentedString(oneTimeOccurrence)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    dailyFrequency: ").append(toIndentedString(dailyFrequency)).append("\n");
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
