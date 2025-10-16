package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 鉴权对象
 */
public class AuthObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth")

    private AuthObjectAuth auth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private AuthObjectScope scope;

    public AuthObject withAuth(AuthObjectAuth auth) {
        this.auth = auth;
        return this;
    }

    public AuthObject withAuth(Consumer<AuthObjectAuth> authSetter) {
        if (this.auth == null) {
            this.auth = new AuthObjectAuth();
            authSetter.accept(this.auth);
        }

        return this;
    }

    /**
     * Get auth
     * @return auth
     */
    public AuthObjectAuth getAuth() {
        return auth;
    }

    public void setAuth(AuthObjectAuth auth) {
        this.auth = auth;
    }

    public AuthObject withScope(AuthObjectScope scope) {
        this.scope = scope;
        return this;
    }

    public AuthObject withScope(Consumer<AuthObjectScope> scopeSetter) {
        if (this.scope == null) {
            this.scope = new AuthObjectScope();
            scopeSetter.accept(this.scope);
        }

        return this;
    }

    /**
     * Get scope
     * @return scope
     */
    public AuthObjectScope getScope() {
        return scope;
    }

    public void setScope(AuthObjectScope scope) {
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
        AuthObject that = (AuthObject) obj;
        return Objects.equals(this.auth, that.auth) && Objects.equals(this.scope, that.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auth, scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthObject {\n");
        sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
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
