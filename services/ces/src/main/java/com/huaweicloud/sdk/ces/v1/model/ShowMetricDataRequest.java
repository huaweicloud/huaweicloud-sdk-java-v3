package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class ShowMetricDataRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dim.0")
    
    private String dim0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dim.1")
    
    private String dim1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dim.2")
    
    private String dim2;
    /**
     * Gets or Sets filter
     */
    public static class FilterEnum {

        
        /**
         * Enum MAX for value: "max"
         */
        public static final FilterEnum MAX = new FilterEnum("max");

        
        /**
         * Enum MIN for value: "min"
         */
        public static final FilterEnum MIN = new FilterEnum("min");

        
        /**
         * Enum AVERAGE for value: "average"
         */
        public static final FilterEnum AVERAGE = new FilterEnum("average");

        
        /**
         * Enum SUM for value: "sum"
         */
        public static final FilterEnum SUM = new FilterEnum("sum");

        
        /**
         * Enum VARIANCE for value: "variance"
         */
        public static final FilterEnum VARIANCE = new FilterEnum("variance");

        

        public static Map<String, FilterEnum> staticFields =
                new HashMap<String, FilterEnum>() {
                    { 
                        put("max", MAX);
                        put("min", MIN);
                        put("average", AVERAGE);
                        put("sum", SUM);
                        put("variance", VARIANCE);
                    }
                };

        private String value;

        FilterEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FilterEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            FilterEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new FilterEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static FilterEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            FilterEnum result = staticFields.get(value);
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
    @JsonProperty(value="from")
    
    private Long from;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_name")
    
    private String metricName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period")
    
    private Integer period;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="to")
    
    private Long to;

    public ShowMetricDataRequest withDim0(String dim0) {
        this.dim0 = dim0;
        return this;
    }

    


    /**
     * Get dim0
     * @return dim0
     */
    public String getDim0() {
        return dim0;
    }

    public void setDim0(String dim0) {
        this.dim0 = dim0;
    }

    public ShowMetricDataRequest withDim1(String dim1) {
        this.dim1 = dim1;
        return this;
    }

    


    /**
     * Get dim1
     * @return dim1
     */
    public String getDim1() {
        return dim1;
    }

    public void setDim1(String dim1) {
        this.dim1 = dim1;
    }

    public ShowMetricDataRequest withDim2(String dim2) {
        this.dim2 = dim2;
        return this;
    }

    


    /**
     * Get dim2
     * @return dim2
     */
    public String getDim2() {
        return dim2;
    }

    public void setDim2(String dim2) {
        this.dim2 = dim2;
    }

    public ShowMetricDataRequest withFilter(FilterEnum filter) {
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

    public ShowMetricDataRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    


    /**
     * Get from
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ShowMetricDataRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    


    /**
     * Get metricName
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ShowMetricDataRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * Get namespace
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ShowMetricDataRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    


    /**
     * Get period
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public ShowMetricDataRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    


    /**
     * Get to
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMetricDataRequest showMetricDataRequest = (ShowMetricDataRequest) o;
        return Objects.equals(this.dim0, showMetricDataRequest.dim0) &&
            Objects.equals(this.dim1, showMetricDataRequest.dim1) &&
            Objects.equals(this.dim2, showMetricDataRequest.dim2) &&
            Objects.equals(this.filter, showMetricDataRequest.filter) &&
            Objects.equals(this.from, showMetricDataRequest.from) &&
            Objects.equals(this.metricName, showMetricDataRequest.metricName) &&
            Objects.equals(this.namespace, showMetricDataRequest.namespace) &&
            Objects.equals(this.period, showMetricDataRequest.period) &&
            Objects.equals(this.to, showMetricDataRequest.to);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dim0, dim1, dim2, filter, from, metricName, namespace, period, to);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetricDataRequest {\n");
            sb.append("    dim0: ").append(toIndentedString(dim0)).append("\n");
            sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
            sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
            sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
            sb.append("    from: ").append(toIndentedString(from)).append("\n");
            sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
            sb.append("    period: ").append(toIndentedString(period)).append("\n");
            sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

