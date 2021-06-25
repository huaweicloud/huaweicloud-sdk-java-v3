package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cdn.v1.model.ForceRedirect;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * HttpInfoRequestBody
 */
public class HttpInfoRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cert_name")
    
    private String certName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="https_status")
    
    private Integer httpsStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificate")
    
    private String certificate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_key")
    
    private String privateKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http2")
    
    private Integer http2;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificate_type")
    
    private Integer certificateType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="force_redirect_config")
    
    private ForceRedirect forceRedirectConfig;

    public HttpInfoRequestBody withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    


    /**
     * 证书名字。（长度限制为3-32字符）。
     * @return certName
     */
    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    

    public HttpInfoRequestBody withHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
        return this;
    }

    


    /**
     * HTTPS证书是否启用。0：不启用，此时无需填写证书及私钥参数；1：启用HTTPS加速并协议跟随回源；2：启用HTTPS加速并HTTP回源，首次配置证书需要传递证书及私钥，如已有证书可不用传证书及私钥。
     * @return httpsStatus
     */
    public Integer getHttpsStatus() {
        return httpsStatus;
    }

    public void setHttpsStatus(Integer httpsStatus) {
        this.httpsStatus = httpsStatus;
    }

    

    public HttpInfoRequestBody withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    


    /**
     * 功能说明：HTTPS协议使用的证书内容，不启用证书则无需输入。取值范围：PEM编码格式。初次配置证书时必传。
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    

    public HttpInfoRequestBody withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    


    /**
     * 功能说明： HTTPS协议使用的私钥，不启用证书则无需输入。取值范围：PEM编码格式。初次配置证书时必传。
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    

    public HttpInfoRequestBody withHttp2(Integer http2) {
        this.http2 = http2;
        return this;
    }

    


    /**
     * 是否使用HTTP2.0。（1：是，0：否。）
     * @return http2
     */
    public Integer getHttp2() {
        return http2;
    }

    public void setHttp2(Integer http2) {
        this.http2 = http2;
    }

    

    public HttpInfoRequestBody withCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    


    /**
     * 证书类型。1：代表华为云托管证书；0：表示自有证书。 默认值0。
     * @return certificateType
     */
    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    

    public HttpInfoRequestBody withForceRedirectConfig(ForceRedirect forceRedirectConfig) {
        this.forceRedirectConfig = forceRedirectConfig;
        return this;
    }

    public HttpInfoRequestBody withForceRedirectConfig(Consumer<ForceRedirect> forceRedirectConfigSetter) {
        if(this.forceRedirectConfig == null ){
            this.forceRedirectConfig = new ForceRedirect();
            forceRedirectConfigSetter.accept(this.forceRedirectConfig);
        }
        
        return this;
    }


    /**
     * Get forceRedirectConfig
     * @return forceRedirectConfig
     */
    public ForceRedirect getForceRedirectConfig() {
        return forceRedirectConfig;
    }

    public void setForceRedirectConfig(ForceRedirect forceRedirectConfig) {
        this.forceRedirectConfig = forceRedirectConfig;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HttpInfoRequestBody httpInfoRequestBody = (HttpInfoRequestBody) o;
        return Objects.equals(this.certName, httpInfoRequestBody.certName) &&
            Objects.equals(this.httpsStatus, httpInfoRequestBody.httpsStatus) &&
            Objects.equals(this.certificate, httpInfoRequestBody.certificate) &&
            Objects.equals(this.privateKey, httpInfoRequestBody.privateKey) &&
            Objects.equals(this.http2, httpInfoRequestBody.http2) &&
            Objects.equals(this.certificateType, httpInfoRequestBody.certificateType) &&
            Objects.equals(this.forceRedirectConfig, httpInfoRequestBody.forceRedirectConfig);
    }
    @Override
    public int hashCode() {
        return Objects.hash(certName, httpsStatus, certificate, privateKey, http2, certificateType, forceRedirectConfig);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpInfoRequestBody {\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    httpsStatus: ").append(toIndentedString(httpsStatus)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    http2: ").append(toIndentedString(http2)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
        sb.append("    forceRedirectConfig: ").append(toIndentedString(forceRedirectConfig)).append("\n");
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

