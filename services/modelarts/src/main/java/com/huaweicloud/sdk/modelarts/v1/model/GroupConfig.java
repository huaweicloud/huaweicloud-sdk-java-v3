package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 服务实例组配置，当推理方式为BATCH/EDGE时仅支持配置一个模型；当推理方式为REAL_TIME时，可根据业务需要配置多个服务实例并分配权重。 **约束限制：** 不涉及
 */
public class GroupConfig {

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
    @JsonProperty(value = "schedule_strategy")

    private String scheduleStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * **参数解释：** 服务框架。 **约束限制：** 仅支持以下枚举值：COMMON | VLLM | MINDIE。 **取值范围：** 仅支持以下枚举值：COMMON | VLLM | MINDIE。 **默认取值：** COMMON。
     */
    public static final class FrameworkEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final FrameworkEnum COMMON = new FrameworkEnum("COMMON");

        /**
         * Enum VLLM for value: "VLLM"
         */
        public static final FrameworkEnum VLLM = new FrameworkEnum("VLLM");

        /**
         * Enum MINDIE for value: "MINDIE"
         */
        public static final FrameworkEnum MINDIE = new FrameworkEnum("MINDIE");

        private static final Map<String, FrameworkEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FrameworkEnum> createStaticFields() {
            Map<String, FrameworkEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("VLLM", VLLM);
            map.put("MINDIE", MINDIE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FrameworkEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FrameworkEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FrameworkEnum(value));
        }

        public static FrameworkEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FrameworkEnum) {
                return this.value.equals(((FrameworkEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "framework")

    private FrameworkEnum framework;

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
    @JsonProperty(value = "model")

    private ModelResource model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_config")

    private AdvancedConfig advancedConfig;

    public GroupConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 部署ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GroupConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 部署名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupConfig withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释：** 资源池ID，查询指定资源池下的服务，默认不过滤。可通过[查询资源池列表](ShowPool.xml)获取。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public GroupConfig withCount(Integer count) {
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

    public GroupConfig withSystemLogDumpEnable(Boolean systemLogDumpEnable) {
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

    public GroupConfig withUnitConfigs(List<UnitConfig> unitConfigs) {
        this.unitConfigs = unitConfigs;
        return this;
    }

    public GroupConfig addUnitConfigsItem(UnitConfig unitConfigsItem) {
        if (this.unitConfigs == null) {
            this.unitConfigs = new ArrayList<>();
        }
        this.unitConfigs.add(unitConfigsItem);
        return this;
    }

    public GroupConfig withUnitConfigs(Consumer<List<UnitConfig>> unitConfigsSetter) {
        if (this.unitConfigs == null) {
            this.unitConfigs = new ArrayList<>();
        }
        unitConfigsSetter.accept(this.unitConfigs);
        return this;
    }

    /**
     * **参数解释：** 推理单元配置。 **约束限制：** 单机推理时，个数只会为1；如果是分布式推理时，根据不同框架，实例单元配置可灵活配置。
     * @return unitConfigs
     */
    public List<UnitConfig> getUnitConfigs() {
        return unitConfigs;
    }

    public void setUnitConfigs(List<UnitConfig> unitConfigs) {
        this.unitConfigs = unitConfigs;
    }

    public GroupConfig withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * **参数解释：** 权重百分比，分配到此模型的流量权重，仅当模型部署为在线服务时需要配置。 **约束限制：** 不涉及。 **取值范围：** [0, 100]。 **默认取值：** 不涉及。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public GroupConfig withSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }

    /**
     * **参数解释：** 凭证类型相关配置，用户可以在此处选择使用的凭证类型（dew，agency） **约束限制：** 1.使用临时委托凭证类型约束限制:集群已安装CCE容器存储（Everest）v2.4.204及以上版本，且集群版本为v1.28及以上且确保局点已启用IAM5服务。 2.若插件版本不足或集群不支持临时委托凭证，则需通过DEW服务挂载。 **取值范围：** - [dew：DEW密钥。](tag:hws,hws_hk,fcs) - agency：临时委托凭证。 **默认取值：** 不涉及。
     * @return secretType
     */
    public String getSecretType() {
        return secretType;
    }

    public void setSecretType(String secretType) {
        this.secretType = secretType;
    }

    public GroupConfig withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * **参数解释**： 凭证名称，用户使用dew类型凭证时可以在此处选择使用的凭证。 **约束限制**： 不涉及。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public GroupConfig withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释：** 服务优先级。 **约束限制：** - 如服务处于\"运行中\"，priority字段为必要参数，且value必须与原服务的priority值相同； - 如服务处于\"停止\"，priority字段为非必要参数。 **取值范围：** [1, 3]。 **默认取值：** 不涉及。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public GroupConfig withHighAvailSwitch(Boolean highAvailSwitch) {
        this.highAvailSwitch = highAvailSwitch;
        return this;
    }

    /**
     * **参数解释：** 高可用开关，开启后不同实例的pod将尽量均匀分布到不同的节点上。（准备下线，请使用schedule_strategy字段） **约束限制：** 不涉及。 **取值范围：** - true：高可用开启。 - false：高可用关闭。 **默认取值：** true。
     * @return highAvailSwitch
     */
    public Boolean getHighAvailSwitch() {
        return highAvailSwitch;
    }

    public void setHighAvailSwitch(Boolean highAvailSwitch) {
        this.highAvailSwitch = highAvailSwitch;
    }

    public GroupConfig withScheduleStrategy(String scheduleStrategy) {
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

    public GroupConfig withVersion(String version) {
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

    public GroupConfig withVersionId(String versionId) {
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

    public GroupConfig withDescription(String description) {
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

    public GroupConfig withFramework(FrameworkEnum framework) {
        this.framework = framework;
        return this;
    }

    /**
     * **参数解释：** 服务框架。 **约束限制：** 仅支持以下枚举值：COMMON | VLLM | MINDIE。 **取值范围：** 仅支持以下枚举值：COMMON | VLLM | MINDIE。 **默认取值：** COMMON。
     * @return framework
     */
    public FrameworkEnum getFramework() {
        return framework;
    }

    public void setFramework(FrameworkEnum framework) {
        this.framework = framework;
    }

    public GroupConfig withRunningCount(Integer runningCount) {
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

    public GroupConfig withDeployType(String deployType) {
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

    public GroupConfig withMirrorTrafficEnable(Boolean mirrorTrafficEnable) {
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

    public GroupConfig withMirrorTrafficWeight(String mirrorTrafficWeight) {
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

    public GroupConfig withVersionCount(Integer versionCount) {
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

    public GroupConfig withWorkloadType(String workloadType) {
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

    public GroupConfig withUpdateAt(Long updateAt) {
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

    public GroupConfig withModel(ModelResource model) {
        this.model = model;
        return this;
    }

    public GroupConfig withModel(Consumer<ModelResource> modelSetter) {
        if (this.model == null) {
            this.model = new ModelResource();
            modelSetter.accept(this.model);
        }

        return this;
    }

    /**
     * Get model
     * @return model
     */
    public ModelResource getModel() {
        return model;
    }

    public void setModel(ModelResource model) {
        this.model = model;
    }

    public GroupConfig withAdvancedConfig(AdvancedConfig advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }

    public GroupConfig withAdvancedConfig(Consumer<AdvancedConfig> advancedConfigSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupConfig that = (GroupConfig) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.count, that.count)
            && Objects.equals(this.systemLogDumpEnable, that.systemLogDumpEnable)
            && Objects.equals(this.unitConfigs, that.unitConfigs) && Objects.equals(this.weight, that.weight)
            && Objects.equals(this.secretType, that.secretType) && Objects.equals(this.secretName, that.secretName)
            && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.highAvailSwitch, that.highAvailSwitch)
            && Objects.equals(this.scheduleStrategy, that.scheduleStrategy)
            && Objects.equals(this.version, that.version) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.framework, that.framework)
            && Objects.equals(this.runningCount, that.runningCount) && Objects.equals(this.deployType, that.deployType)
            && Objects.equals(this.mirrorTrafficEnable, that.mirrorTrafficEnable)
            && Objects.equals(this.mirrorTrafficWeight, that.mirrorTrafficWeight)
            && Objects.equals(this.versionCount, that.versionCount)
            && Objects.equals(this.workloadType, that.workloadType) && Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.model, that.model) && Objects.equals(this.advancedConfig, that.advancedConfig);
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
            secretType,
            secretName,
            priority,
            highAvailSwitch,
            scheduleStrategy,
            version,
            versionId,
            description,
            framework,
            runningCount,
            deployType,
            mirrorTrafficEnable,
            mirrorTrafficWeight,
            versionCount,
            workloadType,
            updateAt,
            model,
            advancedConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    systemLogDumpEnable: ").append(toIndentedString(systemLogDumpEnable)).append("\n");
        sb.append("    unitConfigs: ").append(toIndentedString(unitConfigs)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    highAvailSwitch: ").append(toIndentedString(highAvailSwitch)).append("\n");
        sb.append("    scheduleStrategy: ").append(toIndentedString(scheduleStrategy)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
        sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    mirrorTrafficEnable: ").append(toIndentedString(mirrorTrafficEnable)).append("\n");
        sb.append("    mirrorTrafficWeight: ").append(toIndentedString(mirrorTrafficWeight)).append("\n");
        sb.append("    versionCount: ").append(toIndentedString(versionCount)).append("\n");
        sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    advancedConfig: ").append(toIndentedString(advancedConfig)).append("\n");
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
