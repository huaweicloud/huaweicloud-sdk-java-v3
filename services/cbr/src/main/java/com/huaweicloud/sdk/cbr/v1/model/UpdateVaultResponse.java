package com.huaweicloud.sdk.cbr.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.Vault;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateVaultResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vault")
    
    private Vault vault = null;

    public UpdateVaultResponse withVault(Vault vault) {
        this.vault = vault;
        return this;
    }

    public UpdateVaultResponse withVault(Consumer<Vault> vaultSetter) {
        if(this.vault == null ){
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
        UpdateVaultResponse updateVaultResponse = (UpdateVaultResponse) o;
        return Objects.equals(this.vault, updateVaultResponse.vault);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vault);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVaultResponse {\n");
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

