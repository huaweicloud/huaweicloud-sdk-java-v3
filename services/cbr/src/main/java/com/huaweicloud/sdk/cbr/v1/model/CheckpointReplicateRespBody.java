package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckpointReplicateRespBody
 */
public class CheckpointReplicateRespBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backups")

    @JacksonXmlProperty(localName = "backups")

    private List<CheckpointReplicateRespbackups> backups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    @JacksonXmlProperty(localName = "destination_project_id")

    private String destinationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    @JacksonXmlProperty(localName = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_vault_id")

    @JacksonXmlProperty(localName = "destination_vault_id")

    private String destinationVaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    @JacksonXmlProperty(localName = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_region")

    @JacksonXmlProperty(localName = "source_region")

    private String sourceRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    @JacksonXmlProperty(localName = "vault_id")

    private String vaultId;

    public CheckpointReplicateRespBody withBackups(List<CheckpointReplicateRespbackups> backups) {
        this.backups = backups;
        return this;
    }

    public CheckpointReplicateRespBody addBackupsItem(CheckpointReplicateRespbackups backupsItem) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        this.backups.add(backupsItem);
        return this;
    }

    public CheckpointReplicateRespBody withBackups(Consumer<List<CheckpointReplicateRespbackups>> backupsSetter) {
        if (this.backups == null) {
            this.backups = new ArrayList<>();
        }
        backupsSetter.accept(this.backups);
        return this;
    }

    /**
     * 待复制的备份列表
     * @return backups
     */
    public List<CheckpointReplicateRespbackups> getBackups() {
        return backups;
    }

    public void setBackups(List<CheckpointReplicateRespbackups> backups) {
        this.backups = backups;
    }

    public CheckpointReplicateRespBody withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    /**
     * 复制的目标项目ID
     * @return destinationProjectId
     */
    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    public CheckpointReplicateRespBody withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * 复制的目标区域
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public CheckpointReplicateRespBody withDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
        return this;
    }

    /**
     * 目标区域存储库ID
     * @return destinationVaultId
     */
    public String getDestinationVaultId() {
        return destinationVaultId;
    }

    public void setDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
    }

    public CheckpointReplicateRespBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 执行复制的项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CheckpointReplicateRespBody withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * 备份提供商ID
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public CheckpointReplicateRespBody withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * 复制的源区域
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    public CheckpointReplicateRespBody withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * 存储库ID
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckpointReplicateRespBody checkpointReplicateRespBody = (CheckpointReplicateRespBody) o;
        return Objects.equals(this.backups, checkpointReplicateRespBody.backups)
            && Objects.equals(this.destinationProjectId, checkpointReplicateRespBody.destinationProjectId)
            && Objects.equals(this.destinationRegion, checkpointReplicateRespBody.destinationRegion)
            && Objects.equals(this.destinationVaultId, checkpointReplicateRespBody.destinationVaultId)
            && Objects.equals(this.projectId, checkpointReplicateRespBody.projectId)
            && Objects.equals(this.providerId, checkpointReplicateRespBody.providerId)
            && Objects.equals(this.sourceRegion, checkpointReplicateRespBody.sourceRegion)
            && Objects.equals(this.vaultId, checkpointReplicateRespBody.vaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backups,
            destinationProjectId,
            destinationRegion,
            destinationVaultId,
            projectId,
            providerId,
            sourceRegion,
            vaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointReplicateRespBody {\n");
        sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationVaultId: ").append(toIndentedString(destinationVaultId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
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
