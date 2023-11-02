package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlertFileInfo
 */
public class AlertFileInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_content")

    private String fileContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_new_path")

    private String fileNewPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_hash")

    private String fileHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_md5")

    private String fileMd5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_sha256")

    private String fileSha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_attr")

    private String fileAttr;

    public AlertFileInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件路径/名称
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public AlertFileInfo withFileContent(String fileContent) {
        this.fileContent = fileContent;
        return this;
    }

    /**
     * 文件内容
     * @return fileContent
     */
    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public AlertFileInfo withFileNewPath(String fileNewPath) {
        this.fileNewPath = fileNewPath;
        return this;
    }

    /**
     * 文件新路径/名称
     * @return fileNewPath
     */
    public String getFileNewPath() {
        return fileNewPath;
    }

    public void setFileNewPath(String fileNewPath) {
        this.fileNewPath = fileNewPath;
    }

    public AlertFileInfo withFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }

    /**
     * 文件hash
     * @return fileHash
     */
    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public AlertFileInfo withFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }

    /**
     * 文件md5
     * @return fileMd5
     */
    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public AlertFileInfo withFileSha256(String fileSha256) {
        this.fileSha256 = fileSha256;
        return this;
    }

    /**
     * 文件sha256
     * @return fileSha256
     */
    public String getFileSha256() {
        return fileSha256;
    }

    public void setFileSha256(String fileSha256) {
        this.fileSha256 = fileSha256;
    }

    public AlertFileInfo withFileAttr(String fileAttr) {
        this.fileAttr = fileAttr;
        return this;
    }

    /**
     * 文件属性
     * @return fileAttr
     */
    public String getFileAttr() {
        return fileAttr;
    }

    public void setFileAttr(String fileAttr) {
        this.fileAttr = fileAttr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertFileInfo that = (AlertFileInfo) obj;
        return Objects.equals(this.filePath, that.filePath) && Objects.equals(this.fileContent, that.fileContent)
            && Objects.equals(this.fileNewPath, that.fileNewPath) && Objects.equals(this.fileHash, that.fileHash)
            && Objects.equals(this.fileMd5, that.fileMd5) && Objects.equals(this.fileSha256, that.fileSha256)
            && Objects.equals(this.fileAttr, that.fileAttr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath, fileContent, fileNewPath, fileHash, fileMd5, fileSha256, fileAttr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertFileInfo {\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
        sb.append("    fileNewPath: ").append(toIndentedString(fileNewPath)).append("\n");
        sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
        sb.append("    fileMd5: ").append(toIndentedString(fileMd5)).append("\n");
        sb.append("    fileSha256: ").append(toIndentedString(fileSha256)).append("\n");
        sb.append("    fileAttr: ").append(toIndentedString(fileAttr)).append("\n");
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
