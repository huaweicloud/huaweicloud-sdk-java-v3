package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 高级回源信息源站配置。
 */
public class BackSources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources_type")

    private String sourcesType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_or_domain")

    private String ipOrDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_type")

    private String obsBucketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_port")

    private Integer httpPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_port")

    private Integer httpsPort;

    public BackSources withSourcesType(String sourcesType) {
        this.sourcesType = sourcesType;
        return this;
    }

    /**
     * 源站类型, ipaddr：源站IP，domain：源站域名，obs_bucket：OBS桶域名。
     * @return sourcesType
     */
    public String getSourcesType() {
        return sourcesType;
    }

    public void setSourcesType(String sourcesType) {
        this.sourcesType = sourcesType;
    }

    public BackSources withIpOrDomain(String ipOrDomain) {
        this.ipOrDomain = ipOrDomain;
        return this;
    }

    /**
     * 源站IP或者域名。
     * @return ipOrDomain
     */
    public String getIpOrDomain() {
        return ipOrDomain;
    }

    public void setIpOrDomain(String ipOrDomain) {
        this.ipOrDomain = ipOrDomain;
    }

    public BackSources withObsBucketType(String obsBucketType) {
        this.obsBucketType = obsBucketType;
        return this;
    }

    /**
     * obs桶类型， “private”： 私有桶， “public”： 公有桶。
     * @return obsBucketType
     */
    public String getObsBucketType() {
        return obsBucketType;
    }

    public void setObsBucketType(String obsBucketType) {
        this.obsBucketType = obsBucketType;
    }

    public BackSources withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * HTTP端口，取值范围：1-65535。
     * @return httpPort
     */
    public Integer getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }

    public BackSources withHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
        return this;
    }

    /**
     * HTTPS端口，取值范围：1-65535。
     * @return httpsPort
     */
    public Integer getHttpsPort() {
        return httpsPort;
    }

    public void setHttpsPort(Integer httpsPort) {
        this.httpsPort = httpsPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackSources that = (BackSources) obj;
        return Objects.equals(this.sourcesType, that.sourcesType) && Objects.equals(this.ipOrDomain, that.ipOrDomain)
            && Objects.equals(this.obsBucketType, that.obsBucketType) && Objects.equals(this.httpPort, that.httpPort)
            && Objects.equals(this.httpsPort, that.httpsPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourcesType, ipOrDomain, obsBucketType, httpPort, httpsPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackSources {\n");
        sb.append("    sourcesType: ").append(toIndentedString(sourcesType)).append("\n");
        sb.append("    ipOrDomain: ").append(toIndentedString(ipOrDomain)).append("\n");
        sb.append("    obsBucketType: ").append(toIndentedString(obsBucketType)).append("\n");
        sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
        sb.append("    httpsPort: ").append(toIndentedString(httpsPort)).append("\n");
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
