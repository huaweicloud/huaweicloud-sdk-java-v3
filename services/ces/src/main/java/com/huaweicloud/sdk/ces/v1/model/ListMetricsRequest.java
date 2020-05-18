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
public class ListMetricsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dim.0")
    
    private String dim0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dim.1")
    
    private String dim1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dim.2")
    
    private String dim2;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metric_name")
    
    private String metricName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;
    /**
     * Gets or Sets order
     */
    public static class OrderEnum {

        
        /**
         * Enum ASC for value: "asc"
         */
        public static final OrderEnum ASC = new OrderEnum("asc");

        
        /**
         * Enum DESC for value: "desc"
         */
        public static final OrderEnum DESC = new OrderEnum("desc");

        

        public static Map<String, OrderEnum> staticFields =
                new HashMap<String, OrderEnum>() {
                    { 
                        put("asc", ASC);
                        put("desc", DESC);
                    }
                };

        private String value;

        OrderEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OrderEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OrderEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OrderEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OrderEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OrderEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OrderEnum) {
                return this.value.equals(((OrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order")
    
    private OrderEnum order;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start")
    
    private String start;

    public ListMetricsRequest withDim0(String dim0) {
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

    public ListMetricsRequest withDim1(String dim1) {
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

    public ListMetricsRequest withDim2(String dim2) {
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

    public ListMetricsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListMetricsRequest withMetricName(String metricName) {
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

    public ListMetricsRequest withNamespace(String namespace) {
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

    public ListMetricsRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    


    /**
     * Get order
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public ListMetricsRequest withStart(String start) {
        this.start = start;
        return this;
    }

    


    /**
     * Get start
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMetricsRequest listMetricsRequest = (ListMetricsRequest) o;
        return Objects.equals(this.dim0, listMetricsRequest.dim0) &&
            Objects.equals(this.dim1, listMetricsRequest.dim1) &&
            Objects.equals(this.dim2, listMetricsRequest.dim2) &&
            Objects.equals(this.limit, listMetricsRequest.limit) &&
            Objects.equals(this.metricName, listMetricsRequest.metricName) &&
            Objects.equals(this.namespace, listMetricsRequest.namespace) &&
            Objects.equals(this.order, listMetricsRequest.order) &&
            Objects.equals(this.start, listMetricsRequest.start);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dim0, dim1, dim2, limit, metricName, namespace, order, start);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricsRequest {\n");
            sb.append("    dim0: ").append(toIndentedString(dim0)).append("\n");
            sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
            sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
            sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
            sb.append("    order: ").append(toIndentedString(order)).append("\n");
            sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

