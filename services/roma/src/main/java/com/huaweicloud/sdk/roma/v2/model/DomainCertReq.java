package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DomainCertReq
 */
public class DomainCertReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cert_content")
    
    private String certContent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_key")
    
    private String privateKey;

    public DomainCertReq withCertContent(String certContent) {
        this.certContent = certContent;
        return this;
    }

    


    /**
     * 证书内容
     * @return certContent
     */
    public String getCertContent() {
        return certContent;
    }

    public void setCertContent(String certContent) {
        this.certContent = certContent;
    }

    

    public DomainCertReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 证书名称。长度为4 ~ 50位的字符串，字符串由中文、英文字母、数字、下划线组成，且只能以英文或中文开头。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public DomainCertReq withPrivateKey(String privateKey) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DomainCertReq domainCertReq = (DomainCertReq) o;
        return Objects.equals(this.certContent, domainCertReq.certContent) &&
            Objects.equals(this.name, domainCertReq.name) &&
            Objects.equals(this.privateKey, domainCertReq.privateKey);
    }
    @Override
    public int hashCode() {
        return Objects.hash(certContent, name, privateKey);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainCertReq {\n");
        sb.append("    certContent: ").append(toIndentedString(certContent)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

