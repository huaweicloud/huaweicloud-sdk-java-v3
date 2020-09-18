package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.AgentPayInfo;
import com.huaweicloud.sdk.bss.v2.model.AmountInfomation;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CustomerOrderEntity
 */
public class CustomerOrderEntity  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_type")
    
    private Integer orderType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount_after_discount")
    
    private Double amountAfterDiscount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_amount")
    
    private Double officialAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="payment_time")
    
    private String paymentTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agent_pay_info")
    
    private AgentPayInfo agentPayInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount_info")
    
    private AmountInfomation amountInfo = null;

    public CustomerOrderEntity withOrderId(String orderId) {
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

    public CustomerOrderEntity withCustomerId(String customerId) {
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

    public CustomerOrderEntity withStatus(Integer status) {
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

    public CustomerOrderEntity withOrderType(Integer orderType) {
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

    public CustomerOrderEntity withAmountAfterDiscount(Double amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
        return this;
    }

    


    /**
     * |参数名称：订单优惠后金额（不含券不含卡的实付价格）| |参数的约束及描述：订单优惠后金额（不含券不含卡的实付价格）|
     * @return amountAfterDiscount
     */
    public Double getAmountAfterDiscount() {
        return amountAfterDiscount;
    }

    public void setAmountAfterDiscount(Double amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
    }

    public CustomerOrderEntity withOfficialAmount(Double officialAmount) {
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

    public CustomerOrderEntity withMeasureId(Integer measureId) {
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

    public CustomerOrderEntity withCreateTime(String createTime) {
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

    public CustomerOrderEntity withPaymentTime(String paymentTime) {
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

    public CustomerOrderEntity withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    


    /**
     * |参数名称：货币编码。| |参数约束及描述：货币编码。最大长度8|
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CustomerOrderEntity withAgentPayInfo(AgentPayInfo agentPayInfo) {
        this.agentPayInfo = agentPayInfo;
        return this;
    }

    public CustomerOrderEntity withAgentPayInfo(Consumer<AgentPayInfo> agentPayInfoSetter) {
        if(this.agentPayInfo == null ){
            this.agentPayInfo = new AgentPayInfo();
            agentPayInfoSetter.accept(this.agentPayInfo);
        }
        
        return this;
    }


    /**
     * Get agentPayInfo
     * @return agentPayInfo
     */
    public AgentPayInfo getAgentPayInfo() {
        return agentPayInfo;
    }

    public void setAgentPayInfo(AgentPayInfo agentPayInfo) {
        this.agentPayInfo = agentPayInfo;
    }

    public CustomerOrderEntity withAmountInfo(AmountInfomation amountInfo) {
        this.amountInfo = amountInfo;
        return this;
    }

    public CustomerOrderEntity withAmountInfo(Consumer<AmountInfomation> amountInfoSetter) {
        if(this.amountInfo == null ){
            this.amountInfo = new AmountInfomation();
            amountInfoSetter.accept(this.amountInfo);
        }
        
        return this;
    }


    /**
     * Get amountInfo
     * @return amountInfo
     */
    public AmountInfomation getAmountInfo() {
        return amountInfo;
    }

    public void setAmountInfo(AmountInfomation amountInfo) {
        this.amountInfo = amountInfo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerOrderEntity customerOrderEntity = (CustomerOrderEntity) o;
        return Objects.equals(this.orderId, customerOrderEntity.orderId) &&
            Objects.equals(this.customerId, customerOrderEntity.customerId) &&
            Objects.equals(this.status, customerOrderEntity.status) &&
            Objects.equals(this.orderType, customerOrderEntity.orderType) &&
            Objects.equals(this.amountAfterDiscount, customerOrderEntity.amountAfterDiscount) &&
            Objects.equals(this.officialAmount, customerOrderEntity.officialAmount) &&
            Objects.equals(this.measureId, customerOrderEntity.measureId) &&
            Objects.equals(this.createTime, customerOrderEntity.createTime) &&
            Objects.equals(this.paymentTime, customerOrderEntity.paymentTime) &&
            Objects.equals(this.currency, customerOrderEntity.currency) &&
            Objects.equals(this.agentPayInfo, customerOrderEntity.agentPayInfo) &&
            Objects.equals(this.amountInfo, customerOrderEntity.amountInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(orderId, customerId, status, orderType, amountAfterDiscount, officialAmount, measureId, createTime, paymentTime, currency, agentPayInfo, amountInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerOrderEntity {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
        sb.append("    amountAfterDiscount: ").append(toIndentedString(amountAfterDiscount)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    paymentTime: ").append(toIndentedString(paymentTime)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    agentPayInfo: ").append(toIndentedString(agentPayInfo)).append("\n");
        sb.append("    amountInfo: ").append(toIndentedString(amountInfo)).append("\n");
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

