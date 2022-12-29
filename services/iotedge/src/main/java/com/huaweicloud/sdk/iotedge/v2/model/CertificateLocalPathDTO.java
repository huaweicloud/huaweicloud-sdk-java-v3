package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 证书文件的本地存储路径
 */
public class CertificateLocalPathDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cert_path")
    
    
    private String certPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_path")
    
    
    private String keyPath;

    public CertificateLocalPathDTO withCertPath(String certPath) {
        this.certPath = certPath;
        return this;
    }

    


    /**
     * 节点数字证书的本地存储路径。
     * @return certPath
     */
    public String getCertPath() {
        return certPath;
    }

    public void setCertPath(String certPath) {
        this.certPath = certPath;
    }

    

    public CertificateLocalPathDTO withKeyPath(String keyPath) {
        this.keyPath = keyPath;
        return this;
    }

    


    /**
     * 证书私钥的本地存储路径。
     * @return keyPath
     */
    public String getKeyPath() {
        return keyPath;
    }

    public void setKeyPath(String keyPath) {
        this.keyPath = keyPath;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CertificateLocalPathDTO certificateLocalPathDTO = (CertificateLocalPathDTO) o;
        return Objects.equals(this.certPath, certificateLocalPathDTO.certPath) &&
            Objects.equals(this.keyPath, certificateLocalPathDTO.keyPath);
    }
    @Override
    public int hashCode() {
        return Objects.hash(certPath, keyPath);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateLocalPathDTO {\n");
        sb.append("    certPath: ").append(toIndentedString(certPath)).append("\n");
        sb.append("    keyPath: ").append(toIndentedString(keyPath)).append("\n");
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

