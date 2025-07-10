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
 * 保存定时任务关联的实例选择条件或实例信息
 */
public class AlarmScheduleInstance {

    /**
     * 目标选择方式，枚举值：ALL 全部实例，MANUAL 手动选择 NONE
     */
    public static final class TargetSelectionEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final TargetSelectionEnum ALL = new TargetSelectionEnum("ALL");

        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final TargetSelectionEnum MANUAL = new TargetSelectionEnum("MANUAL");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final TargetSelectionEnum NONE = new TargetSelectionEnum("NONE");

        private static final Map<String, TargetSelectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetSelectionEnum> createStaticFields() {
            Map<String, TargetSelectionEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("MANUAL", MANUAL);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetSelectionEnum(String value) {
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
        public static TargetSelectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TargetSelectionEnum(value));
        }

        public static TargetSelectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetSelectionEnum) {
                return this.value.equals(((TargetSelectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_selection")

    private TargetSelectionEnum targetSelection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instances")

    private String targetInstances;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_no")

    private Integer orderNo;

    /**
     * 实例分批策略 AUTO_BATCH 自动分批，MANUAL_BATCH手动分批，NONE不分批
     */
    public static final class BatchStrategyEnum {

        /**
         * Enum AUTO_BATCH for value: "AUTO_BATCH"
         */
        public static final BatchStrategyEnum AUTO_BATCH = new BatchStrategyEnum("AUTO_BATCH");

        /**
         * Enum MANUAL_BATCH for value: "MANUAL_BATCH"
         */
        public static final BatchStrategyEnum MANUAL_BATCH = new BatchStrategyEnum("MANUAL_BATCH");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final BatchStrategyEnum NONE = new BatchStrategyEnum("NONE");

        private static final Map<String, BatchStrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BatchStrategyEnum> createStaticFields() {
            Map<String, BatchStrategyEnum> map = new HashMap<>();
            map.put("AUTO_BATCH", AUTO_BATCH);
            map.put("MANUAL_BATCH", MANUAL_BATCH);
            map.put("NONE", NONE);
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
    @JsonProperty(value = "sub_target_instances")

    private List<AlarmScheduleInstance> subTargetInstances = null;

    public AlarmScheduleInstance withTargetSelection(TargetSelectionEnum targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }

    /**
     * 目标选择方式，枚举值：ALL 全部实例，MANUAL 手动选择 NONE
     * @return targetSelection
     */
    public TargetSelectionEnum getTargetSelection() {
        return targetSelection;
    }

    public void setTargetSelection(TargetSelectionEnum targetSelection) {
        this.targetSelection = targetSelection;
    }

    public AlarmScheduleInstance withTargetInstances(String targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }

    /**
     * 实例信息
     * @return targetInstances
     */
    public String getTargetInstances() {
        return targetInstances;
    }

    public void setTargetInstances(String targetInstances) {
        this.targetInstances = targetInstances;
    }

    public AlarmScheduleInstance withOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
        return this;
    }

    /**
     * 步骤号
     * minimum: 0
     * maximum: 2147483647
     * @return orderNo
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public AlarmScheduleInstance withBatchStrategy(BatchStrategyEnum batchStrategy) {
        this.batchStrategy = batchStrategy;
        return this;
    }

    /**
     * 实例分批策略 AUTO_BATCH 自动分批，MANUAL_BATCH手动分批，NONE不分批
     * @return batchStrategy
     */
    public BatchStrategyEnum getBatchStrategy() {
        return batchStrategy;
    }

    public void setBatchStrategy(BatchStrategyEnum batchStrategy) {
        this.batchStrategy = batchStrategy;
    }

    public AlarmScheduleInstance withSubTargetInstances(List<AlarmScheduleInstance> subTargetInstances) {
        this.subTargetInstances = subTargetInstances;
        return this;
    }

    public AlarmScheduleInstance addSubTargetInstancesItem(AlarmScheduleInstance subTargetInstancesItem) {
        if (this.subTargetInstances == null) {
            this.subTargetInstances = new ArrayList<>();
        }
        this.subTargetInstances.add(subTargetInstancesItem);
        return this;
    }

    public AlarmScheduleInstance withSubTargetInstances(
        Consumer<List<AlarmScheduleInstance>> subTargetInstancesSetter) {
        if (this.subTargetInstances == null) {
            this.subTargetInstances = new ArrayList<>();
        }
        subTargetInstancesSetter.accept(this.subTargetInstances);
        return this;
    }

    /**
     * 子目标实例
     * @return subTargetInstances
     */
    public List<AlarmScheduleInstance> getSubTargetInstances() {
        return subTargetInstances;
    }

    public void setSubTargetInstances(List<AlarmScheduleInstance> subTargetInstances) {
        this.subTargetInstances = subTargetInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmScheduleInstance that = (AlarmScheduleInstance) obj;
        return Objects.equals(this.targetSelection, that.targetSelection)
            && Objects.equals(this.targetInstances, that.targetInstances) && Objects.equals(this.orderNo, that.orderNo)
            && Objects.equals(this.batchStrategy, that.batchStrategy)
            && Objects.equals(this.subTargetInstances, that.subTargetInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetSelection, targetInstances, orderNo, batchStrategy, subTargetInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmScheduleInstance {\n");
        sb.append("    targetSelection: ").append(toIndentedString(targetSelection)).append("\n");
        sb.append("    targetInstances: ").append(toIndentedString(targetInstances)).append("\n");
        sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
        sb.append("    batchStrategy: ").append(toIndentedString(batchStrategy)).append("\n");
        sb.append("    subTargetInstances: ").append(toIndentedString(subTargetInstances)).append("\n");
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
