package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DiagnoseTypeDTO
 */
public class DiagnoseTypeDTO {

    /**
     * 数据安全诊断项 * SENSITIVE_DATA 敏感数据保护 * PERMISSION_MANAGEMENT 数据权限控制 * DATASOURCE_PROTECTION 数据源防护
     */
    public static final class TypeEnum {

        /**
         * Enum SENSITIVE_DATA for value: "SENSITIVE_DATA"
         */
        public static final TypeEnum SENSITIVE_DATA = new TypeEnum("SENSITIVE_DATA");

        /**
         * Enum PERMISSION_MANAGEMENT for value: "PERMISSION_MANAGEMENT"
         */
        public static final TypeEnum PERMISSION_MANAGEMENT = new TypeEnum("PERMISSION_MANAGEMENT");

        /**
         * Enum DATASOURCE_PROTECTION for value: "DATASOURCE_PROTECTION"
         */
        public static final TypeEnum DATASOURCE_PROTECTION = new TypeEnum("DATASOURCE_PROTECTION");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("SENSITIVE_DATA", SENSITIVE_DATA);
            map.put("PERMISSION_MANAGEMENT", PERMISSION_MANAGEMENT);
            map.put("DATASOURCE_PROTECTION", DATASOURCE_PROTECTION);
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

    public DiagnoseTypeDTO withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 数据安全诊断项 * SENSITIVE_DATA 敏感数据保护 * PERMISSION_MANAGEMENT 数据权限控制 * DATASOURCE_PROTECTION 数据源防护
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiagnoseTypeDTO that = (DiagnoseTypeDTO) obj;
        return Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnoseTypeDTO {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
