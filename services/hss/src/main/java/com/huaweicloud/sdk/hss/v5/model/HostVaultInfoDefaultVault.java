package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 默认选中的存储库 **取值范围**: 不涉及 
 */
public class HostVaultInfoDefaultVault {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_name")

    private String vaultName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    public HostVaultInfoDefaultVault withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * **参数解释**: 存储库名称 **取值范围**: 字符长度1-128位 
     * @return vaultName
     */
    public String getVaultName() {
        return vaultName;
    }

    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }

    public HostVaultInfoDefaultVault withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * **参数解释**: 存储库id **取值范围**: 字符长度1-128位 
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
        HostVaultInfoDefaultVault that = (HostVaultInfoDefaultVault) obj;
        return Objects.equals(this.vaultName, that.vaultName) && Objects.equals(this.vaultId, that.vaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaultName, vaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostVaultInfoDefaultVault {\n");
        sb.append("    vaultName: ").append(toIndentedString(vaultName)).append("\n");
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
