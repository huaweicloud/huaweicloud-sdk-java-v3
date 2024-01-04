package com.huaweicloud.sdk.cae.v1.model;

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
 * 组件配置数据规格详情。
 */
public class ConfigurationRequestDataSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_id")

    private String rdsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_db_name")

    private String rdsDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_address")

    private String rdsAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_username")

    private String rdsUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_password")

    private String rdsPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_port")

    private String rdsPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_center_addr")

    private String configCenterAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_center_addr")

    private String serviceCenterAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cse_id")

    private String cseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "envs")

    private Map<String, String> envs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<AccessConfigurationDataItems> items = null;

    /**
     * 伸缩策略配置策略类型。  type为\"scaling\"时，配置此参数。 
     */
    public static final class ScaleStrategyEnum {

        /**
         * Enum METRIC for value: "metric"
         */
        public static final ScaleStrategyEnum METRIC = new ScaleStrategyEnum("metric");

        /**
         * Enum TIME for value: "time"
         */
        public static final ScaleStrategyEnum TIME = new ScaleStrategyEnum("time");

        /**
         * Enum MIX for value: "mix"
         */
        public static final ScaleStrategyEnum MIX = new ScaleStrategyEnum("mix");

        private static final Map<String, ScaleStrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScaleStrategyEnum> createStaticFields() {
            Map<String, ScaleStrategyEnum> map = new HashMap<>();
            map.put("metric", METRIC);
            map.put("time", TIME);
            map.put("mix", MIX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScaleStrategyEnum(String value) {
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
        public static ScaleStrategyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScaleStrategyEnum(value));
        }

        public static ScaleStrategyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScaleStrategyEnum) {
                return this.value.equals(((ScaleStrategyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_strategy")

    private ScaleStrategyEnum scaleStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_replica_count")

    private Integer maxReplicaCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_replica_count")

    private Integer minReplicaCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced")

    private ScaleConfigurationDataAdvanced advanced;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggers")

    private List<ScaleConfigurationDataTrigger> triggers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<VolumeConfigurationDataVolume> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "livenessProbe")

    private HealthCheckConfigurationLivenessProbe livenessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startupProbe")

    private HealthCheckConfigurationStartupProbe startupProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readinessProbe")

    private HealthCheckConfigurationReadinessProbe readinessProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "postStart")

    private ConfigurationRequestDataSpecPostStart postStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preStop")

    private ConfigurationRequestDataSpecPreStop preStop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_paths")

    private List<String> logPaths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instrumentation")

    private String instrumentation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<String> metrics = null;

    public ConfigurationRequestDataSpec withRdsId(String rdsId) {
        this.rdsId = rdsId;
        return this;
    }

    /**
     * RDS数据库实例ID。  type为\"rds\"时，配置此参数。 
     * @return rdsId
     */
    public String getRdsId() {
        return rdsId;
    }

    public void setRdsId(String rdsId) {
        this.rdsId = rdsId;
    }

    public ConfigurationRequestDataSpec withRdsDbName(String rdsDbName) {
        this.rdsDbName = rdsDbName;
        return this;
    }

    /**
     * RDS数据库名称。  type为\"rds\"时，配置此参数。 
     * @return rdsDbName
     */
    public String getRdsDbName() {
        return rdsDbName;
    }

    public void setRdsDbName(String rdsDbName) {
        this.rdsDbName = rdsDbName;
    }

    public ConfigurationRequestDataSpec withRdsAddress(String rdsAddress) {
        this.rdsAddress = rdsAddress;
        return this;
    }

    /**
     * RDS数据库地址。  type为\"rds\"时，配置此参数。 
     * @return rdsAddress
     */
    public String getRdsAddress() {
        return rdsAddress;
    }

    public void setRdsAddress(String rdsAddress) {
        this.rdsAddress = rdsAddress;
    }

    public ConfigurationRequestDataSpec withRdsUsername(String rdsUsername) {
        this.rdsUsername = rdsUsername;
        return this;
    }

    /**
     * RDS数据库用户名称。  type为\"rds\"时，配置此参数。 
     * @return rdsUsername
     */
    public String getRdsUsername() {
        return rdsUsername;
    }

    public void setRdsUsername(String rdsUsername) {
        this.rdsUsername = rdsUsername;
    }

    public ConfigurationRequestDataSpec withRdsPassword(String rdsPassword) {
        this.rdsPassword = rdsPassword;
        return this;
    }

    /**
     * RDS数据库密码。  type为\"rds\"时，配置此参数。 
     * @return rdsPassword
     */
    public String getRdsPassword() {
        return rdsPassword;
    }

    public void setRdsPassword(String rdsPassword) {
        this.rdsPassword = rdsPassword;
    }

    public ConfigurationRequestDataSpec withRdsPort(String rdsPort) {
        this.rdsPort = rdsPort;
        return this;
    }

    /**
     * RDS数据库端口。  type为\"rds\"时，配置此参数。 
     * @return rdsPort
     */
    public String getRdsPort() {
        return rdsPort;
    }

    public void setRdsPort(String rdsPort) {
        this.rdsPort = rdsPort;
    }

    public ConfigurationRequestDataSpec withConfigCenterAddr(String configCenterAddr) {
        this.configCenterAddr = configCenterAddr;
        return this;
    }

    /**
     * CSE配置中心地址。  type为\"cse\"时，配置此参数。 
     * @return configCenterAddr
     */
    public String getConfigCenterAddr() {
        return configCenterAddr;
    }

    public void setConfigCenterAddr(String configCenterAddr) {
        this.configCenterAddr = configCenterAddr;
    }

    public ConfigurationRequestDataSpec withServiceCenterAddr(String serviceCenterAddr) {
        this.serviceCenterAddr = serviceCenterAddr;
        return this;
    }

    /**
     * CSE服务注册发现地址。  type为\"cse\"时，配置此参数。 
     * @return serviceCenterAddr
     */
    public String getServiceCenterAddr() {
        return serviceCenterAddr;
    }

    public void setServiceCenterAddr(String serviceCenterAddr) {
        this.serviceCenterAddr = serviceCenterAddr;
    }

    public ConfigurationRequestDataSpec withCseId(String cseId) {
        this.cseId = cseId;
        return this;
    }

    /**
     * CSE引擎ID。  type为\"cse\"时，配置此参数。 
     * @return cseId
     */
    public String getCseId() {
        return cseId;
    }

    public void setCseId(String cseId) {
        this.cseId = cseId;
    }

    public ConfigurationRequestDataSpec withEnvs(Map<String, String> envs) {
        this.envs = envs;
        return this;
    }

    public ConfigurationRequestDataSpec putEnvsItem(String key, String envsItem) {
        if (this.envs == null) {
            this.envs = new HashMap<>();
        }
        this.envs.put(key, envsItem);
        return this;
    }

    public ConfigurationRequestDataSpec withEnvs(Consumer<Map<String, String>> envsSetter) {
        if (this.envs == null) {
            this.envs = new HashMap<>();
        }
        envsSetter.accept(this.envs);
        return this;
    }

    /**
     * 环境变量配置。 常用环境变量如下： - TZ: 时区设置，东八区可设置为Asia/Shanghai。 - LANG: 语言字符集设置，中文UTF8可设置为zh_CN.UTF-8。
     * @return envs
     */
    public Map<String, String> getEnvs() {
        return envs;
    }

    public void setEnvs(Map<String, String> envs) {
        this.envs = envs;
    }

    public ConfigurationRequestDataSpec withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 弹性公网IP，响应体参数，未配置域名时返回此参数。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ConfigurationRequestDataSpec withItems(List<AccessConfigurationDataItems> items) {
        this.items = items;
        return this;
    }

    public ConfigurationRequestDataSpec addItemsItem(AccessConfigurationDataItems itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ConfigurationRequestDataSpec withItems(Consumer<List<AccessConfigurationDataItems>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 访问方式配置列表。  type为\"access\"时，配置此参数。 
     * @return items
     */
    public List<AccessConfigurationDataItems> getItems() {
        return items;
    }

    public void setItems(List<AccessConfigurationDataItems> items) {
        this.items = items;
    }

    public ConfigurationRequestDataSpec withScaleStrategy(ScaleStrategyEnum scaleStrategy) {
        this.scaleStrategy = scaleStrategy;
        return this;
    }

    /**
     * 伸缩策略配置策略类型。  type为\"scaling\"时，配置此参数。 
     * @return scaleStrategy
     */
    public ScaleStrategyEnum getScaleStrategy() {
        return scaleStrategy;
    }

    public void setScaleStrategy(ScaleStrategyEnum scaleStrategy) {
        this.scaleStrategy = scaleStrategy;
    }

    public ConfigurationRequestDataSpec withMaxReplicaCount(Integer maxReplicaCount) {
        this.maxReplicaCount = maxReplicaCount;
        return this;
    }

    /**
     * 伸缩策略配置最大伸缩个数。  type为\"scaling\"时，配置此参数。 
     * @return maxReplicaCount
     */
    public Integer getMaxReplicaCount() {
        return maxReplicaCount;
    }

    public void setMaxReplicaCount(Integer maxReplicaCount) {
        this.maxReplicaCount = maxReplicaCount;
    }

    public ConfigurationRequestDataSpec withMinReplicaCount(Integer minReplicaCount) {
        this.minReplicaCount = minReplicaCount;
        return this;
    }

    /**
     * 伸缩策略配置最小伸缩个数。  type为\"scaling\"时，配置此参数。 
     * @return minReplicaCount
     */
    public Integer getMinReplicaCount() {
        return minReplicaCount;
    }

    public void setMinReplicaCount(Integer minReplicaCount) {
        this.minReplicaCount = minReplicaCount;
    }

    public ConfigurationRequestDataSpec withAdvanced(ScaleConfigurationDataAdvanced advanced) {
        this.advanced = advanced;
        return this;
    }

    public ConfigurationRequestDataSpec withAdvanced(Consumer<ScaleConfigurationDataAdvanced> advancedSetter) {
        if (this.advanced == null) {
            this.advanced = new ScaleConfigurationDataAdvanced();
            advancedSetter.accept(this.advanced);
        }

        return this;
    }

    /**
     * Get advanced
     * @return advanced
     */
    public ScaleConfigurationDataAdvanced getAdvanced() {
        return advanced;
    }

    public void setAdvanced(ScaleConfigurationDataAdvanced advanced) {
        this.advanced = advanced;
    }

    public ConfigurationRequestDataSpec withTriggers(List<ScaleConfigurationDataTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public ConfigurationRequestDataSpec addTriggersItem(ScaleConfigurationDataTrigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public ConfigurationRequestDataSpec withTriggers(Consumer<List<ScaleConfigurationDataTrigger>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /**
     * 伸缩策略配置触发器列表。  type为\"scaling\"时，配置此参数。 
     * @return triggers
     */
    public List<ScaleConfigurationDataTrigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<ScaleConfigurationDataTrigger> triggers) {
        this.triggers = triggers;
    }

    public ConfigurationRequestDataSpec withVolumes(List<VolumeConfigurationDataVolume> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ConfigurationRequestDataSpec addVolumesItem(VolumeConfigurationDataVolume volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ConfigurationRequestDataSpec withVolumes(Consumer<List<VolumeConfigurationDataVolume>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 云存储配置列表。  type为\"volume\"时，配置此参数。 
     * @return volumes
     */
    public List<VolumeConfigurationDataVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<VolumeConfigurationDataVolume> volumes) {
        this.volumes = volumes;
    }

    public ConfigurationRequestDataSpec withLivenessProbe(HealthCheckConfigurationLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public ConfigurationRequestDataSpec withLivenessProbe(
        Consumer<HealthCheckConfigurationLivenessProbe> livenessProbeSetter) {
        if (this.livenessProbe == null) {
            this.livenessProbe = new HealthCheckConfigurationLivenessProbe();
            livenessProbeSetter.accept(this.livenessProbe);
        }

        return this;
    }

    /**
     * Get livenessProbe
     * @return livenessProbe
     */
    public HealthCheckConfigurationLivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(HealthCheckConfigurationLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public ConfigurationRequestDataSpec withStartupProbe(HealthCheckConfigurationStartupProbe startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }

    public ConfigurationRequestDataSpec withStartupProbe(
        Consumer<HealthCheckConfigurationStartupProbe> startupProbeSetter) {
        if (this.startupProbe == null) {
            this.startupProbe = new HealthCheckConfigurationStartupProbe();
            startupProbeSetter.accept(this.startupProbe);
        }

        return this;
    }

    /**
     * Get startupProbe
     * @return startupProbe
     */
    public HealthCheckConfigurationStartupProbe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(HealthCheckConfigurationStartupProbe startupProbe) {
        this.startupProbe = startupProbe;
    }

    public ConfigurationRequestDataSpec withReadinessProbe(HealthCheckConfigurationReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public ConfigurationRequestDataSpec withReadinessProbe(
        Consumer<HealthCheckConfigurationReadinessProbe> readinessProbeSetter) {
        if (this.readinessProbe == null) {
            this.readinessProbe = new HealthCheckConfigurationReadinessProbe();
            readinessProbeSetter.accept(this.readinessProbe);
        }

        return this;
    }

    /**
     * Get readinessProbe
     * @return readinessProbe
     */
    public HealthCheckConfigurationReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(HealthCheckConfigurationReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public ConfigurationRequestDataSpec withPostStart(ConfigurationRequestDataSpecPostStart postStart) {
        this.postStart = postStart;
        return this;
    }

    public ConfigurationRequestDataSpec withPostStart(Consumer<ConfigurationRequestDataSpecPostStart> postStartSetter) {
        if (this.postStart == null) {
            this.postStart = new ConfigurationRequestDataSpecPostStart();
            postStartSetter.accept(this.postStart);
        }

        return this;
    }

    /**
     * Get postStart
     * @return postStart
     */
    public ConfigurationRequestDataSpecPostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(ConfigurationRequestDataSpecPostStart postStart) {
        this.postStart = postStart;
    }

    public ConfigurationRequestDataSpec withPreStop(ConfigurationRequestDataSpecPreStop preStop) {
        this.preStop = preStop;
        return this;
    }

    public ConfigurationRequestDataSpec withPreStop(Consumer<ConfigurationRequestDataSpecPreStop> preStopSetter) {
        if (this.preStop == null) {
            this.preStop = new ConfigurationRequestDataSpecPreStop();
            preStopSetter.accept(this.preStop);
        }

        return this;
    }

    /**
     * Get preStop
     * @return preStop
     */
    public ConfigurationRequestDataSpecPreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(ConfigurationRequestDataSpecPreStop preStop) {
        this.preStop = preStop;
    }

    public ConfigurationRequestDataSpec withLogPaths(List<String> logPaths) {
        this.logPaths = logPaths;
        return this;
    }

    public ConfigurationRequestDataSpec addLogPathsItem(String logPathsItem) {
        if (this.logPaths == null) {
            this.logPaths = new ArrayList<>();
        }
        this.logPaths.add(logPathsItem);
        return this;
    }

    public ConfigurationRequestDataSpec withLogPaths(Consumer<List<String>> logPathsSetter) {
        if (this.logPaths == null) {
            this.logPaths = new ArrayList<>();
        }
        logPathsSetter.accept(this.logPaths);
        return this;
    }

    /**
     * 自定义日志路径数组。  type为\"log\"时，配置此参数。 
     * @return logPaths
     */
    public List<String> getLogPaths() {
        return logPaths;
    }

    public void setLogPaths(List<String> logPaths) {
        this.logPaths = logPaths;
    }

    public ConfigurationRequestDataSpec withInstrumentation(String instrumentation) {
        this.instrumentation = instrumentation;
        return this;
    }

    /**
     * 探针注入方式。  type为\"apm2\"时，配置此参数。 
     * @return instrumentation
     */
    public String getInstrumentation() {
        return instrumentation;
    }

    public void setInstrumentation(String instrumentation) {
        this.instrumentation = instrumentation;
    }

    public ConfigurationRequestDataSpec withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 自定义监控指标配置采集路径。  type为\"customMetric\"时，配置此参数。 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ConfigurationRequestDataSpec withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 自定义监控指标配置采集端口。  type为\"customMetric\"时，配置此参数。 
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public ConfigurationRequestDataSpec withMetrics(List<String> metrics) {
        this.metrics = metrics;
        return this;
    }

    public ConfigurationRequestDataSpec addMetricsItem(String metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public ConfigurationRequestDataSpec withMetrics(Consumer<List<String>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 自定义监控指标配置指标名称。  type为\"customMetric\"时，配置此参数。 
     * @return metrics
     */
    public List<String> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationRequestDataSpec that = (ConfigurationRequestDataSpec) obj;
        return Objects.equals(this.rdsId, that.rdsId) && Objects.equals(this.rdsDbName, that.rdsDbName)
            && Objects.equals(this.rdsAddress, that.rdsAddress) && Objects.equals(this.rdsUsername, that.rdsUsername)
            && Objects.equals(this.rdsPassword, that.rdsPassword) && Objects.equals(this.rdsPort, that.rdsPort)
            && Objects.equals(this.configCenterAddr, that.configCenterAddr)
            && Objects.equals(this.serviceCenterAddr, that.serviceCenterAddr) && Objects.equals(this.cseId, that.cseId)
            && Objects.equals(this.envs, that.envs) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.items, that.items) && Objects.equals(this.scaleStrategy, that.scaleStrategy)
            && Objects.equals(this.maxReplicaCount, that.maxReplicaCount)
            && Objects.equals(this.minReplicaCount, that.minReplicaCount)
            && Objects.equals(this.advanced, that.advanced) && Objects.equals(this.triggers, that.triggers)
            && Objects.equals(this.volumes, that.volumes) && Objects.equals(this.livenessProbe, that.livenessProbe)
            && Objects.equals(this.startupProbe, that.startupProbe)
            && Objects.equals(this.readinessProbe, that.readinessProbe)
            && Objects.equals(this.postStart, that.postStart) && Objects.equals(this.preStop, that.preStop)
            && Objects.equals(this.logPaths, that.logPaths)
            && Objects.equals(this.instrumentation, that.instrumentation) && Objects.equals(this.path, that.path)
            && Objects.equals(this.port, that.port) && Objects.equals(this.metrics, that.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rdsId,
            rdsDbName,
            rdsAddress,
            rdsUsername,
            rdsPassword,
            rdsPort,
            configCenterAddr,
            serviceCenterAddr,
            cseId,
            envs,
            ip,
            items,
            scaleStrategy,
            maxReplicaCount,
            minReplicaCount,
            advanced,
            triggers,
            volumes,
            livenessProbe,
            startupProbe,
            readinessProbe,
            postStart,
            preStop,
            logPaths,
            instrumentation,
            path,
            port,
            metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationRequestDataSpec {\n");
        sb.append("    rdsId: ").append(toIndentedString(rdsId)).append("\n");
        sb.append("    rdsDbName: ").append(toIndentedString(rdsDbName)).append("\n");
        sb.append("    rdsAddress: ").append(toIndentedString(rdsAddress)).append("\n");
        sb.append("    rdsUsername: ").append(toIndentedString(rdsUsername)).append("\n");
        sb.append("    rdsPassword: ").append(toIndentedString(rdsPassword)).append("\n");
        sb.append("    rdsPort: ").append(toIndentedString(rdsPort)).append("\n");
        sb.append("    configCenterAddr: ").append(toIndentedString(configCenterAddr)).append("\n");
        sb.append("    serviceCenterAddr: ").append(toIndentedString(serviceCenterAddr)).append("\n");
        sb.append("    cseId: ").append(toIndentedString(cseId)).append("\n");
        sb.append("    envs: ").append(toIndentedString(envs)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    scaleStrategy: ").append(toIndentedString(scaleStrategy)).append("\n");
        sb.append("    maxReplicaCount: ").append(toIndentedString(maxReplicaCount)).append("\n");
        sb.append("    minReplicaCount: ").append(toIndentedString(minReplicaCount)).append("\n");
        sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
        sb.append("    startupProbe: ").append(toIndentedString(startupProbe)).append("\n");
        sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
        sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
        sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
        sb.append("    logPaths: ").append(toIndentedString(logPaths)).append("\n");
        sb.append("    instrumentation: ").append(toIndentedString(instrumentation)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
