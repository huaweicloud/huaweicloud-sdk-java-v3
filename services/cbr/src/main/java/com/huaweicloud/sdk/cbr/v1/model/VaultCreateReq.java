package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VaultCreateReq
 */
public class VaultCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault")

    private VaultCreate vault;

    public VaultCreateReq withVault(VaultCreate vault) {
        this.vault = vault;
        return this;
    }

    public VaultCreateReq withVault(Consumer<VaultCreate> vaultSetter) {
        if (this.vault == null) {
            this.vault = new VaultCreate();
            vaultSetter.accept(this.vault);
        }

        return this;
    }

    /**
     * Get vault
     * @return vault
     */
    public VaultCreate getVault() {
        return vault;
    }

    public void setVault(VaultCreate vault) {
        this.vault = vault;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VaultCreateReq that = (VaultCreateReq) obj;
        return Objects.equals(this.vault, that.vault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultCreateReq {\n");
        sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
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
