package com.huaweicloud.sdk.bssintl.v2.model;





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
     * |参数名称：优惠券ID。| |参数的约束及描述：优惠券ID。|
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
     * |参数名称：订单ID。| |参数的约束及描述：订单ID。|
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
     * |参数名称：促销计划ID。| |参数的约束及描述：促销计划ID。|
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
     * |参数名称：优惠券类型：1：代金券；2：折扣券；3：产品券；4：现金券。| |参数的约束及描述：优惠券类型：1：代金券；2：折扣券；3：产品券；4：现金券。|
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
     * |参数名称：客户优惠券实例状态：1：未激活；2：待使用；3：已使用；4：已过期。| |参数的约束及描述：客户优惠券实例状态：1：未激活；2：待使用；3：已使用；4：已过期。|
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
     * |参数名称：激活时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ| |参数的约束及描述：激活时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ|
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
     * |参数名称：结束时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ| |参数的约束及描述：结束时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ|
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
     * |参数名称：偏移量，默认为0| |参数的约束及描述：偏移量，默认为0|
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
     * |参数名称：每页数量，默认10。| |参数的约束及描述：每页数量，默认10。|
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
     * |参数名称：发券来源| |参数的约束及描述：如果是合作伙伴发送的券，这个地方是伙伴ID。 如果想查询某个伙伴发放的券，可以在这里输入伙伴ID|
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
     * |参数名称：经营服务商（二级经销商）ID，如果要查询二级经销商名下的券，要传递该字段，否则查询的就是一级经销商自己的券列表。| |参数的约束及描述：经营服务商（二级经销商）ID，如果要查询二级经销商名下的券，要传递该字段，否则查询的就是一级经销商自己的券列表。|
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

