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
public class ListSubCustomerCouponsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_id")
    
    private String couponId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="promotion_plan_id")
    
    private String promotionPlanId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_type")
    
    private Integer couponType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="active_start_time")
    
    private String activeStartTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="active_end_time")
    
    private String activeEndTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_id")
    
    private String sourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;

    public ListSubCustomerCouponsRequest withCouponId(String couponId) {
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

    

    public ListSubCustomerCouponsRequest withOrderId(String orderId) {
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

    

    public ListSubCustomerCouponsRequest withPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
        return this;
    }

    


    /**
     * Get promotionPlanId
     * @return promotionPlanId
     */
    public String getPromotionPlanId() {
        return promotionPlanId;
    }

    public void setPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
    }

    

    public ListSubCustomerCouponsRequest withCouponType(Integer couponType) {
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

    

    public ListSubCustomerCouponsRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * minimum: 1
     * maximum: 4
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public ListSubCustomerCouponsRequest withActiveStartTime(String activeStartTime) {
        this.activeStartTime = activeStartTime;
        return this;
    }

    


    /**
     * Get activeStartTime
     * @return activeStartTime
     */
    public String getActiveStartTime() {
        return activeStartTime;
    }

    public void setActiveStartTime(String activeStartTime) {
        this.activeStartTime = activeStartTime;
    }

    

    public ListSubCustomerCouponsRequest withActiveEndTime(String activeEndTime) {
        this.activeEndTime = activeEndTime;
        return this;
    }

    


    /**
     * Get activeEndTime
     * @return activeEndTime
     */
    public String getActiveEndTime() {
        return activeEndTime;
    }

    public void setActiveEndTime(String activeEndTime) {
        this.activeEndTime = activeEndTime;
    }

    

    public ListSubCustomerCouponsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListSubCustomerCouponsRequest withLimit(Integer limit) {
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

    

    public ListSubCustomerCouponsRequest withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    


    /**
     * Get sourceId
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    

    public ListSubCustomerCouponsRequest withIndirectPartnerId(String indirectPartnerId) {
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
        ListSubCustomerCouponsRequest listSubCustomerCouponsRequest = (ListSubCustomerCouponsRequest) o;
        return Objects.equals(this.couponId, listSubCustomerCouponsRequest.couponId) &&
            Objects.equals(this.orderId, listSubCustomerCouponsRequest.orderId) &&
            Objects.equals(this.promotionPlanId, listSubCustomerCouponsRequest.promotionPlanId) &&
            Objects.equals(this.couponType, listSubCustomerCouponsRequest.couponType) &&
            Objects.equals(this.status, listSubCustomerCouponsRequest.status) &&
            Objects.equals(this.activeStartTime, listSubCustomerCouponsRequest.activeStartTime) &&
            Objects.equals(this.activeEndTime, listSubCustomerCouponsRequest.activeEndTime) &&
            Objects.equals(this.offset, listSubCustomerCouponsRequest.offset) &&
            Objects.equals(this.limit, listSubCustomerCouponsRequest.limit) &&
            Objects.equals(this.sourceId, listSubCustomerCouponsRequest.sourceId) &&
            Objects.equals(this.indirectPartnerId, listSubCustomerCouponsRequest.indirectPartnerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(couponId, orderId, promotionPlanId, couponType, status, activeStartTime, activeEndTime, offset, limit, sourceId, indirectPartnerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomerCouponsRequest {\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    promotionPlanId: ").append(toIndentedString(promotionPlanId)).append("\n");
        sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    activeStartTime: ").append(toIndentedString(activeStartTime)).append("\n");
        sb.append("    activeEndTime: ").append(toIndentedString(activeEndTime)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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

