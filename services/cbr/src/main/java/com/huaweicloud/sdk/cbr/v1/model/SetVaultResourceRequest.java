package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class SetVaultResourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private VaultSetResourceReq body;

    public SetVaultResourceRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * 存储库id
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public SetVaultResourceRequest withBody(VaultSetResourceReq body) {
        this.body = body;
        return this;
    }

    public SetVaultResourceRequest withBody(Consumer<VaultSetResourceReq> bodySetter) {
        if (this.body == null) {
            this.body = new VaultSetResourceReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public VaultSetResourceReq getBody() {
        return body;
    }

    public void setBody(VaultSetResourceReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetVaultResourceRequest setVaultResourceRequest = (SetVaultResourceRequest) o;
        return Objects.equals(this.vaultId, setVaultResourceRequest.vaultId)
            && Objects.equals(this.body, setVaultResourceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaultId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetVaultResourceRequest {\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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
