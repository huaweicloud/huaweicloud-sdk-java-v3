package com.huaweicloud.sdk.sa.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RelatedEvent
 */
public class RelatedEvent  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="company_name")
    
    private String companyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_name")
    
    private String productName;

    public RelatedEvent withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 与当前事件相关的事件的ID，最大36个字符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public RelatedEvent withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    


    /**
     * 生成相关事件的产品所属公司名称，最大16个字符。
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    

    public RelatedEvent withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    


    /**
     * 生成相关事件的产品名称，最大24个字符。
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RelatedEvent relatedEvent = (RelatedEvent) o;
        return Objects.equals(this.id, relatedEvent.id) &&
            Objects.equals(this.companyName, relatedEvent.companyName) &&
            Objects.equals(this.productName, relatedEvent.productName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, companyName, productName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedEvent {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
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

