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
public class ShowInferDeploymentVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "infer_name")

    private String inferName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private OffsetDateTime createAt;

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
    @JsonProperty(value = "priority")

    private String priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_type")

    private String secretType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_avail_switch")

    private String highAvailSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_log_dump_enable")

    private String systemLogDumpEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit_configs")

    private List<UnitConfig> unitConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private OffsetDateTime updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_count")

    private Integer versionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_config")

    private AdvancedConfig advancedConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_name")

    private String deploymentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_infos")

    private List<FrozenInfo> frozenInfos = null;

    public ShowInferDeploymentVersionResponse withId(String id) {
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

    public ShowInferDeploymentVersionResponse withName(String name) {
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

    public ShowInferDeploymentVersionResponse withInferName(String inferName) {
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

    public ShowInferDeploymentVersionResponse withCreateAt(OffsetDateTime createAt) {
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

    public ShowInferDeploymentVersionResponse withDescription(String description) {
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

    public ShowInferDeploymentVersionResponse withPoolId(String poolId) {
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

    public ShowInferDeploymentVersionResponse withFramework(String framework) {
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

    public ShowInferDeploymentVersionResponse withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释：** 服务优先级。 **约束限制：** 不涉及。 **取值范围：** [1, 3]。 **默认取值：** 不涉及。
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public ShowInferDeploymentVersionResponse withSecretType(String secretType) {
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

    public ShowInferDeploymentVersionResponse withStatus(String status) {
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

    public ShowInferDeploymentVersionResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释：** 服务实例数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowInferDeploymentVersionResponse withHighAvailSwitch(String highAvailSwitch) {
        this.highAvailSwitch = highAvailSwitch;
        return this;
    }

    /**
     * **参数解释：** 高可用开关，开启后不同实例的pod将尽量均匀分布到不同的节点上。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** true
     * @return highAvailSwitch
     */
    public String getHighAvailSwitch() {
        return highAvailSwitch;
    }

    public void setHighAvailSwitch(String highAvailSwitch) {
        this.highAvailSwitch = highAvailSwitch;
    }

    public ShowInferDeploymentVersionResponse withSystemLogDumpEnable(String systemLogDumpEnable) {
        this.systemLogDumpEnable = systemLogDumpEnable;
        return this;
    }

    /**
     * **参数解释：** 系统日志转储开关。 **约束限制：** 只有NPU资源池有，且逻辑池是没有的 **取值范围：** 不涉及 **默认取值：** false
     * @return systemLogDumpEnable
     */
    public String getSystemLogDumpEnable() {
        return systemLogDumpEnable;
    }

    public void setSystemLogDumpEnable(String systemLogDumpEnable) {
        this.systemLogDumpEnable = systemLogDumpEnable;
    }

    public ShowInferDeploymentVersionResponse withUnitConfigs(List<UnitConfig> unitConfigs) {
        this.unitConfigs = unitConfigs;
        return this;
    }

    public ShowInferDeploymentVersionResponse addUnitConfigsItem(UnitConfig unitConfigsItem) {
        if (this.unitConfigs == null) {
            this.unitConfigs = new ArrayList<>();
        }
        this.unitConfigs.add(unitConfigsItem);
        return this;
    }

    public ShowInferDeploymentVersionResponse withUnitConfigs(Consumer<List<UnitConfig>> unitConfigsSetter) {
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

    public ShowInferDeploymentVersionResponse withUpdateAt(OffsetDateTime updateAt) {
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

    public ShowInferDeploymentVersionResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 当前服务版本信息。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowInferDeploymentVersionResponse withVersionCount(Integer versionCount) {
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

    public ShowInferDeploymentVersionResponse withWeight(Integer weight) {
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

    public ShowInferDeploymentVersionResponse withAdvancedConfig(AdvancedConfig advancedConfig) {
        this.advancedConfig = advancedConfig;
        return this;
    }

    public ShowInferDeploymentVersionResponse withAdvancedConfig(Consumer<AdvancedConfig> advancedConfigSetter) {
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

    public ShowInferDeploymentVersionResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释：** 巫山工作流ID。 **取值范围：** 不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowInferDeploymentVersionResponse withDeploymentName(String deploymentName) {
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

    public ShowInferDeploymentVersionResponse withFrozenInfos(List<FrozenInfo> frozenInfos) {
        this.frozenInfos = frozenInfos;
        return this;
    }

    public ShowInferDeploymentVersionResponse addFrozenInfosItem(FrozenInfo frozenInfosItem) {
        if (this.frozenInfos == null) {
            this.frozenInfos = new ArrayList<>();
        }
        this.frozenInfos.add(frozenInfosItem);
        return this;
    }

    public ShowInferDeploymentVersionResponse withFrozenInfos(Consumer<List<FrozenInfo>> frozenInfosSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInferDeploymentVersionResponse that = (ShowInferDeploymentVersionResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.inferName, that.inferName) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.description, that.description) && Objects.equals(this.poolId, that.poolId)
            && Objects.equals(this.framework, that.framework) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.secretType, that.secretType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.count, that.count) && Objects.equals(this.highAvailSwitch, that.highAvailSwitch)
            && Objects.equals(this.systemLogDumpEnable, that.systemLogDumpEnable)
            && Objects.equals(this.unitConfigs, that.unitConfigs) && Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.version, that.version) && Objects.equals(this.versionCount, that.versionCount)
            && Objects.equals(this.weight, that.weight) && Objects.equals(this.advancedConfig, that.advancedConfig)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.deploymentName, that.deploymentName)
            && Objects.equals(this.frozenInfos, that.frozenInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            inferName,
            createAt,
            description,
            poolId,
            framework,
            priority,
            secretType,
            status,
            count,
            highAvailSwitch,
            systemLogDumpEnable,
            unitConfigs,
            updateAt,
            version,
            versionCount,
            weight,
            advancedConfig,
            jobId,
            deploymentName,
            frozenInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInferDeploymentVersionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    inferName: ").append(toIndentedString(inferName)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    highAvailSwitch: ").append(toIndentedString(highAvailSwitch)).append("\n");
        sb.append("    systemLogDumpEnable: ").append(toIndentedString(systemLogDumpEnable)).append("\n");
        sb.append("    unitConfigs: ").append(toIndentedString(unitConfigs)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionCount: ").append(toIndentedString(versionCount)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    advancedConfig: ").append(toIndentedString(advancedConfig)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    deploymentName: ").append(toIndentedString(deploymentName)).append("\n");
        sb.append("    frozenInfos: ").append(toIndentedString(frozenInfos)).append("\n");
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
