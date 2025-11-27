package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 防护目录信息 **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 不涉及 
 */
public class ProtectDirectoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_directory")

    private String protectDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_child_directory_list")

    private List<String> excludeChildDirectoryList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_file_list")

    private List<String> excludeFileList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_directory")

    private String backupDirectory;

    public ProtectDirectoryInfo withProtectDirectory(String protectDirectory) {
        this.protectDirectory = protectDirectory;
        return this;
    }

    /**
     * **参数解释**： 防护目录 **约束限制**: 不涉及 **取值范围**： 字符长度1-256位 **默认取值**: 不涉及 
     * @return protectDirectory
     */
    public String getProtectDirectory() {
        return protectDirectory;
    }

    public void setProtectDirectory(String protectDirectory) {
        this.protectDirectory = protectDirectory;
    }

    public ProtectDirectoryInfo withExcludeChildDirectoryList(List<String> excludeChildDirectoryList) {
        this.excludeChildDirectoryList = excludeChildDirectoryList;
        return this;
    }

    public ProtectDirectoryInfo addExcludeChildDirectoryListItem(String excludeChildDirectoryListItem) {
        if (this.excludeChildDirectoryList == null) {
            this.excludeChildDirectoryList = new ArrayList<>();
        }
        this.excludeChildDirectoryList.add(excludeChildDirectoryListItem);
        return this;
    }

    public ProtectDirectoryInfo withExcludeChildDirectoryList(Consumer<List<String>> excludeChildDirectoryListSetter) {
        if (this.excludeChildDirectoryList == null) {
            this.excludeChildDirectoryList = new ArrayList<>();
        }
        excludeChildDirectoryListSetter.accept(this.excludeChildDirectoryList);
        return this;
    }

    /**
     * **参数解释**： 需要排除的子目录列表 **约束限制**: 不涉及 **取值范围**： 最少0条，最多10条 **默认取值**: 不涉及 
     * @return excludeChildDirectoryList
     */
    public List<String> getExcludeChildDirectoryList() {
        return excludeChildDirectoryList;
    }

    public void setExcludeChildDirectoryList(List<String> excludeChildDirectoryList) {
        this.excludeChildDirectoryList = excludeChildDirectoryList;
    }

    public ProtectDirectoryInfo withExcludeFileList(List<String> excludeFileList) {
        this.excludeFileList = excludeFileList;
        return this;
    }

    public ProtectDirectoryInfo addExcludeFileListItem(String excludeFileListItem) {
        if (this.excludeFileList == null) {
            this.excludeFileList = new ArrayList<>();
        }
        this.excludeFileList.add(excludeFileListItem);
        return this;
    }

    public ProtectDirectoryInfo withExcludeFileList(Consumer<List<String>> excludeFileListSetter) {
        if (this.excludeFileList == null) {
            this.excludeFileList = new ArrayList<>();
        }
        excludeFileListSetter.accept(this.excludeFileList);
        return this;
    }

    /**
     * **参数解释**： 需要排除的子文件列表 **约束限制**: 不涉及 **取值范围**： 最少0条，最多10条 **默认取值**: 不涉及 
     * @return excludeFileList
     */
    public List<String> getExcludeFileList() {
        return excludeFileList;
    }

    public void setExcludeFileList(List<String> excludeFileList) {
        this.excludeFileList = excludeFileList;
    }

    public ProtectDirectoryInfo withBackupDirectory(String backupDirectory) {
        this.backupDirectory = backupDirectory;
        return this;
    }

    /**
     * **参数解释**： 备份目录 **约束限制**: 不涉及 **取值范围**： 字符长度1-256位 **默认取值**: 不涉及 
     * @return backupDirectory
     */
    public String getBackupDirectory() {
        return backupDirectory;
    }

    public void setBackupDirectory(String backupDirectory) {
        this.backupDirectory = backupDirectory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectDirectoryInfo that = (ProtectDirectoryInfo) obj;
        return Objects.equals(this.protectDirectory, that.protectDirectory)
            && Objects.equals(this.excludeChildDirectoryList, that.excludeChildDirectoryList)
            && Objects.equals(this.excludeFileList, that.excludeFileList)
            && Objects.equals(this.backupDirectory, that.backupDirectory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protectDirectory, excludeChildDirectoryList, excludeFileList, backupDirectory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectDirectoryInfo {\n");
        sb.append("    protectDirectory: ").append(toIndentedString(protectDirectory)).append("\n");
        sb.append("    excludeChildDirectoryList: ").append(toIndentedString(excludeChildDirectoryList)).append("\n");
        sb.append("    excludeFileList: ").append(toIndentedString(excludeFileList)).append("\n");
        sb.append("    backupDirectory: ").append(toIndentedString(backupDirectory)).append("\n");
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
