package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowAlertRspFileInfo
 */
public class ShowAlertRspFileInfo {

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

    public ShowAlertRspFileInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * The name, display only
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ShowAlertRspFileInfo withFileContent(String fileContent) {
        this.fileContent = fileContent;
        return this;
    }

    /**
     * The name, display only
     * @return fileContent
     */
    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public ShowAlertRspFileInfo withFileNewPath(String fileNewPath) {
        this.fileNewPath = fileNewPath;
        return this;
    }

    /**
     * The name, display only
     * @return fileNewPath
     */
    public String getFileNewPath() {
        return fileNewPath;
    }

    public void setFileNewPath(String fileNewPath) {
        this.fileNewPath = fileNewPath;
    }

    public ShowAlertRspFileInfo withFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }

    /**
     * The name, display only
     * @return fileHash
     */
    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public ShowAlertRspFileInfo withFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }

    /**
     * The name, display only
     * @return fileMd5
     */
    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public ShowAlertRspFileInfo withFileSha256(String fileSha256) {
        this.fileSha256 = fileSha256;
        return this;
    }

    /**
     * The name, display only
     * @return fileSha256
     */
    public String getFileSha256() {
        return fileSha256;
    }

    public void setFileSha256(String fileSha256) {
        this.fileSha256 = fileSha256;
    }

    public ShowAlertRspFileInfo withFileAttr(String fileAttr) {
        this.fileAttr = fileAttr;
        return this;
    }

    /**
     * The name, display only
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
        ShowAlertRspFileInfo that = (ShowAlertRspFileInfo) obj;
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
        sb.append("class ShowAlertRspFileInfo {\n");
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
