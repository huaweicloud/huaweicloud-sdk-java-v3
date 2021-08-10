package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class DisassociateVaultPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private VaultDissociate body;

    public DisassociateVaultPolicyRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /** 存储库ID
     * 
     * @return vaultId */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public DisassociateVaultPolicyRequest withBody(VaultDissociate body) {
        this.body = body;
        return this;
    }

    public DisassociateVaultPolicyRequest withBody(Consumer<VaultDissociate> bodySetter) {
        if (this.body == null) {
            this.body = new VaultDissociate();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public VaultDissociate getBody() {
        return body;
    }

    public void setBody(VaultDissociate body) {
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
        DisassociateVaultPolicyRequest disassociateVaultPolicyRequest = (DisassociateVaultPolicyRequest) o;
        return Objects.equals(this.vaultId, disassociateVaultPolicyRequest.vaultId)
            && Objects.equals(this.body, disassociateVaultPolicyRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaultId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateVaultPolicyRequest {\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
