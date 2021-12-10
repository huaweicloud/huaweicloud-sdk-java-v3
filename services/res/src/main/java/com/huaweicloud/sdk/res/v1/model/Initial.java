package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 初始化参数 */
public class Initial {

    /** 初始化方法。 */
    public static final class InitialMethodEnum {

        /** Enum NORMAL for value: "normal" */
        public static final InitialMethodEnum NORMAL = new InitialMethodEnum("normal");

        /** Enum UNIFORM for value: "uniform" */
        public static final InitialMethodEnum UNIFORM = new InitialMethodEnum("uniform");

        /** Enum XAVIER for value: "xavier" */
        public static final InitialMethodEnum XAVIER = new InitialMethodEnum("xavier");

        private static final Map<String, InitialMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InitialMethodEnum> createStaticFields() {
            Map<String, InitialMethodEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            map.put("uniform", UNIFORM);
            map.put("xavier", XAVIER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InitialMethodEnum(String value) {
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
        public static InitialMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            InitialMethodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InitialMethodEnum(value);
            }
            return result;
        }

        public static InitialMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            InitialMethodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InitialMethodEnum) {
                return this.value.equals(((InitialMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_method")

    private InitialMethodEnum initialMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mean_value")

    private Double meanValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard_deviation")

    private Double standardDeviation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_value")

    private Double minValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_value")

    private Double maxValue;

    public Initial withInitialMethod(InitialMethodEnum initialMethod) {
        this.initialMethod = initialMethod;
        return this;
    }

    /** 初始化方法。
     * 
     * @return initialMethod */
    public InitialMethodEnum getInitialMethod() {
        return initialMethod;
    }

    public void setInitialMethod(InitialMethodEnum initialMethod) {
        this.initialMethod = initialMethod;
    }

    public Initial withMeanValue(Double meanValue) {
        this.meanValue = meanValue;
        return this;
    }

    /** 平均值。 minimum: -1 maximum: 1
     * 
     * @return meanValue */
    public Double getMeanValue() {
        return meanValue;
    }

    public void setMeanValue(Double meanValue) {
        this.meanValue = meanValue;
    }

    public Initial withStandardDeviation(Double standardDeviation) {
        this.standardDeviation = standardDeviation;
        return this;
    }

    /** 标准差。 minimum: 0 maximum: 1
     * 
     * @return standardDeviation */
    public Double getStandardDeviation() {
        return standardDeviation;
    }

    public void setStandardDeviation(Double standardDeviation) {
        this.standardDeviation = standardDeviation;
    }

    public Initial withMinValue(Double minValue) {
        this.minValue = minValue;
        return this;
    }

    /** 最小值。 minimum: -1 maximum: 0
     * 
     * @return minValue */
    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Initial withMaxValue(Double maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /** 最大值。 minimum: 0 maximum: 1
     * 
     * @return maxValue */
    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Initial initial = (Initial) o;
        return Objects.equals(this.initialMethod, initial.initialMethod)
            && Objects.equals(this.meanValue, initial.meanValue)
            && Objects.equals(this.standardDeviation, initial.standardDeviation)
            && Objects.equals(this.minValue, initial.minValue) && Objects.equals(this.maxValue, initial.maxValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initialMethod, meanValue, standardDeviation, minValue, maxValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Initial {\n");
        sb.append("    initialMethod: ").append(toIndentedString(initialMethod)).append("\n");
        sb.append("    meanValue: ").append(toIndentedString(meanValue)).append("\n");
        sb.append("    standardDeviation: ").append(toIndentedString(standardDeviation)).append("\n");
        sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
