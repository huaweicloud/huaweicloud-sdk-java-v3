package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class UpdateResOnlineInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private JobConfig jobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private String schedule;

    public UpdateResOnlineInstanceRequestBody withCategory(String category) {
        this.category = category;
        return this;
    }

    /** 类别。
     * 
     * @return category */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public UpdateResOnlineInstanceRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateResOnlineInstanceRequestBody withJobConfig(JobConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public UpdateResOnlineInstanceRequestBody withJobConfig(Consumer<JobConfig> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new JobConfig();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /** Get jobConfig
     * 
     * @return jobConfig */
    public JobConfig getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(JobConfig jobConfig) {
        this.jobConfig = jobConfig;
    }

    public UpdateResOnlineInstanceRequestBody withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /** 作业名称。
     * 
     * @return jobName */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public UpdateResOnlineInstanceRequestBody withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /** 作业类型。
     * 
     * @return jobType */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public UpdateResOnlineInstanceRequestBody withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /** 调度参数。
     * 
     * @return schedule */
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateResOnlineInstanceRequestBody updateResOnlineInstanceRequestBody = (UpdateResOnlineInstanceRequestBody) o;
        return Objects.equals(this.category, updateResOnlineInstanceRequestBody.category)
            && Objects.equals(this.description, updateResOnlineInstanceRequestBody.description)
            && Objects.equals(this.jobConfig, updateResOnlineInstanceRequestBody.jobConfig)
            && Objects.equals(this.jobName, updateResOnlineInstanceRequestBody.jobName)
            && Objects.equals(this.jobType, updateResOnlineInstanceRequestBody.jobType)
            && Objects.equals(this.schedule, updateResOnlineInstanceRequestBody.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, description, jobConfig, jobName, jobType, schedule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResOnlineInstanceRequestBody {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
