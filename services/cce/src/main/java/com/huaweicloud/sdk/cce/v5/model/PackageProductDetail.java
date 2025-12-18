package com.huaweicloud.sdk.cce.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 套餐包详情。
 */
public class PackageProductDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    public PackageProductDetail withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 套餐包名称。
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public PackageProductDetail withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 套餐包规格。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public PackageProductDetail withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 周期类型，如month（表示月包）、year（表示年包）。
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public PackageProductDetail withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 实例类型，如general-computing。
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PackageProductDetail that = (PackageProductDetail) obj;
        return Objects.equals(this.productName, that.productName)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.instanceType, that.instanceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, resourceSpecCode, periodType, instanceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageProductDetail {\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
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
