package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.Certificate;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowCertificateResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificate")
    
    private Certificate certificate = null;

    public ShowCertificateResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求ID。 注：自动生成 。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowCertificateResponse withCertificate(Certificate certificate) {
        this.certificate = certificate;
        return this;
    }

    public ShowCertificateResponse withCertificate(Consumer<Certificate> certificateSetter) {
        if(this.certificate == null ){
            this.certificate = new Certificate();
            certificateSetter.accept(this.certificate);
        }
        
        return this;
    }


    /**
     * Get certificate
     * @return certificate
     */
    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCertificateResponse showCertificateResponse = (ShowCertificateResponse) o;
        return Objects.equals(this.requestId, showCertificateResponse.requestId) &&
            Objects.equals(this.certificate, showCertificateResponse.certificate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, certificate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertificateResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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

