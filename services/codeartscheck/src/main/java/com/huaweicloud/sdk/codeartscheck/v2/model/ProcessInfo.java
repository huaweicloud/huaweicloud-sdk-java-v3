package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 执行记录信息。
 */
public class ProcessInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exeTime")

    private String exeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executeTime")

    private String executeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private String process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ProcessInfo withExeTime(String exeTime) {
        this.exeTime = exeTime;
        return this;
    }

    /**
     * **参数解释：** 执行时间，单位为秒。 **取值范围：** 不涉及。
     * @return exeTime
     */
    public String getExeTime() {
        return exeTime;
    }

    public void setExeTime(String exeTime) {
        this.exeTime = exeTime;
    }

    public ProcessInfo withExecuteTime(String executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * **参数解释：** 执行时间，格式为%dm%ds，例如\"6m6s\"。 **取值范围：** 不涉及。
     * @return executeTime
     */
    public String getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
    }

    public ProcessInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释：** 执行过程。 **取值范围：** 不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ProcessInfo withProcess(String process) {
        this.process = process;
        return this;
    }

    /**
     * **参数解释：** 任务执行的进度百分比。 **取值范围：** 不涉及。
     * @return process
     */
    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public ProcessInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释:** 任务执行状态。 **取值范围:** - quering：初始状态。 - running：执行中。 - success：检查成功。 - failed：检查失败。 - aborted：任务中止。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProcessInfo that = (ProcessInfo) obj;
        return Objects.equals(this.exeTime, that.exeTime) && Objects.equals(this.executeTime, that.executeTime)
            && Objects.equals(this.message, that.message) && Objects.equals(this.process, that.process)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exeTime, executeTime, message, process, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInfo {\n");
        sb.append("    exeTime: ").append(toIndentedString(exeTime)).append("\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
