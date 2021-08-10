package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** FreeResource */
public class FreeResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_resource_id")

    private String freeResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_type_name")

    private String usageTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private Double amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_amount")

    private Double originalAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    public FreeResource withFreeResourceId(String freeResourceId) {
        this.freeResourceId = freeResourceId;
        return this;
    }

    /** 资源项ID，一个资源包中会含有多个资源项，一个使用量类型对应一个资源项。
     * 
     * @return freeResourceId */
    public String getFreeResourceId() {
        return freeResourceId;
    }

    public void setFreeResourceId(String freeResourceId) {
        this.freeResourceId = freeResourceId;
    }

    public FreeResource withUsageTypeName(String usageTypeName) {
        this.usageTypeName = usageTypeName;
        return this;
    }

    /** 使用量类型名称。
     * 
     * @return usageTypeName */
    public String getUsageTypeName() {
        return usageTypeName;
    }

    public void setUsageTypeName(String usageTypeName) {
        this.usageTypeName = usageTypeName;
    }

    public FreeResource withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /** 资源剩余额度，针对可重置资源包，是指当前重置周期内的剩余量。
     * 
     * @return amount */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public FreeResource withOriginalAmount(Double originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }

    /** 资源原始额度，针对可重置资源包，是指每个重置周期内的总量。
     * 
     * @return originalAmount */
    public Double getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Double originalAmount) {
        this.originalAmount = originalAmount;
    }

    public FreeResource withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /** 度量单位，免费资源套餐额度度量单位。您可以调用查询度量单位列表接口获取。
     * 
     * @return measureId */
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
        FreeResource freeResource = (FreeResource) o;
        return Objects.equals(this.freeResourceId, freeResource.freeResourceId)
            && Objects.equals(this.usageTypeName, freeResource.usageTypeName)
            && Objects.equals(this.amount, freeResource.amount)
            && Objects.equals(this.originalAmount, freeResource.originalAmount)
            && Objects.equals(this.measureId, freeResource.measureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeResourceId, usageTypeName, amount, originalAmount, measureId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FreeResource {\n");
        sb.append("    freeResourceId: ").append(toIndentedString(freeResourceId)).append("\n");
        sb.append("    usageTypeName: ").append(toIndentedString(usageTypeName)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
