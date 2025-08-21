package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FileDiffDto
 */
public class FileDiffDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_path")

    private String oldPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_path")

    private Object newPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "a_mode")

    private String aMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "b_mode")

    private String bMode;

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
    @JsonProperty(value = "too_large")

    private Boolean tooLarge;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "added_lines")

    private Integer addedLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "removed_lines")

    private Integer removedLines;

    public FileDiffDto withOldPath(String oldPath) {
        this.oldPath = oldPath;
        return this;
    }

    /**
     * **参数解释：** 旧文件名称。 **取值范围：** 字符串长度不少于1，不超过10000。
     * @return oldPath
     */
    public String getOldPath() {
        return oldPath;
    }

    public void setOldPath(String oldPath) {
        this.oldPath = oldPath;
    }

    public FileDiffDto withNewPath(Object newPath) {
        this.newPath = newPath;
        return this;
    }

    /**
     * **参数解释：** 新文件名称。 **取值范围：** 字符串长度不少于1，不超过10000。
     * @return newPath
     */
    public Object getNewPath() {
        return newPath;
    }

    public void setNewPath(Object newPath) {
        this.newPath = newPath;
    }

    public FileDiffDto withAMode(String aMode) {
        this.aMode = aMode;
        return this;
    }

    /**
     * **参数解释：** 旧文件权限。
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

    public FileDiffDto withBMode(String bMode) {
        this.bMode = bMode;
        return this;
    }

    /**
     * **参数解释：** 新文件权限。
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

    public FileDiffDto withNewFile(Boolean newFile) {
        this.newFile = newFile;
        return this;
    }

    /**
     * **参数解释：** 是否为新文件。 **取值范围：** - true，新文件。 - false，非新文件
     * @return newFile
     */
    public Boolean getNewFile() {
        return newFile;
    }

    public void setNewFile(Boolean newFile) {
        this.newFile = newFile;
    }

    public FileDiffDto withRenamedFile(Boolean renamedFile) {
        this.renamedFile = renamedFile;
        return this;
    }

    /**
     * **参数解释：** 是否为重命名文件。 **取值范围：** - true，重命名文件。 - false，非重命名文件
     * @return renamedFile
     */
    public Boolean getRenamedFile() {
        return renamedFile;
    }

    public void setRenamedFile(Boolean renamedFile) {
        this.renamedFile = renamedFile;
    }

    public FileDiffDto withDeletedFile(Boolean deletedFile) {
        this.deletedFile = deletedFile;
        return this;
    }

    /**
     * **参数解释：** 是否为被删除文件。 **取值范围：** - true，被删除文件。 - false，非被删除文件
     * @return deletedFile
     */
    public Boolean getDeletedFile() {
        return deletedFile;
    }

    public void setDeletedFile(Boolean deletedFile) {
        this.deletedFile = deletedFile;
    }

    public FileDiffDto withDiff(String diff) {
        this.diff = diff;
        return this;
    }

    /**
     * **参数解释：** 差异信息。
     * @return diff
     */
    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    public FileDiffDto withTooLarge(Boolean tooLarge) {
        this.tooLarge = tooLarge;
        return this;
    }

    /**
     * **参数解释：** 是否为大文件。 **取值范围：** - true，大文件。 - false，非大文件
     * @return tooLarge
     */
    public Boolean getTooLarge() {
        return tooLarge;
    }

    public void setTooLarge(Boolean tooLarge) {
        this.tooLarge = tooLarge;
    }

    public FileDiffDto withAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
        return this;
    }

    /**
     * **参数解释：** 增加行数。
     * minimum: 0
     * maximum: 2147483647
     * @return addedLines
     */
    public Integer getAddedLines() {
        return addedLines;
    }

    public void setAddedLines(Integer addedLines) {
        this.addedLines = addedLines;
    }

    public FileDiffDto withRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
        return this;
    }

    /**
     * **参数解释：** 删除行数。
     * minimum: 0
     * maximum: 2147483647
     * @return removedLines
     */
    public Integer getRemovedLines() {
        return removedLines;
    }

    public void setRemovedLines(Integer removedLines) {
        this.removedLines = removedLines;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileDiffDto that = (FileDiffDto) obj;
        return Objects.equals(this.oldPath, that.oldPath) && Objects.equals(this.newPath, that.newPath)
            && Objects.equals(this.aMode, that.aMode) && Objects.equals(this.bMode, that.bMode)
            && Objects.equals(this.newFile, that.newFile) && Objects.equals(this.renamedFile, that.renamedFile)
            && Objects.equals(this.deletedFile, that.deletedFile) && Objects.equals(this.diff, that.diff)
            && Objects.equals(this.tooLarge, that.tooLarge) && Objects.equals(this.addedLines, that.addedLines)
            && Objects.equals(this.removedLines, that.removedLines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldPath,
            newPath,
            aMode,
            bMode,
            newFile,
            renamedFile,
            deletedFile,
            diff,
            tooLarge,
            addedLines,
            removedLines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileDiffDto {\n");
        sb.append("    oldPath: ").append(toIndentedString(oldPath)).append("\n");
        sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
        sb.append("    aMode: ").append(toIndentedString(aMode)).append("\n");
        sb.append("    bMode: ").append(toIndentedString(bMode)).append("\n");
        sb.append("    newFile: ").append(toIndentedString(newFile)).append("\n");
        sb.append("    renamedFile: ").append(toIndentedString(renamedFile)).append("\n");
        sb.append("    deletedFile: ").append(toIndentedString(deletedFile)).append("\n");
        sb.append("    diff: ").append(toIndentedString(diff)).append("\n");
        sb.append("    tooLarge: ").append(toIndentedString(tooLarge)).append("\n");
        sb.append("    addedLines: ").append(toIndentedString(addedLines)).append("\n");
        sb.append("    removedLines: ").append(toIndentedString(removedLines)).append("\n");
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
