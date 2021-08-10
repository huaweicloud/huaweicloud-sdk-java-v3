package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UrlDomainBaseInfo */
public class UrlDomainBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_domain")

    private String urlDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ssl_version")

    private String minSslVersion;

    public UrlDomainBaseInfo withUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
        return this;
    }

    /** 自定义域名
     * 
     * @return urlDomain */
    public String getUrlDomain() {
        return urlDomain;
    }

    public void setUrlDomain(String urlDomain) {
        this.urlDomain = urlDomain;
    }

    public UrlDomainBaseInfo withId(String id) {
        this.id = id;
        return this;
    }

    /** 自定义域名的编号
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UrlDomainBaseInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** CNAME解析状态 - 1: 未解析 - 2: 解析中 - 3: 解析成功 - 4: 解析失败
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UrlDomainBaseInfo withMinSslVersion(String minSslVersion) {
        this.minSslVersion = minSslVersion;
        return this;
    }

    /** 支持的最小SSL版本
     * 
     * @return minSslVersion */
    public String getMinSslVersion() {
        return minSslVersion;
    }

    public void setMinSslVersion(String minSslVersion) {
        this.minSslVersion = minSslVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UrlDomainBaseInfo urlDomainBaseInfo = (UrlDomainBaseInfo) o;
        return Objects.equals(this.urlDomain, urlDomainBaseInfo.urlDomain)
            && Objects.equals(this.id, urlDomainBaseInfo.id) && Objects.equals(this.status, urlDomainBaseInfo.status)
            && Objects.equals(this.minSslVersion, urlDomainBaseInfo.minSslVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urlDomain, id, status, minSslVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlDomainBaseInfo {\n");
        sb.append("    urlDomain: ").append(toIndentedString(urlDomain)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    minSslVersion: ").append(toIndentedString(minSslVersion)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
