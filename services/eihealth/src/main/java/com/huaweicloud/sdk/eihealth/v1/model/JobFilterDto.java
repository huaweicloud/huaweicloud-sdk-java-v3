package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * JobFilterDto
 */
public class JobFilterDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_node_labels")

    private List<String> jobNodeLabels = null;

    public JobFilterDto withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public JobFilterDto withJobNodeLabels(List<String> jobNodeLabels) {
        this.jobNodeLabels = jobNodeLabels;
        return this;
    }

    public JobFilterDto addJobNodeLabelsItem(String jobNodeLabelsItem) {
        if (this.jobNodeLabels == null) {
            this.jobNodeLabels = new ArrayList<>();
        }
        this.jobNodeLabels.add(jobNodeLabelsItem);
        return this;
    }

    public JobFilterDto withJobNodeLabels(Consumer<List<String>> jobNodeLabelsSetter) {
        if (this.jobNodeLabels == null) {
            this.jobNodeLabels = new ArrayList<>();
        }
        jobNodeLabelsSetter.accept(this.jobNodeLabels);
        return this;
    }

    /**
     * 计算节点标签
     * @return jobNodeLabels
     */
    public List<String> getJobNodeLabels() {
        return jobNodeLabels;
    }

    public void setJobNodeLabels(List<String> jobNodeLabels) {
        this.jobNodeLabels = jobNodeLabels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobFilterDto that = (JobFilterDto) obj;
        return Objects.equals(this.jobName, that.jobName) && Objects.equals(this.jobNodeLabels, that.jobNodeLabels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobName, jobNodeLabels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobFilterDto {\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobNodeLabels: ").append(toIndentedString(jobNodeLabels)).append("\n");
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
