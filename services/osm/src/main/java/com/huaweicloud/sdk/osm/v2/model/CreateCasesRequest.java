package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.CreateOrderIncidentV2Req;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateCasesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    
    private Integer xSite;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    
    private String xTimeZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x-phone-verifiedid")
    
    private String xPhoneVerifiedid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x-email-verifiedid")
    
    private String xEmailVerifiedid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateOrderIncidentV2Req body;

    public CreateCasesRequest withXSite(Integer xSite) {
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

    

    public CreateCasesRequest withXLanguage(String xLanguage) {
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

    

    public CreateCasesRequest withXTimeZone(String xTimeZone) {
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

    

    public CreateCasesRequest withXPhoneVerifiedid(String xPhoneVerifiedid) {
        this.xPhoneVerifiedid = xPhoneVerifiedid;
        return this;
    }

    


    /**
     * Get xPhoneVerifiedid
     * @return xPhoneVerifiedid
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x-phone-verifiedid")
    public String getXPhoneVerifiedid() {
        return xPhoneVerifiedid;
    }

    public void setXPhoneVerifiedid(String xPhoneVerifiedid) {
        this.xPhoneVerifiedid = xPhoneVerifiedid;
    }

    

    public CreateCasesRequest withXEmailVerifiedid(String xEmailVerifiedid) {
        this.xEmailVerifiedid = xEmailVerifiedid;
        return this;
    }

    


    /**
     * Get xEmailVerifiedid
     * @return xEmailVerifiedid
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x-email-verifiedid")
    public String getXEmailVerifiedid() {
        return xEmailVerifiedid;
    }

    public void setXEmailVerifiedid(String xEmailVerifiedid) {
        this.xEmailVerifiedid = xEmailVerifiedid;
    }

    

    public CreateCasesRequest withBody(CreateOrderIncidentV2Req body) {
        this.body = body;
        return this;
    }

    public CreateCasesRequest withBody(Consumer<CreateOrderIncidentV2Req> bodySetter) {
        if(this.body == null ){
            this.body = new CreateOrderIncidentV2Req();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateOrderIncidentV2Req getBody() {
        return body;
    }

    public void setBody(CreateOrderIncidentV2Req body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCasesRequest createCasesRequest = (CreateCasesRequest) o;
        return Objects.equals(this.xSite, createCasesRequest.xSite) &&
            Objects.equals(this.xLanguage, createCasesRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, createCasesRequest.xTimeZone) &&
            Objects.equals(this.xPhoneVerifiedid, createCasesRequest.xPhoneVerifiedid) &&
            Objects.equals(this.xEmailVerifiedid, createCasesRequest.xEmailVerifiedid) &&
            Objects.equals(this.body, createCasesRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xSite, xLanguage, xTimeZone, xPhoneVerifiedid, xEmailVerifiedid, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCasesRequest {\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
        sb.append("    xPhoneVerifiedid: ").append(toIndentedString(xPhoneVerifiedid)).append("\n");
        sb.append("    xEmailVerifiedid: ").append(toIndentedString(xEmailVerifiedid)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

