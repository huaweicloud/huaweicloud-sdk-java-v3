package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProductOrderInfo
 */
public class ProductOrderInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private List<ProductInfoBean> productInfo = null;

    public ProductOrderInfo withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ProductOrderInfo withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 订购周期类型
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public ProductOrderInfo withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数量
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public ProductOrderInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ProductOrderInfo withProductInfo(List<ProductInfoBean> productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public ProductOrderInfo addProductInfoItem(ProductInfoBean productInfoItem) {
        if (this.productInfo == null) {
            this.productInfo = new ArrayList<>();
        }
        this.productInfo.add(productInfoItem);
        return this;
    }

    public ProductOrderInfo withProductInfo(Consumer<List<ProductInfoBean>> productInfoSetter) {
        if (this.productInfo == null) {
            this.productInfo = new ArrayList<>();
        }
        productInfoSetter.accept(this.productInfo);
        return this;
    }

    /**
     * 产品信息
     * @return productInfo
     */
    public List<ProductInfoBean> getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(List<ProductInfoBean> productInfo) {
        this.productInfo = productInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductOrderInfo productOrderInfo = (ProductOrderInfo) o;
        return Objects.equals(this.tenantId, productOrderInfo.tenantId)
            && Objects.equals(this.periodType, productOrderInfo.periodType)
            && Objects.equals(this.periodNum, productOrderInfo.periodNum)
            && Objects.equals(this.resourceId, productOrderInfo.resourceId)
            && Objects.equals(this.productInfo, productOrderInfo.productInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, periodType, periodNum, resourceId, productInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductOrderInfo {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
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
