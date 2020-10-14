package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.AgreeTenantAuthorizationV2Req;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ConfirmAuthorizationsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authorization_id")
    
    private Long authorizationId;


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
    @JsonProperty(value="body")
    
    private AgreeTenantAuthorizationV2Req body = null;

    public ConfirmAuthorizationsRequest withAuthorizationId(Long authorizationId) {
        this.authorizationId = authorizationId;
        return this;
    }

    


    /**
     * Get authorizationId
     * minimum: 0
     * maximum: 9223372036854775807
     * @return authorizationId
     */
    public Long getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(Long authorizationId) {
        this.authorizationId = authorizationId;
    }

    public ConfirmAuthorizationsRequest withXSite(Integer xSite) {
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
    @JsonProperty(value="")
    public Integer getXSite() {
        return xSite;
    }

    public void setXSite(Integer xSite) {
        this.xSite = xSite;
    }

    public ConfirmAuthorizationsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ConfirmAuthorizationsRequest withXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
        return this;
    }

    


    /**
     * Get xTimeZone
     * @return xTimeZone
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXTimeZone() {
        return xTimeZone;
    }

    public void setXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
    }

    public ConfirmAuthorizationsRequest withBody(AgreeTenantAuthorizationV2Req body) {
        this.body = body;
        return this;
    }

    public ConfirmAuthorizationsRequest withBody(Consumer<AgreeTenantAuthorizationV2Req> bodySetter) {
        if(this.body == null ){
            this.body = new AgreeTenantAuthorizationV2Req();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AgreeTenantAuthorizationV2Req getBody() {
        return body;
    }

    public void setBody(AgreeTenantAuthorizationV2Req body) {
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
        ConfirmAuthorizationsRequest confirmAuthorizationsRequest = (ConfirmAuthorizationsRequest) o;
        return Objects.equals(this.authorizationId, confirmAuthorizationsRequest.authorizationId) &&
            Objects.equals(this.xSite, confirmAuthorizationsRequest.xSite) &&
            Objects.equals(this.xLanguage, confirmAuthorizationsRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, confirmAuthorizationsRequest.xTimeZone) &&
            Objects.equals(this.body, confirmAuthorizationsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorizationId, xSite, xLanguage, xTimeZone, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmAuthorizationsRequest {\n");
        sb.append("    authorizationId: ").append(toIndentedString(authorizationId)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
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

