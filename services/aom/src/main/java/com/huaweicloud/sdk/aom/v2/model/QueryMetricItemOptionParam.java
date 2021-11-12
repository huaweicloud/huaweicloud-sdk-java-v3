package com.huaweicloud.sdk.aom.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 参数项。
 */
public class QueryMetricItemOptionParam  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dimensions")
    
    
    private List<Dimension> dimensions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metricName")
    
    
    private String metricName;
    /**
     * 取值范围 PAAS.CONTAINER、PAAS.NODE、PAAS.SLA、PAAS.AGGR、CUSTOMMETRICS等 指标命名空间。 PAAS.CONTAINER：应用指标； PAAS.NODE：节点指标； PAAS.SLA：SLA指标； PAAS.AGGR：集群指标； CUSTOMMETRICS：自定义指标
     */
    public static final class NamespaceEnum {

        
        /**
         * Enum PAAS_CONTAINER for value: "PAAS.CONTAINER"
         */
        public static final NamespaceEnum PAAS_CONTAINER = new NamespaceEnum("PAAS.CONTAINER");
        
        /**
         * Enum PAAS_NODE for value: "PAAS.NODE"
         */
        public static final NamespaceEnum PAAS_NODE = new NamespaceEnum("PAAS.NODE");
        
        /**
         * Enum PAAS_SLA for value: "PAAS.SLA"
         */
        public static final NamespaceEnum PAAS_SLA = new NamespaceEnum("PAAS.SLA");
        
        /**
         * Enum PAAS_AGGR for value: "PAAS.AGGR"
         */
        public static final NamespaceEnum PAAS_AGGR = new NamespaceEnum("PAAS.AGGR");
        
        /**
         * Enum CUSTOMMETRICS for value: "CUSTOMMETRICS"
         */
        public static final NamespaceEnum CUSTOMMETRICS = new NamespaceEnum("CUSTOMMETRICS");
        

        private static final Map<String, NamespaceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NamespaceEnum> createStaticFields() {
            Map<String, NamespaceEnum> map = new HashMap<>();
            map.put("PAAS.CONTAINER", PAAS_CONTAINER);
            map.put("PAAS.NODE", PAAS_NODE);
            map.put("PAAS.SLA", PAAS_SLA);
            map.put("PAAS.AGGR", PAAS_AGGR);
            map.put("CUSTOMMETRICS", CUSTOMMETRICS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NamespaceEnum(String value) {
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
        public static NamespaceEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            NamespaceEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NamespaceEnum(value);
            }
            return result;
        }

        public static NamespaceEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            NamespaceEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NamespaceEnum) {
                return this.value.equals(((NamespaceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    
    private NamespaceEnum namespace;

    public QueryMetricItemOptionParam withDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    
    public QueryMetricItemOptionParam addDimensionsItem(Dimension dimensionsItem) {
        if(this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public QueryMetricItemOptionParam withDimensions(Consumer<List<Dimension>> dimensionsSetter) {
        if(this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 指标维度列表。
     * @return dimensions
     */
    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }

    

    public QueryMetricItemOptionParam withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    


    /**
     * |  取值范围 名称长度为1~255个字符 指标名称。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    

    public QueryMetricItemOptionParam withNamespace(NamespaceEnum namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 取值范围 PAAS.CONTAINER、PAAS.NODE、PAAS.SLA、PAAS.AGGR、CUSTOMMETRICS等 指标命名空间。 PAAS.CONTAINER：应用指标； PAAS.NODE：节点指标； PAAS.SLA：SLA指标； PAAS.AGGR：集群指标； CUSTOMMETRICS：自定义指标
     * @return namespace
     */
    public NamespaceEnum getNamespace() {
        return namespace;
    }

    public void setNamespace(NamespaceEnum namespace) {
        this.namespace = namespace;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryMetricItemOptionParam queryMetricItemOptionParam = (QueryMetricItemOptionParam) o;
        return Objects.equals(this.dimensions, queryMetricItemOptionParam.dimensions) &&
            Objects.equals(this.metricName, queryMetricItemOptionParam.metricName) &&
            Objects.equals(this.namespace, queryMetricItemOptionParam.namespace);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dimensions, metricName, namespace);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryMetricItemOptionParam {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

