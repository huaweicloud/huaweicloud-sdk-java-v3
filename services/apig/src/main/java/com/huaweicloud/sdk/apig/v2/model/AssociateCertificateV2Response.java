package com.huaweicloud.sdk.apig.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.UrlDomainBaseInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class AssociateCertificateV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url_domain")
    
    private String urlDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_ssl_version")
    
    private String minSslVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_name")
    
    private String sslName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_id")
    
    private String sslId;

    public AssociateCertificateV2Response withUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
        return this;
    }

    


    /**
     * 自定义域名
     * @return urlDomain
     */
    public String getUrlDomain() {
        return urlDomain;
    }

    public void setUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
    }

    

    public AssociateCertificateV2Response withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 自定义域名的编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public AssociateCertificateV2Response withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * CNAME解析状态 - 1: 未解析 - 2: 解析中 - 3: 解析成功 - 4: 解析失败
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public AssociateCertificateV2Response withMinSslVersion(String minSslVersion) {
        this.minSslVersion = minSslVersion;
        return this;
    }

    


    /**
     * 支持的最小SSL版本
     * @return minSslVersion
     */
    public String getMinSslVersion() {
        return minSslVersion;
    }

    public void setMinSslVersion(String minSslVersion) {
        this.minSslVersion = minSslVersion;
    }

    

    public AssociateCertificateV2Response withSslName(String sslName) {
        this.sslName = sslName;
        return this;
    }

    


    /**
     * 证书的名称
     * @return sslName
     */
    public String getSslName() {
        return sslName;
    }

    public void setSslName(String sslName) {
        this.sslName = sslName;
    }

    

    public AssociateCertificateV2Response withSslId(String sslId) {
        this.sslId = sslId;
        return this;
    }

    


    /**
     * 证书的编号
     * @return sslId
     */
    public String getSslId() {
        return sslId;
    }

    public void setSslId(String sslId) {
        this.sslId = sslId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateCertificateV2Response associateCertificateV2Response = (AssociateCertificateV2Response) o;
        return Objects.equals(this.urlDomain, associateCertificateV2Response.urlDomain) &&
            Objects.equals(this.id, associateCertificateV2Response.id) &&
            Objects.equals(this.status, associateCertificateV2Response.status) &&
            Objects.equals(this.minSslVersion, associateCertificateV2Response.minSslVersion) &&
            Objects.equals(this.sslName, associateCertificateV2Response.sslName) &&
            Objects.equals(this.sslId, associateCertificateV2Response.sslId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(urlDomain, id, status, minSslVersion, sslName, sslId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateCertificateV2Response {\n");
        sb.append("    urlDomain: ").append(toIndentedString(urlDomain)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    minSslVersion: ").append(toIndentedString(minSslVersion)).append("\n");
        sb.append("    sslName: ").append(toIndentedString(sslName)).append("\n");
        sb.append("    sslId: ").append(toIndentedString(sslId)).append("\n");
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

