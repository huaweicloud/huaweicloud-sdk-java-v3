package com.huaweicloud.sdk.cae.v1.model;

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
 * 伸缩策略触发器。
 */
public class ScaleConfigurationDataTrigger {

    /**
     * 指标类型，支持cpu、memory、cron。
     */
    public static final class TypeEnum {

        /**
         * Enum CPU for value: "cpu"
         */
        public static final TypeEnum CPU = new TypeEnum("cpu");

        /**
         * Enum MEMORY for value: "memory"
         */
        public static final TypeEnum MEMORY = new TypeEnum("memory");

        /**
         * Enum CRON for value: "cron"
         */
        public static final TypeEnum CRON = new TypeEnum("cron");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("cpu", CPU);
            map.put("memory", MEMORY);
            map.put("cron", CRON);
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
    @JsonProperty(value = "metadata")

    private ScalingTriggerMeta metadata;

    public ScaleConfigurationDataTrigger withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 指标类型，支持cpu、memory、cron。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ScaleConfigurationDataTrigger withMetadata(ScalingTriggerMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ScaleConfigurationDataTrigger withMetadata(Consumer<ScalingTriggerMeta> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ScalingTriggerMeta();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ScalingTriggerMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(ScalingTriggerMeta metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScaleConfigurationDataTrigger that = (ScaleConfigurationDataTrigger) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleConfigurationDataTrigger {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
