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
public class BatchRunFlinkJobsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_savepoint")

    private Boolean resumeSavepoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_ids")

    private List<Long> jobIds = null;

    public BatchRunFlinkJobsRequestBody withResumeSavepoint(Boolean resumeSavepoint) {
        this.resumeSavepoint = resumeSavepoint;
        return this;
    }

    /**
     * 是否将作业从最近创建的保存点恢复。类型为boolean。  当resume_savepoint为true时，表示作业从最近创建的保存点恢复。 当resume_savepoint为false时，表示不恢复正常启动。默认为false。
     * @return resumeSavepoint
     */
    public Boolean getResumeSavepoint() {
        return resumeSavepoint;
    }

    public void setResumeSavepoint(Boolean resumeSavepoint) {
        this.resumeSavepoint = resumeSavepoint;
    }

    public BatchRunFlinkJobsRequestBody withJobIds(List<Long> jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    public BatchRunFlinkJobsRequestBody addJobIdsItem(Long jobIdsItem) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        this.jobIds.add(jobIdsItem);
        return this;
    }

    public BatchRunFlinkJobsRequestBody withJobIds(Consumer<List<Long>> jobIdsSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchRunFlinkJobsRequestBody that = (BatchRunFlinkJobsRequestBody) obj;
        return Objects.equals(this.resumeSavepoint, that.resumeSavepoint) && Objects.equals(this.jobIds, that.jobIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resumeSavepoint, jobIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRunFlinkJobsRequestBody {\n");
        sb.append("    resumeSavepoint: ").append(toIndentedString(resumeSavepoint)).append("\n");
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
