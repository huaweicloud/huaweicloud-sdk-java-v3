package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 超阈值实例信息
 */
public class ExceededInstanceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_usage_gb")

    private Double obsUsageGb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_free_backup_space_gb")

    private Double obsFreeBackupSpaceGb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_usage_gb")

    private Double snapshotUsageGb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_free_backup_space_gb")

    private Double snapshotFreeBackupSpaceGb;

    public ExceededInstanceInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ExceededInstanceInfo withObsUsageGb(Double obsUsageGb) {
        this.obsUsageGb = obsUsageGb;
        return this;
    }

    /**
     * **参数解释**：  日志备份空间使用量，单位GB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return obsUsageGb
     */
    public Double getObsUsageGb() {
        return obsUsageGb;
    }

    public void setObsUsageGb(Double obsUsageGb) {
        this.obsUsageGb = obsUsageGb;
    }

    public ExceededInstanceInfo withObsFreeBackupSpaceGb(Double obsFreeBackupSpaceGb) {
        this.obsFreeBackupSpaceGb = obsFreeBackupSpaceGb;
        return this;
    }

    /**
     * **参数解释**：  日志备份免费备份空间额度，单位GB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return obsFreeBackupSpaceGb
     */
    public Double getObsFreeBackupSpaceGb() {
        return obsFreeBackupSpaceGb;
    }

    public void setObsFreeBackupSpaceGb(Double obsFreeBackupSpaceGb) {
        this.obsFreeBackupSpaceGb = obsFreeBackupSpaceGb;
    }

    public ExceededInstanceInfo withSnapshotUsageGb(Double snapshotUsageGb) {
        this.snapshotUsageGb = snapshotUsageGb;
        return this;
    }

    /**
     * **参数解释**：  快照备份空间使用量，单位GB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return snapshotUsageGb
     */
    public Double getSnapshotUsageGb() {
        return snapshotUsageGb;
    }

    public void setSnapshotUsageGb(Double snapshotUsageGb) {
        this.snapshotUsageGb = snapshotUsageGb;
    }

    public ExceededInstanceInfo withSnapshotFreeBackupSpaceGb(Double snapshotFreeBackupSpaceGb) {
        this.snapshotFreeBackupSpaceGb = snapshotFreeBackupSpaceGb;
        return this;
    }

    /**
     * **参数解释**：  快照免费备份空间额度，单位GB。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return snapshotFreeBackupSpaceGb
     */
    public Double getSnapshotFreeBackupSpaceGb() {
        return snapshotFreeBackupSpaceGb;
    }

    public void setSnapshotFreeBackupSpaceGb(Double snapshotFreeBackupSpaceGb) {
        this.snapshotFreeBackupSpaceGb = snapshotFreeBackupSpaceGb;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExceededInstanceInfo that = (ExceededInstanceInfo) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.obsUsageGb, that.obsUsageGb)
            && Objects.equals(this.obsFreeBackupSpaceGb, that.obsFreeBackupSpaceGb)
            && Objects.equals(this.snapshotUsageGb, that.snapshotUsageGb)
            && Objects.equals(this.snapshotFreeBackupSpaceGb, that.snapshotFreeBackupSpaceGb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, obsUsageGb, obsFreeBackupSpaceGb, snapshotUsageGb, snapshotFreeBackupSpaceGb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExceededInstanceInfo {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    obsUsageGb: ").append(toIndentedString(obsUsageGb)).append("\n");
        sb.append("    obsFreeBackupSpaceGb: ").append(toIndentedString(obsFreeBackupSpaceGb)).append("\n");
        sb.append("    snapshotUsageGb: ").append(toIndentedString(snapshotUsageGb)).append("\n");
        sb.append("    snapshotFreeBackupSpaceGb: ").append(toIndentedString(snapshotFreeBackupSpaceGb)).append("\n");
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
