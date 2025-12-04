package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网格数据面代理配置。
 */
public class ProxyConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includeIPRanges")

    private String includeIPRanges;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excludeIPRanges")

    private String excludeIPRanges;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excludeOutboundPorts")

    private String excludeOutboundPorts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excludeInboundPorts")

    private String excludeInboundPorts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includeOutboundPorts")

    private String includeOutboundPorts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includeInboundPorts")

    private String includeInboundPorts;

    public ProxyConfig withIncludeIPRanges(String includeIPRanges) {
        this.includeIPRanges = includeIPRanges;
        return this;
    }

    /**
     * 拦截对外访问的地址范围，以半角英文逗号（,）分隔的IP网段
     * @return includeIPRanges
     */
    public String getIncludeIPRanges() {
        return includeIPRanges;
    }

    public void setIncludeIPRanges(String includeIPRanges) {
        this.includeIPRanges = includeIPRanges;
    }

    public ProxyConfig withExcludeIPRanges(String excludeIPRanges) {
        this.excludeIPRanges = excludeIPRanges;
        return this;
    }

    /**
     * 排除拦截对外访问的地址范围，以半角英文逗号（,）分隔的IP网段
     * @return excludeIPRanges
     */
    public String getExcludeIPRanges() {
        return excludeIPRanges;
    }

    public void setExcludeIPRanges(String excludeIPRanges) {
        this.excludeIPRanges = excludeIPRanges;
    }

    public ProxyConfig withExcludeOutboundPorts(String excludeOutboundPorts) {
        this.excludeOutboundPorts = excludeOutboundPorts;
        return this;
    }

    /**
     * 排除拦截对外访问端口，以半角英文逗号（,）分隔的出站端口列表
     * @return excludeOutboundPorts
     */
    public String getExcludeOutboundPorts() {
        return excludeOutboundPorts;
    }

    public void setExcludeOutboundPorts(String excludeOutboundPorts) {
        this.excludeOutboundPorts = excludeOutboundPorts;
    }

    public ProxyConfig withExcludeInboundPorts(String excludeInboundPorts) {
        this.excludeInboundPorts = excludeInboundPorts;
        return this;
    }

    /**
     * 排除拦截访问服务的端口，以半角英文逗号（,）分隔的入站端口列表
     * @return excludeInboundPorts
     */
    public String getExcludeInboundPorts() {
        return excludeInboundPorts;
    }

    public void setExcludeInboundPorts(String excludeInboundPorts) {
        this.excludeInboundPorts = excludeInboundPorts;
    }

    public ProxyConfig withIncludeOutboundPorts(String includeOutboundPorts) {
        this.includeOutboundPorts = includeOutboundPorts;
        return this;
    }

    /**
     * 拦截对外访问端口，以半角英文逗号（,）分隔的出站端口列表
     * @return includeOutboundPorts
     */
    public String getIncludeOutboundPorts() {
        return includeOutboundPorts;
    }

    public void setIncludeOutboundPorts(String includeOutboundPorts) {
        this.includeOutboundPorts = includeOutboundPorts;
    }

    public ProxyConfig withIncludeInboundPorts(String includeInboundPorts) {
        this.includeInboundPorts = includeInboundPorts;
        return this;
    }

    /**
     * 拦截访问服务的端口，以半角英文逗号（,）分隔的入站端口列表
     * @return includeInboundPorts
     */
    public String getIncludeInboundPorts() {
        return includeInboundPorts;
    }

    public void setIncludeInboundPorts(String includeInboundPorts) {
        this.includeInboundPorts = includeInboundPorts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyConfig that = (ProxyConfig) obj;
        return Objects.equals(this.includeIPRanges, that.includeIPRanges)
            && Objects.equals(this.excludeIPRanges, that.excludeIPRanges)
            && Objects.equals(this.excludeOutboundPorts, that.excludeOutboundPorts)
            && Objects.equals(this.excludeInboundPorts, that.excludeInboundPorts)
            && Objects.equals(this.includeOutboundPorts, that.includeOutboundPorts)
            && Objects.equals(this.includeInboundPorts, that.includeInboundPorts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includeIPRanges,
            excludeIPRanges,
            excludeOutboundPorts,
            excludeInboundPorts,
            includeOutboundPorts,
            includeInboundPorts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyConfig {\n");
        sb.append("    includeIPRanges: ").append(toIndentedString(includeIPRanges)).append("\n");
        sb.append("    excludeIPRanges: ").append(toIndentedString(excludeIPRanges)).append("\n");
        sb.append("    excludeOutboundPorts: ").append(toIndentedString(excludeOutboundPorts)).append("\n");
        sb.append("    excludeInboundPorts: ").append(toIndentedString(excludeInboundPorts)).append("\n");
        sb.append("    includeOutboundPorts: ").append(toIndentedString(includeOutboundPorts)).append("\n");
        sb.append("    includeInboundPorts: ").append(toIndentedString(includeInboundPorts)).append("\n");
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
