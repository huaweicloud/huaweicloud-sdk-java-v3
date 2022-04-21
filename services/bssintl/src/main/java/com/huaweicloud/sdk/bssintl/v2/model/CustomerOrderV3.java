package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CustomerOrderV3
 */
public class CustomerOrderV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code")

    private String serviceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_name")

    private String serviceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private Integer sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_type")

    private Integer orderType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount_after_discount")

    private Double amountAfterDiscount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_amount")

    private Double officialAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_time")

    private String paymentTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contract_id")

    private String contractId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount_info")

    private AmountInfomationV2 amountInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public CustomerOrderV3 withOrderId(String orderId) {
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

    public CustomerOrderV3 withCustomerId(String customerId) {
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

    public CustomerOrderV3 withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    /**
     * 云服务类型编码。例如OBS的云服务类型编码为“hws.service.type.obs”。
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public CustomerOrderV3 withServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * 云服务类型名称。例如ECS的云服务类型名称为“弹性云服务器”。
     * @return serviceTypeName
     */
    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public CustomerOrderV3 withSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 客户订单来源类型： 1：客户2：代理3：合同4：分销商
     * @return sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public CustomerOrderV3 withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 订单状态。 1：待审核3：处理中4：已取消5：已完成6：待付款9：待确认
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CustomerOrderV3 withOrderType(Integer orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * 订单类型。 1：开通2：续订3：变更4：退订11：按需转包年/包月13：试用14：转商用15：费用调整
     * @return orderType
     */
    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public CustomerOrderV3 withAmountAfterDiscount(Double amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
        return this;
    }

    /**
     * 订单优惠后金额（实付价格，不含券不含卡）。
     * @return amountAfterDiscount
     */
    public Double getAmountAfterDiscount() {
        return amountAfterDiscount;
    }

    public void setAmountAfterDiscount(Double amountAfterDiscount) {
        this.amountAfterDiscount = amountAfterDiscount;
    }

    public CustomerOrderV3 withOfficialAmount(Double officialAmount) {
        this.officialAmount = officialAmount;
        return this;
    }

    /**
     * 订单金额（官网价）。 退订订单中，该金额等于currencyAfterDiscount。
     * @return officialAmount
     */
    public Double getOfficialAmount() {
        return officialAmount;
    }

    public void setOfficialAmount(Double officialAmount) {
        this.officialAmount = officialAmount;
    }

    public CustomerOrderV3 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 订单金额度量单位。 1：元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public CustomerOrderV3 withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间 。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。 其中，HH范围是0～23，mm和ss范围是0～59。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CustomerOrderV3 withPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
        return this;
    }

    /**
     * 支付时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”。 其中，HH范围是0～23，mm和ss范围是0～59。
     * @return paymentTime
     */
    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public CustomerOrderV3 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 货币编码。
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public CustomerOrderV3 withContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }

    /**
     * 合同ID。
     * @return contractId
     */
    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public CustomerOrderV3 withAmountInfo(AmountInfomationV2 amountInfo) {
        this.amountInfo = amountInfo;
        return this;
    }

    public CustomerOrderV3 withAmountInfo(Consumer<AmountInfomationV2> amountInfoSetter) {
        if (this.amountInfo == null) {
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

    public CustomerOrderV3 withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 订单创建者名称。 如果是客户自己下单，则此处返回下单操作员的登录名称；如果是运营人员从后台下单，则此处返回“运营人员”；如果是运营系统自动触发下单，则此处返回“运营系统”。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerOrderV3 customerOrderV3 = (CustomerOrderV3) o;
        return Objects.equals(this.orderId, customerOrderV3.orderId)
            && Objects.equals(this.customerId, customerOrderV3.customerId)
            && Objects.equals(this.serviceTypeCode, customerOrderV3.serviceTypeCode)
            && Objects.equals(this.serviceTypeName, customerOrderV3.serviceTypeName)
            && Objects.equals(this.sourceType, customerOrderV3.sourceType)
            && Objects.equals(this.status, customerOrderV3.status)
            && Objects.equals(this.orderType, customerOrderV3.orderType)
            && Objects.equals(this.amountAfterDiscount, customerOrderV3.amountAfterDiscount)
            && Objects.equals(this.officialAmount, customerOrderV3.officialAmount)
            && Objects.equals(this.measureId, customerOrderV3.measureId)
            && Objects.equals(this.createTime, customerOrderV3.createTime)
            && Objects.equals(this.paymentTime, customerOrderV3.paymentTime)
            && Objects.equals(this.currency, customerOrderV3.currency)
            && Objects.equals(this.contractId, customerOrderV3.contractId)
            && Objects.equals(this.amountInfo, customerOrderV3.amountInfo)
            && Objects.equals(this.userName, customerOrderV3.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId,
            customerId,
            serviceTypeCode,
            serviceTypeName,
            sourceType,
            status,
            orderType,
            amountAfterDiscount,
            officialAmount,
            measureId,
            createTime,
            paymentTime,
            currency,
            contractId,
            amountInfo,
            userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerOrderV3 {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
        sb.append("    amountAfterDiscount: ").append(toIndentedString(amountAfterDiscount)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    paymentTime: ").append(toIndentedString(paymentTime)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
        sb.append("    amountInfo: ").append(toIndentedString(amountInfo)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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
