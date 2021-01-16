package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.DevicesCalculation;
import com.huaweicloud.sdk.roma.v2.model.ProductTemplatesCalculation;
import com.huaweicloud.sdk.roma.v2.model.ProductsCalculation;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CountDevicesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_templates")
    
    private ProductTemplatesCalculation productTemplates = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="products")
    
    private ProductsCalculation products = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="devices")
    
    private DevicesCalculation devices = null;

    public CountDevicesResponse withProductTemplates(ProductTemplatesCalculation productTemplates) {
        this.productTemplates = productTemplates;
        return this;
    }

    public CountDevicesResponse withProductTemplates(Consumer<ProductTemplatesCalculation> productTemplatesSetter) {
        if(this.productTemplates == null ){
            this.productTemplates = new ProductTemplatesCalculation();
            productTemplatesSetter.accept(this.productTemplates);
        }
        
        return this;
    }


    /**
     * Get productTemplates
     * @return productTemplates
     */
    public ProductTemplatesCalculation getProductTemplates() {
        return productTemplates;
    }

    public void setProductTemplates(ProductTemplatesCalculation productTemplates) {
        this.productTemplates = productTemplates;
    }

    public CountDevicesResponse withProducts(ProductsCalculation products) {
        this.products = products;
        return this;
    }

    public CountDevicesResponse withProducts(Consumer<ProductsCalculation> productsSetter) {
        if(this.products == null ){
            this.products = new ProductsCalculation();
            productsSetter.accept(this.products);
        }
        
        return this;
    }


    /**
     * Get products
     * @return products
     */
    public ProductsCalculation getProducts() {
        return products;
    }

    public void setProducts(ProductsCalculation products) {
        this.products = products;
    }

    public CountDevicesResponse withDevices(DevicesCalculation devices) {
        this.devices = devices;
        return this;
    }

    public CountDevicesResponse withDevices(Consumer<DevicesCalculation> devicesSetter) {
        if(this.devices == null ){
            this.devices = new DevicesCalculation();
            devicesSetter.accept(this.devices);
        }
        
        return this;
    }


    /**
     * Get devices
     * @return devices
     */
    public DevicesCalculation getDevices() {
        return devices;
    }

    public void setDevices(DevicesCalculation devices) {
        this.devices = devices;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CountDevicesResponse countDevicesResponse = (CountDevicesResponse) o;
        return Objects.equals(this.productTemplates, countDevicesResponse.productTemplates) &&
            Objects.equals(this.products, countDevicesResponse.products) &&
            Objects.equals(this.devices, countDevicesResponse.devices);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productTemplates, products, devices);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountDevicesResponse {\n");
        sb.append("    productTemplates: ").append(toIndentedString(productTemplates)).append("\n");
        sb.append("    products: ").append(toIndentedString(products)).append("\n");
        sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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

