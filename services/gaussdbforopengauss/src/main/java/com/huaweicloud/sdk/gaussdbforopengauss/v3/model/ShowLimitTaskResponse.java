package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLimitTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_type")

    private String limitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_size")

    private Integer parallelSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_running_time")

    private Integer taskRunningTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_count")

    private Integer limitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_utilization")

    private Integer memoryUtilization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_utilization")

    private Integer cpuUtilization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_task_rule_info_list")

    private List<LimitTaskRuleInfoOption> limitTaskRuleInfoList = null;

    public ShowLimitTaskResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 限流任务名传。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ShowLimitTaskResponse withLimitType(String limitType) {
        this.limitType = limitType;
        return this;
    }

    /**
     * 任务限流类型。
     * @return limitType
     */
    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public ShowLimitTaskResponse withParallelSize(Integer parallelSize) {
        this.parallelSize = parallelSize;
        return this;
    }

    /**
     * 并发数。
     * @return parallelSize
     */
    public Integer getParallelSize() {
        return parallelSize;
    }

    public void setParallelSize(Integer parallelSize) {
        this.parallelSize = parallelSize;
    }

    public ShowLimitTaskResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 限流任务开始时间,格式为yyyy-mm-ddThh:mm:ssZ，当前时间指UTC时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowLimitTaskResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 限流任务结束时间,格式为yyyy-mm-ddThh:mm:ssZ，当前时间指UTC时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowLimitTaskResponse withTaskRunningTime(Integer taskRunningTime) {
        this.taskRunningTime = taskRunningTime;
        return this;
    }

    /**
     * 限流任务已执行时间，单位秒。
     * @return taskRunningTime
     */
    public Integer getTaskRunningTime() {
        return taskRunningTime;
    }

    public void setTaskRunningTime(Integer taskRunningTime) {
        this.taskRunningTime = taskRunningTime;
    }

    public ShowLimitTaskResponse withLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
        return this;
    }

    /**
     * 限流任务拦截次数。
     * @return limitCount
     */
    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public ShowLimitTaskResponse withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名。
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ShowLimitTaskResponse withMemoryUtilization(Integer memoryUtilization) {
        this.memoryUtilization = memoryUtilization;
        return this;
    }

    /**
     * 内存利用率，仅当任务类型为SESSION_ACTIVE_MAX_COUNT时，返回该值且与请求参数相同。
     * @return memoryUtilization
     */
    public Integer getMemoryUtilization() {
        return memoryUtilization;
    }

    public void setMemoryUtilization(Integer memoryUtilization) {
        this.memoryUtilization = memoryUtilization;
    }

    public ShowLimitTaskResponse withCpuUtilization(Integer cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
        return this;
    }

    /**
     * cpu利用率，仅当任务类型为SESSION_ACTIVE_MAX_COUNT时，返回该值且与请求参数相同。
     * @return cpuUtilization
     */
    public Integer getCpuUtilization() {
        return cpuUtilization;
    }

    public void setCpuUtilization(Integer cpuUtilization) {
        this.cpuUtilization = cpuUtilization;
    }

    public ShowLimitTaskResponse withLimitTaskRuleInfoList(List<LimitTaskRuleInfoOption> limitTaskRuleInfoList) {
        this.limitTaskRuleInfoList = limitTaskRuleInfoList;
        return this;
    }

    public ShowLimitTaskResponse addLimitTaskRuleInfoListItem(LimitTaskRuleInfoOption limitTaskRuleInfoListItem) {
        if (this.limitTaskRuleInfoList == null) {
            this.limitTaskRuleInfoList = new ArrayList<>();
        }
        this.limitTaskRuleInfoList.add(limitTaskRuleInfoListItem);
        return this;
    }

    public ShowLimitTaskResponse withLimitTaskRuleInfoList(
        Consumer<List<LimitTaskRuleInfoOption>> limitTaskRuleInfoListSetter) {
        if (this.limitTaskRuleInfoList == null) {
            this.limitTaskRuleInfoList = new ArrayList<>();
        }
        limitTaskRuleInfoListSetter.accept(this.limitTaskRuleInfoList);
        return this;
    }

    /**
     * 限流任务列表
     * @return limitTaskRuleInfoList
     */
    public List<LimitTaskRuleInfoOption> getLimitTaskRuleInfoList() {
        return limitTaskRuleInfoList;
    }

    public void setLimitTaskRuleInfoList(List<LimitTaskRuleInfoOption> limitTaskRuleInfoList) {
        this.limitTaskRuleInfoList = limitTaskRuleInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLimitTaskResponse that = (ShowLimitTaskResponse) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.limitType, that.limitType)
            && Objects.equals(this.parallelSize, that.parallelSize) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.taskRunningTime, that.taskRunningTime)
            && Objects.equals(this.limitCount, that.limitCount) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.memoryUtilization, that.memoryUtilization)
            && Objects.equals(this.cpuUtilization, that.cpuUtilization)
            && Objects.equals(this.limitTaskRuleInfoList, that.limitTaskRuleInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName,
            limitType,
            parallelSize,
            startTime,
            endTime,
            taskRunningTime,
            limitCount,
            ruleName,
            memoryUtilization,
            cpuUtilization,
            limitTaskRuleInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLimitTaskResponse {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
        sb.append("    parallelSize: ").append(toIndentedString(parallelSize)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    taskRunningTime: ").append(toIndentedString(taskRunningTime)).append("\n");
        sb.append("    limitCount: ").append(toIndentedString(limitCount)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    memoryUtilization: ").append(toIndentedString(memoryUtilization)).append("\n");
        sb.append("    cpuUtilization: ").append(toIndentedString(cpuUtilization)).append("\n");
        sb.append("    limitTaskRuleInfoList: ").append(toIndentedString(limitTaskRuleInfoList)).append("\n");
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
