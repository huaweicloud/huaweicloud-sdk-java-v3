package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 定时任务详情信息
 */
public class ScheduledTaskV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_id")

    private String proxyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_name")

    private String proxyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_config")

    private Map<String, String> targetConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_order")

    private Integer taskOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    public ScheduledTaskV3 withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：  任务创建时间。  **取值范围**： 不涉及。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ScheduledTaskV3 withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * **参数解释**：  数据库类型。  **取值范围**： 目前只支持gaussdb-mysql。
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ScheduledTaskV3 withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：  任务结束时间。  **取值范围**： 不涉及。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ScheduledTaskV3 withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  任务绑定的实例ID。  **取值范围**： 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ScheduledTaskV3 withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释**：  任务绑定的实例名称。  **取值范围**： 不涉及。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ScheduledTaskV3 withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * **参数解释**：  任务绑定的实例状态。  **取值范围**： - NORMAL：实例正常状态。 - BACKING_UP：实例备份中状态。 - MODIFYING：实例修改中状态。 - REBUILDING：实例重建中状态。 - RESTORING：实例恢复中状态。 - FROZEN：实例已冻结状态。 - FAILED：实例状态异常。 - DELETING：实例删除中状态。 - CREATE_FAILED：实例创建失败状态。
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public ScheduledTaskV3 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：  租户项目ID。  **取值范围**： 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ScheduledTaskV3 withProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }

    /**
     * **参数解释**：  任务使用的数据库代理ID。  **取值范围**： 不涉及。
     * @return proxyId
     */
    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public ScheduledTaskV3 withProxyName(String proxyName) {
        this.proxyName = proxyName;
        return this;
    }

    /**
     * **参数解释**：  任务使用的数据库代理名称。  **取值范围**： 不涉及。
     * @return proxyName
     */
    public String getProxyName() {
        return proxyName;
    }

    public void setProxyName(String proxyName) {
        this.proxyName = proxyName;
    }

    public ScheduledTaskV3 withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：  任务开始时间。  **取值范围**： 不涉及。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ScheduledTaskV3 withTargetConfig(Map<String, String> targetConfig) {
        this.targetConfig = targetConfig;
        return this;
    }

    public ScheduledTaskV3 putTargetConfigItem(String key, String targetConfigItem) {
        if (this.targetConfig == null) {
            this.targetConfig = new HashMap<>();
        }
        this.targetConfig.put(key, targetConfigItem);
        return this;
    }

    public ScheduledTaskV3 withTargetConfig(Consumer<Map<String, String>> targetConfigSetter) {
        if (this.targetConfig == null) {
            this.targetConfig = new HashMap<>();
        }
        targetConfigSetter.accept(this.targetConfig);
        return this;
    }

    /**
     * **参数解释**：  任务的目标端配置信息，以键值对形式存储。  **取值范围**： 不涉及。
     * @return targetConfig
     */
    public Map<String, String> getTargetConfig() {
        return targetConfig;
    }

    public void setTargetConfig(Map<String, String> targetConfig) {
        this.targetConfig = targetConfig;
    }

    public ScheduledTaskV3 withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释**：  任务ID，此参数是任务的唯一标识。  **取值范围**： 不涉及。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ScheduledTaskV3 withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**：  任务名称。  **取值范围**： 不涉及。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ScheduledTaskV3 withTaskOrder(Integer taskOrder) {
        this.taskOrder = taskOrder;
        return this;
    }

    /**
     * **参数解释**：  任务执行顺序。  **取值范围**： 不涉及。
     * @return taskOrder
     */
    public Integer getTaskOrder() {
        return taskOrder;
    }

    public void setTaskOrder(Integer taskOrder) {
        this.taskOrder = taskOrder;
    }

    public ScheduledTaskV3 withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * **参数解释**：  任务状态。  **取值范围**： - RUNNING：任务正在执行。 - SUCCESS：任务执行成功。 - FAIL：任务执行失败。 - CANCELED：任务被取消。 - WAITING：任务等待执行。
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScheduledTaskV3 that = (ScheduledTaskV3) obj;
        return Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.datastoreType, that.datastoreType) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.instanceStatus, that.instanceStatus)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.proxyId, that.proxyId)
            && Objects.equals(this.proxyName, that.proxyName) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.targetConfig, that.targetConfig) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.taskOrder, that.taskOrder)
            && Objects.equals(this.taskStatus, that.taskStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            datastoreType,
            endTime,
            instanceId,
            instanceName,
            instanceStatus,
            projectId,
            proxyId,
            proxyName,
            startTime,
            targetConfig,
            taskId,
            taskName,
            taskOrder,
            taskStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduledTaskV3 {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    proxyId: ").append(toIndentedString(proxyId)).append("\n");
        sb.append("    proxyName: ").append(toIndentedString(proxyName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    targetConfig: ").append(toIndentedString(targetConfig)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskOrder: ").append(toIndentedString(taskOrder)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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
