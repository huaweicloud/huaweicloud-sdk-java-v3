package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 日志接入偏移时间
 */
public class AccessConfigTimeOffsetCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    /**
     * 偏移时间单位。day ：天，hour：小时，sec：秒
     */
    public static final class UnitEnum {

        /**
         * Enum DAY for value: "day"
         */
        public static final UnitEnum DAY = new UnitEnum("day");

        /**
         * Enum HOUR for value: "hour"
         */
        public static final UnitEnum HOUR = new UnitEnum("hour");

        /**
         * Enum SEC for value: "sec"
         */
        public static final UnitEnum SEC = new UnitEnum("sec");

        private static final Map<String, UnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UnitEnum> createStaticFields() {
            Map<String, UnitEnum> map = new HashMap<>();
            map.put("day", DAY);
            map.put("hour", HOUR);
            map.put("sec", SEC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UnitEnum(String value) {
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
        public static UnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            UnitEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new UnitEnum(value);
            }
            return result;
        }

        public static UnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            UnitEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UnitEnum) {
                return this.value.equals(((UnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private UnitEnum unit;

    public AccessConfigTimeOffsetCreate withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移时间。 当\"unit\"选择\"day\"时，范围为1~7天。 当\"unit\"选择\"hour\"时，范围为1~168小时。 当\"unit\"选择\"sec\"时，范围为1~604800秒。
     * minimum: 1
     * maximum: 604800
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public AccessConfigTimeOffsetCreate withUnit(UnitEnum unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 偏移时间单位。day ：天，hour：小时，sec：秒
     * @return unit
     */
    public UnitEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessConfigTimeOffsetCreate accessConfigTimeOffsetCreate = (AccessConfigTimeOffsetCreate) o;
        return Objects.equals(this.offset, accessConfigTimeOffsetCreate.offset)
            && Objects.equals(this.unit, accessConfigTimeOffsetCreate.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigTimeOffsetCreate {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
