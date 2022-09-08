package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSubCustomerCouponsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_coupons")

    private List<IQueryUserCouponsResultV2> userCoupons = null;

    public ListSubCustomerCouponsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 符合查询条件的总条数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListSubCustomerCouponsResponse withUserCoupons(List<IQueryUserCouponsResultV2> userCoupons) {
        this.userCoupons = userCoupons;
        return this;
    }

    public ListSubCustomerCouponsResponse addUserCouponsItem(IQueryUserCouponsResultV2 userCouponsItem) {
        if (this.userCoupons == null) {
            this.userCoupons = new ArrayList<>();
        }
        this.userCoupons.add(userCouponsItem);
        return this;
    }

    public ListSubCustomerCouponsResponse withUserCoupons(Consumer<List<IQueryUserCouponsResultV2>> userCouponsSetter) {
        if (this.userCoupons == null) {
            this.userCoupons = new ArrayList<>();
        }
        userCouponsSetter.accept(this.userCoupons);
        return this;
    }

    /**
     * 优惠券记录。 具体请参见表2。
     * @return userCoupons
     */
    public List<IQueryUserCouponsResultV2> getUserCoupons() {
        return userCoupons;
    }

    public void setUserCoupons(List<IQueryUserCouponsResultV2> userCoupons) {
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
        ListSubCustomerCouponsResponse listSubCustomerCouponsResponse = (ListSubCustomerCouponsResponse) o;
        return Objects.equals(this.count, listSubCustomerCouponsResponse.count)
            && Objects.equals(this.userCoupons, listSubCustomerCouponsResponse.userCoupons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, userCoupons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomerCouponsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    userCoupons: ").append(toIndentedString(userCoupons)).append("\n");
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
