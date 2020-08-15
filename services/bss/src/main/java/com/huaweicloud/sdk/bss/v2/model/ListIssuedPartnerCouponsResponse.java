package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.IQueryUserPartnerCouponsResultV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListIssuedPartnerCouponsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_coupons")
    
    private List<IQueryUserPartnerCouponsResultV2> userCoupons = null;
    
    public ListIssuedPartnerCouponsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * |参数名称：个数| |参数的约束及描述：个数|
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListIssuedPartnerCouponsResponse withUserCoupons(List<IQueryUserPartnerCouponsResultV2> userCoupons) {
        this.userCoupons = userCoupons;
        return this;
    }

    
    public ListIssuedPartnerCouponsResponse addUserCouponsItem(IQueryUserPartnerCouponsResultV2 userCouponsItem) {
        if (this.userCoupons == null) {
            this.userCoupons = new ArrayList<>();
        }
        this.userCoupons.add(userCouponsItem);
        return this;
    }

    public ListIssuedPartnerCouponsResponse withUserCoupons(Consumer<List<IQueryUserPartnerCouponsResultV2>> userCouponsSetter) {
        if(this.userCoupons == null ){
            this.userCoupons = new ArrayList<>();
        }
        userCouponsSetter.accept(this.userCoupons);
        return this;
    }

    /**
     * |参数名称：优惠券记录。具体请参见表 IQueryUserCouponsResult。| |参数约束以及描述：优惠券记录。具体请参见表 IQueryUserCouponsResult。|
     * @return userCoupons
     */
    public List<IQueryUserPartnerCouponsResultV2> getUserCoupons() {
        return userCoupons;
    }

    public void setUserCoupons(List<IQueryUserPartnerCouponsResultV2> userCoupons) {
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
        ListIssuedPartnerCouponsResponse listIssuedPartnerCouponsResponse = (ListIssuedPartnerCouponsResponse) o;
        return Objects.equals(this.totalCount, listIssuedPartnerCouponsResponse.totalCount) &&
            Objects.equals(this.userCoupons, listIssuedPartnerCouponsResponse.userCoupons);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, userCoupons);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssuedPartnerCouponsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

