package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 防护目录信息
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
     * **参数解释**: 防护目录 **约束限制**: 不涉及 **取值范围**: 字符长度1-256位。Linux服务器，必须以/开头，不能以/结尾，只能包含英文大小写字母，数字，下划线，中划线和点。Windows服务器，目录名不能包含;/_*?\"<>|，不能以空格开头，不能以\\结尾。 **默认取值**: 不涉及 
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
     * **参数解释**: 排除子目录 **约束限制**: 不涉及 **取值范围**: 子目录名必须是防护目录的有效相对路径，目录名最大长度不能超过256个字符，最多可添加10个子目录，多个子目录用;隔开。Linux服务器的子目录名不能以/开头或结尾，Windows服务器的子目录名不能以\\开头或结尾。 **默认取值**: 不涉及 
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
     * **参数解释**: 排除文件路径 **约束限制**: 仅Linux服务器支持填写排除文件路径，Windows服务器不可填写该字段。 **取值范围**: 排除文件路径必须是防护目录的有效相对路径，不能以/开头或结尾，文件路径最大长度不能超过256个字符；最多可添加50个文件路径，多个文件路径用;隔开。 **默认取值**: 不涉及 
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
     * **参数解释**: 本地备份路径，Linux服务器必须填写该字段。 **约束限制**: 仅Linux服务器需要填写本地备份路径，Windows服务器不可填写该字段。 **取值范围**: 本地备份路径不能包含;字符，不能以空格开头，不能以/结尾，本地备份路径长度不得超过256个字符。 **默认取值**: 不涉及 
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
