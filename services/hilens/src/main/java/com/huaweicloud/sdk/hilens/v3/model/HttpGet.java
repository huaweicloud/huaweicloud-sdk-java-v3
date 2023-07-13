package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HttpGet
 */
public class HttpGet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheme")

    private String scheme;

    public HttpGet withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 请求的主机地址，默认为容器IP
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public HttpGet withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 必须要以/开头，构造结果为：协议类型://主机地址:端口路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public HttpGet withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 探测的http端口，1到65535之间的整数
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public HttpGet withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * 协议类型，HTTP或HTTPS，默认HTTP
     * @return scheme
     */
    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpGet that = (HttpGet) obj;
        return Objects.equals(this.host, that.host) && Objects.equals(this.path, that.path)
            && Objects.equals(this.port, that.port) && Objects.equals(this.scheme, that.scheme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, path, port, scheme);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpGet {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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
