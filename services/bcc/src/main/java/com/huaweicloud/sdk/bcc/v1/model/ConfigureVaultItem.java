package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置保护的存储库实体
 */
public class ConfigureVaultItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted")

    private Boolean encrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worm")

    private Boolean worm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_enable")

    private Boolean policyEnable;

    public ConfigureVaultItem withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * CBR存储库ID
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public ConfigureVaultItem withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ConfigureVaultItem withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * 是否加密
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public ConfigureVaultItem withWorm(Boolean worm) {
        this.worm = worm;
        return this;
    }

    /**
     * 是否备份锁定
     * @return worm
     */
    public Boolean getWorm() {
        return worm;
    }

    public void setWorm(Boolean worm) {
        this.worm = worm;
    }

    public ConfigureVaultItem withPolicyEnable(Boolean policyEnable) {
        this.policyEnable = policyEnable;
        return this;
    }

    /**
     * 策略是否启用
     * @return policyEnable
     */
    public Boolean getPolicyEnable() {
        return policyEnable;
    }

    public void setPolicyEnable(Boolean policyEnable) {
        this.policyEnable = policyEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigureVaultItem that = (ConfigureVaultItem) obj;
        return Objects.equals(this.vaultId, that.vaultId) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.encrypted, that.encrypted) && Objects.equals(this.worm, that.worm)
            && Objects.equals(this.policyEnable, that.policyEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaultId, policyId, encrypted, worm, policyEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigureVaultItem {\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
        sb.append("    worm: ").append(toIndentedString(worm)).append("\n");
        sb.append("    policyEnable: ").append(toIndentedString(policyEnable)).append("\n");
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
