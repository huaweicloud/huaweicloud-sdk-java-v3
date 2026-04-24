package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class GetTokenVaultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_vault")

    private TokenVault tokenVault;

    public GetTokenVaultResponse withTokenVault(TokenVault tokenVault) {
        this.tokenVault = tokenVault;
        return this;
    }

    public GetTokenVaultResponse withTokenVault(Consumer<TokenVault> tokenVaultSetter) {
        if (this.tokenVault == null) {
            this.tokenVault = new TokenVault();
            tokenVaultSetter.accept(this.tokenVault);
        }

        return this;
    }

    /**
     * Get tokenVault
     * @return tokenVault
     */
    public TokenVault getTokenVault() {
        return tokenVault;
    }

    public void setTokenVault(TokenVault tokenVault) {
        this.tokenVault = tokenVault;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetTokenVaultResponse that = (GetTokenVaultResponse) obj;
        return Objects.equals(this.tokenVault, that.tokenVault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tokenVault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetTokenVaultResponse {\n");
        sb.append("    tokenVault: ").append(toIndentedString(tokenVault)).append("\n");
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
