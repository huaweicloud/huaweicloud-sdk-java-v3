package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRebuildSlaveStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_rebuild_time")

    private String lastRebuildTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_rebuild_time")

    private String nextRebuildTime;

    public ShowRebuildSlaveStatusResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例ID  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowRebuildSlaveStatusResponse withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * **参数解释**：  任务流ID  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public ShowRebuildSlaveStatusResponse withLastRebuildTime(String lastRebuildTime) {
        this.lastRebuildTime = lastRebuildTime;
        return this;
    }

    /**
     * **参数解释**：  上一次重建的时间  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return lastRebuildTime
     */
    public String getLastRebuildTime() {
        return lastRebuildTime;
    }

    public void setLastRebuildTime(String lastRebuildTime) {
        this.lastRebuildTime = lastRebuildTime;
    }

    public ShowRebuildSlaveStatusResponse withNextRebuildTime(String nextRebuildTime) {
        this.nextRebuildTime = nextRebuildTime;
        return this;
    }

    /**
     * **参数解释**：  下次允许重建的时间  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return nextRebuildTime
     */
    public String getNextRebuildTime() {
        return nextRebuildTime;
    }

    public void setNextRebuildTime(String nextRebuildTime) {
        this.nextRebuildTime = nextRebuildTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRebuildSlaveStatusResponse that = (ShowRebuildSlaveStatusResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.workflowId, that.workflowId)
            && Objects.equals(this.lastRebuildTime, that.lastRebuildTime)
            && Objects.equals(this.nextRebuildTime, that.nextRebuildTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, workflowId, lastRebuildTime, nextRebuildTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRebuildSlaveStatusResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    lastRebuildTime: ").append(toIndentedString(lastRebuildTime)).append("\n");
        sb.append("    nextRebuildTime: ").append(toIndentedString(nextRebuildTime)).append("\n");
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
