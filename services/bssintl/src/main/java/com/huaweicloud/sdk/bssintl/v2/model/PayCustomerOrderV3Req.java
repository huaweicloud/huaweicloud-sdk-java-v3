package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PayCustomerOrderV3Req
 */
public class PayCustomerOrderV3Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_coupon")

    private String useCoupon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_discount")

    private String useDiscount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_infos")

    private List<CouponSimpleInfoOrderPayV3> couponInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_infos")

    private List<DiscountSimpleInfoV3> discountInfos = null;

    public PayCustomerOrderV3Req withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单编号。 取值为调用“查询订单列表”接口时响应消息中的“order_id”字段的值或调用“续订包年/包月资源”接口时响应消息“order_ids”中的订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public PayCustomerOrderV3Req withUseCoupon(String useCoupon) {
        this.useCoupon = useCoupon;
        return this;
    }

    /**
     * 本次订单支付是否使用优惠券。传递“YES”时，coupon_infos字段必选，传递“NO”时，会忽略coupon_infos字段的传值。 使用优惠券：YES，不使用优惠券：NO
     * @return useCoupon
     */
    public String getUseCoupon() {
        return useCoupon;
    }

    public void setUseCoupon(String useCoupon) {
        this.useCoupon = useCoupon;
    }

    public PayCustomerOrderV3Req withUseDiscount(String useDiscount) {
        this.useDiscount = useDiscount;
        return this;
    }

    /**
     * 本次订单支付是否使用折扣。传递“YES”时，discount_infos字段必选，传递“NO”时，会忽略discount_infos字段的传值。 使用折扣：YES，不使用折扣：NO
     * @return useDiscount
     */
    public String getUseDiscount() {
        return useDiscount;
    }

    public void setUseDiscount(String useDiscount) {
        this.useDiscount = useDiscount;
    }

    public PayCustomerOrderV3Req withCouponInfos(List<CouponSimpleInfoOrderPayV3> couponInfos) {
        this.couponInfos = couponInfos;
        return this;
    }

    public PayCustomerOrderV3Req addCouponInfosItem(CouponSimpleInfoOrderPayV3 couponInfosItem) {
        if (this.couponInfos == null) {
            this.couponInfos = new ArrayList<>();
        }
        this.couponInfos.add(couponInfosItem);
        return this;
    }

    public PayCustomerOrderV3Req withCouponInfos(Consumer<List<CouponSimpleInfoOrderPayV3>> couponInfosSetter) {
        if (this.couponInfos == null) {
            this.couponInfos = new ArrayList<>();
        }
        couponInfosSetter.accept(this.couponInfos);
        return this;
    }

    /**
     * 优惠券ID列表，目前支持传递最多三个优惠券ID。 请从“查询订单可用优惠券”接口的响应参数中获取。 具体参见表1。 当use_coupon参数取值为“YES”，本字段必填；当use_coupon参数取值为“NO”，本字段不可填写，否则报参数错误。
     * @return couponInfos
     */
    public List<CouponSimpleInfoOrderPayV3> getCouponInfos() {
        return couponInfos;
    }

    public void setCouponInfos(List<CouponSimpleInfoOrderPayV3> couponInfos) {
        this.couponInfos = couponInfos;
    }

    public PayCustomerOrderV3Req withDiscountInfos(List<DiscountSimpleInfoV3> discountInfos) {
        this.discountInfos = discountInfos;
        return this;
    }

    public PayCustomerOrderV3Req addDiscountInfosItem(DiscountSimpleInfoV3 discountInfosItem) {
        if (this.discountInfos == null) {
            this.discountInfos = new ArrayList<>();
        }
        this.discountInfos.add(discountInfosItem);
        return this;
    }

    public PayCustomerOrderV3Req withDiscountInfos(Consumer<List<DiscountSimpleInfoV3>> discountInfosSetter) {
        if (this.discountInfos == null) {
            this.discountInfos = new ArrayList<>();
        }
        discountInfosSetter.accept(this.discountInfos);
        return this;
    }

    /**
     * 折扣ID列表，目前仅支持传递一个折扣ID。 请从“查询订单可用折扣”接口的响应参数中获取。 具体参见表2。 当use_discount参数取值为“YES”，本字段必填；当use_discount参数取值为“NO”，本字段不可填写，否则报参数错误。
     * @return discountInfos
     */
    public List<DiscountSimpleInfoV3> getDiscountInfos() {
        return discountInfos;
    }

    public void setDiscountInfos(List<DiscountSimpleInfoV3> discountInfos) {
        this.discountInfos = discountInfos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PayCustomerOrderV3Req payCustomerOrderV3Req = (PayCustomerOrderV3Req) o;
        return Objects.equals(this.orderId, payCustomerOrderV3Req.orderId)
            && Objects.equals(this.useCoupon, payCustomerOrderV3Req.useCoupon)
            && Objects.equals(this.useDiscount, payCustomerOrderV3Req.useDiscount)
            && Objects.equals(this.couponInfos, payCustomerOrderV3Req.couponInfos)
            && Objects.equals(this.discountInfos, payCustomerOrderV3Req.discountInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, useCoupon, useDiscount, couponInfos, discountInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PayCustomerOrderV3Req {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    useCoupon: ").append(toIndentedString(useCoupon)).append("\n");
        sb.append("    useDiscount: ").append(toIndentedString(useDiscount)).append("\n");
        sb.append("    couponInfos: ").append(toIndentedString(couponInfos)).append("\n");
        sb.append("    discountInfos: ").append(toIndentedString(discountInfos)).append("\n");
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
