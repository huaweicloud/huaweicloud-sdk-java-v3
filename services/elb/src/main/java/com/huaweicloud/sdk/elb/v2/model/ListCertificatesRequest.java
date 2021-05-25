package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListCertificatesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_reverse")
    
    private String pageReverse;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_key")
    
    private String privateKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="certificate")
    
    private String certificate;

    public ListCertificatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页返回的个数。 取值范围：0~intmax。
     * minimum: 0
     * maximum: 65534
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListCertificatesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * 分页查询起始的证书id，为空时为查询第一页。 仅当和limit一起使用时生效
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public ListCertificatesRequest withPageReverse(String pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    


    /**
     * 分页的顺序，true表示从后往前分页，false表示从前往后分页，默认为false。 仅当和limit一起使用时生效。
     * @return pageReverse
     */
    public String getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(String pageReverse) {
        this.pageReverse = pageReverse;
    }

    

    public ListCertificatesRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * SSL证书ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ListCertificatesRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * SSL证书的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListCertificatesRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 证书描述SSL证书描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ListCertificatesRequest withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * SSL证书的类型。默认值：server；取值范围：server：服务端证书；client：客户端证书；
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ListCertificatesRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 服务端证书所签的域名。默认值：null；取值范围：普通域名由若干字符串组成，总长度为0-100，字符串间以\".\"分割，单个字符串长度不超过63个字符，只能包含英文字母、数字或\"-\"，且必须以字母或数字开头和结尾。泛域名在普通域名的基础上仅允许首字母为\"*\"。该字段仅type为server时有效。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    

    public ListCertificatesRequest withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    


    /**
     * PEM格式的服务端私有密钥。
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    

    public ListCertificatesRequest withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    


    /**
     * PEM格式的服务端公有密钥或者用于认证客户端证书的CA证书，由type字段区分。
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
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
        ListCertificatesRequest listCertificatesRequest = (ListCertificatesRequest) o;
        return Objects.equals(this.limit, listCertificatesRequest.limit) &&
            Objects.equals(this.marker, listCertificatesRequest.marker) &&
            Objects.equals(this.pageReverse, listCertificatesRequest.pageReverse) &&
            Objects.equals(this.id, listCertificatesRequest.id) &&
            Objects.equals(this.name, listCertificatesRequest.name) &&
            Objects.equals(this.description, listCertificatesRequest.description) &&
            Objects.equals(this.type, listCertificatesRequest.type) &&
            Objects.equals(this.domain, listCertificatesRequest.domain) &&
            Objects.equals(this.privateKey, listCertificatesRequest.privateKey) &&
            Objects.equals(this.certificate, listCertificatesRequest.certificate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, pageReverse, id, name, description, type, domain, privateKey, certificate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificatesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

