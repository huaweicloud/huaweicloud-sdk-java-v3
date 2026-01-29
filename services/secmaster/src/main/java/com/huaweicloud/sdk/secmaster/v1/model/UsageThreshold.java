package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 用量阈值
 */
public class UsageThreshold {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_resource_spec_code")

    private String sourceResourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Double threshold;

    /**
     * 阈值对应的单位,%,MB,GB 如果%，对应的阈值最大为95
     */
    public static final class UnitEnum {

        /**
         * Enum PERCENT for value: "%"
         */
        public static final UnitEnum PERCENT = new UnitEnum("%");

        /**
         * Enum MB for value: "MB"
         */
        public static final UnitEnum MB = new UnitEnum("MB");

        /**
         * Enum GB for value: "GB"
         */
        public static final UnitEnum GB = new UnitEnum("GB");

        private static final Map<String, UnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UnitEnum> createStaticFields() {
            Map<String, UnitEnum> map = new HashMap<>();
            map.put("%", PERCENT);
            map.put("MB", MB);
            map.put("GB", GB);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UnitEnum(value));
        }

        public static UnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    public UsageThreshold withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源类型
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public UsageThreshold withSourceResourceSpecCode(String sourceResourceSpecCode) {
        this.sourceResourceSpecCode = sourceResourceSpecCode;
        return this;
    }

    /**
     * 原始资源类型
     * @return sourceResourceSpecCode
     */
    public String getSourceResourceSpecCode() {
        return sourceResourceSpecCode;
    }

    public void setSourceResourceSpecCode(String sourceResourceSpecCode) {
        this.sourceResourceSpecCode = sourceResourceSpecCode;
    }

    public UsageThreshold withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 阈值
     * minimum: 0
     * maximum: 1E+2
     * @return threshold
     */
    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public UsageThreshold withUnit(UnitEnum unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 阈值对应的单位,%,MB,GB 如果%，对应的阈值最大为95
     * @return unit
     */
    public UnitEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }

    public UsageThreshold withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 开启或关闭当前资源类型的告警设置
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UsageThreshold that = (UsageThreshold) obj;
        return Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.sourceResourceSpecCode, that.sourceResourceSpecCode)
            && Objects.equals(this.threshold, that.threshold) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceSpecCode, sourceResourceSpecCode, threshold, unit, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageThreshold {\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    sourceResourceSpecCode: ").append(toIndentedString(sourceResourceSpecCode)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
