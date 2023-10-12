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
public class ConfigurationDataSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

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
    @JsonProperty(value = "items")

    private List<AccessConfigurationDataItems> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_replica_count")

    private Integer maxReplicaCount;

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

    private ConfigurationDataSpecPostStart postStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preStop")

    private ConfigurationDataSpecPreStop preStop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_paths")

    private List<Object> logPaths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_value")

    private String accessValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business")

    private String business;

    /**
     * 性能管理配置升级策略。 - 重启自动升级：每次都尝试重新下载镜像。 - 手动升级: 如果本地有该镜像，则继续使用本地镜像，不下载镜像。
     */
    public static final class ImagePullPolicyEnum {

        /**
         * Enum ALWAYS for value: "Always"
         */
        public static final ImagePullPolicyEnum ALWAYS = new ImagePullPolicyEnum("Always");

        /**
         * Enum IFNOTPRESENT for value: "IfNotPresent"
         */
        public static final ImagePullPolicyEnum IFNOTPRESENT = new ImagePullPolicyEnum("IfNotPresent");

        private static final Map<String, ImagePullPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImagePullPolicyEnum> createStaticFields() {
            Map<String, ImagePullPolicyEnum> map = new HashMap<>();
            map.put("Always", ALWAYS);
            map.put("IfNotPresent", IFNOTPRESENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImagePullPolicyEnum(String value) {
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
        public static ImagePullPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImagePullPolicyEnum(value));
        }

        public static ImagePullPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImagePullPolicyEnum) {
                return this.value.equals(((ImagePullPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_pull_policy")

    private ImagePullPolicyEnum imagePullPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<Object> metrics = null;

    public ConfigurationDataSpec withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 弹性公网IP。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ConfigurationDataSpec withRdsId(String rdsId) {
        this.rdsId = rdsId;
        return this;
    }

    /**
     * RDS数据库实例ID。
     * @return rdsId
     */
    public String getRdsId() {
        return rdsId;
    }

    public void setRdsId(String rdsId) {
        this.rdsId = rdsId;
    }

    public ConfigurationDataSpec withRdsDbName(String rdsDbName) {
        this.rdsDbName = rdsDbName;
        return this;
    }

    /**
     * RDS数据库名称。
     * @return rdsDbName
     */
    public String getRdsDbName() {
        return rdsDbName;
    }

    public void setRdsDbName(String rdsDbName) {
        this.rdsDbName = rdsDbName;
    }

    public ConfigurationDataSpec withRdsAddress(String rdsAddress) {
        this.rdsAddress = rdsAddress;
        return this;
    }

    /**
     * RDS数据库地址。
     * @return rdsAddress
     */
    public String getRdsAddress() {
        return rdsAddress;
    }

    public void setRdsAddress(String rdsAddress) {
        this.rdsAddress = rdsAddress;
    }

    public ConfigurationDataSpec withRdsUsername(String rdsUsername) {
        this.rdsUsername = rdsUsername;
        return this;
    }

    /**
     * RDS数据库用户名称。
     * @return rdsUsername
     */
    public String getRdsUsername() {
        return rdsUsername;
    }

    public void setRdsUsername(String rdsUsername) {
        this.rdsUsername = rdsUsername;
    }

    public ConfigurationDataSpec withRdsPassword(String rdsPassword) {
        this.rdsPassword = rdsPassword;
        return this;
    }

    /**
     * RDS数据库密码。
     * @return rdsPassword
     */
    public String getRdsPassword() {
        return rdsPassword;
    }

    public void setRdsPassword(String rdsPassword) {
        this.rdsPassword = rdsPassword;
    }

    public ConfigurationDataSpec withRdsPort(String rdsPort) {
        this.rdsPort = rdsPort;
        return this;
    }

    /**
     * RDS数据库端口
     * @return rdsPort
     */
    public String getRdsPort() {
        return rdsPort;
    }

    public void setRdsPort(String rdsPort) {
        this.rdsPort = rdsPort;
    }

    public ConfigurationDataSpec withConfigCenterAddr(String configCenterAddr) {
        this.configCenterAddr = configCenterAddr;
        return this;
    }

    /**
     * CSE配置中心地址。
     * @return configCenterAddr
     */
    public String getConfigCenterAddr() {
        return configCenterAddr;
    }

    public void setConfigCenterAddr(String configCenterAddr) {
        this.configCenterAddr = configCenterAddr;
    }

    public ConfigurationDataSpec withServiceCenterAddr(String serviceCenterAddr) {
        this.serviceCenterAddr = serviceCenterAddr;
        return this;
    }

    /**
     * CSE服务注册发现地址。
     * @return serviceCenterAddr
     */
    public String getServiceCenterAddr() {
        return serviceCenterAddr;
    }

    public void setServiceCenterAddr(String serviceCenterAddr) {
        this.serviceCenterAddr = serviceCenterAddr;
    }

    public ConfigurationDataSpec withCseId(String cseId) {
        this.cseId = cseId;
        return this;
    }

    /**
     * CSE引擎ID。
     * @return cseId
     */
    public String getCseId() {
        return cseId;
    }

    public void setCseId(String cseId) {
        this.cseId = cseId;
    }

    public ConfigurationDataSpec withEnvs(Map<String, String> envs) {
        this.envs = envs;
        return this;
    }

    public ConfigurationDataSpec putEnvsItem(String key, String envsItem) {
        if (this.envs == null) {
            this.envs = new HashMap<>();
        }
        this.envs.put(key, envsItem);
        return this;
    }

    public ConfigurationDataSpec withEnvs(Consumer<Map<String, String>> envsSetter) {
        if (this.envs == null) {
            this.envs = new HashMap<>();
        }
        envsSetter.accept(this.envs);
        return this;
    }

    /**
     * 环境变量配置，常用环境变量如下。 - TZ: 时区设置，东八区可设置为Asia/Shanghai。 - LANG: 语言字符集设置，中文UTF8可设置为zh_CN.UTF-8。
     * @return envs
     */
    public Map<String, String> getEnvs() {
        return envs;
    }

    public void setEnvs(Map<String, String> envs) {
        this.envs = envs;
    }

    public ConfigurationDataSpec withItems(List<AccessConfigurationDataItems> items) {
        this.items = items;
        return this;
    }

    public ConfigurationDataSpec addItemsItem(AccessConfigurationDataItems itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ConfigurationDataSpec withItems(Consumer<List<AccessConfigurationDataItems>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 访问方式配置列表。
     * @return items
     */
    public List<AccessConfigurationDataItems> getItems() {
        return items;
    }

    public void setItems(List<AccessConfigurationDataItems> items) {
        this.items = items;
    }

    public ConfigurationDataSpec withMaxReplicaCount(Integer maxReplicaCount) {
        this.maxReplicaCount = maxReplicaCount;
        return this;
    }

    /**
     * 伸缩策略配置最大伸缩个数。
     * @return maxReplicaCount
     */
    public Integer getMaxReplicaCount() {
        return maxReplicaCount;
    }

    public void setMaxReplicaCount(Integer maxReplicaCount) {
        this.maxReplicaCount = maxReplicaCount;
    }

    public ConfigurationDataSpec withTriggers(List<ScaleConfigurationDataTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public ConfigurationDataSpec addTriggersItem(ScaleConfigurationDataTrigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public ConfigurationDataSpec withTriggers(Consumer<List<ScaleConfigurationDataTrigger>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /**
     * 伸缩策略配置触发器列表。
     * @return triggers
     */
    public List<ScaleConfigurationDataTrigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<ScaleConfigurationDataTrigger> triggers) {
        this.triggers = triggers;
    }

    public ConfigurationDataSpec withVolumes(List<VolumeConfigurationDataVolume> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ConfigurationDataSpec addVolumesItem(VolumeConfigurationDataVolume volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ConfigurationDataSpec withVolumes(Consumer<List<VolumeConfigurationDataVolume>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 云存储配置列表。
     * @return volumes
     */
    public List<VolumeConfigurationDataVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<VolumeConfigurationDataVolume> volumes) {
        this.volumes = volumes;
    }

    public ConfigurationDataSpec withLivenessProbe(HealthCheckConfigurationLivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public ConfigurationDataSpec withLivenessProbe(
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

    public ConfigurationDataSpec withStartupProbe(HealthCheckConfigurationStartupProbe startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }

    public ConfigurationDataSpec withStartupProbe(Consumer<HealthCheckConfigurationStartupProbe> startupProbeSetter) {
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

    public ConfigurationDataSpec withReadinessProbe(HealthCheckConfigurationReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    public ConfigurationDataSpec withReadinessProbe(
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

    public ConfigurationDataSpec withPostStart(ConfigurationDataSpecPostStart postStart) {
        this.postStart = postStart;
        return this;
    }

    public ConfigurationDataSpec withPostStart(Consumer<ConfigurationDataSpecPostStart> postStartSetter) {
        if (this.postStart == null) {
            this.postStart = new ConfigurationDataSpecPostStart();
            postStartSetter.accept(this.postStart);
        }

        return this;
    }

    /**
     * Get postStart
     * @return postStart
     */
    public ConfigurationDataSpecPostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(ConfigurationDataSpecPostStart postStart) {
        this.postStart = postStart;
    }

    public ConfigurationDataSpec withPreStop(ConfigurationDataSpecPreStop preStop) {
        this.preStop = preStop;
        return this;
    }

    public ConfigurationDataSpec withPreStop(Consumer<ConfigurationDataSpecPreStop> preStopSetter) {
        if (this.preStop == null) {
            this.preStop = new ConfigurationDataSpecPreStop();
            preStopSetter.accept(this.preStop);
        }

        return this;
    }

    /**
     * Get preStop
     * @return preStop
     */
    public ConfigurationDataSpecPreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(ConfigurationDataSpecPreStop preStop) {
        this.preStop = preStop;
    }

    public ConfigurationDataSpec withLogPaths(List<Object> logPaths) {
        this.logPaths = logPaths;
        return this;
    }

    public ConfigurationDataSpec addLogPathsItem(Object logPathsItem) {
        if (this.logPaths == null) {
            this.logPaths = new ArrayList<>();
        }
        this.logPaths.add(logPathsItem);
        return this;
    }

    public ConfigurationDataSpec withLogPaths(Consumer<List<Object>> logPathsSetter) {
        if (this.logPaths == null) {
            this.logPaths = new ArrayList<>();
        }
        logPathsSetter.accept(this.logPaths);
        return this;
    }

    /**
     * 自定义日志路径。
     * @return logPaths
     */
    public List<Object> getLogPaths() {
        return logPaths;
    }

    public void setLogPaths(List<Object> logPaths) {
        this.logPaths = logPaths;
    }

    public ConfigurationDataSpec withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * 性能管理配置访问密钥Key。
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public ConfigurationDataSpec withAccessValue(String accessValue) {
        this.accessValue = accessValue;
        return this;
    }

    /**
     * 性能管理配置访问密钥value。
     * @return accessValue
     */
    public String getAccessValue() {
        return accessValue;
    }

    public void setAccessValue(String accessValue) {
        this.accessValue = accessValue;
    }

    public ConfigurationDataSpec withBusiness(String business) {
        this.business = business;
        return this;
    }

    /**
     * 性能管理配置应用。
     * @return business
     */
    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public ConfigurationDataSpec withImagePullPolicy(ImagePullPolicyEnum imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    /**
     * 性能管理配置升级策略。 - 重启自动升级：每次都尝试重新下载镜像。 - 手动升级: 如果本地有该镜像，则继续使用本地镜像，不下载镜像。
     * @return imagePullPolicy
     */
    public ImagePullPolicyEnum getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(ImagePullPolicyEnum imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public ConfigurationDataSpec withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 性能管理配置探针版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ConfigurationDataSpec withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 自定义监控指标配置采集路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ConfigurationDataSpec withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 自定义监控指标配置采集端口。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public ConfigurationDataSpec withMetrics(List<Object> metrics) {
        this.metrics = metrics;
        return this;
    }

    public ConfigurationDataSpec addMetricsItem(Object metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public ConfigurationDataSpec withMetrics(Consumer<List<Object>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 自定义监控指标配置指标名称。
     * @return metrics
     */
    public List<Object> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<Object> metrics) {
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
        ConfigurationDataSpec that = (ConfigurationDataSpec) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.rdsId, that.rdsId)
            && Objects.equals(this.rdsDbName, that.rdsDbName) && Objects.equals(this.rdsAddress, that.rdsAddress)
            && Objects.equals(this.rdsUsername, that.rdsUsername) && Objects.equals(this.rdsPassword, that.rdsPassword)
            && Objects.equals(this.rdsPort, that.rdsPort)
            && Objects.equals(this.configCenterAddr, that.configCenterAddr)
            && Objects.equals(this.serviceCenterAddr, that.serviceCenterAddr) && Objects.equals(this.cseId, that.cseId)
            && Objects.equals(this.envs, that.envs) && Objects.equals(this.items, that.items)
            && Objects.equals(this.maxReplicaCount, that.maxReplicaCount)
            && Objects.equals(this.triggers, that.triggers) && Objects.equals(this.volumes, that.volumes)
            && Objects.equals(this.livenessProbe, that.livenessProbe)
            && Objects.equals(this.startupProbe, that.startupProbe)
            && Objects.equals(this.readinessProbe, that.readinessProbe)
            && Objects.equals(this.postStart, that.postStart) && Objects.equals(this.preStop, that.preStop)
            && Objects.equals(this.logPaths, that.logPaths) && Objects.equals(this.accessKey, that.accessKey)
            && Objects.equals(this.accessValue, that.accessValue) && Objects.equals(this.business, that.business)
            && Objects.equals(this.imagePullPolicy, that.imagePullPolicy) && Objects.equals(this.version, that.version)
            && Objects.equals(this.path, that.path) && Objects.equals(this.port, that.port)
            && Objects.equals(this.metrics, that.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip,
            rdsId,
            rdsDbName,
            rdsAddress,
            rdsUsername,
            rdsPassword,
            rdsPort,
            configCenterAddr,
            serviceCenterAddr,
            cseId,
            envs,
            items,
            maxReplicaCount,
            triggers,
            volumes,
            livenessProbe,
            startupProbe,
            readinessProbe,
            postStart,
            preStop,
            logPaths,
            accessKey,
            accessValue,
            business,
            imagePullPolicy,
            version,
            path,
            port,
            metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationDataSpec {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    maxReplicaCount: ").append(toIndentedString(maxReplicaCount)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
        sb.append("    startupProbe: ").append(toIndentedString(startupProbe)).append("\n");
        sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
        sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
        sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
        sb.append("    logPaths: ").append(toIndentedString(logPaths)).append("\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    accessValue: ").append(toIndentedString(accessValue)).append("\n");
        sb.append("    business: ").append(toIndentedString(business)).append("\n");
        sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
