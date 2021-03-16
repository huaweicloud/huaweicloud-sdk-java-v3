package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListIssuedPartnerCouponsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_id")
    
    private String couponId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_type")
    
    private Integer couponType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time_begin")
    
    private String createTimeBegin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time_end")
    
    private String createTimeEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effective_time_begin")
    
    private String effectiveTimeBegin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effective_time_end")
    
    private String effectiveTimeEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time_begin")
    
    private String expireTimeBegin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time_end")
    
    private String expireTimeEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;

    public ListIssuedPartnerCouponsRequest withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    


    /**
     * Get couponId
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    

    public ListIssuedPartnerCouponsRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * Get customerId
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    

    public ListIssuedPartnerCouponsRequest withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * Get orderId
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    

    public ListIssuedPartnerCouponsRequest withCouponType(Integer couponType) {
        this.couponType = couponType;
        return this;
    }

    


    /**
     * Get couponType
     * minimum: 1
     * maximum: 4
     * @return couponType
     */
    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    

    public ListIssuedPartnerCouponsRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * minimum: 1
     * maximum: 5
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public ListIssuedPartnerCouponsRequest withCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
        return this;
    }

    


    /**
     * Get createTimeBegin
     * @return createTimeBegin
     */
    public String getCreateTimeBegin() {
        return createTimeBegin;
    }

    public void setCreateTimeBegin(String createTimeBegin) {
        this.createTimeBegin = createTimeBegin;
    }

    

    public ListIssuedPartnerCouponsRequest withCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }

    


    /**
     * Get createTimeEnd
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    

    public ListIssuedPartnerCouponsRequest withEffectiveTimeBegin(String effectiveTimeBegin) {
        this.effectiveTimeBegin = effectiveTimeBegin;
        return this;
    }

    


    /**
     * Get effectiveTimeBegin
     * @return effectiveTimeBegin
     */
    public String getEffectiveTimeBegin() {
        return effectiveTimeBegin;
    }

    public void setEffectiveTimeBegin(String effectiveTimeBegin) {
        this.effectiveTimeBegin = effectiveTimeBegin;
    }

    

    public ListIssuedPartnerCouponsRequest withEffectiveTimeEnd(String effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
        return this;
    }

    


    /**
     * Get effectiveTimeEnd
     * @return effectiveTimeEnd
     */
    public String getEffectiveTimeEnd() {
        return effectiveTimeEnd;
    }

    public void setEffectiveTimeEnd(String effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
    }

    

    public ListIssuedPartnerCouponsRequest withExpireTimeBegin(String expireTimeBegin) {
        this.expireTimeBegin = expireTimeBegin;
        return this;
    }

    


    /**
     * Get expireTimeBegin
     * @return expireTimeBegin
     */
    public String getExpireTimeBegin() {
        return expireTimeBegin;
    }

    public void setExpireTimeBegin(String expireTimeBegin) {
        this.expireTimeBegin = expireTimeBegin;
    }

    

    public ListIssuedPartnerCouponsRequest withExpireTimeEnd(String expireTimeEnd) {
        this.expireTimeEnd = expireTimeEnd;
        return this;
    }

    


    /**
     * Get expireTimeEnd
     * @return expireTimeEnd
     */
    public String getExpireTimeEnd() {
        return expireTimeEnd;
    }

    public void setExpireTimeEnd(String expireTimeEnd) {
        this.expireTimeEnd = expireTimeEnd;
    }

    

    public ListIssuedPartnerCouponsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 2147483646
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListIssuedPartnerCouponsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListIssuedPartnerCouponsRequest withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * Get indirectPartnerId
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
        ListIssuedPartnerCouponsRequest listIssuedPartnerCouponsRequest = (ListIssuedPartnerCouponsRequest) o;
        return Objects.equals(this.couponId, listIssuedPartnerCouponsRequest.couponId) &&
            Objects.equals(this.customerId, listIssuedPartnerCouponsRequest.customerId) &&
            Objects.equals(this.orderId, listIssuedPartnerCouponsRequest.orderId) &&
            Objects.equals(this.couponType, listIssuedPartnerCouponsRequest.couponType) &&
            Objects.equals(this.status, listIssuedPartnerCouponsRequest.status) &&
            Objects.equals(this.createTimeBegin, listIssuedPartnerCouponsRequest.createTimeBegin) &&
            Objects.equals(this.createTimeEnd, listIssuedPartnerCouponsRequest.createTimeEnd) &&
            Objects.equals(this.effectiveTimeBegin, listIssuedPartnerCouponsRequest.effectiveTimeBegin) &&
            Objects.equals(this.effectiveTimeEnd, listIssuedPartnerCouponsRequest.effectiveTimeEnd) &&
            Objects.equals(this.expireTimeBegin, listIssuedPartnerCouponsRequest.expireTimeBegin) &&
            Objects.equals(this.expireTimeEnd, listIssuedPartnerCouponsRequest.expireTimeEnd) &&
            Objects.equals(this.offset, listIssuedPartnerCouponsRequest.offset) &&
            Objects.equals(this.limit, listIssuedPartnerCouponsRequest.limit) &&
            Objects.equals(this.indirectPartnerId, listIssuedPartnerCouponsRequest.indirectPartnerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(couponId, customerId, orderId, couponType, status, createTimeBegin, createTimeEnd, effectiveTimeBegin, effectiveTimeEnd, expireTimeBegin, expireTimeEnd, offset, limit, indirectPartnerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssuedPartnerCouponsRequest {\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTimeBegin: ").append(toIndentedString(createTimeBegin)).append("\n");
        sb.append("    createTimeEnd: ").append(toIndentedString(createTimeEnd)).append("\n");
        sb.append("    effectiveTimeBegin: ").append(toIndentedString(effectiveTimeBegin)).append("\n");
        sb.append("    effectiveTimeEnd: ").append(toIndentedString(effectiveTimeEnd)).append("\n");
        sb.append("    expireTimeBegin: ").append(toIndentedString(expireTimeBegin)).append("\n");
        sb.append("    expireTimeEnd: ").append(toIndentedString(expireTimeEnd)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

