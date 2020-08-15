package com.huaweicloud.sdk.bss.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.AmountInfomationV2;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CustomerOrderV2
 */
public class CustomerOrderV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount_after_discount")
    
    private Double amountAfterDiscount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount_info")
    
    private AmountInfomationV2 amountInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="contract_id")
    
    private String contractId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_amount")
    
    private Double officialAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_type")
    
    private Integer orderType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="payment_time")
    
    private String paymentTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type_code")
    
    private String serviceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_type")
    
    private Integer sourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

    public CustomerOrderV2 withAmountAfterDiscount(Double amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
        return this;
    }

    


    /**
     * |参数名称：订单优惠后金额（不含券不含卡的实付价格）。| |参数的约束及描述：订单优惠后金额（不含券不含卡的实付价格）。|
     * @return amountAfterDiscount
     */
    public Double getAmountAfterDiscount() {
        return amountAfterDiscount;
    }

    public void setAmountAfterDiscount(Double amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
    }

    public CustomerOrderV2 withAmountInfo(AmountInfomationV2 amountInfo) {
        this.amountInfo = amountInfo;
        return this;
    }

    public CustomerOrderV2 withAmountInfo(Consumer<AmountInfomationV2> amountInfoSetter) {
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

    public CustomerOrderV2 withContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }

    


    /**
     * |参数名称：合同ID。| |参数约束及描述：合同ID。|
     * @return contractId
     */
    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public CustomerOrderV2 withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * |参数名称：创建时间 。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。| |参数约束及描述：创建时间 。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。|
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CustomerOrderV2 withCurrency(String currency) {
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

    public CustomerOrderV2 withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：客户ID。| |参数约束及描述：客户ID。|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CustomerOrderV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：订单金额度量单位：1：元2：角3：分| |参数的约束及描述：订单金额度量单位：1：元2：角3：分|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public CustomerOrderV2 withOfficialAmount(Double officialAmount) {
        this.officialAmount = officialAmount;
        return this;
    }

    


    /**
     * |参数名称：订单金额（官网价）。退订订单中，该金额等于amount。| |参数的约束及描述：订单金额（官网价）。退订订单中，该金额等于amount。|
     * @return officialAmount
     */
    public Double getOfficialAmount() {
        return officialAmount;
    }

    public void setOfficialAmount(Double officialAmount) {
        this.officialAmount = officialAmount;
    }

    public CustomerOrderV2 withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * |参数名称：订单ID。| |参数约束及描述：订单ID。|
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public CustomerOrderV2 withOrderType(Integer orderType) {
        this.orderType = orderType;
        return this;
    }

    


    /**
     * |参数名称：订单类型：1：开通2：续订3：变更4：退订10：包周期转按需11：按需转包周期12：赠送13：试用14：转商用15：费用调整| |参数的约束及描述：订单类型：1：开通2：续订3：变更4：退订10：包周期转按需11：按需转包周期12：赠送13：试用14：转商用15：费用调整|
     * @return orderType
     */
    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public CustomerOrderV2 withPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
        return this;
    }

    


    /**
     * |参数名称：支付时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。| |参数约束及描述：支付时间。UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ，如“2019-05-06T08:05:01Z”。其中，HH范围是0～23，mm和ss范围是0～59。|
     * @return paymentTime
     */
    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public CustomerOrderV2 withServiceTypeCode(String serviceTypeCode) {
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

    public CustomerOrderV2 withSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    


    /**
     * |参数名称：客户订单订单来源类型：1：客户2：代理3：合同4：分销商| |参数的约束及描述：客户订单订单来源类型：1：客户2：代理3：合同4：分销商|
     * @return sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public CustomerOrderV2 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * |参数名称：订单状态：1：待审核3：处理中4：已取消5：已完成6：待支付9：待确认| |参数的约束及描述：订单状态：1：待审核3：处理中4：已取消5：已完成6：待支付9：待确认|
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerOrderV2 customerOrderV2 = (CustomerOrderV2) o;
        return Objects.equals(this.amountAfterDiscount, customerOrderV2.amountAfterDiscount) &&
            Objects.equals(this.amountInfo, customerOrderV2.amountInfo) &&
            Objects.equals(this.contractId, customerOrderV2.contractId) &&
            Objects.equals(this.createTime, customerOrderV2.createTime) &&
            Objects.equals(this.currency, customerOrderV2.currency) &&
            Objects.equals(this.customerId, customerOrderV2.customerId) &&
            Objects.equals(this.measureId, customerOrderV2.measureId) &&
            Objects.equals(this.officialAmount, customerOrderV2.officialAmount) &&
            Objects.equals(this.orderId, customerOrderV2.orderId) &&
            Objects.equals(this.orderType, customerOrderV2.orderType) &&
            Objects.equals(this.paymentTime, customerOrderV2.paymentTime) &&
            Objects.equals(this.serviceTypeCode, customerOrderV2.serviceTypeCode) &&
            Objects.equals(this.sourceType, customerOrderV2.sourceType) &&
            Objects.equals(this.status, customerOrderV2.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(amountAfterDiscount, amountInfo, contractId, createTime, currency, customerId, measureId, officialAmount, orderId, orderType, paymentTime, serviceTypeCode, sourceType, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerOrderV2 {\n");
        sb.append("    amountAfterDiscount: ").append(toIndentedString(amountAfterDiscount)).append("\n");
        sb.append("    amountInfo: ").append(toIndentedString(amountInfo)).append("\n");
        sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
        sb.append("    paymentTime: ").append(toIndentedString(paymentTime)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

