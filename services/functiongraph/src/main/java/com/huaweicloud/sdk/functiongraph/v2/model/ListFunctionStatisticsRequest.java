package com.huaweicloud.sdk.functiongraph.v2.model;

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
public class ListFunctionStatisticsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_urn")

    private String funcUrn;

    /**
     * 获取最近多少分钟内函数执行的指标。
     */
    public static final class PeriodEnum {

        /**
         * Enum _5 for value: "5"
         */
        public static final PeriodEnum _5 = new PeriodEnum("5");

        /**
         * Enum _15 for value: "15"
         */
        public static final PeriodEnum _15 = new PeriodEnum("15");

        /**
         * Enum _60 for value: "60"
         */
        public static final PeriodEnum _60 = new PeriodEnum("60");

        private static final Map<String, PeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeriodEnum> createStaticFields() {
            Map<String, PeriodEnum> map = new HashMap<>();
            map.put("5", _5);
            map.put("15", _15);
            map.put("60", _60);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PeriodEnum(String value) {
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
        public static PeriodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PeriodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PeriodEnum(value);
            }
            return result;
        }

        public static PeriodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PeriodEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeriodEnum) {
                return this.value.equals(((PeriodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private PeriodEnum period;

    public ListFunctionStatisticsRequest withFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
        return this;
    }

    /**
     * 函数的URN（Uniform Resource Name），唯一标识函数。
     * @return funcUrn
     */
    public String getFuncUrn() {
        return funcUrn;
    }

    public void setFuncUrn(String funcUrn) {
        this.funcUrn = funcUrn;
    }

    public ListFunctionStatisticsRequest withPeriod(PeriodEnum period) {
        this.period = period;
        return this;
    }

    /**
     * 获取最近多少分钟内函数执行的指标。
     * @return period
     */
    public PeriodEnum getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEnum period) {
        this.period = period;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFunctionStatisticsRequest listFunctionStatisticsRequest = (ListFunctionStatisticsRequest) o;
        return Objects.equals(this.funcUrn, listFunctionStatisticsRequest.funcUrn)
            && Objects.equals(this.period, listFunctionStatisticsRequest.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcUrn, period);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionStatisticsRequest {\n");
        sb.append("    funcUrn: ").append(toIndentedString(funcUrn)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
