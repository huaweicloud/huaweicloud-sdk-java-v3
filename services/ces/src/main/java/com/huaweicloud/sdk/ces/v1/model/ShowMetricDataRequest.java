package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowMetricDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    @JacksonXmlProperty(localName = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    @JacksonXmlProperty(localName = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.0")

    @JacksonXmlProperty(localName = "dim.0")

    private String dim0;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.1")

    @JacksonXmlProperty(localName = "dim.1")

    private String dim1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.2")

    @JacksonXmlProperty(localName = "dim.2")

    private String dim2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim.3")

    @JacksonXmlProperty(localName = "dim.3")

    private String dim3;

    /**
     * 数据聚合方式。支持的值为max, min, average, sum, variance。
     */
    public static final class FilterEnum {

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

        private static final Map<String, FilterEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilterEnum> createStaticFields() {
            Map<String, FilterEnum> map = new HashMap<>();
            map.put("max", MAX);
            map.put("min", MIN);
            map.put("average", AVERAGE);
            map.put("sum", SUM);
            map.put("variance", VARIANCE);
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

    @JacksonXmlProperty(localName = "filter")

    private FilterEnum filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    @JacksonXmlProperty(localName = "period")

    private Integer period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    @JacksonXmlProperty(localName = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    @JacksonXmlProperty(localName = "to")

    private Long to;

    public ShowMetricDataRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 指标命名空间，如：弹性云服务器的命名空间为SYS.ECS，文档数据库的命名空间为SYS.DDS，各服务的命名空间可查看：“[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ShowMetricDataRequest withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 资源的监控指标名称，如：弹性云服务器中的监控指标cpu_util，表示弹性服务器的CPU使用率；文档数据库中的指标mongo001_command_ps，表示command执行频率；各服务的指标名称可查看：“[服务指标名称](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ShowMetricDataRequest withDim0(String dim0) {
        this.dim0 = dim0;
        return this;
    }

    /**
     * 指标的第一层维度，目前最大支持4个维度，维度编号从0开始；维度格式为dim.0=key,value，如mongodb_cluster_id,4270ff17-aba3-4138-89fa-820594c39755；key为指标的维度信息，如：文档数据库服务，则第一层维度为mongodb_cluster_id，value为文档数据库实例ID；各服务资源的指标维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
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
     * 指标的第二层维度，目前最大支持4个维度，维度编号从0开始；维度格式为dim.1=key,value，如mongos_instance_id,c65d39d7-185c-4616-9aca-ad65703b15f9；key为指标的维度信息，如：文档数据库服务，则第二层维度为mongos_instance_id，value为文档数据库集群实例下的mongos节点ID；各资源的指标维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
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
     * 指标的第三层维度，目前最大支持4个维度，维度编号从0开始；维度格式为dim.2=key,value，如mongod_primary_instance_id,5f9498e9-36f8-4317-9ea1-ebe28cba99b4；key为指标的维度信息，如：文档数据库服务，则第三层维度为mongod_primary_instance_id，value为文档数据库实例下的主节点ID；各资源的指标维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return dim2
     */
    public String getDim2() {
        return dim2;
    }

    public void setDim2(String dim2) {
        this.dim2 = dim2;
    }

    public ShowMetricDataRequest withDim3(String dim3) {
        this.dim3 = dim3;
        return this;
    }

    /**
     * 指标的第四层维度，目前最大支持4个维度，维度编号从0开始；维度格式为dim.3=key,value，如mongod_secondary_instance_id,b46fa2c7-aac6-4ae3-9337-f4ea97f885cb；key为指标的维度信息，如：文档数据库服务，则第四层维度为mongod_secondary_instance_id，value为文档数据库实例下的备节点ID；各资源的指标维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return dim3
     */
    public String getDim3() {
        return dim3;
    }

    public void setDim3(String dim3) {
        this.dim3 = dim3;
    }

    public ShowMetricDataRequest withFilter(FilterEnum filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 数据聚合方式。支持的值为max, min, average, sum, variance。
     * @return filter
     */
    public FilterEnum getFilter() {
        return filter;
    }

    public void setFilter(FilterEnum filter) {
        this.filter = filter;
    }

    public ShowMetricDataRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 指标监控数据的聚合粒度，取值范围：1，300，1200，3600，14400，86400；1为监控资源的实时数据；300为聚合5分钟粒度数据，表示5分钟一个数据点；1200为聚合20分钟粒度数据，表示20分钟一个数据点；3600为聚合1小时粒度数据，表示1小时一个数据点；14400为聚合4小时粒度数据，表示4小时一个数据点；86400为聚合1天粒度数据，表示1天一个数据点；聚合解释可查看：“[聚合含义](https://support.huaweicloud.com/ces_faq/ces_faq_0009.html)”。
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public ShowMetricDataRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * 查询数据起始时间，UNIX时间戳，单位毫秒。建议from的值相对于当前时间向前偏移至少1个周期。由于聚合运算的过程是将一个聚合周期范围内的数据点聚合到周期起始边界上，如果将from和to的范围设置在聚合周期内，会因为聚合未完成而造成查询数据为空，所以建议from参数相对于当前时间向前偏移至少1个周期。以5分钟聚合周期为例：假设当前时间点为10:35，10:30~10:35之间的原始数据会被聚合到10:30这个点上，所以查询5分钟数据点时from参数应为10:30或之前。云监控会根据所选择的聚合粒度向前取整from参数；如：1607146998177。
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ShowMetricDataRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * 查询数据截止时间UNIX时间戳，单位毫秒。from必须小于to；如：1607150598177。
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
        return Objects.equals(this.namespace, showMetricDataRequest.namespace)
            && Objects.equals(this.metricName, showMetricDataRequest.metricName)
            && Objects.equals(this.dim0, showMetricDataRequest.dim0)
            && Objects.equals(this.dim1, showMetricDataRequest.dim1)
            && Objects.equals(this.dim2, showMetricDataRequest.dim2)
            && Objects.equals(this.dim3, showMetricDataRequest.dim3)
            && Objects.equals(this.filter, showMetricDataRequest.filter)
            && Objects.equals(this.period, showMetricDataRequest.period)
            && Objects.equals(this.from, showMetricDataRequest.from)
            && Objects.equals(this.to, showMetricDataRequest.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, metricName, dim0, dim1, dim2, dim3, filter, period, from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetricDataRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    dim0: ").append(toIndentedString(dim0)).append("\n");
        sb.append("    dim1: ").append(toIndentedString(dim1)).append("\n");
        sb.append("    dim2: ").append(toIndentedString(dim2)).append("\n");
        sb.append("    dim3: ").append(toIndentedString(dim3)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
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
