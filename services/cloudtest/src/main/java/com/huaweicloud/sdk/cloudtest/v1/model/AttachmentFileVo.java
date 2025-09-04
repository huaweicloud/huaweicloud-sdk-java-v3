package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class AttachmentFileVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_name")

    private String docName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_name")

    private String storeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_id")

    private Integer docId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_size")

    private String docSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_type")

    private String relatedType;

    public AttachmentFileVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 附件Uri
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public AttachmentFileVo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 文件路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public AttachmentFileVo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AttachmentFileVo withFilePath(String filePath) {
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

    public AttachmentFileVo withFileType(String fileType) {
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

    public AttachmentFileVo withDocName(String docName) {
        this.docName = docName;
        return this;
    }

    /**
     * 文档名
     * @return docName
     */
    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public AttachmentFileVo withStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * 保存文件名
     * @return storeName
     */
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public AttachmentFileVo withDocId(Integer docId) {
        this.docId = docId;
        return this;
    }

    /**
     * 文档id
     * @return docId
     */
    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public AttachmentFileVo withDocSize(String docSize) {
        this.docSize = docSize;
        return this;
    }

    /**
     * 文档大小
     * @return docSize
     */
    public String getDocSize() {
        return docSize;
    }

    public void setDocSize(String docSize) {
        this.docSize = docSize;
    }

    public AttachmentFileVo withRelatedType(String relatedType) {
        this.relatedType = relatedType;
        return this;
    }

    /**
     * 相关类型
     * @return relatedType
     */
    public String getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(String relatedType) {
        this.relatedType = relatedType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachmentFileVo that = (AttachmentFileVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.path, that.path)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.docName, that.docName)
            && Objects.equals(this.storeName, that.storeName) && Objects.equals(this.docId, that.docId)
            && Objects.equals(this.docSize, that.docSize) && Objects.equals(this.relatedType, that.relatedType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri, path, projectId, filePath, fileType, docName, storeName, docId, docSize, relatedType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachmentFileVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    docName: ").append(toIndentedString(docName)).append("\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
        sb.append("    docSize: ").append(toIndentedString(docSize)).append("\n");
        sb.append("    relatedType: ").append(toIndentedString(relatedType)).append("\n");
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
