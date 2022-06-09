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
public class ListStatisticsRequest {

    /**
     * 参数过滤器。
     */
    public static final class FilterEnum {

        /**
         * Enum MONITOR_DATA for value: "monitor_data"
         */
        public static final FilterEnum MONITOR_DATA = new FilterEnum("monitor_data");

        /**
         * Enum MONTHLY_REPORT for value: "monthly_report"
         */
        public static final FilterEnum MONTHLY_REPORT = new FilterEnum("monthly_report");

        private static final Map<String, FilterEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilterEnum> createStaticFields() {
            Map<String, FilterEnum> map = new HashMap<>();
            map.put("monitor_data", MONITOR_DATA);
            map.put("monthly_report", MONTHLY_REPORT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FilterEnum(String value) {
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
        public static FilterEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FilterEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FilterEnum(value);
            }
            return result;
        }

        public static FilterEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FilterEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FilterEnum) {
                return this.value.equals(((FilterEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private FilterEnum filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    /**
     * 月度统计的维度，filter参数取值为monthly_report时才生效。 - \"0\":表示统计本月。 - \"1\":表示统计上月。 - \"2\":表示统计最近三个月。 - \"3\":表示统计最近六个月。 - 当取值不在以上范围时，默认取\"0”。
     */
    public static final class OptionEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final OptionEnum _0 = new OptionEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final OptionEnum _1 = new OptionEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final OptionEnum _2 = new OptionEnum("2");

        /**
         * Enum _3 for value: "3"
         */
        public static final OptionEnum _3 = new OptionEnum("3");

        private static final Map<String, OptionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OptionEnum> createStaticFields() {
            Map<String, OptionEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            map.put("2", _2);
            map.put("3", _3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OptionEnum(String value) {
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
        public static OptionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OptionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OptionEnum(value);
            }
            return result;
        }

        public static OptionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OptionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OptionEnum) {
                return this.value.equals(((OptionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option")

    private OptionEnum option;

    public ListStatisticsRequest withFilter(FilterEnum filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 参数过滤器。
     * @return filter
     */
    public FilterEnum getFilter() {
        return filter;
    }

    public void setFilter(FilterEnum filter) {
        this.filter = filter;
    }

    public ListStatisticsRequest withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 时间段单位为分钟，与filter参数配合使用。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public ListStatisticsRequest withOption(OptionEnum option) {
        this.option = option;
        return this;
    }

    /**
     * 月度统计的维度，filter参数取值为monthly_report时才生效。 - \"0\":表示统计本月。 - \"1\":表示统计上月。 - \"2\":表示统计最近三个月。 - \"3\":表示统计最近六个月。 - 当取值不在以上范围时，默认取\"0”。
     * @return option
     */
    public OptionEnum getOption() {
        return option;
    }

    public void setOption(OptionEnum option) {
        this.option = option;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStatisticsRequest listStatisticsRequest = (ListStatisticsRequest) o;
        return Objects.equals(this.filter, listStatisticsRequest.filter)
            && Objects.equals(this.period, listStatisticsRequest.period)
            && Objects.equals(this.option, listStatisticsRequest.option);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, period, option);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatisticsRequest {\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    option: ").append(toIndentedString(option)).append("\n");
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
