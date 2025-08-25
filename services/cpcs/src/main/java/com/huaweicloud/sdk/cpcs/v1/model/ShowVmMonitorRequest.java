package com.huaweicloud.sdk.cpcs.v1.model;

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
public class ShowVmMonitorRequest {

    /**
     * 所属空间，分别从不同的来源获取监控数据，有：ECS，DHSM
     */
    public static final class NamespaceEnum {

        /**
         * Enum ECS for value: "ECS"
         */
        public static final NamespaceEnum ECS = new NamespaceEnum("ECS");

        /**
         * Enum DHSM for value: "DHSM"
         */
        public static final NamespaceEnum DHSM = new NamespaceEnum("DHSM");

        private static final Map<String, NamespaceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NamespaceEnum> createStaticFields() {
            Map<String, NamespaceEnum> map = new HashMap<>();
            map.put("ECS", ECS);
            map.put("DHSM", DHSM);
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
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NamespaceEnum(value));
        }

        public static NamespaceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "namespace")

    private NamespaceEnum namespace;

    /**
     * 指标名称，有：mem_util，cpu_uttl，network_outgoing_bytes_rate_inband
     */
    public static final class MetricNameEnum {

        /**
         * Enum MEM_UTIL for value: "mem_util"
         */
        public static final MetricNameEnum MEM_UTIL = new MetricNameEnum("mem_util");

        /**
         * Enum CPU_UTTL for value: "cpu_uttl"
         */
        public static final MetricNameEnum CPU_UTTL = new MetricNameEnum("cpu_uttl");

        /**
         * Enum NETWORK_OUTGOING_BYTES_RATE_INBAND for value: "network_outgoing_bytes_rate_inband"
         */
        public static final MetricNameEnum NETWORK_OUTGOING_BYTES_RATE_INBAND =
            new MetricNameEnum("network_outgoing_bytes_rate_inband");

        private static final Map<String, MetricNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MetricNameEnum> createStaticFields() {
            Map<String, MetricNameEnum> map = new HashMap<>();
            map.put("mem_util", MEM_UTIL);
            map.put("cpu_uttl", CPU_UTTL);
            map.put("network_outgoing_bytes_rate_inband", NETWORK_OUTGOING_BYTES_RATE_INBAND);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MetricNameEnum(value));
        }

        public static MetricNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vsm_id")

    private String vsmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Integer period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    public ShowVmMonitorRequest withNamespace(NamespaceEnum namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 所属空间，分别从不同的来源获取监控数据，有：ECS，DHSM
     * @return namespace
     */
    public NamespaceEnum getNamespace() {
        return namespace;
    }

    public void setNamespace(NamespaceEnum namespace) {
        this.namespace = namespace;
    }

    public ShowVmMonitorRequest withMetricName(MetricNameEnum metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 指标名称，有：mem_util，cpu_uttl，network_outgoing_bytes_rate_inband
     * @return metricName
     */
    public MetricNameEnum getMetricName() {
        return metricName;
    }

    public void setMetricName(MetricNameEnum metricName) {
        this.metricName = metricName;
    }

    public ShowVmMonitorRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id，默认空字符串，默认查询所有实例。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowVmMonitorRequest withVsmId(String vsmId) {
        this.vsmId = vsmId;
        return this;
    }

    /**
     * 虚拟机id
     * @return vsmId
     */
    public String getVsmId() {
        return vsmId;
    }

    public void setVsmId(String vsmId) {
        this.vsmId = vsmId;
    }

    public ShowVmMonitorRequest withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * 查询时间范围的起始时间，毫秒时间戳，默认0，默认查询从三天前。
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ShowVmMonitorRequest withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * 查询时间范围的终止时间，毫秒时间戳，默认0，默认查询到当前时间。
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ShowVmMonitorRequest withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 统计数据周期，默认0，默认周期为5分钟
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public ShowVmMonitorRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 统计值类型，默认min，默认查询最小值
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVmMonitorRequest that = (ShowVmMonitorRequest) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.vsmId, that.vsmId)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.period, that.period) && Objects.equals(this.filter, that.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, metricName, instanceId, vsmId, from, to, period, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVmMonitorRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    vsmId: ").append(toIndentedString(vsmId)).append("\n");
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
