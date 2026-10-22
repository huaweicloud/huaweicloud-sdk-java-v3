package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StopInferDeploymentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_name")

    private String deploymentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infer_name")

    private String inferName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "framework")

    private String framework;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_count")

    private Integer versionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_type")

    private String secretType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    private String secretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_type")

    private String workloadType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_avail_switch")

    private Boolean highAvailSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_log_dump_enable")

    private Boolean systemLogDumpEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_strategy")

    private String scheduleStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit_configs")

    private List<UnitConfig> unitConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private GroupModel model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_config")

    private AdvancedConfig advancedConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mirror_traffic_enable")

    private Boolean mirrorTrafficEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mirror_traffic_weight")

    private Integer mirrorTrafficWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_used_time")

    private OffsetDateTime lastUsedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_task_limit")

    private DeploymentTaskLimit deploymentTaskLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_infos")

    private List<FrozenInfo> frozenInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private OffsetDateTime createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private OffsetDateTime updateAt;

    public StopInferDeploymentResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数解释： 部署ID，在[添加部署](CreateInferDeployment.xml)时即可在返回体中获取，也可通过[查询服务部署列表](ListInferDeployments.xml)获取当前用户拥有的部署，其中deployment_id字段即为部署ID。 约束限制： 不涉及。 取值范围： 部署ID。 默认取值： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StopInferDeploymentResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 服务部署名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StopInferDeploymentResponse withDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

    /**
     * 参数解释： 服务部署名字。
     * @return deploymentName
     */
    public String getDeploymentName() {
        return deploymentName;
    }

    public void setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
    }

    public StopInferDeploymentResponse withInferName(String inferName) {
        this.inferName = inferName;
        return this;
    }

    /**
     * 参数解释： 部署id（废弃字段）。 取值范围： 不涉及。
     * @return inferName
     */
    public String getInferName() {
        return inferName;
    }

    public void setInferName(String inferName) {
        this.inferName = inferName;
    }

    public StopInferDeploymentResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数解释： 描述 取值范围： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StopInferDeploymentResponse withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释：** 专属资源池ID。 **取值范围：** 不涉及。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public StopInferDeploymentResponse withFramework(String framework) {
        this.framework = framework;
        return this;
    }

    /**
     * **参数解释：** 算法框架。 **取值范围：** - COMMON： 普通在线服务。
     * @return framework
     */
    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public StopInferDeploymentResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 当前部署版本信息。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public StopInferDeploymentResponse withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * **参数解释：** 版本id，可通过查询version列表查询。 **取值范围：** 不涉及。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public StopInferDeploymentResponse withVersionCount(Integer versionCount) {
        this.versionCount = versionCount;
        return this;
    }

    /**
     * **参数解释：** 服务版本数量。 **取值范围：** 不涉及。
     * @return versionCount
     */
    public Integer getVersionCount() {
        return versionCount;
    }

    public void setVersionCount(Integer versionCount) {
        this.versionCount = versionCount;
    }

    public StopInferDeploymentResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释：** 服务部署实例数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public StopInferDeploymentResponse withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释：** 权重百分比，分配到此模型的流量权重，仅当模型部署为在线服务时需要配置。 **约束限制：** 不涉及。 **取值范围：** [0, 100]。 **默认取值：** 不涉及。
     * minimum: 0
     * maximum: 100
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public StopInferDeploymentResponse withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释：** 服务优先级。 **约束限制：** 不涉及。 **取值范围：** [1, 3]。 **默认取值：** 不涉及。
     * minimum: 1
     * maximum: 3
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public StopInferDeploymentResponse withSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }

    /**
     * **参数解释：** 凭证类型相关配置，用户可以在此处选择使用的凭证类型（dew，agency） **约束限制：** 不涉及。 **取值范围：** - [dew：DEW密钥。](tag:hws,hws_hk,fcs) - agency：临时委托凭证。 **默认取值：** 不涉及。
     * @return secretType
     */
    public String getSecretType() {
        return secretType;
    }

    public void setSecretType(String secretType) {
        this.secretType = secretType;
    }

    public StopInferDeploymentResponse withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * **参数解释：** 凭证名称，用户使用dew类型凭证时可以在此处选择使用的凭证。 **取值范围：** 1-64个字符，只能包含字母、数字、连字符和下划线。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public StopInferDeploymentResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 服务部署状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StopInferDeploymentResponse withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * **参数解释：** 部署类型。 **取值范围：** - SINGLE：单机单卡。 - MULTI：多机多卡。
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    public StopInferDeploymentResponse withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * **参数解释：** 工作负载类型。 **取值范围：** - LWS - DEPLOYMENT **默认取值：** DEPLOYMENT
     * @return workloadType
     */
    public String getWorkloadType() {
        return workloadType;
    }

    public void setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
    }

    public StopInferDeploymentResponse withHighAvailSwitch(Boolean highAvailSwitch) {
        this.highAvailSwitch = highAvailSwitch;
        return this;
    }

    /**
     * **参数解释：** 高可用开关，开启后不同实例的pod将尽量均匀分布到不同的节点上。 **约束限制：** 不涉及 **取值范围：** - true: 高可用开启。 - false: 高可用关闭。
     * @return highAvailSwitch
     */
    public Boolean getHighAvailSwitch() {
        return highAvailSwitch;
    }

    public void setHighAvailSwitch(Boolean highAvailSwitch) {
        this.highAvailSwitch = highAvailSwitch;
    }

    public StopInferDeploymentResponse withSystemLogDumpEnable(Boolean systemLogDumpEnable) {
        this.systemLogDumpEnable = systemLogDumpEnable;
        return this;
    }

    /**
     * **参数解释：** 系统日志转储开关。 **约束限制：** 只有NPU资源池有，且逻辑池是没有的 **取值范围：** 不涉及 **默认取值：** false
     * @return systemLogDumpEnable
     */
    public Boolean getSystemLogDumpEnable() {
        return systemLogDumpEnable;
    }

    public void setSystemLogDumpEnable(Boolean systemLogDumpEnable) {
        this.systemLogDumpEnable = systemLogDumpEnable;
    }

    public StopInferDeploymentResponse withScheduleStrategy(String scheduleStrategy) {
        this.scheduleStrategy = scheduleStrategy;
        return this;
    }

    /**
     * **参数解释：** 调度策略。 **取值范围：** 不涉及。
     * @return scheduleStrategy
     */
    public String getScheduleStrategy() {
        return scheduleStrategy;
    }

    public void setScheduleStrategy(String scheduleStrategy) {
        this.scheduleStrategy = scheduleStrategy;
    }

    public StopInferDeploymentResponse withUnitConfigs(List<UnitConfig> unitConfigs) {
        this.unitConfigs = unitConfigs;
        return this;
    }

    public StopInferDeploymentResponse addUnitConfigsItem(UnitConfig unitConfigsItem) {
        if (this.unitConfigs == null) {
            this.unitConfigs = new ArrayList<>();
        }
        this.unitConfigs.add(unitConfigsItem);
        return this;
    }

    public StopInferDeploymentResponse withUnitConfigs(Consumer<List<UnitConfig>> unitConfigsSetter) {
        if (this.unitConfigs == null) {
            this.unitConfigs = new ArrayList<>();
        }
        unitConfigsSetter.accept(this.unitConfigs);
        return this;
    }

    /**
     * **参数解释：** 实例单元配置。 **约束限制：** 单机推理时，个数只会为1；如果是分布式推理时，根据不同框架，实例单元配置可灵活配置。
     * @return unitConfigs
     */
    public List<UnitConfig> getUnitConfigs() {
        return unitConfigs;
    }

    public void setUnitConfigs(List<UnitConfig> unitConfigs) {
        this.unitConfigs = unitConfigs;
    }

    public StopInferDeploymentResponse withModel(GroupModel model) {
        this.model = model;
        return this;
    }

    public StopInferDeploymentResponse withModel(Consumer<GroupModel> modelSetter) {
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

    public StopInferDeploymentResponse withAdvancedConfig(AdvancedConfig advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }

    public StopInferDeploymentResponse withAdvancedConfig(Consumer<AdvancedConfig> advancedConfigSetter) {
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

    public StopInferDeploymentResponse withMirrorTrafficEnable(Boolean mirrorTrafficEnable) {
        this.mirrorTrafficEnable = mirrorTrafficEnable;
        return this;
    }

    /**
     * **参数解释：** 是否开启镜像流量。 **取值范围：** 不涉及。
     * @return mirrorTrafficEnable
     */
    public Boolean getMirrorTrafficEnable() {
        return mirrorTrafficEnable;
    }

    public void setMirrorTrafficEnable(Boolean mirrorTrafficEnable) {
        this.mirrorTrafficEnable = mirrorTrafficEnable;
    }

    public StopInferDeploymentResponse withMirrorTrafficWeight(Integer mirrorTrafficWeight) {
        this.mirrorTrafficWeight = mirrorTrafficWeight;
        return this;
    }

    /**
     * **参数解释：** 镜像流量权重。 **取值范围：** 不涉及。
     * @return mirrorTrafficWeight
     */
    public Integer getMirrorTrafficWeight() {
        return mirrorTrafficWeight;
    }

    public void setMirrorTrafficWeight(Integer mirrorTrafficWeight) {
        this.mirrorTrafficWeight = mirrorTrafficWeight;
    }

    public StopInferDeploymentResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释：** 用户名。 **取值范围：** 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public StopInferDeploymentResponse withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释：** 委托名称。 **取值范围：** 不涉及。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public StopInferDeploymentResponse withLastUsedTime(OffsetDateTime lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
        return this;
    }

    /**
     * **参数解释：** 最后使用时间。 **取值范围：** 不涉及。
     * @return lastUsedTime
     */
    public OffsetDateTime getLastUsedTime() {
        return lastUsedTime;
    }

    public void setLastUsedTime(OffsetDateTime lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
    }

    public StopInferDeploymentResponse withDeploymentTaskLimit(DeploymentTaskLimit deploymentTaskLimit) {
        this.deploymentTaskLimit = deploymentTaskLimit;
        return this;
    }

    public StopInferDeploymentResponse withDeploymentTaskLimit(
        Consumer<DeploymentTaskLimit> deploymentTaskLimitSetter) {
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

    public StopInferDeploymentResponse withFrozenInfos(List<FrozenInfo> frozenInfos) {
        this.frozenInfos = frozenInfos;
        return this;
    }

    public StopInferDeploymentResponse addFrozenInfosItem(FrozenInfo frozenInfosItem) {
        if (this.frozenInfos == null) {
            this.frozenInfos = new ArrayList<>();
        }
        this.frozenInfos.add(frozenInfosItem);
        return this;
    }

    public StopInferDeploymentResponse withFrozenInfos(Consumer<List<FrozenInfo>> frozenInfosSetter) {
        if (this.frozenInfos == null) {
            this.frozenInfos = new ArrayList<>();
        }
        frozenInfosSetter.accept(this.frozenInfos);
        return this;
    }

    /**
     * **参数解释：** 当服务或者部署被冻结时返回的冻结类型信息。
     * @return frozenInfos
     */
    public List<FrozenInfo> getFrozenInfos() {
        return frozenInfos;
    }

    public void setFrozenInfos(List<FrozenInfo> frozenInfos) {
        this.frozenInfos = frozenInfos;
    }

    public StopInferDeploymentResponse withCreateAt(OffsetDateTime createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间，根据创建时的当前时间自动生成。 **取值范围：** 毫秒级时间戳，13位数字
     * @return createAt
     */
    public OffsetDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(OffsetDateTime createAt) {
        this.createAt = createAt;
    }

    public StopInferDeploymentResponse withUpdateAt(OffsetDateTime updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间，根据更新时的当前时间自动生成。 **取值范围：** 毫秒级时间戳，13位数字。
     * @return updateAt
     */
    public OffsetDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(OffsetDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StopInferDeploymentResponse that = (StopInferDeploymentResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.deploymentName, that.deploymentName)
            && Objects.equals(this.inferName, that.inferName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.framework, that.framework)
            && Objects.equals(this.version, that.version) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.versionCount, that.versionCount) && Objects.equals(this.count, that.count)
            && Objects.equals(this.weight, that.weight) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.secretType, that.secretType) && Objects.equals(this.secretName, that.secretName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.deployType, that.deployType)
            && Objects.equals(this.workloadType, that.workloadType)
            && Objects.equals(this.highAvailSwitch, that.highAvailSwitch)
            && Objects.equals(this.systemLogDumpEnable, that.systemLogDumpEnable)
            && Objects.equals(this.scheduleStrategy, that.scheduleStrategy)
            && Objects.equals(this.unitConfigs, that.unitConfigs) && Objects.equals(this.model, that.model)
            && Objects.equals(this.advancedConfig, that.advancedConfig)
            && Objects.equals(this.mirrorTrafficEnable, that.mirrorTrafficEnable)
            && Objects.equals(this.mirrorTrafficWeight, that.mirrorTrafficWeight)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.lastUsedTime, that.lastUsedTime)
            && Objects.equals(this.deploymentTaskLimit, that.deploymentTaskLimit)
            && Objects.equals(this.frozenInfos, that.frozenInfos) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            deploymentName,
            inferName,
            description,
            poolId,
            framework,
            version,
            versionId,
            versionCount,
            count,
            weight,
            priority,
            secretType,
            secretName,
            status,
            deployType,
            workloadType,
            highAvailSwitch,
            systemLogDumpEnable,
            scheduleStrategy,
            unitConfigs,
            model,
            advancedConfig,
            mirrorTrafficEnable,
            mirrorTrafficWeight,
            userName,
            agencyName,
            lastUsedTime,
            deploymentTaskLimit,
            frozenInfos,
            createAt,
            updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopInferDeploymentResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    deploymentName: ").append(toIndentedString(deploymentName)).append("\n");
        sb.append("    inferName: ").append(toIndentedString(inferName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    versionCount: ").append(toIndentedString(versionCount)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
        sb.append("    highAvailSwitch: ").append(toIndentedString(highAvailSwitch)).append("\n");
        sb.append("    systemLogDumpEnable: ").append(toIndentedString(systemLogDumpEnable)).append("\n");
        sb.append("    scheduleStrategy: ").append(toIndentedString(scheduleStrategy)).append("\n");
        sb.append("    unitConfigs: ").append(toIndentedString(unitConfigs)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    advancedConfig: ").append(toIndentedString(advancedConfig)).append("\n");
        sb.append("    mirrorTrafficEnable: ").append(toIndentedString(mirrorTrafficEnable)).append("\n");
        sb.append("    mirrorTrafficWeight: ").append(toIndentedString(mirrorTrafficWeight)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    lastUsedTime: ").append(toIndentedString(lastUsedTime)).append("\n");
        sb.append("    deploymentTaskLimit: ").append(toIndentedString(deploymentTaskLimit)).append("\n");
        sb.append("    frozenInfos: ").append(toIndentedString(frozenInfos)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
