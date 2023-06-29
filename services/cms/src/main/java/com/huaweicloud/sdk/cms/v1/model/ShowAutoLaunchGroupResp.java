package com.huaweicloud.sdk.cms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 智能购买组信息
 */
public class ShowAutoLaunchGroupResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 请求类型。枚举值 request：一次性。仅在启动时交付实例集群，调度失败后不再重试。 maintain：持续供应。在启动时尝试交付实例集群，并监控实时容量，未达到目标容量则尝试继续创建ECS实例
     */
    public static final class TypeEnum {

        /**
         * Enum REQUEST for value: "request"
         */
        public static final TypeEnum REQUEST = new TypeEnum("request");

        /**
         * Enum MAINTAIN for value: "maintain"
         */
        public static final TypeEnum MAINTAIN = new TypeEnum("maintain");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("request", REQUEST);
            map.put("maintain", MAINTAIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_state")

    private String taskState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_capacity")

    private Integer targetCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stable_capacity")

    private Integer stableCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_capacity")

    private Integer currentCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_stable_capacity")

    private Integer currentStableCapacity;

    /**
     * 超过目标容量或目标容量减少时的实例中断行为，枚举值 terminate：释放 noTermination：不释放
     */
    public static final class ExcessFulfilledCapacityBehaviorEnum {

        /**
         * Enum NOTERMINATION for value: "noTermination"
         */
        public static final ExcessFulfilledCapacityBehaviorEnum NOTERMINATION =
            new ExcessFulfilledCapacityBehaviorEnum("noTermination");

        /**
         * Enum TERMINATE for value: "terminate"
         */
        public static final ExcessFulfilledCapacityBehaviorEnum TERMINATE =
            new ExcessFulfilledCapacityBehaviorEnum("terminate");

        private static final Map<String, ExcessFulfilledCapacityBehaviorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExcessFulfilledCapacityBehaviorEnum> createStaticFields() {
            Map<String, ExcessFulfilledCapacityBehaviorEnum> map = new HashMap<>();
            map.put("noTermination", NOTERMINATION);
            map.put("terminate", TERMINATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExcessFulfilledCapacityBehaviorEnum(String value) {
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
        public static ExcessFulfilledCapacityBehaviorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new ExcessFulfilledCapacityBehaviorEnum(value));
        }

        public static ExcessFulfilledCapacityBehaviorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExcessFulfilledCapacityBehaviorEnum) {
                return this.value.equals(((ExcessFulfilledCapacityBehaviorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excess_fulfilled_capacity_behavior")

    private ExcessFulfilledCapacityBehaviorEnum excessFulfilledCapacityBehavior;

    /**
     * 请求到期时的实例中断行为，枚举值 terminate：释放 noTermination：不释放
     */
    public static final class InstancesBehaviorWithExpirationEnum {

        /**
         * Enum TERMINATE for value: "terminate"
         */
        public static final InstancesBehaviorWithExpirationEnum TERMINATE =
            new InstancesBehaviorWithExpirationEnum("terminate");

        /**
         * Enum NOTERMINATION for value: "noTermination"
         */
        public static final InstancesBehaviorWithExpirationEnum NOTERMINATION =
            new InstancesBehaviorWithExpirationEnum("noTermination");

        private static final Map<String, InstancesBehaviorWithExpirationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstancesBehaviorWithExpirationEnum> createStaticFields() {
            Map<String, InstancesBehaviorWithExpirationEnum> map = new HashMap<>();
            map.put("terminate", TERMINATE);
            map.put("noTermination", NOTERMINATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstancesBehaviorWithExpirationEnum(String value) {
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
        public static InstancesBehaviorWithExpirationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new InstancesBehaviorWithExpirationEnum(value));
        }

        public static InstancesBehaviorWithExpirationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstancesBehaviorWithExpirationEnum) {
                return this.value.equals(((InstancesBehaviorWithExpirationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances_behavior_with_expiration")

    private InstancesBehaviorWithExpirationEnum instancesBehaviorWithExpiration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_since")

    private OffsetDateTime validSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_until")

    private OffsetDateTime validUntil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_specs")

    private List<RegionSpec> regionSpecs = null;

    /**
     * 实例分配策略，枚举值 lowest_price：价格最低策略，智能购买组购买的所有实例的价格总和最低。 prioritized：优先级策略，按照规格设定的优先级创建实例。 capacity_optimized：容量最优化策略，智能购买组购买的实例按照大规格优先进行购买。
     */
    public static final class AllocationStrategyEnum {

        /**
         * Enum LOWEST_PRICE for value: "lowest_price"
         */
        public static final AllocationStrategyEnum LOWEST_PRICE = new AllocationStrategyEnum("lowest_price");

        /**
         * Enum DIVERSIFIED for value: "diversified"
         */
        public static final AllocationStrategyEnum DIVERSIFIED = new AllocationStrategyEnum("diversified");

        /**
         * Enum PRIORITIZED for value: "prioritized"
         */
        public static final AllocationStrategyEnum PRIORITIZED = new AllocationStrategyEnum("prioritized");

        /**
         * Enum CAPACITY_OPTIMIZED for value: "capacity_optimized"
         */
        public static final AllocationStrategyEnum CAPACITY_OPTIMIZED =
            new AllocationStrategyEnum("capacity_optimized");

        private static final Map<String, AllocationStrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AllocationStrategyEnum> createStaticFields() {
            Map<String, AllocationStrategyEnum> map = new HashMap<>();
            map.put("lowest_price", LOWEST_PRICE);
            map.put("diversified", DIVERSIFIED);
            map.put("prioritized", PRIORITIZED);
            map.put("capacity_optimized", CAPACITY_OPTIMIZED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AllocationStrategyEnum(String value) {
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
        public static AllocationStrategyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AllocationStrategyEnum(value));
        }

        public static AllocationStrategyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AllocationStrategyEnum) {
                return this.value.equals(((AllocationStrategyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocation_strategy")

    private AllocationStrategyEnum allocationStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spot_price")

    private Double spotPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public ShowAutoLaunchGroupResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 智能购买组名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowAutoLaunchGroupResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 请求类型。枚举值 request：一次性。仅在启动时交付实例集群，调度失败后不再重试。 maintain：持续供应。在启动时尝试交付实例集群，并监控实时容量，未达到目标容量则尝试继续创建ECS实例
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowAutoLaunchGroupResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 智能购买组的运行状态，枚举值 SUBMITTED：已提交 ACTIVE：运行中 DELETING：删除中 DELETED：已删除
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowAutoLaunchGroupResp withTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }

    /**
     * 智能购买组的任务状态，枚举值 HANDLING：购买中 FULFILLED：智能购买组已满配 ERROR：智能购买组异常
     * @return taskState
     */
    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public ShowAutoLaunchGroupResp withTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }

    /**
     * 智能购买组目标容量. 实例数量或者CPU个数，目标容量大于等于stable_capacity。竞价实例的容量为满配容量减去stable_capacity
     * minimum: 0
     * maximum: 10000
     * @return targetCapacity
     */
    public Integer getTargetCapacity() {
        return targetCapacity;
    }

    public void setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
    }

    public ShowAutoLaunchGroupResp withStableCapacity(Integer stableCapacity) {
        this.stableCapacity = stableCapacity;
        return this;
    }

    /**
     * 按需实例目标容量 目标容量指实例数量或CPU个数，必须小于等于target_capacity，智能购买组中可以没有按需实例
     * minimum: 0
     * maximum: 10000
     * @return stableCapacity
     */
    public Integer getStableCapacity() {
        return stableCapacity;
    }

    public void setStableCapacity(Integer stableCapacity) {
        this.stableCapacity = stableCapacity;
    }

    public ShowAutoLaunchGroupResp withCurrentCapacity(Integer currentCapacity) {
        this.currentCapacity = currentCapacity;
        return this;
    }

    /**
     * 当前已经购买成功的总算力
     * minimum: 0
     * maximum: 10000
     * @return currentCapacity
     */
    public Integer getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(Integer currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public ShowAutoLaunchGroupResp withCurrentStableCapacity(Integer currentStableCapacity) {
        this.currentStableCapacity = currentStableCapacity;
        return this;
    }

    /**
     * 当前已经购买成功的按需算力
     * minimum: 0
     * maximum: 10000
     * @return currentStableCapacity
     */
    public Integer getCurrentStableCapacity() {
        return currentStableCapacity;
    }

    public void setCurrentStableCapacity(Integer currentStableCapacity) {
        this.currentStableCapacity = currentStableCapacity;
    }

    public ShowAutoLaunchGroupResp withExcessFulfilledCapacityBehavior(
        ExcessFulfilledCapacityBehaviorEnum excessFulfilledCapacityBehavior) {
        this.excessFulfilledCapacityBehavior = excessFulfilledCapacityBehavior;
        return this;
    }

    /**
     * 超过目标容量或目标容量减少时的实例中断行为，枚举值 terminate：释放 noTermination：不释放
     * @return excessFulfilledCapacityBehavior
     */
    public ExcessFulfilledCapacityBehaviorEnum getExcessFulfilledCapacityBehavior() {
        return excessFulfilledCapacityBehavior;
    }

    public void setExcessFulfilledCapacityBehavior(
        ExcessFulfilledCapacityBehaviorEnum excessFulfilledCapacityBehavior) {
        this.excessFulfilledCapacityBehavior = excessFulfilledCapacityBehavior;
    }

    public ShowAutoLaunchGroupResp withInstancesBehaviorWithExpiration(
        InstancesBehaviorWithExpirationEnum instancesBehaviorWithExpiration) {
        this.instancesBehaviorWithExpiration = instancesBehaviorWithExpiration;
        return this;
    }

    /**
     * 请求到期时的实例中断行为，枚举值 terminate：释放 noTermination：不释放
     * @return instancesBehaviorWithExpiration
     */
    public InstancesBehaviorWithExpirationEnum getInstancesBehaviorWithExpiration() {
        return instancesBehaviorWithExpiration;
    }

    public void setInstancesBehaviorWithExpiration(
        InstancesBehaviorWithExpirationEnum instancesBehaviorWithExpiration) {
        this.instancesBehaviorWithExpiration = instancesBehaviorWithExpiration;
    }

    public ShowAutoLaunchGroupResp withValidSince(OffsetDateTime validSince) {
        this.validSince = validSince;
        return this;
    }

    /**
     * 请求开始时间，格式为yyyy-MM-ddTHH:mm:ssZ
     * @return validSince
     */
    public OffsetDateTime getValidSince() {
        return validSince;
    }

    public void setValidSince(OffsetDateTime validSince) {
        this.validSince = validSince;
    }

    public ShowAutoLaunchGroupResp withValidUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * 请求结束时间，格式为yyyy-MM-ddTHH:mm:ssZ
     * @return validUntil
     */
    public OffsetDateTime getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public ShowAutoLaunchGroupResp withRegionSpecs(List<RegionSpec> regionSpecs) {
        this.regionSpecs = regionSpecs;
        return this;
    }

    public ShowAutoLaunchGroupResp addRegionSpecsItem(RegionSpec regionSpecsItem) {
        if (this.regionSpecs == null) {
            this.regionSpecs = new ArrayList<>();
        }
        this.regionSpecs.add(regionSpecsItem);
        return this;
    }

    public ShowAutoLaunchGroupResp withRegionSpecs(Consumer<List<RegionSpec>> regionSpecsSetter) {
        if (this.regionSpecs == null) {
            this.regionSpecs = new ArrayList<>();
        }
        regionSpecsSetter.accept(this.regionSpecs);
        return this;
    }

    /**
     * 智能购买组在各个区域的配置
     * @return regionSpecs
     */
    public List<RegionSpec> getRegionSpecs() {
        return regionSpecs;
    }

    public void setRegionSpecs(List<RegionSpec> regionSpecs) {
        this.regionSpecs = regionSpecs;
    }

    public ShowAutoLaunchGroupResp withAllocationStrategy(AllocationStrategyEnum allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    /**
     * 实例分配策略，枚举值 lowest_price：价格最低策略，智能购买组购买的所有实例的价格总和最低。 prioritized：优先级策略，按照规格设定的优先级创建实例。 capacity_optimized：容量最优化策略，智能购买组购买的实例按照大规格优先进行购买。
     * @return allocationStrategy
     */
    public AllocationStrategyEnum getAllocationStrategy() {
        return allocationStrategy;
    }

    public void setAllocationStrategy(AllocationStrategyEnum allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    public ShowAutoLaunchGroupResp withSpotPrice(Double spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * 用户愿意为竞价实例每小时支付的最高价格。如果overrides中没有提供价格，可以使用该价格。
     * minimum: 0
     * maximum: 1E+3
     * @return spotPrice
     */
    public Double getSpotPrice() {
        return spotPrice;
    }

    public void setSpotPrice(Double spotPrice) {
        this.spotPrice = spotPrice;
    }

    public ShowAutoLaunchGroupResp withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 智能购买组创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutoLaunchGroupResp that = (ShowAutoLaunchGroupResp) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.taskState, that.taskState)
            && Objects.equals(this.targetCapacity, that.targetCapacity)
            && Objects.equals(this.stableCapacity, that.stableCapacity)
            && Objects.equals(this.currentCapacity, that.currentCapacity)
            && Objects.equals(this.currentStableCapacity, that.currentStableCapacity)
            && Objects.equals(this.excessFulfilledCapacityBehavior, that.excessFulfilledCapacityBehavior)
            && Objects.equals(this.instancesBehaviorWithExpiration, that.instancesBehaviorWithExpiration)
            && Objects.equals(this.validSince, that.validSince) && Objects.equals(this.validUntil, that.validUntil)
            && Objects.equals(this.regionSpecs, that.regionSpecs)
            && Objects.equals(this.allocationStrategy, that.allocationStrategy)
            && Objects.equals(this.spotPrice, that.spotPrice) && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            type,
            status,
            taskState,
            targetCapacity,
            stableCapacity,
            currentCapacity,
            currentStableCapacity,
            excessFulfilledCapacityBehavior,
            instancesBehaviorWithExpiration,
            validSince,
            validUntil,
            regionSpecs,
            allocationStrategy,
            spotPrice,
            createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoLaunchGroupResp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskState: ").append(toIndentedString(taskState)).append("\n");
        sb.append("    targetCapacity: ").append(toIndentedString(targetCapacity)).append("\n");
        sb.append("    stableCapacity: ").append(toIndentedString(stableCapacity)).append("\n");
        sb.append("    currentCapacity: ").append(toIndentedString(currentCapacity)).append("\n");
        sb.append("    currentStableCapacity: ").append(toIndentedString(currentStableCapacity)).append("\n");
        sb.append("    excessFulfilledCapacityBehavior: ")
            .append(toIndentedString(excessFulfilledCapacityBehavior))
            .append("\n");
        sb.append("    instancesBehaviorWithExpiration: ")
            .append(toIndentedString(instancesBehaviorWithExpiration))
            .append("\n");
        sb.append("    validSince: ").append(toIndentedString(validSince)).append("\n");
        sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
        sb.append("    regionSpecs: ").append(toIndentedString(regionSpecs)).append("\n");
        sb.append("    allocationStrategy: ").append(toIndentedString(allocationStrategy)).append("\n");
        sb.append("    spotPrice: ").append(toIndentedString(spotPrice)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
