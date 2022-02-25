package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** OrderLineItemEntityV2 */
public class OrderLineItemEntityV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_line_item_id")

    private String orderLineItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code")

    private String serviceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_spec_desc")

    private String productSpecDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_num")

    private Integer subscriptionNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount_after_discount")

    private Double amountAfterDiscount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_amount")

    private Double officialAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount_info")

    private AmountInfomationV2 amountInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_code")

    private String categoryCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_owner_service")

    private String productOwnerService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commercial_resource")

    private String commercialResource;

    public OrderLineItemEntityV2 withOrderLineItemId(String orderLineItemId) {
        this.orderLineItemId = orderLineItemId;
        return this;
    }

    /** 订单项ID。
     * 
     * @return orderLineItemId */
    public String getOrderLineItemId() {
        return orderLineItemId;
    }

    public void setOrderLineItemId(String orderLineItemId) {
        this.orderLineItemId = orderLineItemId;
    }

    public OrderLineItemEntityV2 withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    /** 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。您可以调用查询云服务类型列表接口获取。
     * 
     * @return serviceTypeCode */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public OrderLineItemEntityV2 withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /** 产品ID。
     * 
     * @return productId */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public OrderLineItemEntityV2 withProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
        return this;
    }

    /** 产品规格描述。
     * 
     * @return productSpecDesc */
    public String getProductSpecDesc() {
        return productSpecDesc;
    }

    public void setProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
    }

    public OrderLineItemEntityV2 withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /** 周期类型。 0：天1：周2：月3：年4：小时5：一次性6：按需（预留）7：按用量报表使用（预留）
     * 
     * @return periodType */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public OrderLineItemEntityV2 withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /** 周期数量。 说明： 当订单为退订资源的订单时，参数取值为null。当订单为变更/一次性/订购中的新增附属资源的订单时，参数取值为null。
     * 
     * @return periodNum */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public OrderLineItemEntityV2 withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /** 生效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。 其中，HH范围是0～23，mm和ss范围是0～59。
     * 
     * @return effectiveTime */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public OrderLineItemEntityV2 withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /** 失效时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。 其中，HH范围是0～23，mm和ss范围是0～59。
     * 
     * @return expireTime */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public OrderLineItemEntityV2 withSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
        return this;
    }

    /** 订购数量。
     * 
     * @return subscriptionNum */
    public Integer getSubscriptionNum() {
        return subscriptionNum;
    }

    public void setSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
    }

    public OrderLineItemEntityV2 withAmountAfterDiscount(Double amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
        return this;
    }

    /** 订单优惠后金额（实付价格，不含券不含卡）。
     * 
     * @return amountAfterDiscount */
    public Double getAmountAfterDiscount() {
        return amountAfterDiscount;
    }

    public void setAmountAfterDiscount(Double amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
    }

    public OrderLineItemEntityV2 withOfficialAmount(Double officialAmount) {
        this.officialAmount = officialAmount;
        return this;
    }

    /** 订单金额（官网价）。 退订订单中，该金额等于currencyAfterDiscount。
     * 
     * @return officialAmount */
    public Double getOfficialAmount() {
        return officialAmount;
    }

    public void setOfficialAmount(Double officialAmount) {
        this.officialAmount = officialAmount;
    }

    public OrderLineItemEntityV2 withAmountInfo(AmountInfomationV2 amountInfo) {
        this.amountInfo = amountInfo;
        return this;
    }

    public OrderLineItemEntityV2 withAmountInfo(Consumer<AmountInfomationV2> amountInfoSetter) {
        if (this.amountInfo == null) {
            this.amountInfo = new AmountInfomationV2();
            amountInfoSetter.accept(this.amountInfo);
        }

        return this;
    }

    /** Get amountInfo
     * 
     * @return amountInfo */
    public AmountInfomationV2 getAmountInfo() {
        return amountInfo;
    }

    public void setAmountInfo(AmountInfomationV2 amountInfo) {
        this.amountInfo = amountInfo;
    }

    public OrderLineItemEntityV2 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /** 货币编码。
     * 
     * @return currency */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public OrderLineItemEntityV2 withCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    /** 产品目录编码。
     * 
     * @return categoryCode */
    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public OrderLineItemEntityV2 withProductOwnerService(String productOwnerService) {
        this.productOwnerService = productOwnerService;
        return this;
    }

    /** 产品归属的云服务类型编码。 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。您可以调用查询云服务类型列表接口获取。
     * 
     * @return productOwnerService */
    public String getProductOwnerService() {
        return productOwnerService;
    }

    public void setProductOwnerService(String productOwnerService) {
        this.productOwnerService = productOwnerService;
    }

    public OrderLineItemEntityV2 withCommercialResource(String commercialResource) {
        this.commercialResource = commercialResource;
        return this;
    }

    /** 商务归属的资源类型编码。 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。您可以调用查询资源类型列表接口获取。
     * 
     * @return commercialResource */
    public String getCommercialResource() {
        return commercialResource;
    }

    public void setCommercialResource(String commercialResource) {
        this.commercialResource = commercialResource;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderLineItemEntityV2 orderLineItemEntityV2 = (OrderLineItemEntityV2) o;
        return Objects.equals(this.orderLineItemId, orderLineItemEntityV2.orderLineItemId)
            && Objects.equals(this.serviceTypeCode, orderLineItemEntityV2.serviceTypeCode)
            && Objects.equals(this.productId, orderLineItemEntityV2.productId)
            && Objects.equals(this.productSpecDesc, orderLineItemEntityV2.productSpecDesc)
            && Objects.equals(this.periodType, orderLineItemEntityV2.periodType)
            && Objects.equals(this.periodNum, orderLineItemEntityV2.periodNum)
            && Objects.equals(this.effectiveTime, orderLineItemEntityV2.effectiveTime)
            && Objects.equals(this.expireTime, orderLineItemEntityV2.expireTime)
            && Objects.equals(this.subscriptionNum, orderLineItemEntityV2.subscriptionNum)
            && Objects.equals(this.amountAfterDiscount, orderLineItemEntityV2.amountAfterDiscount)
            && Objects.equals(this.officialAmount, orderLineItemEntityV2.officialAmount)
            && Objects.equals(this.amountInfo, orderLineItemEntityV2.amountInfo)
            && Objects.equals(this.currency, orderLineItemEntityV2.currency)
            && Objects.equals(this.categoryCode, orderLineItemEntityV2.categoryCode)
            && Objects.equals(this.productOwnerService, orderLineItemEntityV2.productOwnerService)
            && Objects.equals(this.commercialResource, orderLineItemEntityV2.commercialResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderLineItemId,
            serviceTypeCode,
            productId,
            productSpecDesc,
            periodType,
            periodNum,
            effectiveTime,
            expireTime,
            subscriptionNum,
            amountAfterDiscount,
            officialAmount,
            amountInfo,
            currency,
            categoryCode,
            productOwnerService,
            commercialResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderLineItemEntityV2 {\n");
        sb.append("    orderLineItemId: ").append(toIndentedString(orderLineItemId)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productSpecDesc: ").append(toIndentedString(productSpecDesc)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    subscriptionNum: ").append(toIndentedString(subscriptionNum)).append("\n");
        sb.append("    amountAfterDiscount: ").append(toIndentedString(amountAfterDiscount)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
        sb.append("    amountInfo: ").append(toIndentedString(amountInfo)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
        sb.append("    productOwnerService: ").append(toIndentedString(productOwnerService)).append("\n");
        sb.append("    commercialResource: ").append(toIndentedString(commercialResource)).append("\n");
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
