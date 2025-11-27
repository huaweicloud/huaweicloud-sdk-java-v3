package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**:  防护配置关联的容器的防护目录 **取值范围**: 不涉及 
 */
public class WebTamperProtectionDirectoryResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_directory")

    private String protectDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_directory")

    private String backupDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_child_directory_list")

    private List<String> excludeChildDirectoryList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_file_list")

    private List<String> excludeFileList = null;

    public WebTamperProtectionDirectoryResponseInfo withProtectDirectory(String protectDirectory) {
        this.protectDirectory = protectDirectory;
        return this;
    }

    /**
     * **参数解释**： 集群ID **取值范围**： 字符长度1-256位 
     * @return protectDirectory
     */
    public String getProtectDirectory() {
        return protectDirectory;
    }

    public void setProtectDirectory(String protectDirectory) {
        this.protectDirectory = protectDirectory;
    }

    public WebTamperProtectionDirectoryResponseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 防护状态 **取值范围**: - protected：防护中 - protect_failed：防护失败 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WebTamperProtectionDirectoryResponseInfo withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * **参数解释**： 防护失败原因 **取值范围**： 字符长度1-256位 
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public WebTamperProtectionDirectoryResponseInfo withBackupDirectory(String backupDirectory) {
        this.backupDirectory = backupDirectory;
        return this;
    }

    /**
     * **参数解释**： 本地备份路径 **取值范围**： 字符长度1-256位 
     * @return backupDirectory
     */
    public String getBackupDirectory() {
        return backupDirectory;
    }

    public void setBackupDirectory(String backupDirectory) {
        this.backupDirectory = backupDirectory;
    }

    public WebTamperProtectionDirectoryResponseInfo withExcludeChildDirectoryList(
        List<String> excludeChildDirectoryList) {
        this.excludeChildDirectoryList = excludeChildDirectoryList;
        return this;
    }

    public WebTamperProtectionDirectoryResponseInfo addExcludeChildDirectoryListItem(
        String excludeChildDirectoryListItem) {
        if (this.excludeChildDirectoryList == null) {
            this.excludeChildDirectoryList = new ArrayList<>();
        }
        this.excludeChildDirectoryList.add(excludeChildDirectoryListItem);
        return this;
    }

    public WebTamperProtectionDirectoryResponseInfo withExcludeChildDirectoryList(
        Consumer<List<String>> excludeChildDirectoryListSetter) {
        if (this.excludeChildDirectoryList == null) {
            this.excludeChildDirectoryList = new ArrayList<>();
        }
        excludeChildDirectoryListSetter.accept(this.excludeChildDirectoryList);
        return this;
    }

    /**
     * **参数解释**： 需要排除的子目录列表 **取值范围**： 最少0条，最多10条 
     * @return excludeChildDirectoryList
     */
    public List<String> getExcludeChildDirectoryList() {
        return excludeChildDirectoryList;
    }

    public void setExcludeChildDirectoryList(List<String> excludeChildDirectoryList) {
        this.excludeChildDirectoryList = excludeChildDirectoryList;
    }

    public WebTamperProtectionDirectoryResponseInfo withExcludeFileList(List<String> excludeFileList) {
        this.excludeFileList = excludeFileList;
        return this;
    }

    public WebTamperProtectionDirectoryResponseInfo addExcludeFileListItem(String excludeFileListItem) {
        if (this.excludeFileList == null) {
            this.excludeFileList = new ArrayList<>();
        }
        this.excludeFileList.add(excludeFileListItem);
        return this;
    }

    public WebTamperProtectionDirectoryResponseInfo withExcludeFileList(Consumer<List<String>> excludeFileListSetter) {
        if (this.excludeFileList == null) {
            this.excludeFileList = new ArrayList<>();
        }
        excludeFileListSetter.accept(this.excludeFileList);
        return this;
    }

    /**
     * **参数解释**： 需要排除的子文件列表 **取值范围**： 最少0条，最多10条 
     * @return excludeFileList
     */
    public List<String> getExcludeFileList() {
        return excludeFileList;
    }

    public void setExcludeFileList(List<String> excludeFileList) {
        this.excludeFileList = excludeFileList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebTamperProtectionDirectoryResponseInfo that = (WebTamperProtectionDirectoryResponseInfo) obj;
        return Objects.equals(this.protectDirectory, that.protectDirectory) && Objects.equals(this.status, that.status)
            && Objects.equals(this.failedReason, that.failedReason)
            && Objects.equals(this.backupDirectory, that.backupDirectory)
            && Objects.equals(this.excludeChildDirectoryList, that.excludeChildDirectoryList)
            && Objects.equals(this.excludeFileList, that.excludeFileList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(protectDirectory, status, failedReason, backupDirectory, excludeChildDirectoryList, excludeFileList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebTamperProtectionDirectoryResponseInfo {\n");
        sb.append("    protectDirectory: ").append(toIndentedString(protectDirectory)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    backupDirectory: ").append(toIndentedString(backupDirectory)).append("\n");
        sb.append("    excludeChildDirectoryList: ").append(toIndentedString(excludeChildDirectoryList)).append("\n");
        sb.append("    excludeFileList: ").append(toIndentedString(excludeFileList)).append("\n");
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
