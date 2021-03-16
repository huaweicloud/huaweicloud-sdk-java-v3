package com.huaweicloud.sdk.functiongraph.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListStatisticsRequest  {

    /**
     * Gets or Sets filter
     */
    public static final class FilterEnum {

        
        /**
         * Enum MONTHLY_STATISTICS for value: "monthly_statistics"
         */
        public static final FilterEnum MONTHLY_STATISTICS = new FilterEnum("monthly_statistics");
        
        /**
         * Enum METRIC for value: "metric"
         */
        public static final FilterEnum METRIC = new FilterEnum("metric");
        

        private static final Map<String, FilterEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilterEnum> createStaticFields() {
            Map<String, FilterEnum> map = new HashMap<>();
            map.put("monthly_statistics", MONTHLY_STATISTICS);
            map.put("metric", METRIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FilterEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FilterEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            FilterEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FilterEnum(value);
            }
            return result;
        }

        public static FilterEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof FilterEnum) {
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
    @JsonProperty(value="filter")
    
    private FilterEnum filter;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    
    private String period;
    /**
     * Gets or Sets monthCode
     */
    public static final class MonthCodeEnum {

        
        /**
         * Enum _0 for value: "0"
         */
        public static final MonthCodeEnum _0 = new MonthCodeEnum("0");
        
        /**
         * Enum _1 for value: "1"
         */
        public static final MonthCodeEnum _1 = new MonthCodeEnum("1");
        
        /**
         * Enum _2 for value: "2"
         */
        public static final MonthCodeEnum _2 = new MonthCodeEnum("2");
        
        /**
         * Enum _3 for value: "3"
         */
        public static final MonthCodeEnum _3 = new MonthCodeEnum("3");
        

        private static final Map<String, MonthCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MonthCodeEnum> createStaticFields() {
            Map<String, MonthCodeEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            map.put("2", _2);
            map.put("3", _3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MonthCodeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MonthCodeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            MonthCodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MonthCodeEnum(value);
            }
            return result;
        }

        public static MonthCodeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            MonthCodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof MonthCodeEnum) {
                return this.value.equals(((MonthCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="month_code")
    
    private MonthCodeEnum monthCode;

    public ListStatisticsRequest withFilter(FilterEnum filter) {
        this.filter = filter;
        return this;
    }

    


    /**
     * Get filter
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
     * Get period
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    

    public ListStatisticsRequest withMonthCode(MonthCodeEnum monthCode) {
        this.monthCode = monthCode;
        return this;
    }

    


    /**
     * Get monthCode
     * @return monthCode
     */
    public MonthCodeEnum getMonthCode() {
        return monthCode;
    }

    public void setMonthCode(MonthCodeEnum monthCode) {
        this.monthCode = monthCode;
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
        return Objects.equals(this.filter, listStatisticsRequest.filter) &&
            Objects.equals(this.period, listStatisticsRequest.period) &&
            Objects.equals(this.monthCode, listStatisticsRequest.monthCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(filter, period, monthCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatisticsRequest {\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    monthCode: ").append(toIndentedString(monthCode)).append("\n");
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

