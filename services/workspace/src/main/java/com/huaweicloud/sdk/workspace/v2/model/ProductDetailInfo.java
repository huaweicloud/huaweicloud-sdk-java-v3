package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProductDetailInfo
 */
public class ProductDetailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descriptions")

    private String descriptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    public ProductDetailInfo withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductDetailInfo withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 产品规格ID。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public ProductDetailInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 产品类型。  - BASE：表示产品基础套餐，套餐镜像中不包括除操作系统之外的其他商业软件，私有镜像场景只能使用此类套餐。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProductDetailInfo withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ProductDetailInfo withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存。
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public ProductDetailInfo withDescriptions(String descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    /**
     * 产品描述。
     * @return descriptions
     */
    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public ProductDetailInfo withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 周期套餐标识，1表示包周期，0表示按需。
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductDetailInfo productDetailInfo = (ProductDetailInfo) o;
        return Objects.equals(this.productId, productDetailInfo.productId)
            && Objects.equals(this.flavorId, productDetailInfo.flavorId)
            && Objects.equals(this.type, productDetailInfo.type) && Objects.equals(this.cpu, productDetailInfo.cpu)
            && Objects.equals(this.memory, productDetailInfo.memory)
            && Objects.equals(this.descriptions, productDetailInfo.descriptions)
            && Objects.equals(this.chargeMode, productDetailInfo.chargeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, flavorId, type, cpu, memory, descriptions, chargeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductDetailInfo {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
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
