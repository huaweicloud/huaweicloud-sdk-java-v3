package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * JobResourceInfo
 */
public class JobResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 资源类型
     */
    public static final class TypeEnum {

        /**
         * Enum DWS_CONNECTION for value: "DWS_CONNECTION"
         */
        public static final TypeEnum DWS_CONNECTION = new TypeEnum("DWS_CONNECTION");

        /**
         * Enum DIS_STREAM for value: "DIS_STREAM"
         */
        public static final TypeEnum DIS_STREAM = new TypeEnum("DIS_STREAM");

        /**
         * Enum CDM_CLUSTER for value: "CDM_CLUSTER"
         */
        public static final TypeEnum CDM_CLUSTER = new TypeEnum("CDM_CLUSTER");

        /**
         * Enum MRS_CLUSTER for value: "MRS_CLUSTER"
         */
        public static final TypeEnum MRS_CLUSTER = new TypeEnum("MRS_CLUSTER");

        /**
         * Enum MRS_HIVE_CONNECTION for value: "MRS_HIVE_CONNECTION"
         */
        public static final TypeEnum MRS_HIVE_CONNECTION = new TypeEnum("MRS_HIVE_CONNECTION");

        /**
         * Enum MRS_SPARK_CONNECTION for value: "MRS_SPARK_CONNECTION"
         */
        public static final TypeEnum MRS_SPARK_CONNECTION = new TypeEnum("MRS_SPARK_CONNECTION");

        /**
         * Enum GES_GRAPH for value: "GES_GRAPH"
         */
        public static final TypeEnum GES_GRAPH = new TypeEnum("GES_GRAPH");

        /**
         * Enum ROMA_INSTANCE for value: "ROMA_INSTANCE"
         */
        public static final TypeEnum ROMA_INSTANCE = new TypeEnum("ROMA_INSTANCE");

        /**
         * Enum TICS_INSTANCE for value: "TICS_INSTANCE"
         */
        public static final TypeEnum TICS_INSTANCE = new TypeEnum("TICS_INSTANCE");

        /**
         * Enum DRS_TASK for value: "DRS_TASK"
         */
        public static final TypeEnum DRS_TASK = new TypeEnum("DRS_TASK");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("DWS_CONNECTION", DWS_CONNECTION);
            map.put("DIS_STREAM", DIS_STREAM);
            map.put("CDM_CLUSTER", CDM_CLUSTER);
            map.put("MRS_CLUSTER", MRS_CLUSTER);
            map.put("MRS_HIVE_CONNECTION", MRS_HIVE_CONNECTION);
            map.put("MRS_SPARK_CONNECTION", MRS_SPARK_CONNECTION);
            map.put("GES_GRAPH", GES_GRAPH);
            map.put("ROMA_INSTANCE", ROMA_INSTANCE);
            map.put("TICS_INSTANCE", TICS_INSTANCE);
            map.put("DRS_TASK", DRS_TASK);
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
    @JsonProperty(value = "replace")

    private String replace;

    public JobResourceInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobResourceInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public JobResourceInfo withReplace(String replace) {
        this.replace = replace;
        return this;
    }

    /**
     * 替换后的资源名
     * @return replace
     */
    public String getReplace() {
        return replace;
    }

    public void setReplace(String replace) {
        this.replace = replace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobResourceInfo that = (JobResourceInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.replace, that.replace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, replace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobResourceInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    replace: ").append(toIndentedString(replace)).append("\n");
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
