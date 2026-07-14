package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 部署高级配置
 */
public class AdvancedConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_timeout_minutes")

    private String deployTimeoutMinutes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_config")

    private UpgradeConfig upgradeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_secret")

    private ServiceSecret serviceSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dynamic_routing_enable")

    private Boolean dynamicRoutingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private String strategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ems_enable")

    private Boolean emsEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_api_scheme")

    private String metricApiScheme;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_api_port")

    private String metricApiPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_api_path")

    private String metricApiPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_metrics_path")

    private String customMetricsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    public AdvancedConfig withDeployTimeoutMinutes(String deployTimeoutMinutes) {
        this.deployTimeoutMinutes = deployTimeoutMinutes;
        return this;
    }

    /**
     * **参数解释：** 部署超时时间
     * @return deployTimeoutMinutes
     */
    public String getDeployTimeoutMinutes() {
        return deployTimeoutMinutes;
    }

    public void setDeployTimeoutMinutes(String deployTimeoutMinutes) {
        this.deployTimeoutMinutes = deployTimeoutMinutes;
    }

    public AdvancedConfig withUpgradeConfig(UpgradeConfig upgradeConfig) {
        this.upgradeConfig = upgradeConfig;
        return this;
    }

    public AdvancedConfig withUpgradeConfig(Consumer<UpgradeConfig> upgradeConfigSetter) {
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

    public AdvancedConfig withServiceSecret(ServiceSecret serviceSecret) {
        this.serviceSecret = serviceSecret;
        return this;
    }

    public AdvancedConfig withServiceSecret(Consumer<ServiceSecret> serviceSecretSetter) {
        if (this.serviceSecret == null) {
            this.serviceSecret = new ServiceSecret();
            serviceSecretSetter.accept(this.serviceSecret);
        }

        return this;
    }

    /**
     * Get serviceSecret
     * @return serviceSecret
     */
    public ServiceSecret getServiceSecret() {
        return serviceSecret;
    }

    public void setServiceSecret(ServiceSecret serviceSecret) {
        this.serviceSecret = serviceSecret;
    }

    public AdvancedConfig withDynamicRoutingEnable(Boolean dynamicRoutingEnable) {
        this.dynamicRoutingEnable = dynamicRoutingEnable;
        return this;
    }

    /**
     * **参数解释：** 智能路由开关
     * @return dynamicRoutingEnable
     */
    public Boolean getDynamicRoutingEnable() {
        return dynamicRoutingEnable;
    }

    public void setDynamicRoutingEnable(Boolean dynamicRoutingEnable) {
        this.dynamicRoutingEnable = dynamicRoutingEnable;
    }

    public AdvancedConfig withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * **参数解释：** 智能路由策略
     * @return strategy
     */
    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public AdvancedConfig withEmsEnable(Boolean emsEnable) {
        this.emsEnable = emsEnable;
        return this;
    }

    /**
     * **参数解释：** EMS加速开关
     * @return emsEnable
     */
    public Boolean getEmsEnable() {
        return emsEnable;
    }

    public void setEmsEnable(Boolean emsEnable) {
        this.emsEnable = emsEnable;
    }

    public AdvancedConfig withMetricApiScheme(String metricApiScheme) {
        this.metricApiScheme = metricApiScheme;
        return this;
    }

    /**
     * **参数解释：** 智能路由指标采集scheme
     * @return metricApiScheme
     */
    public String getMetricApiScheme() {
        return metricApiScheme;
    }

    public void setMetricApiScheme(String metricApiScheme) {
        this.metricApiScheme = metricApiScheme;
    }

    public AdvancedConfig withMetricApiPort(String metricApiPort) {
        this.metricApiPort = metricApiPort;
        return this;
    }

    /**
     * **参数解释：** 智能路由指标采集端口
     * @return metricApiPort
     */
    public String getMetricApiPort() {
        return metricApiPort;
    }

    public void setMetricApiPort(String metricApiPort) {
        this.metricApiPort = metricApiPort;
    }

    public AdvancedConfig withMetricApiPath(String metricApiPath) {
        this.metricApiPath = metricApiPath;
        return this;
    }

    /**
     * **参数解释：** 智能路由指标采集地址
     * @return metricApiPath
     */
    public String getMetricApiPath() {
        return metricApiPath;
    }

    public void setMetricApiPath(String metricApiPath) {
        this.metricApiPath = metricApiPath;
    }

    public AdvancedConfig withCustomMetricsPath(String customMetricsPath) {
        this.customMetricsPath = customMetricsPath;
        return this;
    }

    /**
     * **参数解释：** 自定义监控采集指标地址
     * @return customMetricsPath
     */
    public String getCustomMetricsPath() {
        return customMetricsPath;
    }

    public void setCustomMetricsPath(String customMetricsPath) {
        this.customMetricsPath = customMetricsPath;
    }

    public AdvancedConfig withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释：** 容器端口
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public AdvancedConfig withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释：** 容器请求协议。当选择WSS与WS时，服务接口会升级为WebSocket。开启WebSocket时，不支持同时设置“服务流量限制”。 **取值范围：** - HTTP：HTTP协议。 - HTTPS：HTTPS协议。 - WSS：WebSocket Secure协议。 - WS：WebSocket协议。 - TCP：传输控制协议。 - NA：不使用任何协议。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdvancedConfig that = (AdvancedConfig) obj;
        return Objects.equals(this.deployTimeoutMinutes, that.deployTimeoutMinutes)
            && Objects.equals(this.upgradeConfig, that.upgradeConfig)
            && Objects.equals(this.serviceSecret, that.serviceSecret)
            && Objects.equals(this.dynamicRoutingEnable, that.dynamicRoutingEnable)
            && Objects.equals(this.strategy, that.strategy) && Objects.equals(this.emsEnable, that.emsEnable)
            && Objects.equals(this.metricApiScheme, that.metricApiScheme)
            && Objects.equals(this.metricApiPort, that.metricApiPort)
            && Objects.equals(this.metricApiPath, that.metricApiPath)
            && Objects.equals(this.customMetricsPath, that.customMetricsPath) && Objects.equals(this.port, that.port)
            && Objects.equals(this.protocol, that.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deployTimeoutMinutes,
            upgradeConfig,
            serviceSecret,
            dynamicRoutingEnable,
            strategy,
            emsEnable,
            metricApiScheme,
            metricApiPort,
            metricApiPath,
            customMetricsPath,
            port,
            protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvancedConfig {\n");
        sb.append("    deployTimeoutMinutes: ").append(toIndentedString(deployTimeoutMinutes)).append("\n");
        sb.append("    upgradeConfig: ").append(toIndentedString(upgradeConfig)).append("\n");
        sb.append("    serviceSecret: ").append(toIndentedString(serviceSecret)).append("\n");
        sb.append("    dynamicRoutingEnable: ").append(toIndentedString(dynamicRoutingEnable)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
        sb.append("    emsEnable: ").append(toIndentedString(emsEnable)).append("\n");
        sb.append("    metricApiScheme: ").append(toIndentedString(metricApiScheme)).append("\n");
        sb.append("    metricApiPort: ").append(toIndentedString(metricApiPort)).append("\n");
        sb.append("    metricApiPath: ").append(toIndentedString(metricApiPath)).append("\n");
        sb.append("    customMetricsPath: ").append(toIndentedString(customMetricsPath)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
