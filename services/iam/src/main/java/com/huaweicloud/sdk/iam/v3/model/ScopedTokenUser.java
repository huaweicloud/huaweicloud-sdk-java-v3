package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ScopedTokenUser {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private TokenDomainResult domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-FEDERATION")

    private TokenUserOsfederation osFederation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_expires_at")

    private String passwordExpiresAt;

    public ScopedTokenUser withDomain(TokenDomainResult domain) {
        this.domain = domain;
        return this;
    }

    public ScopedTokenUser withDomain(Consumer<TokenDomainResult> domainSetter) {
        if (this.domain == null) {
            this.domain = new TokenDomainResult();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    /**
     * Get domain
     * @return domain
     */
    public TokenDomainResult getDomain() {
        return domain;
    }

    public void setDomain(TokenDomainResult domain) {
        this.domain = domain;
    }

    public ScopedTokenUser withOsFederation(TokenUserOsfederation osFederation) {
        this.osFederation = osFederation;
        return this;
    }

    public ScopedTokenUser withOsFederation(Consumer<TokenUserOsfederation> osFederationSetter) {
        if (this.osFederation == null) {
            this.osFederation = new TokenUserOsfederation();
            osFederationSetter.accept(this.osFederation);
        }

        return this;
    }

    /**
     * Get osFederation
     * @return osFederation
     */
    public TokenUserOsfederation getOsFederation() {
        return osFederation;
    }

    public void setOsFederation(TokenUserOsfederation osFederation) {
        this.osFederation = osFederation;
    }

    public ScopedTokenUser withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScopedTokenUser withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScopedTokenUser withPasswordExpiresAt(String passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
        return this;
    }

    /**
     * 密码过期时间（UTC时间），“”表示密码不过期。
     * @return passwordExpiresAt
     */
    public String getPasswordExpiresAt() {
        return passwordExpiresAt;
    }

    public void setPasswordExpiresAt(String passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScopedTokenUser scopedTokenUser = (ScopedTokenUser) o;
        return Objects.equals(this.domain, scopedTokenUser.domain)
            && Objects.equals(this.osFederation, scopedTokenUser.osFederation)
            && Objects.equals(this.id, scopedTokenUser.id) && Objects.equals(this.name, scopedTokenUser.name)
            && Objects.equals(this.passwordExpiresAt, scopedTokenUser.passwordExpiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, osFederation, id, name, passwordExpiresAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScopedTokenUser {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    osFederation: ").append(toIndentedString(osFederation)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    passwordExpiresAt: ").append(toIndentedString(passwordExpiresAt)).append("\n");
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
