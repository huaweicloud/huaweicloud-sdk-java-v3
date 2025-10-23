package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * policy关联存储库vault
 */
public class BccPolicyAssociateVault {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_vault_id")

    private String destinationVaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    public BccPolicyAssociateVault withDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
        return this;
    }

    /**
     * 目标region vaultId
     * @return destinationVaultId
     */
    public String getDestinationVaultId() {
        return destinationVaultId;
    }

    public void setDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
    }

    public BccPolicyAssociateVault withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * vaultId
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BccPolicyAssociateVault that = (BccPolicyAssociateVault) obj;
        return Objects.equals(this.destinationVaultId, that.destinationVaultId)
            && Objects.equals(this.vaultId, that.vaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationVaultId, vaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BccPolicyAssociateVault {\n");
        sb.append("    destinationVaultId: ").append(toIndentedString(destinationVaultId)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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
