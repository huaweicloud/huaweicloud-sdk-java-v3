package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class AgencyTokenAuth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity")

    private AgencyTokenIdentity identity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private AgencyTokenScope scope;

    public AgencyTokenAuth withIdentity(AgencyTokenIdentity identity) {
        this.identity = identity;
        return this;
    }

    public AgencyTokenAuth withIdentity(Consumer<AgencyTokenIdentity> identitySetter) {
        if (this.identity == null) {
            this.identity = new AgencyTokenIdentity();
            identitySetter.accept(this.identity);
        }

        return this;
    }

    /** Get identity
     * 
     * @return identity */
    public AgencyTokenIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(AgencyTokenIdentity identity) {
        this.identity = identity;
    }

    public AgencyTokenAuth withScope(AgencyTokenScope scope) {
        this.scope = scope;
        return this;
    }

    public AgencyTokenAuth withScope(Consumer<AgencyTokenScope> scopeSetter) {
        if (this.scope == null) {
            this.scope = new AgencyTokenScope();
            scopeSetter.accept(this.scope);
        }

        return this;
    }

    /** Get scope
     * 
     * @return scope */
    public AgencyTokenScope getScope() {
        return scope;
    }

    public void setScope(AgencyTokenScope scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyTokenAuth agencyTokenAuth = (AgencyTokenAuth) o;
        return Objects.equals(this.identity, agencyTokenAuth.identity)
            && Objects.equals(this.scope, agencyTokenAuth.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity, scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyTokenAuth {\n");
        sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
