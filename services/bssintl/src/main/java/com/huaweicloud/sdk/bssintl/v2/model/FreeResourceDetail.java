package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * FreeResourceDetail
 */
public class FreeResourceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_resource_id")

    @JacksonXmlProperty(localName = "free_resource_id")

    private String freeResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_resource_type_name")

    @JacksonXmlProperty(localName = "free_resource_type_name")

    private String freeResourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_reuse_cycle")

    @JacksonXmlProperty(localName = "quota_reuse_cycle")

    private Integer quotaReuseCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_reuse_cycle_type")

    @JacksonXmlProperty(localName = "quota_reuse_cycle_type")

    private Integer quotaReuseCycleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_type_name")

    @JacksonXmlProperty(localName = "usage_type_name")

    private String usageTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    @JacksonXmlProperty(localName = "amount")

    private Double amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_amount")

    @JacksonXmlProperty(localName = "original_amount")

    private Double originalAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    @JacksonXmlProperty(localName = "measure_id")

    private Integer measureId;

    public FreeResourceDetail withFreeResourceId(String freeResourceId) {
        this.freeResourceId = freeResourceId;
        return this;
    }

    /**
     * 资源项ID，一个资源包中会含有多个资源项，一个使用量类型对应一个资源项。
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
     * 资源项类型名称。
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
     * 重置周期，只有quota_reuse_mode为可重置，该字段才有意义。 1：小时2：天3：周4：月5：年
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
     * 重置周期类别，只有quota_reuse_mode为可重置，该字段才有意义。 1：按自然周期重置是指重置周期是按照自然月/年来重置，例如如果周期是月，按自然周期重置，表示每个月的1号重置。 2：按订购周期重置。是指重置周期是按照订购时间来重置，例如如果周期是月，按订购周期重置，15号订购了该套餐，表示每个月的15号重置。
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
     * 使用量类型名称。
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
     * 开始时间，格式UTC。 如果quota_reuse_mode为可重置，则此时间为当前时间所在的重置周期的开始时间。如果quota_reuse_mode为不可重置，则此时间为订购实例的生效时间。
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
     * 结束时间，格式UTC。 如果quota_reuse_mode为可重置，则此时间为当前时间所在的重置周期的结束时间。如果quota_reuse_mode为不可重置，则此时间为订购实例的失效时间。
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
     * 资源剩余额度，针对可重置资源包，是指当前重置周期内的剩余量。
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
     * 资源原始额度，针对可重置资源包，是指每个重置周期内的总量。
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
     * 度量单位，免费资源套餐额度度量单位。您可以调用查询度量单位列表接口获取。
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
        return Objects.equals(this.freeResourceId, freeResourceDetail.freeResourceId)
            && Objects.equals(this.freeResourceTypeName, freeResourceDetail.freeResourceTypeName)
            && Objects.equals(this.quotaReuseCycle, freeResourceDetail.quotaReuseCycle)
            && Objects.equals(this.quotaReuseCycleType, freeResourceDetail.quotaReuseCycleType)
            && Objects.equals(this.usageTypeName, freeResourceDetail.usageTypeName)
            && Objects.equals(this.startTime, freeResourceDetail.startTime)
            && Objects.equals(this.endTime, freeResourceDetail.endTime)
            && Objects.equals(this.amount, freeResourceDetail.amount)
            && Objects.equals(this.originalAmount, freeResourceDetail.originalAmount)
            && Objects.equals(this.measureId, freeResourceDetail.measureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeResourceId,
            freeResourceTypeName,
            quotaReuseCycle,
            quotaReuseCycleType,
            usageTypeName,
            startTime,
            endTime,
            amount,
            originalAmount,
            measureId);
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
