package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求体
 */
public class GetIdTokenRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth")

    private GetIdTokenAuthParams auth;

    public GetIdTokenRequestBody withAuth(GetIdTokenAuthParams auth) {
        this.auth = auth;
        return this;
    }

    public GetIdTokenRequestBody withAuth(Consumer<GetIdTokenAuthParams> authSetter) {
        if (this.auth == null) {
            this.auth = new GetIdTokenAuthParams();
            authSetter.accept(this.auth);
        }

        return this;
    }

    /**
     * Get auth
     * @return auth
     */
    public GetIdTokenAuthParams getAuth() {
        return auth;
    }

    public void setAuth(GetIdTokenAuthParams auth) {
        this.auth = auth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetIdTokenRequestBody that = (GetIdTokenRequestBody) obj;
        return Objects.equals(this.auth, that.auth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetIdTokenRequestBody {\n");
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
