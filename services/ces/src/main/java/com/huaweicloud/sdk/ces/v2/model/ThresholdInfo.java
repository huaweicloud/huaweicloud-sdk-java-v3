package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释** 监控视图的阈值辅助线配置 **约束限制** 不涉及 
 */
public class ThresholdInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private BigDecimal threshold;

    /**
     * **参数解释** 监控视图辅助线的颜色 **约束限制** 不涉及           **取值范围** - \"#B50E65\":紫色 - \"#F23030\":红色 - \"#FF8800\":橙色 - \"#F2E70C\":黄色 **默认取值** 不涉及 
     */
    public static final class ThresholdColorEnum {

        /**
         * Enum _B50E65 for value: "#B50E65"
         */
        public static final ThresholdColorEnum _B50E65 = new ThresholdColorEnum("#B50E65");

        /**
         * Enum _F23030 for value: "#F23030"
         */
        public static final ThresholdColorEnum _F23030 = new ThresholdColorEnum("#F23030");

        /**
         * Enum _FF8800 for value: "#FF8800"
         */
        public static final ThresholdColorEnum _FF8800 = new ThresholdColorEnum("#FF8800");

        /**
         * Enum _F2E70C for value: "#F2E70C"
         */
        public static final ThresholdColorEnum _F2E70C = new ThresholdColorEnum("#F2E70C");

        private static final Map<String, ThresholdColorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ThresholdColorEnum> createStaticFields() {
            Map<String, ThresholdColorEnum> map = new HashMap<>();
            map.put("#B50E65", _B50E65);
            map.put("#F23030", _F23030);
            map.put("#FF8800", _FF8800);
            map.put("#F2E70C", _F2E70C);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ThresholdColorEnum(String value) {
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
        public static ThresholdColorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ThresholdColorEnum(value));
        }

        public static ThresholdColorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ThresholdColorEnum) {
                return this.value.equals(((ThresholdColorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold_color")

    private ThresholdColorEnum thresholdColor;

    public ThresholdInfo withThreshold(BigDecimal threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * **参数解释** 监控视图辅助线的阈值 **约束限制** 不涉及 **取值范围** 最小值为0，最大值为2147483647 **默认取值** 不涉及 
     * minimum: 0
     * maximum: 2147483647
     * @return threshold
     */
    public BigDecimal getThreshold() {
        return threshold;
    }

    public void setThreshold(BigDecimal threshold) {
        this.threshold = threshold;
    }

    public ThresholdInfo withThresholdColor(ThresholdColorEnum thresholdColor) {
        this.thresholdColor = thresholdColor;
        return this;
    }

    /**
     * **参数解释** 监控视图辅助线的颜色 **约束限制** 不涉及           **取值范围** - \"#B50E65\":紫色 - \"#F23030\":红色 - \"#FF8800\":橙色 - \"#F2E70C\":黄色 **默认取值** 不涉及 
     * @return thresholdColor
     */
    public ThresholdColorEnum getThresholdColor() {
        return thresholdColor;
    }

    public void setThresholdColor(ThresholdColorEnum thresholdColor) {
        this.thresholdColor = thresholdColor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThresholdInfo that = (ThresholdInfo) obj;
        return Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.thresholdColor, that.thresholdColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(threshold, thresholdColor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThresholdInfo {\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    thresholdColor: ").append(toIndentedString(thresholdColor)).append("\n");
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
