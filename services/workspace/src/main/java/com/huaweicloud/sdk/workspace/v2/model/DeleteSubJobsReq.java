package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteSubJobsReq
 */
public class DeleteSubJobsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_ids")

    private List<String> jobIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_by_status")

    private String deleteByStatus;

    public DeleteSubJobsReq withJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    public DeleteSubJobsReq addJobIdsItem(String jobIdsItem) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        this.jobIds.add(jobIdsItem);
        return this;
    }

    public DeleteSubJobsReq withJobIds(Consumer<List<String>> jobIdsSetter) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        jobIdsSetter.accept(this.jobIds);
        return this;
    }

    /**
     * 子任务ID列表，非任务ID，只能删除SUCCESS、FAILED两种状态。job_ids和delete_by_status必传一个。
     * @return jobIds
     */
    public List<String> getJobIds() {
        return jobIds;
    }

    public void setJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
    }

    public DeleteSubJobsReq withDeleteByStatus(String deleteByStatus) {
        this.deleteByStatus = deleteByStatus;
        return this;
    }

    /**
     * 通过任务状态删除，只能删除以下的两种状态 SUCCESS：成功。 FAILED：失败。job_ids和delete_by_status必传一个。
     * @return deleteByStatus
     */
    public String getDeleteByStatus() {
        return deleteByStatus;
    }

    public void setDeleteByStatus(String deleteByStatus) {
        this.deleteByStatus = deleteByStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteSubJobsReq that = (DeleteSubJobsReq) obj;
        return Objects.equals(this.jobIds, that.jobIds) && Objects.equals(this.deleteByStatus, that.deleteByStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobIds, deleteByStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSubJobsReq {\n");
        sb.append("    jobIds: ").append(toIndentedString(jobIds)).append("\n");
        sb.append("    deleteByStatus: ").append(toIndentedString(deleteByStatus)).append("\n");
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
