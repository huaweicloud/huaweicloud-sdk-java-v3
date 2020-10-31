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
public class ListExtendsParamsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="business_type_id")
    
    private String businessTypeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incident_sub_type_id")
    
    private String incidentSubTypeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_category_id")
    
    private String productCategoryId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    
    private Integer xSite;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    
    private String xTimeZone;

    public ListExtendsParamsRequest withBusinessTypeId(String businessTypeId) {
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

    public ListExtendsParamsRequest withIncidentSubTypeId(String incidentSubTypeId) {
        this.incidentSubTypeId = incidentSubTypeId;
        return this;
    }

    


    /**
     * Get incidentSubTypeId
     * @return incidentSubTypeId
     */
    public String getIncidentSubTypeId() {
        return incidentSubTypeId;
    }

    public void setIncidentSubTypeId(String incidentSubTypeId) {
        this.incidentSubTypeId = incidentSubTypeId;
    }

    public ListExtendsParamsRequest withProductCategoryId(String productCategoryId) {
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

    public ListExtendsParamsRequest withXSite(Integer xSite) {
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

    public ListExtendsParamsRequest withXLanguage(String xLanguage) {
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

    public ListExtendsParamsRequest withXTimeZone(String xTimeZone) {
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
        ListExtendsParamsRequest listExtendsParamsRequest = (ListExtendsParamsRequest) o;
        return Objects.equals(this.businessTypeId, listExtendsParamsRequest.businessTypeId) &&
            Objects.equals(this.incidentSubTypeId, listExtendsParamsRequest.incidentSubTypeId) &&
            Objects.equals(this.productCategoryId, listExtendsParamsRequest.productCategoryId) &&
            Objects.equals(this.xSite, listExtendsParamsRequest.xSite) &&
            Objects.equals(this.xLanguage, listExtendsParamsRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, listExtendsParamsRequest.xTimeZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(businessTypeId, incidentSubTypeId, productCategoryId, xSite, xLanguage, xTimeZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExtendsParamsRequest {\n");
        sb.append("    businessTypeId: ").append(toIndentedString(businessTypeId)).append("\n");
        sb.append("    incidentSubTypeId: ").append(toIndentedString(incidentSubTypeId)).append("\n");
        sb.append("    productCategoryId: ").append(toIndentedString(productCategoryId)).append("\n");
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

