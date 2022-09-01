package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class RunJobInBatch {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_savepoint")

    @JacksonXmlProperty(localName = "resume_savepoint")

    private Boolean resumeSavepoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_ids")

    @JacksonXmlProperty(localName = "job_ids")

    private List<Long> jobIds = null;

    public RunJobInBatch withResumeSavepoint(Boolean resumeSavepoint) {
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

    public RunJobInBatch withJobIds(List<Long> jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    public RunJobInBatch addJobIdsItem(Long jobIdsItem) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        this.jobIds.add(jobIdsItem);
        return this;
    }

    public RunJobInBatch withJobIds(Consumer<List<Long>> jobIdsSetter) {
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
        RunJobInBatch runJobInBatch = (RunJobInBatch) o;
        return Objects.equals(this.resumeSavepoint, runJobInBatch.resumeSavepoint)
            && Objects.equals(this.jobIds, runJobInBatch.jobIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resumeSavepoint, jobIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunJobInBatch {\n");
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
