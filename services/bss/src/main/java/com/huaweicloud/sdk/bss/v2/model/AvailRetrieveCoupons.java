package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AvailRetrieveCoupons
 */
public class AvailRetrieveCoupons {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_id")

    private String couponId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_name")

    private String planName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_coupon_id")

    private String subCouponId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "balance")

    private String balance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_limits")

    private List<ICouponUseLimitInfoV2> useLimits = null;

    public AvailRetrieveCoupons withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    /**
     * 主优惠券ID。
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public AvailRetrieveCoupons withPlanName(String planName) {
        this.planName = planName;
        return this;
    }

    /**
     * 促销计划名称。
     * @return planName
     */
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public AvailRetrieveCoupons withSubCouponId(String subCouponId) {
        this.subCouponId = subCouponId;
        return this;
    }

    /**
     * 子优惠券ID。主优惠券拨款后生成的子优惠券ID。
     * @return subCouponId
     */
    public String getSubCouponId() {
        return subCouponId;
    }

    public void setSubCouponId(String subCouponId) {
        this.subCouponId = subCouponId;
    }

    public AvailRetrieveCoupons withBalance(String balance) {
        this.balance = balance;
        return this;
    }

    /**
     * 优惠券余额。单位为元
     * @return balance
     */
    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public AvailRetrieveCoupons withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 生效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public AvailRetrieveCoupons withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 失效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public AvailRetrieveCoupons withUseLimits(List<ICouponUseLimitInfoV2> useLimits) {
        this.useLimits = useLimits;
        return this;
    }

    public AvailRetrieveCoupons addUseLimitsItem(ICouponUseLimitInfoV2 useLimitsItem) {
        if (this.useLimits == null) {
            this.useLimits = new ArrayList<>();
        }
        this.useLimits.add(useLimitsItem);
        return this;
    }

    public AvailRetrieveCoupons withUseLimits(Consumer<List<ICouponUseLimitInfoV2>> useLimitsSetter) {
        if (this.useLimits == null) {
            this.useLimits = new ArrayList<>();
        }
        useLimitsSetter.accept(this.useLimits);
        return this;
    }

    /**
     * 优惠券限制。 具体请参见表3。
     * @return useLimits
     */
    public List<ICouponUseLimitInfoV2> getUseLimits() {
        return useLimits;
    }

    public void setUseLimits(List<ICouponUseLimitInfoV2> useLimits) {
        this.useLimits = useLimits;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvailRetrieveCoupons that = (AvailRetrieveCoupons) obj;
        return Objects.equals(this.couponId, that.couponId) && Objects.equals(this.planName, that.planName)
            && Objects.equals(this.subCouponId, that.subCouponId) && Objects.equals(this.balance, that.balance)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.useLimits, that.useLimits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId, planName, subCouponId, balance, effectiveTime, expireTime, useLimits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailRetrieveCoupons {\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
        sb.append("    subCouponId: ").append(toIndentedString(subCouponId)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    useLimits: ").append(toIndentedString(useLimits)).append("\n");
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
