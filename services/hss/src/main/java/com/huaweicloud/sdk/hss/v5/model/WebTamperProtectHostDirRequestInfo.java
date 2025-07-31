package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WebTamperProtectHostDirRequestInfo
 */
public class WebTamperProtectHostDirRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_dir")

    private String protectDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_child_dir")

    private String excludeChildDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_file_path")

    private String excludeFilePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_backup_dir")

    private String localBackupDir;

    public WebTamperProtectHostDirRequestInfo withProtectDir(String protectDir) {
        this.protectDir = protectDir;
        return this;
    }

    /**
     * 防护目录
     * @return protectDir
     */
    public String getProtectDir() {
        return protectDir;
    }

    public void setProtectDir(String protectDir) {
        this.protectDir = protectDir;
    }

    public WebTamperProtectHostDirRequestInfo withExcludeChildDir(String excludeChildDir) {
        this.excludeChildDir = excludeChildDir;
        return this;
    }

    /**
     * 排除子目录
     * @return excludeChildDir
     */
    public String getExcludeChildDir() {
        return excludeChildDir;
    }

    public void setExcludeChildDir(String excludeChildDir) {
        this.excludeChildDir = excludeChildDir;
    }

    public WebTamperProtectHostDirRequestInfo withExcludeFilePath(String excludeFilePath) {
        this.excludeFilePath = excludeFilePath;
        return this;
    }

    /**
     * 排除文件路径
     * @return excludeFilePath
     */
    public String getExcludeFilePath() {
        return excludeFilePath;
    }

    public void setExcludeFilePath(String excludeFilePath) {
        this.excludeFilePath = excludeFilePath;
    }

    public WebTamperProtectHostDirRequestInfo withLocalBackupDir(String localBackupDir) {
        this.localBackupDir = localBackupDir;
        return this;
    }

    /**
     * 本地备份路径
     * @return localBackupDir
     */
    public String getLocalBackupDir() {
        return localBackupDir;
    }

    public void setLocalBackupDir(String localBackupDir) {
        this.localBackupDir = localBackupDir;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebTamperProtectHostDirRequestInfo that = (WebTamperProtectHostDirRequestInfo) obj;
        return Objects.equals(this.protectDir, that.protectDir)
            && Objects.equals(this.excludeChildDir, that.excludeChildDir)
            && Objects.equals(this.excludeFilePath, that.excludeFilePath)
            && Objects.equals(this.localBackupDir, that.localBackupDir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectDir, excludeChildDir, excludeFilePath, localBackupDir);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebTamperProtectHostDirRequestInfo {\n");
        sb.append("    protectDir: ").append(toIndentedString(protectDir)).append("\n");
        sb.append("    excludeChildDir: ").append(toIndentedString(excludeChildDir)).append("\n");
        sb.append("    excludeFilePath: ").append(toIndentedString(excludeFilePath)).append("\n");
        sb.append("    localBackupDir: ").append(toIndentedString(localBackupDir)).append("\n");
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
