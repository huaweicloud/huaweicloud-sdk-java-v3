package com.huaweicloud.sdk.rfs.v1.model;

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
 * 资源栈集操作（stack_set_operation）的部署策略。该参数只在指定的单次操作中生效。  当用户不指定该参数时，默认的操作部署策略为区域（region）内资源栈实例串行部署，即每次只执行一个资源栈实例，区域（region）间随机且串行部署，执行完一个region下的全部资源栈实例后，才会选择另一个region部署，容错次数默认为0。  该参数可以在生成资源栈集操作的四个API中指定：  创建资源栈实例（CreateStackInstance），部署资源栈集（DeployStackSet），更新资源栈实例（UpdateStackInstance），删除资源栈实例（DeleteStackInstance）
 */
public class OperationPreferences {

    /**
     * 部署资源栈实例时区域（region）的执行策略，分为两种，SEQUENTIAL和PARALLEL，区分大小写，默认值为SEQUENTIAL  详细介绍：  * `SEQUENTIAL`：顺序执行，执行完一个region下的全部资源栈实例后再去执行另一个region。默认顺序执行。  * `PARALLEL`：并发执行，并发部署所有指定区域的资源栈实例。
     */
    public static final class RegionConcurrencyTypeEnum {

        /**
         * Enum SEQUENTIAL for value: "SEQUENTIAL"
         */
        public static final RegionConcurrencyTypeEnum SEQUENTIAL = new RegionConcurrencyTypeEnum("SEQUENTIAL");

        /**
         * Enum PARALLEL for value: "PARALLEL"
         */
        public static final RegionConcurrencyTypeEnum PARALLEL = new RegionConcurrencyTypeEnum("PARALLEL");

        private static final Map<String, RegionConcurrencyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RegionConcurrencyTypeEnum> createStaticFields() {
            Map<String, RegionConcurrencyTypeEnum> map = new HashMap<>();
            map.put("SEQUENTIAL", SEQUENTIAL);
            map.put("PARALLEL", PARALLEL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RegionConcurrencyTypeEnum(String value) {
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
        public static RegionConcurrencyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RegionConcurrencyTypeEnum(value));
        }

        public static RegionConcurrencyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RegionConcurrencyTypeEnum) {
                return this.value.equals(((RegionConcurrencyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_concurrency_type")

    private RegionConcurrencyTypeEnum regionConcurrencyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_order")

    private List<String> regionOrder = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_tolerance_count")

    private Long failureToleranceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_tolerance_percentage")

    private Long failureTolerancePercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_concurrent_count")

    private Long maxConcurrentCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_concurrent_percentage")

    private Long maxConcurrentPercentage;

    /**
     * 资源栈集操作部署的失败容忍模式，分为两种，STRICT_FAILURE_TOLERANCE和SOFT_FAILURE_TOLERANCE，区分大小写，默认值为STRICT_FAILURE_TOLERANCE。  详细介绍：  * `STRICT_FAILURE_TOLERANCE`：此选项会动态降低并发级别，以确保同region下部署失败的账号数量永远不超过 failure_tolerance_count + 1。当用户指定failure_tolerance_percentage时，确保同region下部署失败的账号数量不超过 failure_tolerance_percentage * 资源栈实例数 + 1。  * 初始实际最大并发数为max_concurrent_count，如果用户指定的是max_concurrent_percentage，则初始实际最大并发数为 max_concurrent_percentage * 资源栈实例数，随后，实际最大并发数会根据失败次数增加而减少。  * `SOFT_FAILURE_TOLERANCE`：此选项将failure_tolerance_count (failure_tolerance_percentage) 与实际并发数分离开。该参数允许资源栈集操作始终以指定的 max_concurrent_count 或 max_concurrent_percentage 操作资源栈实例。  * 此时不保证资源栈实例失败总数小于 failure_tolerance_count + 1，如果用户指定的是failure_tolerance_percentage的值，则不保证资源栈实例失败总数小于 failure_tolerance_percentage * 资源栈实例数 + 1。
     */
    public static final class FailureToleranceModeEnum {

        /**
         * Enum STRICT_FAILURE_TOLERANCE for value: "STRICT_FAILURE_TOLERANCE"
         */
        public static final FailureToleranceModeEnum STRICT_FAILURE_TOLERANCE =
            new FailureToleranceModeEnum("STRICT_FAILURE_TOLERANCE");

        /**
         * Enum SOFT_FAILURE_TOLERANCE for value: "SOFT_FAILURE_TOLERANCE"
         */
        public static final FailureToleranceModeEnum SOFT_FAILURE_TOLERANCE =
            new FailureToleranceModeEnum("SOFT_FAILURE_TOLERANCE");

        private static final Map<String, FailureToleranceModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FailureToleranceModeEnum> createStaticFields() {
            Map<String, FailureToleranceModeEnum> map = new HashMap<>();
            map.put("STRICT_FAILURE_TOLERANCE", STRICT_FAILURE_TOLERANCE);
            map.put("SOFT_FAILURE_TOLERANCE", SOFT_FAILURE_TOLERANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FailureToleranceModeEnum(String value) {
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
        public static FailureToleranceModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FailureToleranceModeEnum(value));
        }

        public static FailureToleranceModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FailureToleranceModeEnum) {
                return this.value.equals(((FailureToleranceModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_tolerance_mode")

    private FailureToleranceModeEnum failureToleranceMode;

    public OperationPreferences withRegionConcurrencyType(RegionConcurrencyTypeEnum regionConcurrencyType) {
        this.regionConcurrencyType = regionConcurrencyType;
        return this;
    }

    /**
     * 部署资源栈实例时区域（region）的执行策略，分为两种，SEQUENTIAL和PARALLEL，区分大小写，默认值为SEQUENTIAL  详细介绍：  * `SEQUENTIAL`：顺序执行，执行完一个region下的全部资源栈实例后再去执行另一个region。默认顺序执行。  * `PARALLEL`：并发执行，并发部署所有指定区域的资源栈实例。
     * @return regionConcurrencyType
     */
    public RegionConcurrencyTypeEnum getRegionConcurrencyType() {
        return regionConcurrencyType;
    }

    public void setRegionConcurrencyType(RegionConcurrencyTypeEnum regionConcurrencyType) {
        this.regionConcurrencyType = regionConcurrencyType;
    }

    public OperationPreferences withRegionOrder(List<String> regionOrder) {
        this.regionOrder = regionOrder;
        return this;
    }

    public OperationPreferences addRegionOrderItem(String regionOrderItem) {
        if (this.regionOrder == null) {
            this.regionOrder = new ArrayList<>();
        }
        this.regionOrder.add(regionOrderItem);
        return this;
    }

    public OperationPreferences withRegionOrder(Consumer<List<String>> regionOrderSetter) {
        if (this.regionOrder == null) {
            this.regionOrder = new ArrayList<>();
        }
        regionOrderSetter.accept(this.regionOrder);
        return this;
    }

    /**
     * 区域（region）部署顺序。只有当用户指定region_concurrency_type为SEQUENTIAL时才会允许指定该参数。用户指定部署region的顺序，不允许出现资源栈集管理之外的region。  如果不指定，实际部署region顺序随机。部署顺序仅在当次部署时生效，应该包含且仅包含本次部署的所有region。
     * @return regionOrder
     */
    public List<String> getRegionOrder() {
        return regionOrder;
    }

    public void setRegionOrder(List<String> regionOrder) {
        this.regionOrder = regionOrder;
    }

    public OperationPreferences withFailureToleranceCount(Long failureToleranceCount) {
        this.failureToleranceCount = failureToleranceCount;
        return this;
    }

    /**
     * 容错次数。用户定义在每个区域（region）下，允许部署失败的资源栈实例数量。该参数取值默认为0，限定0和正整数。  如果定义region顺序执行（region_concurrency_type值为SEQUENTIAL），在某个region超过容错次数时，资源栈集会取消所有状态仍处于WAIT_IN_PROGRESS状态的实例。被取消的实例状态最终变为CANCEL_COMPLETE；  如果是region并行执行（region_concurrency_type值为PARALLEL），在某个region超过容错次数时，资源栈集只会取消该region下所有处于WAIT_IN_PROGRESS状态的实例。被取消的实例状态最终变为CANCEL_COMPLETE。  对处于OPERATION_IN_PROGRESS，或已经部署完成，即处于OPERATION_COMPLETE或者OPERATION_FAILED状态的资源栈实例，不受影响，状态不变。  failure_tolerance_count  和 failure_tolerance_percentage 仅能有一个存在。
     * minimum: 0
     * maximum: 100
     * @return failureToleranceCount
     */
    public Long getFailureToleranceCount() {
        return failureToleranceCount;
    }

    public void setFailureToleranceCount(Long failureToleranceCount) {
        this.failureToleranceCount = failureToleranceCount;
    }

    public OperationPreferences withFailureTolerancePercentage(Long failureTolerancePercentage) {
        this.failureTolerancePercentage = failureTolerancePercentage;
        return this;
    }

    /**
     * 容错百分比。定义每个区域（region）下，允许部署失败的资源栈实例数占该region下所有资源栈实例数的百分比。该参数取值默认为0，限定0和正整数。  通过容错百分比*资源栈实例数，并向下取整，得到实际容错次数。  failure_tolerance_count  和 failure_tolerance_percentage 仅能有一个存在。
     * minimum: 0
     * maximum: 100
     * @return failureTolerancePercentage
     */
    public Long getFailureTolerancePercentage() {
        return failureTolerancePercentage;
    }

    public void setFailureTolerancePercentage(Long failureTolerancePercentage) {
        this.failureTolerancePercentage = failureTolerancePercentage;
    }

    public OperationPreferences withMaxConcurrentCount(Long maxConcurrentCount) {
        this.maxConcurrentCount = maxConcurrentCount;
        return this;
    }

    /**
     * 每个区域（region）下可同时部署资源栈实例的最大账号数。该参数取值默认为1，限定为正整数。  最大并发账号数最多比容错次数多1。如果用户指定failure_tolerance_percentage，最大并发账号数最多比 failure_tolerance_percentage * 资源栈实例数多1。保证部署在所需的容错级别停止。  max_concurrent_count 和 max_concurrent_percentage 仅能有一个存在。
     * minimum: 1
     * maximum: 5
     * @return maxConcurrentCount
     */
    public Long getMaxConcurrentCount() {
        return maxConcurrentCount;
    }

    public void setMaxConcurrentCount(Long maxConcurrentCount) {
        this.maxConcurrentCount = maxConcurrentCount;
    }

    public OperationPreferences withMaxConcurrentPercentage(Long maxConcurrentPercentage) {
        this.maxConcurrentPercentage = maxConcurrentPercentage;
        return this;
    }

    /**
     * 最大并发账号百分比，每个区域（region）中可同时部署的资源栈实例的最大账号百分比。该参数取值默认为1，限定正整数。  RFS根据百分比 *（每个region下资源栈实例数）得到的值，再向下取整，得到实际最大并发账号数。如果实际最大并发账号数向下取整值为0时，则默认选择最大并发账号数为1。  通过百分比计算得到的实际最大并发账号数最多比容错次数多1。如果用户指定failure_tolerance_percentage，实际最大并发账号数最多比 failure_tolerance_percentage * 资源栈实例数多1。保证部署在所需的容错级别停止。  max_concurrent_count 和 max_concurrent_percentage 仅能有一个存在。
     * minimum: 1
     * maximum: 100
     * @return maxConcurrentPercentage
     */
    public Long getMaxConcurrentPercentage() {
        return maxConcurrentPercentage;
    }

    public void setMaxConcurrentPercentage(Long maxConcurrentPercentage) {
        this.maxConcurrentPercentage = maxConcurrentPercentage;
    }

    public OperationPreferences withFailureToleranceMode(FailureToleranceModeEnum failureToleranceMode) {
        this.failureToleranceMode = failureToleranceMode;
        return this;
    }

    /**
     * 资源栈集操作部署的失败容忍模式，分为两种，STRICT_FAILURE_TOLERANCE和SOFT_FAILURE_TOLERANCE，区分大小写，默认值为STRICT_FAILURE_TOLERANCE。  详细介绍：  * `STRICT_FAILURE_TOLERANCE`：此选项会动态降低并发级别，以确保同region下部署失败的账号数量永远不超过 failure_tolerance_count + 1。当用户指定failure_tolerance_percentage时，确保同region下部署失败的账号数量不超过 failure_tolerance_percentage * 资源栈实例数 + 1。  * 初始实际最大并发数为max_concurrent_count，如果用户指定的是max_concurrent_percentage，则初始实际最大并发数为 max_concurrent_percentage * 资源栈实例数，随后，实际最大并发数会根据失败次数增加而减少。  * `SOFT_FAILURE_TOLERANCE`：此选项将failure_tolerance_count (failure_tolerance_percentage) 与实际并发数分离开。该参数允许资源栈集操作始终以指定的 max_concurrent_count 或 max_concurrent_percentage 操作资源栈实例。  * 此时不保证资源栈实例失败总数小于 failure_tolerance_count + 1，如果用户指定的是failure_tolerance_percentage的值，则不保证资源栈实例失败总数小于 failure_tolerance_percentage * 资源栈实例数 + 1。
     * @return failureToleranceMode
     */
    public FailureToleranceModeEnum getFailureToleranceMode() {
        return failureToleranceMode;
    }

    public void setFailureToleranceMode(FailureToleranceModeEnum failureToleranceMode) {
        this.failureToleranceMode = failureToleranceMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperationPreferences that = (OperationPreferences) obj;
        return Objects.equals(this.regionConcurrencyType, that.regionConcurrencyType)
            && Objects.equals(this.regionOrder, that.regionOrder)
            && Objects.equals(this.failureToleranceCount, that.failureToleranceCount)
            && Objects.equals(this.failureTolerancePercentage, that.failureTolerancePercentage)
            && Objects.equals(this.maxConcurrentCount, that.maxConcurrentCount)
            && Objects.equals(this.maxConcurrentPercentage, that.maxConcurrentPercentage)
            && Objects.equals(this.failureToleranceMode, that.failureToleranceMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionConcurrencyType,
            regionOrder,
            failureToleranceCount,
            failureTolerancePercentage,
            maxConcurrentCount,
            maxConcurrentPercentage,
            failureToleranceMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationPreferences {\n");
        sb.append("    regionConcurrencyType: ").append(toIndentedString(regionConcurrencyType)).append("\n");
        sb.append("    regionOrder: ").append(toIndentedString(regionOrder)).append("\n");
        sb.append("    failureToleranceCount: ").append(toIndentedString(failureToleranceCount)).append("\n");
        sb.append("    failureTolerancePercentage: ").append(toIndentedString(failureTolerancePercentage)).append("\n");
        sb.append("    maxConcurrentCount: ").append(toIndentedString(maxConcurrentCount)).append("\n");
        sb.append("    maxConcurrentPercentage: ").append(toIndentedString(maxConcurrentPercentage)).append("\n");
        sb.append("    failureToleranceMode: ").append(toIndentedString(failureToleranceMode)).append("\n");
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
