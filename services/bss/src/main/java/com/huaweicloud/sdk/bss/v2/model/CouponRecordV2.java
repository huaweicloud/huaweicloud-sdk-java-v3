package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CouponRecordV2
 */
public class CouponRecordV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


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
    @JsonProperty(value="coupon_id")
    
    private String couponId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_amount")
    
    private Double operationAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation_time")
    
    private String operationTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private String result;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;

    public CouponRecordV2 withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 该记录的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CouponRecordV2 withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    


    /**
     * 操作类型。 1：发放2：手动回收3：解绑自动回收
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
     * 额度ID。
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
     * 额度类型。 0：代金券额度1：现金券额度
     * @return quotaType
     */
    public Integer getQuotaType() {
        return quotaType;
    }

    public void setQuotaType(Integer quotaType) {
        this.quotaType = quotaType;
    }

    public CouponRecordV2 withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    


    /**
     * 代金券ID。
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
     * 客户账号ID。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CouponRecordV2 withOperationAmount(Double operationAmount) {
        this.operationAmount = operationAmount;
        return this;
    }

    


    /**
     * 操作的面额值。单位：元。 发放时，等于面额值；回收时，指每次回收的具体值。
     * @return operationAmount
     */
    public Double getOperationAmount() {
        return operationAmount;
    }

    public void setOperationAmount(Double operationAmount) {
        this.operationAmount = operationAmount;
    }

    public CouponRecordV2 withOperationTime(String operationTime) {
        this.operationTime = operationTime;
        return this;
    }

    


    /**
     * 操作时间。
     * @return operationTime
     */
    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public CouponRecordV2 withResult(String result) {
        this.result = result;
        return this;
    }

    


    /**
     * 操作结果。 0：成功-1：失败
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public CouponRecordV2 withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 操作记录中的备注。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return Objects.equals(this.id, couponRecordV2.id) &&
            Objects.equals(this.operationType, couponRecordV2.operationType) &&
            Objects.equals(this.quotaId, couponRecordV2.quotaId) &&
            Objects.equals(this.quotaType, couponRecordV2.quotaType) &&
            Objects.equals(this.couponId, couponRecordV2.couponId) &&
            Objects.equals(this.customerId, couponRecordV2.customerId) &&
            Objects.equals(this.operationAmount, couponRecordV2.operationAmount) &&
            Objects.equals(this.operationTime, couponRecordV2.operationTime) &&
            Objects.equals(this.result, couponRecordV2.result) &&
            Objects.equals(this.remark, couponRecordV2.remark);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, operationType, quotaId, quotaType, couponId, customerId, operationAmount, operationTime, result, remark);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CouponRecordV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
        sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    operationAmount: ").append(toIndentedString(operationAmount)).append("\n");
        sb.append("    operationTime: ").append(toIndentedString(operationTime)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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

