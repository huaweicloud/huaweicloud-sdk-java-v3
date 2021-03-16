package com.huaweicloud.sdk.sms.v3.model;




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
public class ShowCertKeyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cert")
    
    private String cert;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_key")
    
    private String privateKey;

    public ShowCertKeyResponse withCert(String cert) {
        this.cert = cert;
        return this;
    }

    


    /**
     * 证书
     * @return cert
     */
    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    

    public ShowCertKeyResponse withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    


    /**
     * 私钥
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCertKeyResponse showCertKeyResponse = (ShowCertKeyResponse) o;
        return Objects.equals(this.cert, showCertKeyResponse.cert) &&
            Objects.equals(this.privateKey, showCertKeyResponse.privateKey);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cert, privateKey);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertKeyResponse {\n");
        sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

