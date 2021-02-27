package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SkuInventory
 */
public class SkuInventory  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sku_code")
    
    private String skuCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="saleable_quantity")
    
    private Integer saleableQuantity;

    public SkuInventory withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 产品的ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public SkuInventory withSkuCode(String skuCode) {
        this.skuCode = skuCode;
        return this;
    }

    


    /**
     * SKU编码，唯一标识一个产品的规格。
     * @return skuCode
     */
    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public SkuInventory withSaleableQuantity(Integer saleableQuantity) {
        this.saleableQuantity = saleableQuantity;
        return this;
    }

    


    /**
     * 产品的可售库存数量。
     * minimum: 1
     * maximum: 100
     * @return saleableQuantity
     */
    public Integer getSaleableQuantity() {
        return saleableQuantity;
    }

    public void setSaleableQuantity(Integer saleableQuantity) {
        this.saleableQuantity = saleableQuantity;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkuInventory skuInventory = (SkuInventory) o;
        return Objects.equals(this.productId, skuInventory.productId) &&
            Objects.equals(this.skuCode, skuInventory.skuCode) &&
            Objects.equals(this.saleableQuantity, skuInventory.saleableQuantity);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productId, skuCode, saleableQuantity);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkuInventory {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    skuCode: ").append(toIndentedString(skuCode)).append("\n");
        sb.append("    saleableQuantity: ").append(toIndentedString(saleableQuantity)).append("\n");
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

