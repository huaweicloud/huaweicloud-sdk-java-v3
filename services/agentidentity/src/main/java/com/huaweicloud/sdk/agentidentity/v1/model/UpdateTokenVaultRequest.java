package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTokenVaultRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_vault_id")

    private String tokenVaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateTokenVaultReqBody body;

    public UpdateTokenVaultRequest withTokenVaultId(String tokenVaultId) {
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

    public UpdateTokenVaultRequest withBody(UpdateTokenVaultReqBody body) {
        this.body = body;
        return this;
    }

    public UpdateTokenVaultRequest withBody(Consumer<UpdateTokenVaultReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateTokenVaultReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateTokenVaultReqBody getBody() {
        return body;
    }

    public void setBody(UpdateTokenVaultReqBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTokenVaultRequest that = (UpdateTokenVaultRequest) obj;
        return Objects.equals(this.tokenVaultId, that.tokenVaultId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tokenVaultId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTokenVaultRequest {\n");
        sb.append("    tokenVaultId: ").append(toIndentedString(tokenVaultId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
