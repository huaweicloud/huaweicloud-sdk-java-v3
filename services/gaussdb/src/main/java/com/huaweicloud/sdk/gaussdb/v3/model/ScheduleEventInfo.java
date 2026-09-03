package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  事件详情。  **约束限制**：  不涉及。
 */
public class ScheduleEventInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

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
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_info")

    private String extendInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time")

    private String executeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time_window")

    private ExecuteWindow executionTimeWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_entities")

    private List<EventEntity> eventEntities = null;

    public ScheduleEventInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  事件ID。  **取值范围**：  只能由英文字母、数字组成，前面为UUID，后缀为ev07，长度为36个字符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScheduleEventInfo withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**：  事件类别。  **取值范围**：  Maintenance：计划内运维事件。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ScheduleEventInfo withImpact(String impact) {
        this.impact = impact;
        return this;
    }

    /**
     * **参数解释**：  事件影响。  **取值范围**：  不涉及。
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
     * **参数解释**：  事件状态。  **取值范围**：    - inquiring：待授权。   - scheduled：待执行。   - executing：执行中。   - completed：执行完成。   - canceled：事件关闭。   - failed：执行失败。
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
     * **参数解释**：  事件原因。  **取值范围**：  不涉及。
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
     * **参数解释**：  事件级别。  **取值范围**：  - critical：紧急。 - major：重要。 - minor：一般。 - info：提示。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ScheduleEventInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例ID。  **取值范围**：  只能由英文字母、数字组成，前面为UUID，后缀为in07，长度为36个字符。
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
     * **参数解释**：  实例名称。  **取值范围**：  最小为4个字符，最大为64个字符且不超过64个字节（注意：一个中文字符占用3个字节），必须以字母或中文开头，区分大小写，可以包含字母、数字、中划线、下划线或中文，不能包含其他特殊字符。
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
     * **参数解释**：  引擎名称。  **取值范围**：  taurus：TaurusDB企业版。
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
     * **参数解释**：  创建时间。UTC，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。  **取值范围**：  不涉及。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ScheduleEventInfo withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * **参数解释**：  更新时间。UTC，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。  **取值范围**：  不涉及。
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public ScheduleEventInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：  事件类型。  **取值范围**：  - system.lifecycle.rebuild_node：备机重建事件。 - system.lifecycle.db_upgrade：数据库内核小版本升级事件。 - system.scheduled_event.high_cpu_memory：实例CPU或内存高负载事件，需要变更实例规格。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ScheduleEventInfo withExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }

    /**
     * **参数解释**：  扩展信息。  **取值范围**：  不涉及。
     * @return extendInfo
     */
    public String getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
    }

    public ScheduleEventInfo withExecuteTime(String executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * **参数解释**：  事件的执行时间。UTC，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。  **取值范围**：  不涉及。
     * @return executeTime
     */
    public String getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
    }

    public ScheduleEventInfo withExecutionTimeWindow(ExecuteWindow executionTimeWindow) {
        this.executionTimeWindow = executionTimeWindow;
        return this;
    }

    public ScheduleEventInfo withExecutionTimeWindow(Consumer<ExecuteWindow> executionTimeWindowSetter) {
        if (this.executionTimeWindow == null) {
            this.executionTimeWindow = new ExecuteWindow();
            executionTimeWindowSetter.accept(this.executionTimeWindow);
        }

        return this;
    }

    /**
     * Get executionTimeWindow
     * @return executionTimeWindow
     */
    public ExecuteWindow getExecutionTimeWindow() {
        return executionTimeWindow;
    }

    public void setExecutionTimeWindow(ExecuteWindow executionTimeWindow) {
        this.executionTimeWindow = executionTimeWindow;
    }

    public ScheduleEventInfo withEventEntities(List<EventEntity> eventEntities) {
        this.eventEntities = eventEntities;
        return this;
    }

    public ScheduleEventInfo addEventEntitiesItem(EventEntity eventEntitiesItem) {
        if (this.eventEntities == null) {
            this.eventEntities = new ArrayList<>();
        }
        this.eventEntities.add(eventEntitiesItem);
        return this;
    }

    public ScheduleEventInfo withEventEntities(Consumer<List<EventEntity>> eventEntitiesSetter) {
        if (this.eventEntities == null) {
            this.eventEntities = new ArrayList<>();
        }
        eventEntitiesSetter.accept(this.eventEntities);
        return this;
    }

    /**
     * **参数解释**：  事件对象信息列表，包含事件对象ID和事件对象的执行状态
     * @return eventEntities
     */
    public List<EventEntity> getEventEntities() {
        return eventEntities;
    }

    public void setEventEntities(List<EventEntity> eventEntities) {
        this.eventEntities = eventEntities;
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
        return Objects.equals(this.id, that.id) && Objects.equals(this.category, that.category)
            && Objects.equals(this.impact, that.impact) && Objects.equals(this.status, that.status)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.level, that.level)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.dbType, that.dbType) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.updatedTime, that.updatedTime) && Objects.equals(this.type, that.type)
            && Objects.equals(this.extendInfo, that.extendInfo) && Objects.equals(this.executeTime, that.executeTime)
            && Objects.equals(this.executionTimeWindow, that.executionTimeWindow)
            && Objects.equals(this.eventEntities, that.eventEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            category,
            impact,
            status,
            reason,
            level,
            instanceId,
            instanceName,
            dbType,
            createdTime,
            updatedTime,
            type,
            extendInfo,
            executeTime,
            executionTimeWindow,
            eventEntities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleEventInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
        sb.append("    executionTimeWindow: ").append(toIndentedString(executionTimeWindow)).append("\n");
        sb.append("    eventEntities: ").append(toIndentedString(eventEntities)).append("\n");
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
