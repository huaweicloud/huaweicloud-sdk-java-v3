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
 * UpdateSparkSql
 */
public class UpdateSparkSql {

    /**
     * **参数解释**：引擎类型。 **约束限制**：不涉及。 **取值范围**：SparkSql。 **默认取值**：不涉及。 
     */
    public static final class TypeEnum {

        /**
         * Enum SPARKSQL for value: "SparkSql"
         */
        public static final TypeEnum SPARKSQL = new TypeEnum("SparkSql");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SparkSql", SPARKSQL);
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
    @JsonProperty(value = "image")

    private V2ImageBriefInfoAdmin image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spark_config")

    private Map<String, String> sparkConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_config")

    private UpdateSparkClusterConfig clusterConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_endpoint_concurrent_queries")

    private Integer maxEndpointConcurrentQueries;

    public UpdateSparkSql withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：引擎类型。 **约束限制**：不涉及。 **取值范围**：SparkSql。 **默认取值**：不涉及。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdateSparkSql withImage(V2ImageBriefInfoAdmin image) {
        this.image = image;
        return this;
    }

    public UpdateSparkSql withImage(Consumer<V2ImageBriefInfoAdmin> imageSetter) {
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

    public UpdateSparkSql withSparkConfig(Map<String, String> sparkConfig) {
        this.sparkConfig = sparkConfig;
        return this;
    }

    public UpdateSparkSql putSparkConfigItem(String key, String sparkConfigItem) {
        if (this.sparkConfig == null) {
            this.sparkConfig = new HashMap<>();
        }
        this.sparkConfig.put(key, sparkConfigItem);
        return this;
    }

    public UpdateSparkSql withSparkConfig(Consumer<Map<String, String>> sparkConfigSetter) {
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

    public UpdateSparkSql withClusterConfig(UpdateSparkClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
        return this;
    }

    public UpdateSparkSql withClusterConfig(Consumer<UpdateSparkClusterConfig> clusterConfigSetter) {
        if (this.clusterConfig == null) {
            this.clusterConfig = new UpdateSparkClusterConfig();
            clusterConfigSetter.accept(this.clusterConfig);
        }

        return this;
    }

    /**
     * Get clusterConfig
     * @return clusterConfig
     */
    public UpdateSparkClusterConfig getClusterConfig() {
        return clusterConfig;
    }

    public void setClusterConfig(UpdateSparkClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    public UpdateSparkSql withMaxEndpointConcurrentQueries(Integer maxEndpointConcurrentQueries) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSparkSql that = (UpdateSparkSql) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.image, that.image)
            && Objects.equals(this.sparkConfig, that.sparkConfig)
            && Objects.equals(this.clusterConfig, that.clusterConfig)
            && Objects.equals(this.maxEndpointConcurrentQueries, that.maxEndpointConcurrentQueries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, image, sparkConfig, clusterConfig, maxEndpointConcurrentQueries);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSparkSql {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    sparkConfig: ").append(toIndentedString(sparkConfig)).append("\n");
        sb.append("    clusterConfig: ").append(toIndentedString(clusterConfig)).append("\n");
        sb.append("    maxEndpointConcurrentQueries: ")
            .append(toIndentedString(maxEndpointConcurrentQueries))
            .append("\n");
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
