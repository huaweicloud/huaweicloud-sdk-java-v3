package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 剧本运行监控详情
 */
public class PlaybookInstanceMonitorDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_instance_run_num")

    private Integer totalInstanceRunNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_instance_run_num")

    private Integer scheduleInstanceRunNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_instance_run_num")

    private Integer eventInstanceRunNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_run_time_instance")

    private PlaybookInstanceRunStatistics minRunTimeInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_run_time_instance")

    private PlaybookInstanceRunStatistics maxRunTimeInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_instance_num")

    private Integer totalInstanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_instance_num")

    private Integer successInstanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_instance_num")

    private Integer failInstanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminate_instance_num")

    private Integer terminateInstanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_instance_num")

    private Integer runningInstanceNum;

    public PlaybookInstanceMonitorDetail withTotalInstanceRunNum(Integer totalInstanceRunNum) {
        this.totalInstanceRunNum = totalInstanceRunNum;
        return this;
    }

    /**
     * 运行总次数
     * minimum: 0
     * maximum: 99999999
     * @return totalInstanceRunNum
     */
    public Integer getTotalInstanceRunNum() {
        return totalInstanceRunNum;
    }

    public void setTotalInstanceRunNum(Integer totalInstanceRunNum) {
        this.totalInstanceRunNum = totalInstanceRunNum;
    }

    public PlaybookInstanceMonitorDetail withScheduleInstanceRunNum(Integer scheduleInstanceRunNum) {
        this.scheduleInstanceRunNum = scheduleInstanceRunNum;
        return this;
    }

    /**
     * 定时触发执行次数
     * minimum: 0
     * maximum: 99999999
     * @return scheduleInstanceRunNum
     */
    public Integer getScheduleInstanceRunNum() {
        return scheduleInstanceRunNum;
    }

    public void setScheduleInstanceRunNum(Integer scheduleInstanceRunNum) {
        this.scheduleInstanceRunNum = scheduleInstanceRunNum;
    }

    public PlaybookInstanceMonitorDetail withEventInstanceRunNum(Integer eventInstanceRunNum) {
        this.eventInstanceRunNum = eventInstanceRunNum;
        return this;
    }

    /**
     * 时间触发执行次数
     * minimum: 0
     * maximum: 99999999
     * @return eventInstanceRunNum
     */
    public Integer getEventInstanceRunNum() {
        return eventInstanceRunNum;
    }

    public void setEventInstanceRunNum(Integer eventInstanceRunNum) {
        this.eventInstanceRunNum = eventInstanceRunNum;
    }

    public PlaybookInstanceMonitorDetail withMinRunTimeInstance(PlaybookInstanceRunStatistics minRunTimeInstance) {
        this.minRunTimeInstance = minRunTimeInstance;
        return this;
    }

    public PlaybookInstanceMonitorDetail withMinRunTimeInstance(
        Consumer<PlaybookInstanceRunStatistics> minRunTimeInstanceSetter) {
        if (this.minRunTimeInstance == null) {
            this.minRunTimeInstance = new PlaybookInstanceRunStatistics();
            minRunTimeInstanceSetter.accept(this.minRunTimeInstance);
        }

        return this;
    }

    /**
     * Get minRunTimeInstance
     * @return minRunTimeInstance
     */
    public PlaybookInstanceRunStatistics getMinRunTimeInstance() {
        return minRunTimeInstance;
    }

    public void setMinRunTimeInstance(PlaybookInstanceRunStatistics minRunTimeInstance) {
        this.minRunTimeInstance = minRunTimeInstance;
    }

    public PlaybookInstanceMonitorDetail withMaxRunTimeInstance(PlaybookInstanceRunStatistics maxRunTimeInstance) {
        this.maxRunTimeInstance = maxRunTimeInstance;
        return this;
    }

    public PlaybookInstanceMonitorDetail withMaxRunTimeInstance(
        Consumer<PlaybookInstanceRunStatistics> maxRunTimeInstanceSetter) {
        if (this.maxRunTimeInstance == null) {
            this.maxRunTimeInstance = new PlaybookInstanceRunStatistics();
            maxRunTimeInstanceSetter.accept(this.maxRunTimeInstance);
        }

        return this;
    }

    /**
     * Get maxRunTimeInstance
     * @return maxRunTimeInstance
     */
    public PlaybookInstanceRunStatistics getMaxRunTimeInstance() {
        return maxRunTimeInstance;
    }

    public void setMaxRunTimeInstance(PlaybookInstanceRunStatistics maxRunTimeInstance) {
        this.maxRunTimeInstance = maxRunTimeInstance;
    }

    public PlaybookInstanceMonitorDetail withTotalInstanceNum(Integer totalInstanceNum) {
        this.totalInstanceNum = totalInstanceNum;
        return this;
    }

    /**
     * 剧本实例总数
     * minimum: 0
     * maximum: 99999999
     * @return totalInstanceNum
     */
    public Integer getTotalInstanceNum() {
        return totalInstanceNum;
    }

    public void setTotalInstanceNum(Integer totalInstanceNum) {
        this.totalInstanceNum = totalInstanceNum;
    }

    public PlaybookInstanceMonitorDetail withSuccessInstanceNum(Integer successInstanceNum) {
        this.successInstanceNum = successInstanceNum;
        return this;
    }

    /**
     * 运行成功实例数量
     * minimum: 0
     * maximum: 99999999
     * @return successInstanceNum
     */
    public Integer getSuccessInstanceNum() {
        return successInstanceNum;
    }

    public void setSuccessInstanceNum(Integer successInstanceNum) {
        this.successInstanceNum = successInstanceNum;
    }

    public PlaybookInstanceMonitorDetail withFailInstanceNum(Integer failInstanceNum) {
        this.failInstanceNum = failInstanceNum;
        return this;
    }

    /**
     * 运行失败实例数量
     * minimum: 0
     * maximum: 99999999
     * @return failInstanceNum
     */
    public Integer getFailInstanceNum() {
        return failInstanceNum;
    }

    public void setFailInstanceNum(Integer failInstanceNum) {
        this.failInstanceNum = failInstanceNum;
    }

    public PlaybookInstanceMonitorDetail withTerminateInstanceNum(Integer terminateInstanceNum) {
        this.terminateInstanceNum = terminateInstanceNum;
        return this;
    }

    /**
     * 运行终止实例数量
     * minimum: 0
     * maximum: 99999999
     * @return terminateInstanceNum
     */
    public Integer getTerminateInstanceNum() {
        return terminateInstanceNum;
    }

    public void setTerminateInstanceNum(Integer terminateInstanceNum) {
        this.terminateInstanceNum = terminateInstanceNum;
    }

    public PlaybookInstanceMonitorDetail withRunningInstanceNum(Integer runningInstanceNum) {
        this.runningInstanceNum = runningInstanceNum;
        return this;
    }

    /**
     * 运行中实例数量
     * minimum: 0
     * maximum: 99999999
     * @return runningInstanceNum
     */
    public Integer getRunningInstanceNum() {
        return runningInstanceNum;
    }

    public void setRunningInstanceNum(Integer runningInstanceNum) {
        this.runningInstanceNum = runningInstanceNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlaybookInstanceMonitorDetail that = (PlaybookInstanceMonitorDetail) obj;
        return Objects.equals(this.totalInstanceRunNum, that.totalInstanceRunNum)
            && Objects.equals(this.scheduleInstanceRunNum, that.scheduleInstanceRunNum)
            && Objects.equals(this.eventInstanceRunNum, that.eventInstanceRunNum)
            && Objects.equals(this.minRunTimeInstance, that.minRunTimeInstance)
            && Objects.equals(this.maxRunTimeInstance, that.maxRunTimeInstance)
            && Objects.equals(this.totalInstanceNum, that.totalInstanceNum)
            && Objects.equals(this.successInstanceNum, that.successInstanceNum)
            && Objects.equals(this.failInstanceNum, that.failInstanceNum)
            && Objects.equals(this.terminateInstanceNum, that.terminateInstanceNum)
            && Objects.equals(this.runningInstanceNum, that.runningInstanceNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalInstanceRunNum,
            scheduleInstanceRunNum,
            eventInstanceRunNum,
            minRunTimeInstance,
            maxRunTimeInstance,
            totalInstanceNum,
            successInstanceNum,
            failInstanceNum,
            terminateInstanceNum,
            runningInstanceNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlaybookInstanceMonitorDetail {\n");
        sb.append("    totalInstanceRunNum: ").append(toIndentedString(totalInstanceRunNum)).append("\n");
        sb.append("    scheduleInstanceRunNum: ").append(toIndentedString(scheduleInstanceRunNum)).append("\n");
        sb.append("    eventInstanceRunNum: ").append(toIndentedString(eventInstanceRunNum)).append("\n");
        sb.append("    minRunTimeInstance: ").append(toIndentedString(minRunTimeInstance)).append("\n");
        sb.append("    maxRunTimeInstance: ").append(toIndentedString(maxRunTimeInstance)).append("\n");
        sb.append("    totalInstanceNum: ").append(toIndentedString(totalInstanceNum)).append("\n");
        sb.append("    successInstanceNum: ").append(toIndentedString(successInstanceNum)).append("\n");
        sb.append("    failInstanceNum: ").append(toIndentedString(failInstanceNum)).append("\n");
        sb.append("    terminateInstanceNum: ").append(toIndentedString(terminateInstanceNum)).append("\n");
        sb.append("    runningInstanceNum: ").append(toIndentedString(runningInstanceNum)).append("\n");
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
