package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 逻辑集群操作信息。 **取值范围**： 不涉及。
 */
public class ActionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name")

    private String actionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed")

    private Boolean completed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private String logs;

    public ActionInfo withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * **参数解释**： 操作名称。 **取值范围**： Create：创建逻辑集群 Expand：扩容逻辑集群 Restart：重启逻辑集群 Delete：删除逻辑集群 Shrink：缩容逻辑集群
     * @return actionName
     */
    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public ActionInfo withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * **参数解释**： 操作进度，默认10。 **取值范围**： 0~100
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ActionInfo withCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }

    /**
     * **参数解释**： 操作是否完成。 **取值范围**： 不涉及。
     * @return completed
     */
    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public ActionInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 操作开始时间。 **取值范围**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ActionInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 操作结束时间。 **取值范围**： 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ActionInfo withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释**： 操作结果。。 **取值范围**： success：成功 failed：失败 默认空字符串。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ActionInfo withLogs(String logs) {
        this.logs = logs;
        return this;
    }

    /**
     * **参数解释**： 操作日志信息。 **取值范围**： 不涉及。
     * @return logs
     */
    public String getLogs() {
        return logs;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionInfo that = (ActionInfo) obj;
        return Objects.equals(this.actionName, that.actionName) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.completed, that.completed) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.result, that.result)
            && Objects.equals(this.logs, that.logs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionName, progress, completed, startTime, endTime, result, logs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionInfo {\n");
        sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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
