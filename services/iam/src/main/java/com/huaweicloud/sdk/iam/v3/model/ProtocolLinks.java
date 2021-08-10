package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class ProtocolLinks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_provider")

    private String identityProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self")

    private String self;

    public ProtocolLinks withIdentityProvider(String identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }

    /** 身份提供商的资源链接地址。
     * 
     * @return identityProvider */
    public String getIdentityProvider() {
        return identityProvider;
    }

    public void setIdentityProvider(String identityProvider) {
        this.identityProvider = identityProvider;
    }

    public ProtocolLinks withSelf(String self) {
        this.self = self;
        return this;
    }

    /** 资源链接地址。
     * 
     * @return self */
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtocolLinks protocolLinks = (ProtocolLinks) o;
        return Objects.equals(this.identityProvider, protocolLinks.identityProvider)
            && Objects.equals(this.self, protocolLinks.self);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityProvider, self);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtocolLinks {\n");
        sb.append("    identityProvider: ").append(toIndentedString(identityProvider)).append("\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
