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
 * **参数解释**：RayService（推理服务）配置。在 RayCluster 能力基础上，新增模型信息（data_infos，仅需 OBS 输入路径）与 Serve 应用配置（serve_config）。 **约束限制**：serve_config、cluster_config、storages_config、image 为必填字段。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class CreateRayService {

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
    @JsonProperty(value = "serve_config")

    private ServeConfig serveConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_config")

    private RayClusterConfigV3 clusterConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redis_config")

    private RedisConfig redisConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storages_config")

    private CreateStoragesConfig storagesConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private V2ImageBriefInfoAdmin image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history_server_config")

    private HistoryServerConfig historyServerConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_infos")

    private List<DataInfo> dataInfos = null;

    public CreateRayService withType(TypeEnum type) {
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

    public CreateRayService withServeConfig(ServeConfig serveConfig) {
        this.serveConfig = serveConfig;
        return this;
    }

    public CreateRayService withServeConfig(Consumer<ServeConfig> serveConfigSetter) {
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

    public CreateRayService withClusterConfig(RayClusterConfigV3 clusterConfig) {
        this.clusterConfig = clusterConfig;
        return this;
    }

    public CreateRayService withClusterConfig(Consumer<RayClusterConfigV3> clusterConfigSetter) {
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

    public CreateRayService withRedisConfig(RedisConfig redisConfig) {
        this.redisConfig = redisConfig;
        return this;
    }

    public CreateRayService withRedisConfig(Consumer<RedisConfig> redisConfigSetter) {
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

    public CreateRayService withStoragesConfig(CreateStoragesConfig storagesConfig) {
        this.storagesConfig = storagesConfig;
        return this;
    }

    public CreateRayService withStoragesConfig(Consumer<CreateStoragesConfig> storagesConfigSetter) {
        if (this.storagesConfig == null) {
            this.storagesConfig = new CreateStoragesConfig();
            storagesConfigSetter.accept(this.storagesConfig);
        }

        return this;
    }

    /**
     * Get storagesConfig
     * @return storagesConfig
     */
    public CreateStoragesConfig getStoragesConfig() {
        return storagesConfig;
    }

    public void setStoragesConfig(CreateStoragesConfig storagesConfig) {
        this.storagesConfig = storagesConfig;
    }

    public CreateRayService withImage(V2ImageBriefInfoAdmin image) {
        this.image = image;
        return this;
    }

    public CreateRayService withImage(Consumer<V2ImageBriefInfoAdmin> imageSetter) {
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

    public CreateRayService withHistoryServerConfig(HistoryServerConfig historyServerConfig) {
        this.historyServerConfig = historyServerConfig;
        return this;
    }

    public CreateRayService withHistoryServerConfig(Consumer<HistoryServerConfig> historyServerConfigSetter) {
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

    public CreateRayService withDataInfos(List<DataInfo> dataInfos) {
        this.dataInfos = dataInfos;
        return this;
    }

    public CreateRayService addDataInfosItem(DataInfo dataInfosItem) {
        if (this.dataInfos == null) {
            this.dataInfos = new ArrayList<>();
        }
        this.dataInfos.add(dataInfosItem);
        return this;
    }

    public CreateRayService withDataInfos(Consumer<List<DataInfo>> dataInfosSetter) {
        if (this.dataInfos == null) {
            this.dataInfos = new ArrayList<>();
        }
        dataInfosSetter.accept(this.dataInfos);
        return this;
    }

    /**
     * **参数解释**：模型信息列表（可选）。模型可以打包在镜像中（通过 working_dir 配置项指定），也可以通过此字段上传模型地址。创建时如果模型已预置在镜像中，可省略此字段；更新时如果模型没有变化，也可以不填。 **约束限制**：不涉及。
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
        CreateRayService that = (CreateRayService) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.serveConfig, that.serveConfig)
            && Objects.equals(this.clusterConfig, that.clusterConfig)
            && Objects.equals(this.redisConfig, that.redisConfig)
            && Objects.equals(this.storagesConfig, that.storagesConfig) && Objects.equals(this.image, that.image)
            && Objects.equals(this.historyServerConfig, that.historyServerConfig)
            && Objects.equals(this.dataInfos, that.dataInfos);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(type, serveConfig, clusterConfig, redisConfig, storagesConfig, image, historyServerConfig, dataInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRayService {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    serveConfig: ").append(toIndentedString(serveConfig)).append("\n");
        sb.append("    clusterConfig: ").append(toIndentedString(clusterConfig)).append("\n");
        sb.append("    redisConfig: ").append(toIndentedString(redisConfig)).append("\n");
        sb.append("    storagesConfig: ").append(toIndentedString(storagesConfig)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    historyServerConfig: ").append(toIndentedString(historyServerConfig)).append("\n");
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
