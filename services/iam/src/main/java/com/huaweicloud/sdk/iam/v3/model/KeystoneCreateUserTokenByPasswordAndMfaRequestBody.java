package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class KeystoneCreateUserTokenByPasswordAndMfaRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth")

    private MfaAuth auth;

    public KeystoneCreateUserTokenByPasswordAndMfaRequestBody withAuth(MfaAuth auth) {
        this.auth = auth;
        return this;
    }

    public KeystoneCreateUserTokenByPasswordAndMfaRequestBody withAuth(Consumer<MfaAuth> authSetter) {
        if (this.auth == null) {
            this.auth = new MfaAuth();
            authSetter.accept(this.auth);
        }

        return this;
    }

    /**
     * Get auth
     * @return auth
     */
    public MfaAuth getAuth() {
        return auth;
    }

    public void setAuth(MfaAuth auth) {
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
        KeystoneCreateUserTokenByPasswordAndMfaRequestBody that =
            (KeystoneCreateUserTokenByPasswordAndMfaRequestBody) obj;
        return Objects.equals(this.auth, that.auth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateUserTokenByPasswordAndMfaRequestBody {\n");
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
