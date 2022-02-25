package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** StartJobSubmission */
public class StartJobSubmission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isIncrementing")

    private Boolean isIncrementing;

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
    @JsonProperty(value = "submission-id")

    private Integer submissionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job-name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation-user")

    private String creationUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation-date")

    private Long creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute-date")

    private Long executeDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Float progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

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

    public StartJobSubmission withIsIncrementing(Boolean isIncrementing) {
        this.isIncrementing = isIncrementing;
        return this;
    }

    /** 作业是否为增量迁移
     * 
     * @return isIncrementing */
    public Boolean getIsIncrementing() {
        return isIncrementing;
    }

    public void setIsIncrementing(Boolean isIncrementing) {
        this.isIncrementing = isIncrementing;
    }

    public StartJobSubmission withDeleteRows(Integer deleteRows) {
        this.deleteRows = deleteRows;
        return this;
    }

    /** 删除数据行数
     * 
     * @return deleteRows */
    public Integer getDeleteRows() {
        return deleteRows;
    }

    public void setDeleteRows(Integer deleteRows) {
        this.deleteRows = deleteRows;
    }

    public StartJobSubmission withUpdateRows(Integer updateRows) {
        this.updateRows = updateRows;
        return this;
    }

    /** 更新数据行数
     * 
     * @return updateRows */
    public Integer getUpdateRows() {
        return updateRows;
    }

    public void setUpdateRows(Integer updateRows) {
        this.updateRows = updateRows;
    }

    public StartJobSubmission withWriteRows(Integer writeRows) {
        this.writeRows = writeRows;
        return this;
    }

    /** 写入数据行数
     * 
     * @return writeRows */
    public Integer getWriteRows() {
        return writeRows;
    }

    public void setWriteRows(Integer writeRows) {
        this.writeRows = writeRows;
    }

    public StartJobSubmission withSubmissionId(Integer submissionId) {
        this.submissionId = submissionId;
        return this;
    }

    /** 作业提交id
     * 
     * @return submissionId */
    public Integer getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(Integer submissionId) {
        this.submissionId = submissionId;
    }

    public StartJobSubmission withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /** 作业名称
     * 
     * @return jobName */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public StartJobSubmission withCreationUser(String creationUser) {
        this.creationUser = creationUser;
        return this;
    }

    /** 创建用户
     * 
     * @return creationUser */
    public String getCreationUser() {
        return creationUser;
    }

    public void setCreationUser(String creationUser) {
        this.creationUser = creationUser;
    }

    public StartJobSubmission withCreationDate(Long creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /** 创建时间，单位：毫秒。
     * 
     * @return creationDate */
    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    public StartJobSubmission withExecuteDate(Long executeDate) {
        this.executeDate = executeDate;
        return this;
    }

    /** 执行时间
     * 
     * @return executeDate */
    public Long getExecuteDate() {
        return executeDate;
    }

    public void setExecuteDate(Long executeDate) {
        this.executeDate = executeDate;
    }

    public StartJobSubmission withProgress(Float progress) {
        this.progress = progress;
        return this;
    }

    /** 作业进度，失败时为“-1”，其它情况为0～100
     * 
     * @return progress */
    public Float getProgress() {
        return progress;
    }

    public void setProgress(Float progress) {
        this.progress = progress;
    }

    public StartJobSubmission withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 作业状态： - BOOTING：启动中。 - FAILURE_ON_SUBMIT：提交失败。 - RUNNING：运行中。 - SUCCEEDED：成功。 - FAILED：失败。 - UNKNOWN：未知。 -
     * NEVER_EXECUTED：未被执行
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StartJobSubmission withIsStopingIncrement(String isStopingIncrement) {
        this.isStopingIncrement = isStopingIncrement;
        return this;
    }

    /** 是否停止增量迁移
     * 
     * @return isStopingIncrement */
    public String getIsStopingIncrement() {
        return isStopingIncrement;
    }

    public void setIsStopingIncrement(String isStopingIncrement) {
        this.isStopingIncrement = isStopingIncrement;
    }

    public StartJobSubmission withIsExecuteAuto(Boolean isExecuteAuto) {
        this.isExecuteAuto = isExecuteAuto;
        return this;
    }

    /** 是否定时执行作业
     * 
     * @return isExecuteAuto */
    public Boolean getIsExecuteAuto() {
        return isExecuteAuto;
    }

    public void setIsExecuteAuto(Boolean isExecuteAuto) {
        this.isExecuteAuto = isExecuteAuto;
    }

    public StartJobSubmission withLastUpdateDate(Long lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
        return this;
    }

    /** 作业最后更新时间
     * 
     * @return lastUpdateDate */
    public Long getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Long lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public StartJobSubmission withLastUdpateUser(String lastUdpateUser) {
        this.lastUdpateUser = lastUdpateUser;
        return this;
    }

    /** 最后更新作业状态的用户
     * 
     * @return lastUdpateUser */
    public String getLastUdpateUser() {
        return lastUdpateUser;
    }

    public void setLastUdpateUser(String lastUdpateUser) {
        this.lastUdpateUser = lastUdpateUser;
    }

    public StartJobSubmission withIsDeleteJob(Boolean isDeleteJob) {
        this.isDeleteJob = isDeleteJob;
        return this;
    }

    /** 作业执行完成后是否删除
     * 
     * @return isDeleteJob */
    public Boolean getIsDeleteJob() {
        return isDeleteJob;
    }

    public void setIsDeleteJob(Boolean isDeleteJob) {
        this.isDeleteJob = isDeleteJob;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartJobSubmission startJobSubmission = (StartJobSubmission) o;
        return Objects.equals(this.isIncrementing, startJobSubmission.isIncrementing)
            && Objects.equals(this.deleteRows, startJobSubmission.deleteRows)
            && Objects.equals(this.updateRows, startJobSubmission.updateRows)
            && Objects.equals(this.writeRows, startJobSubmission.writeRows)
            && Objects.equals(this.submissionId, startJobSubmission.submissionId)
            && Objects.equals(this.jobName, startJobSubmission.jobName)
            && Objects.equals(this.creationUser, startJobSubmission.creationUser)
            && Objects.equals(this.creationDate, startJobSubmission.creationDate)
            && Objects.equals(this.executeDate, startJobSubmission.executeDate)
            && Objects.equals(this.progress, startJobSubmission.progress)
            && Objects.equals(this.status, startJobSubmission.status)
            && Objects.equals(this.isStopingIncrement, startJobSubmission.isStopingIncrement)
            && Objects.equals(this.isExecuteAuto, startJobSubmission.isExecuteAuto)
            && Objects.equals(this.lastUpdateDate, startJobSubmission.lastUpdateDate)
            && Objects.equals(this.lastUdpateUser, startJobSubmission.lastUdpateUser)
            && Objects.equals(this.isDeleteJob, startJobSubmission.isDeleteJob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isIncrementing,
            deleteRows,
            updateRows,
            writeRows,
            submissionId,
            jobName,
            creationUser,
            creationDate,
            executeDate,
            progress,
            status,
            isStopingIncrement,
            isExecuteAuto,
            lastUpdateDate,
            lastUdpateUser,
            isDeleteJob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartJobSubmission {\n");
        sb.append("    isIncrementing: ").append(toIndentedString(isIncrementing)).append("\n");
        sb.append("    deleteRows: ").append(toIndentedString(deleteRows)).append("\n");
        sb.append("    updateRows: ").append(toIndentedString(updateRows)).append("\n");
        sb.append("    writeRows: ").append(toIndentedString(writeRows)).append("\n");
        sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    creationUser: ").append(toIndentedString(creationUser)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    executeDate: ").append(toIndentedString(executeDate)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isStopingIncrement: ").append(toIndentedString(isStopingIncrement)).append("\n");
        sb.append("    isExecuteAuto: ").append(toIndentedString(isExecuteAuto)).append("\n");
        sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
        sb.append("    lastUdpateUser: ").append(toIndentedString(lastUdpateUser)).append("\n");
        sb.append("    isDeleteJob: ").append(toIndentedString(isDeleteJob)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
