package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UrlDomainsResp
 */
public class UrlDomainsResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cname_status")
    
    private Integer cnameStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_id")
    
    private String sslId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ssl_name")
    
    private String sslName;

    public UrlDomainsResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 域名编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UrlDomainsResp withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 访问域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public UrlDomainsResp withCnameStatus(Integer cnameStatus) {
        this.cnameStatus = cnameStatus;
        return this;
    }

    


    /**
     * 域名cname状态： - 1：未解析 - 2：解析中 - 3：解析成功 - 4：解析失败
     * @return cnameStatus
     */
    public Integer getCnameStatus() {
        return cnameStatus;
    }

    public void setCnameStatus(Integer cnameStatus) {
        this.cnameStatus = cnameStatus;
    }

    public UrlDomainsResp withSslId(String sslId) {
        this.sslId = sslId;
        return this;
    }

    


    /**
     * SSL证书编号
     * @return sslId
     */
    public String getSslId() {
        return sslId;
    }

    public void setSslId(String sslId) {
        this.sslId = sslId;
    }

    public UrlDomainsResp withSslName(String sslName) {
        this.sslName = sslName;
        return this;
    }

    


    /**
     * SSL证书名称
     * @return sslName
     */
    public String getSslName() {
        return sslName;
    }

    public void setSslName(String sslName) {
        this.sslName = sslName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UrlDomainsResp urlDomainsResp = (UrlDomainsResp) o;
        return Objects.equals(this.id, urlDomainsResp.id) &&
            Objects.equals(this.domain, urlDomainsResp.domain) &&
            Objects.equals(this.cnameStatus, urlDomainsResp.cnameStatus) &&
            Objects.equals(this.sslId, urlDomainsResp.sslId) &&
            Objects.equals(this.sslName, urlDomainsResp.sslName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, domain, cnameStatus, sslId, sslName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlDomainsResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    cnameStatus: ").append(toIndentedString(cnameStatus)).append("\n");
        sb.append("    sslId: ").append(toIndentedString(sslId)).append("\n");
        sb.append("    sslName: ").append(toIndentedString(sslName)).append("\n");
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

