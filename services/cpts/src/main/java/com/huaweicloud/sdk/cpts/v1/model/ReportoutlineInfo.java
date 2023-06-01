package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReportoutlineInfo
 */
public class ReportoutlineInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avgResponseTime")

    private Double avgResponseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branchId")

    private String branchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branchName")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseRetry")

    private Double caseRetry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completeNum")

    private Double completeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Double duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executedNum")

    private Double executedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterationUri")

    private String iterationUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kpiCaseCount")

    private Double kpiCaseCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kpiCaseExecuteCount")

    private Double kpiCaseExecuteCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kpiCasePassCount")

    private Double kpiCasePassCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxUsers")

    private Double maxUsers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "passNum")

    private Double passNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private Double stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stageName")

    private String stageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successRate")

    private Double successRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskStatus")

    private Double taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalNum")

    private Double totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tps")

    private Double tps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versionUri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceId")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progressState")

    private String progressState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createBy")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusValue")

    private String statusValue;

    public ReportoutlineInfo withAvgResponseTime(Double avgResponseTime) {
        this.avgResponseTime = avgResponseTime;
        return this;
    }

    /**
     * 平均响应时间
     * @return avgResponseTime
     */
    public Double getAvgResponseTime() {
        return avgResponseTime;
    }

    public void setAvgResponseTime(Double avgResponseTime) {
        this.avgResponseTime = avgResponseTime;
    }

    public ReportoutlineInfo withBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }

    /**
     * 分支id
     * @return branchId
     */
    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public ReportoutlineInfo withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * 分支名称
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public ReportoutlineInfo withCaseRetry(Double caseRetry) {
        this.caseRetry = caseRetry;
        return this;
    }

    /**
     * 用例重试次数
     * @return caseRetry
     */
    public Double getCaseRetry() {
        return caseRetry;
    }

    public void setCaseRetry(Double caseRetry) {
        this.caseRetry = caseRetry;
    }

    public ReportoutlineInfo withCompleteNum(Double completeNum) {
        this.completeNum = completeNum;
        return this;
    }

    /**
     * 已完成的用例数
     * @return completeNum
     */
    public Double getCompleteNum() {
        return completeNum;
    }

    public void setCompleteNum(Double completeNum) {
        this.completeNum = completeNum;
    }

    public ReportoutlineInfo withDuration(Double duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 持续时间
     * @return duration
     */
    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public ReportoutlineInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ReportoutlineInfo withExecutedNum(Double executedNum) {
        this.executedNum = executedNum;
        return this;
    }

    /**
     * 已执行用例数
     * @return executedNum
     */
    public Double getExecutedNum() {
        return executedNum;
    }

    public void setExecutedNum(Double executedNum) {
        this.executedNum = executedNum;
    }

    public ReportoutlineInfo withIterationUri(String iterationUri) {
        this.iterationUri = iterationUri;
        return this;
    }

    /**
     * 迭代id
     * @return iterationUri
     */
    public String getIterationUri() {
        return iterationUri;
    }

    public void setIterationUri(String iterationUri) {
        this.iterationUri = iterationUri;
    }

    public ReportoutlineInfo withKpiCaseCount(Double kpiCaseCount) {
        this.kpiCaseCount = kpiCaseCount;
        return this;
    }

    /**
     * kpi用例数
     * @return kpiCaseCount
     */
    public Double getKpiCaseCount() {
        return kpiCaseCount;
    }

    public void setKpiCaseCount(Double kpiCaseCount) {
        this.kpiCaseCount = kpiCaseCount;
    }

    public ReportoutlineInfo withKpiCaseExecuteCount(Double kpiCaseExecuteCount) {
        this.kpiCaseExecuteCount = kpiCaseExecuteCount;
        return this;
    }

    /**
     * kpi用例执行次数
     * @return kpiCaseExecuteCount
     */
    public Double getKpiCaseExecuteCount() {
        return kpiCaseExecuteCount;
    }

    public void setKpiCaseExecuteCount(Double kpiCaseExecuteCount) {
        this.kpiCaseExecuteCount = kpiCaseExecuteCount;
    }

    public ReportoutlineInfo withKpiCasePassCount(Double kpiCasePassCount) {
        this.kpiCasePassCount = kpiCasePassCount;
        return this;
    }

    /**
     * kpi用例通过次数
     * @return kpiCasePassCount
     */
    public Double getKpiCasePassCount() {
        return kpiCasePassCount;
    }

    public void setKpiCasePassCount(Double kpiCasePassCount) {
        this.kpiCasePassCount = kpiCasePassCount;
    }

    public ReportoutlineInfo withMaxUsers(Double maxUsers) {
        this.maxUsers = maxUsers;
        return this;
    }

    /**
     * 最大并发数
     * @return maxUsers
     */
    public Double getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(Double maxUsers) {
        this.maxUsers = maxUsers;
    }

    public ReportoutlineInfo withPassNum(Double passNum) {
        this.passNum = passNum;
        return this;
    }

    /**
     * 结果为pass的用例数
     * @return passNum
     */
    public Double getPassNum() {
        return passNum;
    }

    public void setPassNum(Double passNum) {
        this.passNum = passNum;
    }

    public ReportoutlineInfo withStage(Double stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 阶段id
     * @return stage
     */
    public Double getStage() {
        return stage;
    }

    public void setStage(Double stage) {
        this.stage = stage;
    }

    public ReportoutlineInfo withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * 阶段名称
     * @return stageName
     */
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

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ReportoutlineInfo withSuccessRate(Double successRate) {
        this.successRate = successRate;
        return this;
    }

    /**
     * 成功率
     * @return successRate
     */
    public Double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Double successRate) {
        this.successRate = successRate;
    }

    public ReportoutlineInfo withTaskStatus(Double taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态
     * @return taskStatus
     */
    public Double getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Double taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ReportoutlineInfo withTotalNum(Double totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 总用例数
     * @return totalNum
     */
    public Double getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Double totalNum) {
        this.totalNum = totalNum;
    }

    public ReportoutlineInfo withTps(Double tps) {
        this.tps = tps;
        return this;
    }

    /**
     * 性能tps指标
     * @return tps
     */
    public Double getTps() {
        return tps;
    }

    public void setTps(Double tps) {
        this.tps = tps;
    }

    public ReportoutlineInfo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 分支uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public ReportoutlineInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 工程id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ReportoutlineInfo withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务id
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ReportoutlineInfo withProgressState(String progressState) {
        this.progressState = progressState;
        return this;
    }

    /**
     * 内部版本字段，已弃用，待删除
     * @return progressState
     */
    public String getProgressState() {
        return progressState;
    }

    public void setProgressState(String progressState) {
        this.progressState = progressState;
    }

    public ReportoutlineInfo withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 报告执行人
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public ReportoutlineInfo withStatusValue(String statusValue) {
        this.statusValue = statusValue;
        return this;
    }

    /**
     * 内部版本字段，已弃用，待删除
     * @return statusValue
     */
    public String getStatusValue() {
        return statusValue;
    }

    public void setStatusValue(String statusValue) {
        this.statusValue = statusValue;
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
            && Objects.equals(this.branchId, reportoutlineInfo.branchId)
            && Objects.equals(this.branchName, reportoutlineInfo.branchName)
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
            && Objects.equals(this.stage, reportoutlineInfo.stage)
            && Objects.equals(this.stageName, reportoutlineInfo.stageName)
            && Objects.equals(this.startTime, reportoutlineInfo.startTime)
            && Objects.equals(this.successRate, reportoutlineInfo.successRate)
            && Objects.equals(this.taskStatus, reportoutlineInfo.taskStatus)
            && Objects.equals(this.totalNum, reportoutlineInfo.totalNum)
            && Objects.equals(this.tps, reportoutlineInfo.tps)
            && Objects.equals(this.versionUri, reportoutlineInfo.versionUri)
            && Objects.equals(this.projectId, reportoutlineInfo.projectId)
            && Objects.equals(this.serviceId, reportoutlineInfo.serviceId)
            && Objects.equals(this.progressState, reportoutlineInfo.progressState)
            && Objects.equals(this.createBy, reportoutlineInfo.createBy)
            && Objects.equals(this.statusValue, reportoutlineInfo.statusValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avgResponseTime,
            branchId,
            branchName,
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
            stage,
            stageName,
            startTime,
            successRate,
            taskStatus,
            totalNum,
            tps,
            versionUri,
            projectId,
            serviceId,
            progressState,
            createBy,
            statusValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportoutlineInfo {\n");
        sb.append("    avgResponseTime: ").append(toIndentedString(avgResponseTime)).append("\n");
        sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
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
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    tps: ").append(toIndentedString(tps)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    progressState: ").append(toIndentedString(progressState)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    statusValue: ").append(toIndentedString(statusValue)).append("\n");
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
