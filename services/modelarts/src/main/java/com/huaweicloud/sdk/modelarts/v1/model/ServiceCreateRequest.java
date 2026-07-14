package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 创建服务请求体。 **取值范围：** 不涉及。
 */
public class ServiceCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

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

    private List<ServiceCreateRequestTags> tags = null;

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
    @JsonProperty(value = "deploy_timeout_minutes")

    private Integer deployTimeoutMinutes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_type")

    private String workloadType;

    public ServiceCreateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 服务名，用户在[创建服务](CreateInferService.xml)时自定义的名称。 **约束限制：** 服务在删除之前名字不能重复。 **取值范围：** 支持1-64位字符，可包含字母、中文、数字、中划线、下划线。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceCreateRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 服务版本号，以数字及点号组成，形如1.0.1。 **约束限制：** 不涉及。 **取值范围：** 1.0.0 ~ 99.99.99，长度不超过8位。 **默认取值：** 前端可不传默认设置为1.0.0。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ServiceCreateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 服务备注。 **约束限制：** 不涉及。 **取值范围：** 长度不可以超过512，不能包含大于号，小于号。 **默认取值：** 默认为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServiceCreateRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 推理服务类型。 **约束限制：** 不涉及。 **取值范围：** - REAL_TIME：在线服务。 - ASYNC_REAL_TIME：异步服务。 **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ServiceCreateRequest withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * **参数解释：** 部署类型。 **约束限制：** 不涉及。 **取值范围：** - SINGLE：单机单卡。 - MULTI：多机多卡。 **默认取值：** 不涉及。
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    public ServiceCreateRequest withGroupConfigs(List<GroupConfig> groupConfigs) {
        this.groupConfigs = groupConfigs;
        return this;
    }

    public ServiceCreateRequest addGroupConfigsItem(GroupConfig groupConfigsItem) {
        if (this.groupConfigs == null) {
            this.groupConfigs = new ArrayList<>();
        }
        this.groupConfigs.add(groupConfigsItem);
        return this;
    }

    public ServiceCreateRequest withGroupConfigs(Consumer<List<GroupConfig>> groupConfigsSetter) {
        if (this.groupConfigs == null) {
            this.groupConfigs = new ArrayList<>();
        }
        groupConfigsSetter.accept(this.groupConfigs);
        return this;
    }

    /**
     * **参数解释：** 服务实例组配置。 **约束限制：** 仅创建服务时group_configs可传[]空数组，group_configs的最大元素数量为1。
     * @return groupConfigs
     */
    public List<GroupConfig> getGroupConfigs() {
        return groupConfigs;
    }

    public void setGroupConfigs(List<GroupConfig> groupConfigs) {
        this.groupConfigs = groupConfigs;
    }

    public ServiceCreateRequest withRuntimeConfig(RuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }

    public ServiceCreateRequest withRuntimeConfig(Consumer<RuntimeConfig> runtimeConfigSetter) {
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

    public ServiceCreateRequest withUpgradeConfig(UpgradeConfig upgradeConfig) {
        this.upgradeConfig = upgradeConfig;
        return this;
    }

    public ServiceCreateRequest withUpgradeConfig(Consumer<UpgradeConfig> upgradeConfigSetter) {
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

    public ServiceCreateRequest withLtsStrategy(String ltsStrategy) {
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

    public ServiceCreateRequest withLogConfigs(List<LtsConfig> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public ServiceCreateRequest addLogConfigsItem(LtsConfig logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public ServiceCreateRequest withLogConfigs(Consumer<List<LtsConfig>> logConfigsSetter) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /**
     * **参数解释：** 日志配置。 **约束限制：** 当开启LTS日志的时候，STDOUT类型为必填。 数量上限为2个。
     * @return logConfigs
     */
    public List<LtsConfig> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<LtsConfig> logConfigs) {
        this.logConfigs = logConfigs;
    }

    public ServiceCreateRequest withTags(List<ServiceCreateRequestTags> tags) {
        this.tags = tags;
        return this;
    }

    public ServiceCreateRequest addTagsItem(ServiceCreateRequestTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ServiceCreateRequest withTags(Consumer<List<ServiceCreateRequestTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 服务标签。 **约束限制：** 上限20个。
     * @return tags
     */
    public List<ServiceCreateRequestTags> getTags() {
        return tags;
    }

    public void setTags(List<ServiceCreateRequestTags> tags) {
        this.tags = tags;
    }

    public ServiceCreateRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释：** 工作空间ID。 **约束限制：** 不涉及。 **取值范围：** - 0：默认空间ID。 - 由数字和小写字母组成的32位字符：其他空间ID，可参考[工作空间创建](CreateWorkspace.xml)。 **默认取值：** 不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ServiceCreateRequest withSchedule(List<ScheduleConfig> schedule) {
        this.schedule = schedule;
        return this;
    }

    public ServiceCreateRequest addScheduleItem(ScheduleConfig scheduleItem) {
        if (this.schedule == null) {
            this.schedule = new ArrayList<>();
        }
        this.schedule.add(scheduleItem);
        return this;
    }

    public ServiceCreateRequest withSchedule(Consumer<List<ScheduleConfig>> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new ArrayList<>();
        }
        scheduleSetter.accept(this.schedule);
        return this;
    }

    /**
     * **参数解释：** 定时停止配置。 **约束限制：** 最多支持一个定时任务。
     * @return schedule
     */
    public List<ScheduleConfig> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<ScheduleConfig> schedule) {
        this.schedule = schedule;
    }

    public ServiceCreateRequest withCustomMetricsPath(String customMetricsPath) {
        this.customMetricsPath = customMetricsPath;
        return this;
    }

    /**
     * **参数解释：** 该参数值由英文逗号隔开的协议、端口号、地址组成，比如：[http,8080,metrics]，其中地址长度不超过255 ，且需要与镜像给定的协议、地址、端口一致，否则指标无法上报。 **约束限制：** 长度不超过255。 **取值范围：** - 协议范围：http/https。 - 端口范围：1-65535。 - 地址范围：仅包含字母、数字、点号（.）、中划线（-)、下划线（_）、斜杠（/）的路径，非斜杠（/）开头。 **默认取值：** 不涉及。
     * @return customMetricsPath
     */
    public String getCustomMetricsPath() {
        return customMetricsPath;
    }

    public void setCustomMetricsPath(String customMetricsPath) {
        this.customMetricsPath = customMetricsPath;
    }

    public ServiceCreateRequest withDeployTimeoutMinutes(Integer deployTimeoutMinutes) {
        this.deployTimeoutMinutes = deployTimeoutMinutes;
        return this;
    }

    /**
     * **参数解释：** 服务部署超时时间，integer类型，取值在1~300 （860版本该参数在服务层级做保留兼容）。 **约束限制：** 不涉及。 **取值范围：** [0, 300]。 **默认取值：** 不涉及。
     * @return deployTimeoutMinutes
     */
    public Integer getDeployTimeoutMinutes() {
        return deployTimeoutMinutes;
    }

    public void setDeployTimeoutMinutes(Integer deployTimeoutMinutes) {
        this.deployTimeoutMinutes = deployTimeoutMinutes;
    }

    public ServiceCreateRequest withTaskType(String taskType) {
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

    public ServiceCreateRequest withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * **参数解释：** 工作负载类型。 **取值范围：** - DEPLOYMENT：DEPLOYMENT类型 - LWS：LWS类型
     * @return workloadType
     */
    public String getWorkloadType() {
        return workloadType;
    }

    public void setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceCreateRequest that = (ServiceCreateRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version)
            && Objects.equals(this.description, that.description) && Objects.equals(this.type, that.type)
            && Objects.equals(this.deployType, that.deployType) && Objects.equals(this.groupConfigs, that.groupConfigs)
            && Objects.equals(this.runtimeConfig, that.runtimeConfig)
            && Objects.equals(this.upgradeConfig, that.upgradeConfig)
            && Objects.equals(this.ltsStrategy, that.ltsStrategy) && Objects.equals(this.logConfigs, that.logConfigs)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.schedule, that.schedule)
            && Objects.equals(this.customMetricsPath, that.customMetricsPath)
            && Objects.equals(this.deployTimeoutMinutes, that.deployTimeoutMinutes)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.workloadType, that.workloadType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            version,
            description,
            type,
            deployType,
            groupConfigs,
            runtimeConfig,
            upgradeConfig,
            ltsStrategy,
            logConfigs,
            tags,
            workspaceId,
            schedule,
            customMetricsPath,
            deployTimeoutMinutes,
            taskType,
            workloadType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceCreateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    groupConfigs: ").append(toIndentedString(groupConfigs)).append("\n");
        sb.append("    runtimeConfig: ").append(toIndentedString(runtimeConfig)).append("\n");
        sb.append("    upgradeConfig: ").append(toIndentedString(upgradeConfig)).append("\n");
        sb.append("    ltsStrategy: ").append(toIndentedString(ltsStrategy)).append("\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    customMetricsPath: ").append(toIndentedString(customMetricsPath)).append("\n");
        sb.append("    deployTimeoutMinutes: ").append(toIndentedString(deployTimeoutMinutes)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
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
