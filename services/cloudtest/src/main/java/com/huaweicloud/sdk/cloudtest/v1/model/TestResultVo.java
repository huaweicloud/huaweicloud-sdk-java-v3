package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class TestResultVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private String author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank")

    private Integer rank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Integer result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "round")

    private Integer round;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preparation")

    private String preparation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "steps")

    private List<ResultStepVo> steps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private OffsetDateTime beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time_timestamp")

    private Long beginTimeTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time_timestamp")

    private Long endTimeTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date")

    private String creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date_timestamp")

    private Long creationDateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private OffsetDateTime lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_timestamp")

    private Long lastModifiedTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_change_time")

    private OffsetDateTime lastChangeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_change_time_timestamp")

    private Long lastChangeTimeTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dfx_test_result")

    private String dfxTestResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_cause")

    private String failureCause;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_uri")

    private String parentUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_uri")

    private String testCaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_name")

    private String testCaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_uri")

    private String taskUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_name")

    private String resultName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_result_ae")

    private String testResultAe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_id")

    private String executorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_name")

    private String executorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_id")

    private String executeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_cost")

    private Integer timeCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_txt")

    private String stepTxt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_expect")

    private String stepExpect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_actual")

    private String stepActual;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_result")

    private String stepResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_dev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_version_uri")

    private String creationVersionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_url")

    private String reportUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_number")

    private String testCaseNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    public TestResultVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 结果URI
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public TestResultVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用例结果名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestResultVo withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * 创建人ID
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public TestResultVo withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * 级别
     * @return rank
     */
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public TestResultVo withResult(Integer result) {
        this.result = result;
        return this;
    }

    /**
     * 测试结果Code
     * @return result
     */
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public TestResultVo withRound(Integer round) {
        this.round = round;
        return this;
    }

    /**
     * 执行批次
     * @return round
     */
    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public TestResultVo withPreparation(String preparation) {
        this.preparation = preparation;
        return this;
    }

    /**
     * 前置条件
     * @return preparation
     */
    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public TestResultVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TestResultVo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 逻辑Region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TestResultVo withSteps(List<ResultStepVo> steps) {
        this.steps = steps;
        return this;
    }

    public TestResultVo addStepsItem(ResultStepVo stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    public TestResultVo withSteps(Consumer<List<ResultStepVo>> stepsSetter) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        stepsSetter.accept(this.steps);
        return this;
    }

    /**
     * 测试步骤信息
     * @return steps
     */
    public List<ResultStepVo> getSteps() {
        return steps;
    }

    public void setSteps(List<ResultStepVo> steps) {
        this.steps = steps;
    }

    public TestResultVo withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 用例结果编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public TestResultVo withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * 创建人名称
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public TestResultVo withBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 执行开始时间
     * @return beginTime
     */
    public OffsetDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(OffsetDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public TestResultVo withBeginTimeTimestamp(Long beginTimeTimestamp) {
        this.beginTimeTimestamp = beginTimeTimestamp;
        return this;
    }

    /**
     * 执行开始时间时间戳
     * @return beginTimeTimestamp
     */
    public Long getBeginTimeTimestamp() {
        return beginTimeTimestamp;
    }

    public void setBeginTimeTimestamp(Long beginTimeTimestamp) {
        this.beginTimeTimestamp = beginTimeTimestamp;
    }

    public TestResultVo withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 执行结束时间
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public TestResultVo withEndTimeTimestamp(Long endTimeTimestamp) {
        this.endTimeTimestamp = endTimeTimestamp;
        return this;
    }

    /**
     * 执行结束时间时间戳
     * @return endTimeTimestamp
     */
    public Long getEndTimeTimestamp() {
        return endTimeTimestamp;
    }

    public void setEndTimeTimestamp(Long endTimeTimestamp) {
        this.endTimeTimestamp = endTimeTimestamp;
    }

    public TestResultVo withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * 创建时间
     * @return creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public TestResultVo withCreationDateTimestamp(Long creationDateTimestamp) {
        this.creationDateTimestamp = creationDateTimestamp;
        return this;
    }

    /**
     * 创建时间时间戳
     * @return creationDateTimestamp
     */
    public Long getCreationDateTimestamp() {
        return creationDateTimestamp;
    }

    public void setCreationDateTimestamp(Long creationDateTimestamp) {
        this.creationDateTimestamp = creationDateTimestamp;
    }

    public TestResultVo withLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 最后修改时间
     * @return lastModified
     */
    public OffsetDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public TestResultVo withLastModifiedTimestamp(Long lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
        return this;
    }

    /**
     * 最后修改时间
     * @return lastModifiedTimestamp
     */
    public Long getLastModifiedTimestamp() {
        return lastModifiedTimestamp;
    }

    public void setLastModifiedTimestamp(Long lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    public TestResultVo withLastChangeTime(OffsetDateTime lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
        return this;
    }

    /**
     * 最后变更时间
     * @return lastChangeTime
     */
    public OffsetDateTime getLastChangeTime() {
        return lastChangeTime;
    }

    public void setLastChangeTime(OffsetDateTime lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
    }

    public TestResultVo withLastChangeTimeTimestamp(Long lastChangeTimeTimestamp) {
        this.lastChangeTimeTimestamp = lastChangeTimeTimestamp;
        return this;
    }

    /**
     * 最后变更时间
     * @return lastChangeTimeTimestamp
     */
    public Long getLastChangeTimeTimestamp() {
        return lastChangeTimeTimestamp;
    }

    public void setLastChangeTimeTimestamp(Long lastChangeTimeTimestamp) {
        this.lastChangeTimeTimestamp = lastChangeTimeTimestamp;
    }

    public TestResultVo withDfxTestResult(String dfxTestResult) {
        this.dfxTestResult = dfxTestResult;
        return this;
    }

    /**
     * DFX测试结果
     * @return dfxTestResult
     */
    public String getDfxTestResult() {
        return dfxTestResult;
    }

    public void setDfxTestResult(String dfxTestResult) {
        this.dfxTestResult = dfxTestResult;
    }

    public TestResultVo withFailureCause(String failureCause) {
        this.failureCause = failureCause;
        return this;
    }

    /**
     * 失败原因
     * @return failureCause
     */
    public String getFailureCause() {
        return failureCause;
    }

    public void setFailureCause(String failureCause) {
        this.failureCause = failureCause;
    }

    public TestResultVo withParentUri(String parentUri) {
        this.parentUri = parentUri;
        return this;
    }

    /**
     * 父节点URI(分支用例URI或迭代用例URI)
     * @return parentUri
     */
    public String getParentUri() {
        return parentUri;
    }

    public void setParentUri(String parentUri) {
        this.parentUri = parentUri;
    }

    public TestResultVo withTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
        return this;
    }

    /**
     * 分支用例URI
     * @return testCaseUri
     */
    public String getTestCaseUri() {
        return testCaseUri;
    }

    public void setTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
    }

    public TestResultVo withTestCaseName(String testCaseName) {
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

    public TestResultVo withTaskUri(String taskUri) {
        this.taskUri = taskUri;
        return this;
    }

    /**
     * 测试任务URI
     * @return taskUri
     */
    public String getTaskUri() {
        return taskUri;
    }

    public void setTaskUri(String taskUri) {
        this.taskUri = taskUri;
    }

    public TestResultVo withResultName(String resultName) {
        this.resultName = resultName;
        return this;
    }

    /**
     * 测试结果
     * @return resultName
     */
    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public TestResultVo withTestResultAe(String testResultAe) {
        this.testResultAe = testResultAe;
        return this;
    }

    /**
     * 是否自动化执行
     * @return testResultAe
     */
    public String getTestResultAe() {
        return testResultAe;
    }

    public void setTestResultAe(String testResultAe) {
        this.testResultAe = testResultAe;
    }

    public TestResultVo withExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }

    /**
     * 执行人ID
     * @return executorId
     */
    public String getExecutorId() {
        return executorId;
    }

    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    public TestResultVo withExecutorName(String executorName) {
        this.executorName = executorName;
        return this;
    }

    /**
     * 执行人名称
     * @return executorName
     */
    public String getExecutorName() {
        return executorName;
    }

    public void setExecutorName(String executorName) {
        this.executorName = executorName;
    }

    public TestResultVo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 执行机任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TestResultVo withExecuteId(String executeId) {
        this.executeId = executeId;
        return this;
    }

    /**
     * 执行ID
     * @return executeId
     */
    public String getExecuteId() {
        return executeId;
    }

    public void setExecuteId(String executeId) {
        this.executeId = executeId;
    }

    public TestResultVo withTimeCost(Integer timeCost) {
        this.timeCost = timeCost;
        return this;
    }

    /**
     * 执行耗时
     * @return timeCost
     */
    public Integer getTimeCost() {
        return timeCost;
    }

    public void setTimeCost(Integer timeCost) {
        this.timeCost = timeCost;
    }

    public TestResultVo withStepTxt(String stepTxt) {
        this.stepTxt = stepTxt;
        return this;
    }

    /**
     * 测试步骤
     * @return stepTxt
     */
    public String getStepTxt() {
        return stepTxt;
    }

    public void setStepTxt(String stepTxt) {
        this.stepTxt = stepTxt;
    }

    public TestResultVo withStepExpect(String stepExpect) {
        this.stepExpect = stepExpect;
        return this;
    }

    /**
     * 测试步骤期望结果
     * @return stepExpect
     */
    public String getStepExpect() {
        return stepExpect;
    }

    public void setStepExpect(String stepExpect) {
        this.stepExpect = stepExpect;
    }

    public TestResultVo withStepActual(String stepActual) {
        this.stepActual = stepActual;
        return this;
    }

    /**
     * 测试步骤实际结果
     * @return stepActual
     */
    public String getStepActual() {
        return stepActual;
    }

    public void setStepActual(String stepActual) {
        this.stepActual = stepActual;
    }

    public TestResultVo withStepResult(String stepResult) {
        this.stepResult = stepResult;
        return this;
    }

    /**
     * 测试步骤结果
     * @return stepResult
     */
    public String getStepResult() {
        return stepResult;
    }

    public void setStepResult(String stepResult) {
        this.stepResult = stepResult;
    }

    public TestResultVo withReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
        return this;
    }

    /**
     * 版本号
     * @return releaseDev
     */
    public String getReleaseDev() {
        return releaseDev;
    }

    public void setReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
    }

    public TestResultVo withCreationVersionUri(String creationVersionUri) {
        this.creationVersionUri = creationVersionUri;
        return this;
    }

    /**
     * 创建版本URI
     * @return creationVersionUri
     */
    public String getCreationVersionUri() {
        return creationVersionUri;
    }

    public void setCreationVersionUri(String creationVersionUri) {
        this.creationVersionUri = creationVersionUri;
    }

    public TestResultVo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 版本URI
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public TestResultVo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TestResultVo withReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }

    /**
     * 第三方过来的执行结果，返回跳转到第三方的url
     * @return reportUrl
     */
    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public TestResultVo withTestCaseNumber(String testCaseNumber) {
        this.testCaseNumber = testCaseNumber;
        return this;
    }

    /**
     * 测试用例编号
     * @return testCaseNumber
     */
    public String getTestCaseNumber() {
        return testCaseNumber;
    }

    public void setTestCaseNumber(String testCaseNumber) {
        this.testCaseNumber = testCaseNumber;
    }

    public TestResultVo withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 测试类型
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestResultVo that = (TestResultVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.name, that.name)
            && Objects.equals(this.author, that.author) && Objects.equals(this.rank, that.rank)
            && Objects.equals(this.result, that.result) && Objects.equals(this.round, that.round)
            && Objects.equals(this.preparation, that.preparation) && Objects.equals(this.description, that.description)
            && Objects.equals(this.region, that.region) && Objects.equals(this.steps, that.steps)
            && Objects.equals(this.number, that.number) && Objects.equals(this.authorName, that.authorName)
            && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.beginTimeTimestamp, that.beginTimeTimestamp)
            && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.endTimeTimestamp, that.endTimeTimestamp)
            && Objects.equals(this.creationDate, that.creationDate)
            && Objects.equals(this.creationDateTimestamp, that.creationDateTimestamp)
            && Objects.equals(this.lastModified, that.lastModified)
            && Objects.equals(this.lastModifiedTimestamp, that.lastModifiedTimestamp)
            && Objects.equals(this.lastChangeTime, that.lastChangeTime)
            && Objects.equals(this.lastChangeTimeTimestamp, that.lastChangeTimeTimestamp)
            && Objects.equals(this.dfxTestResult, that.dfxTestResult)
            && Objects.equals(this.failureCause, that.failureCause) && Objects.equals(this.parentUri, that.parentUri)
            && Objects.equals(this.testCaseUri, that.testCaseUri)
            && Objects.equals(this.testCaseName, that.testCaseName) && Objects.equals(this.taskUri, that.taskUri)
            && Objects.equals(this.resultName, that.resultName) && Objects.equals(this.testResultAe, that.testResultAe)
            && Objects.equals(this.executorId, that.executorId) && Objects.equals(this.executorName, that.executorName)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.executeId, that.executeId)
            && Objects.equals(this.timeCost, that.timeCost) && Objects.equals(this.stepTxt, that.stepTxt)
            && Objects.equals(this.stepExpect, that.stepExpect) && Objects.equals(this.stepActual, that.stepActual)
            && Objects.equals(this.stepResult, that.stepResult) && Objects.equals(this.releaseDev, that.releaseDev)
            && Objects.equals(this.creationVersionUri, that.creationVersionUri)
            && Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.reportUrl, that.reportUrl)
            && Objects.equals(this.testCaseNumber, that.testCaseNumber)
            && Objects.equals(this.serviceType, that.serviceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            name,
            author,
            rank,
            result,
            round,
            preparation,
            description,
            region,
            steps,
            number,
            authorName,
            beginTime,
            beginTimeTimestamp,
            endTime,
            endTimeTimestamp,
            creationDate,
            creationDateTimestamp,
            lastModified,
            lastModifiedTimestamp,
            lastChangeTime,
            lastChangeTimeTimestamp,
            dfxTestResult,
            failureCause,
            parentUri,
            testCaseUri,
            testCaseName,
            taskUri,
            resultName,
            testResultAe,
            executorId,
            executorName,
            taskId,
            executeId,
            timeCost,
            stepTxt,
            stepExpect,
            stepActual,
            stepResult,
            releaseDev,
            creationVersionUri,
            versionUri,
            projectId,
            reportUrl,
            testCaseNumber,
            serviceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestResultVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    round: ").append(toIndentedString(round)).append("\n");
        sb.append("    preparation: ").append(toIndentedString(preparation)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    beginTimeTimestamp: ").append(toIndentedString(beginTimeTimestamp)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    endTimeTimestamp: ").append(toIndentedString(endTimeTimestamp)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    creationDateTimestamp: ").append(toIndentedString(creationDateTimestamp)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    lastModifiedTimestamp: ").append(toIndentedString(lastModifiedTimestamp)).append("\n");
        sb.append("    lastChangeTime: ").append(toIndentedString(lastChangeTime)).append("\n");
        sb.append("    lastChangeTimeTimestamp: ").append(toIndentedString(lastChangeTimeTimestamp)).append("\n");
        sb.append("    dfxTestResult: ").append(toIndentedString(dfxTestResult)).append("\n");
        sb.append("    failureCause: ").append(toIndentedString(failureCause)).append("\n");
        sb.append("    parentUri: ").append(toIndentedString(parentUri)).append("\n");
        sb.append("    testCaseUri: ").append(toIndentedString(testCaseUri)).append("\n");
        sb.append("    testCaseName: ").append(toIndentedString(testCaseName)).append("\n");
        sb.append("    taskUri: ").append(toIndentedString(taskUri)).append("\n");
        sb.append("    resultName: ").append(toIndentedString(resultName)).append("\n");
        sb.append("    testResultAe: ").append(toIndentedString(testResultAe)).append("\n");
        sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
        sb.append("    executorName: ").append(toIndentedString(executorName)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    executeId: ").append(toIndentedString(executeId)).append("\n");
        sb.append("    timeCost: ").append(toIndentedString(timeCost)).append("\n");
        sb.append("    stepTxt: ").append(toIndentedString(stepTxt)).append("\n");
        sb.append("    stepExpect: ").append(toIndentedString(stepExpect)).append("\n");
        sb.append("    stepActual: ").append(toIndentedString(stepActual)).append("\n");
        sb.append("    stepResult: ").append(toIndentedString(stepResult)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    creationVersionUri: ").append(toIndentedString(creationVersionUri)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    reportUrl: ").append(toIndentedString(reportUrl)).append("\n");
        sb.append("    testCaseNumber: ").append(toIndentedString(testCaseNumber)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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
