package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置任务批次信息
 */
public class SetJobBatchNameReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_name")

    private String batchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_ids")

    private List<String> jobIds = null;

    public SetJobBatchNameReq withBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }

    /**
     * 批次名称
     * @return batchName
     */
    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public SetJobBatchNameReq withJobIds(List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }

    public SetJobBatchNameReq addJobIdsItem(String jobIdsItem) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        this.jobIds.add(jobIdsItem);
        return this;
    }

    public SetJobBatchNameReq withJobIds(Consumer<List<String>> jobIdsSetter) {
        if (this.jobIds == null) {
            this.jobIds = new ArrayList<>();
        }
        jobIdsSetter.accept(this.jobIds);
        return this;
    }

    /**
     * 任务id列表
     * @return jobIds
     */
    public List<String> getJobIds() {
        return jobIds;
    }

    public void setJobIds(List<String> jobIds) {
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
        SetJobBatchNameReq that = (SetJobBatchNameReq) obj;
        return Objects.equals(this.batchName, that.batchName) && Objects.equals(this.jobIds, that.jobIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchName, jobIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetJobBatchNameReq {\n");
        sb.append("    batchName: ").append(toIndentedString(batchName)).append("\n");
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
