package com.huaweicloud.sdk.bss.v2.model;

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
public class ListMultiAccountTransferCouponsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avail_transfer_coupons")

    private List<AvailTransferCoupon> availTransferCoupons = null;

    public ListMultiAccountTransferCouponsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 记录条数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListMultiAccountTransferCouponsResponse withAvailTransferCoupons(
        List<AvailTransferCoupon> availTransferCoupons) {
        this.availTransferCoupons = availTransferCoupons;
        return this;
    }

    public ListMultiAccountTransferCouponsResponse addAvailTransferCouponsItem(
        AvailTransferCoupon availTransferCouponsItem) {
        if (this.availTransferCoupons == null) {
            this.availTransferCoupons = new ArrayList<>();
        }
        this.availTransferCoupons.add(availTransferCouponsItem);
        return this;
    }

    public ListMultiAccountTransferCouponsResponse withAvailTransferCoupons(
        Consumer<List<AvailTransferCoupon>> availTransferCouponsSetter) {
        if (this.availTransferCoupons == null) {
            this.availTransferCoupons = new ArrayList<>();
        }
        availTransferCouponsSetter.accept(this.availTransferCoupons);
        return this;
    }

    /**
     * 可拨款优惠券记录。 具体请参见表2。
     * @return availTransferCoupons
     */
    public List<AvailTransferCoupon> getAvailTransferCoupons() {
        return availTransferCoupons;
    }

    public void setAvailTransferCoupons(List<AvailTransferCoupon> availTransferCoupons) {
        this.availTransferCoupons = availTransferCoupons;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMultiAccountTransferCouponsResponse that = (ListMultiAccountTransferCouponsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.availTransferCoupons, that.availTransferCoupons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, availTransferCoupons);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMultiAccountTransferCouponsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    availTransferCoupons: ").append(toIndentedString(availTransferCoupons)).append("\n");
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
