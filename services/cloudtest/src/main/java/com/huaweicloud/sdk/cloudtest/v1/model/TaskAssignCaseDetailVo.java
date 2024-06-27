package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class TaskAssignCaseDetailVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private Integer sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private Integer stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_uri")

    private String taskUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updator_name")

    private String updatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updator")

    private String updator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_uri")

    private String caseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_available")

    private Integer isAvailable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_name")

    private String testCaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_uri")

    private String featureUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_number")

    private String testCaseNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svn_script_path")

    private String svnScriptPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private String statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_name")

    private String statusName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private String resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_name")

    private String resultName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_latest_time")

    private OffsetDateTime executeLatestTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_duration")

    private String executeDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_keyword")

    private Integer isKeyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_work_script_name")

    private String netWorkScriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_id")

    private Integer rankId;

    public TaskAssignCaseDetailVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 关联关系uri
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public TaskAssignCaseDetailVo withSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 排序顺序
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public TaskAssignCaseDetailVo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 责任人id
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TaskAssignCaseDetailVo withStage(Integer stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 测试阶段
     * @return stage
     */
    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public TaskAssignCaseDetailVo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public TaskAssignCaseDetailVo withTaskUri(String taskUri) {
        this.taskUri = taskUri;
        return this;
    }

    /**
     * 任务uri
     * @return taskUri
     */
    public String getTaskUri() {
        return taskUri;
    }

    public void setTaskUri(String taskUri) {
        this.taskUri = taskUri;
    }

    public TaskAssignCaseDetailVo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public TaskAssignCaseDetailVo withUpdatorName(String updatorName) {
        this.updatorName = updatorName;
        return this;
    }

    /**
     * 更新人
     * @return updatorName
     */
    public String getUpdatorName() {
        return updatorName;
    }

    public void setUpdatorName(String updatorName) {
        this.updatorName = updatorName;
    }

    public TaskAssignCaseDetailVo withUpdator(String updator) {
        this.updator = updator;
        return this;
    }

    /**
     * 更新人id
     * @return updator
     */
    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public TaskAssignCaseDetailVo withCaseUri(String caseUri) {
        this.caseUri = caseUri;
        return this;
    }

    /**
     * 用例uri
     * @return caseUri
     */
    public String getCaseUri() {
        return caseUri;
    }

    public void setCaseUri(String caseUri) {
        this.caseUri = caseUri;
    }

    public TaskAssignCaseDetailVo withIsAvailable(Integer isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    /**
     * 是否可用
     * @return isAvailable
     */
    public Integer getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Integer isAvailable) {
        this.isAvailable = isAvailable;
    }

    public TaskAssignCaseDetailVo withTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
        return this;
    }

    /**
     * 用例名称
     * @return testCaseName
     */
    public String getTestCaseName() {
        return testCaseName;
    }

    public void setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public TaskAssignCaseDetailVo withFeatureUri(String featureUri) {
        this.featureUri = featureUri;
        return this;
    }

    /**
     * 用例目录Uri
     * @return featureUri
     */
    public String getFeatureUri() {
        return featureUri;
    }

    public void setFeatureUri(String featureUri) {
        this.featureUri = featureUri;
    }

    public TaskAssignCaseDetailVo withTestCaseNumber(String testCaseNumber) {
        this.testCaseNumber = testCaseNumber;
        return this;
    }

    /**
     * 用例编号
     * @return testCaseNumber
     */
    public String getTestCaseNumber() {
        return testCaseNumber;
    }

    public void setTestCaseNumber(String testCaseNumber) {
        this.testCaseNumber = testCaseNumber;
    }

    public TaskAssignCaseDetailVo withSvnScriptPath(String svnScriptPath) {
        this.svnScriptPath = svnScriptPath;
        return this;
    }

    /**
     * 脚本路径
     * @return svnScriptPath
     */
    public String getSvnScriptPath() {
        return svnScriptPath;
    }

    public void setSvnScriptPath(String svnScriptPath) {
        this.svnScriptPath = svnScriptPath;
    }

    public TaskAssignCaseDetailVo withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 状态
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public TaskAssignCaseDetailVo withStatusName(String statusName) {
        this.statusName = statusName;
        return this;
    }

    /**
     * 状态名称
     * @return statusName
     */
    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public TaskAssignCaseDetailVo withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 结果id
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public TaskAssignCaseDetailVo withResultName(String resultName) {
        this.resultName = resultName;
        return this;
    }

    /**
     * 结果名称
     * @return resultName
     */
    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public TaskAssignCaseDetailVo withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 责任人名称
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public TaskAssignCaseDetailVo withExecuteLatestTime(OffsetDateTime executeLatestTime) {
        this.executeLatestTime = executeLatestTime;
        return this;
    }

    /**
     * 最新执行时间
     * @return executeLatestTime
     */
    public OffsetDateTime getExecuteLatestTime() {
        return executeLatestTime;
    }

    public void setExecuteLatestTime(OffsetDateTime executeLatestTime) {
        this.executeLatestTime = executeLatestTime;
    }

    public TaskAssignCaseDetailVo withExecuteDuration(String executeDuration) {
        this.executeDuration = executeDuration;
        return this;
    }

    /**
     * 执行时长
     * @return executeDuration
     */
    public String getExecuteDuration() {
        return executeDuration;
    }

    public void setExecuteDuration(String executeDuration) {
        this.executeDuration = executeDuration;
    }

    public TaskAssignCaseDetailVo withIsKeyword(Integer isKeyword) {
        this.isKeyword = isKeyword;
        return this;
    }

    /**
     * 是否是关键用例
     * @return isKeyword
     */
    public Integer getIsKeyword() {
        return isKeyword;
    }

    public void setIsKeyword(Integer isKeyword) {
        this.isKeyword = isKeyword;
    }

    public TaskAssignCaseDetailVo withNetWorkScriptName(String netWorkScriptName) {
        this.netWorkScriptName = netWorkScriptName;
        return this;
    }

    /**
     * 脚本名称
     * @return netWorkScriptName
     */
    public String getNetWorkScriptName() {
        return netWorkScriptName;
    }

    public void setNetWorkScriptName(String netWorkScriptName) {
        this.netWorkScriptName = netWorkScriptName;
    }

    public TaskAssignCaseDetailVo withRankId(Integer rankId) {
        this.rankId = rankId;
        return this;
    }

    /**
     * 用例等级
     * @return rankId
     */
    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskAssignCaseDetailVo that = (TaskAssignCaseDetailVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.sort, that.sort)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.stage, that.stage)
            && Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.taskUri, that.taskUri)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.updatorName, that.updatorName)
            && Objects.equals(this.updator, that.updator) && Objects.equals(this.caseUri, that.caseUri)
            && Objects.equals(this.isAvailable, that.isAvailable)
            && Objects.equals(this.testCaseName, that.testCaseName) && Objects.equals(this.featureUri, that.featureUri)
            && Objects.equals(this.testCaseNumber, that.testCaseNumber)
            && Objects.equals(this.svnScriptPath, that.svnScriptPath)
            && Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.statusName, that.statusName)
            && Objects.equals(this.resultCode, that.resultCode) && Objects.equals(this.resultName, that.resultName)
            && Objects.equals(this.ownerName, that.ownerName)
            && Objects.equals(this.executeLatestTime, that.executeLatestTime)
            && Objects.equals(this.executeDuration, that.executeDuration)
            && Objects.equals(this.isKeyword, that.isKeyword)
            && Objects.equals(this.netWorkScriptName, that.netWorkScriptName)
            && Objects.equals(this.rankId, that.rankId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            sort,
            owner,
            stage,
            projectUuid,
            taskUri,
            updateTime,
            updatorName,
            updator,
            caseUri,
            isAvailable,
            testCaseName,
            featureUri,
            testCaseNumber,
            svnScriptPath,
            statusCode,
            statusName,
            resultCode,
            resultName,
            ownerName,
            executeLatestTime,
            executeDuration,
            isKeyword,
            netWorkScriptName,
            rankId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskAssignCaseDetailVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    taskUri: ").append(toIndentedString(taskUri)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updatorName: ").append(toIndentedString(updatorName)).append("\n");
        sb.append("    updator: ").append(toIndentedString(updator)).append("\n");
        sb.append("    caseUri: ").append(toIndentedString(caseUri)).append("\n");
        sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
        sb.append("    testCaseName: ").append(toIndentedString(testCaseName)).append("\n");
        sb.append("    featureUri: ").append(toIndentedString(featureUri)).append("\n");
        sb.append("    testCaseNumber: ").append(toIndentedString(testCaseNumber)).append("\n");
        sb.append("    svnScriptPath: ").append(toIndentedString(svnScriptPath)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    resultName: ").append(toIndentedString(resultName)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    executeLatestTime: ").append(toIndentedString(executeLatestTime)).append("\n");
        sb.append("    executeDuration: ").append(toIndentedString(executeDuration)).append("\n");
        sb.append("    isKeyword: ").append(toIndentedString(isKeyword)).append("\n");
        sb.append("    netWorkScriptName: ").append(toIndentedString(netWorkScriptName)).append("\n");
        sb.append("    rankId: ").append(toIndentedString(rankId)).append("\n");
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
