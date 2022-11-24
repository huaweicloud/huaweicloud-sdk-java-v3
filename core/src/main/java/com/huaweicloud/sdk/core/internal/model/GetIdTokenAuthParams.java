package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.function.Consumer;

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

    public GetIdTokenIdScopeBody getScope() {
        return scope;
    }

    public void setScope(GetIdTokenIdScopeBody scope) {
        this.scope = scope;
    }
}
