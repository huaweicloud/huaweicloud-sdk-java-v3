package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class StopFlinkJobsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_savepoint")

    private Boolean triggerSavepoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_ids")

    private List<Long> jobIds = null;

    public StopFlinkJobsRequestBody withTriggerSavepoint(Boolean triggerSavepoint) {
        this.triggerSavepoint = triggerSavepoint;
        return this;
    }

    /**
     * 在停止作业之前，用户可以选择是否对作业创建保存点，保存作业的状态信息。类型为boolean。  当triggerSavePoint为true时，表示创建保存点。 当triggerSavePoint为false时，表示不创建保存点。默认为false。
     * @return triggerSavepoint
     */
    public Boolean getTriggerSavepoint() {
        return triggerSavepoint;
    }

    public void setTriggerSavepoint(Boolean triggerSavepoint) {
        this.triggerSavepoint = triggerSavepoint;
    }

    public StopFlinkJobsRequestBody withJobIds(List<Long> jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    public StopFlinkJobsRequestBody addJobIdsItem(Long jobIdsItem) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        this.jobIds.add(jobIdsItem);
        return this;
    }

    public StopFlinkJobsRequestBody withJobIds(Consumer<List<Long>> jobIdsSetter) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        jobIdsSetter.accept(this.jobIds);
        return this;
    }

    /**
     * 
     * @return jobIds
     */
    public List<Long> getJobIds() {
        return jobIds;
    }

    public void setJobIds(List<Long> jobIds) {
        this.jobIds = jobIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StopFlinkJobsRequestBody stopFlinkJobsRequestBody = (StopFlinkJobsRequestBody) o;
        return Objects.equals(this.triggerSavepoint, stopFlinkJobsRequestBody.triggerSavepoint)
            && Objects.equals(this.jobIds, stopFlinkJobsRequestBody.jobIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggerSavepoint, jobIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopFlinkJobsRequestBody {\n");
        sb.append("    triggerSavepoint: ").append(toIndentedString(triggerSavepoint)).append("\n");
        sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
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
