package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ICouponUseLimitInfoV2
 */
public class ICouponUseLimitInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_limiti_info_id")

    private String useLimitiInfoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_key")

    private String limitKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value1")

    private String value1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value2")

    private String value2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_unit")

    private String valueUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_type")

    private String limitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_plan_id")

    private String promotionPlanId;

    public ICouponUseLimitInfoV2 withUseLimitiInfoId(String useLimitiInfoId) {
        this.useLimitiInfoId = useLimitiInfoId;
        return this;
    }

    /**
     * 使用限制ID，主键。
     * @return useLimitiInfoId
     */
    public String getUseLimitiInfoId() {
        return useLimitiInfoId;
    }

    public void setUseLimitiInfoId(String useLimitiInfoId) {
        this.useLimitiInfoId = useLimitiInfoId;
    }

    public ICouponUseLimitInfoV2 withLimitKey(String limitKey) {
        this.limitKey = limitKey;
        return this;
    }

    /**
     * 折扣限制，key的取值请参考表4。
     * @return limitKey
     */
    public String getLimitKey() {
        return limitKey;
    }

    public void setLimitKey(String limitKey) {
        this.limitKey = limitKey;
    }

    public ICouponUseLimitInfoV2 withValue1(String value1) {
        this.value1 = value1;
        return this;
    }

    /**
     * value1。
     * @return value1
     */
    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public ICouponUseLimitInfoV2 withValue2(String value2) {
        this.value2 = value2;
        return this;
    }

    /**
     * value2。
     * @return value2
     */
    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public ICouponUseLimitInfoV2 withValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
        return this;
    }

    /**
     * value单位。
     * @return valueUnit
     */
    public String getValueUnit() {
        return valueUnit;
    }

    public void setValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
    }

    public ICouponUseLimitInfoV2 withLimitType(String limitType) {
        this.limitType = limitType;
        return this;
    }

    /**
     * 限制类型。
     * @return limitType
     */
    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public ICouponUseLimitInfoV2 withPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
        return this;
    }

    /**
     * 促销计划ID。
     * @return promotionPlanId
     */
    public String getPromotionPlanId() {
        return promotionPlanId;
    }

    public void setPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ICouponUseLimitInfoV2 that = (ICouponUseLimitInfoV2) obj;
        return Objects.equals(this.useLimitiInfoId, that.useLimitiInfoId)
            && Objects.equals(this.limitKey, that.limitKey) && Objects.equals(this.value1, that.value1)
            && Objects.equals(this.value2, that.value2) && Objects.equals(this.valueUnit, that.valueUnit)
            && Objects.equals(this.limitType, that.limitType)
            && Objects.equals(this.promotionPlanId, that.promotionPlanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(useLimitiInfoId, limitKey, value1, value2, valueUnit, limitType, promotionPlanId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ICouponUseLimitInfoV2 {\n");
        sb.append("    useLimitiInfoId: ").append(toIndentedString(useLimitiInfoId)).append("\n");
        sb.append("    limitKey: ").append(toIndentedString(limitKey)).append("\n");
        sb.append("    value1: ").append(toIndentedString(value1)).append("\n");
        sb.append("    value2: ").append(toIndentedString(value2)).append("\n");
        sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
        sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
        sb.append("    promotionPlanId: ").append(toIndentedString(promotionPlanId)).append("\n");
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
