package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FileContentInfo
 */
public class FileContentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding")

    private String encoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_sha256")

    private String contentSha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private String ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blob_id")

    private String blobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_id")

    private String commitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_commit_id")

    private String lastCommitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    public FileContentInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileContentInfo withFilePath(String filePath) {
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

    public FileContentInfo withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 文件大小
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public FileContentInfo withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * 文件编码
     * @return encoding
     */
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public FileContentInfo withContentSha256(String contentSha256) {
        this.contentSha256 = contentSha256;
        return this;
    }

    /**
     * sha256编码的文件内容
     * @return contentSha256
     */
    public String getContentSha256() {
        return contentSha256;
    }

    public void setContentSha256(String contentSha256) {
        this.contentSha256 = contentSha256;
    }

    public FileContentInfo withRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * 分支名
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public FileContentInfo withBlobId(String blobId) {
        this.blobId = blobId;
        return this;
    }

    /**
     * blob sha
     * @return blobId
     */
    public String getBlobId() {
        return blobId;
    }

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    public FileContentInfo withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * 提交对应的SHA id
     * @return commitId
     */
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public FileContentInfo withLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
        return this;
    }

    /**
     * 最后一个提交对应的SHA id
     * @return lastCommitId
     */
    public String getLastCommitId() {
        return lastCommitId;
    }

    public void setLastCommitId(String lastCommitId) {
        this.lastCommitId = lastCommitId;
    }

    public FileContentInfo withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * base64编码的文件内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileContentInfo that = (FileContentInfo) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.size, that.size) && Objects.equals(this.encoding, that.encoding)
            && Objects.equals(this.contentSha256, that.contentSha256) && Objects.equals(this.ref, that.ref)
            && Objects.equals(this.blobId, that.blobId) && Objects.equals(this.commitId, that.commitId)
            && Objects.equals(this.lastCommitId, that.lastCommitId) && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(fileName, filePath, size, encoding, contentSha256, ref, blobId, commitId, lastCommitId, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileContentInfo {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
        sb.append("    contentSha256: ").append(toIndentedString(contentSha256)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    lastCommitId: ").append(toIndentedString(lastCommitId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
