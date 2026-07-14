package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 当前服务版本信息。
 */
public class ServiceVersionResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "predict_url")

    private String predictUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_config")

    private RuntimeConfigResponse runtimeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_config")

    private UpgradeConfigResponse upgradeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_groups")

    private List<GroupConfigResponse> instanceGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_strategy")

    private String ltsStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_status")

    private String ltsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_event_status")

    private String ltsEventStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_configs")

    private List<LogConfigResponse> logConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_timeout_minutes")

    private Integer deployTimeoutMinutes;

    public ServiceVersionResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 版本id。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServiceVersionResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 版本号。 **取值范围：** 不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ServiceVersionResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述。 **取值范围：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServiceVersionResponse withPredictUrl(String predictUrl) {
        this.predictUrl = predictUrl;
        return this;
    }

    /**
     * **参数解释：** 推理请求的访问地址。 **取值范围：** 不涉及。
     * @return predictUrl
     */
    public String getPredictUrl() {
        return predictUrl;
    }

    public void setPredictUrl(String predictUrl) {
        this.predictUrl = predictUrl;
    }

    public ServiceVersionResponse withRuntimeConfig(RuntimeConfigResponse runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }

    public ServiceVersionResponse withRuntimeConfig(Consumer<RuntimeConfigResponse> runtimeConfigSetter) {
        if (this.runtimeConfig == null) {
            this.runtimeConfig = new RuntimeConfigResponse();
            runtimeConfigSetter.accept(this.runtimeConfig);
        }

        return this;
    }

    /**
     * Get runtimeConfig
     * @return runtimeConfig
     */
    public RuntimeConfigResponse getRuntimeConfig() {
        return runtimeConfig;
    }

    public void setRuntimeConfig(RuntimeConfigResponse runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    public ServiceVersionResponse withUpgradeConfig(UpgradeConfigResponse upgradeConfig) {
        this.upgradeConfig = upgradeConfig;
        return this;
    }

    public ServiceVersionResponse withUpgradeConfig(Consumer<UpgradeConfigResponse> upgradeConfigSetter) {
        if (this.upgradeConfig == null) {
            this.upgradeConfig = new UpgradeConfigResponse();
            upgradeConfigSetter.accept(this.upgradeConfig);
        }

        return this;
    }

    /**
     * Get upgradeConfig
     * @return upgradeConfig
     */
    public UpgradeConfigResponse getUpgradeConfig() {
        return upgradeConfig;
    }

    public void setUpgradeConfig(UpgradeConfigResponse upgradeConfig) {
        this.upgradeConfig = upgradeConfig;
    }

    public ServiceVersionResponse withInstanceGroups(List<GroupConfigResponse> instanceGroups) {
        this.instanceGroups = instanceGroups;
        return this;
    }

    public ServiceVersionResponse addInstanceGroupsItem(GroupConfigResponse instanceGroupsItem) {
        if (this.instanceGroups == null) {
            this.instanceGroups = new ArrayList<>();
        }
        this.instanceGroups.add(instanceGroupsItem);
        return this;
    }

    public ServiceVersionResponse withInstanceGroups(Consumer<List<GroupConfigResponse>> instanceGroupsSetter) {
        if (this.instanceGroups == null) {
            this.instanceGroups = new ArrayList<>();
        }
        instanceGroupsSetter.accept(this.instanceGroups);
        return this;
    }

    /**
     * **参数解释：** 服务部署信息。
     * @return instanceGroups
     */
    public List<GroupConfigResponse> getInstanceGroups() {
        return instanceGroups;
    }

    public void setInstanceGroups(List<GroupConfigResponse> instanceGroups) {
        this.instanceGroups = instanceGroups;
    }

    public ServiceVersionResponse withLtsStrategy(String ltsStrategy) {
        this.ltsStrategy = ltsStrategy;
        return this;
    }

    /**
     * **参数解释：** 日志策略。 **取值范围：** - POOL：使用资源池日志插件配置的日志流。 - AUTO_CREATE：自动创建日志流。 - DEFAULT: 由系统决定日志策略
     * @return ltsStrategy
     */
    public String getLtsStrategy() {
        return ltsStrategy;
    }

    public void setLtsStrategy(String ltsStrategy) {
        this.ltsStrategy = ltsStrategy;
    }

    public ServiceVersionResponse withLtsStatus(String ltsStatus) {
        this.ltsStatus = ltsStatus;
        return this;
    }

    /**
     * **参数解释：** 部署对接lts状态。 **取值范围：** - ON：开启。 - OFF：关闭。
     * @return ltsStatus
     */
    public String getLtsStatus() {
        return ltsStatus;
    }

    public void setLtsStatus(String ltsStatus) {
        this.ltsStatus = ltsStatus;
    }

    public ServiceVersionResponse withLtsEventStatus(String ltsEventStatus) {
        this.ltsEventStatus = ltsEventStatus;
        return this;
    }

    /**
     * **参数解释：** 部署对接lts k8s事件状态。 **取值范围：** - ON：开启。 - OFF：关闭。
     * @return ltsEventStatus
     */
    public String getLtsEventStatus() {
        return ltsEventStatus;
    }

    public void setLtsEventStatus(String ltsEventStatus) {
        this.ltsEventStatus = ltsEventStatus;
    }

    public ServiceVersionResponse withLogConfigs(List<LogConfigResponse> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public ServiceVersionResponse addLogConfigsItem(LogConfigResponse logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public ServiceVersionResponse withLogConfigs(Consumer<List<LogConfigResponse>> logConfigsSetter) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /**
     * **参数解释：** 服务日志配置信息。
     * @return logConfigs
     */
    public List<LogConfigResponse> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<LogConfigResponse> logConfigs) {
        this.logConfigs = logConfigs;
    }

    public ServiceVersionResponse withDeployTimeoutMinutes(Integer deployTimeoutMinutes) {
        this.deployTimeoutMinutes = deployTimeoutMinutes;
        return this;
    }

    /**
     * **参数解释：** 部署超时时间。 **取值范围：** 不涉及。
     * @return deployTimeoutMinutes
     */
    public Integer getDeployTimeoutMinutes() {
        return deployTimeoutMinutes;
    }

    public void setDeployTimeoutMinutes(Integer deployTimeoutMinutes) {
        this.deployTimeoutMinutes = deployTimeoutMinutes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceVersionResponse that = (ServiceVersionResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.version, that.version)
            && Objects.equals(this.description, that.description) && Objects.equals(this.predictUrl, that.predictUrl)
            && Objects.equals(this.runtimeConfig, that.runtimeConfig)
            && Objects.equals(this.upgradeConfig, that.upgradeConfig)
            && Objects.equals(this.instanceGroups, that.instanceGroups)
            && Objects.equals(this.ltsStrategy, that.ltsStrategy) && Objects.equals(this.ltsStatus, that.ltsStatus)
            && Objects.equals(this.ltsEventStatus, that.ltsEventStatus)
            && Objects.equals(this.logConfigs, that.logConfigs)
            && Objects.equals(this.deployTimeoutMinutes, that.deployTimeoutMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            version,
            description,
            predictUrl,
            runtimeConfig,
            upgradeConfig,
            instanceGroups,
            ltsStrategy,
            ltsStatus,
            ltsEventStatus,
            logConfigs,
            deployTimeoutMinutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceVersionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    predictUrl: ").append(toIndentedString(predictUrl)).append("\n");
        sb.append("    runtimeConfig: ").append(toIndentedString(runtimeConfig)).append("\n");
        sb.append("    upgradeConfig: ").append(toIndentedString(upgradeConfig)).append("\n");
        sb.append("    instanceGroups: ").append(toIndentedString(instanceGroups)).append("\n");
        sb.append("    ltsStrategy: ").append(toIndentedString(ltsStrategy)).append("\n");
        sb.append("    ltsStatus: ").append(toIndentedString(ltsStatus)).append("\n");
        sb.append("    ltsEventStatus: ").append(toIndentedString(ltsEventStatus)).append("\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
        sb.append("    deployTimeoutMinutes: ").append(toIndentedString(deployTimeoutMinutes)).append("\n");
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
