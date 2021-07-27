package com.huaweicloud.sdk.ces.v1.model;




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
     * 用于标识结果排序方法。  取值说明，默认为desc：  asc，升序 desc，降序
     */
    public static final class OrderEnum {

        
        /**
         * Enum ASC for value: "asc"
         */
        public static final OrderEnum ASC = new OrderEnum("asc");
        
        /**
         * Enum DESC for value: "desc"
         */
        public static final OrderEnum DESC = new OrderEnum("desc");
        

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderEnum(String value) {
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
        public static OrderEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OrderEnum(value);
            }
            return result;
        }

        public static OrderEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OrderEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderEnum) {
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
     * 指标的维度，目前最大支持3个维度，从0开始；维度格式为dim.{i}=key,value，最大值为256。 例如：dim.0=instance_id,6f3c6f91-4b24-4e1b-b7d1-a94ac1cb011d；各服务资源的指标维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
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
     * 指标的维度，目前最大支持3个维度，从0开始；维度格式为dim.{i}=key,value，最大值为256。 例如：dim.1=instance_id,6f3c6f91-4b24-4e1b-b7d1-a94ac1cb011d；各服务资源的指标维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
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
     * 指标的维度，目前最大支持3个维度，从0开始；维度格式为dim.{i}=key,value，最大值为256。 例如：dim.2=instance_id,6f3c6f91-4b24-4e1b-b7d1-a94ac1cb011d；各服务资源的指标维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
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
     * 取值范围(0,1000]，默认值为1000。  用于限制结果数据条数。
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
     * 指标名称，例如弹性云服务器监控指标中的cpu_util；各服务的指标名称可查看：“[服务指标名称](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
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
     * 指标命名空间，格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_，总长度最短为3，最大为32；各服务的命名空间可查看：“[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
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
     * 用于标识结果排序方法。  取值说明，默认为desc：  asc，升序 desc，降序
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
     * 分页起始值，格式为：namespace.metric_name.key:value 例如：start=SYS.ECS.cpu_util.instance_id:d9112af5-6913-4f3b-bd0a-3f96711e004d
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

