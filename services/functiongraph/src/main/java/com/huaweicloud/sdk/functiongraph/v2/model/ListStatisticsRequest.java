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
     * 参数过滤器。 monitor_data: 查询统计信息。 monthly_report：查询月度统计信息。
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option")

    private String option;

    public ListStatisticsRequest withFilter(FilterEnum filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 参数过滤器。 monitor_data: 查询统计信息。 monthly_report：查询月度统计信息。
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
     * 时间段单位为分钟，与filter参数metric配合使用。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public ListStatisticsRequest withOption(String option) {
        this.option = option;
        return this;
    }

    /**
     * 月度统计的维度，filter参数取值为monthly_report时才生效。 当取值不在以上范围时，默认取\"0\"。 - \"0\": 表示统计本月。 - \"1\": 表示统计上月。 - \"2\": 表示统计最近三个月。 - \"3\": 表示统计最近六个月。
     * @return option
     */
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
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
