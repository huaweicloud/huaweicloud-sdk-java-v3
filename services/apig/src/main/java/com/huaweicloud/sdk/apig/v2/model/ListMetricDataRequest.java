package com.huaweicloud.sdk.apig.v2.model;

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
public class ListMetricDataRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    /**
     * 指标维度 - inbound_eip：入口公网带宽，仅ELB类型实例支持 - outbound_eip：出口公网带宽
     */
    public static final class DimEnum {

        /**
         * Enum INBOUND for value: "inbound"
         */
        public static final DimEnum INBOUND = new DimEnum("inbound");

        /**
         * Enum OUTBOUND for value: "outbound"
         */
        public static final DimEnum OUTBOUND = new DimEnum("outbound");

        private static final Map<String, DimEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DimEnum> createStaticFields() {
            Map<String, DimEnum> map = new HashMap<>();
            map.put("inbound", INBOUND);
            map.put("outbound", OUTBOUND);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DimEnum(String value) {
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
        public static DimEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DimEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DimEnum(value);
            }
            return result;
        }

        public static DimEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DimEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DimEnum) {
                return this.value.equals(((DimEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dim")

    private DimEnum dim;

    /**
     * 指标名称 - upstream_bandwidth：出网带宽 - downstream_bandwidth：入网带宽 - upstream_bandwidth_usage：出网带宽使用率 - downstream_bandwidth_usage：入网带宽使用率 - up_stream：出网流量 - down_stream：入网流量
     */
    public static final class MetricNameEnum {

        /**
         * Enum UPSTREAM_BANDWIDTH for value: "upstream_bandwidth"
         */
        public static final MetricNameEnum UPSTREAM_BANDWIDTH = new MetricNameEnum("upstream_bandwidth");

        /**
         * Enum DOWNSTREAM_BANDWIDTH for value: "downstream_bandwidth"
         */
        public static final MetricNameEnum DOWNSTREAM_BANDWIDTH = new MetricNameEnum("downstream_bandwidth");

        /**
         * Enum UPSTREAM_BANDWIDTH_USAGE for value: "upstream_bandwidth_usage"
         */
        public static final MetricNameEnum UPSTREAM_BANDWIDTH_USAGE = new MetricNameEnum("upstream_bandwidth_usage");

        /**
         * Enum DOWNSTREAM_BANDWIDTH_USAGE for value: "downstream_bandwidth_usage"
         */
        public static final MetricNameEnum DOWNSTREAM_BANDWIDTH_USAGE =
            new MetricNameEnum("downstream_bandwidth_usage");

        /**
         * Enum UP_STREAM for value: "up_stream"
         */
        public static final MetricNameEnum UP_STREAM = new MetricNameEnum("up_stream");

        /**
         * Enum DOWN_STREAM for value: "down_stream"
         */
        public static final MetricNameEnum DOWN_STREAM = new MetricNameEnum("down_stream");

        private static final Map<String, MetricNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MetricNameEnum> createStaticFields() {
            Map<String, MetricNameEnum> map = new HashMap<>();
            map.put("upstream_bandwidth", UPSTREAM_BANDWIDTH);
            map.put("downstream_bandwidth", DOWNSTREAM_BANDWIDTH);
            map.put("upstream_bandwidth_usage", UPSTREAM_BANDWIDTH_USAGE);
            map.put("downstream_bandwidth_usage", DOWNSTREAM_BANDWIDTH_USAGE);
            map.put("up_stream", UP_STREAM);
            map.put("down_stream", DOWN_STREAM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MetricNameEnum(String value) {
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
        public static MetricNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MetricNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MetricNameEnum(value);
            }
            return result;
        }

        public static MetricNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MetricNameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MetricNameEnum) {
                return this.value.equals(((MetricNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private MetricNameEnum metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    /**
     * 监控数据粒度。 - 1：实时数据 - 300：5分钟粒度 - 1200：20分钟粒度 - 3600：1小时粒度 - 14400：4小时粒度 - 86400：1天粒度
     */
    public static final class PeriodEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final PeriodEnum NUMBER_1 = new PeriodEnum(1);

        /**
         * Enum NUMBER_300 for value: 300
         */
        public static final PeriodEnum NUMBER_300 = new PeriodEnum(300);

        /**
         * Enum NUMBER_1200 for value: 1200
         */
        public static final PeriodEnum NUMBER_1200 = new PeriodEnum(1200);

        /**
         * Enum NUMBER_3600 for value: 3600
         */
        public static final PeriodEnum NUMBER_3600 = new PeriodEnum(3600);

        /**
         * Enum NUMBER_14400 for value: 14400
         */
        public static final PeriodEnum NUMBER_14400 = new PeriodEnum(14400);

        /**
         * Enum NUMBER_86400 for value: 86400
         */
        public static final PeriodEnum NUMBER_86400 = new PeriodEnum(86400);

        private static final Map<Integer, PeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PeriodEnum> createStaticFields() {
            Map<Integer, PeriodEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(300, NUMBER_300);
            map.put(1200, NUMBER_1200);
            map.put(3600, NUMBER_3600);
            map.put(14400, NUMBER_14400);
            map.put(86400, NUMBER_86400);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PeriodEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PeriodEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            PeriodEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PeriodEnum(value);
            }
            return result;
        }

        public static PeriodEnum valueOf(Integer value) {
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

    /**
     * 数据聚合方式。 - average：聚合周期内指标数据的平均值。 - max：聚合周期内指标数据的最大值。 - min：聚合周期内指标数据的最小值。 - sum：聚合周期内指标数据的求和值。 - variance：聚合周期内指标数据的方差。
     */
    public static final class FilterEnum {

        /**
         * Enum AVERAGE for value: "average"
         */
        public static final FilterEnum AVERAGE = new FilterEnum("average");

        /**
         * Enum MAX for value: "max"
         */
        public static final FilterEnum MAX = new FilterEnum("max");

        /**
         * Enum MIN for value: "min"
         */
        public static final FilterEnum MIN = new FilterEnum("min");

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
            map.put("average", AVERAGE);
            map.put("max", MAX);
            map.put("min", MIN);
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

    private FilterEnum filter;

    public ListMetricDataRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，在API网关控制台的“实例信息”中获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListMetricDataRequest withDim(DimEnum dim) {
        this.dim = dim;
        return this;
    }

    /**
     * 指标维度 - inbound_eip：入口公网带宽，仅ELB类型实例支持 - outbound_eip：出口公网带宽
     * @return dim
     */
    public DimEnum getDim() {
        return dim;
    }

    public void setDim(DimEnum dim) {
        this.dim = dim;
    }

    public ListMetricDataRequest withMetricName(MetricNameEnum metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 指标名称 - upstream_bandwidth：出网带宽 - downstream_bandwidth：入网带宽 - upstream_bandwidth_usage：出网带宽使用率 - downstream_bandwidth_usage：入网带宽使用率 - up_stream：出网流量 - down_stream：入网流量
     * @return metricName
     */
    public MetricNameEnum getMetricName() {
        return metricName;
    }

    public void setMetricName(MetricNameEnum metricName) {
        this.metricName = metricName;
    }

    public ListMetricDataRequest withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * 查询数据起始时间，UNIX时间戳，单位毫秒。
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public ListMetricDataRequest withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * 查询数据截止时间UNIX时间戳，单位毫秒。from必须小于to。
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public ListMetricDataRequest withPeriod(PeriodEnum period) {
        this.period = period;
        return this;
    }

    /**
     * 监控数据粒度。 - 1：实时数据 - 300：5分钟粒度 - 1200：20分钟粒度 - 3600：1小时粒度 - 14400：4小时粒度 - 86400：1天粒度
     * @return period
     */
    public PeriodEnum getPeriod() {
        return period;
    }

    public void setPeriod(PeriodEnum period) {
        this.period = period;
    }

    public ListMetricDataRequest withFilter(FilterEnum filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 数据聚合方式。 - average：聚合周期内指标数据的平均值。 - max：聚合周期内指标数据的最大值。 - min：聚合周期内指标数据的最小值。 - sum：聚合周期内指标数据的求和值。 - variance：聚合周期内指标数据的方差。
     * @return filter
     */
    public FilterEnum getFilter() {
        return filter;
    }

    public void setFilter(FilterEnum filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMetricDataRequest listMetricDataRequest = (ListMetricDataRequest) o;
        return Objects.equals(this.instanceId, listMetricDataRequest.instanceId)
            && Objects.equals(this.dim, listMetricDataRequest.dim)
            && Objects.equals(this.metricName, listMetricDataRequest.metricName)
            && Objects.equals(this.from, listMetricDataRequest.from)
            && Objects.equals(this.to, listMetricDataRequest.to)
            && Objects.equals(this.period, listMetricDataRequest.period)
            && Objects.equals(this.filter, listMetricDataRequest.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, dim, metricName, from, to, period, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricDataRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    dim: ").append(toIndentedString(dim)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
