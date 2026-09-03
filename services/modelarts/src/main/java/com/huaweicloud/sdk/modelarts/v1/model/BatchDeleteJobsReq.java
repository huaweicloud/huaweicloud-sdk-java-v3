package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除训练作业请求体。
 */
public class BatchDeleteJobsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobs")

    private List<BatchDeleteJobItem> jobs = null;

    public BatchDeleteJobsReq withJobs(List<BatchDeleteJobItem> jobs) {
        this.jobs = jobs;
        return this;
    }

    public BatchDeleteJobsReq addJobsItem(BatchDeleteJobItem jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    public BatchDeleteJobsReq withJobs(Consumer<List<BatchDeleteJobItem>> jobsSetter) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        jobsSetter.accept(this.jobs);
        return this;
    }

    /**
     * **参数解释**：待删除的训练作业列表。 **约束限制**：列表元素数量不超过100，且所有作业必须属于同一工作空间。 **取值范围**：不涉及。
     * @return jobs
     */
    public List<BatchDeleteJobItem> getJobs() {
        return jobs;
    }

    public void setJobs(List<BatchDeleteJobItem> jobs) {
        this.jobs = jobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteJobsReq that = (BatchDeleteJobsReq) obj;
        return Objects.equals(this.jobs, that.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteJobsReq {\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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
