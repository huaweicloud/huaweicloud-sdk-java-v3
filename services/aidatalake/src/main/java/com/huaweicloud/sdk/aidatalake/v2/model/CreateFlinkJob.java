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
 * CreateFlinkJob
 */
public class CreateFlinkJob {

    /**
     * **参数解释**：引擎类型。 **约束限制**：不涉及。 **取值范围**：FlinkJob。 **默认取值**：不涉及。 
     */
    public static final class TypeEnum {

        /**
         * Enum FLINKJOB for value: "FlinkJob"
         */
        public static final TypeEnum FLINKJOB = new TypeEnum("FlinkJob");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("FlinkJob", FLINKJOB);
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
    @JsonProperty(value = "flink_config")

    private Map<String, String> flinkConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "staging_config")

    private StagingConfig stagingConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private V2ImageBriefInfoAdmin image;

    public CreateFlinkJob withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：引擎类型。 **约束限制**：不涉及。 **取值范围**：FlinkJob。 **默认取值**：不涉及。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateFlinkJob withFlinkConfig(Map<String, String> flinkConfig) {
        this.flinkConfig = flinkConfig;
        return this;
    }

    public CreateFlinkJob putFlinkConfigItem(String key, String flinkConfigItem) {
        if (this.flinkConfig == null) {
            this.flinkConfig = new HashMap<>();
        }
        this.flinkConfig.put(key, flinkConfigItem);
        return this;
    }

    public CreateFlinkJob withFlinkConfig(Consumer<Map<String, String>> flinkConfigSetter) {
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

    public CreateFlinkJob withStagingConfig(StagingConfig stagingConfig) {
        this.stagingConfig = stagingConfig;
        return this;
    }

    public CreateFlinkJob withStagingConfig(Consumer<StagingConfig> stagingConfigSetter) {
        if (this.stagingConfig == null) {
            this.stagingConfig = new StagingConfig();
            stagingConfigSetter.accept(this.stagingConfig);
        }

        return this;
    }

    /**
     * Get stagingConfig
     * @return stagingConfig
     */
    public StagingConfig getStagingConfig() {
        return stagingConfig;
    }

    public void setStagingConfig(StagingConfig stagingConfig) {
        this.stagingConfig = stagingConfig;
    }

    public CreateFlinkJob withImage(V2ImageBriefInfoAdmin image) {
        this.image = image;
        return this;
    }

    public CreateFlinkJob withImage(Consumer<V2ImageBriefInfoAdmin> imageSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFlinkJob that = (CreateFlinkJob) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.flinkConfig, that.flinkConfig)
            && Objects.equals(this.stagingConfig, that.stagingConfig) && Objects.equals(this.image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, flinkConfig, stagingConfig, image);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlinkJob {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    flinkConfig: ").append(toIndentedString(flinkConfig)).append("\n");
        sb.append("    stagingConfig: ").append(toIndentedString(stagingConfig)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
