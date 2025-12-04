package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件详情
 */
public class ScheduleEventInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_type")

    private String dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "impact")

    private String impact;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time")

    private String executeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_execution_time")

    private String latestExecutionTime;

    public ScheduleEventInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  事件ID。  **约束限制**：  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScheduleEventInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例ID。  **约束限制**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ScheduleEventInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释**：  实例名称。  **约束限制**：  不涉及。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ScheduleEventInfo withDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * **参数解释**：  数据库类型。  **约束限制**：  不涉及。
     * @return dbType
     */
    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public ScheduleEventInfo withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数解释**：  事件创建的时间。  **约束限制**：  不涉及。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ScheduleEventInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**：  事件更新的时间。  **约束限制**：  不涉及。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ScheduleEventInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：  事件类型。  **约束限制**：  不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ScheduleEventInfo withImpact(String impact) {
        this.impact = impact;
        return this;
    }

    /**
     * **参数解释**：  事件对系统的影响。  **约束限制**：  不涉及。
     * @return impact
     */
    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public ScheduleEventInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：  事件状态。  **约束限制**：  不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ScheduleEventInfo withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释**：  事件发生的原因。  **约束限制**：  不涉及。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ScheduleEventInfo withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释**：  事件的严重级别。  **约束限制**：  不涉及。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ScheduleEventInfo withExecuteTime(String executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * **参数解释**：  事件执行的时间。  **约束限制**：  不涉及。
     * @return executeTime
     */
    public String getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
    }

    public ScheduleEventInfo withLatestExecutionTime(String latestExecutionTime) {
        this.latestExecutionTime = latestExecutionTime;
        return this;
    }

    /**
     * **参数解释**：  事件最近一次执行的时间。  **约束限制**：  不涉及。
     * @return latestExecutionTime
     */
    public String getLatestExecutionTime() {
        return latestExecutionTime;
    }

    public void setLatestExecutionTime(String latestExecutionTime) {
        this.latestExecutionTime = latestExecutionTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduleEventInfo that = (ScheduleEventInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.dbType, that.dbType)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.type, that.type) && Objects.equals(this.impact, that.impact)
            && Objects.equals(this.status, that.status) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.level, that.level) && Objects.equals(this.executeTime, that.executeTime)
            && Objects.equals(this.latestExecutionTime, that.latestExecutionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            instanceId,
            instanceName,
            dbType,
            createdTime,
            updateTime,
            type,
            impact,
            status,
            reason,
            level,
            executeTime,
            latestExecutionTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleEventInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
        sb.append("    latestExecutionTime: ").append(toIndentedString(latestExecutionTime)).append("\n");
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
