package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 文件变更详情
 */
public class FileChangeDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_path")

    private String oldPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_path")

    private String newPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "a_mode")

    private String aMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "b_mode")

    private String bMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode_changed")

    private Boolean modeChanged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_file")

    private Boolean newFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "renamed_file")

    private Boolean renamedFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted_file")

    private Boolean deletedFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff")

    private String diff;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binary")

    private Boolean binary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "too_large")

    private Boolean tooLarge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collapsed")

    private Boolean collapsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added_lines")

    private Integer addedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removed_lines")

    private Integer removedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_sha")

    private String contentSha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_refs")

    private DiffRefDto diffRefs;

    public FileChangeDto withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public FileChangeDto withOldPath(String oldPath) {
        this.oldPath = oldPath;
        return this;
    }

    /**
     * 变更文件源分支路径
     * @return oldPath
     */
    public String getOldPath() {
        return oldPath;
    }

    public void setOldPath(String oldPath) {
        this.oldPath = oldPath;
    }

    public FileChangeDto withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }

    /**
     * 变更文件目标分支路径
     * @return newPath
     */
    public String getNewPath() {
        return newPath;
    }

    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }

    public FileChangeDto withAMode(String aMode) {
        this.aMode = aMode;
        return this;
    }

    /**
     * 旧文件权限
     * @return aMode
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "a_mode")
    public String getAMode() {
        return aMode;
    }

    public void setAMode(String aMode) {
        this.aMode = aMode;
    }

    public FileChangeDto withBMode(String bMode) {
        this.bMode = bMode;
        return this;
    }

    /**
     * 新文件权限
     * @return bMode
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "b_mode")
    public String getBMode() {
        return bMode;
    }

    public void setBMode(String bMode) {
        this.bMode = bMode;
    }

    public FileChangeDto withModeChanged(Boolean modeChanged) {
        this.modeChanged = modeChanged;
        return this;
    }

    /**
     * 文件权限是否变更
     * @return modeChanged
     */
    public Boolean getModeChanged() {
        return modeChanged;
    }

    public void setModeChanged(Boolean modeChanged) {
        this.modeChanged = modeChanged;
    }

    public FileChangeDto withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文件类型
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public FileChangeDto withNewFile(Boolean newFile) {
        this.newFile = newFile;
        return this;
    }

    /**
     * 是否为新增文件
     * @return newFile
     */
    public Boolean getNewFile() {
        return newFile;
    }

    public void setNewFile(Boolean newFile) {
        this.newFile = newFile;
    }

    public FileChangeDto withRenamedFile(Boolean renamedFile) {
        this.renamedFile = renamedFile;
        return this;
    }

    /**
     * 是否为重命名文件
     * @return renamedFile
     */
    public Boolean getRenamedFile() {
        return renamedFile;
    }

    public void setRenamedFile(Boolean renamedFile) {
        this.renamedFile = renamedFile;
    }

    public FileChangeDto withDeletedFile(Boolean deletedFile) {
        this.deletedFile = deletedFile;
        return this;
    }

    /**
     * 是否为删除文件
     * @return deletedFile
     */
    public Boolean getDeletedFile() {
        return deletedFile;
    }

    public void setDeletedFile(Boolean deletedFile) {
        this.deletedFile = deletedFile;
    }

    public FileChangeDto withDiff(String diff) {
        this.diff = diff;
        return this;
    }

    /**
     * 变更文件内容
     * @return diff
     */
    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public FileChangeDto withBinary(Boolean binary) {
        this.binary = binary;
        return this;
    }

    /**
     * 是否为二进制文件
     * @return binary
     */
    public Boolean getBinary() {
        return binary;
    }

    public void setBinary(Boolean binary) {
        this.binary = binary;
    }

    public FileChangeDto withTooLarge(Boolean tooLarge) {
        this.tooLarge = tooLarge;
        return this;
    }

    /**
     * 是否为大文件
     * @return tooLarge
     */
    public Boolean getTooLarge() {
        return tooLarge;
    }

    public void setTooLarge(Boolean tooLarge) {
        this.tooLarge = tooLarge;
    }

    public FileChangeDto withCollapsed(Boolean collapsed) {
        this.collapsed = collapsed;
        return this;
    }

    /**
     * 是否折叠文件
     * @return collapsed
     */
    public Boolean getCollapsed() {
        return collapsed;
    }

    public void setCollapsed(Boolean collapsed) {
        this.collapsed = collapsed;
    }

    public FileChangeDto withAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
        return this;
    }

    /**
     * 文件新增行
     * @return addedLines
     */
    public Integer getAddedLines() {
        return addedLines;
    }

    public void setAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
    }

    public FileChangeDto withRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
        return this;
    }

    /**
     * 文件删除行
     * @return removedLines
     */
    public Integer getRemovedLines() {
        return removedLines;
    }

    public void setRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
    }

    public FileChangeDto withContentSha(String contentSha) {
        this.contentSha = contentSha;
        return this;
    }

    /**
     * 文件最新commitId
     * @return contentSha
     */
    public String getContentSha() {
        return contentSha;
    }

    public void setContentSha(String contentSha) {
        this.contentSha = contentSha;
    }

    public FileChangeDto withDiffRefs(DiffRefDto diffRefs) {
        this.diffRefs = diffRefs;
        return this;
    }

    public FileChangeDto withDiffRefs(Consumer<DiffRefDto> diffRefsSetter) {
        if (this.diffRefs == null) {
            this.diffRefs = new DiffRefDto();
            diffRefsSetter.accept(this.diffRefs);
        }

        return this;
    }

    /**
     * Get diffRefs
     * @return diffRefs
     */
    public DiffRefDto getDiffRefs() {
        return diffRefs;
    }

    public void setDiffRefs(DiffRefDto diffRefs) {
        this.diffRefs = diffRefs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileChangeDto that = (FileChangeDto) obj;
        return Objects.equals(this.filePath, that.filePath) && Objects.equals(this.oldPath, that.oldPath)
            && Objects.equals(this.newPath, that.newPath) && Objects.equals(this.aMode, that.aMode)
            && Objects.equals(this.bMode, that.bMode) && Objects.equals(this.modeChanged, that.modeChanged)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.newFile, that.newFile)
            && Objects.equals(this.renamedFile, that.renamedFile) && Objects.equals(this.deletedFile, that.deletedFile)
            && Objects.equals(this.diff, that.diff) && Objects.equals(this.binary, that.binary)
            && Objects.equals(this.tooLarge, that.tooLarge) && Objects.equals(this.collapsed, that.collapsed)
            && Objects.equals(this.addedLines, that.addedLines) && Objects.equals(this.removedLines, that.removedLines)
            && Objects.equals(this.contentSha, that.contentSha) && Objects.equals(this.diffRefs, that.diffRefs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath,
            oldPath,
            newPath,
            aMode,
            bMode,
            modeChanged,
            fileType,
            newFile,
            renamedFile,
            deletedFile,
            diff,
            binary,
            tooLarge,
            collapsed,
            addedLines,
            removedLines,
            contentSha,
            diffRefs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileChangeDto {\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    oldPath: ").append(toIndentedString(oldPath)).append("\n");
        sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
        sb.append("    aMode: ").append(toIndentedString(aMode)).append("\n");
        sb.append("    bMode: ").append(toIndentedString(bMode)).append("\n");
        sb.append("    modeChanged: ").append(toIndentedString(modeChanged)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    newFile: ").append(toIndentedString(newFile)).append("\n");
        sb.append("    renamedFile: ").append(toIndentedString(renamedFile)).append("\n");
        sb.append("    deletedFile: ").append(toIndentedString(deletedFile)).append("\n");
        sb.append("    diff: ").append(toIndentedString(diff)).append("\n");
        sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
        sb.append("    tooLarge: ").append(toIndentedString(tooLarge)).append("\n");
        sb.append("    collapsed: ").append(toIndentedString(collapsed)).append("\n");
        sb.append("    addedLines: ").append(toIndentedString(addedLines)).append("\n");
        sb.append("    removedLines: ").append(toIndentedString(removedLines)).append("\n");
        sb.append("    contentSha: ").append(toIndentedString(contentSha)).append("\n");
        sb.append("    diffRefs: ").append(toIndentedString(diffRefs)).append("\n");
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
