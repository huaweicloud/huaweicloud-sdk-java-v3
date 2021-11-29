package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class BackupReplicateRespBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_vault_id")

    private String destinationVaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_record_id")

    private String replicationRecordId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_region")

    private String sourceRegion;

    public BackupReplicateRespBody withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /** 待复制的备份ID
     * 
     * @return backupId */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public BackupReplicateRespBody withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    /** 复制的目标项目ID
     * 
     * @return destinationProjectId */
    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    public BackupReplicateRespBody withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /** 复制的目标区域
     * 
     * @return destinationRegion */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public BackupReplicateRespBody withDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
        return this;
    }

    /** 复制的目标区域存储库ID
     * 
     * @return destinationVaultId */
    public String getDestinationVaultId() {
        return destinationVaultId;
    }

    public void setDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
    }

    public BackupReplicateRespBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 执行复制的项目ID
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BackupReplicateRespBody withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /** 备份提供商ID，用于区分备份对象.
     * 
     * @return providerId */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public BackupReplicateRespBody withReplicationRecordId(String replicationRecordId) {
        this.replicationRecordId = replicationRecordId;
        return this;
    }

    /** 复制记录ID
     * 
     * @return replicationRecordId */
    public String getReplicationRecordId() {
        return replicationRecordId;
    }

    public void setReplicationRecordId(String replicationRecordId) {
        this.replicationRecordId = replicationRecordId;
    }

    public BackupReplicateRespBody withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /** 复制的源区域
     * 
     * @return sourceRegion */
    public String getSourceRegion() {
        return sourceRegion;
    }

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupReplicateRespBody backupReplicateRespBody = (BackupReplicateRespBody) o;
        return Objects.equals(this.backupId, backupReplicateRespBody.backupId)
            && Objects.equals(this.destinationProjectId, backupReplicateRespBody.destinationProjectId)
            && Objects.equals(this.destinationRegion, backupReplicateRespBody.destinationRegion)
            && Objects.equals(this.destinationVaultId, backupReplicateRespBody.destinationVaultId)
            && Objects.equals(this.projectId, backupReplicateRespBody.projectId)
            && Objects.equals(this.providerId, backupReplicateRespBody.providerId)
            && Objects.equals(this.replicationRecordId, backupReplicateRespBody.replicationRecordId)
            && Objects.equals(this.sourceRegion, backupReplicateRespBody.sourceRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupId,
            destinationProjectId,
            destinationRegion,
            destinationVaultId,
            projectId,
            providerId,
            replicationRecordId,
            sourceRegion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupReplicateRespBody {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationVaultId: ").append(toIndentedString(destinationVaultId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    replicationRecordId: ").append(toIndentedString(replicationRecordId)).append("\n");
        sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
