package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DeployStrategyRollingRelease
 */
public class DeployStrategyRollingRelease {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batches")

    private Integer batches;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "termination_seconds")

    private Integer terminationSeconds;

    /**
     * 只对虚机部署有用，默认是stop，一批执行失败后停止升级。
     */
    public static final class FailStrategyEnum {

        /**
         * Enum CONTINUE for value: "continue"
         */
        public static final FailStrategyEnum CONTINUE = new FailStrategyEnum("continue");

        /**
         * Enum STOP for value: "stop"
         */
        public static final FailStrategyEnum STOP = new FailStrategyEnum("stop");

        private static final Map<String, FailStrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FailStrategyEnum> createStaticFields() {
            Map<String, FailStrategyEnum> map = new HashMap<>();
            map.put("continue", CONTINUE);
            map.put("stop", STOP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FailStrategyEnum(String value) {
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
        public static FailStrategyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FailStrategyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FailStrategyEnum(value);
            }
            return result;
        }

        public static FailStrategyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FailStrategyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FailStrategyEnum) {
                return this.value.equals(((FailStrategyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_strategy")

    private FailStrategyEnum failStrategy;

    public DeployStrategyRollingRelease withBatches(Integer batches) {
        this.batches = batches;
        return this;
    }

    /**
     * Get batches
     * @return batches
     */
    public Integer getBatches() {
        return batches;
    }

    public void setBatches(Integer batches) {
        this.batches = batches;
    }

    public DeployStrategyRollingRelease withTerminationSeconds(Integer terminationSeconds) {
        this.terminationSeconds = terminationSeconds;
        return this;
    }

    /**
     * Get terminationSeconds
     * @return terminationSeconds
     */
    public Integer getTerminationSeconds() {
        return terminationSeconds;
    }

    public void setTerminationSeconds(Integer terminationSeconds) {
        this.terminationSeconds = terminationSeconds;
    }

    public DeployStrategyRollingRelease withFailStrategy(FailStrategyEnum failStrategy) {
        this.failStrategy = failStrategy;
        return this;
    }

    /**
     * 只对虚机部署有用，默认是stop，一批执行失败后停止升级。
     * @return failStrategy
     */
    public FailStrategyEnum getFailStrategy() {
        return failStrategy;
    }

    public void setFailStrategy(FailStrategyEnum failStrategy) {
        this.failStrategy = failStrategy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeployStrategyRollingRelease deployStrategyRollingRelease = (DeployStrategyRollingRelease) o;
        return Objects.equals(this.batches, deployStrategyRollingRelease.batches)
            && Objects.equals(this.terminationSeconds, deployStrategyRollingRelease.terminationSeconds)
            && Objects.equals(this.failStrategy, deployStrategyRollingRelease.failStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batches, terminationSeconds, failStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployStrategyRollingRelease {\n");
        sb.append("    batches: ").append(toIndentedString(batches)).append("\n");
        sb.append("    terminationSeconds: ").append(toIndentedString(terminationSeconds)).append("\n");
        sb.append("    failStrategy: ").append(toIndentedString(failStrategy)).append("\n");
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
