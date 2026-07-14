package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StartInferDeploymentResponse extends SdkResponse {

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
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_log_dump_enable")

    private Boolean systemLogDumpEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit_configs")

    private List<UnitConfigResponse> unitConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_ratio")

    private String trafficRatio;

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
    @JsonProperty(value = "framework")

    private String framework;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_count")

    private Integer runningCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mirror_traffic_enable")

    private Boolean mirrorTrafficEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mirror_traffic_weight")

    private String mirrorTrafficWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_count")

    private Integer versionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_type")

    private String workloadType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_state")

    private String ltsState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infer_name")

    private String inferName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private InferModelResponse model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_config")

    private AdvancedConfig advancedConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_strategy")

    private String scheduleStrategy;

    public StartInferDeploymentResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 部署ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StartInferDeploymentResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 部署名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StartInferDeploymentResponse withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释：** 资源池ID，查询指定资源池下的服务，默认不过滤。可通过[查询资源池列表](ShowPool.xml)获取。 **取值范围：** 不涉及。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public StartInferDeploymentResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释：** 部署场景下，服务实例数量。 **约束限制：** 不涉及。 **取值范围：** [1, 128]。 **默认取值：** 不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public StartInferDeploymentResponse withSystemLogDumpEnable(Boolean systemLogDumpEnable) {
        this.systemLogDumpEnable = systemLogDumpEnable;
        return this;
    }

    /**
     * **参数解释：** 系统日志转储开关。 **约束限制：** 只有NPU资源池有，且逻辑池是没有的。 **取值范围：** 不涉及。 **默认取值：** false。
     * @return systemLogDumpEnable
     */
    public Boolean getSystemLogDumpEnable() {
        return systemLogDumpEnable;
    }

    public void setSystemLogDumpEnable(Boolean systemLogDumpEnable) {
        this.systemLogDumpEnable = systemLogDumpEnable;
    }

    public StartInferDeploymentResponse withUnitConfigs(List<UnitConfigResponse> unitConfigs) {
        this.unitConfigs = unitConfigs;
        return this;
    }

    public StartInferDeploymentResponse addUnitConfigsItem(UnitConfigResponse unitConfigsItem) {
        if (this.unitConfigs == null) {
            this.unitConfigs = new ArrayList<>();
        }
        this.unitConfigs.add(unitConfigsItem);
        return this;
    }

    public StartInferDeploymentResponse withUnitConfigs(Consumer<List<UnitConfigResponse>> unitConfigsSetter) {
        if (this.unitConfigs == null) {
            this.unitConfigs = new ArrayList<>();
        }
        unitConfigsSetter.accept(this.unitConfigs);
        return this;
    }

    /**
     * **参数解释：** 推理单元配置。
     * @return unitConfigs
     */
    public List<UnitConfigResponse> getUnitConfigs() {
        return unitConfigs;
    }

    public void setUnitConfigs(List<UnitConfigResponse> unitConfigs) {
        this.unitConfigs = unitConfigs;
    }

    public StartInferDeploymentResponse withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释：** 权重百分比，分配到此模型的流量权重，仅当模型部署为在线服务时需要配置。 **取值范围：** [0, 100]。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public StartInferDeploymentResponse withTrafficRatio(String trafficRatio) {
        this.trafficRatio = trafficRatio;
        return this;
    }

    /**
     * **参数解释：** 流量比例，单个部署实例预期接收用户的流量与总流量比值，是由流量权重配置和部署状态计算所得的值。 **取值范围：** 0.00%~100.00%。
     * @return trafficRatio
     */
    public String getTrafficRatio() {
        return trafficRatio;
    }

    public void setTrafficRatio(String trafficRatio) {
        this.trafficRatio = trafficRatio;
    }

    public StartInferDeploymentResponse withSecretType(String secretType) {
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

    public StartInferDeploymentResponse withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * **参数解释：** 凭证名称，用户使用dew类型凭证时可以在此处选择使用的凭证。 **约束限制：** 不涉及。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public StartInferDeploymentResponse withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释：** 服务优先级。 **约束限制：** 不涉及。 **取值范围：** [1, 3]。 **默认取值：** 不涉及。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public StartInferDeploymentResponse withHighAvailSwitch(Boolean highAvailSwitch) {
        this.highAvailSwitch = highAvailSwitch;
        return this;
    }

    /**
     * **参数解释：** 高可用开关，开启后不同实例的pod将尽量均匀分布到不同的节点上。（准备下线，请使用schedule_strategy字段） **取值范围：** - true: 高可用开启 - false: 高可用关闭。
     * @return highAvailSwitch
     */
    public Boolean getHighAvailSwitch() {
        return highAvailSwitch;
    }

    public void setHighAvailSwitch(Boolean highAvailSwitch) {
        this.highAvailSwitch = highAvailSwitch;
    }

    public StartInferDeploymentResponse withFramework(String framework) {
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

    public StartInferDeploymentResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 服务版本号，以数字及点号组成，形如1.0.1。 **约束限制：** 不涉及。 **取值范围：** 1.0.0 ~ 99.99.99，长度不超过8位。 **默认取值：** 不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public StartInferDeploymentResponse withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * **参数解释：** 版本id，可通过查询version列表查询。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public StartInferDeploymentResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 服务当前状态。 **取值范围：** - DEPLOYING：部署中。 - FAILED：失败。 - STOPPED：停止。 - RUNNING：运行中。 - DELETING：删除中。 - STOPPING：停止中。 - CONCERNING：告警。 - DELETED: 已删除。 - RESTARTING: 重启中。 - UPGRADING：升级中。 - ERROR：异常。 - INTERRUPTING：中断中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StartInferDeploymentResponse withRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * **参数解释：** 部署场景下，服务运行实例数量。 **约束限制：** 不涉及。 **取值范围：** [1, 128]。 **默认取值：** 不涉及。
     * @return runningCount
     */
    public Integer getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    public StartInferDeploymentResponse withDeployType(String deployType) {
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

    public StartInferDeploymentResponse withMirrorTrafficEnable(Boolean mirrorTrafficEnable) {
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

    public StartInferDeploymentResponse withMirrorTrafficWeight(String mirrorTrafficWeight) {
        this.mirrorTrafficWeight = mirrorTrafficWeight;
        return this;
    }

    /**
     * **参数解释：** 镜像流量权重。 **取值范围：** 50。
     * @return mirrorTrafficWeight
     */
    public String getMirrorTrafficWeight() {
        return mirrorTrafficWeight;
    }

    public void setMirrorTrafficWeight(String mirrorTrafficWeight) {
        this.mirrorTrafficWeight = mirrorTrafficWeight;
    }

    public StartInferDeploymentResponse withVersionCount(Integer versionCount) {
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

    public StartInferDeploymentResponse withWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * **参数解释：** 工作负载类型。 **取值范围：** 不涉及。
     * @return workloadType
     */
    public String getWorkloadType() {
        return workloadType;
    }

    public void setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
    }

    public StartInferDeploymentResponse withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间，根据更新时的当前时间自动生成。 **取值范围：** 毫秒级时间戳，13位数字。
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public StartInferDeploymentResponse withLtsState(String ltsState) {
        this.ltsState = ltsState;
        return this;
    }

    /**
     * **参数解释：** 部署对接lts状态。 **取值范围：** - ON：开启。 - OFF：关闭。
     * @return ltsState
     */
    public String getLtsState() {
        return ltsState;
    }

    public void setLtsState(String ltsState) {
        this.ltsState = ltsState;
    }

    public StartInferDeploymentResponse withInferName(String inferName) {
        this.inferName = inferName;
        return this;
    }

    /**
     * **参数解释：** 部署ID。
     * @return inferName
     */
    public String getInferName() {
        return inferName;
    }

    public void setInferName(String inferName) {
        this.inferName = inferName;
    }

    public StartInferDeploymentResponse withModel(InferModelResponse model) {
        this.model = model;
        return this;
    }

    public StartInferDeploymentResponse withModel(Consumer<InferModelResponse> modelSetter) {
        if (this.model == null) {
            this.model = new InferModelResponse();
            modelSetter.accept(this.model);
        }

        return this;
    }

    /**
     * Get model
     * @return model
     */
    public InferModelResponse getModel() {
        return model;
    }

    public void setModel(InferModelResponse model) {
        this.model = model;
    }

    public StartInferDeploymentResponse withAdvancedConfig(AdvancedConfig advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }

    public StartInferDeploymentResponse withAdvancedConfig(Consumer<AdvancedConfig> advancedConfigSetter) {
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

    public StartInferDeploymentResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 部署描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StartInferDeploymentResponse withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 参数解释： 创建时间，根据创建时的当前时间自动生成。 取值范围： 毫秒级时间戳，13位数字，如1609459200000。
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public StartInferDeploymentResponse withScheduleStrategy(String scheduleStrategy) {
        this.scheduleStrategy = scheduleStrategy;
        return this;
    }

    /**
     * **参数解释：** 调度策略。 **取值范围：** - HIGH_AVAILABILITY：高可用调度 - HIGH_UTILIZATION：紧凑调度 - HIGH_PERFORMANCE：高性能调度
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
        StartInferDeploymentResponse that = (StartInferDeploymentResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.count, that.count)
            && Objects.equals(this.systemLogDumpEnable, that.systemLogDumpEnable)
            && Objects.equals(this.unitConfigs, that.unitConfigs) && Objects.equals(this.weight, that.weight)
            && Objects.equals(this.trafficRatio, that.trafficRatio) && Objects.equals(this.secretType, that.secretType)
            && Objects.equals(this.secretName, that.secretName) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.highAvailSwitch, that.highAvailSwitch)
            && Objects.equals(this.framework, that.framework) && Objects.equals(this.version, that.version)
            && Objects.equals(this.versionId, that.versionId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.runningCount, that.runningCount) && Objects.equals(this.deployType, that.deployType)
            && Objects.equals(this.mirrorTrafficEnable, that.mirrorTrafficEnable)
            && Objects.equals(this.mirrorTrafficWeight, that.mirrorTrafficWeight)
            && Objects.equals(this.versionCount, that.versionCount)
            && Objects.equals(this.workloadType, that.workloadType) && Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.ltsState, that.ltsState) && Objects.equals(this.inferName, that.inferName)
            && Objects.equals(this.model, that.model) && Objects.equals(this.advancedConfig, that.advancedConfig)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.scheduleStrategy, that.scheduleStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            poolId,
            count,
            systemLogDumpEnable,
            unitConfigs,
            weight,
            trafficRatio,
            secretType,
            secretName,
            priority,
            highAvailSwitch,
            framework,
            version,
            versionId,
            status,
            runningCount,
            deployType,
            mirrorTrafficEnable,
            mirrorTrafficWeight,
            versionCount,
            workloadType,
            updateAt,
            ltsState,
            inferName,
            model,
            advancedConfig,
            description,
            createAt,
            scheduleStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartInferDeploymentResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    systemLogDumpEnable: ").append(toIndentedString(systemLogDumpEnable)).append("\n");
        sb.append("    unitConfigs: ").append(toIndentedString(unitConfigs)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    trafficRatio: ").append(toIndentedString(trafficRatio)).append("\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    highAvailSwitch: ").append(toIndentedString(highAvailSwitch)).append("\n");
        sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    mirrorTrafficEnable: ").append(toIndentedString(mirrorTrafficEnable)).append("\n");
        sb.append("    mirrorTrafficWeight: ").append(toIndentedString(mirrorTrafficWeight)).append("\n");
        sb.append("    versionCount: ").append(toIndentedString(versionCount)).append("\n");
        sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    ltsState: ").append(toIndentedString(ltsState)).append("\n");
        sb.append("    inferName: ").append(toIndentedString(inferName)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    advancedConfig: ").append(toIndentedString(advancedConfig)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
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
