package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class UpdateScheduledTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_at")

    private String executeAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public UpdateScheduledTaskRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 实例ID。获取方法如下：调用“查询所有实例列表”接口，从响应体中获取实例ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateScheduledTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**： 定时任务ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public UpdateScheduledTaskRequest withExecuteAt(String executeAt) {
        this.executeAt = executeAt;
        return this;
    }

    /**
     * **参数解释**： 修改定时任务的执行时间。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return executeAt
     */
    public String getExecuteAt() {
        return executeAt;
    }

    public void setExecuteAt(String executeAt) {
        this.executeAt = executeAt;
    }

    public UpdateScheduledTaskRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 修改定时任务状态。 **约束限制**： 不涉及。 **取值范围**： - CANCELLED：定时任务被取消。 - null：定时任务待执行。 **默认取值**： 不涉及。
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
        UpdateScheduledTaskRequest that = (UpdateScheduledTaskRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.executeAt, that.executeAt) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, taskId, executeAt, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateScheduledTaskRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    executeAt: ").append(toIndentedString(executeAt)).append("\n");
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
