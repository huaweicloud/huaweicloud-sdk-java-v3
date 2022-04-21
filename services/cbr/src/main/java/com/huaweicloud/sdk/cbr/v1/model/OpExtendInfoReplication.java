package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OpExtendInfoReplication
 */
public class OpExtendInfoReplication {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_backup_id")

    private String destinationBackupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_checkpoint_id")

    private String destinationCheckpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_backup_id")

    private String sourceBackupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_checkpoint_id")

    private String sourceCheckpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_region")

    private String sourceRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_backup_name")

    private String sourceBackupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_backup_name")

    private String destinationBackupName;

    public OpExtendInfoReplication withDestinationBackupId(String destinationBackupId) {
        this.destinationBackupId = destinationBackupId;
        return this;
    }

    /**
     * 目标副本ID
     * @return destinationBackupId
     */
    public String getDestinationBackupId() {
        return destinationBackupId;
    }

    public void setDestinationBackupId(String destinationBackupId) {
        this.destinationBackupId = destinationBackupId;
    }

    public OpExtendInfoReplication withDestinationCheckpointId(String destinationCheckpointId) {
        this.destinationCheckpointId = destinationCheckpointId;
        return this;
    }

    /**
     * 目标还原点ID
     * @return destinationCheckpointId
     */
    public String getDestinationCheckpointId() {
        return destinationCheckpointId;
    }

    public void setDestinationCheckpointId(String destinationCheckpointId) {
        this.destinationCheckpointId = destinationCheckpointId;
    }

    public OpExtendInfoReplication withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    /**
     * 目标project_id
     * @return destinationProjectId
     */
    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    public OpExtendInfoReplication withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * 目标区域
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public OpExtendInfoReplication withSourceBackupId(String sourceBackupId) {
        this.sourceBackupId = sourceBackupId;
        return this;
    }

    /**
     * 源副本ID
     * @return sourceBackupId
     */
    public String getSourceBackupId() {
        return sourceBackupId;
    }

    public void setSourceBackupId(String sourceBackupId) {
        this.sourceBackupId = sourceBackupId;
    }

    public OpExtendInfoReplication withSourceCheckpointId(String sourceCheckpointId) {
        this.sourceCheckpointId = sourceCheckpointId;
        return this;
    }

    /**
     * 源还原点ID
     * @return sourceCheckpointId
     */
    public String getSourceCheckpointId() {
        return sourceCheckpointId;
    }

    public void setSourceCheckpointId(String sourceCheckpointId) {
        this.sourceCheckpointId = sourceCheckpointId;
    }

    public OpExtendInfoReplication withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    /**
     * 源project_id
     * @return sourceProjectId
     */
    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public OpExtendInfoReplication withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * 源区域
     * @return sourceRegion
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    public OpExtendInfoReplication withSourceBackupName(String sourceBackupName) {
        this.sourceBackupName = sourceBackupName;
        return this;
    }

    /**
     * 源备份名称
     * @return sourceBackupName
     */
    public String getSourceBackupName() {
        return sourceBackupName;
    }

    public void setSourceBackupName(String sourceBackupName) {
        this.sourceBackupName = sourceBackupName;
    }

    public OpExtendInfoReplication withDestinationBackupName(String destinationBackupName) {
        this.destinationBackupName = destinationBackupName;
        return this;
    }

    /**
     * 目标备份名称
     * @return destinationBackupName
     */
    public String getDestinationBackupName() {
        return destinationBackupName;
    }

    public void setDestinationBackupName(String destinationBackupName) {
        this.destinationBackupName = destinationBackupName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpExtendInfoReplication opExtendInfoReplication = (OpExtendInfoReplication) o;
        return Objects.equals(this.destinationBackupId, opExtendInfoReplication.destinationBackupId)
            && Objects.equals(this.destinationCheckpointId, opExtendInfoReplication.destinationCheckpointId)
            && Objects.equals(this.destinationProjectId, opExtendInfoReplication.destinationProjectId)
            && Objects.equals(this.destinationRegion, opExtendInfoReplication.destinationRegion)
            && Objects.equals(this.sourceBackupId, opExtendInfoReplication.sourceBackupId)
            && Objects.equals(this.sourceCheckpointId, opExtendInfoReplication.sourceCheckpointId)
            && Objects.equals(this.sourceProjectId, opExtendInfoReplication.sourceProjectId)
            && Objects.equals(this.sourceRegion, opExtendInfoReplication.sourceRegion)
            && Objects.equals(this.sourceBackupName, opExtendInfoReplication.sourceBackupName)
            && Objects.equals(this.destinationBackupName, opExtendInfoReplication.destinationBackupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationBackupId,
            destinationCheckpointId,
            destinationProjectId,
            destinationRegion,
            sourceBackupId,
            sourceCheckpointId,
            sourceProjectId,
            sourceRegion,
            sourceBackupName,
            destinationBackupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpExtendInfoReplication {\n");
        sb.append("    destinationBackupId: ").append(toIndentedString(destinationBackupId)).append("\n");
        sb.append("    destinationCheckpointId: ").append(toIndentedString(destinationCheckpointId)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    sourceBackupId: ").append(toIndentedString(sourceBackupId)).append("\n");
        sb.append("    sourceCheckpointId: ").append(toIndentedString(sourceCheckpointId)).append("\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    sourceRegion: ").append(toIndentedString(sourceRegion)).append("\n");
        sb.append("    sourceBackupName: ").append(toIndentedString(sourceBackupName)).append("\n");
        sb.append("    destinationBackupName: ").append(toIndentedString(destinationBackupName)).append("\n");
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
