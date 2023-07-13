package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新对象选择信息体
 */
public class UpdateDatabaseObjectReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selected")

    private Boolean selected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_database")

    private Boolean syncDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job")

    private List<DatabaseInfo> job = null;

    public UpdateDatabaseObjectReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public UpdateDatabaseObjectReq withSelected(Boolean selected) {
        this.selected = selected;
        return this;
    }

    /**
     * 是否进行对象选择，是：自定义迁移对象，否：全部迁移，不填默认为否。
     * @return selected
     */
    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public UpdateDatabaseObjectReq withSyncDatabase(Boolean syncDatabase) {
        this.syncDatabase = syncDatabase;
        return this;
    }

    /**
     * 是否库级同步
     * @return syncDatabase
     */
    public Boolean getSyncDatabase() {
        return syncDatabase;
    }

    public void setSyncDatabase(Boolean syncDatabase) {
        this.syncDatabase = syncDatabase;
    }

    public UpdateDatabaseObjectReq withJob(List<DatabaseInfo> job) {
        this.job = job;
        return this;
    }

    public UpdateDatabaseObjectReq addJobItem(DatabaseInfo jobItem) {
        if (this.job == null) {
            this.job = new ArrayList<>();
        }
        this.job.add(jobItem);
        return this;
    }

    public UpdateDatabaseObjectReq withJob(Consumer<List<DatabaseInfo>> jobSetter) {
        if (this.job == null) {
            this.job = new ArrayList<>();
        }
        jobSetter.accept(this.job);
        return this;
    }

    /**
     * 数据对象选择信息，selected为true时必填。
     * @return job
     */
    public List<DatabaseInfo> getJob() {
        return job;
    }

    public void setJob(List<DatabaseInfo> job) {
        this.job = job;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDatabaseObjectReq that = (UpdateDatabaseObjectReq) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.selected, that.selected)
            && Objects.equals(this.syncDatabase, that.syncDatabase) && Objects.equals(this.job, that.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, selected, syncDatabase, job);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDatabaseObjectReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
        sb.append("    syncDatabase: ").append(toIndentedString(syncDatabase)).append("\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
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
