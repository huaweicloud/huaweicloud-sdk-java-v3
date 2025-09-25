package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 资产重要性的主机数量信息
 */
public class AssetValueHostNumInfo {

    /**
     * 重要性类型
     */
    public static final class ValueTypeEnum {

        /**
         * Enum IMPORTANT for value: "important"
         */
        public static final ValueTypeEnum IMPORTANT = new ValueTypeEnum("important");

        /**
         * Enum COMMON for value: "common"
         */
        public static final ValueTypeEnum COMMON = new ValueTypeEnum("common");

        /**
         * Enum TEST for value: "test"
         */
        public static final ValueTypeEnum TEST = new ValueTypeEnum("test");

        private static final Map<String, ValueTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ValueTypeEnum> createStaticFields() {
            Map<String, ValueTypeEnum> map = new HashMap<>();
            map.put("important", IMPORTANT);
            map.put("common", COMMON);
            map.put("test", TEST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ValueTypeEnum(String value) {
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
        public static ValueTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ValueTypeEnum(value));
        }

        public static ValueTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ValueTypeEnum) {
                return this.value.equals(((ValueTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private ValueTypeEnum valueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    public AssetValueHostNumInfo withValueType(ValueTypeEnum valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * 重要性类型
     * @return valueType
     */
    public ValueTypeEnum getValueType() {
        return valueType;
    }

    public void setValueType(ValueTypeEnum valueType) {
        this.valueType = valueType;
    }

    public AssetValueHostNumInfo withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * 主机数量
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssetValueHostNumInfo that = (AssetValueHostNumInfo) obj;
        return Objects.equals(this.valueType, that.valueType) && Objects.equals(this.hostNum, that.hostNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueType, hostNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetValueHostNumInfo {\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
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
