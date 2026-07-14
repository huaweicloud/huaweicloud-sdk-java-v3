package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 服务实例组配置，当推理方式为BATCH/EDGE时仅支持配置一个模型；当推理方式为REAL_TIME时，可根据业务需要配置多个服务实例并分配权重。 **约束限制：** 不涉及
 */
public class GroupConfigUpdateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "framework")

    private String framework;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_log_dump_enable")

    private Boolean systemLogDumpEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit_configs")

    private List<UnitConfig> unitConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_type")

    private String secretType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    private String secretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_avail_switch")

    private Boolean highAvailSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_config")

    private AdvancedConfig advancedConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private GroupModel model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mirror_traffic_enable")

    private Boolean mirrorTrafficEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mirror_traffic_weight")

    private Integer mirrorTrafficWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_task_limit")

    private DeploymentTaskLimit deploymentTaskLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_strategy")

    private String scheduleStrategy;

    public GroupConfigUpdateRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 部署ID。 **约束限制：** 不填保留原有值。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GroupConfigUpdateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 部署名称。 **约束限制：** 必填参数，不填不保留原有值。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupConfigUpdateRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释：** 资源池ID，查询指定资源池下的服务，默认不过滤。可通过[查询资源池列表](ShowPool.xml)获取。 **约束限制：** 不填保留原有值。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public GroupConfigUpdateRequest withFramework(String framework) {
        this.framework = framework;
        return this;
    }

    /**
     * **参数解释：** 框架类型。 **约束限制：** 不填则为默认值。 **取值范围：** - COMMON：普通在线服务 - VLLM：VLLM框架 - MINDIE：MINDIE框架 **默认取值：** COMMON
     * @return framework
     */
    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public GroupConfigUpdateRequest withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释：** 部署场景下，服务实例数量。 **约束限制：** 不填则为默认值。 **取值范围：** [1, 128]。 **默认取值：** 1
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public GroupConfigUpdateRequest withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * **参数解释：** 部署类型。 **约束限制：** 不填保留原有值。 **取值范围：** - SINGLE：常规部署 - MULTI：分布式部署 **默认取值：** 不涉及
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    public GroupConfigUpdateRequest withSystemLogDumpEnable(Boolean systemLogDumpEnable) {
        this.systemLogDumpEnable = systemLogDumpEnable;
        return this;
    }

    /**
     * **参数解释：** 系统日志转储开关。 **约束限制：** 不填则为默认值。 **取值范围：** 不涉及 **默认取值：** false
     * @return systemLogDumpEnable
     */
    public Boolean getSystemLogDumpEnable() {
        return systemLogDumpEnable;
    }

    public void setSystemLogDumpEnable(Boolean systemLogDumpEnable) {
        this.systemLogDumpEnable = systemLogDumpEnable;
    }

    public GroupConfigUpdateRequest withUnitConfigs(List<UnitConfig> unitConfigs) {
        this.unitConfigs = unitConfigs;
        return this;
    }

    public GroupConfigUpdateRequest addUnitConfigsItem(UnitConfig unitConfigsItem) {
        if (this.unitConfigs == null) {
            this.unitConfigs = new ArrayList<>();
        }
        this.unitConfigs.add(unitConfigsItem);
        return this;
    }

    public GroupConfigUpdateRequest withUnitConfigs(Consumer<List<UnitConfig>> unitConfigsSetter) {
        if (this.unitConfigs == null) {
            this.unitConfigs = new ArrayList<>();
        }
        unitConfigsSetter.accept(this.unitConfigs);
        return this;
    }

    /**
     * **参数解释：** 实例单元配置。 **约束限制：** - 单机推理时，个数只会为1；如果是分布式推理时，根据不同框架，实例单元配置可灵活配置。 - 必填字段。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return unitConfigs
     */
    public List<UnitConfig> getUnitConfigs() {
        return unitConfigs;
    }

    public void setUnitConfigs(List<UnitConfig> unitConfigs) {
        this.unitConfigs = unitConfigs;
    }

    public GroupConfigUpdateRequest withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释：** 权重百分比，分配到此模型的流量权重，仅当模型部署为在线服务时需要配置。 **约束限制：** 不填保留原有值。 **取值范围：** [0, 100]。 **默认取值：** 不涉及
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public GroupConfigUpdateRequest withSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }

    /**
     * **参数解释：** 凭证类型相关配置，用户可以在此处选择使用的凭证类型（dew，agency） **约束限制：** 1.使用临时委托凭证类型约束限制:集群已安装CCE容器存储（Everest）v2.4.204及以上版本，且集群版本为v1.28及以上且确保局点已启用IAM5服务。 2.若插件版本不足或集群不支持临时委托凭证，则需通过DEW服务挂载。 3.不填保留原有值。 **取值范围：** - [dew：DEW密钥。](tag:hws,hws_hk,fcs) - agency：临时委托凭证。 **默认取值：** 不涉及。
     * @return secretType
     */
    public String getSecretType() {
        return secretType;
    }

    public void setSecretType(String secretType) {
        this.secretType = secretType;
    }

    public GroupConfigUpdateRequest withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * **参数解释**： 认证凭证名称，用户使用dew类型凭证时可以在此处选择使用的凭证。 **约束限制**： secret_type是dew时必填，不填保留原有值。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public GroupConfigUpdateRequest withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释：** 服务优先级。 **约束限制：** - 如服务处于“运行中”，priority字段为必要参数，且value必须为原版的值； - 如服务处于“停止”，priority字段为非必要参数。 - 不填保留原有值。 **取值范围：** [1, 3]。 **默认取值：** 不涉及。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public GroupConfigUpdateRequest withHighAvailSwitch(Boolean highAvailSwitch) {
        this.highAvailSwitch = highAvailSwitch;
        return this;
    }

    /**
     * **参数解释：** 高可用开关，开启后不同实例的pod将尽量均匀分布到不同的节点上。 **约束限制：** 不填则为默认值 **取值范围：** 不涉及 **默认取值：** true
     * @return highAvailSwitch
     */
    public Boolean getHighAvailSwitch() {
        return highAvailSwitch;
    }

    public void setHighAvailSwitch(Boolean highAvailSwitch) {
        this.highAvailSwitch = highAvailSwitch;
    }

    public GroupConfigUpdateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 部署备注。 **约束限制：** 不填则将部署描述清空。 **取值范围：** 长度不可以超过512，不能包含大于号，小于号。 **默认取值：** 默认为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GroupConfigUpdateRequest withAdvancedConfig(AdvancedConfig advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }

    public GroupConfigUpdateRequest withAdvancedConfig(Consumer<AdvancedConfig> advancedConfigSetter) {
        if (this.advancedConfig == null) {
            this.advancedConfig = new AdvancedConfig();
            advancedConfigSetter.accept(this.advancedConfig);
        }

        return this;
    }

    /**
     * Get advancedConfig
     * @return advancedConfig
     */
    public AdvancedConfig getAdvancedConfig() {
        return advancedConfig;
    }

    public void setAdvancedConfig(AdvancedConfig advancedConfig) {
        this.advancedConfig = advancedConfig;
    }

    public GroupConfigUpdateRequest withModel(GroupModel model) {
        this.model = model;
        return this;
    }

    public GroupConfigUpdateRequest withModel(Consumer<GroupModel> modelSetter) {
        if (this.model == null) {
            this.model = new GroupModel();
            modelSetter.accept(this.model);
        }

        return this;
    }

    /**
     * Get model
     * @return model
     */
    public GroupModel getModel() {
        return model;
    }

    public void setModel(GroupModel model) {
        this.model = model;
    }

    public GroupConfigUpdateRequest withMirrorTrafficEnable(Boolean mirrorTrafficEnable) {
        this.mirrorTrafficEnable = mirrorTrafficEnable;
        return this;
    }

    /**
     * **参数解释：** 镜像流量开关。 **约束限制：** 不填保留原有值 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return mirrorTrafficEnable
     */
    public Boolean getMirrorTrafficEnable() {
        return mirrorTrafficEnable;
    }

    public void setMirrorTrafficEnable(Boolean mirrorTrafficEnable) {
        this.mirrorTrafficEnable = mirrorTrafficEnable;
    }

    public GroupConfigUpdateRequest withMirrorTrafficWeight(Integer mirrorTrafficWeight) {
        this.mirrorTrafficWeight = mirrorTrafficWeight;
        return this;
    }

    /**
     * **参数解释：** 镜像流量权重。 **约束限制：** 不填保留原有值。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return mirrorTrafficWeight
     */
    public Integer getMirrorTrafficWeight() {
        return mirrorTrafficWeight;
    }

    public void setMirrorTrafficWeight(Integer mirrorTrafficWeight) {
        this.mirrorTrafficWeight = mirrorTrafficWeight;
    }

    public GroupConfigUpdateRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 部署状态。 **约束限制：** 不填保留原有值。 **取值范围：** - DEPLOYING：部署中 - FAILED：失败 - STOPPED：停止 - RUNNING：运行中 - DELETING：删除中 - STOPPING：停止中 - CONCERNING：存在潜在问题 - DELETED：删除 - RESTARTING：重启中 - UPGRADING：更新中 - ERROR：错误 - INTERRUPTING：中断中 **默认取值：** 不涉及
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GroupConfigUpdateRequest withDeploymentTaskLimit(DeploymentTaskLimit deploymentTaskLimit) {
        this.deploymentTaskLimit = deploymentTaskLimit;
        return this;
    }

    public GroupConfigUpdateRequest withDeploymentTaskLimit(Consumer<DeploymentTaskLimit> deploymentTaskLimitSetter) {
        if (this.deploymentTaskLimit == null) {
            this.deploymentTaskLimit = new DeploymentTaskLimit();
            deploymentTaskLimitSetter.accept(this.deploymentTaskLimit);
        }

        return this;
    }

    /**
     * Get deploymentTaskLimit
     * @return deploymentTaskLimit
     */
    public DeploymentTaskLimit getDeploymentTaskLimit() {
        return deploymentTaskLimit;
    }

    public void setDeploymentTaskLimit(DeploymentTaskLimit deploymentTaskLimit) {
        this.deploymentTaskLimit = deploymentTaskLimit;
    }

    public GroupConfigUpdateRequest withScheduleStrategy(String scheduleStrategy) {
        this.scheduleStrategy = scheduleStrategy;
        return this;
    }

    /**
     * **参数解释：** 调度策略。 **约束限制：** 不涉及。 **取值范围：** - HIGH_AVAILABILITY：高可用调度 - HIGH_UTILIZATION：紧凑调度 - HIGH_PERFORMANCE：高性能调度 **默认取值：** HIGH_AVAILABILITY。
     * @return scheduleStrategy
     */
    public String getScheduleStrategy() {
        return scheduleStrategy;
    }

    public void setScheduleStrategy(String scheduleStrategy) {
        this.scheduleStrategy = scheduleStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupConfigUpdateRequest that = (GroupConfigUpdateRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.framework, that.framework)
            && Objects.equals(this.count, that.count) && Objects.equals(this.deployType, that.deployType)
            && Objects.equals(this.systemLogDumpEnable, that.systemLogDumpEnable)
            && Objects.equals(this.unitConfigs, that.unitConfigs) && Objects.equals(this.weight, that.weight)
            && Objects.equals(this.secretType, that.secretType) && Objects.equals(this.secretName, that.secretName)
            && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.highAvailSwitch, that.highAvailSwitch)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.advancedConfig, that.advancedConfig) && Objects.equals(this.model, that.model)
            && Objects.equals(this.mirrorTrafficEnable, that.mirrorTrafficEnable)
            && Objects.equals(this.mirrorTrafficWeight, that.mirrorTrafficWeight)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.deploymentTaskLimit, that.deploymentTaskLimit)
            && Objects.equals(this.scheduleStrategy, that.scheduleStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            poolId,
            framework,
            count,
            deployType,
            systemLogDumpEnable,
            unitConfigs,
            weight,
            secretType,
            secretName,
            priority,
            highAvailSwitch,
            description,
            advancedConfig,
            model,
            mirrorTrafficEnable,
            mirrorTrafficWeight,
            status,
            deploymentTaskLimit,
            scheduleStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupConfigUpdateRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    systemLogDumpEnable: ").append(toIndentedString(systemLogDumpEnable)).append("\n");
        sb.append("    unitConfigs: ").append(toIndentedString(unitConfigs)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    highAvailSwitch: ").append(toIndentedString(highAvailSwitch)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    advancedConfig: ").append(toIndentedString(advancedConfig)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    mirrorTrafficEnable: ").append(toIndentedString(mirrorTrafficEnable)).append("\n");
        sb.append("    mirrorTrafficWeight: ").append(toIndentedString(mirrorTrafficWeight)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    deploymentTaskLimit: ").append(toIndentedString(deploymentTaskLimit)).append("\n");
        sb.append("    scheduleStrategy: ").append(toIndentedString(scheduleStrategy)).append("\n");
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
