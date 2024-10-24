package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 关联商品
 */
public class RelationProductInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_title")

    private String productTitle;

    public RelationProductInfo withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 关联商品ID。如果配置，则段落切换回调中会携带该信息。美团平台对应goodsId
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public RelationProductInfo withProductTitle(String productTitle) {
        this.productTitle = productTitle;
        return this;
    }

    /**
     * 关联商品标题/名称。如果配置，则段落切换回调中会携带该信息。美团平台对应goodsTitle
     * @return productTitle
     */
    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelationProductInfo that = (RelationProductInfo) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.productTitle, that.productTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productTitle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelationProductInfo {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productTitle: ").append(toIndentedString(productTitle)).append("\n");
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
