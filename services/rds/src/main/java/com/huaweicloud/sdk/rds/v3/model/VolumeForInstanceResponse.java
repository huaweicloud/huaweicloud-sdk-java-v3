package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * VolumeForInstanceResponse
 */
public class VolumeForInstanceResponse {

    /**
     * 磁盘类型。 取值范围如下，区分大小写： - COMMON，表示SATA。 - HIGH，表示SAS。 - ULTRAHIGH，表示SSD。 - ULTRAHIGHPRO，表示SSD尊享版，仅支持超高性能型尊享版。 - CLOUDSSD，表示SSD云盘，仅支持通用型和独享型规格实例。 - LOCALSSD，表示本地SSD。 - ESSD，表示极速型SSD，仅支持独享型规格实例。
     */
    public static final class TypeEnum {

        /**
         * Enum ULTRAHIGH for value: "ULTRAHIGH"
         */
        public static final TypeEnum ULTRAHIGH = new TypeEnum("ULTRAHIGH");

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final TypeEnum HIGH = new TypeEnum("HIGH");

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final TypeEnum COMMON = new TypeEnum("COMMON");

        /**
         * Enum NVMESSD for value: "NVMESSD"
         */
        public static final TypeEnum NVMESSD = new TypeEnum("NVMESSD");

        /**
         * Enum ULTRAHIGHPRO for value: "ULTRAHIGHPRO"
         */
        public static final TypeEnum ULTRAHIGHPRO = new TypeEnum("ULTRAHIGHPRO");

        /**
         * Enum CLOUDSSD for value: "CLOUDSSD"
         */
        public static final TypeEnum CLOUDSSD = new TypeEnum("CLOUDSSD");

        /**
         * Enum LOCALSSD for value: "LOCALSSD"
         */
        public static final TypeEnum LOCALSSD = new TypeEnum("LOCALSSD");

        /**
         * Enum ESSD for value: "ESSD"
         */
        public static final TypeEnum ESSD = new TypeEnum("ESSD");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ULTRAHIGH", ULTRAHIGH);
            map.put("HIGH", HIGH);
            map.put("COMMON", COMMON);
            map.put("NVMESSD", NVMESSD);
            map.put("ULTRAHIGHPRO", ULTRAHIGHPRO);
            map.put("CLOUDSSD", CLOUDSSD);
            map.put("LOCALSSD", LOCALSSD);
            map.put("ESSD", ESSD);
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
    @JsonProperty(value = "size")

    private Integer size;

    public VolumeForInstanceResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 磁盘类型。 取值范围如下，区分大小写： - COMMON，表示SATA。 - HIGH，表示SAS。 - ULTRAHIGH，表示SSD。 - ULTRAHIGHPRO，表示SSD尊享版，仅支持超高性能型尊享版。 - CLOUDSSD，表示SSD云盘，仅支持通用型和独享型规格实例。 - LOCALSSD，表示本地SSD。 - ESSD，表示极速型SSD，仅支持独享型规格实例。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public VolumeForInstanceResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 磁盘大小，单位为GB。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeForInstanceResponse that = (VolumeForInstanceResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeForInstanceResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
