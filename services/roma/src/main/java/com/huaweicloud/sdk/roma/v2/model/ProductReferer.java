package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 产品 */
public class ProductReferer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private Integer productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacturer_id")

    private String manufacturerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_type")

    private Integer protocolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type")

    private Integer productType;

    public ProductReferer withProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /** 产品ID，未填写厂商ID+型号时产品ID必填 minimum: 1 maximum: 999999999999999999
     * 
     * @return productId */
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public ProductReferer withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /** 产品名称
     * 
     * @return productName */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductReferer withManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
        return this;
    }

    /** 厂商ID，未填写产品ID时厂商ID和型号必填
     * 
     * @return manufacturerId */
    public String getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public ProductReferer withModel(String model) {
        this.model = model;
        return this;
    }

    /** 型号，未填写产品ID时厂商ID和型号必填
     * 
     * @return model */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ProductReferer withProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /** 产品的协议类型：0-mqtt，1-coap，2-modbus，3-http, 4-opcua minimum: 0 maximum: 10
     * 
     * @return protocolType */
    public Integer getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(Integer protocolType) {
        this.protocolType = protocolType;
    }

    public ProductReferer withProductType(Integer productType) {
        this.productType = productType;
        return this;
    }

    /** 产品类型：0-普通产品 1-网关产品 minimum: 0 maximum: 10
     * 
     * @return productType */
    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductReferer productReferer = (ProductReferer) o;
        return Objects.equals(this.productId, productReferer.productId)
            && Objects.equals(this.productName, productReferer.productName)
            && Objects.equals(this.manufacturerId, productReferer.manufacturerId)
            && Objects.equals(this.model, productReferer.model)
            && Objects.equals(this.protocolType, productReferer.protocolType)
            && Objects.equals(this.productType, productReferer.productType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, manufacturerId, model, protocolType, productType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductReferer {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    manufacturerId: ").append(toIndentedString(manufacturerId)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    protocolType: ").append(toIndentedString(protocolType)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
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
