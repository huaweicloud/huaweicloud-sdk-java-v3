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
 * Request Object
 */
public class ShowEquipmentSpecificConfigRequest {

    /**
     * 设备类型
     */
    public static final class EquipmentTypeEnum {

        /**
         * Enum STANDARD for value: "standard"
         */
        public static final EquipmentTypeEnum STANDARD = new EquipmentTypeEnum("standard");

        private static final Map<String, EquipmentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EquipmentTypeEnum> createStaticFields() {
            Map<String, EquipmentTypeEnum> map = new HashMap<>();
            map.put("standard", STANDARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EquipmentTypeEnum(String value) {
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
        public static EquipmentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EquipmentTypeEnum(value));
        }

        public static EquipmentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EquipmentTypeEnum) {
                return this.value.equals(((EquipmentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "equipment_type")

    private EquipmentTypeEnum equipmentType;

    public ShowEquipmentSpecificConfigRequest withEquipmentType(EquipmentTypeEnum equipmentType) {
        this.equipmentType = equipmentType;
        return this;
    }

    /**
     * 设备类型
     * @return equipmentType
     */
    public EquipmentTypeEnum getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentTypeEnum equipmentType) {
        this.equipmentType = equipmentType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEquipmentSpecificConfigRequest that = (ShowEquipmentSpecificConfigRequest) obj;
        return Objects.equals(this.equipmentType, that.equipmentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipmentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEquipmentSpecificConfigRequest {\n");
        sb.append("    equipmentType: ").append(toIndentedString(equipmentType)).append("\n");
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
