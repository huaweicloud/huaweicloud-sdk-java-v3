package com.huaweicloud.sdk.ccm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ccm.v1.model.RevokeCertificateRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RevokeCertificateRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificate_id")
    
    private String certificateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private RevokeCertificateRequestBody body;

    public RevokeCertificateRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    


    /**
     * certificate_id
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    

    public RevokeCertificateRequest withBody(RevokeCertificateRequestBody body) {
        this.body = body;
        return this;
    }

    public RevokeCertificateRequest withBody(Consumer<RevokeCertificateRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new RevokeCertificateRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RevokeCertificateRequestBody getBody() {
        return body;
    }

    public void setBody(RevokeCertificateRequestBody body) {
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
        RevokeCertificateRequest revokeCertificateRequest = (RevokeCertificateRequest) o;
        return Objects.equals(this.certificateId, revokeCertificateRequest.certificateId) &&
            Objects.equals(this.body, revokeCertificateRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(certificateId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RevokeCertificateRequest {\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
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

