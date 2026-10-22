package com.huaweicloud.sdk.aidatalake.v2.model;

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
public class ShowV2ComputesMetricsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    /**
     * **参数解释**：查询时间步长。 **约束限制**：不涉及。 **取值范围**：单位秒。   - 60：每分钟一个点。   - 3600：每1小时一个点。   - 86400：每天一个点。 **默认取值**：60。 
     */
    public static final class StepEnum {

        /**
         * Enum NUMBER_60 for value: 60
         */
        public static final StepEnum NUMBER_60 = new StepEnum(60);

        /**
         * Enum NUMBER_3600 for value: 3600
         */
        public static final StepEnum NUMBER_3600 = new StepEnum(3600);

        /**
         * Enum NUMBER_86400 for value: 86400
         */
        public static final StepEnum NUMBER_86400 = new StepEnum(86400);

        private static final Map<Integer, StepEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StepEnum> createStaticFields() {
            Map<Integer, StepEnum> map = new HashMap<>();
            map.put(60, NUMBER_60);
            map.put(3600, NUMBER_3600);
            map.put(86400, NUMBER_86400);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StepEnum(Integer value) {
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
        public static StepEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StepEnum(value));
        }

        public static StepEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StepEnum) {
                return this.value.equals(((StepEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private StepEnum step;

    /**
     * **参数解释**：指标名称。 **约束限制**：不涉及。 **取值范围**：   - CPU：资源池CPU使用率。   - MEM：资源池内存使用率。   - NPU：资源池NPU使用率。   - GPU：资源池GPU使用率。 **默认取值**：不涉及。 
     */
    public static final class MetricNameEnum {

        /**
         * Enum CPU for value: "CPU"
         */
        public static final MetricNameEnum CPU = new MetricNameEnum("CPU");

        /**
         * Enum NPU for value: "NPU"
         */
        public static final MetricNameEnum NPU = new MetricNameEnum("NPU");

        /**
         * Enum GPU for value: "GPU"
         */
        public static final MetricNameEnum GPU = new MetricNameEnum("GPU");

        /**
         * Enum MEM for value: "MEM"
         */
        public static final MetricNameEnum MEM = new MetricNameEnum("MEM");

        private static final Map<String, MetricNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MetricNameEnum> createStaticFields() {
            Map<String, MetricNameEnum> map = new HashMap<>();
            map.put("CPU", CPU);
            map.put("NPU", NPU);
            map.put("GPU", GPU);
            map.put("MEM", MEM);
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
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_ids")

    private String computeIds;

    public ShowV2ComputesMetricsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：**参数解释**：工作空间ID，可通过[获取工作空间ID](aidatalake_02_0044.xml)获取。 **约束限制**：不涉及。  **取值范围**：长度为32-36个字符，支持大小写英文字母、数字、连字符。 **默认取值**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowV2ComputesMetricsRequest withStep(StepEnum step) {
        this.step = step;
        return this;
    }

    /**
     * **参数解释**：查询时间步长。 **约束限制**：不涉及。 **取值范围**：单位秒。   - 60：每分钟一个点。   - 3600：每1小时一个点。   - 86400：每天一个点。 **默认取值**：60。 
     * @return step
     */
    public StepEnum getStep() {
        return step;
    }

    public void setStep(StepEnum step) {
        this.step = step;
    }

    public ShowV2ComputesMetricsRequest withMetricName(MetricNameEnum metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * **参数解释**：指标名称。 **约束限制**：不涉及。 **取值范围**：   - CPU：资源池CPU使用率。   - MEM：资源池内存使用率。   - NPU：资源池NPU使用率。   - GPU：资源池GPU使用率。 **默认取值**：不涉及。 
     * @return metricName
     */
    public MetricNameEnum getMetricName() {
        return metricName;
    }

    public void setMetricName(MetricNameEnum metricName) {
        this.metricName = metricName;
    }

    public ShowV2ComputesMetricsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：开始时间。 **约束限制**：不涉及。 **取值范围**：时间戳，单位秒。 **默认取值**：不涉及。 
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowV2ComputesMetricsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：结束时间。 **约束限制**：不涉及。 **取值范围**：时间戳，单位秒。 **默认取值**：不涉及。 
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowV2ComputesMetricsRequest withComputeIds(String computeIds) {
        this.computeIds = computeIds;
        return this;
    }

    /**
     * **参数解释**：资源池ids，多个用英文逗号分割。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：1~1110个英文字符。 
     * @return computeIds
     */
    public String getComputeIds() {
        return computeIds;
    }

    public void setComputeIds(String computeIds) {
        this.computeIds = computeIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowV2ComputesMetricsRequest that = (ShowV2ComputesMetricsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.step, that.step)
            && Objects.equals(this.metricName, that.metricName) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.computeIds, that.computeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, step, metricName, startTime, endTime, computeIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowV2ComputesMetricsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    computeIds: ").append(toIndentedString(computeIds)).append("\n");
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
