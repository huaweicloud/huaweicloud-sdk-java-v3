package com.huaweicloud.sdk.bss.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CouponRecordV2
 */
public class CouponRecordV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_id")
    
    private String couponId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_amount")
    
    private BigDecimal operationAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_time")
    
    private String operationTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_type")
    
    private String operationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_id")
    
    private String quotaId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_type")
    
    private Integer quotaType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private String result;

    public CouponRecordV2 withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    


    /**
     * |参数名称：代金券ID。| |参数约束及描述：代金券ID。|
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public CouponRecordV2 withCustomerId(String customerId) {
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

    public CouponRecordV2 withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * |参数名称：唯一ID。| |参数约束及描述：唯一ID。|
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CouponRecordV2 withOperationAmount(BigDecimal operationAmount) {
        this.operationAmount = operationAmount;
        return this;
    }

    


    /**
     * |参数名称：操作的面额值。发放时，等于面额值；回收时，指每次回收的具体值。| |参数的约束及描述：操作的面额值。发放时，等于面额值；回收时，指每次回收的具体值。|
     * @return operationAmount
     */
    public BigDecimal getOperationAmount() {
        return operationAmount;
    }

    public void setOperationAmount(BigDecimal operationAmount) {
        this.operationAmount = operationAmount;
    }

    public CouponRecordV2 withOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }

    


    /**
     * |参数名称：操作时间。| |参数约束及描述：操作时间。|
     * @return operationTime
     */
    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public CouponRecordV2 withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    


    /**
     * |参数名称：操作类型：1：发放；2：手动回收；3：解绑自动回收| |参数约束及描述：操作类型：1：发放；2：手动回收；3：解绑自动回收|
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public CouponRecordV2 withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    


    /**
     * |参数名称：额度ID。| |参数约束及描述：额度ID。|
     * @return quotaId
     */
    public String getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }

    public CouponRecordV2 withQuotaType(Integer quotaType) {
        this.quotaType = quotaType;
        return this;
    }

    


    /**
     * |参数名称：操作类型：1：发放；2：手动回收；3：解绑自动回收。| |参数的约束及描述：操作类型：1：发放；2：手动回收；3：解绑自动回收。|
     * @return quotaType
     */
    public Integer getQuotaType() {
        return quotaType;
    }

    public void setQuotaType(Integer quotaType) {
        this.quotaType = quotaType;
    }

    public CouponRecordV2 withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * |参数名称：操作记录中的备注| |参数约束及描述：操作记录中的备注|
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public CouponRecordV2 withResult(String result) {
        this.result = result;
        return this;
    }

    


    /**
     * |参数名称：操作结果：0：成功；其他：失败（直接记录错误码）。|参数约束及描述：操作结果：0：成功；其他：失败（直接记录错误码）。|
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CouponRecordV2 couponRecordV2 = (CouponRecordV2) o;
        return Objects.equals(this.couponId, couponRecordV2.couponId) &&
            Objects.equals(this.customerId, couponRecordV2.customerId) &&
            Objects.equals(this.id, couponRecordV2.id) &&
            Objects.equals(this.operationAmount, couponRecordV2.operationAmount) &&
            Objects.equals(this.operationTime, couponRecordV2.operationTime) &&
            Objects.equals(this.operationType, couponRecordV2.operationType) &&
            Objects.equals(this.quotaId, couponRecordV2.quotaId) &&
            Objects.equals(this.quotaType, couponRecordV2.quotaType) &&
            Objects.equals(this.remark, couponRecordV2.remark) &&
            Objects.equals(this.result, couponRecordV2.result);
    }
    @Override
    public int hashCode() {
        return Objects.hash(couponId, customerId, id, operationAmount, operationTime, operationType, quotaId, quotaType, remark, result);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CouponRecordV2 {\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operationAmount: ").append(toIndentedString(operationAmount)).append("\n");
        sb.append("    operationTime: ").append(toIndentedString(operationTime)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
        sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

