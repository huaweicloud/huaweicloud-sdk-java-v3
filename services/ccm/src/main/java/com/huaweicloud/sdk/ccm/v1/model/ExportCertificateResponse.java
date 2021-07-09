package com.huaweicloud.sdk.ccm.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExportCertificateResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_key")
    
    private String privateKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificate")
    
    private String certificate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificate_chain")
    
    private String certificateChain;

    public ExportCertificateResponse withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    


    /**
     * 私钥内容
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    

    public ExportCertificateResponse withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    


    /**
     * 证书内容
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    

    public ExportCertificateResponse withCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }

    


    /**
     * 证书链内容
     * @return certificateChain
     */
    public String getCertificateChain() {
        return certificateChain;
    }

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportCertificateResponse exportCertificateResponse = (ExportCertificateResponse) o;
        return Objects.equals(this.privateKey, exportCertificateResponse.privateKey) &&
            Objects.equals(this.certificate, exportCertificateResponse.certificate) &&
            Objects.equals(this.certificateChain, exportCertificateResponse.certificateChain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(privateKey, certificate, certificateChain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportCertificateResponse {\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
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

