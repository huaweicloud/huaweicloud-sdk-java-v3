package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SwitchCpcsTokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private SwitchTokenResponseToken token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-CPCS-Token")

    private String xCPCSToken;

    public SwitchCpcsTokenResponse withToken(SwitchTokenResponseToken token) {
        this.token = token;
        return this;
    }

    public SwitchCpcsTokenResponse withToken(Consumer<SwitchTokenResponseToken> tokenSetter) {
        if (this.token == null) {
            this.token = new SwitchTokenResponseToken();
            tokenSetter.accept(this.token);
        }

        return this;
    }

    /**
     * Get token
     * @return token
     */
    public SwitchTokenResponseToken getToken() {
        return token;
    }

    public void setToken(SwitchTokenResponseToken token) {
        this.token = token;
    }

    public SwitchCpcsTokenResponse withXCPCSToken(String xCPCSToken) {
        this.xCPCSToken = xCPCSToken;
        return this;
    }

    /**
     * Get xCPCSToken
     * @return xCPCSToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-CPCS-Token")
    public String getXCPCSToken() {
        return xCPCSToken;
    }

    public void setXCPCSToken(String xCPCSToken) {
        this.xCPCSToken = xCPCSToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchCpcsTokenResponse that = (SwitchCpcsTokenResponse) obj;
        return Objects.equals(this.token, that.token) && Objects.equals(this.xCPCSToken, that.xCPCSToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, xCPCSToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchCpcsTokenResponse {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    xCPCSToken: ").append(toIndentedString(xCPCSToken)).append("\n");
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
