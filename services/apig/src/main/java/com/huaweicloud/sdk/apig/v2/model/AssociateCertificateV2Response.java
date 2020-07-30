package com.huaweicloud.sdk.apig.v2.model;




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
public class AssociateCertificateV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_name")
    
    private String sslName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url_domain")
    
    private String urlDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_id")
    
    private String sslId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

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
     * 解析状态值
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return Objects.equals(this.sslName, associateCertificateV2Response.sslName) &&
            Objects.equals(this.urlDomain, associateCertificateV2Response.urlDomain) &&
            Objects.equals(this.sslId, associateCertificateV2Response.sslId) &&
            Objects.equals(this.id, associateCertificateV2Response.id) &&
            Objects.equals(this.status, associateCertificateV2Response.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sslName, urlDomain, sslId, id, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateCertificateV2Response {\n");
        sb.append("    sslName: ").append(toIndentedString(sslName)).append("\n");
        sb.append("    urlDomain: ").append(toIndentedString(urlDomain)).append("\n");
        sb.append("    sslId: ").append(toIndentedString(sslId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

