package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.ApplyCertificateToHostRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ApplyCertificateToHostRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificate_id")
    
    private String certificateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ApplyCertificateToHostRequestBody body;

    public ApplyCertificateToHostRequest withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    


    /**
     * 证书ID
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    

    public ApplyCertificateToHostRequest withBody(ApplyCertificateToHostRequestBody body) {
        this.body = body;
        return this;
    }

    public ApplyCertificateToHostRequest withBody(Consumer<ApplyCertificateToHostRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new ApplyCertificateToHostRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ApplyCertificateToHostRequestBody getBody() {
        return body;
    }

    public void setBody(ApplyCertificateToHostRequestBody body) {
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
        ApplyCertificateToHostRequest applyCertificateToHostRequest = (ApplyCertificateToHostRequest) o;
        return Objects.equals(this.certificateId, applyCertificateToHostRequest.certificateId) &&
            Objects.equals(this.body, applyCertificateToHostRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(certificateId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyCertificateToHostRequest {\n");
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

