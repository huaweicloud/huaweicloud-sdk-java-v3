package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateUnscopedTokenWithIdTokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private UnscopedTokenInfo token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Subject-Token")

    private String xSubjectToken;

    public CreateUnscopedTokenWithIdTokenResponse withToken(UnscopedTokenInfo token) {
        this.token = token;
        return this;
    }

    public CreateUnscopedTokenWithIdTokenResponse withToken(Consumer<UnscopedTokenInfo> tokenSetter) {
        if (this.token == null) {
            this.token = new UnscopedTokenInfo();
            tokenSetter.accept(this.token);
        }

        return this;
    }

    /**
     * Get token
     * @return token
     */
    public UnscopedTokenInfo getToken() {
        return token;
    }

    public void setToken(UnscopedTokenInfo token) {
        this.token = token;
    }

    public CreateUnscopedTokenWithIdTokenResponse withXSubjectToken(String xSubjectToken) {
        this.xSubjectToken = xSubjectToken;
        return this;
    }

    /**
     * Get xSubjectToken
     * @return xSubjectToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Subject-Token")
    public String getXSubjectToken() {
        return xSubjectToken;
    }

    public void setXSubjectToken(String xSubjectToken) {
        this.xSubjectToken = xSubjectToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUnscopedTokenWithIdTokenResponse that = (CreateUnscopedTokenWithIdTokenResponse) obj;
        return Objects.equals(this.token, that.token) && Objects.equals(this.xSubjectToken, that.xSubjectToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, xSubjectToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUnscopedTokenWithIdTokenResponse {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    xSubjectToken: ").append(toIndentedString(xSubjectToken)).append("\n");
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
