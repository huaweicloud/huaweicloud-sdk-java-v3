package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IQueryUserPartnerCouponsResultV2
 */
public class IQueryUserPartnerCouponsResultV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_id")

    private String couponId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_type")

    private Integer couponType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "face_value")

    private Double faceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_plan_id")

    private String promotionPlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_plan_name")

    private String promotionPlanName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_plan_desc")

    private String promotionPlanDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "media_type")

    private Integer mediaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fetch_method")

    private Integer fetchMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_limits")

    private List<ICouponUseLimitInfoV2> useLimits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_time")

    private String activeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_used_time")

    private String lastUsedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_id")

    private String promotionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "balance")

    private Double balance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_order_id")

    private String lockOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_frozen")

    private String isFrozen;

    public IQueryUserPartnerCouponsResultV2 withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    /**
     * 优惠券ID。
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public IQueryUserPartnerCouponsResultV2 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 优惠券状态： 1：未激活2：可使用3：已使用4：已过期5：已回收
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public IQueryUserPartnerCouponsResultV2 withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户账号ID。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public IQueryUserPartnerCouponsResultV2 withCouponType(Integer couponType) {
        this.couponType = couponType;
        return this;
    }

    /**
     * 优惠券类别： 1：代金券4：现金券
     * @return couponType
     */
    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public IQueryUserPartnerCouponsResultV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 优惠券面额单位。 1：元。
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public IQueryUserPartnerCouponsResultV2 withFaceValue(Double faceValue) {
        this.faceValue = faceValue;
        return this;
    }

    /**
     * 优惠券面值。
     * @return faceValue
     */
    public Double getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(Double faceValue) {
        this.faceValue = faceValue;
    }

    public IQueryUserPartnerCouponsResultV2 withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 生效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public IQueryUserPartnerCouponsResultV2 withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 失效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public IQueryUserPartnerCouponsResultV2 withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public IQueryUserPartnerCouponsResultV2 withPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
        return this;
    }

    /**
     * 促销计划ID。
     * @return promotionPlanId
     */
    public String getPromotionPlanId() {
        return promotionPlanId;
    }

    public void setPromotionPlanId(String promotionPlanId) {
        this.promotionPlanId = promotionPlanId;
    }

    public IQueryUserPartnerCouponsResultV2 withPromotionPlanName(String promotionPlanName) {
        this.promotionPlanName = promotionPlanName;
        return this;
    }

    /**
     * 促销计划名称。
     * @return promotionPlanName
     */
    public String getPromotionPlanName() {
        return promotionPlanName;
    }

    public void setPromotionPlanName(String promotionPlanName) {
        this.promotionPlanName = promotionPlanName;
    }

    public IQueryUserPartnerCouponsResultV2 withPromotionPlanDesc(String promotionPlanDesc) {
        this.promotionPlanDesc = promotionPlanDesc;
        return this;
    }

    /**
     * 促销计划描述。
     * @return promotionPlanDesc
     */
    public String getPromotionPlanDesc() {
        return promotionPlanDesc;
    }

    public void setPromotionPlanDesc(String promotionPlanDesc) {
        this.promotionPlanDesc = promotionPlanDesc;
    }

    public IQueryUserPartnerCouponsResultV2 withMediaType(Integer mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * 介质类型。 1：电子券2：纸质券
     * @return mediaType
     */
    public Integer getMediaType() {
        return mediaType;
    }

    public void setMediaType(Integer mediaType) {
        this.mediaType = mediaType;
    }

    public IQueryUserPartnerCouponsResultV2 withFetchMethod(Integer fetchMethod) {
        this.fetchMethod = fetchMethod;
        return this;
    }

    /**
     * 获取方式。 1：线上领取2：线上兑换3：线上发放4：线下获取5：事件赠送
     * @return fetchMethod
     */
    public Integer getFetchMethod() {
        return fetchMethod;
    }

    public void setFetchMethod(Integer fetchMethod) {
        this.fetchMethod = fetchMethod;
    }

    public IQueryUserPartnerCouponsResultV2 withUseLimits(List<ICouponUseLimitInfoV2> useLimits) {
        this.useLimits = useLimits;
        return this;
    }

    public IQueryUserPartnerCouponsResultV2 addUseLimitsItem(ICouponUseLimitInfoV2 useLimitsItem) {
        if (this.useLimits == null) {
            this.useLimits = new ArrayList<>();
        }
        this.useLimits.add(useLimitsItem);
        return this;
    }

    public IQueryUserPartnerCouponsResultV2 withUseLimits(Consumer<List<ICouponUseLimitInfoV2>> useLimitsSetter) {
        if (this.useLimits == null) {
            this.useLimits = new ArrayList<>();
        }
        useLimitsSetter.accept(this.useLimits);
        return this;
    }

    /**
     * 优惠券限制。 具体请参见表3。
     * @return useLimits
     */
    public List<ICouponUseLimitInfoV2> getUseLimits() {
        return useLimits;
    }

    public void setUseLimits(List<ICouponUseLimitInfoV2> useLimits) {
        this.useLimits = useLimits;
    }

    public IQueryUserPartnerCouponsResultV2 withActiveTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }

    /**
     * 优惠券的激活时间。
     * @return activeTime
     */
    public String getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }

    public IQueryUserPartnerCouponsResultV2 withLastUsedTime(String lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
        return this;
    }

    /**
     * 优惠券的使用时间。
     * @return lastUsedTime
     */
    public String getLastUsedTime() {
        return lastUsedTime;
    }

    public void setLastUsedTime(String lastUsedTime) {
        this.lastUsedTime = lastUsedTime;
    }

    public IQueryUserPartnerCouponsResultV2 withPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }

    /**
     * 促销活动ID。
     * @return promotionId
     */
    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public IQueryUserPartnerCouponsResultV2 withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 优惠券的创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public IQueryUserPartnerCouponsResultV2 withBalance(Double balance) {
        this.balance = balance;
        return this;
    }

    /**
     * 优惠券余额。
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public IQueryUserPartnerCouponsResultV2 withLockOrderId(String lockOrderId) {
        this.lockOrderId = lockOrderId;
        return this;
    }

    /**
     * 锁定优惠券的订单ID。 如果为老版本优惠券，该值为空。
     * @return lockOrderId
     */
    public String getLockOrderId() {
        return lockOrderId;
    }

    public void setLockOrderId(String lockOrderId) {
        this.lockOrderId = lockOrderId;
    }

    public IQueryUserPartnerCouponsResultV2 withIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /**
     * 优惠券是否冻结。 0：否1：是 可用优惠券接口返回时不包括冻结状态的优惠券。
     * @return isFrozen
     */
    public String getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(String isFrozen) {
        this.isFrozen = isFrozen;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IQueryUserPartnerCouponsResultV2 iqueryUserPartnerCouponsResultV2 = (IQueryUserPartnerCouponsResultV2) o;
        return Objects.equals(this.couponId, iqueryUserPartnerCouponsResultV2.couponId)
            && Objects.equals(this.status, iqueryUserPartnerCouponsResultV2.status)
            && Objects.equals(this.customerId, iqueryUserPartnerCouponsResultV2.customerId)
            && Objects.equals(this.couponType, iqueryUserPartnerCouponsResultV2.couponType)
            && Objects.equals(this.measureId, iqueryUserPartnerCouponsResultV2.measureId)
            && Objects.equals(this.faceValue, iqueryUserPartnerCouponsResultV2.faceValue)
            && Objects.equals(this.effectiveTime, iqueryUserPartnerCouponsResultV2.effectiveTime)
            && Objects.equals(this.expireTime, iqueryUserPartnerCouponsResultV2.expireTime)
            && Objects.equals(this.orderId, iqueryUserPartnerCouponsResultV2.orderId)
            && Objects.equals(this.promotionPlanId, iqueryUserPartnerCouponsResultV2.promotionPlanId)
            && Objects.equals(this.promotionPlanName, iqueryUserPartnerCouponsResultV2.promotionPlanName)
            && Objects.equals(this.promotionPlanDesc, iqueryUserPartnerCouponsResultV2.promotionPlanDesc)
            && Objects.equals(this.mediaType, iqueryUserPartnerCouponsResultV2.mediaType)
            && Objects.equals(this.fetchMethod, iqueryUserPartnerCouponsResultV2.fetchMethod)
            && Objects.equals(this.useLimits, iqueryUserPartnerCouponsResultV2.useLimits)
            && Objects.equals(this.activeTime, iqueryUserPartnerCouponsResultV2.activeTime)
            && Objects.equals(this.lastUsedTime, iqueryUserPartnerCouponsResultV2.lastUsedTime)
            && Objects.equals(this.promotionId, iqueryUserPartnerCouponsResultV2.promotionId)
            && Objects.equals(this.createTime, iqueryUserPartnerCouponsResultV2.createTime)
            && Objects.equals(this.balance, iqueryUserPartnerCouponsResultV2.balance)
            && Objects.equals(this.lockOrderId, iqueryUserPartnerCouponsResultV2.lockOrderId)
            && Objects.equals(this.isFrozen, iqueryUserPartnerCouponsResultV2.isFrozen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId,
            status,
            customerId,
            couponType,
            measureId,
            faceValue,
            effectiveTime,
            expireTime,
            orderId,
            promotionPlanId,
            promotionPlanName,
            promotionPlanDesc,
            mediaType,
            fetchMethod,
            useLimits,
            activeTime,
            lastUsedTime,
            promotionId,
            createTime,
            balance,
            lockOrderId,
            isFrozen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IQueryUserPartnerCouponsResultV2 {\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    faceValue: ").append(toIndentedString(faceValue)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    promotionPlanId: ").append(toIndentedString(promotionPlanId)).append("\n");
        sb.append("    promotionPlanName: ").append(toIndentedString(promotionPlanName)).append("\n");
        sb.append("    promotionPlanDesc: ").append(toIndentedString(promotionPlanDesc)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    fetchMethod: ").append(toIndentedString(fetchMethod)).append("\n");
        sb.append("    useLimits: ").append(toIndentedString(useLimits)).append("\n");
        sb.append("    activeTime: ").append(toIndentedString(activeTime)).append("\n");
        sb.append("    lastUsedTime: ").append(toIndentedString(lastUsedTime)).append("\n");
        sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    lockOrderId: ").append(toIndentedString(lockOrderId)).append("\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
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
