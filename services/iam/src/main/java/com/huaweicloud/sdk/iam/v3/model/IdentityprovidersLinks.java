package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class IdentityprovidersLinks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self")

    private String self;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocols")

    private String protocols;

    public IdentityprovidersLinks withSelf(String self) {
        this.self = self;
        return this;
    }

    /**
     * 身份提供商的资源链接地址。
     * @return self
     */
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public IdentityprovidersLinks withProtocols(String protocols) {
        this.protocols = protocols;
        return this;
    }

    /**
     * 协议的资源链接地址。
     * @return protocols
     */
    public String getProtocols() {
        return protocols;
    }

    public void setProtocols(String protocols) {
        this.protocols = protocols;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdentityprovidersLinks identityprovidersLinks = (IdentityprovidersLinks) o;
        return Objects.equals(this.self, identityprovidersLinks.self)
            && Objects.equals(this.protocols, identityprovidersLinks.protocols);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, protocols);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityprovidersLinks {\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
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
