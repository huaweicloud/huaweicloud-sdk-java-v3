package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CouponMaxUseQuantity */
public class CouponMaxUseQuantity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_type")

    private Integer couponType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_group")

    private Integer couponGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_quantity_value")

    private Integer useQuantityValue;

    public CouponMaxUseQuantity withCouponType(Integer couponType) {
        this.couponType = couponType;
        return this;
    }

    /** |参数名称：优惠券类型| |参数的约束及描述：1：代金券，2：折扣券，3：产品券,4: 现金券|
     * 
     * @return couponType */
    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public CouponMaxUseQuantity withCouponGroup(Integer couponGroup) {
        this.couponGroup = couponGroup;
        return this;
    }

    /** |参数名称：优惠券分组| |参数的约束及描述：1: 云市场发放的券 3: 华为云券-使用限制-抵扣硬件的券 0: 华为云服务券（排除上述取值之外的券）|
     * 
     * @return couponGroup */
    public Integer getCouponGroup() {
        return couponGroup;
    }

    public void setCouponGroup(Integer couponGroup) {
        this.couponGroup = couponGroup;
    }

    public CouponMaxUseQuantity withUseQuantityValue(Integer useQuantityValue) {
        this.useQuantityValue = useQuantityValue;
        return this;
    }

    /** |参数名称：优惠券使用数量value| |参数的约束及描述：优惠券使用数量value。注：专用券使用数量仅指单个订单内，对于合并支付，每个订单都可以使用一张专用券|
     * 
     * @return useQuantityValue */
    public Integer getUseQuantityValue() {
        return useQuantityValue;
    }

    public void setUseQuantityValue(Integer useQuantityValue) {
        this.useQuantityValue = useQuantityValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CouponMaxUseQuantity couponMaxUseQuantity = (CouponMaxUseQuantity) o;
        return Objects.equals(this.couponType, couponMaxUseQuantity.couponType)
            && Objects.equals(this.couponGroup, couponMaxUseQuantity.couponGroup)
            && Objects.equals(this.useQuantityValue, couponMaxUseQuantity.useQuantityValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponType, couponGroup, useQuantityValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CouponMaxUseQuantity {\n");
        sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
        sb.append("    couponGroup: ").append(toIndentedString(couponGroup)).append("\n");
        sb.append("    useQuantityValue: ").append(toIndentedString(useQuantityValue)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
