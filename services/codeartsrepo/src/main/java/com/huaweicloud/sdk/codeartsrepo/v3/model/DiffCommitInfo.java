package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiffCommitInfo
 */
public class DiffCommitInfo {

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

    public DiffCommitInfo withOldPath(String oldPath) {
        this.oldPath = oldPath;
        return this;
    }

    /**
     * 变更前文件路径
     * @return oldPath
     */
    public String getOldPath() {
        return oldPath;
    }

    public void setOldPath(String oldPath) {
        this.oldPath = oldPath;
    }

    public DiffCommitInfo withNewPath(String newPath) {
        this.newPath = newPath;
        return this;
    }

    /**
     * 变更后文件路径
     * @return newPath
     */
    public String getNewPath() {
        return newPath;
    }

    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }

    public DiffCommitInfo withAMode(String aMode) {
        this.aMode = aMode;
        return this;
    }

    /**
     * 变更前文件模式
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

    public DiffCommitInfo withBMode(String bMode) {
        this.bMode = bMode;
        return this;
    }

    /**
     * 变更后文件模式
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

    public DiffCommitInfo withNewFile(Boolean newFile) {
        this.newFile = newFile;
        return this;
    }

    /**
     * 此次变更是否新增文件
     * @return newFile
     */
    public Boolean getNewFile() {
        return newFile;
    }

    public void setNewFile(Boolean newFile) {
        this.newFile = newFile;
    }

    public DiffCommitInfo withRenamedFile(Boolean renamedFile) {
        this.renamedFile = renamedFile;
        return this;
    }

    /**
     * 此次变更是否重命名文件
     * @return renamedFile
     */
    public Boolean getRenamedFile() {
        return renamedFile;
    }

    public void setRenamedFile(Boolean renamedFile) {
        this.renamedFile = renamedFile;
    }

    public DiffCommitInfo withDeletedFile(Boolean deletedFile) {
        this.deletedFile = deletedFile;
        return this;
    }

    /**
     * 此次变更是否删除文件
     * @return deletedFile
     */
    public Boolean getDeletedFile() {
        return deletedFile;
    }

    public void setDeletedFile(Boolean deletedFile) {
        this.deletedFile = deletedFile;
    }

    public DiffCommitInfo withDiff(String diff) {
        this.diff = diff;
        return this;
    }

    /**
     * 差异信息
     * @return diff
     */
    public String getDiff() {
        return diff;
    }

    public void setDiff(String diff) {
        this.diff = diff;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiffCommitInfo that = (DiffCommitInfo) obj;
        return Objects.equals(this.oldPath, that.oldPath) && Objects.equals(this.newPath, that.newPath)
            && Objects.equals(this.aMode, that.aMode) && Objects.equals(this.bMode, that.bMode)
            && Objects.equals(this.newFile, that.newFile) && Objects.equals(this.renamedFile, that.renamedFile)
            && Objects.equals(this.deletedFile, that.deletedFile) && Objects.equals(this.diff, that.diff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldPath, newPath, aMode, bMode, newFile, renamedFile, deletedFile, diff);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiffCommitInfo {\n");
        sb.append("    oldPath: ").append(toIndentedString(oldPath)).append("\n");
        sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
        sb.append("    aMode: ").append(toIndentedString(aMode)).append("\n");
        sb.append("    bMode: ").append(toIndentedString(bMode)).append("\n");
        sb.append("    newFile: ").append(toIndentedString(newFile)).append("\n");
        sb.append("    renamedFile: ").append(toIndentedString(renamedFile)).append("\n");
        sb.append("    deletedFile: ").append(toIndentedString(deletedFile)).append("\n");
        sb.append("    diff: ").append(toIndentedString(diff)).append("\n");
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
