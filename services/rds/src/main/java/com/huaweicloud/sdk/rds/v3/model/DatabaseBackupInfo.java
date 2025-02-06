package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DatabaseBackupInfo
 */
public class DatabaseBackupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_file_name")

    private String backupFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_file_size")

    private Long backupFileSize;

    public DatabaseBackupInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 库名
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public DatabaseBackupInfo withBackupFileName(String backupFileName) {
        this.backupFileName = backupFileName;
        return this;
    }

    /**
     * 备份文件名
     * @return backupFileName
     */
    public String getBackupFileName() {
        return backupFileName;
    }

    public void setBackupFileName(String backupFileName) {
        this.backupFileName = backupFileName;
    }

    public DatabaseBackupInfo withBackupFileSize(Long backupFileSize) {
        this.backupFileSize = backupFileSize;
        return this;
    }

    /**
     * 备份文件大小
     * @return backupFileSize
     */
    public Long getBackupFileSize() {
        return backupFileSize;
    }

    public void setBackupFileSize(Long backupFileSize) {
        this.backupFileSize = backupFileSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseBackupInfo that = (DatabaseBackupInfo) obj;
        return Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.backupFileName, that.backupFileName)
            && Objects.equals(this.backupFileSize, that.backupFileSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, backupFileName, backupFileSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseBackupInfo {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    backupFileName: ").append(toIndentedString(backupFileName)).append("\n");
        sb.append("    backupFileSize: ").append(toIndentedString(backupFileSize)).append("\n");
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
