package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BackupSpaceUsage
 */
public class BackupSpaceUsage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_usage")

    private Long backupUsage;

    public BackupSpaceUsage withBackupUsage(Long backupUsage) {
        this.backupUsage = backupUsage;
        return this;
    }

    /**
     * **参数解释：** 备份空间使用量。 **取值范围：** 不涉及。
     * @return backupUsage
     */
    public Long getBackupUsage() {
        return backupUsage;
    }

    public void setBackupUsage(Long backupUsage) {
        this.backupUsage = backupUsage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupSpaceUsage that = (BackupSpaceUsage) obj;
        return Objects.equals(this.backupUsage, that.backupUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupUsage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupSpaceUsage {\n");
        sb.append("    backupUsage: ").append(toIndentedString(backupUsage)).append("\n");
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
