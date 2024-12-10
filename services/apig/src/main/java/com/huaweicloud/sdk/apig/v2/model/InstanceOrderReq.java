package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceOrderReq
 */
public class InstanceOrderReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    /**
     * 计费模式： - 0：按需 - 1：包周期 
     */
    public static final class ChargingModeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ChargingModeEnum NUMBER_0 = new ChargingModeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ChargingModeEnum NUMBER_1 = new ChargingModeEnum(1);

        private static final Map<Integer, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ChargingModeEnum> createStaticFields() {
            Map<Integer, ChargingModeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ChargingModeEnum(Integer value) {
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
        public static ChargingModeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargingModeEnum(value));
        }

        public static ChargingModeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private ChargingModeEnum chargingMode;

    /**
     * 支付模式： - ALL_UPFRONT：全预付 
     */
    public static final class PaymentModeEnum {

        /**
         * Enum ALL_UPFRONT for value: "ALL_UPFRONT"
         */
        public static final PaymentModeEnum ALL_UPFRONT = new PaymentModeEnum("ALL_UPFRONT");

        private static final Map<String, PaymentModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PaymentModeEnum> createStaticFields() {
            Map<String, PaymentModeEnum> map = new HashMap<>();
            map.put("ALL_UPFRONT", ALL_UPFRONT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PaymentModeEnum(String value) {
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
        public static PaymentModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PaymentModeEnum(value));
        }

        public static PaymentModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PaymentModeEnum) {
                return this.value.equals(((PaymentModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_mode")

    private PaymentModeEnum paymentMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    /**
     * 是否支持自动续费： - 0：不自动续费 - 1：自动续费 
     */
    public static final class IsAutoRenewEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final IsAutoRenewEnum NUMBER_0 = new IsAutoRenewEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IsAutoRenewEnum NUMBER_1 = new IsAutoRenewEnum(1);

        private static final Map<Integer, IsAutoRenewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IsAutoRenewEnum> createStaticFields() {
            Map<Integer, IsAutoRenewEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IsAutoRenewEnum(Integer value) {
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
        public static IsAutoRenewEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsAutoRenewEnum(value));
        }

        public static IsAutoRenewEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsAutoRenewEnum) {
                return this.value.equals(((IsAutoRenewEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private IsAutoRenewEnum isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_id")

    private String promotionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_plan_id")

    private String promotionPlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_info")

    private String promotionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "composite_product_id")

    private String compositeProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_info")

    private InstanceCreateReqV2 instanceInfo;

    public InstanceOrderReq withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品编号
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public InstanceOrderReq withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式： - 0：按需 - 1：包周期 
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public InstanceOrderReq withPaymentMode(PaymentModeEnum paymentMode) {
        this.paymentMode = paymentMode;
        return this;
    }

    /**
     * 支付模式： - ALL_UPFRONT：全预付 
     * @return paymentMode
     */
    public PaymentModeEnum getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentModeEnum paymentMode) {
        this.paymentMode = paymentMode;
    }

    public InstanceOrderReq withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型： - 2：月 - 3：年 
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public InstanceOrderReq withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数：1-9 
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public InstanceOrderReq withIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否支持自动续费： - 0：不自动续费 - 1：自动续费 
     * @return isAutoRenew
     */
    public IsAutoRenewEnum getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(IsAutoRenewEnum isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public InstanceOrderReq withPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }

    /**
     * 促销产品编号
     * @return promotionId
     */
    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public InstanceOrderReq withPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
        return this;
    }

    /**
     * 促销计划编号
     * @return promotionPlanId
     */
    public String getPromotionPlanId() {
        return promotionPlanId;
    }

    public void setPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
    }

    public InstanceOrderReq withPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }

    /**
     * 促销信息
     * @return promotionInfo
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public InstanceOrderReq withCompositeProductId(String compositeProductId) {
        this.compositeProductId = compositeProductId;
        return this;
    }

    /**
     * 组合产品编号
     * @return compositeProductId
     */
    public String getCompositeProductId() {
        return compositeProductId;
    }

    public void setCompositeProductId(String compositeProductId) {
        this.compositeProductId = compositeProductId;
    }

    public InstanceOrderReq withInstanceInfo(InstanceCreateReqV2 instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }

    public InstanceOrderReq withInstanceInfo(Consumer<InstanceCreateReqV2> instanceInfoSetter) {
        if (this.instanceInfo == null) {
            this.instanceInfo = new InstanceCreateReqV2();
            instanceInfoSetter.accept(this.instanceInfo);
        }

        return this;
    }

    /**
     * Get instanceInfo
     * @return instanceInfo
     */
    public InstanceCreateReqV2 getInstanceInfo() {
        return instanceInfo;
    }

    public void setInstanceInfo(InstanceCreateReqV2 instanceInfo) {
        this.instanceInfo = instanceInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceOrderReq that = (InstanceOrderReq) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.paymentMode, that.paymentMode) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.isAutoRenew, that.isAutoRenew)
            && Objects.equals(this.promotionId, that.promotionId)
            && Objects.equals(this.promotionPlanId, that.promotionPlanId)
            && Objects.equals(this.promotionInfo, that.promotionInfo)
            && Objects.equals(this.compositeProductId, that.compositeProductId)
            && Objects.equals(this.instanceInfo, that.instanceInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId,
            chargingMode,
            paymentMode,
            periodType,
            periodNum,
            isAutoRenew,
            promotionId,
            promotionPlanId,
            promotionInfo,
            compositeProductId,
            instanceInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceOrderReq {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
        sb.append("    promotionPlanId: ").append(toIndentedString(promotionPlanId)).append("\n");
        sb.append("    promotionInfo: ").append(toIndentedString(promotionInfo)).append("\n");
        sb.append("    compositeProductId: ").append(toIndentedString(compositeProductId)).append("\n");
        sb.append("    instanceInfo: ").append(toIndentedString(instanceInfo)).append("\n");
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
