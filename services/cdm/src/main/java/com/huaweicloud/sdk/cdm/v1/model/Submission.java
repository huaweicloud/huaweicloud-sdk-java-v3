package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Submission
 */
public class Submission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isIncrementing")

    private Boolean isIncrementing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job-name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "counters")

    private Counters counters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isStopingIncrement")

    private String isStopingIncrement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is-execute-auto")

    private Boolean isExecuteAuto;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last-update-date")

    private Long lastUpdateDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last-udpate-user")

    private String lastUdpateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isDeleteJob")

    private Boolean isDeleteJob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation-user")

    private String creationUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation-date")

    private Long creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external-id")

    private String externalId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Float progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submission-id")

    private Integer submissionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_rows")

    private Integer deleteRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_rows")

    private Integer updateRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_rows")

    private Integer writeRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute-date")

    private Long executeDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error-details")

    private String errorDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error-summary")

    private String errorSummary;

    public Submission withIsIncrementing(Boolean isIncrementing) {
        this.isIncrementing = isIncrementing;
        return this;
    }

    /**
     * 作业是否为增量迁移
     * @return isIncrementing
     */
    public Boolean getIsIncrementing() {
        return isIncrementing;
    }

    public void setIsIncrementing(Boolean isIncrementing) {
        this.isIncrementing = isIncrementing;
    }

    public Submission withJobName(String jobName) {
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

    public Submission withCounters(Counters counters) {
        this.counters = counters;
        return this;
    }

    public Submission withCounters(Consumer<Counters> countersSetter) {
        if (this.counters == null) {
            this.counters = new Counters();
            countersSetter.accept(this.counters);
        }

        return this;
    }

    /**
     * Get counters
     * @return counters
     */
    public Counters getCounters() {
        return counters;
    }

    public void setCounters(Counters counters) {
        this.counters = counters;
    }

    public Submission withIsStopingIncrement(String isStopingIncrement) {
        this.isStopingIncrement = isStopingIncrement;
        return this;
    }

    /**
     * 是否停止增量迁移
     * @return isStopingIncrement
     */
    public String getIsStopingIncrement() {
        return isStopingIncrement;
    }

    public void setIsStopingIncrement(String isStopingIncrement) {
        this.isStopingIncrement = isStopingIncrement;
    }

    public Submission withIsExecuteAuto(Boolean isExecuteAuto) {
        this.isExecuteAuto = isExecuteAuto;
        return this;
    }

    /**
     * 是否定时执行作业
     * @return isExecuteAuto
     */
    public Boolean getIsExecuteAuto() {
        return isExecuteAuto;
    }

    public void setIsExecuteAuto(Boolean isExecuteAuto) {
        this.isExecuteAuto = isExecuteAuto;
    }

    public Submission withLastUpdateDate(Long lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
        return this;
    }

    /**
     * 作业最后更新时间
     * @return lastUpdateDate
     */
    public Long getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Long lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Submission withLastUdpateUser(String lastUdpateUser) {
        this.lastUdpateUser = lastUdpateUser;
        return this;
    }

    /**
     * 最后更新作业状态的用户
     * @return lastUdpateUser
     */
    public String getLastUdpateUser() {
        return lastUdpateUser;
    }

    public void setLastUdpateUser(String lastUdpateUser) {
        this.lastUdpateUser = lastUdpateUser;
    }

    public Submission withIsDeleteJob(Boolean isDeleteJob) {
        this.isDeleteJob = isDeleteJob;
        return this;
    }

    /**
     * 作业执行完成后是否删除
     * @return isDeleteJob
     */
    public Boolean getIsDeleteJob() {
        return isDeleteJob;
    }

    public void setIsDeleteJob(Boolean isDeleteJob) {
        this.isDeleteJob = isDeleteJob;
    }

    public Submission withCreationUser(String creationUser) {
        this.creationUser = creationUser;
        return this;
    }

    /**
     * 创建用户
     * @return creationUser
     */
    public String getCreationUser() {
        return creationUser;
    }

    public void setCreationUser(String creationUser) {
        this.creationUser = creationUser;
    }

    public Submission withCreationDate(Long creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * 创建时间
     * @return creationDate
     */
    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    public Submission withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * 作业ID
     * @return externalId
     */
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Submission withProgress(Float progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 作业进度，失败时为“-1”，其它情况为0～100
     * @return progress
     */
    public Float getProgress() {
        return progress;
    }

    public void setProgress(Float progress) {
        this.progress = progress;
    }

    public Submission withSubmissionId(Integer submissionId) {
        this.submissionId = submissionId;
        return this;
    }

    /**
     * 作业提交id
     * @return submissionId
     */
    public Integer getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(Integer submissionId) {
        this.submissionId = submissionId;
    }

    public Submission withDeleteRows(Integer deleteRows) {
        this.deleteRows = deleteRows;
        return this;
    }

    /**
     * 删除数据行数
     * @return deleteRows
     */
    public Integer getDeleteRows() {
        return deleteRows;
    }

    public void setDeleteRows(Integer deleteRows) {
        this.deleteRows = deleteRows;
    }

    public Submission withUpdateRows(Integer updateRows) {
        this.updateRows = updateRows;
        return this;
    }

    /**
     * 更新数据行数
     * @return updateRows
     */
    public Integer getUpdateRows() {
        return updateRows;
    }

    public void setUpdateRows(Integer updateRows) {
        this.updateRows = updateRows;
    }

    public Submission withWriteRows(Integer writeRows) {
        this.writeRows = writeRows;
        return this;
    }

    /**
     * 写入数据行数
     * @return writeRows
     */
    public Integer getWriteRows() {
        return writeRows;
    }

    public void setWriteRows(Integer writeRows) {
        this.writeRows = writeRows;
    }

    public Submission withExecuteDate(Long executeDate) {
        this.executeDate = executeDate;
        return this;
    }

    /**
     * 执行时间
     * @return executeDate
     */
    public Long getExecuteDate() {
        return executeDate;
    }

    public void setExecuteDate(Long executeDate) {
        this.executeDate = executeDate;
    }

    public Submission withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态： - BOOTING：启动中。 - FAILURE_ON_SUBMIT：提交失败。 - RUNNING：运行中。 - SUCCEEDED：成功。 - FAILED：失败。 - UNKNOWN：未知。 - NEVER_EXECUTED：未被执行
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Submission withErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    /**
     * 错误详情，当“status”为“FAILED”时才有此字段。
     * @return errorDetails
     */
    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    public Submission withErrorSummary(String errorSummary) {
        this.errorSummary = errorSummary;
        return this;
    }

    /**
     * 错误总结，当“status”为“FAILED”时才有此字段。
     * @return errorSummary
     */
    public String getErrorSummary() {
        return errorSummary;
    }

    public void setErrorSummary(String errorSummary) {
        this.errorSummary = errorSummary;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Submission submission = (Submission) o;
        return Objects.equals(this.isIncrementing, submission.isIncrementing)
            && Objects.equals(this.jobName, submission.jobName) && Objects.equals(this.counters, submission.counters)
            && Objects.equals(this.isStopingIncrement, submission.isStopingIncrement)
            && Objects.equals(this.isExecuteAuto, submission.isExecuteAuto)
            && Objects.equals(this.lastUpdateDate, submission.lastUpdateDate)
            && Objects.equals(this.lastUdpateUser, submission.lastUdpateUser)
            && Objects.equals(this.isDeleteJob, submission.isDeleteJob)
            && Objects.equals(this.creationUser, submission.creationUser)
            && Objects.equals(this.creationDate, submission.creationDate)
            && Objects.equals(this.externalId, submission.externalId)
            && Objects.equals(this.progress, submission.progress)
            && Objects.equals(this.submissionId, submission.submissionId)
            && Objects.equals(this.deleteRows, submission.deleteRows)
            && Objects.equals(this.updateRows, submission.updateRows)
            && Objects.equals(this.writeRows, submission.writeRows)
            && Objects.equals(this.executeDate, submission.executeDate)
            && Objects.equals(this.status, submission.status)
            && Objects.equals(this.errorDetails, submission.errorDetails)
            && Objects.equals(this.errorSummary, submission.errorSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isIncrementing,
            jobName,
            counters,
            isStopingIncrement,
            isExecuteAuto,
            lastUpdateDate,
            lastUdpateUser,
            isDeleteJob,
            creationUser,
            creationDate,
            externalId,
            progress,
            submissionId,
            deleteRows,
            updateRows,
            writeRows,
            executeDate,
            status,
            errorDetails,
            errorSummary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Submission {\n");
        sb.append("    isIncrementing: ").append(toIndentedString(isIncrementing)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
        sb.append("    isStopingIncrement: ").append(toIndentedString(isStopingIncrement)).append("\n");
        sb.append("    isExecuteAuto: ").append(toIndentedString(isExecuteAuto)).append("\n");
        sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
        sb.append("    lastUdpateUser: ").append(toIndentedString(lastUdpateUser)).append("\n");
        sb.append("    isDeleteJob: ").append(toIndentedString(isDeleteJob)).append("\n");
        sb.append("    creationUser: ").append(toIndentedString(creationUser)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
        sb.append("    deleteRows: ").append(toIndentedString(deleteRows)).append("\n");
        sb.append("    updateRows: ").append(toIndentedString(updateRows)).append("\n");
        sb.append("    writeRows: ").append(toIndentedString(writeRows)).append("\n");
        sb.append("    executeDate: ").append(toIndentedString(executeDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
        sb.append("    errorSummary: ").append(toIndentedString(errorSummary)).append("\n");
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
