package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：Ray集群配置。
 */
public class CreateRayCluster {

    /**
     * **参数解释**：引擎类型。 **约束限制**：不涉及。 **取值范围**：RayCluster。 **默认取值**：不涉及。 
     */
    public static final class TypeEnum {

        /**
         * Enum RAYCLUSTER for value: "RayCluster"
         */
        public static final TypeEnum RAYCLUSTER = new TypeEnum("RayCluster");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("RayCluster", RAYCLUSTER);
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

    private CreateHistoryServerConfig historyServerConfig;

    public CreateRayCluster withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：引擎类型。 **约束限制**：不涉及。 **取值范围**：RayCluster。 **默认取值**：不涉及。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateRayCluster withClusterConfig(RayClusterConfigV3 clusterConfig) {
        this.clusterConfig = clusterConfig;
        return this;
    }

    public CreateRayCluster withClusterConfig(Consumer<RayClusterConfigV3> clusterConfigSetter) {
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

    public CreateRayCluster withRedisConfig(RedisConfig redisConfig) {
        this.redisConfig = redisConfig;
        return this;
    }

    public CreateRayCluster withRedisConfig(Consumer<RedisConfig> redisConfigSetter) {
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

    public CreateRayCluster withStoragesConfig(CreateStoragesConfig storagesConfig) {
        this.storagesConfig = storagesConfig;
        return this;
    }

    public CreateRayCluster withStoragesConfig(Consumer<CreateStoragesConfig> storagesConfigSetter) {
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

    public CreateRayCluster withImage(V2ImageBriefInfoAdmin image) {
        this.image = image;
        return this;
    }

    public CreateRayCluster withImage(Consumer<V2ImageBriefInfoAdmin> imageSetter) {
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

    public CreateRayCluster withHistoryServerConfig(CreateHistoryServerConfig historyServerConfig) {
        this.historyServerConfig = historyServerConfig;
        return this;
    }

    public CreateRayCluster withHistoryServerConfig(Consumer<CreateHistoryServerConfig> historyServerConfigSetter) {
        if (this.historyServerConfig == null) {
            this.historyServerConfig = new CreateHistoryServerConfig();
            historyServerConfigSetter.accept(this.historyServerConfig);
        }

        return this;
    }

    /**
     * Get historyServerConfig
     * @return historyServerConfig
     */
    public CreateHistoryServerConfig getHistoryServerConfig() {
        return historyServerConfig;
    }

    public void setHistoryServerConfig(CreateHistoryServerConfig historyServerConfig) {
        this.historyServerConfig = historyServerConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRayCluster that = (CreateRayCluster) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.clusterConfig, that.clusterConfig)
            && Objects.equals(this.redisConfig, that.redisConfig)
            && Objects.equals(this.storagesConfig, that.storagesConfig) && Objects.equals(this.image, that.image)
            && Objects.equals(this.historyServerConfig, that.historyServerConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, clusterConfig, redisConfig, storagesConfig, image, historyServerConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRayCluster {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    clusterConfig: ").append(toIndentedString(clusterConfig)).append("\n");
        sb.append("    redisConfig: ").append(toIndentedString(redisConfig)).append("\n");
        sb.append("    storagesConfig: ").append(toIndentedString(storagesConfig)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    historyServerConfig: ").append(toIndentedString(historyServerConfig)).append("\n");
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
