package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateOAuthResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization")

    private AuthorizationVI authorization;

    public CreateOAuthResponse withAuthorization(AuthorizationVI authorization) {
        this.authorization = authorization;
        return this;
    }

    public CreateOAuthResponse withAuthorization(Consumer<AuthorizationVI> authorizationSetter) {
        if (this.authorization == null) {
            this.authorization = new AuthorizationVI();
            authorizationSetter.accept(this.authorization);
        }

        return this;
    }

    /**
     * Get authorization
     * @return authorization
     */
    public AuthorizationVI getAuthorization() {
        return authorization;
    }

    public void setAuthorization(AuthorizationVI authorization) {
        this.authorization = authorization;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateOAuthResponse createOAuthResponse = (CreateOAuthResponse) o;
        return Objects.equals(this.authorization, createOAuthResponse.authorization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOAuthResponse {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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
