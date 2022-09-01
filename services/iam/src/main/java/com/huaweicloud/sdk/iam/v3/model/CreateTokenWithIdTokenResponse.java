package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateTokenWithIdTokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    @JacksonXmlProperty(localName = "token")

    private ScopedTokenInfo token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Subject-Token")

    @JacksonXmlProperty(localName = "X-Subject-Token")

    private String xSubjectToken;

    public CreateTokenWithIdTokenResponse withToken(ScopedTokenInfo token) {
        this.token = token;
        return this;
    }

    public CreateTokenWithIdTokenResponse withToken(Consumer<ScopedTokenInfo> tokenSetter) {
        if (this.token == null) {
            this.token = new ScopedTokenInfo();
            tokenSetter.accept(this.token);
        }

        return this;
    }

    /**
     * Get token
     * @return token
     */
    public ScopedTokenInfo getToken() {
        return token;
    }

    public void setToken(ScopedTokenInfo token) {
        this.token = token;
    }

    public CreateTokenWithIdTokenResponse withXSubjectToken(String xSubjectToken) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTokenWithIdTokenResponse createTokenWithIdTokenResponse = (CreateTokenWithIdTokenResponse) o;
        return Objects.equals(this.token, createTokenWithIdTokenResponse.token)
            && Objects.equals(this.xSubjectToken, createTokenWithIdTokenResponse.xSubjectToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, xSubjectToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTokenWithIdTokenResponse {\n");
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
