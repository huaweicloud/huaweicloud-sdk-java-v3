package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class TokenAuth {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity")

    private TokenAuthIdentity identity;

    public TokenAuth withIdentity(TokenAuthIdentity identity) {
        this.identity = identity;
        return this;
    }

    public TokenAuth withIdentity(Consumer<TokenAuthIdentity> identitySetter) {
        if (this.identity == null) {
            this.identity = new TokenAuthIdentity();
            identitySetter.accept(this.identity);
        }

        return this;
    }

    /**
     * Get identity
     * @return identity
     */
    public TokenAuthIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(TokenAuthIdentity identity) {
        this.identity = identity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenAuth tokenAuth = (TokenAuth) o;
        return Objects.equals(this.identity, tokenAuth.identity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenAuth {\n");
        sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
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
