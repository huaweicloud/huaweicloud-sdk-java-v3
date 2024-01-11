package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导出备份请求体
 */
public class ExportBackupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_path")

    private String exportPath;

    public ExportBackupReq withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 备份ID
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public ExportBackupReq withExportPath(String exportPath) {
        this.exportPath = exportPath;
        return this;
    }

    /**
     * 导出路径
     * @return exportPath
     */
    public String getExportPath() {
        return exportPath;
    }

    public void setExportPath(String exportPath) {
        this.exportPath = exportPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportBackupReq that = (ExportBackupReq) obj;
        return Objects.equals(this.backupId, that.backupId) && Objects.equals(this.exportPath, that.exportPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupId, exportPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportBackupReq {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    exportPath: ").append(toIndentedString(exportPath)).append("\n");
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
