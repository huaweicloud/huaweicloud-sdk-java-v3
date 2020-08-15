package com.huaweicloud.sdk.bss.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AdjustRecordV2
 */
public class AdjustRecordV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private BigDecimal amount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apply_scene")
    
    private String applyScene;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_name")
    
    private String customerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_time")
    
    private String operationTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_type")
    
    private String operationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trans_id")
    
    private String transId;

    public AdjustRecordV2 withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：调账/回收总额。| |参数的约束及描述：调账/回收总额。|
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public AdjustRecordV2 withApplyScene(String applyScene) {
        this.applyScene = applyScene;
        return this;
    }

    


    /**
     * |参数名称：使用场景。| |参数约束及描述：使用场景。|
     * @return applyScene
     */
    public String getApplyScene() {
        return applyScene;
    }

    public void setApplyScene(String applyScene) {
        this.applyScene = applyScene;
    }

    public AdjustRecordV2 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    


    /**
     * |参数名称：币种。当前固定为CNY。| |参数约束及描述：币种。当前固定为CNY。|
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AdjustRecordV2 withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：合作伙伴关联的客户的客户ID。| |参数约束及描述：合作伙伴关联的客户的客户ID。|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public AdjustRecordV2 withCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    


    /**
     * |参数名称：合作伙伴关联的客户的客户名。| |参数约束及描述：合作伙伴关联的客户的客户名。|
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public AdjustRecordV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：度量单位。1：元| |参数的约束及描述：度量单位。1：元|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public AdjustRecordV2 withOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }

    


    /**
     * |参数名称：调账时间。UTC时间，格式为：2016-03-28T14:45:38Z| |参数约束及描述：调账时间。UTC时间，格式为：2016-03-28T14:45:38Z|
     * @return operationTime
     */
    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public AdjustRecordV2 withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    


    /**
     * |参数名称：调账类型。0：授信1：回收2：解绑回收| |参数约束及描述：调账类型。0：授信1：回收2：解绑回收|
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public AdjustRecordV2 withTransId(String transId) {
        this.transId = transId;
        return this;
    }

    


    /**
     * |参数名称：事务ID，只有在调用3-向客户账户拨款或4-回收客户账户余额接口时，响应消息中返回的该记录存在事务ID“trans_id”字段，这个地方才可能有值。| |参数约束及描述：事务ID，只有在调用3-向客户账户拨款或4-回收客户账户余额接口时，响应消息中返回的该记录存在事务ID“trans_id”字段，这个地方才可能有值。|
     * @return transId
     */
    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdjustRecordV2 adjustRecordV2 = (AdjustRecordV2) o;
        return Objects.equals(this.amount, adjustRecordV2.amount) &&
            Objects.equals(this.applyScene, adjustRecordV2.applyScene) &&
            Objects.equals(this.currency, adjustRecordV2.currency) &&
            Objects.equals(this.customerId, adjustRecordV2.customerId) &&
            Objects.equals(this.customerName, adjustRecordV2.customerName) &&
            Objects.equals(this.measureId, adjustRecordV2.measureId) &&
            Objects.equals(this.operationTime, adjustRecordV2.operationTime) &&
            Objects.equals(this.operationType, adjustRecordV2.operationType) &&
            Objects.equals(this.transId, adjustRecordV2.transId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(amount, applyScene, currency, customerId, customerName, measureId, operationTime, operationType, transId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdjustRecordV2 {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    applyScene: ").append(toIndentedString(applyScene)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    operationTime: ").append(toIndentedString(operationTime)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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

