package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListCaseQuotasRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_category_id")
    
    private String productCategoryId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="business_type_id")
    
    private String businessTypeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    
    private Integer xSite;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    
    private String xTimeZone;

    public ListCaseQuotasRequest withProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
        return this;
    }

    


    /**
     * Get productCategoryId
     * @return productCategoryId
     */
    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    

    public ListCaseQuotasRequest withBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }

    


    /**
     * Get businessTypeId
     * @return businessTypeId
     */
    public String getBusinessTypeId() {
        return businessTypeId;
    }

    public void setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
    }

    

    public ListCaseQuotasRequest withXSite(Integer xSite) {
        this.xSite = xSite;
        return this;
    }

    


    /**
     * Get xSite
     * minimum: 0
     * maximum: 1
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    public Integer getXSite() {
        return xSite;
    }

    public void setXSite(Integer xSite) {
        this.xSite = xSite;
    }

    

    public ListCaseQuotasRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    public ListCaseQuotasRequest withXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
        return this;
    }

    


    /**
     * Get xTimeZone
     * @return xTimeZone
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    public String getXTimeZone() {
        return xTimeZone;
    }

    public void setXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCaseQuotasRequest listCaseQuotasRequest = (ListCaseQuotasRequest) o;
        return Objects.equals(this.productCategoryId, listCaseQuotasRequest.productCategoryId) &&
            Objects.equals(this.businessTypeId, listCaseQuotasRequest.businessTypeId) &&
            Objects.equals(this.xSite, listCaseQuotasRequest.xSite) &&
            Objects.equals(this.xLanguage, listCaseQuotasRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, listCaseQuotasRequest.xTimeZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(productCategoryId, businessTypeId, xSite, xLanguage, xTimeZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCaseQuotasRequest {\n");
        sb.append("    productCategoryId: ").append(toIndentedString(productCategoryId)).append("\n");
        sb.append("    businessTypeId: ").append(toIndentedString(businessTypeId)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
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

