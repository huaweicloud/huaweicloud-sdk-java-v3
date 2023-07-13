package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PwdAuth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity")

    private PwdIdentity identity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private AuthScope scope;

    public PwdAuth withIdentity(PwdIdentity identity) {
        this.identity = identity;
        return this;
    }

    public PwdAuth withIdentity(Consumer<PwdIdentity> identitySetter) {
        if (this.identity == null) {
            this.identity = new PwdIdentity();
            identitySetter.accept(this.identity);
        }

        return this;
    }

    /**
     * Get identity
     * @return identity
     */
    public PwdIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(PwdIdentity identity) {
        this.identity = identity;
    }

    public PwdAuth withScope(AuthScope scope) {
        this.scope = scope;
        return this;
    }

    public PwdAuth withScope(Consumer<AuthScope> scopeSetter) {
        if (this.scope == null) {
            this.scope = new AuthScope();
            scopeSetter.accept(this.scope);
        }

        return this;
    }

    /**
     * Get scope
     * @return scope
     */
    public AuthScope getScope() {
        return scope;
    }

    public void setScope(AuthScope scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PwdAuth that = (PwdAuth) obj;
        return Objects.equals(this.identity, that.identity) && Objects.equals(this.scope, that.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity, scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PwdAuth {\n");
        sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
