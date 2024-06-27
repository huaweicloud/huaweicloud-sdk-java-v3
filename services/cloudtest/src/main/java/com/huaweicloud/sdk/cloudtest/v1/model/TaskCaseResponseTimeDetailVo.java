package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskCaseResponseTimeDetailVo
 */
public class TaskCaseResponseTimeDetailVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_id")

    private String caseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_name")

    private String caseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_reason")

    private String errorReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_time")

    private Long responseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_task_id")

    private String subTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_id")

    private String tagId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name")

    private String tagName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_case_id")

    private String taskCaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type_id")

    private String taskTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_suite_type")

    private Integer testSuiteType;

    public TaskCaseResponseTimeDetailVo withCaseId(String caseId) {
        this.caseId = caseId;
        return this;
    }

    /**
     * 用例ID
     * @return caseId
     */
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public TaskCaseResponseTimeDetailVo withCaseName(String caseName) {
        this.caseName = caseName;
        return this;
    }

    /**
     * 用例名称
     * @return caseName
     */
    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public TaskCaseResponseTimeDetailVo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 用例结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public TaskCaseResponseTimeDetailVo withErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    /**
     * 用例状态
     * @return errorReason
     */
    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    public TaskCaseResponseTimeDetailVo withResponseTime(Long responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    /**
     * 用例响应时间
     * @return responseTime
     */
    public Long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Long responseTime) {
        this.responseTime = responseTime;
    }

    public TaskCaseResponseTimeDetailVo withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务ID
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public TaskCaseResponseTimeDetailVo withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 服务名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public TaskCaseResponseTimeDetailVo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 用例开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public TaskCaseResponseTimeDetailVo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 用例状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TaskCaseResponseTimeDetailVo withSubTaskId(String subTaskId) {
        this.subTaskId = subTaskId;
        return this;
    }

    /**
     * 子任务ID
     * @return subTaskId
     */
    public String getSubTaskId() {
        return subTaskId;
    }

    public void setSubTaskId(String subTaskId) {
        this.subTaskId = subTaskId;
    }

    public TaskCaseResponseTimeDetailVo withTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }

    /**
     * 已废弃
     * @return tagId
     */
    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public TaskCaseResponseTimeDetailVo withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * 已废弃
     * @return tagName
     */
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public TaskCaseResponseTimeDetailVo withTaskCaseId(String taskCaseId) {
        this.taskCaseId = taskCaseId;
        return this;
    }

    /**
     * 任务和用例关联关系的ID
     * @return taskCaseId
     */
    public String getTaskCaseId() {
        return taskCaseId;
    }

    public void setTaskCaseId(String taskCaseId) {
        this.taskCaseId = taskCaseId;
    }

    public TaskCaseResponseTimeDetailVo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskCaseResponseTimeDetailVo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskCaseResponseTimeDetailVo withTaskTypeId(String taskTypeId) {
        this.taskTypeId = taskTypeId;
        return this;
    }

    /**
     * 任务类型，1=拨测，2=冒烟，4=部署测试，5=小网拨测
     * @return taskTypeId
     */
    public String getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(String taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public TaskCaseResponseTimeDetailVo withTestSuiteType(Integer testSuiteType) {
        this.testSuiteType = testSuiteType;
        return this;
    }

    /**
     * 测试套类型
     * @return testSuiteType
     */
    public Integer getTestSuiteType() {
        return testSuiteType;
    }

    public void setTestSuiteType(Integer testSuiteType) {
        this.testSuiteType = testSuiteType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskCaseResponseTimeDetailVo that = (TaskCaseResponseTimeDetailVo) obj;
        return Objects.equals(this.caseId, that.caseId) && Objects.equals(this.caseName, that.caseName)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.errorReason, that.errorReason)
            && Objects.equals(this.responseTime, that.responseTime) && Objects.equals(this.serviceId, that.serviceId)
            && Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.state, that.state) && Objects.equals(this.subTaskId, that.subTaskId)
            && Objects.equals(this.tagId, that.tagId) && Objects.equals(this.tagName, that.tagName)
            && Objects.equals(this.taskCaseId, that.taskCaseId) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.taskTypeId, that.taskTypeId)
            && Objects.equals(this.testSuiteType, that.testSuiteType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseId,
            caseName,
            endTime,
            errorReason,
            responseTime,
            serviceId,
            serviceName,
            startTime,
            state,
            subTaskId,
            tagId,
            tagName,
            taskCaseId,
            taskId,
            taskName,
            taskTypeId,
            testSuiteType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskCaseResponseTimeDetailVo {\n");
        sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
        sb.append("    caseName: ").append(toIndentedString(caseName)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
        sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    subTaskId: ").append(toIndentedString(subTaskId)).append("\n");
        sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    taskCaseId: ").append(toIndentedString(taskCaseId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskTypeId: ").append(toIndentedString(taskTypeId)).append("\n");
        sb.append("    testSuiteType: ").append(toIndentedString(testSuiteType)).append("\n");
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
