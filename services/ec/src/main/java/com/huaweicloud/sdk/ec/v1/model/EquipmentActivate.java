package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EquipmentActivate
 */
public class EquipmentActivate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 设备类型
     */
    public static final class TypeEnum {

        /**
         * Enum STANDARD for value: "standard"
         */
        public static final TypeEnum STANDARD = new TypeEnum("standard");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("standard", STANDARD);
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
    @JsonProperty(value = "esn")

    private String esn;

    /**
     * 高可用类型
     */
    public static final class HaTypeEnum {

        /**
         * Enum ACTIVE for value: "Active"
         */
        public static final HaTypeEnum ACTIVE = new HaTypeEnum("Active");

        /**
         * Enum STANDBY for value: "Standby"
         */
        public static final HaTypeEnum STANDBY = new HaTypeEnum("Standby");

        private static final Map<String, HaTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HaTypeEnum> createStaticFields() {
            Map<String, HaTypeEnum> map = new HashMap<>();
            map.put("Active", ACTIVE);
            map.put("Standby", STANDBY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HaTypeEnum(String value) {
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
        public static HaTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HaTypeEnum(value));
        }

        public static HaTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HaTypeEnum) {
                return this.value.equals(((HaTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_type")

    private HaTypeEnum haType;

    public EquipmentActivate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 设备名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EquipmentActivate withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 设备类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public EquipmentActivate withEsn(String esn) {
        this.esn = esn;
        return this;
    }

    /**
     * esn
     * @return esn
     */
    public String getEsn() {
        return esn;
    }

    public void setEsn(String esn) {
        this.esn = esn;
    }

    public EquipmentActivate withHaType(HaTypeEnum haType) {
        this.haType = haType;
        return this;
    }

    /**
     * 高可用类型
     * @return haType
     */
    public HaTypeEnum getHaType() {
        return haType;
    }

    public void setHaType(HaTypeEnum haType) {
        this.haType = haType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EquipmentActivate that = (EquipmentActivate) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.esn, that.esn) && Objects.equals(this.haType, that.haType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, esn, haType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EquipmentActivate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    esn: ").append(toIndentedString(esn)).append("\n");
        sb.append("    haType: ").append(toIndentedString(haType)).append("\n");
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
