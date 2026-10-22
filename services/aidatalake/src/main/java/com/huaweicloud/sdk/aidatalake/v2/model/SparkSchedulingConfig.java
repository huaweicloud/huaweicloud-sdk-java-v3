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
 * SparkSchedulingConfig
 */
public class SparkSchedulingConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_concurrent_jobs")

    private Integer maxConcurrentJobs;

    /**
     * **参数解释**：作业调度策略，支持随机和先进先出。 **约束限制**：不涉及。 **取值范围**： - RANDOM：随机。 - FIFO：先进先出。 **默认取值**：RANDOM。 
     */
    public static final class SchedulingPolicyEnum {

        /**
         * Enum RANDOM for value: "RANDOM"
         */
        public static final SchedulingPolicyEnum RANDOM = new SchedulingPolicyEnum("RANDOM");

        /**
         * Enum FIFO for value: "FIFO"
         */
        public static final SchedulingPolicyEnum FIFO = new SchedulingPolicyEnum("FIFO");

        private static final Map<String, SchedulingPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SchedulingPolicyEnum> createStaticFields() {
            Map<String, SchedulingPolicyEnum> map = new HashMap<>();
            map.put("RANDOM", RANDOM);
            map.put("FIFO", FIFO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SchedulingPolicyEnum(String value) {
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
        public static SchedulingPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SchedulingPolicyEnum(value));
        }

        public static SchedulingPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SchedulingPolicyEnum) {
                return this.value.equals(((SchedulingPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduling_policy")

    private SchedulingPolicyEnum schedulingPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fifo_tolerance_seconds")

    private Integer fifoToleranceSeconds;

    public SparkSchedulingConfig withMaxConcurrentJobs(Integer maxConcurrentJobs) {
        this.maxConcurrentJobs = maxConcurrentJobs;
        return this;
    }

    /**
     * **参数解释**：端点最大并发作业数量。 **约束限制**：不涉及。 **取值范围**：1~1000。 **默认取值**：200。 
     * minimum: 1
     * maximum: 1000
     * @return maxConcurrentJobs
     */
    public Integer getMaxConcurrentJobs() {
        return maxConcurrentJobs;
    }

    public void setMaxConcurrentJobs(Integer maxConcurrentJobs) {
        this.maxConcurrentJobs = maxConcurrentJobs;
    }

    public SparkSchedulingConfig withSchedulingPolicy(SchedulingPolicyEnum schedulingPolicy) {
        this.schedulingPolicy = schedulingPolicy;
        return this;
    }

    /**
     * **参数解释**：作业调度策略，支持随机和先进先出。 **约束限制**：不涉及。 **取值范围**： - RANDOM：随机。 - FIFO：先进先出。 **默认取值**：RANDOM。 
     * @return schedulingPolicy
     */
    public SchedulingPolicyEnum getSchedulingPolicy() {
        return schedulingPolicy;
    }

    public void setSchedulingPolicy(SchedulingPolicyEnum schedulingPolicy) {
        this.schedulingPolicy = schedulingPolicy;
    }

    public SparkSchedulingConfig withFifoToleranceSeconds(Integer fifoToleranceSeconds) {
        this.fifoToleranceSeconds = fifoToleranceSeconds;
        return this;
    }

    /**
     * **参数解释**：FIFO允许并发时间（秒）。 **约束限制**：不涉及。 **取值范围**：0~3600。 **默认取值**：300。 
     * minimum: 0
     * maximum: 3600
     * @return fifoToleranceSeconds
     */
    public Integer getFifoToleranceSeconds() {
        return fifoToleranceSeconds;
    }

    public void setFifoToleranceSeconds(Integer fifoToleranceSeconds) {
        this.fifoToleranceSeconds = fifoToleranceSeconds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkSchedulingConfig that = (SparkSchedulingConfig) obj;
        return Objects.equals(this.maxConcurrentJobs, that.maxConcurrentJobs)
            && Objects.equals(this.schedulingPolicy, that.schedulingPolicy)
            && Objects.equals(this.fifoToleranceSeconds, that.fifoToleranceSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxConcurrentJobs, schedulingPolicy, fifoToleranceSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkSchedulingConfig {\n");
        sb.append("    maxConcurrentJobs: ").append(toIndentedString(maxConcurrentJobs)).append("\n");
        sb.append("    schedulingPolicy: ").append(toIndentedString(schedulingPolicy)).append("\n");
        sb.append("    fifoToleranceSeconds: ").append(toIndentedString(fifoToleranceSeconds)).append("\n");
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
