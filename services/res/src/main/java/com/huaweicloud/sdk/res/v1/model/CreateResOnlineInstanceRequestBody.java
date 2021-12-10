package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** This is a auto create Body Object */
public class CreateResOnlineInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private JobConfig jobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topicUrn")

    private String topicUrn;

    public CreateResOnlineInstanceRequestBody withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /** 作业名称，1-64位的字母、数字、下划线、中划线组合。
     * 
     * @return jobName */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public CreateResOnlineInstanceRequestBody withDescription(String description) {
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

    public CreateResOnlineInstanceRequestBody withCategory(String category) {
        this.category = category;
        return this;
    }

    /** 类别: - SERVICE，在线服务
     * 
     * @return category */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CreateResOnlineInstanceRequestBody withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /** 作业类型： - infer，推理服务
     * 
     * @return jobType */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public CreateResOnlineInstanceRequestBody withJobConfig(JobConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public CreateResOnlineInstanceRequestBody withJobConfig(Consumer<JobConfig> jobConfigSetter) {
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

    public CreateResOnlineInstanceRequestBody withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /** 通知消息配置。
     * 
     * @return topicUrn */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateResOnlineInstanceRequestBody createResOnlineInstanceRequestBody = (CreateResOnlineInstanceRequestBody) o;
        return Objects.equals(this.jobName, createResOnlineInstanceRequestBody.jobName)
            && Objects.equals(this.description, createResOnlineInstanceRequestBody.description)
            && Objects.equals(this.category, createResOnlineInstanceRequestBody.category)
            && Objects.equals(this.jobType, createResOnlineInstanceRequestBody.jobType)
            && Objects.equals(this.jobConfig, createResOnlineInstanceRequestBody.jobConfig)
            && Objects.equals(this.topicUrn, createResOnlineInstanceRequestBody.topicUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobName, description, category, jobType, jobConfig, topicUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResOnlineInstanceRequestBody {\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
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
