package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AdjustRecordV3
 */
public class AdjustRecordV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_name")

    private String customerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private String amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_scene")

    private String applyScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_time")

    private String operationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_id")

    private String transId;

    public AdjustRecordV3 withCustomerId(String customerId) {
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

    public AdjustRecordV3 withCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    /**
     * 客户名称。
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public AdjustRecordV3 withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 调账类型。 SOURCE_OPERATION_BEADJUST：拨款SOURCE_OPERATION_BERETRIEVE：回收SOURCE_OPERATION_BEUNBIND：解绑回收
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public AdjustRecordV3 withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 调账的总金额。
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public AdjustRecordV3 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 币种。 CNY：人民币
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AdjustRecordV3 withApplyScene(String applyScene) {
        this.applyScene = applyScene;
        return this;
    }

    /**
     * 使用场景。
     * @return applyScene
     */
    public String getApplyScene() {
        return applyScene;
    }

    public void setApplyScene(String applyScene) {
        this.applyScene = applyScene;
    }

    public AdjustRecordV3 withOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }

    /**
     * 调账操作的时间。 UTC时间，格式为：2016-03-28T14:45:38Z
     * @return operationTime
     */
    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public AdjustRecordV3 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 调账单位。 1：元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public AdjustRecordV3 withTransId(String transId) {
        this.transId = transId;
        return this;
    }

    /**
     * 事务ID。
     * @return transId
     */
    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdjustRecordV3 that = (AdjustRecordV3) obj;
        return Objects.equals(this.customerId, that.customerId) && Objects.equals(this.customerName, that.customerName)
            && Objects.equals(this.operationType, that.operationType) && Objects.equals(this.amount, that.amount)
            && Objects.equals(this.currency, that.currency) && Objects.equals(this.applyScene, that.applyScene)
            && Objects.equals(this.operationTime, that.operationTime) && Objects.equals(this.measureId, that.measureId)
            && Objects.equals(this.transId, that.transId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId,
            customerName,
            operationType,
            amount,
            currency,
            applyScene,
            operationTime,
            measureId,
            transId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdjustRecordV3 {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    applyScene: ").append(toIndentedString(applyScene)).append("\n");
        sb.append("    operationTime: ").append(toIndentedString(operationTime)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
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
