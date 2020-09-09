package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.AmountInfomationV2;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * OrderLineItemEntityV2
 */
public class OrderLineItemEntityV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount_after_discount")
    
    private Double amountAfterDiscount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount_info")
    
    private AmountInfomationV2 amountInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category_code")
    
    private String categoryCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effective_time")
    
    private String effectiveTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private String expireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_amount")
    
    private Double officialAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_line_item_id")
    
    private String orderLineItemId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period_num")
    
    private Integer periodNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period_type")
    
    private Integer periodType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_spec_desc")
    
    private String productSpecDesc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type_code")
    
    private String serviceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subscription_num")
    
    private Integer subscriptionNum;

    public OrderLineItemEntityV2 withAmountAfterDiscount(Double amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
        return this;
    }

    


    /**
     * |参数名称：订单优惠后金额（实付价格，不含券不含卡）。| |参数的约束及描述：订单优惠后金额（实付价格，不含券不含卡）。|
     * @return amountAfterDiscount
     */
    public Double getAmountAfterDiscount() {
        return amountAfterDiscount;
    }

    public void setAmountAfterDiscount(Double amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
    }

    public OrderLineItemEntityV2 withAmountInfo(AmountInfomationV2 amountInfo) {
        this.amountInfo = amountInfo;
        return this;
    }

    public OrderLineItemEntityV2 withAmountInfo(Consumer<AmountInfomationV2> amountInfoSetter) {
        if(this.amountInfo == null ){
            this.amountInfo = new AmountInfomationV2();
            amountInfoSetter.accept(this.amountInfo);
        }
        
        return this;
    }


    /**
     * Get amountInfo
     * @return amountInfo
     */
    public AmountInfomationV2 getAmountInfo() {
        return amountInfo;
    }

    public void setAmountInfo(AmountInfomationV2 amountInfo) {
        this.amountInfo = amountInfo;
    }

    public OrderLineItemEntityV2 withCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }

    


    /**
     * |参数名称：产品目录编码。| |参数约束及描述：产品目录编码。|
     * @return categoryCode
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public OrderLineItemEntityV2 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    


    /**
     * |参数名称：货币编码。| |参数约束及描述：货币编码。如CNY|
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public OrderLineItemEntityV2 withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    


    /**
     * |参数名称：生效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。| |参数约束及描述：生效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。|
     * @return effectiveTime
     */
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

    


    /**
     * |参数名称：失效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。| |参数约束及描述：失效时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。|
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public OrderLineItemEntityV2 withOfficialAmount(Double officialAmount) {
        this.officialAmount = officialAmount;
        return this;
    }

    


    /**
     * |参数名称：订单金额（官网价）。退订订单中，该金额等于currencyAfterDiscount。| |参数的约束及描述：订单金额（官网价）。退订订单中，该金额等于currencyAfterDiscount。|
     * @return officialAmount
     */
    public Double getOfficialAmount() {
        return officialAmount;
    }

    public void setOfficialAmount(Double officialAmount) {
        this.officialAmount = officialAmount;
    }

    public OrderLineItemEntityV2 withOrderLineItemId(String orderLineItemId) {
        this.orderLineItemId = orderLineItemId;
        return this;
    }

    


    /**
     * |参数名称：订单项Id。| |参数约束及描述：订单项Id。|
     * @return orderLineItemId
     */
    public String getOrderLineItemId() {
        return orderLineItemId;
    }

    public void setOrderLineItemId(String orderLineItemId) {
        this.orderLineItemId = orderLineItemId;
    }

    public OrderLineItemEntityV2 withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    


    /**
     * |参数名称：周期数量。| |参数的约束及描述：周期数量。|
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public OrderLineItemEntityV2 withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    


    /**
     * |参数名称：周期类型。0：天；1：周；2：月；3：年；4：小时；5：一次性；6：按需（预留）；7：按用量报表使用（预留）。| |参数的约束及描述：周期类型。0：天；1：周；2：月；3：年；4：小时；5：一次性；6：按需（预留）；7：按用量报表使用（预留）。|
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public OrderLineItemEntityV2 withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * |参数名称：产品ID。| |参数约束及描述：产品ID。|
     * @return productId
     */
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

    


    /**
     * |参数名称：产品规格描述。| |参数约束及描述：产品规格描述。|
     * @return productSpecDesc
     */
    public String getProductSpecDesc() {
        return productSpecDesc;
    }

    public void setProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
    }

    public OrderLineItemEntityV2 withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    


    /**
     * |参数名称：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型云服务类型云服务类型云服务类型。| |参数约束及描述：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型云服务类型云服务类型云服务类型。|
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public OrderLineItemEntityV2 withSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
        return this;
    }

    


    /**
     * |参数名称：订购数量。| |参数的约束及描述：订购数量。|
     * @return subscriptionNum
     */
    public Integer getSubscriptionNum() {
        return subscriptionNum;
    }

    public void setSubscriptionNum(Integer subscriptionNum) {
        this.subscriptionNum = subscriptionNum;
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
        return Objects.equals(this.amountAfterDiscount, orderLineItemEntityV2.amountAfterDiscount) &&
            Objects.equals(this.amountInfo, orderLineItemEntityV2.amountInfo) &&
            Objects.equals(this.categoryCode, orderLineItemEntityV2.categoryCode) &&
            Objects.equals(this.currency, orderLineItemEntityV2.currency) &&
            Objects.equals(this.effectiveTime, orderLineItemEntityV2.effectiveTime) &&
            Objects.equals(this.expireTime, orderLineItemEntityV2.expireTime) &&
            Objects.equals(this.officialAmount, orderLineItemEntityV2.officialAmount) &&
            Objects.equals(this.orderLineItemId, orderLineItemEntityV2.orderLineItemId) &&
            Objects.equals(this.periodNum, orderLineItemEntityV2.periodNum) &&
            Objects.equals(this.periodType, orderLineItemEntityV2.periodType) &&
            Objects.equals(this.productId, orderLineItemEntityV2.productId) &&
            Objects.equals(this.productSpecDesc, orderLineItemEntityV2.productSpecDesc) &&
            Objects.equals(this.serviceTypeCode, orderLineItemEntityV2.serviceTypeCode) &&
            Objects.equals(this.subscriptionNum, orderLineItemEntityV2.subscriptionNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(amountAfterDiscount, amountInfo, categoryCode, currency, effectiveTime, expireTime, officialAmount, orderLineItemId, periodNum, periodType, productId, productSpecDesc, serviceTypeCode, subscriptionNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderLineItemEntityV2 {\n");
        sb.append("    amountAfterDiscount: ").append(toIndentedString(amountAfterDiscount)).append("\n");
        sb.append("    amountInfo: ").append(toIndentedString(amountInfo)).append("\n");
        sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
        sb.append("    orderLineItemId: ").append(toIndentedString(orderLineItemId)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productSpecDesc: ").append(toIndentedString(productSpecDesc)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    subscriptionNum: ").append(toIndentedString(subscriptionNum)).append("\n");
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

