package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateBatchJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_path")

    private String exportPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_result_file")

    private Boolean mergeResultFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_job")

    private SqlJob sqlJob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private Schedule schedule;

    public CreateBatchJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 仅在响应返回。作业ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateBatchJobResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称。只能包含数字、英文字母、中文字母、下划线以及中划线。长度为1~128。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public CreateBatchJobResponse withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 标签。只能包含数字、英文字母、中文字符、下划线、中划线、逗号以及斜杠。长度为0~128。
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public CreateBatchJobResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 仅在响应返回。创建时间。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public CreateBatchJobResponse withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * 仅在响应返回。更新时间。
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public CreateBatchJobResponse withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型。目前仅支持SqlJob.
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public CreateBatchJobResponse withExportPath(String exportPath) {
        this.exportPath = exportPath;
        return this;
    }

    /**
     * 作业查询结果导出到OBS的路径。覆写已存在文件。
     * @return exportPath
     */
    public String getExportPath() {
        return exportPath;
    }

    public void setExportPath(String exportPath) {
        this.exportPath = exportPath;
    }

    public CreateBatchJobResponse withMergeResultFile(Boolean mergeResultFile) {
        this.mergeResultFile = mergeResultFile;
        return this;
    }

    /**
     * 导出文件时是否合并结果文件。true：合并成一个结果文件；false：不合并结果文件。
     * @return mergeResultFile
     */
    public Boolean getMergeResultFile() {
        return mergeResultFile;
    }

    public void setMergeResultFile(Boolean mergeResultFile) {
        this.mergeResultFile = mergeResultFile;
    }

    public CreateBatchJobResponse withSqlJob(SqlJob sqlJob) {
        this.sqlJob = sqlJob;
        return this;
    }

    public CreateBatchJobResponse withSqlJob(Consumer<SqlJob> sqlJobSetter) {
        if (this.sqlJob == null) {
            this.sqlJob = new SqlJob();
            sqlJobSetter.accept(this.sqlJob);
        }

        return this;
    }

    /**
     * Get sqlJob
     * @return sqlJob
     */
    public SqlJob getSqlJob() {
        return sqlJob;
    }

    public void setSqlJob(SqlJob sqlJob) {
        this.sqlJob = sqlJob;
    }

    public CreateBatchJobResponse withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public CreateBatchJobResponse withSchedule(Consumer<Schedule> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new Schedule();
            scheduleSetter.accept(this.schedule);
        }

        return this;
    }

    /**
     * Get schedule
     * @return schedule
     */
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateBatchJobResponse createBatchJobResponse = (CreateBatchJobResponse) o;
        return Objects.equals(this.jobId, createBatchJobResponse.jobId)
            && Objects.equals(this.jobName, createBatchJobResponse.jobName)
            && Objects.equals(this.tags, createBatchJobResponse.tags)
            && Objects.equals(this.createdTime, createBatchJobResponse.createdTime)
            && Objects.equals(this.modifiedTime, createBatchJobResponse.modifiedTime)
            && Objects.equals(this.jobType, createBatchJobResponse.jobType)
            && Objects.equals(this.exportPath, createBatchJobResponse.exportPath)
            && Objects.equals(this.mergeResultFile, createBatchJobResponse.mergeResultFile)
            && Objects.equals(this.sqlJob, createBatchJobResponse.sqlJob)
            && Objects.equals(this.schedule, createBatchJobResponse.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            jobName,
            tags,
            createdTime,
            modifiedTime,
            jobType,
            exportPath,
            mergeResultFile,
            sqlJob,
            schedule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBatchJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    exportPath: ").append(toIndentedString(exportPath)).append("\n");
        sb.append("    mergeResultFile: ").append(toIndentedString(mergeResultFile)).append("\n");
        sb.append("    sqlJob: ").append(toIndentedString(sqlJob)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
