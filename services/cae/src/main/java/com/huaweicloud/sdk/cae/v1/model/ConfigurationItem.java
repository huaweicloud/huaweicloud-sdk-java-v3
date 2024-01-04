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
 * ConfigurationItem
 */
public class ConfigurationItem {

    /**
     * 组件配置类型。
     */
    public static final class TypeEnum {

        /**
         * Enum RDS for value: "rds"
         */
        public static final TypeEnum RDS = new TypeEnum("rds");

        /**
         * Enum CSE for value: "cse"
         */
        public static final TypeEnum CSE = new TypeEnum("cse");

        /**
         * Enum ENV for value: "env"
         */
        public static final TypeEnum ENV = new TypeEnum("env");

        /**
         * Enum ACCESS for value: "access"
         */
        public static final TypeEnum ACCESS = new TypeEnum("access");

        /**
         * Enum SCALING for value: "scaling"
         */
        public static final TypeEnum SCALING = new TypeEnum("scaling");

        /**
         * Enum VOLUME for value: "volume"
         */
        public static final TypeEnum VOLUME = new TypeEnum("volume");

        /**
         * Enum HEALTHCHECK for value: "healthCheck"
         */
        public static final TypeEnum HEALTHCHECK = new TypeEnum("healthCheck");

        /**
         * Enum LIFECYCLE for value: "lifecycle"
         */
        public static final TypeEnum LIFECYCLE = new TypeEnum("lifecycle");

        /**
         * Enum APM2 for value: "apm2"
         */
        public static final TypeEnum APM2 = new TypeEnum("apm2");

        /**
         * Enum LOG for value: "log"
         */
        public static final TypeEnum LOG = new TypeEnum("log");

        /**
         * Enum CUSTOMMETRIC for value: "customMetric"
         */
        public static final TypeEnum CUSTOMMETRIC = new TypeEnum("customMetric");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("rds", RDS);
            map.put("cse", CSE);
            map.put("env", ENV);
            map.put("access", ACCESS);
            map.put("scaling", SCALING);
            map.put("volume", VOLUME);
            map.put("healthCheck", HEALTHCHECK);
            map.put("lifecycle", LIFECYCLE);
            map.put("apm2", APM2);
            map.put("log", LOG);
            map.put("customMetric", CUSTOMMETRIC);
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
    @JsonProperty(value = "data")

    private ConfigurationData data;

    public ConfigurationItem withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 组件配置类型。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ConfigurationItem withData(ConfigurationData data) {
        this.data = data;
        return this;
    }

    public ConfigurationItem withData(Consumer<ConfigurationData> dataSetter) {
        if (this.data == null) {
            this.data = new ConfigurationData();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public ConfigurationData getData() {
        return data;
    }

    public void setData(ConfigurationData data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationItem that = (ConfigurationItem) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationItem {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
