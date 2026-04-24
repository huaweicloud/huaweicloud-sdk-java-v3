package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class GetTokenVaultRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_vault_id")

    private String tokenVaultId;

    public GetTokenVaultRequest withTokenVaultId(String tokenVaultId) {
        this.tokenVaultId = tokenVaultId;
        return this;
    }

    /**
     * The unique identifier of the token vault.
     * @return tokenVaultId
     */
    public String getTokenVaultId() {
        return tokenVaultId;
    }

    public void setTokenVaultId(String tokenVaultId) {
        this.tokenVaultId = tokenVaultId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetTokenVaultRequest that = (GetTokenVaultRequest) obj;
        return Objects.equals(this.tokenVaultId, that.tokenVaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tokenVaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetTokenVaultRequest {\n");
        sb.append("    tokenVaultId: ").append(toIndentedString(tokenVaultId)).append("\n");
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
