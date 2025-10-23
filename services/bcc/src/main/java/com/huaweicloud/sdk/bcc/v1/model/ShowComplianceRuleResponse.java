package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowComplianceRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_system_embedded")

    private Boolean isSystemEmbedded;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_type")

    private String backupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_backup_enabled")

    private Boolean localBackupEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_backup_retention")

    private Integer localBackupRetention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_backup_frequency")

    private BackupComplianceRuleLocalBackupFrequency localBackupFrequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_backup_enabled")

    private Boolean remoteBackupEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_backup_retention")

    private Integer remoteBackupRetention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_worm_enabled")

    private Boolean localWormEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_worm_enabled")

    private Boolean remoteWormEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_cross_account_backup_forced")

    private Boolean isCrossAccountBackupForced;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private Long created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private Long updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ShowComplianceRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowComplianceRuleResponse withIsSystemEmbedded(Boolean isSystemEmbedded) {
        this.isSystemEmbedded = isSystemEmbedded;
        return this;
    }

    /**
     * 是否系统内置规则
     * @return isSystemEmbedded
     */
    public Boolean getIsSystemEmbedded() {
        return isSystemEmbedded;
    }

    public void setIsSystemEmbedded(Boolean isSystemEmbedded) {
        this.isSystemEmbedded = isSystemEmbedded;
    }

    public ShowComplianceRuleResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowComplianceRuleResponse withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ShowComplianceRuleResponse withBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * 备份类型
     * @return backupType
     */
    public String getBackupType() {
        return backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    public ShowComplianceRuleResponse withLocalBackupEnabled(Boolean localBackupEnabled) {
        this.localBackupEnabled = localBackupEnabled;
        return this;
    }

    /**
     * 是否启用本地备份
     * @return localBackupEnabled
     */
    public Boolean getLocalBackupEnabled() {
        return localBackupEnabled;
    }

    public void setLocalBackupEnabled(Boolean localBackupEnabled) {
        this.localBackupEnabled = localBackupEnabled;
    }

    public ShowComplianceRuleResponse withLocalBackupRetention(Integer localBackupRetention) {
        this.localBackupRetention = localBackupRetention;
        return this;
    }

    /**
     * 本地备份副本保留时长
     * @return localBackupRetention
     */
    public Integer getLocalBackupRetention() {
        return localBackupRetention;
    }

    public void setLocalBackupRetention(Integer localBackupRetention) {
        this.localBackupRetention = localBackupRetention;
    }

    public ShowComplianceRuleResponse withLocalBackupFrequency(
        BackupComplianceRuleLocalBackupFrequency localBackupFrequency) {
        this.localBackupFrequency = localBackupFrequency;
        return this;
    }

    public ShowComplianceRuleResponse withLocalBackupFrequency(
        Consumer<BackupComplianceRuleLocalBackupFrequency> localBackupFrequencySetter) {
        if (this.localBackupFrequency == null) {
            this.localBackupFrequency = new BackupComplianceRuleLocalBackupFrequency();
            localBackupFrequencySetter.accept(this.localBackupFrequency);
        }

        return this;
    }

    /**
     * Get localBackupFrequency
     * @return localBackupFrequency
     */
    public BackupComplianceRuleLocalBackupFrequency getLocalBackupFrequency() {
        return localBackupFrequency;
    }

    public void setLocalBackupFrequency(BackupComplianceRuleLocalBackupFrequency localBackupFrequency) {
        this.localBackupFrequency = localBackupFrequency;
    }

    public ShowComplianceRuleResponse withRemoteBackupEnabled(Boolean remoteBackupEnabled) {
        this.remoteBackupEnabled = remoteBackupEnabled;
        return this;
    }

    /**
     * 是否启用异地复制。
     * @return remoteBackupEnabled
     */
    public Boolean getRemoteBackupEnabled() {
        return remoteBackupEnabled;
    }

    public void setRemoteBackupEnabled(Boolean remoteBackupEnabled) {
        this.remoteBackupEnabled = remoteBackupEnabled;
    }

    public ShowComplianceRuleResponse withRemoteBackupRetention(Integer remoteBackupRetention) {
        this.remoteBackupRetention = remoteBackupRetention;
        return this;
    }

    /**
     * 异地复制副本保留时长。
     * @return remoteBackupRetention
     */
    public Integer getRemoteBackupRetention() {
        return remoteBackupRetention;
    }

    public void setRemoteBackupRetention(Integer remoteBackupRetention) {
        this.remoteBackupRetention = remoteBackupRetention;
    }

    public ShowComplianceRuleResponse withLocalWormEnabled(Boolean localWormEnabled) {
        this.localWormEnabled = localWormEnabled;
        return this;
    }

    /**
     * 本地副本是否启用WORM特性。
     * @return localWormEnabled
     */
    public Boolean getLocalWormEnabled() {
        return localWormEnabled;
    }

    public void setLocalWormEnabled(Boolean localWormEnabled) {
        this.localWormEnabled = localWormEnabled;
    }

    public ShowComplianceRuleResponse withRemoteWormEnabled(Boolean remoteWormEnabled) {
        this.remoteWormEnabled = remoteWormEnabled;
        return this;
    }

    /**
     * 异地复制副本是否启用WORM特性。
     * @return remoteWormEnabled
     */
    public Boolean getRemoteWormEnabled() {
        return remoteWormEnabled;
    }

    public void setRemoteWormEnabled(Boolean remoteWormEnabled) {
        this.remoteWormEnabled = remoteWormEnabled;
    }

    public ShowComplianceRuleResponse withIsCrossAccountBackupForced(Boolean isCrossAccountBackupForced) {
        this.isCrossAccountBackupForced = isCrossAccountBackupForced;
        return this;
    }

    /**
     * 是否开启强制跨账号备份
     * @return isCrossAccountBackupForced
     */
    public Boolean getIsCrossAccountBackupForced() {
        return isCrossAccountBackupForced;
    }

    public void setIsCrossAccountBackupForced(Boolean isCrossAccountBackupForced) {
        this.isCrossAccountBackupForced = isCrossAccountBackupForced;
    }

    public ShowComplianceRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowComplianceRuleResponse withCreated(Long created) {
        this.created = created;
        return this;
    }

    /**
     * 规则创建时间
     * @return created
     */
    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public ShowComplianceRuleResponse withUpdated(Long updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 规则更新时间
     * @return updated
     */
    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public ShowComplianceRuleResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 合规规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowComplianceRuleResponse that = (ShowComplianceRuleResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.isSystemEmbedded, that.isSystemEmbedded)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.backupType, that.backupType)
            && Objects.equals(this.localBackupEnabled, that.localBackupEnabled)
            && Objects.equals(this.localBackupRetention, that.localBackupRetention)
            && Objects.equals(this.localBackupFrequency, that.localBackupFrequency)
            && Objects.equals(this.remoteBackupEnabled, that.remoteBackupEnabled)
            && Objects.equals(this.remoteBackupRetention, that.remoteBackupRetention)
            && Objects.equals(this.localWormEnabled, that.localWormEnabled)
            && Objects.equals(this.remoteWormEnabled, that.remoteWormEnabled)
            && Objects.equals(this.isCrossAccountBackupForced, that.isCrossAccountBackupForced)
            && Objects.equals(this.description, that.description) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            isSystemEmbedded,
            domainId,
            resourceType,
            backupType,
            localBackupEnabled,
            localBackupRetention,
            localBackupFrequency,
            remoteBackupEnabled,
            remoteBackupRetention,
            localWormEnabled,
            remoteWormEnabled,
            isCrossAccountBackupForced,
            description,
            created,
            updated,
            name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowComplianceRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isSystemEmbedded: ").append(toIndentedString(isSystemEmbedded)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
        sb.append("    localBackupEnabled: ").append(toIndentedString(localBackupEnabled)).append("\n");
        sb.append("    localBackupRetention: ").append(toIndentedString(localBackupRetention)).append("\n");
        sb.append("    localBackupFrequency: ").append(toIndentedString(localBackupFrequency)).append("\n");
        sb.append("    remoteBackupEnabled: ").append(toIndentedString(remoteBackupEnabled)).append("\n");
        sb.append("    remoteBackupRetention: ").append(toIndentedString(remoteBackupRetention)).append("\n");
        sb.append("    localWormEnabled: ").append(toIndentedString(localWormEnabled)).append("\n");
        sb.append("    remoteWormEnabled: ").append(toIndentedString(remoteWormEnabled)).append("\n");
        sb.append("    isCrossAccountBackupForced: ").append(toIndentedString(isCrossAccountBackupForced)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
