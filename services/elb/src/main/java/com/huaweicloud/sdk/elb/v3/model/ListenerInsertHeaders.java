package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 可选的HTTP头插入，可以将从负载均衡器到后端云服务器的路径中需要被后端云服务器用到的信息写入HTTP中，随报文传递到后端云服务器使。例如可通过X-Forwarded-ELB-IP开关，将负载均衡器的弹性公网IP传到后端云服务器。
 */
public class ListenerInsertHeaders {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-ELB-IP")

    private Boolean xForwardedELBIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Port")

    private Boolean xForwardedPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-For-Port")

    private Boolean xForwardedForPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Host")

    private Boolean xForwardedHost;

    public ListenerInsertHeaders withXForwardedELBIP(Boolean xForwardedELBIP) {
        this.xForwardedELBIP = xForwardedELBIP;
        return this;
    }

    /**
     * X-Forwarded-ELB-IP设为true可以将ELB实例的eip地址从报文的http头中带到后端云服务器。
     * @return xForwardedELBIP
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-ELB-IP")
    public Boolean getXForwardedELBIP() {
        return xForwardedELBIP;
    }

    public void setXForwardedELBIP(Boolean xForwardedELBIP) {
        this.xForwardedELBIP = xForwardedELBIP;
    }

    public ListenerInsertHeaders withXForwardedPort(Boolean xForwardedPort) {
        this.xForwardedPort = xForwardedPort;
        return this;
    }

    /**
     * X-Forwarded-Port设为true可以将ELB实例的监听端口从报文的http头中带到后端云服务器。
     * @return xForwardedPort
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Port")
    public Boolean getXForwardedPort() {
        return xForwardedPort;
    }

    public void setXForwardedPort(Boolean xForwardedPort) {
        this.xForwardedPort = xForwardedPort;
    }

    public ListenerInsertHeaders withXForwardedForPort(Boolean xForwardedForPort) {
        this.xForwardedForPort = xForwardedForPort;
        return this;
    }

    /**
     * X-Forwarded-For-Port设为true可以将客户端的源端口从报文的http头中带到后端云服务器。
     * @return xForwardedForPort
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-For-Port")
    public Boolean getXForwardedForPort() {
        return xForwardedForPort;
    }

    public void setXForwardedForPort(Boolean xForwardedForPort) {
        this.xForwardedForPort = xForwardedForPort;
    }

    public ListenerInsertHeaders withXForwardedHost(Boolean xForwardedHost) {
        this.xForwardedHost = xForwardedHost;
        return this;
    }

    /**
     * X-Forwarded-Host设为true可以将客户请求头的X-Forwarded-Host设置为请求头的Host带到后端云服务器。
     * @return xForwardedHost
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Host")
    public Boolean getXForwardedHost() {
        return xForwardedHost;
    }

    public void setXForwardedHost(Boolean xForwardedHost) {
        this.xForwardedHost = xForwardedHost;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListenerInsertHeaders that = (ListenerInsertHeaders) obj;
        return Objects.equals(this.xForwardedELBIP, that.xForwardedELBIP)
            && Objects.equals(this.xForwardedPort, that.xForwardedPort)
            && Objects.equals(this.xForwardedForPort, that.xForwardedForPort)
            && Objects.equals(this.xForwardedHost, that.xForwardedHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xForwardedELBIP, xForwardedPort, xForwardedForPort, xForwardedHost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListenerInsertHeaders {\n");
        sb.append("    xForwardedELBIP: ").append(toIndentedString(xForwardedELBIP)).append("\n");
        sb.append("    xForwardedPort: ").append(toIndentedString(xForwardedPort)).append("\n");
        sb.append("    xForwardedForPort: ").append(toIndentedString(xForwardedForPort)).append("\n");
        sb.append("    xForwardedHost: ").append(toIndentedString(xForwardedHost)).append("\n");
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
