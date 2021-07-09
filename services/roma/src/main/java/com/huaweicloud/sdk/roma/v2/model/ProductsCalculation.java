package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ProductsCalculation
 */
public class ProductsCalculation  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="normal_products_numbers")
    
    private Integer normalProductsNumbers;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="gateway_products_numbers")
    
    private Integer gatewayProductsNumbers;

    public ProductsCalculation withNormalProductsNumbers(Integer normalProductsNumbers) {
        this.normalProductsNumbers = normalProductsNumbers;
        return this;
    }

    


    /**
     * 普通产品数量
     * minimum: 0
     * maximum: 999999999
     * @return normalProductsNumbers
     */
    public Integer getNormalProductsNumbers() {
        return normalProductsNumbers;
    }

    public void setNormalProductsNumbers(Integer normalProductsNumbers) {
        this.normalProductsNumbers = normalProductsNumbers;
    }

    

    public ProductsCalculation withGatewayProductsNumbers(Integer gatewayProductsNumbers) {
        this.gatewayProductsNumbers = gatewayProductsNumbers;
        return this;
    }

    


    /**
     * 网关产品数量
     * minimum: 0
     * maximum: 999999999
     * @return gatewayProductsNumbers
     */
    public Integer getGatewayProductsNumbers() {
        return gatewayProductsNumbers;
    }

    public void setGatewayProductsNumbers(Integer gatewayProductsNumbers) {
        this.gatewayProductsNumbers = gatewayProductsNumbers;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductsCalculation productsCalculation = (ProductsCalculation) o;
        return Objects.equals(this.normalProductsNumbers, productsCalculation.normalProductsNumbers) &&
            Objects.equals(this.gatewayProductsNumbers, productsCalculation.gatewayProductsNumbers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(normalProductsNumbers, gatewayProductsNumbers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductsCalculation {\n");
        sb.append("    normalProductsNumbers: ").append(toIndentedString(normalProductsNumbers)).append("\n");
        sb.append("    gatewayProductsNumbers: ").append(toIndentedString(gatewayProductsNumbers)).append("\n");
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

