package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导入备份请求体
 */
public class ImportBackupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_path")

    private String importPath;

    public ImportBackupReq withImportPath(String importPath) {
        this.importPath = importPath;
        return this;
    }

    /**
     * 备份文件路径
     * @return importPath
     */
    public String getImportPath() {
        return importPath;
    }

    public void setImportPath(String importPath) {
        this.importPath = importPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportBackupReq that = (ImportBackupReq) obj;
        return Objects.equals(this.importPath, that.importPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(importPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportBackupReq {\n");
        sb.append("    importPath: ").append(toIndentedString(importPath)).append("\n");
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
