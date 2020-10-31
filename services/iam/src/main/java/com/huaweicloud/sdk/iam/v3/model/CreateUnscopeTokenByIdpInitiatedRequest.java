package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateUnscopeTokenByIdpInitiatedRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Idp-Id")
    
    private String xIdpId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private Object body = null;

    public CreateUnscopeTokenByIdpInitiatedRequest withXIdpId(String xIdpId) {
        this.xIdpId = xIdpId;
        return this;
    }

    


    /**
     * Get xIdpId
     * @return xIdpId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Idp-Id")
    public String getXIdpId() {
        return xIdpId;
    }

    public void setXIdpId(String xIdpId) {
        this.xIdpId = xIdpId;
    }

    public CreateUnscopeTokenByIdpInitiatedRequest withBody(Object body) {
        this.body = body;
        return this;
    }

    public CreateUnscopeTokenByIdpInitiatedRequest withBody(Consumer<Object> bodySetter) {
        if(this.body == null ){
            this.body = new Object();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
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
        CreateUnscopeTokenByIdpInitiatedRequest createUnscopeTokenByIdpInitiatedRequest = (CreateUnscopeTokenByIdpInitiatedRequest) o;
        return Objects.equals(this.xIdpId, createUnscopeTokenByIdpInitiatedRequest.xIdpId) &&
            Objects.equals(this.body, createUnscopeTokenByIdpInitiatedRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xIdpId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUnscopeTokenByIdpInitiatedRequest {\n");
        sb.append("    xIdpId: ").append(toIndentedString(xIdpId)).append("\n");
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

