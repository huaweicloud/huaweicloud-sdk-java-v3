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
 * This is a auto create Body Object
 */
public class AutoLaunchGroupReqV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    /**
     * 请求类型 request：一次性。仅在启动时交付实例集群，调度失败后不再重试。 maintain：持续供应。在启动时尝试交付实例集群，并监控实时容量，未达到目标容量则尝试继续创建ECS实例。 注意：持续供应场景下 不能保证强制均衡一直是有效的 默认值：maintain
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "guarantee_plan_id")

    private String guaranteePlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_capacity")

    private Integer targetCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stable_capacity")

    private Integer stableCapacity;

    /**
     * 超过目标容量时（目标容量容量减少）实例中断行为 terminate：释放 noTermination：不释放 默认值：terminate
     */
    public static final class ExcessFulfilledCapacityBehaviorEnum {

        /**
         * Enum TERMINATE for value: "terminate"
         */
        public static final ExcessFulfilledCapacityBehaviorEnum TERMINATE =
            new ExcessFulfilledCapacityBehaviorEnum("terminate");

        /**
         * Enum NOTERMINATION for value: "noTermination"
         */
        public static final ExcessFulfilledCapacityBehaviorEnum NOTERMINATION =
            new ExcessFulfilledCapacityBehaviorEnum("noTermination");

        private static final Map<String, ExcessFulfilledCapacityBehaviorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExcessFulfilledCapacityBehaviorEnum> createStaticFields() {
            Map<String, ExcessFulfilledCapacityBehaviorEnum> map = new HashMap<>();
            map.put("terminate", TERMINATE);
            map.put("noTermination", NOTERMINATION);
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
            ExcessFulfilledCapacityBehaviorEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ExcessFulfilledCapacityBehaviorEnum(value);
            }
            return result;
        }

        public static ExcessFulfilledCapacityBehaviorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ExcessFulfilledCapacityBehaviorEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
     * 请求到期正在的实例中断行为 terminate|noTermination terminate：释放 noTermination：不释放 默认值：terminate
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
            InstancesBehaviorWithExpirationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InstancesBehaviorWithExpirationEnum(value);
            }
            return result;
        }

        public static InstancesBehaviorWithExpirationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            InstancesBehaviorWithExpirationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /**
     * 实例分配策略： 1、总价最低策略:  2、多可用区均衡策略:  3、容量最优策略：智能购买组购买的实例按照大规格优先进行购买。 lowest_price：价格最低策略。智能购买组购买的所有实例的价格总和最低。 prioritized：优先级策略。按照规格设定的优先级创建实例。 capacity_optimized：容量最优化。智能购买组购买的实例按照大规格优先进行购买。  默认值：lowest_price
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
         * Enum CAPACITY_OPTIMIZED for value: "capacity_optimized"
         */
        public static final AllocationStrategyEnum CAPACITY_OPTIMIZED =
            new AllocationStrategyEnum("capacity_optimized");

        /**
         * Enum PRIORITIZED for value: "prioritized"
         */
        public static final AllocationStrategyEnum PRIORITIZED = new AllocationStrategyEnum("prioritized");

        private static final Map<String, AllocationStrategyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AllocationStrategyEnum> createStaticFields() {
            Map<String, AllocationStrategyEnum> map = new HashMap<>();
            map.put("lowest_price", LOWEST_PRICE);
            map.put("diversified", DIVERSIFIED);
            map.put("capacity_optimized", CAPACITY_OPTIMIZED);
            map.put("prioritized", PRIORITIZED);
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
            AllocationStrategyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AllocationStrategyEnum(value);
            }
            return result;
        }

        public static AllocationStrategyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AllocationStrategyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "region_specs")

    private List<RegionSpec> regionSpecs = null;

    /**
    * 资源供给中规格选择策略：singlation、multiple singlation：选择一种Flavor供给 multiple：组合多种Flavor供给 默认值：multiple
    */
    public static final class SupplyOptionEnum {

        /**
         * Enum SINGLATION for value: "singlation"
         */
        public static final SupplyOptionEnum SINGLATION = new SupplyOptionEnum("singlation");

        /**
         * Enum MULTIPLE for value: "multiple"
         */
        public static final SupplyOptionEnum MULTIPLE = new SupplyOptionEnum("multiple");

        private static final Map<String, SupplyOptionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupplyOptionEnum> createStaticFields() {
            Map<String, SupplyOptionEnum> map = new HashMap<>();
            map.put("singlation", SINGLATION);
            map.put("multiple", MULTIPLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupplyOptionEnum(String value) {
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
        public static SupplyOptionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SupplyOptionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SupplyOptionEnum(value);
            }
            return result;
        }

        public static SupplyOptionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SupplyOptionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupplyOptionEnum) {
                return this.value.equals(((SupplyOptionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supply_option")

    private SupplyOptionEnum supplyOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spot_price")

    private Double spotPrice;

    public AutoLaunchGroupReqV2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * autoLaunchGroup名称(1-64个字符)，只能包含中文、字母、数字、下划线或中划线
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AutoLaunchGroupReqV2 withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 创建智能购买组参数核查  true：发送检查请求，不会创建智能购买组。检查项包括是否填写了必需参数、请求格式等。 如果检查不通过，则返回对应错误。 如果检查通过，则返回202状态码。 false：发送正常请求，通过检查后并且执行创建智能购买组请求
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public AutoLaunchGroupReqV2 withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 请求类型 request：一次性。仅在启动时交付实例集群，调度失败后不再重试。 maintain：持续供应。在启动时尝试交付实例集群，并监控实时容量，未达到目标容量则尝试继续创建ECS实例。 注意：持续供应场景下 不能保证强制均衡一直是有效的 默认值：maintain
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AutoLaunchGroupReqV2 withGuaranteePlanId(String guaranteePlanId) {
        this.guaranteePlanId = guaranteePlanId;
        return this;
    }

    /**
     * 算力保障计划id
     * @return guaranteePlanId
     */
    public String getGuaranteePlanId() {
        return guaranteePlanId;
    }

    public void setGuaranteePlanId(String guaranteePlanId) {
        this.guaranteePlanId = guaranteePlanId;
    }

    public AutoLaunchGroupReqV2 withTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }

    /**
     * autoLaunchGroup目标容量， 实例数量或者CPU个数 目标容量大于等于stable_capacity， spot实例的容量为满配容量减去stable_capacity                      最小值        最大值 CPU 个数       1                  40000 实例个数        1                  500
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

    public AutoLaunchGroupReqV2 withStableCapacity(Integer stableCapacity) {
        this.stableCapacity = stableCapacity;
        return this;
    }

    /**
     * 按需实例目标容量（CPU或者实例个数） 小于target_capacity 非必填的原因是智能购买组中可以没有按需实例
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

    public AutoLaunchGroupReqV2 withExcessFulfilledCapacityBehavior(
        ExcessFulfilledCapacityBehaviorEnum excessFulfilledCapacityBehavior) {
        this.excessFulfilledCapacityBehavior = excessFulfilledCapacityBehavior;
        return this;
    }

    /**
     * 超过目标容量时（目标容量容量减少）实例中断行为 terminate：释放 noTermination：不释放 默认值：terminate
     * @return excessFulfilledCapacityBehavior
     */
    public ExcessFulfilledCapacityBehaviorEnum getExcessFulfilledCapacityBehavior() {
        return excessFulfilledCapacityBehavior;
    }

    public void setExcessFulfilledCapacityBehavior(
        ExcessFulfilledCapacityBehaviorEnum excessFulfilledCapacityBehavior) {
        this.excessFulfilledCapacityBehavior = excessFulfilledCapacityBehavior;
    }

    public AutoLaunchGroupReqV2 withInstancesBehaviorWithExpiration(
        InstancesBehaviorWithExpirationEnum instancesBehaviorWithExpiration) {
        this.instancesBehaviorWithExpiration = instancesBehaviorWithExpiration;
        return this;
    }

    /**
     * 请求到期正在的实例中断行为 terminate|noTermination terminate：释放 noTermination：不释放 默认值：terminate
     * @return instancesBehaviorWithExpiration
     */
    public InstancesBehaviorWithExpirationEnum getInstancesBehaviorWithExpiration() {
        return instancesBehaviorWithExpiration;
    }

    public void setInstancesBehaviorWithExpiration(
        InstancesBehaviorWithExpirationEnum instancesBehaviorWithExpiration) {
        this.instancesBehaviorWithExpiration = instancesBehaviorWithExpiration;
    }

    public AutoLaunchGroupReqV2 withValidSince(OffsetDateTime validSince) {
        this.validSince = validSince;
        return this;
    }

    /**
     * 请求开始时间 和valid_until共同确定有效时段。 按照ISO8601标准表示，并使用UTC +0时间，格式为yyyy-MM-ddTHH:mm:ssZ。 默认值：立即生效
     * @return validSince
     */
    public OffsetDateTime getValidSince() {
        return validSince;
    }

    public void setValidSince(OffsetDateTime validSince) {
        this.validSince = validSince;
    }

    public AutoLaunchGroupReqV2 withValidUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * 请求结束时间 和valid_since共同确定有效时段。 按照ISO8601标准表示，并使用UTC +0时间，格式为yyyy-MM-ddTHH:mm:ssZ。 默认值：无限期
     * @return validUntil
     */
    public OffsetDateTime getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public AutoLaunchGroupReqV2 withAllocationStrategy(AllocationStrategyEnum allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    /**
     * 实例分配策略： 1、总价最低策略:  2、多可用区均衡策略:  3、容量最优策略：智能购买组购买的实例按照大规格优先进行购买。 lowest_price：价格最低策略。智能购买组购买的所有实例的价格总和最低。 prioritized：优先级策略。按照规格设定的优先级创建实例。 capacity_optimized：容量最优化。智能购买组购买的实例按照大规格优先进行购买。  默认值：lowest_price
     * @return allocationStrategy
     */
    public AllocationStrategyEnum getAllocationStrategy() {
        return allocationStrategy;
    }

    public void setAllocationStrategy(AllocationStrategyEnum allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    public AutoLaunchGroupReqV2 withRegionSpecs(List<RegionSpec> regionSpecs) {
        this.regionSpecs = regionSpecs;
        return this;
    }

    public AutoLaunchGroupReqV2 addRegionSpecsItem(RegionSpec regionSpecsItem) {
        if (this.regionSpecs == null) {
            this.regionSpecs = new ArrayList<>();
        }
        this.regionSpecs.add(regionSpecsItem);
        return this;
    }

    public AutoLaunchGroupReqV2 withRegionSpecs(Consumer<List<RegionSpec>> regionSpecsSetter) {
        if (this.regionSpecs == null) {
            this.regionSpecs = new ArrayList<>();
        }
        regionSpecsSetter.accept(this.regionSpecs);
        return this;
    }

    /**
     * 智能购买组内各region的资源描述
     * @return regionSpecs
     */
    public List<RegionSpec> getRegionSpecs() {
        return regionSpecs;
    }

    public void setRegionSpecs(List<RegionSpec> regionSpecs) {
        this.regionSpecs = regionSpecs;
    }

    public AutoLaunchGroupReqV2 withSupplyOption(SupplyOptionEnum supplyOption) {
        this.supplyOption = supplyOption;
        return this;
    }

    /**
     * 资源供给中规格选择策略：singlation、multiple singlation：选择一种Flavor供给 multiple：组合多种Flavor供给 默认值：multiple
     * @return supplyOption
     */
    public SupplyOptionEnum getSupplyOption() {
        return supplyOption;
    }

    public void setSupplyOption(SupplyOptionEnum supplyOption) {
        this.supplyOption = supplyOption;
    }

    public AutoLaunchGroupReqV2 withSpotPrice(Double spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * 用户愿意为竞价实例每小时支付的最高价格。如果overrides中没有提供价格，可以使用该价格
     * @return spotPrice
     */
    public Double getSpotPrice() {
        return spotPrice;
    }

    public void setSpotPrice(Double spotPrice) {
        this.spotPrice = spotPrice;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoLaunchGroupReqV2 autoLaunchGroupReqV2 = (AutoLaunchGroupReqV2) o;
        return Objects.equals(this.name, autoLaunchGroupReqV2.name)
            && Objects.equals(this.dryRun, autoLaunchGroupReqV2.dryRun)
            && Objects.equals(this.type, autoLaunchGroupReqV2.type)
            && Objects.equals(this.guaranteePlanId, autoLaunchGroupReqV2.guaranteePlanId)
            && Objects.equals(this.targetCapacity, autoLaunchGroupReqV2.targetCapacity)
            && Objects.equals(this.stableCapacity, autoLaunchGroupReqV2.stableCapacity)
            && Objects.equals(this.excessFulfilledCapacityBehavior,
                autoLaunchGroupReqV2.excessFulfilledCapacityBehavior)
            && Objects.equals(this.instancesBehaviorWithExpiration,
                autoLaunchGroupReqV2.instancesBehaviorWithExpiration)
            && Objects.equals(this.validSince, autoLaunchGroupReqV2.validSince)
            && Objects.equals(this.validUntil, autoLaunchGroupReqV2.validUntil)
            && Objects.equals(this.allocationStrategy, autoLaunchGroupReqV2.allocationStrategy)
            && Objects.equals(this.regionSpecs, autoLaunchGroupReqV2.regionSpecs)
            && Objects.equals(this.supplyOption, autoLaunchGroupReqV2.supplyOption)
            && Objects.equals(this.spotPrice, autoLaunchGroupReqV2.spotPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            dryRun,
            type,
            guaranteePlanId,
            targetCapacity,
            stableCapacity,
            excessFulfilledCapacityBehavior,
            instancesBehaviorWithExpiration,
            validSince,
            validUntil,
            allocationStrategy,
            regionSpecs,
            supplyOption,
            spotPrice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoLaunchGroupReqV2 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    guaranteePlanId: ").append(toIndentedString(guaranteePlanId)).append("\n");
        sb.append("    targetCapacity: ").append(toIndentedString(targetCapacity)).append("\n");
        sb.append("    stableCapacity: ").append(toIndentedString(stableCapacity)).append("\n");
        sb.append("    excessFulfilledCapacityBehavior: ")
            .append(toIndentedString(excessFulfilledCapacityBehavior))
            .append("\n");
        sb.append("    instancesBehaviorWithExpiration: ")
            .append(toIndentedString(instancesBehaviorWithExpiration))
            .append("\n");
        sb.append("    validSince: ").append(toIndentedString(validSince)).append("\n");
        sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
        sb.append("    allocationStrategy: ").append(toIndentedString(allocationStrategy)).append("\n");
        sb.append("    regionSpecs: ").append(toIndentedString(regionSpecs)).append("\n");
        sb.append("    supplyOption: ").append(toIndentedString(supplyOption)).append("\n");
        sb.append("    spotPrice: ").append(toIndentedString(spotPrice)).append("\n");
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
