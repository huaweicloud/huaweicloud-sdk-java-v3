package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新请求参数体
 */
public class BackupUpdateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup")

    private BackupUpdate backup;

    public BackupUpdateReq withBackup(BackupUpdate backup) {
        this.backup = backup;
        return this;
    }

    public BackupUpdateReq withBackup(Consumer<BackupUpdate> backupSetter) {
        if (this.backup == null) {
            this.backup = new BackupUpdate();
            backupSetter.accept(this.backup);
        }

        return this;
    }

    /**
     * Get backup
     * @return backup
     */
    public BackupUpdate getBackup() {
        return backup;
    }

    public void setBackup(BackupUpdate backup) {
        this.backup = backup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupUpdateReq backupUpdateReq = (BackupUpdateReq) o;
        return Objects.equals(this.backup, backupUpdateReq.backup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupUpdateReq {\n");
        sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
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
