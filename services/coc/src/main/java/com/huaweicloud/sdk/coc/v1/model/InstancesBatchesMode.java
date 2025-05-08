package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 需要分批的机器
 */
public class InstancesBatchesMode {

    /**
     * 分批策略：只支持自动分批
     */
    public static final class BatchStrategyEnum {

        /**
         * Enum AUTO_BATCH for value: "AUTO_BATCH"
         */
        public static final BatchStrategyEnum AUTO_BATCH = new BatchStrategyEnum("AUTO_BATCH");

        private static final Map<String, BatchStrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BatchStrategyEnum> createStaticFields() {
            Map<String, BatchStrategyEnum> map = new HashMap<>();
            map.put("AUTO_BATCH", AUTO_BATCH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BatchStrategyEnum(String value) {
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
        public static BatchStrategyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BatchStrategyEnum(value));
        }

        public static BatchStrategyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BatchStrategyEnum) {
                return this.value.equals(((BatchStrategyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_strategy")

    private BatchStrategyEnum batchStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instances")

    private List<ResourceInstance> targetInstances = null;

    public InstancesBatchesMode withBatchStrategy(BatchStrategyEnum batchStrategy) {
        this.batchStrategy = batchStrategy;
        return this;
    }

    /**
     * 分批策略：只支持自动分批
     * @return batchStrategy
     */
    public BatchStrategyEnum getBatchStrategy() {
        return batchStrategy;
    }

    public void setBatchStrategy(BatchStrategyEnum batchStrategy) {
        this.batchStrategy = batchStrategy;
    }

    public InstancesBatchesMode withTargetInstances(List<ResourceInstance> targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }

    public InstancesBatchesMode addTargetInstancesItem(ResourceInstance targetInstancesItem) {
        if (this.targetInstances == null) {
            this.targetInstances = new ArrayList<>();
        }
        this.targetInstances.add(targetInstancesItem);
        return this;
    }

    public InstancesBatchesMode withTargetInstances(Consumer<List<ResourceInstance>> targetInstancesSetter) {
        if (this.targetInstances == null) {
            this.targetInstances = new ArrayList<>();
        }
        targetInstancesSetter.accept(this.targetInstances);
        return this;
    }

    /**
     * 目标主机实例
     * @return targetInstances
     */
    public List<ResourceInstance> getTargetInstances() {
        return targetInstances;
    }

    public void setTargetInstances(List<ResourceInstance> targetInstances) {
        this.targetInstances = targetInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstancesBatchesMode that = (InstancesBatchesMode) obj;
        return Objects.equals(this.batchStrategy, that.batchStrategy)
            && Objects.equals(this.targetInstances, that.targetInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchStrategy, targetInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstancesBatchesMode {\n");
        sb.append("    batchStrategy: ").append(toIndentedString(batchStrategy)).append("\n");
        sb.append("    targetInstances: ").append(toIndentedString(targetInstances)).append("\n");
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
