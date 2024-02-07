package com.huaweicloud.sdk.orgid.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CAS3.0认证成功响应
 */
public class CasServiceResponseAuthenticationSuccess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxyGrantingTicket")

    private String proxyGrantingTicket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxies")

    private List<String> proxies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private CasAuthenticationSuccessAttributes attributes;

    public CasServiceResponseAuthenticationSuccess withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户标识
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public CasServiceResponseAuthenticationSuccess withProxyGrantingTicket(String proxyGrantingTicket) {
        this.proxyGrantingTicket = proxyGrantingTicket;
        return this;
    }

    /**
     * 代理授权凭据
     * @return proxyGrantingTicket
     */
    public String getProxyGrantingTicket() {
        return proxyGrantingTicket;
    }

    public void setProxyGrantingTicket(String proxyGrantingTicket) {
        this.proxyGrantingTicket = proxyGrantingTicket;
    }

    public CasServiceResponseAuthenticationSuccess withProxies(List<String> proxies) {
        this.proxies = proxies;
        return this;
    }

    public CasServiceResponseAuthenticationSuccess addProxiesItem(String proxiesItem) {
        if (this.proxies == null) {
            this.proxies = new ArrayList<>();
        }
        this.proxies.add(proxiesItem);
        return this;
    }

    public CasServiceResponseAuthenticationSuccess withProxies(Consumer<List<String>> proxiesSetter) {
        if (this.proxies == null) {
            this.proxies = new ArrayList<>();
        }
        proxiesSetter.accept(this.proxies);
        return this;
    }

    /**
     * 代理
     * @return proxies
     */
    public List<String> getProxies() {
        return proxies;
    }

    public void setProxies(List<String> proxies) {
        this.proxies = proxies;
    }

    public CasServiceResponseAuthenticationSuccess withAttributes(CasAuthenticationSuccessAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public CasServiceResponseAuthenticationSuccess withAttributes(
        Consumer<CasAuthenticationSuccessAttributes> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new CasAuthenticationSuccessAttributes();
            attributesSetter.accept(this.attributes);
        }

        return this;
    }

    /**
     * Get attributes
     * @return attributes
     */
    public CasAuthenticationSuccessAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(CasAuthenticationSuccessAttributes attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CasServiceResponseAuthenticationSuccess that = (CasServiceResponseAuthenticationSuccess) obj;
        return Objects.equals(this.user, that.user)
            && Objects.equals(this.proxyGrantingTicket, that.proxyGrantingTicket)
            && Objects.equals(this.proxies, that.proxies) && Objects.equals(this.attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, proxyGrantingTicket, proxies, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CasServiceResponseAuthenticationSuccess {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    proxyGrantingTicket: ").append(toIndentedString(proxyGrantingTicket)).append("\n");
        sb.append("    proxies: ").append(toIndentedString(proxies)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
