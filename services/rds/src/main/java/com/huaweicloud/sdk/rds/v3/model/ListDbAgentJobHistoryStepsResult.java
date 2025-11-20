package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库代理作业执行历史步骤。
 */
public class ListDbAgentJobHistoryStepsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_id")

    private String stepId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_name")

    private String stepName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_status")

    private String runStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_time")

    private String runTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_duration")

    private String runDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public ListDbAgentJobHistoryStepsResult withStepId(String stepId) {
        this.stepId = stepId;
        return this;
    }

    /**
     * 步骤id。
     * @return stepId
     */
    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public ListDbAgentJobHistoryStepsResult withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    /**
     * 步骤名。
     * @return stepName
     */
    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public ListDbAgentJobHistoryStepsResult withRunStatus(String runStatus) {
        this.runStatus = runStatus;
        return this;
    }

    /**
     * 作业执行状态。取值如下:  failed:失败。 succeeded:成功。 retrying:重试中。 canceled:已取消。 in_progress:正在运行。
     * @return runStatus
     */
    public String getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(String runStatus) {
        this.runStatus = runStatus;
    }

    public ListDbAgentJobHistoryStepsResult withRunTime(String runTime) {
        this.runTime = runTime;
        return this;
    }

    /**
     * 作业执行开始时间。格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return runTime
     */
    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public ListDbAgentJobHistoryStepsResult withRunDuration(String runDuration) {
        this.runDuration = runDuration;
        return this;
    }

    /**
     * 作业执行时长。格式为hh:mm:ss
     * @return runDuration
     */
    public String getRunDuration() {
        return runDuration;
    }

    public void setRunDuration(String runDuration) {
        this.runDuration = runDuration;
    }

    public ListDbAgentJobHistoryStepsResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 执行信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDbAgentJobHistoryStepsResult that = (ListDbAgentJobHistoryStepsResult) obj;
        return Objects.equals(this.stepId, that.stepId) && Objects.equals(this.stepName, that.stepName)
            && Objects.equals(this.runStatus, that.runStatus) && Objects.equals(this.runTime, that.runTime)
            && Objects.equals(this.runDuration, that.runDuration) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepId, stepName, runStatus, runTime, runDuration, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDbAgentJobHistoryStepsResult {\n");
        sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
        sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
        sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
        sb.append("    runTime: ").append(toIndentedString(runTime)).append("\n");
        sb.append("    runDuration: ").append(toIndentedString(runDuration)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
