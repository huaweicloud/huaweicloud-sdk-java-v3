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
public class ShowPartnersServiceInfoRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="case_sub_type_id")
    
    private String caseSubTypeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    
    private Integer xSite;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    
    private String xTimeZone;

    public ShowPartnersServiceInfoRequest withCaseSubTypeId(String caseSubTypeId) {
        this.caseSubTypeId = caseSubTypeId;
        return this;
    }

    


    /**
     * Get caseSubTypeId
     * @return caseSubTypeId
     */
    public String getCaseSubTypeId() {
        return caseSubTypeId;
    }

    public void setCaseSubTypeId(String caseSubTypeId) {
        this.caseSubTypeId = caseSubTypeId;
    }

    

    public ShowPartnersServiceInfoRequest withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * Get productId
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    

    public ShowPartnersServiceInfoRequest withXSite(Integer xSite) {
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

    

    public ShowPartnersServiceInfoRequest withXLanguage(String xLanguage) {
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

    

    public ShowPartnersServiceInfoRequest withXTimeZone(String xTimeZone) {
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
        ShowPartnersServiceInfoRequest showPartnersServiceInfoRequest = (ShowPartnersServiceInfoRequest) o;
        return Objects.equals(this.caseSubTypeId, showPartnersServiceInfoRequest.caseSubTypeId) &&
            Objects.equals(this.productId, showPartnersServiceInfoRequest.productId) &&
            Objects.equals(this.xSite, showPartnersServiceInfoRequest.xSite) &&
            Objects.equals(this.xLanguage, showPartnersServiceInfoRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, showPartnersServiceInfoRequest.xTimeZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(caseSubTypeId, productId, xSite, xLanguage, xTimeZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPartnersServiceInfoRequest {\n");
        sb.append("    caseSubTypeId: ").append(toIndentedString(caseSubTypeId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

