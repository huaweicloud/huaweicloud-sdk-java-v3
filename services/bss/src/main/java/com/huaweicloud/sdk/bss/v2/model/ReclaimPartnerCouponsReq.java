package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ReclaimPartnerCouponsReq
 */
public class ReclaimPartnerCouponsReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_id")
    
    private String couponId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;

    public ReclaimPartnerCouponsReq withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    


    /**
     * |参数名称：优惠券额度ID优惠券的类型跟随额度中的类型。| |参数约束及描述：优惠券额度ID优惠券的类型跟随额度中的类型。|
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public ReclaimPartnerCouponsReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * |参数名称：客户ID列表| |参数约束及描述：客户ID列表|
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReclaimPartnerCouponsReq reclaimPartnerCouponsReq = (ReclaimPartnerCouponsReq) o;
        return Objects.equals(this.couponId, reclaimPartnerCouponsReq.couponId) &&
            Objects.equals(this.indirectPartnerId, reclaimPartnerCouponsReq.indirectPartnerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(couponId, indirectPartnerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReclaimPartnerCouponsReq {\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
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

