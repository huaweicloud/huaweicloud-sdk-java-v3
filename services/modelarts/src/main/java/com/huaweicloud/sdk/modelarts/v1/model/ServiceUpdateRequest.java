package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServiceUpdateRequest
 */
public class ServiceUpdateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_timeout_minutes")

    private Integer deployTimeoutMinutes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_configs")

    private List<GroupConfig> groupConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_config")

    private RuntimeConfig runtimeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_config")

    private UpgradeConfig upgradeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_strategy")

    private String ltsStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_configs")

    private List<LtsConfig> logConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private List<ScheduleConfig> schedule = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_metrics_path")

    private String customMetricsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    public ServiceUpdateRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 服务ID **约束限制：** 不涉及。 **取值范围：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServiceUpdateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 服务名称。 **约束限制：** 不涉及。 **取值范围：** 支持1-128个字符，可以包含字母、汉字、数字、连字符和下划线。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceUpdateRequest withDeployTimeoutMinutes(Integer deployTimeoutMinutes) {
        this.deployTimeoutMinutes = deployTimeoutMinutes;
        return this;
    }

    /**
     * **参数解释：** 服务部署超时时间，integer类型，取值在1~300（860版本该参数做保留兼容）。 **约束限制：** 不涉及。 **取值范围：** [0, 300]。 **默认取值：** 不涉及。
     * @return deployTimeoutMinutes
     */
    public Integer getDeployTimeoutMinutes() {
        return deployTimeoutMinutes;
    }

    public void setDeployTimeoutMinutes(Integer deployTimeoutMinutes) {
        this.deployTimeoutMinutes = deployTimeoutMinutes;
    }

    public ServiceUpdateRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 必填，填了之后，数据库中如果存在相同版本号，将会报错（仅修改描述的场景除外）。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ServiceUpdateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 非必填，仅更新描述的场景直接修改对应version的数据库字段，不新增版本号。 **约束限制：** 不涉及。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServiceUpdateRequest withGroupConfigs(List<GroupConfig> groupConfigs) {
        this.groupConfigs = groupConfigs;
        return this;
    }

    public ServiceUpdateRequest addGroupConfigsItem(GroupConfig groupConfigsItem) {
        if (this.groupConfigs == null) {
            this.groupConfigs = new ArrayList<>();
        }
        this.groupConfigs.add(groupConfigsItem);
        return this;
    }

    public ServiceUpdateRequest withGroupConfigs(Consumer<List<GroupConfig>> groupConfigsSetter) {
        if (this.groupConfigs == null) {
            this.groupConfigs = new ArrayList<>();
        }
        groupConfigsSetter.accept(this.groupConfigs);
        return this;
    }

    /**
     * **参数解释：** 仅修改服务时不需传，兼容部署分离之前版本。 **约束限制：** group_configs的最大元素数量为1。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return groupConfigs
     */
    public List<GroupConfig> getGroupConfigs() {
        return groupConfigs;
    }

    public void setGroupConfigs(List<GroupConfig> groupConfigs) {
        this.groupConfigs = groupConfigs;
    }

    public ServiceUpdateRequest withRuntimeConfig(RuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }

    public ServiceUpdateRequest withRuntimeConfig(Consumer<RuntimeConfig> runtimeConfigSetter) {
        if (this.runtimeConfig == null) {
            this.runtimeConfig = new RuntimeConfig();
            runtimeConfigSetter.accept(this.runtimeConfig);
        }

        return this;
    }

    /**
     * Get runtimeConfig
     * @return runtimeConfig
     */
    public RuntimeConfig getRuntimeConfig() {
        return runtimeConfig;
    }

    public void setRuntimeConfig(RuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    public ServiceUpdateRequest withUpgradeConfig(UpgradeConfig upgradeConfig) {
        this.upgradeConfig = upgradeConfig;
        return this;
    }

    public ServiceUpdateRequest withUpgradeConfig(Consumer<UpgradeConfig> upgradeConfigSetter) {
        if (this.upgradeConfig == null) {
            this.upgradeConfig = new UpgradeConfig();
            upgradeConfigSetter.accept(this.upgradeConfig);
        }

        return this;
    }

    /**
     * Get upgradeConfig
     * @return upgradeConfig
     */
    public UpgradeConfig getUpgradeConfig() {
        return upgradeConfig;
    }

    public void setUpgradeConfig(UpgradeConfig upgradeConfig) {
        this.upgradeConfig = upgradeConfig;
    }

    public ServiceUpdateRequest withLtsStrategy(String ltsStrategy) {
        this.ltsStrategy = ltsStrategy;
        return this;
    }

    /**
     * **参数解释：** 日志策略。 **约束限制：** 不涉及。 **取值范围：** - POOL：使用资源池日志插件配置的日志流。 - AUTO_CREATE：自动创建日志流。 - DEFAULT: 由系统决定日志策略 **默认取值：** AUTO_CREATE：自动创建日志流。
     * @return ltsStrategy
     */
    public String getLtsStrategy() {
        return ltsStrategy;
    }

    public void setLtsStrategy(String ltsStrategy) {
        this.ltsStrategy = ltsStrategy;
    }

    public ServiceUpdateRequest withLogConfigs(List<LtsConfig> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public ServiceUpdateRequest addLogConfigsItem(LtsConfig logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public ServiceUpdateRequest withLogConfigs(Consumer<List<LtsConfig>> logConfigsSetter) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /**
     * **参数解释：** 日志配置，当开启LTS日志的时候，STDOUT类型为必填。 **约束限制：** 当开启LTS日志的时候，STDOUT类型为必填。 数量上限为2个。
     * @return logConfigs
     */
    public List<LtsConfig> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<LtsConfig> logConfigs) {
        this.logConfigs = logConfigs;
    }

    public ServiceUpdateRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * **参数解释：** 服务标签,上限20个 **约束限制：** 不涉及。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public ServiceUpdateRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释：** 工作空间id，默认是“0” **约束限制：** 不涉及。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ServiceUpdateRequest withSchedule(List<ScheduleConfig> schedule) {
        this.schedule = schedule;
        return this;
    }

    public ServiceUpdateRequest addScheduleItem(ScheduleConfig scheduleItem) {
        if (this.schedule == null) {
            this.schedule = new ArrayList<>();
        }
        this.schedule.add(scheduleItem);
        return this;
    }

    public ServiceUpdateRequest withSchedule(Consumer<List<ScheduleConfig>> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new ArrayList<>();
        }
        scheduleSetter.accept(this.schedule);
        return this;
    }

    /**
     * **参数解释：** 定时停止配置。 **约束限制：** 仅当body中另一个参数description为空时，此参数才生效。
     * @return schedule
     */
    public List<ScheduleConfig> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<ScheduleConfig> schedule) {
        this.schedule = schedule;
    }

    public ServiceUpdateRequest withCustomMetricsPath(String customMetricsPath) {
        this.customMetricsPath = customMetricsPath;
        return this;
    }

    /**
     * **参数解释：** 该参数值由英文逗号隔开的协议、端口号、地址组成，其中地址长度不超过255 ，且需要与镜像给定的协议、地址、端口一致，否则指标无法上报。
     * @return customMetricsPath
     */
    public String getCustomMetricsPath() {
        return customMetricsPath;
    }

    public void setCustomMetricsPath(String customMetricsPath) {
        this.customMetricsPath = customMetricsPath;
    }

    public ServiceUpdateRequest withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * **参数解释：** 模型类型。 **取值范围：** - TEXT_GENERATION：文本生成 - IMAGE_UNDERSTANDING：图像理解 - VIDEO_GENERATION：视频生成 - IMAGE_GENERATION：图像生成 - RERANK：重排序 - VECTOR_MODEL：向量模型 - EMBEDDING：Embedding嵌入
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceUpdateRequest that = (ServiceUpdateRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.deployTimeoutMinutes, that.deployTimeoutMinutes)
            && Objects.equals(this.version, that.version) && Objects.equals(this.description, that.description)
            && Objects.equals(this.groupConfigs, that.groupConfigs)
            && Objects.equals(this.runtimeConfig, that.runtimeConfig)
            && Objects.equals(this.upgradeConfig, that.upgradeConfig)
            && Objects.equals(this.ltsStrategy, that.ltsStrategy) && Objects.equals(this.logConfigs, that.logConfigs)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.schedule, that.schedule)
            && Objects.equals(this.customMetricsPath, that.customMetricsPath)
            && Objects.equals(this.taskType, that.taskType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            deployTimeoutMinutes,
            version,
            description,
            groupConfigs,
            runtimeConfig,
            upgradeConfig,
            ltsStrategy,
            logConfigs,
            tags,
            workspaceId,
            schedule,
            customMetricsPath,
            taskType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceUpdateRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    deployTimeoutMinutes: ").append(toIndentedString(deployTimeoutMinutes)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    groupConfigs: ").append(toIndentedString(groupConfigs)).append("\n");
        sb.append("    runtimeConfig: ").append(toIndentedString(runtimeConfig)).append("\n");
        sb.append("    upgradeConfig: ").append(toIndentedString(upgradeConfig)).append("\n");
        sb.append("    ltsStrategy: ").append(toIndentedString(ltsStrategy)).append("\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    customMetricsPath: ").append(toIndentedString(customMetricsPath)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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
