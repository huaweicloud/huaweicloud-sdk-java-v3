package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MetadataCollectionTask
 */
public class MetadataCollectionTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dir_id")

    private String dirId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_config")

    private SchedulerInfo scheduleConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_config")

    private List<CustomMetadata> parameterConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_run_time")

    private String lastRunTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_run_time")

    private String nextRunTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duty_person")

    private String dutyPerson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_type")

    private String updateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_type")

    private String dataSourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_config")

    private Object taskConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source_workspace_id")

    private String dataSourceWorkspaceId;

    public MetadataCollectionTask withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MetadataCollectionTask withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MetadataCollectionTask withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MetadataCollectionTask withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public MetadataCollectionTask withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public MetadataCollectionTask withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 产品id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public MetadataCollectionTask withDirId(String dirId) {
        this.dirId = dirId;
        return this;
    }

    /**
     * 目录id
     * @return dirId
     */
    public String getDirId() {
        return dirId;
    }

    public void setDirId(String dirId) {
        this.dirId = dirId;
    }

    public MetadataCollectionTask withScheduleConfig(SchedulerInfo scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }

    public MetadataCollectionTask withScheduleConfig(Consumer<SchedulerInfo> scheduleConfigSetter) {
        if (this.scheduleConfig == null) {
            this.scheduleConfig = new SchedulerInfo();
            scheduleConfigSetter.accept(this.scheduleConfig);
        }

        return this;
    }

    /**
     * Get scheduleConfig
     * @return scheduleConfig
     */
    public SchedulerInfo getScheduleConfig() {
        return scheduleConfig;
    }

    public void setScheduleConfig(SchedulerInfo scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
    }

    public MetadataCollectionTask withParameterConfig(List<CustomMetadata> parameterConfig) {
        this.parameterConfig = parameterConfig;
        return this;
    }

    public MetadataCollectionTask addParameterConfigItem(CustomMetadata parameterConfigItem) {
        if (this.parameterConfig == null) {
            this.parameterConfig = new ArrayList<>();
        }
        this.parameterConfig.add(parameterConfigItem);
        return this;
    }

    public MetadataCollectionTask withParameterConfig(Consumer<List<CustomMetadata>> parameterConfigSetter) {
        if (this.parameterConfig == null) {
            this.parameterConfig = new ArrayList<>();
        }
        parameterConfigSetter.accept(this.parameterConfig);
        return this;
    }

    /**
     * 自定义元数据信息
     * @return parameterConfig
     */
    public List<CustomMetadata> getParameterConfig() {
        return parameterConfig;
    }

    public void setParameterConfig(List<CustomMetadata> parameterConfig) {
        this.parameterConfig = parameterConfig;
    }

    public MetadataCollectionTask withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public MetadataCollectionTask withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public MetadataCollectionTask withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public MetadataCollectionTask withLastRunTime(String lastRunTime) {
        this.lastRunTime = lastRunTime;
        return this;
    }

    /**
     * 最后一次执行时间
     * @return lastRunTime
     */
    public String getLastRunTime() {
        return lastRunTime;
    }

    public void setLastRunTime(String lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    public MetadataCollectionTask withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public MetadataCollectionTask withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public MetadataCollectionTask withNextRunTime(String nextRunTime) {
        this.nextRunTime = nextRunTime;
        return this;
    }

    /**
     * 下一次执行时间
     * @return nextRunTime
     */
    public String getNextRunTime() {
        return nextRunTime;
    }

    public void setNextRunTime(String nextRunTime) {
        this.nextRunTime = nextRunTime;
    }

    public MetadataCollectionTask withDutyPerson(String dutyPerson) {
        this.dutyPerson = dutyPerson;
        return this;
    }

    /**
     * 责任人
     * @return dutyPerson
     */
    public String getDutyPerson() {
        return dutyPerson;
    }

    public void setDutyPerson(String dutyPerson) {
        this.dutyPerson = dutyPerson;
    }

    public MetadataCollectionTask withUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }

    /**
     * 修改类型
     * @return updateType
     */
    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public MetadataCollectionTask withDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }

    /**
     * 数据来源类型
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public MetadataCollectionTask withTaskConfig(Object taskConfig) {
        this.taskConfig = taskConfig;
        return this;
    }

    /**
     * 任务信息Map<String, Object>
     * @return taskConfig
     */
    public Object getTaskConfig() {
        return taskConfig;
    }

    public void setTaskConfig(Object taskConfig) {
        this.taskConfig = taskConfig;
    }

    public MetadataCollectionTask withDataSourceWorkspaceId(String dataSourceWorkspaceId) {
        this.dataSourceWorkspaceId = dataSourceWorkspaceId;
        return this;
    }

    /**
     * 数据来源工作空间id
     * @return dataSourceWorkspaceId
     */
    public String getDataSourceWorkspaceId() {
        return dataSourceWorkspaceId;
    }

    public void setDataSourceWorkspaceId(String dataSourceWorkspaceId) {
        this.dataSourceWorkspaceId = dataSourceWorkspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetadataCollectionTask that = (MetadataCollectionTask) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.dirId, that.dirId) && Objects.equals(this.scheduleConfig, that.scheduleConfig)
            && Objects.equals(this.parameterConfig, that.parameterConfig)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.path, that.path) && Objects.equals(this.lastRunTime, that.lastRunTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.nextRunTime, that.nextRunTime) && Objects.equals(this.dutyPerson, that.dutyPerson)
            && Objects.equals(this.updateType, that.updateType)
            && Objects.equals(this.dataSourceType, that.dataSourceType)
            && Objects.equals(this.taskConfig, that.taskConfig)
            && Objects.equals(this.dataSourceWorkspaceId, that.dataSourceWorkspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            userId,
            createTime,
            projectId,
            dirId,
            scheduleConfig,
            parameterConfig,
            updateTime,
            userName,
            path,
            lastRunTime,
            startTime,
            endTime,
            nextRunTime,
            dutyPerson,
            updateType,
            dataSourceType,
            taskConfig,
            dataSourceWorkspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetadataCollectionTask {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    dirId: ").append(toIndentedString(dirId)).append("\n");
        sb.append("    scheduleConfig: ").append(toIndentedString(scheduleConfig)).append("\n");
        sb.append("    parameterConfig: ").append(toIndentedString(parameterConfig)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    lastRunTime: ").append(toIndentedString(lastRunTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    nextRunTime: ").append(toIndentedString(nextRunTime)).append("\n");
        sb.append("    dutyPerson: ").append(toIndentedString(dutyPerson)).append("\n");
        sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
        sb.append("    dataSourceType: ").append(toIndentedString(dataSourceType)).append("\n");
        sb.append("    taskConfig: ").append(toIndentedString(taskConfig)).append("\n");
        sb.append("    dataSourceWorkspaceId: ").append(toIndentedString(dataSourceWorkspaceId)).append("\n");
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
