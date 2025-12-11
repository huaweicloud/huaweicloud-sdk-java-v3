package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WtpProtectHostDirResponseInfo
 */
public class WtpProtectHostDirResponseInfo {

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
    @JsonProperty(value = "exclue_file_path")

    private String exclueFilePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_backup_dir")

    private String localBackupDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private String error;

    public WtpProtectHostDirResponseInfo withProtectDir(String protectDir) {
        this.protectDir = protectDir;
        return this;
    }

    /**
     * **参数解释**: 防护目录 **取值范围**: 字符长度0-512位 
     * @return protectDir
     */
    public String getProtectDir() {
        return protectDir;
    }

    public void setProtectDir(String protectDir) {
        this.protectDir = protectDir;
    }

    public WtpProtectHostDirResponseInfo withExcludeChildDir(String excludeChildDir) {
        this.excludeChildDir = excludeChildDir;
        return this;
    }

    /**
     * **参数解释**: 排除子目录 **取值范围**: 字符长度0-512位 
     * @return excludeChildDir
     */
    public String getExcludeChildDir() {
        return excludeChildDir;
    }

    public void setExcludeChildDir(String excludeChildDir) {
        this.excludeChildDir = excludeChildDir;
    }

    public WtpProtectHostDirResponseInfo withExcludeFilePath(String excludeFilePath) {
        this.excludeFilePath = excludeFilePath;
        return this;
    }

    /**
     * **参数解释**: 排除文件路径 **取值范围**: 字符长度0-512位 
     * @return excludeFilePath
     */
    public String getExcludeFilePath() {
        return excludeFilePath;
    }

    public void setExcludeFilePath(String excludeFilePath) {
        this.excludeFilePath = excludeFilePath;
    }

    public WtpProtectHostDirResponseInfo withExclueFilePath(String exclueFilePath) {
        this.exclueFilePath = exclueFilePath;
        return this;
    }

    /**
     * **参数解释**: 排除文件路径--字段已废弃，请使用exclude_file_path。 **取值范围**: 字符长度0-512位 
     * @return exclueFilePath
     */
    public String getExclueFilePath() {
        return exclueFilePath;
    }

    public void setExclueFilePath(String exclueFilePath) {
        this.exclueFilePath = exclueFilePath;
    }

    public WtpProtectHostDirResponseInfo withLocalBackupDir(String localBackupDir) {
        this.localBackupDir = localBackupDir;
        return this;
    }

    /**
     * **参数解释**: 本地备份路径，仅Linux服务器支持设置本地备份路径。 **取值范围**: 字符长度0-512位 
     * @return localBackupDir
     */
    public String getLocalBackupDir() {
        return localBackupDir;
    }

    public void setLocalBackupDir(String localBackupDir) {
        this.localBackupDir = localBackupDir;
    }

    public WtpProtectHostDirResponseInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * **参数解释**: 防护状态 **取值范围**: - closed ：未开启。 - opened ：防护中。 - opening ：开启中。 - closing ：关闭中。 - open_failed ：防护失败。 
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public WtpProtectHostDirResponseInfo withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * **参数解释**: 失败原因，当防护状态为open_failed时存在失败原因 **取值范围**: 字符长度0-512位 
     * @return error
     */
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WtpProtectHostDirResponseInfo that = (WtpProtectHostDirResponseInfo) obj;
        return Objects.equals(this.protectDir, that.protectDir)
            && Objects.equals(this.excludeChildDir, that.excludeChildDir)
            && Objects.equals(this.excludeFilePath, that.excludeFilePath)
            && Objects.equals(this.exclueFilePath, that.exclueFilePath)
            && Objects.equals(this.localBackupDir, that.localBackupDir)
            && Objects.equals(this.protectStatus, that.protectStatus) && Objects.equals(this.error, that.error);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(protectDir, excludeChildDir, excludeFilePath, exclueFilePath, localBackupDir, protectStatus, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WtpProtectHostDirResponseInfo {\n");
        sb.append("    protectDir: ").append(toIndentedString(protectDir)).append("\n");
        sb.append("    excludeChildDir: ").append(toIndentedString(excludeChildDir)).append("\n");
        sb.append("    excludeFilePath: ").append(toIndentedString(excludeFilePath)).append("\n");
        sb.append("    exclueFilePath: ").append(toIndentedString(exclueFilePath)).append("\n");
        sb.append("    localBackupDir: ").append(toIndentedString(localBackupDir)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
