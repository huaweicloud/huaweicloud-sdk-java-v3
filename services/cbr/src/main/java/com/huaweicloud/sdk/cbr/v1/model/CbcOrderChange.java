package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CbcOrderChange
 */
public class CbcOrderChange {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_console_url")

    private String cloudServiceConsoleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_info")

    private CbcProductInfoOrderChange productInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_info")

    private String promotionInfo;

    public CbcOrderChange withCloudServiceConsoleUrl(String cloudServiceConsoleUrl) {
        this.cloudServiceConsoleUrl = cloudServiceConsoleUrl;
        return this;
    }

    /**
     * 云服务ConsoleURL。订单支付完成后，客户可以通过此URL跳转到云服务Console页面查看信息
     * @return cloudServiceConsoleUrl
     */
    public String getCloudServiceConsoleUrl() {
        return cloudServiceConsoleUrl;
    }

    public void setCloudServiceConsoleUrl(String cloudServiceConsoleUrl) {
        this.cloudServiceConsoleUrl = cloudServiceConsoleUrl;
    }

    public CbcOrderChange withProductInfo(CbcProductInfoOrderChange productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public CbcOrderChange withProductInfo(Consumer<CbcProductInfoOrderChange> productInfoSetter) {
        if (this.productInfo == null) {
            this.productInfo = new CbcProductInfoOrderChange();
            productInfoSetter.accept(this.productInfo);
        }

        return this;
    }

    /**
     * Get productInfo
     * @return productInfo
     */
    public CbcProductInfoOrderChange getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(CbcProductInfoOrderChange productInfo) {
        this.productInfo = productInfo;
    }

    public CbcOrderChange withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 待变更的资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public CbcOrderChange withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动支付，默认非自动支付：false
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public CbcOrderChange withPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }

    /**
     * 购买折扣
     * @return promotionInfo
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CbcOrderChange that = (CbcOrderChange) obj;
        return Objects.equals(this.cloudServiceConsoleUrl, that.cloudServiceConsoleUrl)
            && Objects.equals(this.productInfo, that.productInfo) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.isAutoPay, that.isAutoPay) && Objects.equals(this.promotionInfo, that.promotionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudServiceConsoleUrl, productInfo, resourceId, isAutoPay, promotionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CbcOrderChange {\n");
        sb.append("    cloudServiceConsoleUrl: ").append(toIndentedString(cloudServiceConsoleUrl)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    promotionInfo: ").append(toIndentedString(promotionInfo)).append("\n");
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
