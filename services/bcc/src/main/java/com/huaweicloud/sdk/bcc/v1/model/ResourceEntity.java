package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源实体
 */
public class ResourceEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level_name")

    private String resourceLevelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical_level")

    private String criticalLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_protection")

    private Boolean configProtection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_compliance")

    private String backupCompliance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_vault_name")

    private String localVaultName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_vault_name")

    private String remoteVaultName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_inventory_time")

    private String lastInventoryTime;

    public ResourceEntity withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ResourceEntity withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ResourceEntity withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 资源类型
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ResourceEntity withResourceLevelName(String resourceLevelName) {
        this.resourceLevelName = resourceLevelName;
        return this;
    }

    /**
     * 资源等级名称
     * @return resourceLevelName
     */
    public String getResourceLevelName() {
        return resourceLevelName;
    }

    public void setResourceLevelName(String resourceLevelName) {
        this.resourceLevelName = resourceLevelName;
    }

    public ResourceEntity withCriticalLevel(String criticalLevel) {
        this.criticalLevel = criticalLevel;
        return this;
    }

    /**
     * 重要程度
     * @return criticalLevel
     */
    public String getCriticalLevel() {
        return criticalLevel;
    }

    public void setCriticalLevel(String criticalLevel) {
        this.criticalLevel = criticalLevel;
    }

    public ResourceEntity withConfigProtection(Boolean configProtection) {
        this.configProtection = configProtection;
        return this;
    }

    /**
     * 是否配置保护
     * @return configProtection
     */
    public Boolean getConfigProtection() {
        return configProtection;
    }

    public void setConfigProtection(Boolean configProtection) {
        this.configProtection = configProtection;
    }

    public ResourceEntity withBackupCompliance(String backupCompliance) {
        this.backupCompliance = backupCompliance;
        return this;
    }

    /**
     * 备份合规性
     * @return backupCompliance
     */
    public String getBackupCompliance() {
        return backupCompliance;
    }

    public void setBackupCompliance(String backupCompliance) {
        this.backupCompliance = backupCompliance;
    }

    public ResourceEntity withLocalVaultName(String localVaultName) {
        this.localVaultName = localVaultName;
        return this;
    }

    /**
     * 本地备份存储库名称
     * @return localVaultName
     */
    public String getLocalVaultName() {
        return localVaultName;
    }

    public void setLocalVaultName(String localVaultName) {
        this.localVaultName = localVaultName;
    }

    public ResourceEntity withRemoteVaultName(String remoteVaultName) {
        this.remoteVaultName = remoteVaultName;
        return this;
    }

    /**
     * 异地备份存储库名称
     * @return remoteVaultName
     */
    public String getRemoteVaultName() {
        return remoteVaultName;
    }

    public void setRemoteVaultName(String remoteVaultName) {
        this.remoteVaultName = remoteVaultName;
    }

    public ResourceEntity withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 资源归属区域
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ResourceEntity withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资源创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ResourceEntity withLastInventoryTime(String lastInventoryTime) {
        this.lastInventoryTime = lastInventoryTime;
        return this;
    }

    /**
     * 上次盘点时间
     * @return lastInventoryTime
     */
    public String getLastInventoryTime() {
        return lastInventoryTime;
    }

    public void setLastInventoryTime(String lastInventoryTime) {
        this.lastInventoryTime = lastInventoryTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceEntity that = (ResourceEntity) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.resourceLevelName, that.resourceLevelName)
            && Objects.equals(this.criticalLevel, that.criticalLevel)
            && Objects.equals(this.configProtection, that.configProtection)
            && Objects.equals(this.backupCompliance, that.backupCompliance)
            && Objects.equals(this.localVaultName, that.localVaultName)
            && Objects.equals(this.remoteVaultName, that.remoteVaultName)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastInventoryTime, that.lastInventoryTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId,
            resourceName,
            provider,
            resourceLevelName,
            criticalLevel,
            configProtection,
            backupCompliance,
            localVaultName,
            remoteVaultName,
            regionId,
            createTime,
            lastInventoryTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceEntity {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    resourceLevelName: ").append(toIndentedString(resourceLevelName)).append("\n");
        sb.append("    criticalLevel: ").append(toIndentedString(criticalLevel)).append("\n");
        sb.append("    configProtection: ").append(toIndentedString(configProtection)).append("\n");
        sb.append("    backupCompliance: ").append(toIndentedString(backupCompliance)).append("\n");
        sb.append("    localVaultName: ").append(toIndentedString(localVaultName)).append("\n");
        sb.append("    remoteVaultName: ").append(toIndentedString(remoteVaultName)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastInventoryTime: ").append(toIndentedString(lastInventoryTime)).append("\n");
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
