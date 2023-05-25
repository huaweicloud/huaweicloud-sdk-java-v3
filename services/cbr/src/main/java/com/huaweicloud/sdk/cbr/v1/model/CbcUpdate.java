package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CbcUpdate
 */
public class CbcUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudServiceConsoleURL")

    private String cloudServiceConsoleURL;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "productInfo")

    private CbcProductInfoUpdate productInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceId")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_info")

    private String promotionInfo;

    public CbcUpdate withCloudServiceConsoleURL(String cloudServiceConsoleURL) {
        this.cloudServiceConsoleURL = cloudServiceConsoleURL;
        return this;
    }

    /**
     * 云服务ConsoleURL。订单支付完成后，客户可以通过此URL跳转到云服务Console页面查看信息
     * @return cloudServiceConsoleURL
     */
    public String getCloudServiceConsoleURL() {
        return cloudServiceConsoleURL;
    }

    public void setCloudServiceConsoleURL(String cloudServiceConsoleURL) {
        this.cloudServiceConsoleURL = cloudServiceConsoleURL;
    }

    public CbcUpdate withProductInfo(CbcProductInfoUpdate productInfo) {
        this.productInfo = productInfo;
        return this;
    }

    public CbcUpdate withProductInfo(Consumer<CbcProductInfoUpdate> productInfoSetter) {
        if (this.productInfo == null) {
            this.productInfo = new CbcProductInfoUpdate();
            productInfoSetter.accept(this.productInfo);
        }

        return this;
    }

    /**
     * Get productInfo
     * @return productInfo
     */
    public CbcProductInfoUpdate getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(CbcProductInfoUpdate productInfo) {
        this.productInfo = productInfo;
    }

    public CbcUpdate withResourceId(String resourceId) {
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

    public CbcUpdate withPromotionInfo(String promotionInfo) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CbcUpdate cbcUpdate = (CbcUpdate) o;
        return Objects.equals(this.cloudServiceConsoleURL, cbcUpdate.cloudServiceConsoleURL)
            && Objects.equals(this.productInfo, cbcUpdate.productInfo)
            && Objects.equals(this.resourceId, cbcUpdate.resourceId)
            && Objects.equals(this.promotionInfo, cbcUpdate.promotionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudServiceConsoleURL, productInfo, resourceId, promotionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CbcUpdate {\n");
        sb.append("    cloudServiceConsoleURL: ").append(toIndentedString(cloudServiceConsoleURL)).append("\n");
        sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
