package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * auth信息
 */
public class GetIdTokenAuthParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_token")

    private GetIdTokenIdTokenBody idToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private GetIdTokenIdScopeBody scope;

    public GetIdTokenAuthParams withIdToken(GetIdTokenIdTokenBody idToken) {
        this.idToken = idToken;
        return this;
    }

    public GetIdTokenAuthParams withIdToken(Consumer<GetIdTokenIdTokenBody> idTokenSetter) {
        if (this.idToken == null) {
            this.idToken = new GetIdTokenIdTokenBody();
            idTokenSetter.accept(this.idToken);
        }

        return this;
    }

    /**
     * Get idToken
     * @return idToken
     */
    public GetIdTokenIdTokenBody getIdToken() {
        return idToken;
    }

    public void setIdToken(GetIdTokenIdTokenBody idToken) {
        this.idToken = idToken;
    }

    public GetIdTokenAuthParams withScope(GetIdTokenIdScopeBody scope) {
        this.scope = scope;
        return this;
    }

    public GetIdTokenAuthParams withScope(Consumer<GetIdTokenIdScopeBody> scopeSetter) {
        if (this.scope == null) {
            this.scope = new GetIdTokenIdScopeBody();
            scopeSetter.accept(this.scope);
        }

        return this;
    }

    /**
     * Get scope
     * @return scope
     */
    public GetIdTokenIdScopeBody getScope() {
        return scope;
    }

    public void setScope(GetIdTokenIdScopeBody scope) {
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
        GetIdTokenAuthParams getIdTokenAuthParams = (GetIdTokenAuthParams) o;
        return Objects.equals(this.idToken, getIdTokenAuthParams.idToken)
            && Objects.equals(this.scope, getIdTokenAuthParams.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idToken, scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetIdTokenAuthParams {\n");
        sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
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
