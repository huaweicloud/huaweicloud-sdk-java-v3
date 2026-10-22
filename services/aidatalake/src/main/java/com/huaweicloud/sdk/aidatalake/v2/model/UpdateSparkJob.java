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
 * UpdateSparkJob
 */
public class UpdateSparkJob {

    /**
     * **参数解释**：引擎类型。 **约束限制**：不涉及。 **取值范围**：SparkJob。 **默认取值**：不涉及。 
     */
    public static final class TypeEnum {

        /**
         * Enum SPARKJOB for value: "SparkJob"
         */
        public static final TypeEnum SPARKJOB = new TypeEnum("SparkJob");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SparkJob", SPARKJOB);
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

    public UpdateSparkJob withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：引擎类型。 **约束限制**：不涉及。 **取值范围**：SparkJob。 **默认取值**：不涉及。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdateSparkJob withSparkConfig(Map<String, String> sparkConfig) {
        this.sparkConfig = sparkConfig;
        return this;
    }

    public UpdateSparkJob putSparkConfigItem(String key, String sparkConfigItem) {
        if (this.sparkConfig == null) {
            this.sparkConfig = new HashMap<>();
        }
        this.sparkConfig.put(key, sparkConfigItem);
        return this;
    }

    public UpdateSparkJob withSparkConfig(Consumer<Map<String, String>> sparkConfigSetter) {
        if (this.sparkConfig == null) {
            this.sparkConfig = new HashMap<>();
        }
        sparkConfigSetter.accept(this.sparkConfig);
        return this;
    }

    /**
     * **参数解释**：Spark参数配置，Map的key为Spark配置参数名，value为对应的参数值。 **约束限制**：最大数量为100。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return sparkConfig
     */
    public Map<String, String> getSparkConfig() {
        return sparkConfig;
    }

    public void setSparkConfig(Map<String, String> sparkConfig) {
        this.sparkConfig = sparkConfig;
    }

    public UpdateSparkJob withSchedulingConfig(UpdateSparkSchedulingConfig schedulingConfig) {
        this.schedulingConfig = schedulingConfig;
        return this;
    }

    public UpdateSparkJob withSchedulingConfig(Consumer<UpdateSparkSchedulingConfig> schedulingConfigSetter) {
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

    public UpdateSparkJob withImage(V2ImageBriefInfoAdmin image) {
        this.image = image;
        return this;
    }

    public UpdateSparkJob withImage(Consumer<V2ImageBriefInfoAdmin> imageSetter) {
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
        UpdateSparkJob that = (UpdateSparkJob) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.sparkConfig, that.sparkConfig)
            && Objects.equals(this.schedulingConfig, that.schedulingConfig) && Objects.equals(this.image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, sparkConfig, schedulingConfig, image);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSparkJob {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sparkConfig: ").append(toIndentedString(sparkConfig)).append("\n");
        sb.append("    schedulingConfig: ").append(toIndentedString(schedulingConfig)).append("\n");
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
