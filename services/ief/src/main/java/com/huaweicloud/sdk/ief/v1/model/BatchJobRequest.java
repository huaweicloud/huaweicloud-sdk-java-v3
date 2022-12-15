package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量作业参数
 */
public class BatchJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_content")

    private JobContentInfo jobContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Attributes> tags = null;

    public BatchJobRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 批量作业名称，允许输入小写字母，数字，中划线，不能以中划线开头或结尾，最大长度为26位
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public BatchJobRequest withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 批量作业类型，支持以下选项： - node_upgrade： 节点升级 - deployment_deploy：应用部署 - deployment_upgrade：应用升级
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public BatchJobRequest withJobContent(JobContentInfo jobContent) {
        this.jobContent = jobContent;
        return this;
    }

    public BatchJobRequest withJobContent(Consumer<JobContentInfo> jobContentSetter) {
        if (this.jobContent == null) {
            this.jobContent = new JobContentInfo();
            jobContentSetter.accept(this.jobContent);
        }

        return this;
    }

    /**
     * Get jobContent
     * @return jobContent
     */
    public JobContentInfo getJobContent() {
        return jobContent;
    }

    public void setJobContent(JobContentInfo jobContent) {
        this.jobContent = jobContent;
    }

    public BatchJobRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 批量作业描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BatchJobRequest withTags(List<Attributes> tags) {
        this.tags = tags;
        return this;
    }

    public BatchJobRequest addTagsItem(Attributes tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public BatchJobRequest withTags(Consumer<List<Attributes>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 批量作业标签
     * @return tags
     */
    public List<Attributes> getTags() {
        return tags;
    }

    public void setTags(List<Attributes> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchJobRequest batchJobRequest = (BatchJobRequest) o;
        return Objects.equals(this.jobName, batchJobRequest.jobName)
            && Objects.equals(this.jobType, batchJobRequest.jobType)
            && Objects.equals(this.jobContent, batchJobRequest.jobContent)
            && Objects.equals(this.description, batchJobRequest.description)
            && Objects.equals(this.tags, batchJobRequest.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobName, jobType, jobContent, description, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchJobRequest {\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    jobContent: ").append(toIndentedString(jobContent)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
