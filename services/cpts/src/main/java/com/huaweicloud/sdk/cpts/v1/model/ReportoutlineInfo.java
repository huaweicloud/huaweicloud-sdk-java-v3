package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ReportoutlineInfo */
public class ReportoutlineInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgResponseTime")

    private Float avgResponseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseRetry")

    private Integer caseRetry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completeNum")

    private Integer completeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executedNum")

    private Integer executedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterationUri")

    private String iterationUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kpiCaseCount")

    private Integer kpiCaseCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kpiCaseExecuteCount")

    private Integer kpiCaseExecuteCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kpiCasePassCount")

    private Integer kpiCasePassCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxUsers")

    private Integer maxUsers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passNum")

    private Integer passNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progressState")

    private String progressState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private Integer stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stageName")

    private String stageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusValue")

    private String statusValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successRate")

    private Integer successRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskStatus")

    private Integer taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalNum")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tps")

    private Float tps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versionUri")

    private String versionUri;

    public ReportoutlineInfo withAvgResponseTime(Float avgResponseTime) {
        this.avgResponseTime = avgResponseTime;
        return this;
    }

    /** avgResponseTime
     * 
     * @return avgResponseTime */
    public Float getAvgResponseTime() {
        return avgResponseTime;
    }

    public void setAvgResponseTime(Float avgResponseTime) {
        this.avgResponseTime = avgResponseTime;
    }

    public ReportoutlineInfo withCaseRetry(Integer caseRetry) {
        this.caseRetry = caseRetry;
        return this;
    }

    /** caseRetry
     * 
     * @return caseRetry */
    public Integer getCaseRetry() {
        return caseRetry;
    }

    public void setCaseRetry(Integer caseRetry) {
        this.caseRetry = caseRetry;
    }

    public ReportoutlineInfo withCompleteNum(Integer completeNum) {
        this.completeNum = completeNum;
        return this;
    }

    /** completeNum
     * 
     * @return completeNum */
    public Integer getCompleteNum() {
        return completeNum;
    }

    public void setCompleteNum(Integer completeNum) {
        this.completeNum = completeNum;
    }

    public ReportoutlineInfo withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /** duration
     * 
     * @return duration */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public ReportoutlineInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /** endTime
     * 
     * @return endTime */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ReportoutlineInfo withExecutedNum(Integer executedNum) {
        this.executedNum = executedNum;
        return this;
    }

    /** executedNum
     * 
     * @return executedNum */
    public Integer getExecutedNum() {
        return executedNum;
    }

    public void setExecutedNum(Integer executedNum) {
        this.executedNum = executedNum;
    }

    public ReportoutlineInfo withIterationUri(String iterationUri) {
        this.iterationUri = iterationUri;
        return this;
    }

    /** iterationUri
     * 
     * @return iterationUri */
    public String getIterationUri() {
        return iterationUri;
    }

    public void setIterationUri(String iterationUri) {
        this.iterationUri = iterationUri;
    }

    public ReportoutlineInfo withKpiCaseCount(Integer kpiCaseCount) {
        this.kpiCaseCount = kpiCaseCount;
        return this;
    }

    /** kpiCaseCount
     * 
     * @return kpiCaseCount */
    public Integer getKpiCaseCount() {
        return kpiCaseCount;
    }

    public void setKpiCaseCount(Integer kpiCaseCount) {
        this.kpiCaseCount = kpiCaseCount;
    }

    public ReportoutlineInfo withKpiCaseExecuteCount(Integer kpiCaseExecuteCount) {
        this.kpiCaseExecuteCount = kpiCaseExecuteCount;
        return this;
    }

    /** kpiCaseExecuteCount
     * 
     * @return kpiCaseExecuteCount */
    public Integer getKpiCaseExecuteCount() {
        return kpiCaseExecuteCount;
    }

    public void setKpiCaseExecuteCount(Integer kpiCaseExecuteCount) {
        this.kpiCaseExecuteCount = kpiCaseExecuteCount;
    }

    public ReportoutlineInfo withKpiCasePassCount(Integer kpiCasePassCount) {
        this.kpiCasePassCount = kpiCasePassCount;
        return this;
    }

    /** kpiCasePassCount
     * 
     * @return kpiCasePassCount */
    public Integer getKpiCasePassCount() {
        return kpiCasePassCount;
    }

    public void setKpiCasePassCount(Integer kpiCasePassCount) {
        this.kpiCasePassCount = kpiCasePassCount;
    }

    public ReportoutlineInfo withMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
        return this;
    }

    /** maxUsers
     * 
     * @return maxUsers */
    public Integer getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
    }

    public ReportoutlineInfo withPassNum(Integer passNum) {
        this.passNum = passNum;
        return this;
    }

    /** passNum
     * 
     * @return passNum */
    public Integer getPassNum() {
        return passNum;
    }

    public void setPassNum(Integer passNum) {
        this.passNum = passNum;
    }

    public ReportoutlineInfo withProgressState(String progressState) {
        this.progressState = progressState;
        return this;
    }

    /** progressState
     * 
     * @return progressState */
    public String getProgressState() {
        return progressState;
    }

    public void setProgressState(String progressState) {
        this.progressState = progressState;
    }

    public ReportoutlineInfo withStage(Integer stage) {
        this.stage = stage;
        return this;
    }

    /** stage
     * 
     * @return stage */
    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public ReportoutlineInfo withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /** stageName
     * 
     * @return stageName */
    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public ReportoutlineInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** startTime
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ReportoutlineInfo withStatusValue(String statusValue) {
        this.statusValue = statusValue;
        return this;
    }

    /** statusValue
     * 
     * @return statusValue */
    public String getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue;
    }

    public ReportoutlineInfo withSuccessRate(Integer successRate) {
        this.successRate = successRate;
        return this;
    }

    /** successRate
     * 
     * @return successRate */
    public Integer getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Integer successRate) {
        this.successRate = successRate;
    }

    public ReportoutlineInfo withTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /** taskStatus
     * 
     * @return taskStatus */
    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ReportoutlineInfo withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /** totalNum
     * 
     * @return totalNum */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ReportoutlineInfo withTps(Float tps) {
        this.tps = tps;
        return this;
    }

    /** tps
     * 
     * @return tps */
    public Float getTps() {
        return tps;
    }

    public void setTps(Float tps) {
        this.tps = tps;
    }

    public ReportoutlineInfo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /** versionUri
     * 
     * @return versionUri */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportoutlineInfo reportoutlineInfo = (ReportoutlineInfo) o;
        return Objects.equals(this.avgResponseTime, reportoutlineInfo.avgResponseTime)
            && Objects.equals(this.caseRetry, reportoutlineInfo.caseRetry)
            && Objects.equals(this.completeNum, reportoutlineInfo.completeNum)
            && Objects.equals(this.duration, reportoutlineInfo.duration)
            && Objects.equals(this.endTime, reportoutlineInfo.endTime)
            && Objects.equals(this.executedNum, reportoutlineInfo.executedNum)
            && Objects.equals(this.iterationUri, reportoutlineInfo.iterationUri)
            && Objects.equals(this.kpiCaseCount, reportoutlineInfo.kpiCaseCount)
            && Objects.equals(this.kpiCaseExecuteCount, reportoutlineInfo.kpiCaseExecuteCount)
            && Objects.equals(this.kpiCasePassCount, reportoutlineInfo.kpiCasePassCount)
            && Objects.equals(this.maxUsers, reportoutlineInfo.maxUsers)
            && Objects.equals(this.passNum, reportoutlineInfo.passNum)
            && Objects.equals(this.progressState, reportoutlineInfo.progressState)
            && Objects.equals(this.stage, reportoutlineInfo.stage)
            && Objects.equals(this.stageName, reportoutlineInfo.stageName)
            && Objects.equals(this.startTime, reportoutlineInfo.startTime)
            && Objects.equals(this.statusValue, reportoutlineInfo.statusValue)
            && Objects.equals(this.successRate, reportoutlineInfo.successRate)
            && Objects.equals(this.taskStatus, reportoutlineInfo.taskStatus)
            && Objects.equals(this.totalNum, reportoutlineInfo.totalNum)
            && Objects.equals(this.tps, reportoutlineInfo.tps)
            && Objects.equals(this.versionUri, reportoutlineInfo.versionUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avgResponseTime,
            caseRetry,
            completeNum,
            duration,
            endTime,
            executedNum,
            iterationUri,
            kpiCaseCount,
            kpiCaseExecuteCount,
            kpiCasePassCount,
            maxUsers,
            passNum,
            progressState,
            stage,
            stageName,
            startTime,
            statusValue,
            successRate,
            taskStatus,
            totalNum,
            tps,
            versionUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportoutlineInfo {\n");
        sb.append("    avgResponseTime: ").append(toIndentedString(avgResponseTime)).append("\n");
        sb.append("    caseRetry: ").append(toIndentedString(caseRetry)).append("\n");
        sb.append("    completeNum: ").append(toIndentedString(completeNum)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executedNum: ").append(toIndentedString(executedNum)).append("\n");
        sb.append("    iterationUri: ").append(toIndentedString(iterationUri)).append("\n");
        sb.append("    kpiCaseCount: ").append(toIndentedString(kpiCaseCount)).append("\n");
        sb.append("    kpiCaseExecuteCount: ").append(toIndentedString(kpiCaseExecuteCount)).append("\n");
        sb.append("    kpiCasePassCount: ").append(toIndentedString(kpiCasePassCount)).append("\n");
        sb.append("    maxUsers: ").append(toIndentedString(maxUsers)).append("\n");
        sb.append("    passNum: ").append(toIndentedString(passNum)).append("\n");
        sb.append("    progressState: ").append(toIndentedString(progressState)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    statusValue: ").append(toIndentedString(statusValue)).append("\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    tps: ").append(toIndentedString(tps)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
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
