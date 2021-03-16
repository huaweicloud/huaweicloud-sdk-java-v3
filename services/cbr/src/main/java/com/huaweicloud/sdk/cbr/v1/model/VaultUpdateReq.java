package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.VaultUpdate;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 存储库修改参数体
 */
public class VaultUpdateReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vault")
    
    private VaultUpdate vault;

    public VaultUpdateReq withVault(VaultUpdate vault) {
        this.vault = vault;
        return this;
    }

    public VaultUpdateReq withVault(Consumer<VaultUpdate> vaultSetter) {
        if(this.vault == null ){
            this.vault = new VaultUpdate();
            vaultSetter.accept(this.vault);
        }
        
        return this;
    }


    /**
     * Get vault
     * @return vault
     */
    public VaultUpdate getVault() {
        return vault;
    }

    public void setVault(VaultUpdate vault) {
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
        VaultUpdateReq vaultUpdateReq = (VaultUpdateReq) o;
        return Objects.equals(this.vault, vaultUpdateReq.vault);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vault);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VaultUpdateReq {\n");
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

