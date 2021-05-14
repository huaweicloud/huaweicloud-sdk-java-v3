package com.huaweicloud.sdk.devstar.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Reference
 */
public class Reference  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="title")
    
    private String title;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private Integer type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="productshort")
    
    private String productshort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_valid")
    
    private Boolean isValid;

    public Reference withTitle(String title) {
        this.title = title;
        return this;
    }

    


    /**
     * 标题名称。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    public Reference withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 链接地址。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public Reference withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * 关联类型。
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    

    public Reference withProductshort(String productshort) {
        this.productshort = productshort;
        return this;
    }

    


    /**
     * 产品短名。
     * @return productshort
     */
    public String getProductshort() {
        return productshort;
    }

    public void setProductshort(String productshort) {
        this.productshort = productshort;
    }

    

    public Reference withIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }

    


    /**
     * 是否有效
     * @return isValid
     */
    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Reference reference = (Reference) o;
        return Objects.equals(this.title, reference.title) &&
            Objects.equals(this.url, reference.url) &&
            Objects.equals(this.type, reference.type) &&
            Objects.equals(this.productshort, reference.productshort) &&
            Objects.equals(this.isValid, reference.isValid);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, url, type, productshort, isValid);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Reference {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    productshort: ").append(toIndentedString(productshort)).append("\n");
        sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
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

