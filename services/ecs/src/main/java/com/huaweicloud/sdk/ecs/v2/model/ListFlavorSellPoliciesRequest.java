package com.huaweicloud.sdk.ecs.v2.model;

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
public class ListFlavorSellPoliciesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    /**
     * 云服务器的系统规格销售状态。  取值范围：  - available：正常售卖 - sellout：售罄
     */
    public static final class SellStatusEnum {

        /**
         * Enum AVAILABLE for value: "available"
         */
        public static final SellStatusEnum AVAILABLE = new SellStatusEnum("available");

        /**
         * Enum SELLOUT for value: "sellout"
         */
        public static final SellStatusEnum SELLOUT = new SellStatusEnum("sellout");

        private static final Map<String, SellStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SellStatusEnum> createStaticFields() {
            Map<String, SellStatusEnum> map = new HashMap<>();
            map.put("available", AVAILABLE);
            map.put("sellout", SELLOUT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SellStatusEnum(String value) {
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
        public static SellStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SellStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SellStatusEnum(value);
            }
            return result;
        }

        public static SellStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SellStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SellStatusEnum) {
                return this.value.equals(((SellStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sell_status")

    private SellStatusEnum sellStatus;

    /**
     * 计费模式。  key的取值范围：  - postPaid：按需计费实例。 - prePaid：包年/包月计费实例。 - spot：竞价实例。 - ri：预留实例。
     */
    public static final class SellModeEnum {

        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final SellModeEnum POSTPAID = new SellModeEnum("postPaid");

        /**
         * Enum PREPAID for value: "prePaid"
         */
        public static final SellModeEnum PREPAID = new SellModeEnum("prePaid");

        /**
         * Enum SPOT for value: "spot"
         */
        public static final SellModeEnum SPOT = new SellModeEnum("spot");

        /**
         * Enum RI for value: "ri"
         */
        public static final SellModeEnum RI = new SellModeEnum("ri");

        private static final Map<String, SellModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SellModeEnum> createStaticFields() {
            Map<String, SellModeEnum> map = new HashMap<>();
            map.put("postPaid", POSTPAID);
            map.put("prePaid", PREPAID);
            map.put("spot", SPOT);
            map.put("ri", RI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SellModeEnum(String value) {
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
        public static SellModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SellModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SellModeEnum(value);
            }
            return result;
        }

        public static SellModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SellModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SellModeEnum) {
                return this.value.equals(((SellModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sell_mode")

    private SellModeEnum sellMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private String availabilityZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longest_spot_duration_hours_gt")

    private Integer longestSpotDurationHoursGt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "largest_spot_duration_count_gt")

    private Integer largestSpotDurationCountGt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longest_spot_duration_hours")

    private Integer longestSpotDurationHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "largest_spot_duration_count")

    private Integer largestSpotDurationCount;

    /**
     * 中断策略。  取值范围：  - immediate：立即释放 - delay：延迟释放
     */
    public static final class InterruptionPolicyEnum {

        /**
         * Enum IMMEDIATE for value: "immediate"
         */
        public static final InterruptionPolicyEnum IMMEDIATE = new InterruptionPolicyEnum("immediate");

        /**
         * Enum DELAY for value: "delay"
         */
        public static final InterruptionPolicyEnum DELAY = new InterruptionPolicyEnum("delay");

        private static final Map<String, InterruptionPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InterruptionPolicyEnum> createStaticFields() {
            Map<String, InterruptionPolicyEnum> map = new HashMap<>();
            map.put("immediate", IMMEDIATE);
            map.put("delay", DELAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InterruptionPolicyEnum(String value) {
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
        public static InterruptionPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            InterruptionPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InterruptionPolicyEnum(value);
            }
            return result;
        }

        public static InterruptionPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            InterruptionPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InterruptionPolicyEnum) {
                return this.value.equals(((InterruptionPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interruption_policy")

    private InterruptionPolicyEnum interruptionPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListFlavorSellPoliciesRequest withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 云服务器的系统规格的ID
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public ListFlavorSellPoliciesRequest withSellStatus(SellStatusEnum sellStatus) {
        this.sellStatus = sellStatus;
        return this;
    }

    /**
     * 云服务器的系统规格销售状态。  取值范围：  - available：正常售卖 - sellout：售罄
     * @return sellStatus
     */
    public SellStatusEnum getSellStatus() {
        return sellStatus;
    }

    public void setSellStatus(SellStatusEnum sellStatus) {
        this.sellStatus = sellStatus;
    }

    public ListFlavorSellPoliciesRequest withSellMode(SellModeEnum sellMode) {
        this.sellMode = sellMode;
        return this;
    }

    /**
     * 计费模式。  key的取值范围：  - postPaid：按需计费实例。 - prePaid：包年/包月计费实例。 - spot：竞价实例。 - ri：预留实例。
     * @return sellMode
     */
    public SellModeEnum getSellMode() {
        return sellMode;
    }

    public void setSellMode(SellModeEnum sellMode) {
        this.sellMode = sellMode;
    }

    public ListFlavorSellPoliciesRequest withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * 可用区，需要指定可用区（AZ）
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public ListFlavorSellPoliciesRequest withLongestSpotDurationHoursGt(Integer longestSpotDurationHoursGt) {
        this.longestSpotDurationHoursGt = longestSpotDurationHoursGt;
        return this;
    }

    /**
     * 查询竞价实例时长大于设置值的策略
     * @return longestSpotDurationHoursGt
     */
    public Integer getLongestSpotDurationHoursGt() {
        return longestSpotDurationHoursGt;
    }

    public void setLongestSpotDurationHoursGt(Integer longestSpotDurationHoursGt) {
        this.longestSpotDurationHoursGt = longestSpotDurationHoursGt;
    }

    public ListFlavorSellPoliciesRequest withLargestSpotDurationCountGt(Integer largestSpotDurationCountGt) {
        this.largestSpotDurationCountGt = largestSpotDurationCountGt;
        return this;
    }

    /**
     * 查询“竞价实例时长”的个数大于设置值的策略
     * @return largestSpotDurationCountGt
     */
    public Integer getLargestSpotDurationCountGt() {
        return largestSpotDurationCountGt;
    }

    public void setLargestSpotDurationCountGt(Integer largestSpotDurationCountGt) {
        this.largestSpotDurationCountGt = largestSpotDurationCountGt;
    }

    public ListFlavorSellPoliciesRequest withLongestSpotDurationHours(Integer longestSpotDurationHours) {
        this.longestSpotDurationHours = longestSpotDurationHours;
        return this;
    }

    /**
     * 查询竞价实例时长等于设置值的策略
     * @return longestSpotDurationHours
     */
    public Integer getLongestSpotDurationHours() {
        return longestSpotDurationHours;
    }

    public void setLongestSpotDurationHours(Integer longestSpotDurationHours) {
        this.longestSpotDurationHours = longestSpotDurationHours;
    }

    public ListFlavorSellPoliciesRequest withLargestSpotDurationCount(Integer largestSpotDurationCount) {
        this.largestSpotDurationCount = largestSpotDurationCount;
        return this;
    }

    /**
     * 查询“竞价实例时长”的个数等于设置值的策略
     * @return largestSpotDurationCount
     */
    public Integer getLargestSpotDurationCount() {
        return largestSpotDurationCount;
    }

    public void setLargestSpotDurationCount(Integer largestSpotDurationCount) {
        this.largestSpotDurationCount = largestSpotDurationCount;
    }

    public ListFlavorSellPoliciesRequest withInterruptionPolicy(InterruptionPolicyEnum interruptionPolicy) {
        this.interruptionPolicy = interruptionPolicy;
        return this;
    }

    /**
     * 中断策略。  取值范围：  - immediate：立即释放 - delay：延迟释放
     * @return interruptionPolicy
     */
    public InterruptionPolicyEnum getInterruptionPolicy() {
        return interruptionPolicy;
    }

    public void setInterruptionPolicy(InterruptionPolicyEnum interruptionPolicy) {
        this.interruptionPolicy = interruptionPolicy;
    }

    public ListFlavorSellPoliciesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单页面可显示的flavor条数最大值，默认是1000。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListFlavorSellPoliciesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 以单页最后一条flavor的ID作为分页标记。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlavorSellPoliciesRequest listFlavorSellPoliciesRequest = (ListFlavorSellPoliciesRequest) o;
        return Objects.equals(this.flavorId, listFlavorSellPoliciesRequest.flavorId)
            && Objects.equals(this.sellStatus, listFlavorSellPoliciesRequest.sellStatus)
            && Objects.equals(this.sellMode, listFlavorSellPoliciesRequest.sellMode)
            && Objects.equals(this.availabilityZoneId, listFlavorSellPoliciesRequest.availabilityZoneId)
            && Objects.equals(this.longestSpotDurationHoursGt, listFlavorSellPoliciesRequest.longestSpotDurationHoursGt)
            && Objects.equals(this.largestSpotDurationCountGt, listFlavorSellPoliciesRequest.largestSpotDurationCountGt)
            && Objects.equals(this.longestSpotDurationHours, listFlavorSellPoliciesRequest.longestSpotDurationHours)
            && Objects.equals(this.largestSpotDurationCount, listFlavorSellPoliciesRequest.largestSpotDurationCount)
            && Objects.equals(this.interruptionPolicy, listFlavorSellPoliciesRequest.interruptionPolicy)
            && Objects.equals(this.limit, listFlavorSellPoliciesRequest.limit)
            && Objects.equals(this.marker, listFlavorSellPoliciesRequest.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorId,
            sellStatus,
            sellMode,
            availabilityZoneId,
            longestSpotDurationHoursGt,
            largestSpotDurationCountGt,
            longestSpotDurationHours,
            largestSpotDurationCount,
            interruptionPolicy,
            limit,
            marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorSellPoliciesRequest {\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    sellStatus: ").append(toIndentedString(sellStatus)).append("\n");
        sb.append("    sellMode: ").append(toIndentedString(sellMode)).append("\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    longestSpotDurationHoursGt: ").append(toIndentedString(longestSpotDurationHoursGt)).append("\n");
        sb.append("    largestSpotDurationCountGt: ").append(toIndentedString(largestSpotDurationCountGt)).append("\n");
        sb.append("    longestSpotDurationHours: ").append(toIndentedString(longestSpotDurationHours)).append("\n");
        sb.append("    largestSpotDurationCount: ").append(toIndentedString(largestSpotDurationCount)).append("\n");
        sb.append("    interruptionPolicy: ").append(toIndentedString(interruptionPolicy)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
