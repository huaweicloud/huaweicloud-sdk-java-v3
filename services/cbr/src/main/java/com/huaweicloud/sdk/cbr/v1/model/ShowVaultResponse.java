package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVaultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault")

    @JacksonXmlProperty(localName = "vault")

    private Vault vault;

    public ShowVaultResponse withVault(Vault vault) {
        this.vault = vault;
        return this;
    }

    public ShowVaultResponse withVault(Consumer<Vault> vaultSetter) {
        if (this.vault == null) {
            this.vault = new Vault();
            vaultSetter.accept(this.vault);
        }

        return this;
    }

    /**
     * Get vault
     * @return vault
     */
    public Vault getVault() {
        return vault;
    }

    public void setVault(Vault vault) {
        this.vault = vault;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowVaultResponse showVaultResponse = (ShowVaultResponse) o;
        return Objects.equals(this.vault, showVaultResponse.vault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVaultResponse {\n");
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
