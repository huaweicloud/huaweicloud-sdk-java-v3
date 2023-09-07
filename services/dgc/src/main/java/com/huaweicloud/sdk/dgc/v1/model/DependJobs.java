package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DependJobs
 */
public class DependJobs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<String> jobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependPeriod")

    private String dependPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependFailPolicy")

    private String dependFailPolicy;

    public DependJobs withJobs(List<String> jobs) {
        this.jobs = jobs;
        return this;
    }

    public DependJobs addJobsItem(String jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public DependJobs withJobs(Consumer<List<String>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * 依赖的作业名称列表，必须依赖已存在的作业.
     * @return jobs
     */
    public List<String> getJobs() {
        return jobs;
    }

    public void setJobs(List<String> jobs) {
        this.jobs = jobs;
    }

    public DependJobs withDependPeriod(String dependPeriod) {
        this.dependPeriod = dependPeriod;
        return this;
    }

    /**
     * 依赖周期
     * @return dependPeriod
     */
    public String getDependPeriod() {
        return dependPeriod;
    }

    public void setDependPeriod(String dependPeriod) {
        this.dependPeriod = dependPeriod;
    }

    public DependJobs withDependFailPolicy(String dependFailPolicy) {
        this.dependFailPolicy = dependFailPolicy;
        return this;
    }

    /**
     * 依赖作业任务执行失败处理策略
     * @return dependFailPolicy
     */
    public String getDependFailPolicy() {
        return dependFailPolicy;
    }

    public void setDependFailPolicy(String dependFailPolicy) {
        this.dependFailPolicy = dependFailPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DependJobs that = (DependJobs) obj;
        return Objects.equals(this.jobs, that.jobs) && Objects.equals(this.dependPeriod, that.dependPeriod)
            && Objects.equals(this.dependFailPolicy, that.dependFailPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs, dependPeriod, dependFailPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependJobs {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    dependPeriod: ").append(toIndentedString(dependPeriod)).append("\n");
        sb.append("    dependFailPolicy: ").append(toIndentedString(dependFailPolicy)).append("\n");
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
