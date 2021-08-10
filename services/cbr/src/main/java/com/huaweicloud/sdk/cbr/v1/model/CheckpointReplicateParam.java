package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CheckpointReplicateParam */
public class CheckpointReplicateParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_trigger")

    private Boolean autoTrigger;

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
    @JsonProperty(value = "enable_acceleration")

    private Boolean enableAcceleration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    public CheckpointReplicateParam withAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
        return this;
    }

    /** 本次复制是否自动触发，默认为false，代表手动触发
     * 
     * @return autoTrigger */
    public Boolean getAutoTrigger() {
        return autoTrigger;
    }

    public void setAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
    }

    public CheckpointReplicateParam withDestinationProjectId(String destinationProjectId) {
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

    public CheckpointReplicateParam withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /** 复制的目标区域id
     * 
     * @return destinationRegion */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public CheckpointReplicateParam withDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
        return this;
    }

    /** 目标区域存储库ID
     * 
     * @return destinationVaultId */
    public String getDestinationVaultId() {
        return destinationVaultId;
    }

    public void setDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
    }

    public CheckpointReplicateParam withEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
        return this;
    }

    /** 跨区域复制时，是否启用加速从而缩短复制的时间，如果不指定，默认不启用加速，如果启用加速，会额外收取加速的费用。
     * 
     * @return enableAcceleration */
    public Boolean getEnableAcceleration() {
        return enableAcceleration;
    }

    public void setEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
    }

    public CheckpointReplicateParam withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /** 存储库ID: uuid
     * 
     * @return vaultId */
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
        CheckpointReplicateParam checkpointReplicateParam = (CheckpointReplicateParam) o;
        return Objects.equals(this.autoTrigger, checkpointReplicateParam.autoTrigger)
            && Objects.equals(this.destinationProjectId, checkpointReplicateParam.destinationProjectId)
            && Objects.equals(this.destinationRegion, checkpointReplicateParam.destinationRegion)
            && Objects.equals(this.destinationVaultId, checkpointReplicateParam.destinationVaultId)
            && Objects.equals(this.enableAcceleration, checkpointReplicateParam.enableAcceleration)
            && Objects.equals(this.vaultId, checkpointReplicateParam.vaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoTrigger,
            destinationProjectId,
            destinationRegion,
            destinationVaultId,
            enableAcceleration,
            vaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointReplicateParam {\n");
        sb.append("    autoTrigger: ").append(toIndentedString(autoTrigger)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationVaultId: ").append(toIndentedString(destinationVaultId)).append("\n");
        sb.append("    enableAcceleration: ").append(toIndentedString(enableAcceleration)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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
