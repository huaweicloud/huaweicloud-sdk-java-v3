package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * FreeResourceDetail
 */
public class FreeResourceDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="free_resource_id")
    
    private String freeResourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="free_resource_type_name")
    
    private String freeResourceTypeName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_reuse_cycle")
    
    private Integer quotaReuseCycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_reuse_cycle_type")
    
    private Integer quotaReuseCycleType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usage_type_name")
    
    private String usageTypeName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private Double amount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="original_amount")
    
    private Double originalAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;

    public FreeResourceDetail withFreeResourceId(String freeResourceId) {
        this.freeResourceId = freeResourceId;
        return this;
    }

    


    /**
     * |参数名称：套餐包ID| |参数约束及描述：套餐包ID|
     * @return freeResourceId
     */
    public String getFreeResourceId() {
        return freeResourceId;
    }

    public void setFreeResourceId(String freeResourceId) {
        this.freeResourceId = freeResourceId;
    }

    

    public FreeResourceDetail withFreeResourceTypeName(String freeResourceTypeName) {
        this.freeResourceTypeName = freeResourceTypeName;
        return this;
    }

    


    /**
     * |参数名称：免费资源类型名称| |参数约束及描述：免费资源类型名称|
     * @return freeResourceTypeName
     */
    public String getFreeResourceTypeName() {
        return freeResourceTypeName;
    }

    public void setFreeResourceTypeName(String freeResourceTypeName) {
        this.freeResourceTypeName = freeResourceTypeName;
    }

    

    public FreeResourceDetail withQuotaReuseCycle(Integer quotaReuseCycle) {
        this.quotaReuseCycle = quotaReuseCycle;
        return this;
    }

    


    /**
     * |参数名称：重用周期| |参数的约束及描述：重用周期|
     * @return quotaReuseCycle
     */
    public Integer getQuotaReuseCycle() {
        return quotaReuseCycle;
    }

    public void setQuotaReuseCycle(Integer quotaReuseCycle) {
        this.quotaReuseCycle = quotaReuseCycle;
    }

    

    public FreeResourceDetail withQuotaReuseCycleType(Integer quotaReuseCycleType) {
        this.quotaReuseCycleType = quotaReuseCycleType;
        return this;
    }

    


    /**
     * |参数名称：重置周期类别| |参数的约束及描述：重置周期类别|
     * @return quotaReuseCycleType
     */
    public Integer getQuotaReuseCycleType() {
        return quotaReuseCycleType;
    }

    public void setQuotaReuseCycleType(Integer quotaReuseCycleType) {
        this.quotaReuseCycleType = quotaReuseCycleType;
    }

    

    public FreeResourceDetail withUsageTypeName(String usageTypeName) {
        this.usageTypeName = usageTypeName;
        return this;
    }

    


    /**
     * |参数名称：使用量类型名称| |参数约束及描述：使用量类型名称|
     * @return usageTypeName
     */
    public String getUsageTypeName() {
        return usageTypeName;
    }

    public void setUsageTypeName(String usageTypeName) {
        this.usageTypeName = usageTypeName;
    }

    

    public FreeResourceDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * |参数名称：开始时间| |参数约束及描述：开始时间|
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public FreeResourceDetail withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * |参数名称：结束时间| |参数约束及描述：结束时间|
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public FreeResourceDetail withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：免费资源剩余额度| |参数的约束及描述：免费资源剩余额度|
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    

    public FreeResourceDetail withOriginalAmount(Double originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }

    


    /**
     * |参数名称：免费资源原始额度| |参数的约束及描述：免费资源原始额度|
     * @return originalAmount
     */
    public Double getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Double originalAmount) {
        this.originalAmount = originalAmount;
    }

    

    public FreeResourceDetail withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：度量单位| |参数的约束及描述：度量单位|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FreeResourceDetail freeResourceDetail = (FreeResourceDetail) o;
        return Objects.equals(this.freeResourceId, freeResourceDetail.freeResourceId) &&
            Objects.equals(this.freeResourceTypeName, freeResourceDetail.freeResourceTypeName) &&
            Objects.equals(this.quotaReuseCycle, freeResourceDetail.quotaReuseCycle) &&
            Objects.equals(this.quotaReuseCycleType, freeResourceDetail.quotaReuseCycleType) &&
            Objects.equals(this.usageTypeName, freeResourceDetail.usageTypeName) &&
            Objects.equals(this.startTime, freeResourceDetail.startTime) &&
            Objects.equals(this.endTime, freeResourceDetail.endTime) &&
            Objects.equals(this.amount, freeResourceDetail.amount) &&
            Objects.equals(this.originalAmount, freeResourceDetail.originalAmount) &&
            Objects.equals(this.measureId, freeResourceDetail.measureId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(freeResourceId, freeResourceTypeName, quotaReuseCycle, quotaReuseCycleType, usageTypeName, startTime, endTime, amount, originalAmount, measureId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FreeResourceDetail {\n");
        sb.append("    freeResourceId: ").append(toIndentedString(freeResourceId)).append("\n");
        sb.append("    freeResourceTypeName: ").append(toIndentedString(freeResourceTypeName)).append("\n");
        sb.append("    quotaReuseCycle: ").append(toIndentedString(quotaReuseCycle)).append("\n");
        sb.append("    quotaReuseCycleType: ").append(toIndentedString(quotaReuseCycleType)).append("\n");
        sb.append("    usageTypeName: ").append(toIndentedString(usageTypeName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
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

