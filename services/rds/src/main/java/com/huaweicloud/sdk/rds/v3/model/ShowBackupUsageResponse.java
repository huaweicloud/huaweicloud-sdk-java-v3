package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowBackupUsageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_use_space")

    private Double backupUseSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_use_space")

    private Double dbUseSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_snapshot_use_space")

    private Double rdsSnapshotUseSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offsite_use_space")

    private Double offsiteUseSpace;

    public ShowBackupUsageResponse withBackupUseSpace(Double backupUseSpace) {
        this.backupUseSpace = backupUseSpace;
        return this;
    }

    /**
     * **参数解释**：  备份总使用量，各类备份占用的备份总大小。 单位：MB  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return backupUseSpace
     */
    public Double getBackupUseSpace() {
        return backupUseSpace;
    }

    public void setBackupUseSpace(Double backupUseSpace) {
        this.backupUseSpace = backupUseSpace;
    }

    public ShowBackupUsageResponse withDbUseSpace(Double dbUseSpace) {
        this.dbUseSpace = dbUseSpace;
        return this;
    }

    /**
     * **参数解释**：  物理备份总使用量，包括本区域的物理全量备份，binlog日志备份，审计日志。 单位：MB  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return dbUseSpace
     */
    public Double getDbUseSpace() {
        return dbUseSpace;
    }

    public void setDbUseSpace(Double dbUseSpace) {
        this.dbUseSpace = dbUseSpace;
    }

    public ShowBackupUsageResponse withRdsSnapshotUseSpace(Double rdsSnapshotUseSpace) {
        this.rdsSnapshotUseSpace = rdsSnapshotUseSpace;
        return this;
    }

    /**
     * **参数解释**：  由RDS计费的cbr快照备份总使用量， 单位MB  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return rdsSnapshotUseSpace
     */
    public Double getRdsSnapshotUseSpace() {
        return rdsSnapshotUseSpace;
    }

    public void setRdsSnapshotUseSpace(Double rdsSnapshotUseSpace) {
        this.rdsSnapshotUseSpace = rdsSnapshotUseSpace;
    }

    public ShowBackupUsageResponse withOffsiteUseSpace(Double offsiteUseSpace) {
        this.offsiteUseSpace = offsiteUseSpace;
        return this;
    }

    /**
     * **参数解释**：  跨区域备份总使用量，包括跨区域的物理全量备份，binlog日志备份， 单位：MB  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return offsiteUseSpace
     */
    public Double getOffsiteUseSpace() {
        return offsiteUseSpace;
    }

    public void setOffsiteUseSpace(Double offsiteUseSpace) {
        this.offsiteUseSpace = offsiteUseSpace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBackupUsageResponse that = (ShowBackupUsageResponse) obj;
        return Objects.equals(this.backupUseSpace, that.backupUseSpace)
            && Objects.equals(this.dbUseSpace, that.dbUseSpace)
            && Objects.equals(this.rdsSnapshotUseSpace, that.rdsSnapshotUseSpace)
            && Objects.equals(this.offsiteUseSpace, that.offsiteUseSpace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupUseSpace, dbUseSpace, rdsSnapshotUseSpace, offsiteUseSpace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupUsageResponse {\n");
        sb.append("    backupUseSpace: ").append(toIndentedString(backupUseSpace)).append("\n");
        sb.append("    dbUseSpace: ").append(toIndentedString(dbUseSpace)).append("\n");
        sb.append("    rdsSnapshotUseSpace: ").append(toIndentedString(rdsSnapshotUseSpace)).append("\n");
        sb.append("    offsiteUseSpace: ").append(toIndentedString(offsiteUseSpace)).append("\n");
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
