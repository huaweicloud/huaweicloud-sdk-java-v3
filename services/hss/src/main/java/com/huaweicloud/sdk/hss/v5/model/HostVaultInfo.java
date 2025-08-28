package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 主机的存储库信息
 */
public class HostVaultInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_backup_name_suffix")

    private String defaultBackupNameSuffix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_vault")

    private HostVaultInfoDefaultVault defaultVault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vaults")

    private List<HostVaultInfoVaults> vaults = null;

    public HostVaultInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 主机id **取值范围**: 字符长度1-128位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public HostVaultInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 主机名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public HostVaultInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**: 主机公网ip **取值范围**: 字符长度1-128位 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public HostVaultInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**: 主机私网ip **取值范围**: 字符长度1-128位 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public HostVaultInfo withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * **参数解释**: 主机的资产重要性 **取值范围**: - important：重要资产 - common：一般资产 - test：测试资产 
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public HostVaultInfo withDefaultBackupNameSuffix(String defaultBackupNameSuffix) {
        this.defaultBackupNameSuffix = defaultBackupNameSuffix;
        return this;
    }

    /**
     * **参数解释**: 默认备份名称的后缀 **取值范围**: 字符长度0-32位 
     * @return defaultBackupNameSuffix
     */
    public String getDefaultBackupNameSuffix() {
        return defaultBackupNameSuffix;
    }

    public void setDefaultBackupNameSuffix(String defaultBackupNameSuffix) {
        this.defaultBackupNameSuffix = defaultBackupNameSuffix;
    }

    public HostVaultInfo withDefaultVault(HostVaultInfoDefaultVault defaultVault) {
        this.defaultVault = defaultVault;
        return this;
    }

    public HostVaultInfo withDefaultVault(Consumer<HostVaultInfoDefaultVault> defaultVaultSetter) {
        if (this.defaultVault == null) {
            this.defaultVault = new HostVaultInfoDefaultVault();
            defaultVaultSetter.accept(this.defaultVault);
        }

        return this;
    }

    /**
     * Get defaultVault
     * @return defaultVault
     */
    public HostVaultInfoDefaultVault getDefaultVault() {
        return defaultVault;
    }

    public void setDefaultVault(HostVaultInfoDefaultVault defaultVault) {
        this.defaultVault = defaultVault;
    }

    public HostVaultInfo withVaults(List<HostVaultInfoVaults> vaults) {
        this.vaults = vaults;
        return this;
    }

    public HostVaultInfo addVaultsItem(HostVaultInfoVaults vaultsItem) {
        if (this.vaults == null) {
            this.vaults = new ArrayList<>();
        }
        this.vaults.add(vaultsItem);
        return this;
    }

    public HostVaultInfo withVaults(Consumer<List<HostVaultInfoVaults>> vaultsSetter) {
        if (this.vaults == null) {
            this.vaults = new ArrayList<>();
        }
        vaultsSetter.accept(this.vaults);
        return this;
    }

    /**
     * **参数解释**: 主机的存储库列表 **取值范围**: 不涉及 
     * @return vaults
     */
    public List<HostVaultInfoVaults> getVaults() {
        return vaults;
    }

    public void setVaults(List<HostVaultInfoVaults> vaults) {
        this.vaults = vaults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostVaultInfo that = (HostVaultInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.assetValue, that.assetValue)
            && Objects.equals(this.defaultBackupNameSuffix, that.defaultBackupNameSuffix)
            && Objects.equals(this.defaultVault, that.defaultVault) && Objects.equals(this.vaults, that.vaults);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(hostId, hostName, publicIp, privateIp, assetValue, defaultBackupNameSuffix, defaultVault, vaults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostVaultInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    defaultBackupNameSuffix: ").append(toIndentedString(defaultBackupNameSuffix)).append("\n");
        sb.append("    defaultVault: ").append(toIndentedString(defaultVault)).append("\n");
        sb.append("    vaults: ").append(toIndentedString(vaults)).append("\n");
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
