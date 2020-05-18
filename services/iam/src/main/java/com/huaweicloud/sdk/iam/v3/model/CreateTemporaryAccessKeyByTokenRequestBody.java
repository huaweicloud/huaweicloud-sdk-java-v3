package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.TokenAuth;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class CreateTemporaryAccessKeyByTokenRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth")
    
    private TokenAuth auth = null;

    public CreateTemporaryAccessKeyByTokenRequestBody withAuth(TokenAuth auth) {
        this.auth = auth;
        return this;
    }

    public CreateTemporaryAccessKeyByTokenRequestBody withAuth(Consumer<TokenAuth> authSetter) {
        if(this.auth == null ){
            this.auth = new TokenAuth();
        }
        authSetter.accept(this.auth);
        return this;
    }


    /**
     * Get auth
     * @return auth
     */
    public TokenAuth getAuth() {
        return auth;
    }

    public void setAuth(TokenAuth auth) {
        this.auth = auth;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTemporaryAccessKeyByTokenRequestBody createTemporaryAccessKeyByTokenRequestBody = (CreateTemporaryAccessKeyByTokenRequestBody) o;
        return Objects.equals(this.auth, createTemporaryAccessKeyByTokenRequestBody.auth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(auth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemporaryAccessKeyByTokenRequestBody {\n");
            sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
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

