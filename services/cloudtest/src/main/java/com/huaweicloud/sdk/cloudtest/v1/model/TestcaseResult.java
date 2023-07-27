package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 测试用例结果
 */
public class TestcaseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_result_id")

    private String executeResultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_status")

    private String executeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_cause")

    private String failureCause;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_id")

    private String executorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_name")

    private String executorName;

    public TestcaseResult withExecuteResultId(String executeResultId) {
        this.executeResultId = executeResultId;
        return this;
    }

    /**
     * 结果
     * @return executeResultId
     */
    public String getExecuteResultId() {
        return executeResultId;
    }

    public void setExecuteResultId(String executeResultId) {
        this.executeResultId = executeResultId;
    }

    public TestcaseResult withExecuteStatus(String executeStatus) {
        this.executeStatus = executeStatus;
        return this;
    }

    /**
     * 测试用例状态
     * @return executeStatus
     */
    public String getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(String executeStatus) {
        this.executeStatus = executeStatus;
    }

    public TestcaseResult withFailureCause(String failureCause) {
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

    public TestcaseResult withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TestcaseResult withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 测试计划id
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public TestcaseResult withStartTime(String startTime) {
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

    public TestcaseResult withEndTime(String endTime) {
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

    public TestcaseResult withExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }

    /**
     * 执行测试用例用户id
     * @return executorId
     */
    public String getExecutorId() {
        return executorId;
    }

    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    public TestcaseResult withExecutorName(String executorName) {
        this.executorName = executorName;
        return this;
    }

    /**
     * 执行测试用例用户name
     * @return executorName
     */
    public String getExecutorName() {
        return executorName;
    }

    public void setExecutorName(String executorName) {
        this.executorName = executorName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestcaseResult that = (TestcaseResult) obj;
        return Objects.equals(this.executeResultId, that.executeResultId)
            && Objects.equals(this.executeStatus, that.executeStatus)
            && Objects.equals(this.failureCause, that.failureCause) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.planId, that.planId) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.executorId, that.executorId)
            && Objects.equals(this.executorName, that.executorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executeResultId,
            executeStatus,
            failureCause,
            taskId,
            planId,
            startTime,
            endTime,
            executorId,
            executorName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestcaseResult {\n");
        sb.append("    executeResultId: ").append(toIndentedString(executeResultId)).append("\n");
        sb.append("    executeStatus: ").append(toIndentedString(executeStatus)).append("\n");
        sb.append("    failureCause: ").append(toIndentedString(failureCause)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
        sb.append("    executorName: ").append(toIndentedString(executorName)).append("\n");
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
