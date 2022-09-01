package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 监听器HTTP扩展头部对象。
 */
public class InsertHeader {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-ELB-IP")

    @JacksonXmlProperty(localName = "X-Forwarded-ELB-IP")

    private Boolean xForwardedELBIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Host")

    @JacksonXmlProperty(localName = "X-Forwarded-Host")

    private Boolean xForwardedHost;

    public InsertHeader withXForwardedELBIP(Boolean xForwardedELBIP) {
        this.xForwardedELBIP = xForwardedELBIP;
        return this;
    }

    /**
     * 负载均衡器弹性公网IP透传开关。
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

    public InsertHeader withXForwardedHost(Boolean xForwardedHost) {
        this.xForwardedHost = xForwardedHost;
        return this;
    }

    /**
     * X-Forwarded-Host设为true可以将客户请求头的第一个X-Forwarded-Host设置为请求头的Host带到后端云服务器。
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InsertHeader insertHeader = (InsertHeader) o;
        return Objects.equals(this.xForwardedELBIP, insertHeader.xForwardedELBIP)
            && Objects.equals(this.xForwardedHost, insertHeader.xForwardedHost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xForwardedELBIP, xForwardedHost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsertHeader {\n");
        sb.append("    xForwardedELBIP: ").append(toIndentedString(xForwardedELBIP)).append("\n");
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
