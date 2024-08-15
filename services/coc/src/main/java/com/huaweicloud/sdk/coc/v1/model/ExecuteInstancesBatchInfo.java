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
 * ExecuteInstancesBatchInfo
 */
public class ExecuteInstancesBatchInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_index")

    private Integer batchIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instances")

    private List<ExecuteResourceInstance> targetInstances = null;

    /**
     * 暂停继续策略
     */
    public static final class RotationStrategyEnum {

        /**
         * Enum CONTINUE for value: "CONTINUE"
         */
        public static final RotationStrategyEnum CONTINUE = new RotationStrategyEnum("CONTINUE");

        /**
         * Enum PAUSE for value: "PAUSE"
         */
        public static final RotationStrategyEnum PAUSE = new RotationStrategyEnum("PAUSE");

        private static final Map<String, RotationStrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RotationStrategyEnum> createStaticFields() {
            Map<String, RotationStrategyEnum> map = new HashMap<>();
            map.put("CONTINUE", CONTINUE);
            map.put("PAUSE", PAUSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RotationStrategyEnum(String value) {
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
        public static RotationStrategyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RotationStrategyEnum(value));
        }

        public static RotationStrategyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RotationStrategyEnum) {
                return this.value.equals(((RotationStrategyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotation_strategy")

    private RotationStrategyEnum rotationStrategy;

    public ExecuteInstancesBatchInfo withBatchIndex(Integer batchIndex) {
        this.batchIndex = batchIndex;
        return this;
    }

    /**
     * 批次索引，从1开始，未校验：最大值
     * minimum: 1
     * maximum: 20
     * @return batchIndex
     */
    public Integer getBatchIndex() {
        return batchIndex;
    }

    public void setBatchIndex(Integer batchIndex) {
        this.batchIndex = batchIndex;
    }

    public ExecuteInstancesBatchInfo withTargetInstances(List<ExecuteResourceInstance> targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }

    public ExecuteInstancesBatchInfo addTargetInstancesItem(ExecuteResourceInstance targetInstancesItem) {
        if (this.targetInstances == null) {
            this.targetInstances = new ArrayList<>();
        }
        this.targetInstances.add(targetInstancesItem);
        return this;
    }

    public ExecuteInstancesBatchInfo withTargetInstances(
        Consumer<List<ExecuteResourceInstance>> targetInstancesSetter) {
        if (this.targetInstances == null) {
            this.targetInstances = new ArrayList<>();
        }
        targetInstancesSetter.accept(this.targetInstances);
        return this;
    }

    /**
     * 目标节点列表
     * @return targetInstances
     */
    public List<ExecuteResourceInstance> getTargetInstances() {
        return targetInstances;
    }

    public void setTargetInstances(List<ExecuteResourceInstance> targetInstances) {
        this.targetInstances = targetInstances;
    }

    public ExecuteInstancesBatchInfo withRotationStrategy(RotationStrategyEnum rotationStrategy) {
        this.rotationStrategy = rotationStrategy;
        return this;
    }

    /**
     * 暂停继续策略
     * @return rotationStrategy
     */
    public RotationStrategyEnum getRotationStrategy() {
        return rotationStrategy;
    }

    public void setRotationStrategy(RotationStrategyEnum rotationStrategy) {
        this.rotationStrategy = rotationStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteInstancesBatchInfo that = (ExecuteInstancesBatchInfo) obj;
        return Objects.equals(this.batchIndex, that.batchIndex)
            && Objects.equals(this.targetInstances, that.targetInstances)
            && Objects.equals(this.rotationStrategy, that.rotationStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchIndex, targetInstances, rotationStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteInstancesBatchInfo {\n");
        sb.append("    batchIndex: ").append(toIndentedString(batchIndex)).append("\n");
        sb.append("    targetInstances: ").append(toIndentedString(targetInstances)).append("\n");
        sb.append("    rotationStrategy: ").append(toIndentedString(rotationStrategy)).append("\n");
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
