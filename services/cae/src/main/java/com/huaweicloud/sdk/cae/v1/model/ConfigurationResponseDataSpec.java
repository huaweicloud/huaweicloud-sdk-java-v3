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
public class ConfigurationResponseDataSpec {

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
     * 伸缩策略配置策略类型。  Configuration.type为\"scaling\"时，返回此参数。 
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

    private ConfigurationResponseDataSpecPostStart postStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preStop")

    private ConfigurationResponseDataSpecPreStop preStop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_paths")

    private List<String> logPaths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instrumentation")

    private String instrumentation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apm_application")

    private String apmApplication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_name")

    private String envName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_pull_policy")

    private String imagePullPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_value")

    private String accessValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business")

    private String business;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<String> metrics = null;

    public ConfigurationResponseDataSpec withRdsId(String rdsId) {
        this.rdsId = rdsId;
        return this;
    }

    /**
     * RDS数据库实例ID。  Configuration.type为\"rds\"时，返回此参数。 
     * @return rdsId
     */
    public String getRdsId() {
        return rdsId;
    }

    public void setRdsId(String rdsId) {
        this.rdsId = rdsId;
    }

    public ConfigurationResponseDataSpec withRdsDbName(String rdsDbName) {
        this.rdsDbName = rdsDbName;
        return this;
    }

    /**
     * RDS数据库名称。  Configuration.type为\"rds\"时，返回此参数。 
     * @return rdsDbName
     */
    public String getRdsDbName() {
        return rdsDbName;
    }

    public void setRdsDbName(String rdsDbName) {
        this.rdsDbName = rdsDbName;
    }

    public ConfigurationResponseDataSpec withRdsAddress(String rdsAddress) {
        this.rdsAddress = rdsAddress;
        return this;
    }

    /**
     * RDS数据库地址。  Configuration.type为\"rds\"时，返回此参数。 
     * @return rdsAddress
     */
    public String getRdsAddress() {
        return rdsAddress;
    }

    public void setRdsAddress(String rdsAddress) {
        this.rdsAddress = rdsAddress;
    }

    public ConfigurationResponseDataSpec withRdsUsername(String rdsUsername) {
        this.rdsUsername = rdsUsername;
        return this;
    }

    /**
     * RDS数据库用户名称。  Configuration.type为\"rds\"时，返回此参数。 
     * @return rdsUsername
     */
    public String getRdsUsername() {
        return rdsUsername;
    }

    public void setRdsUsername(String rdsUsername) {
        this.rdsUsername = rdsUsername;
    }

    public ConfigurationResponseDataSpec withRdsPassword(String rdsPassword) {
        this.rdsPassword = rdsPassword;
        return this;
    }

    /**
     * RDS数据库密码。  Configuration.type为\"rds\"时，返回此参数。 
     * @return rdsPassword
     */
    public String getRdsPassword() {
        return rdsPassword;
    }

    public void setRdsPassword(String rdsPassword) {
        this.rdsPassword = rdsPassword;
    }

    public ConfigurationResponseDataSpec withRdsPort(String rdsPort) {
        this.rdsPort = rdsPort;
        return this;
    }

    /**
     * RDS数据库端口。  Configuration.type为\"rds\"时，返回此参数。 
     * @return rdsPort
     */
    public String getRdsPort() {
        return rdsPort;
    }

    public void setRdsPort(String rdsPort) {
        this.rdsPort = rdsPort;
    }

    public ConfigurationResponseDataSpec withConfigCenterAddr(String configCenterAddr) {
        this.configCenterAddr = configCenterAddr;
        return this;
    }

    /**
     * CSE配置中心地址。  Configuration.type为\"cse\"时，返回此参数。 
     * @return configCenterAddr
     */
    public String getConfigCenterAddr() {
        return configCenterAddr;
    }

    public void setConfigCenterAddr(String configCenterAddr) {
        this.configCenterAddr = configCenterAddr;
    }

    public ConfigurationResponseDataSpec withServiceCenterAddr(String serviceCenterAddr) {
        this.serviceCenterAddr = serviceCenterAddr;
        return this;
    }

    /**
     * CSE服务注册发现地址。  Configuration.type为\"cse\"时，返回此参数。 
     * @return serviceCenterAddr
     */
    public String getServiceCenterAddr() {
        return serviceCenterAddr;
    }

    public void setServiceCenterAddr(String serviceCenterAddr) {
        this.serviceCenterAddr = serviceCenterAddr;
    }

    public ConfigurationResponseDataSpec withCseId(String cseId) {
        this.cseId = cseId;
        return this;
    }

    /**
     * CSE引擎ID。  Configuration.type为\"cse\"时，返回此参数。 
     * @return cseId
     */
    public String getCseId() {
        return cseId;
    }

    public void setCseId(String cseId) {
        this.cseId = cseId;
    }

    public ConfigurationResponseDataSpec withEnvs(Map<String, String> envs) {
        this.envs = envs;
        return this;
    }

    public ConfigurationResponseDataSpec putEnvsItem(String key, String envsItem) {
        if (this.envs == null) {
            this.envs = new HashMap<>();
        }
        this.envs.put(key, envsItem);
        return this;
    }

    public ConfigurationResponseDataSpec withEnvs(Consumer<Map<String, String>> envsSetter) {
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

    public ConfigurationResponseDataSpec withIp(String ip) {
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

    public ConfigurationResponseDataSpec withItems(List<AccessConfigurationDataItems> items) {
        this.items = items;
        return this;
    }

    public ConfigurationResponseDataSpec addItemsItem(AccessConfigurationDataItems itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ConfigurationResponseDataSpec withItems(Consumer<List<AccessConfigurationDataItems>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 访问方式配置列表。  Configuration.type为\"access\"时，返回此参数。 
     * @return items
     */
    public List<AccessConfigurationDataItems> getItems() {
        return items;
    }

    public void setItems(List<AccessConfigurationDataItems> items) {
        this.items = items;
    }

    public ConfigurationResponseDataSpec withScaleStrategy(ScaleStrategyEnum scaleStrategy) {
        this.scaleStrategy = scaleStrategy;
        return this;
    }

    /**
     * 伸缩策略配置策略类型。  Configuration.type为\"scaling\"时，返回此参数。 
     * @return scaleStrategy
     */
    public ScaleStrategyEnum getScaleStrategy() {
        return scaleStrategy;
    }

    public void setScaleStrategy(ScaleStrategyEnum scaleStrategy) {
        this.scaleStrategy = scaleStrategy;
    }

    public ConfigurationResponseDataSpec withMaxReplicaCount(Integer maxReplicaCount) {
        this.maxReplicaCount = maxReplicaCount;
        return this;
    }

    /**
     * 伸缩策略配置最大伸缩个数。  Configuration.type为\"scaling\"时，返回此参数。 
     * @return maxReplicaCount
     */
    public Integer getMaxReplicaCount() {
        return maxReplicaCount;
    }

    public void setMaxReplicaCount(Integer maxReplicaCount) {
        this.maxReplicaCount = maxReplicaCount;
    }

    public ConfigurationResponseDataSpec withMinReplicaCount(Integer minReplicaCount) {
        this.minReplicaCount = minReplicaCount;
        return this;
    }

    /**
     * 伸缩策略配置最小伸缩个数。  Configuration.type为\"scaling\"时，返回此参数。 
     * @return minReplicaCount
     */
    public Integer getMinReplicaCount() {
        return minReplicaCount;
    }

    public void setMinReplicaCount(Integer minReplicaCount) {
        this.minReplicaCount = minReplicaCount;
    }

    public ConfigurationResponseDataSpec withAdvanced(ScaleConfigurationDataAdvanced advanced) {
        this.advanced = advanced;
        return this;
    }

    public ConfigurationResponseDataSpec withAdvanced(Consumer<ScaleConfigurationDataAdvanced> advancedSetter) {
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

    public ConfigurationResponseDataSpec withTriggers(List<ScaleConfigurationDataTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public ConfigurationResponseDataSpec addTriggersItem(ScaleConfigurationDataTrigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public ConfigurationResponseDataSpec withTriggers(Consumer<List<ScaleConfigurationDataTrigger>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /**
     * 伸缩策略配置触发器列表。  Configuration.type为\"scaling\"时，返回此参数。 
     * @return triggers
     */
    public List<ScaleConfigurationDataTrigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<ScaleConfigurationDataTrigger> triggers) {
        this.triggers = triggers;
    }

    public ConfigurationResponseDataSpec withVolumes(List<VolumeConfigurationDataVolume> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ConfigurationResponseDataSpec addVolumesItem(VolumeConfigurationDataVolume volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ConfigurationResponseDataSpec withVolumes(Consumer<List<VolumeConfigurationDataVolume>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 云存储配置列表。  Configuration.type为\"volume\"时，返回此参数。 
     * @return volumes
     */
    public List<VolumeConfigurationDataVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<VolumeConfigurationDataVolume> volumes) {
        this.volumes = volumes;
    }

    public ConfigurationResponseDataSpec withLivenessProbe(HealthCheckConfigurationLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public ConfigurationResponseDataSpec withLivenessProbe(
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

    public ConfigurationResponseDataSpec withStartupProbe(HealthCheckConfigurationStartupProbe startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }

    public ConfigurationResponseDataSpec withStartupProbe(
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

    public ConfigurationResponseDataSpec withReadinessProbe(HealthCheckConfigurationReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public ConfigurationResponseDataSpec withReadinessProbe(
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

    public ConfigurationResponseDataSpec withPostStart(ConfigurationResponseDataSpecPostStart postStart) {
        this.postStart = postStart;
        return this;
    }

    public ConfigurationResponseDataSpec withPostStart(
        Consumer<ConfigurationResponseDataSpecPostStart> postStartSetter) {
        if (this.postStart == null) {
            this.postStart = new ConfigurationResponseDataSpecPostStart();
            postStartSetter.accept(this.postStart);
        }

        return this;
    }

    /**
     * Get postStart
     * @return postStart
     */
    public ConfigurationResponseDataSpecPostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(ConfigurationResponseDataSpecPostStart postStart) {
        this.postStart = postStart;
    }

    public ConfigurationResponseDataSpec withPreStop(ConfigurationResponseDataSpecPreStop preStop) {
        this.preStop = preStop;
        return this;
    }

    public ConfigurationResponseDataSpec withPreStop(Consumer<ConfigurationResponseDataSpecPreStop> preStopSetter) {
        if (this.preStop == null) {
            this.preStop = new ConfigurationResponseDataSpecPreStop();
            preStopSetter.accept(this.preStop);
        }

        return this;
    }

    /**
     * Get preStop
     * @return preStop
     */
    public ConfigurationResponseDataSpecPreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(ConfigurationResponseDataSpecPreStop preStop) {
        this.preStop = preStop;
    }

    public ConfigurationResponseDataSpec withLogPaths(List<String> logPaths) {
        this.logPaths = logPaths;
        return this;
    }

    public ConfigurationResponseDataSpec addLogPathsItem(String logPathsItem) {
        if (this.logPaths == null) {
            this.logPaths = new ArrayList<>();
        }
        this.logPaths.add(logPathsItem);
        return this;
    }

    public ConfigurationResponseDataSpec withLogPaths(Consumer<List<String>> logPathsSetter) {
        if (this.logPaths == null) {
            this.logPaths = new ArrayList<>();
        }
        logPathsSetter.accept(this.logPaths);
        return this;
    }

    /**
     * 自定义日志路径数组。  Configuration.type为\"log\"时，返回此参数。 
     * @return logPaths
     */
    public List<String> getLogPaths() {
        return logPaths;
    }

    public void setLogPaths(List<String> logPaths) {
        this.logPaths = logPaths;
    }

    public ConfigurationResponseDataSpec withInstrumentation(String instrumentation) {
        this.instrumentation = instrumentation;
        return this;
    }

    /**
     * 探针注入方式。  Configuration.type为\"apm2\"时，返回此参数。 
     * @return instrumentation
     */
    public String getInstrumentation() {
        return instrumentation;
    }

    public void setInstrumentation(String instrumentation) {
        this.instrumentation = instrumentation;
    }

    public ConfigurationResponseDataSpec withApmApplication(String apmApplication) {
        this.apmApplication = apmApplication;
        return this;
    }

    /**
     * apm2应用。  Configuration.type为\"apm2\"时，返回此参数。 
     * @return apmApplication
     */
    public String getApmApplication() {
        return apmApplication;
    }

    public void setApmApplication(String apmApplication) {
        this.apmApplication = apmApplication;
    }

    public ConfigurationResponseDataSpec withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 监控系统类别，包括apm2和opentelemetry。  Configuration.type为\"apm2\"时，返回此参数。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ConfigurationResponseDataSpec withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * apm2组件。  Configuration.type为\"apm2\"时，返回此参数。 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public ConfigurationResponseDataSpec withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * apm2实例。  Configuration.type为\"apm2\"时，返回此参数。 
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ConfigurationResponseDataSpec withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    /**
     * apm2环境。  Configuration.type为\"apm2\"时，返回此参数。 
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public ConfigurationResponseDataSpec withImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    /**
     * 探针镜像更新策略，已废弃，迁移到监控系统。  - Always，重启自动升级：每次都尝试重新下载镜像。 - IfNotPresent，手动升级: 如果本地有该镜像，则继续使用本地镜像，不下载镜像。  Configuration.type为\"apm2\"时，返回此参数。 
     * @return imagePullPolicy
     */
    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public ConfigurationResponseDataSpec withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 增强型探针/opentelemetry探针版本，已废弃，迁移到监控系统。  Configuration.type为\"apm2\"时，返回此参数。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ConfigurationResponseDataSpec withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * apm2访问密钥Key，已废弃，迁移到监控系统。  Configuration.type为\"apm2\"时，返回此参数。 
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public ConfigurationResponseDataSpec withAccessValue(String accessValue) {
        this.accessValue = accessValue;
        return this;
    }

    /**
     * apm2访问密钥value，已废弃，迁移到监控系统。  Configuration.type为\"apm2\"时，返回此参数。 
     * @return accessValue
     */
    public String getAccessValue() {
        return accessValue;
    }

    public void setAccessValue(String accessValue) {
        this.accessValue = accessValue;
    }

    public ConfigurationResponseDataSpec withBusiness(String business) {
        this.business = business;
        return this;
    }

    /**
     * apm2应用，同apm_application，已废弃。  Configuration.type为\"apm2\"时，返回此参数。 
     * @return business
     */
    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public ConfigurationResponseDataSpec withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 自定义监控指标配置采集路径。  Configuration.type为\"customMetric\"时，返回此参数。 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ConfigurationResponseDataSpec withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 自定义监控指标配置采集端口。  Configuration.type为\"customMetric\"时，返回此参数。 
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public ConfigurationResponseDataSpec withMetrics(List<String> metrics) {
        this.metrics = metrics;
        return this;
    }

    public ConfigurationResponseDataSpec addMetricsItem(String metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public ConfigurationResponseDataSpec withMetrics(Consumer<List<String>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 自定义监控指标配置指标名称。  Configuration.type为\"customMetric\"时，返回此参数。 
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
        ConfigurationResponseDataSpec that = (ConfigurationResponseDataSpec) obj;
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
            && Objects.equals(this.instrumentation, that.instrumentation)
            && Objects.equals(this.apmApplication, that.apmApplication) && Objects.equals(this.type, that.type)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.envName, that.envName) && Objects.equals(this.imagePullPolicy, that.imagePullPolicy)
            && Objects.equals(this.version, that.version) && Objects.equals(this.accessKey, that.accessKey)
            && Objects.equals(this.accessValue, that.accessValue) && Objects.equals(this.business, that.business)
            && Objects.equals(this.path, that.path) && Objects.equals(this.port, that.port)
            && Objects.equals(this.metrics, that.metrics);
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
            apmApplication,
            type,
            appName,
            instanceName,
            envName,
            imagePullPolicy,
            version,
            accessKey,
            accessValue,
            business,
            path,
            port,
            metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationResponseDataSpec {\n");
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
        sb.append("    apmApplication: ").append(toIndentedString(apmApplication)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    accessValue: ").append(toIndentedString(accessValue)).append("\n");
        sb.append("    business: ").append(toIndentedString(business)).append("\n");
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
