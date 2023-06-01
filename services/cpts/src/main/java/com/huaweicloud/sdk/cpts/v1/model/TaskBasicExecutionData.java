package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskBasicExecutionData
 */
public class TaskBasicExecutionData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_num")

    private Integer completeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executed_num")

    private Integer executedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kpi_case_count")

    private Integer kpiCaseCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kpi_case_execute_count")

    private Integer kpiCaseExecuteCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kpi_case_pass_count")

    private Integer kpiCasePassCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel")

    private Boolean parallel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pass_num")

    private Integer passNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private Integer taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vum")

    private Integer vum;

    public TaskBasicExecutionData withCompleteNum(Integer completeNum) {
        this.completeNum = completeNum;
        return this;
    }

    /**
     * 已执行完成的用例数
     * @return completeNum
     */
    public Integer getCompleteNum() {
        return completeNum;
    }

    public void setCompleteNum(Integer completeNum) {
        this.completeNum = completeNum;
    }

    public TaskBasicExecutionData withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 持续时间
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public TaskBasicExecutionData withEndTime(String endTime) {
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

    public TaskBasicExecutionData withExecutedNum(Integer executedNum) {
        this.executedNum = executedNum;
        return this;
    }

    /**
     * 已执行用例数
     * @return executedNum
     */
    public Integer getExecutedNum() {
        return executedNum;
    }

    public void setExecutedNum(Integer executedNum) {
        this.executedNum = executedNum;
    }

    public TaskBasicExecutionData withKpiCaseCount(Integer kpiCaseCount) {
        this.kpiCaseCount = kpiCaseCount;
        return this;
    }

    /**
     * 【指标数据:最后一个轮次】 用例数
     * @return kpiCaseCount
     */
    public Integer getKpiCaseCount() {
        return kpiCaseCount;
    }

    public void setKpiCaseCount(Integer kpiCaseCount) {
        this.kpiCaseCount = kpiCaseCount;
    }

    public TaskBasicExecutionData withKpiCaseExecuteCount(Integer kpiCaseExecuteCount) {
        this.kpiCaseExecuteCount = kpiCaseExecuteCount;
        return this;
    }

    /**
     * 【指标数据:最后一个轮次】 已执行的用例数
     * @return kpiCaseExecuteCount
     */
    public Integer getKpiCaseExecuteCount() {
        return kpiCaseExecuteCount;
    }

    public void setKpiCaseExecuteCount(Integer kpiCaseExecuteCount) {
        this.kpiCaseExecuteCount = kpiCaseExecuteCount;
    }

    public TaskBasicExecutionData withKpiCasePassCount(Integer kpiCasePassCount) {
        this.kpiCasePassCount = kpiCasePassCount;
        return this;
    }

    /**
     * 【指标数据:最后一个轮次】 最后一轮结果为Pass的用例数
     * @return kpiCasePassCount
     */
    public Integer getKpiCasePassCount() {
        return kpiCasePassCount;
    }

    public void setKpiCasePassCount(Integer kpiCasePassCount) {
        this.kpiCasePassCount = kpiCasePassCount;
    }

    public TaskBasicExecutionData withParallel(Boolean parallel) {
        this.parallel = parallel;
        return this;
    }

    /**
     * 任务间用例是否并行执行
     * @return parallel
     */
    public Boolean getParallel() {
        return parallel;
    }

    public void setParallel(Boolean parallel) {
        this.parallel = parallel;
    }

    public TaskBasicExecutionData withPassNum(Integer passNum) {
        this.passNum = passNum;
        return this;
    }

    /**
     * 用例通过数
     * @return passNum
     */
    public Integer getPassNum() {
        return passNum;
    }

    public void setPassNum(Integer passNum) {
        this.passNum = passNum;
    }

    public TaskBasicExecutionData withStartTime(String startTime) {
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

    public TaskBasicExecutionData withTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public TaskBasicExecutionData withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 总用例数
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public TaskBasicExecutionData withVum(Integer vum) {
        this.vum = vum;
        return this;
    }

    /**
     * 分钟*并发数
     * @return vum
     */
    public Integer getVum() {
        return vum;
    }

    public void setVum(Integer vum) {
        this.vum = vum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskBasicExecutionData taskBasicExecutionData = (TaskBasicExecutionData) o;
        return Objects.equals(this.completeNum, taskBasicExecutionData.completeNum)
            && Objects.equals(this.duration, taskBasicExecutionData.duration)
            && Objects.equals(this.endTime, taskBasicExecutionData.endTime)
            && Objects.equals(this.executedNum, taskBasicExecutionData.executedNum)
            && Objects.equals(this.kpiCaseCount, taskBasicExecutionData.kpiCaseCount)
            && Objects.equals(this.kpiCaseExecuteCount, taskBasicExecutionData.kpiCaseExecuteCount)
            && Objects.equals(this.kpiCasePassCount, taskBasicExecutionData.kpiCasePassCount)
            && Objects.equals(this.parallel, taskBasicExecutionData.parallel)
            && Objects.equals(this.passNum, taskBasicExecutionData.passNum)
            && Objects.equals(this.startTime, taskBasicExecutionData.startTime)
            && Objects.equals(this.taskStatus, taskBasicExecutionData.taskStatus)
            && Objects.equals(this.totalNum, taskBasicExecutionData.totalNum)
            && Objects.equals(this.vum, taskBasicExecutionData.vum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(completeNum,
            duration,
            endTime,
            executedNum,
            kpiCaseCount,
            kpiCaseExecuteCount,
            kpiCasePassCount,
            parallel,
            passNum,
            startTime,
            taskStatus,
            totalNum,
            vum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskBasicExecutionData {\n");
        sb.append("    completeNum: ").append(toIndentedString(completeNum)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executedNum: ").append(toIndentedString(executedNum)).append("\n");
        sb.append("    kpiCaseCount: ").append(toIndentedString(kpiCaseCount)).append("\n");
        sb.append("    kpiCaseExecuteCount: ").append(toIndentedString(kpiCaseExecuteCount)).append("\n");
        sb.append("    kpiCasePassCount: ").append(toIndentedString(kpiCasePassCount)).append("\n");
        sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
        sb.append("    passNum: ").append(toIndentedString(passNum)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    vum: ").append(toIndentedString(vum)).append("\n");
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
