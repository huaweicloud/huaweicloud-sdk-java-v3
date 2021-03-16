package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ProductTemplatesCalculation
 */
public class ProductTemplatesCalculation  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_templates_numbers")
    
    private Integer productTemplatesNumbers;

    public ProductTemplatesCalculation withProductTemplatesNumbers(Integer productTemplatesNumbers) {
        this.productTemplatesNumbers = productTemplatesNumbers;
        return this;
    }

    


    /**
     * 产品模板数量
     * @return productTemplatesNumbers
     */
    public Integer getProductTemplatesNumbers() {
        return productTemplatesNumbers;
    }

    public void setProductTemplatesNumbers(Integer productTemplatesNumbers) {
        this.productTemplatesNumbers = productTemplatesNumbers;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductTemplatesCalculation productTemplatesCalculation = (ProductTemplatesCalculation) o;
        return Objects.equals(this.productTemplatesNumbers, productTemplatesCalculation.productTemplatesNumbers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productTemplatesNumbers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductTemplatesCalculation {\n");
        sb.append("    productTemplatesNumbers: ").append(toIndentedString(productTemplatesNumbers)).append("\n");
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

