package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SetPrivateZoneProxyPatternRequestBody
 */
public class SetPrivateZoneProxyPatternRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_pattern")

    private String proxyPattern;

    public SetPrivateZoneProxyPatternRequestBody withProxyPattern(String proxyPattern) {
        this.proxyPattern = proxyPattern;
        return this;
    }

    /**
     * 内网域名的子域名递归解析代理模式。  取值范围：  AUTHORITY：当前域名未开启递归解析代理 RECURSIVE：当前域名已开启递归解析代理
     * @return proxyPattern
     */
    public String getProxyPattern() {
        return proxyPattern;
    }

    public void setProxyPattern(String proxyPattern) {
        this.proxyPattern = proxyPattern;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetPrivateZoneProxyPatternRequestBody that = (SetPrivateZoneProxyPatternRequestBody) obj;
        return Objects.equals(this.proxyPattern, that.proxyPattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proxyPattern);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetPrivateZoneProxyPatternRequestBody {\n");
        sb.append("    proxyPattern: ").append(toIndentedString(proxyPattern)).append("\n");
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
