package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 券的退订金额（降配存在）
 */
public class CouponUnsubscribeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_id")

    private String couponId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_type")

    private String couponType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private Double amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    public CouponUnsubscribeResult withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    /**
     * 券ID
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public CouponUnsubscribeResult withCouponType(String couponType) {
        this.couponType = couponType;
        return this;
    }

    /**
     * 券类型 302：现金券 303：储值卡
     * @return couponType
     */
    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public CouponUnsubscribeResult withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 券退的金额
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public CouponUnsubscribeResult withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 度量单位'
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CouponUnsubscribeResult that = (CouponUnsubscribeResult) obj;
        return Objects.equals(this.couponId, that.couponId) && Objects.equals(this.couponType, that.couponType)
            && Objects.equals(this.amount, that.amount) && Objects.equals(this.measureId, that.measureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId, couponType, amount, measureId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CouponUnsubscribeResult {\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
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
