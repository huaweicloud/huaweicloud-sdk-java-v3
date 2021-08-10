package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListOrderCouponsByOrderIdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_coupons")

    private List<CouponInfoV2> userCoupons = null;

    public ListOrderCouponsByOrderIdResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** |参数名称：符合条件的记录总数。| |参数的约束及描述：符合条件的记录总数。|
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListOrderCouponsByOrderIdResponse withUserCoupons(List<CouponInfoV2> userCoupons) {
        this.userCoupons = userCoupons;
        return this;
    }

    public ListOrderCouponsByOrderIdResponse addUserCouponsItem(CouponInfoV2 userCouponsItem) {
        if (this.userCoupons == null) {
            this.userCoupons = new ArrayList<>();
        }
        this.userCoupons.add(userCouponsItem);
        return this;
    }

    public ListOrderCouponsByOrderIdResponse withUserCoupons(Consumer<List<CouponInfoV2>> userCouponsSetter) {
        if (this.userCoupons == null) {
            this.userCoupons = new ArrayList<>();
        }
        userCouponsSetter.accept(this.userCoupons);
        return this;
    }

    /** |参数名称：客户订单详情信息。具体请参见表 CustomerOrderV2| |参数约束以及描述：客户订单详情信息。具体请参见表 CustomerOrderV2|
     * 
     * @return userCoupons */
    public List<CouponInfoV2> getUserCoupons() {
        return userCoupons;
    }

    public void setUserCoupons(List<CouponInfoV2> userCoupons) {
        this.userCoupons = userCoupons;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOrderCouponsByOrderIdResponse listOrderCouponsByOrderIdResponse = (ListOrderCouponsByOrderIdResponse) o;
        return Objects.equals(this.count, listOrderCouponsByOrderIdResponse.count)
            && Objects.equals(this.userCoupons, listOrderCouponsByOrderIdResponse.userCoupons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, userCoupons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrderCouponsByOrderIdResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    userCoupons: ").append(toIndentedString(userCoupons)).append("\n");
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
