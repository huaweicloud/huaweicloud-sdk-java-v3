package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSubCustomerCouponsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_id")

    private String couponId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_plan_id")

    private String promotionPlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_type")

    private Integer couponType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_start_time")

    private String activeStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_end_time")

    private String activeEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    public ListSubCustomerCouponsRequest withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    /**
     * 优惠券ID。此参数不携带或携带值为空时，不作为筛选条件；携带值为空串时，作为筛选条件。
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
     * 订单ID。此参数不携带或携带值为空时，不作为筛选条件；携带值为空串时，作为筛选条件。
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
     * 促销计划ID。此参数不携带或携带值为空时，不作为筛选条件；携带值为空串时，作为筛选条件。
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
     * 优惠券类型：1：代金券2：折扣券3：产品券4：现金券。此参数不携带或携带值为空或携带值为null时，不作为筛选条件；不支持携带值为空串。
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
     * 客户优惠券实例状态：1：未激活2：待使用3：已使用4：已过期5：已回收。此参数不携带或携带值为空时，不作为筛选条件。 说明： 已使用、已过期和已回收优惠券，只返回12个月以内的数据。
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

    public ListSubCustomerCouponsRequest withActiveStartTime(String activeStartTime) {
        this.activeStartTime = activeStartTime;
        return this;
    }

    /**
     * 激活时间。UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。此参数不携带或携带值为空时，不作为筛选条件；不支持携带值为空串或携带值为null。
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
     * 结束时间。UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。此参数不携带或携带值为空时，不作为筛选条件；不支持携带值为空串或携带值为null。
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
     * 偏移量，从0开始。默认值为0。此参数需与limit联合使用，不支持单独使用。说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset = 1，则返回满足条件的第二个数据至最后一个数据。例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。
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
     * 查询的优惠券数量，默认值为10。
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
     * 发券来源，如果是合作伙伴发送的券，此处为伙伴ID。如果需要查询某个伙伴发放的券，可以在此处输入该伙伴ID。此参数不携带或携带值为空时，不作为筛选条件；携带值为空串时，作为筛选条件。
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
     * 云经销商（二级经销商）ID。华为云总经销商（一级经销商）查询云经销商名下的优惠券时，需要携带该参数；除此之外，此参数不做处理。否则只能查询自己的优惠券列表。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubCustomerCouponsRequest that = (ListSubCustomerCouponsRequest) obj;
        return Objects.equals(this.couponId, that.couponId) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.promotionPlanId, that.promotionPlanId)
            && Objects.equals(this.couponType, that.couponType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.activeStartTime, that.activeStartTime)
            && Objects.equals(this.activeEndTime, that.activeEndTime) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.indirectPartnerId, that.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId,
            orderId,
            promotionPlanId,
            couponType,
            status,
            activeStartTime,
            activeEndTime,
            offset,
            limit,
            sourceId,
            indirectPartnerId);
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
