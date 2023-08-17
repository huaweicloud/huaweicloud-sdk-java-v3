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
 * QuotaObject
 */
public class QuotaObject {

    /**
     * 配额类型
     */
    public static final class TypeEnum {

        /**
         * Enum IEG_NUM_LIMIT for value: "ieg_num_limit"
         */
        public static final TypeEnum IEG_NUM_LIMIT = new TypeEnum("ieg_num_limit");

        /**
         * Enum ECN_NUM_LIMIT for value: "ecn_num_limit"
         */
        public static final TypeEnum ECN_NUM_LIMIT = new TypeEnum("ecn_num_limit");

        /**
         * Enum ECN_STANDARD_BANDWIDTH_LIMIT for value: "ecn_standard_bandwidth_limit"
         */
        public static final TypeEnum ECN_STANDARD_BANDWIDTH_LIMIT = new TypeEnum("ecn_standard_bandwidth_limit");

        /**
         * Enum ECN_PROFESSIONAL_BANDWIDTH_LIMIT for value: "ecn_professional_bandwidth_limit"
         */
        public static final TypeEnum ECN_PROFESSIONAL_BANDWIDTH_LIMIT =
            new TypeEnum("ecn_professional_bandwidth_limit");

        /**
         * Enum ROUTE_LIMIT for value: "route_limit"
         */
        public static final TypeEnum ROUTE_LIMIT = new TypeEnum("route_limit");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ieg_num_limit", IEG_NUM_LIMIT);
            map.put("ecn_num_limit", ECN_NUM_LIMIT);
            map.put("ecn_standard_bandwidth_limit", ECN_STANDARD_BANDWIDTH_LIMIT);
            map.put("ecn_professional_bandwidth_limit", ECN_PROFESSIONAL_BANDWIDTH_LIMIT);
            map.put("route_limit", ROUTE_LIMIT);
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
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min")

    private Integer min;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max")

    private Integer max;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    public QuotaObject withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 配额类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public QuotaObject withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public QuotaObject withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 最小值
     * @return min
     */
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public QuotaObject withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 最大值
     * @return max
     */
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public QuotaObject withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 配额上限
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public QuotaObject withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用数
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QuotaObject that = (QuotaObject) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.min, that.min) && Objects.equals(this.max, that.max)
            && Objects.equals(this.quota, that.quota) && Objects.equals(this.used, that.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, unit, min, max, quota, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuotaObject {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    min: ").append(toIndentedString(min)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
