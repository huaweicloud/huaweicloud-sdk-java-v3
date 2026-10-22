package com.huaweicloud.sdk.aidatalake.v2.model;

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
 * **参数解释**：创建端点引擎配置。 
 */
public class V2EndpointUpdateEngineConfig {

    /**
     * **参数解释**：引擎类型。 **约束限制**：不涉及。 **取值范围**：RayService。 **默认取值**：不涉及。 
     */
    public static final class TypeEnum {

        /**
         * Enum RAYSERVICE for value: "RayService"
         */
        public static final TypeEnum RAYSERVICE = new TypeEnum("RayService");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("RayService", RAYSERVICE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spark_config")

    private Map<String, String> sparkConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduling_config")

    private UpdateSparkSchedulingConfig schedulingConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private V2ImageBriefInfoAdmin image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_config")

    private RayClusterConfigV3 clusterConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_endpoint_concurrent_queries")

    private Integer maxEndpointConcurrentQueries;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history_server_config")

    private HistoryServerConfig historyServerConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_config")

    private RedisConfig redisConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storages_config")

    private StoragesConfig storagesConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flink_config")

    private Map<String, String> flinkConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worker_group_config")

    private List<WorkerGroupConfig> workerGroupConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_cpu_resource")

    private Boolean expandCpuResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serve_config")

    private ServeConfig serveConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_infos")

    private List<DataInfo> dataInfos = null;

    public V2EndpointUpdateEngineConfig withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：引擎类型。 **约束限制**：不涉及。 **取值范围**：RayService。 **默认取值**：不涉及。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public V2EndpointUpdateEngineConfig withSparkConfig(Map<String, String> sparkConfig) {
        this.sparkConfig = sparkConfig;
        return this;
    }

    public V2EndpointUpdateEngineConfig putSparkConfigItem(String key, String sparkConfigItem) {
        if (this.sparkConfig == null) {
            this.sparkConfig = new HashMap<>();
        }
        this.sparkConfig.put(key, sparkConfigItem);
        return this;
    }

    public V2EndpointUpdateEngineConfig withSparkConfig(Consumer<Map<String, String>> sparkConfigSetter) {
        if (this.sparkConfig == null) {
            this.sparkConfig = new HashMap<>();
        }
        sparkConfigSetter.accept(this.sparkConfig);
        return this;
    }

    /**
     * **参数解释**：Spark 参数配置。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return sparkConfig
     */
    public Map<String, String> getSparkConfig() {
        return sparkConfig;
    }

    public void setSparkConfig(Map<String, String> sparkConfig) {
        this.sparkConfig = sparkConfig;
    }

    public V2EndpointUpdateEngineConfig withSchedulingConfig(UpdateSparkSchedulingConfig schedulingConfig) {
        this.schedulingConfig = schedulingConfig;
        return this;
    }

    public V2EndpointUpdateEngineConfig withSchedulingConfig(
        Consumer<UpdateSparkSchedulingConfig> schedulingConfigSetter) {
        if (this.schedulingConfig == null) {
            this.schedulingConfig = new UpdateSparkSchedulingConfig();
            schedulingConfigSetter.accept(this.schedulingConfig);
        }

        return this;
    }

    /**
     * Get schedulingConfig
     * @return schedulingConfig
     */
    public UpdateSparkSchedulingConfig getSchedulingConfig() {
        return schedulingConfig;
    }

    public void setSchedulingConfig(UpdateSparkSchedulingConfig schedulingConfig) {
        this.schedulingConfig = schedulingConfig;
    }

    public V2EndpointUpdateEngineConfig withImage(V2ImageBriefInfoAdmin image) {
        this.image = image;
        return this;
    }

    public V2EndpointUpdateEngineConfig withImage(Consumer<V2ImageBriefInfoAdmin> imageSetter) {
        if (this.image == null) {
            this.image = new V2ImageBriefInfoAdmin();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public V2ImageBriefInfoAdmin getImage() {
        return image;
    }

    public void setImage(V2ImageBriefInfoAdmin image) {
        this.image = image;
    }

    public V2EndpointUpdateEngineConfig withClusterConfig(RayClusterConfigV3 clusterConfig) {
        this.clusterConfig = clusterConfig;
        return this;
    }

    public V2EndpointUpdateEngineConfig withClusterConfig(Consumer<RayClusterConfigV3> clusterConfigSetter) {
        if (this.clusterConfig == null) {
            this.clusterConfig = new RayClusterConfigV3();
            clusterConfigSetter.accept(this.clusterConfig);
        }

        return this;
    }

    /**
     * Get clusterConfig
     * @return clusterConfig
     */
    public RayClusterConfigV3 getClusterConfig() {
        return clusterConfig;
    }

    public void setClusterConfig(RayClusterConfigV3 clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    public V2EndpointUpdateEngineConfig withMaxEndpointConcurrentQueries(Integer maxEndpointConcurrentQueries) {
        this.maxEndpointConcurrentQueries = maxEndpointConcurrentQueries;
        return this;
    }

    /**
     * **参数解释**：端点最大并发SQL数量。 **约束限制**：不涉及。 **取值范围**：1~1000。 **默认取值**：300。 
     * minimum: 1
     * maximum: 1000
     * @return maxEndpointConcurrentQueries
     */
    public Integer getMaxEndpointConcurrentQueries() {
        return maxEndpointConcurrentQueries;
    }

    public void setMaxEndpointConcurrentQueries(Integer maxEndpointConcurrentQueries) {
        this.maxEndpointConcurrentQueries = maxEndpointConcurrentQueries;
    }

    public V2EndpointUpdateEngineConfig withHistoryServerConfig(HistoryServerConfig historyServerConfig) {
        this.historyServerConfig = historyServerConfig;
        return this;
    }

    public V2EndpointUpdateEngineConfig withHistoryServerConfig(
        Consumer<HistoryServerConfig> historyServerConfigSetter) {
        if (this.historyServerConfig == null) {
            this.historyServerConfig = new HistoryServerConfig();
            historyServerConfigSetter.accept(this.historyServerConfig);
        }

        return this;
    }

    /**
     * Get historyServerConfig
     * @return historyServerConfig
     */
    public HistoryServerConfig getHistoryServerConfig() {
        return historyServerConfig;
    }

    public void setHistoryServerConfig(HistoryServerConfig historyServerConfig) {
        this.historyServerConfig = historyServerConfig;
    }

    public V2EndpointUpdateEngineConfig withRedisConfig(RedisConfig redisConfig) {
        this.redisConfig = redisConfig;
        return this;
    }

    public V2EndpointUpdateEngineConfig withRedisConfig(Consumer<RedisConfig> redisConfigSetter) {
        if (this.redisConfig == null) {
            this.redisConfig = new RedisConfig();
            redisConfigSetter.accept(this.redisConfig);
        }

        return this;
    }

    /**
     * Get redisConfig
     * @return redisConfig
     */
    public RedisConfig getRedisConfig() {
        return redisConfig;
    }

    public void setRedisConfig(RedisConfig redisConfig) {
        this.redisConfig = redisConfig;
    }

    public V2EndpointUpdateEngineConfig withStoragesConfig(StoragesConfig storagesConfig) {
        this.storagesConfig = storagesConfig;
        return this;
    }

    public V2EndpointUpdateEngineConfig withStoragesConfig(Consumer<StoragesConfig> storagesConfigSetter) {
        if (this.storagesConfig == null) {
            this.storagesConfig = new StoragesConfig();
            storagesConfigSetter.accept(this.storagesConfig);
        }

        return this;
    }

    /**
     * Get storagesConfig
     * @return storagesConfig
     */
    public StoragesConfig getStoragesConfig() {
        return storagesConfig;
    }

    public void setStoragesConfig(StoragesConfig storagesConfig) {
        this.storagesConfig = storagesConfig;
    }

    public V2EndpointUpdateEngineConfig withFlinkConfig(Map<String, String> flinkConfig) {
        this.flinkConfig = flinkConfig;
        return this;
    }

    public V2EndpointUpdateEngineConfig putFlinkConfigItem(String key, String flinkConfigItem) {
        if (this.flinkConfig == null) {
            this.flinkConfig = new HashMap<>();
        }
        this.flinkConfig.put(key, flinkConfigItem);
        return this;
    }

    public V2EndpointUpdateEngineConfig withFlinkConfig(Consumer<Map<String, String>> flinkConfigSetter) {
        if (this.flinkConfig == null) {
            this.flinkConfig = new HashMap<>();
        }
        flinkConfigSetter.accept(this.flinkConfig);
        return this;
    }

    /**
     * **参数解释**：Flink参数配置，Map的key为Flink配置参数名，value为对应的参数值。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return flinkConfig
     */
    public Map<String, String> getFlinkConfig() {
        return flinkConfig;
    }

    public void setFlinkConfig(Map<String, String> flinkConfig) {
        this.flinkConfig = flinkConfig;
    }

    public V2EndpointUpdateEngineConfig withWorkerGroupConfig(List<WorkerGroupConfig> workerGroupConfig) {
        this.workerGroupConfig = workerGroupConfig;
        return this;
    }

    public V2EndpointUpdateEngineConfig addWorkerGroupConfigItem(WorkerGroupConfig workerGroupConfigItem) {
        if (this.workerGroupConfig == null) {
            this.workerGroupConfig = new ArrayList<>();
        }
        this.workerGroupConfig.add(workerGroupConfigItem);
        return this;
    }

    public V2EndpointUpdateEngineConfig withWorkerGroupConfig(
        Consumer<List<WorkerGroupConfig>> workerGroupConfigSetter) {
        if (this.workerGroupConfig == null) {
            this.workerGroupConfig = new ArrayList<>();
        }
        workerGroupConfigSetter.accept(this.workerGroupConfig);
        return this;
    }

    /**
     * **参数解释**：工作组补充配置，和外部capacity对应。 **约束限制**：最多10个。
     * @return workerGroupConfig
     */
    public List<WorkerGroupConfig> getWorkerGroupConfig() {
        return workerGroupConfig;
    }

    public void setWorkerGroupConfig(List<WorkerGroupConfig> workerGroupConfig) {
        this.workerGroupConfig = workerGroupConfig;
    }

    public V2EndpointUpdateEngineConfig withExpandCpuResource(Boolean expandCpuResource) {
        this.expandCpuResource = expandCpuResource;
        return this;
    }

    /**
     * **参数解释**：开启后，通算工作组作业能够使用智算工作组空闲CPU及内存资源，该操作可能会导致智算任务因资源不足而排队。 **约束限制**：不涉及。 **取值范围**：   - true：开启通算工作组作业使用智算工作组空闲CPU及内存资源。   - false：关闭通算工作组作业使用智算工作组空闲CPU及内存资源。 **默认取值**：false。
     * @return expandCpuResource
     */
    public Boolean getExpandCpuResource() {
        return expandCpuResource;
    }

    public void setExpandCpuResource(Boolean expandCpuResource) {
        this.expandCpuResource = expandCpuResource;
    }

    public V2EndpointUpdateEngineConfig withServeConfig(ServeConfig serveConfig) {
        this.serveConfig = serveConfig;
        return this;
    }

    public V2EndpointUpdateEngineConfig withServeConfig(Consumer<ServeConfig> serveConfigSetter) {
        if (this.serveConfig == null) {
            this.serveConfig = new ServeConfig();
            serveConfigSetter.accept(this.serveConfig);
        }

        return this;
    }

    /**
     * Get serveConfig
     * @return serveConfig
     */
    public ServeConfig getServeConfig() {
        return serveConfig;
    }

    public void setServeConfig(ServeConfig serveConfig) {
        this.serveConfig = serveConfig;
    }

    public V2EndpointUpdateEngineConfig withDataInfos(List<DataInfo> dataInfos) {
        this.dataInfos = dataInfos;
        return this;
    }

    public V2EndpointUpdateEngineConfig addDataInfosItem(DataInfo dataInfosItem) {
        if (this.dataInfos == null) {
            this.dataInfos = new ArrayList<>();
        }
        this.dataInfos.add(dataInfosItem);
        return this;
    }

    public V2EndpointUpdateEngineConfig withDataInfos(Consumer<List<DataInfo>> dataInfosSetter) {
        if (this.dataInfos == null) {
            this.dataInfos = new ArrayList<>();
        }
        dataInfosSetter.accept(this.dataInfos);
        return this;
    }

    /**
     * **参数解释**：模型信息列表（可选）。更新时如果模型没有变化，可以不填此字段；如果需要更新模型，则填写新的模型信息。 **约束限制**：不涉及。
     * @return dataInfos
     */
    public List<DataInfo> getDataInfos() {
        return dataInfos;
    }

    public void setDataInfos(List<DataInfo> dataInfos) {
        this.dataInfos = dataInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2EndpointUpdateEngineConfig that = (V2EndpointUpdateEngineConfig) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.sparkConfig, that.sparkConfig)
            && Objects.equals(this.schedulingConfig, that.schedulingConfig) && Objects.equals(this.image, that.image)
            && Objects.equals(this.clusterConfig, that.clusterConfig)
            && Objects.equals(this.maxEndpointConcurrentQueries, that.maxEndpointConcurrentQueries)
            && Objects.equals(this.historyServerConfig, that.historyServerConfig)
            && Objects.equals(this.redisConfig, that.redisConfig)
            && Objects.equals(this.storagesConfig, that.storagesConfig)
            && Objects.equals(this.flinkConfig, that.flinkConfig)
            && Objects.equals(this.workerGroupConfig, that.workerGroupConfig)
            && Objects.equals(this.expandCpuResource, that.expandCpuResource)
            && Objects.equals(this.serveConfig, that.serveConfig) && Objects.equals(this.dataInfos, that.dataInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            sparkConfig,
            schedulingConfig,
            image,
            clusterConfig,
            maxEndpointConcurrentQueries,
            historyServerConfig,
            redisConfig,
            storagesConfig,
            flinkConfig,
            workerGroupConfig,
            expandCpuResource,
            serveConfig,
            dataInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2EndpointUpdateEngineConfig {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sparkConfig: ").append(toIndentedString(sparkConfig)).append("\n");
        sb.append("    schedulingConfig: ").append(toIndentedString(schedulingConfig)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    clusterConfig: ").append(toIndentedString(clusterConfig)).append("\n");
        sb.append("    maxEndpointConcurrentQueries: ")
            .append(toIndentedString(maxEndpointConcurrentQueries))
            .append("\n");
        sb.append("    historyServerConfig: ").append(toIndentedString(historyServerConfig)).append("\n");
        sb.append("    redisConfig: ").append(toIndentedString(redisConfig)).append("\n");
        sb.append("    storagesConfig: ").append(toIndentedString(storagesConfig)).append("\n");
        sb.append("    flinkConfig: ").append(toIndentedString(flinkConfig)).append("\n");
        sb.append("    workerGroupConfig: ").append(toIndentedString(workerGroupConfig)).append("\n");
        sb.append("    expandCpuResource: ").append(toIndentedString(expandCpuResource)).append("\n");
        sb.append("    serveConfig: ").append(toIndentedString(serveConfig)).append("\n");
        sb.append("    dataInfos: ").append(toIndentedString(dataInfos)).append("\n");
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
