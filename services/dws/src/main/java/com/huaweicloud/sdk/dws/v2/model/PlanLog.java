package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作计划日志
 */
public class PlanLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_time")

    private String execTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_info")

    private String stageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_result")

    private Integer execResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_log")

    private String execLog;

    public PlanLog withExecTime(String execTime) {
        this.execTime = execTime;
        return this;
    }

    /**
     * 执行时间
     * @return execTime
     */
    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime;
    }

    public PlanLog withStageInfo(String stageInfo) {
        this.stageInfo = stageInfo;
        return this;
    }

    /**
     * 执行计划阶段
     * @return stageInfo
     */
    public String getStageInfo() {
        return stageInfo;
    }

    public void setStageInfo(String stageInfo) {
        this.stageInfo = stageInfo;
    }

    public PlanLog withExecResult(Integer execResult) {
        this.execResult = execResult;
        return this;
    }

    /**
     * 执行结果。
     * @return execResult
     */
    public Integer getExecResult() {
        return execResult;
    }

    public void setExecResult(Integer execResult) {
        this.execResult = execResult;
    }

    public PlanLog withExecLog(String execLog) {
        this.execLog = execLog;
        return this;
    }

    /**
     * 执行日志。
     * @return execLog
     */
    public String getExecLog() {
        return execLog;
    }

    public void setExecLog(String execLog) {
        this.execLog = execLog;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlanLog that = (PlanLog) obj;
        return Objects.equals(this.execTime, that.execTime) && Objects.equals(this.stageInfo, that.stageInfo)
            && Objects.equals(this.execResult, that.execResult) && Objects.equals(this.execLog, that.execLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(execTime, stageInfo, execResult, execLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlanLog {\n");
        sb.append("    execTime: ").append(toIndentedString(execTime)).append("\n");
        sb.append("    stageInfo: ").append(toIndentedString(stageInfo)).append("\n");
        sb.append("    execResult: ").append(toIndentedString(execResult)).append("\n");
        sb.append("    execLog: ").append(toIndentedString(execLog)).append("\n");
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
