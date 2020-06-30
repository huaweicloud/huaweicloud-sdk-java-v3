package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.ModPwdReqDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdatePwdRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-ID")
    
    private String xRequestID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Accept-Language")
    
    private String acceptLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ModPwdReqDTO body = null;

    public UpdatePwdRequest withXRequestID(String xRequestID) {
        this.xRequestID = xRequestID;
        return this;
    }

    


    /**
     * Get xRequestID
     * @return xRequestID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXRequestID() {
        return xRequestID;
    }

    public void setXRequestID(String xRequestID) {
        this.xRequestID = xRequestID;
    }

    public UpdatePwdRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    


    /**
     * Get acceptLanguage
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public UpdatePwdRequest withBody(ModPwdReqDTO body) {
        this.body = body;
        return this;
    }

    public UpdatePwdRequest withBody(Consumer<ModPwdReqDTO> bodySetter) {
        if(this.body == null ){
            this.body = new ModPwdReqDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ModPwdReqDTO getBody() {
        return body;
    }

    public void setBody(ModPwdReqDTO body) {
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
        UpdatePwdRequest updatePwdRequest = (UpdatePwdRequest) o;
        return Objects.equals(this.xRequestID, updatePwdRequest.xRequestID) &&
            Objects.equals(this.acceptLanguage, updatePwdRequest.acceptLanguage) &&
            Objects.equals(this.body, updatePwdRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xRequestID, acceptLanguage, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePwdRequest {\n");
        sb.append("    xRequestID: ").append(toIndentedString(xRequestID)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
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

