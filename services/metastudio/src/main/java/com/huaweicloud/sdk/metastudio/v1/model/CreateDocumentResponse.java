package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateDocumentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_id")

    private String documentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_library_id")

    private String knowledgeLibraryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Long fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "split_type")

    private Integer splitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chunk_size")

    private Integer chunkSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chunk_type")

    private String chunkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "separators")

    private List<String> separators = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_task_info")

    private DocumentTaskInfo documentTaskInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CreateDocumentResponse withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * 文档ID。
     * @return documentId
     */
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public CreateDocumentResponse withKnowledgeLibraryId(String knowledgeLibraryId) {
        this.knowledgeLibraryId = knowledgeLibraryId;
        return this;
    }

    /**
     * 知识库ID。
     * @return knowledgeLibraryId
     */
    public String getKnowledgeLibraryId() {
        return knowledgeLibraryId;
    }

    public void setKnowledgeLibraryId(String knowledgeLibraryId) {
        this.knowledgeLibraryId = knowledgeLibraryId;
    }

    public CreateDocumentResponse withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文档名称。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public CreateDocumentResponse withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文档大小，单位字节
     * minimum: 0
     * maximum: 1048576000
     * @return fileSize
     */
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public CreateDocumentResponse withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文档类型。
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public CreateDocumentResponse withSplitType(Integer splitType) {
        this.splitType = splitType;
        return this;
    }

    /**
     * 分段类型 * 1: 自动分段 * 2: 手动分段
     * minimum: 1
     * maximum: 64
     * @return splitType
     */
    public Integer getSplitType() {
        return splitType;
    }

    public void setSplitType(Integer splitType) {
        this.splitType = splitType;
    }

    public CreateDocumentResponse withChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
        return this;
    }

    /**
     * 分段长度。
     * minimum: 1
     * maximum: 512
     * @return chunkSize
     */
    public Integer getChunkSize() {
        return chunkSize;
    }

    public void setChunkSize(Integer chunkSize) {
        this.chunkSize = chunkSize;
    }

    public CreateDocumentResponse withChunkType(String chunkType) {
        this.chunkType = chunkType;
        return this;
    }

    /**
     * 分段策略，多个策略之间用逗号分割。 > title:标题分割；separator:分隔符分割
     * @return chunkType
     */
    public String getChunkType() {
        return chunkType;
    }

    public void setChunkType(String chunkType) {
        this.chunkType = chunkType;
    }

    public CreateDocumentResponse withSeparators(List<String> separators) {
        this.separators = separators;
        return this;
    }

    public CreateDocumentResponse addSeparatorsItem(String separatorsItem) {
        if (this.separators == null) {
            this.separators = new ArrayList<>();
        }
        this.separators.add(separatorsItem);
        return this;
    }

    public CreateDocumentResponse withSeparators(Consumer<List<String>> separatorsSetter) {
        if (this.separators == null) {
            this.separators = new ArrayList<>();
        }
        separatorsSetter.accept(this.separators);
        return this;
    }

    /**
     * 分隔符
     * @return separators
     */
    public List<String> getSeparators() {
        return separators;
    }

    public void setSeparators(List<String> separators) {
        this.separators = separators;
    }

    public CreateDocumentResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 文档创建时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CreateDocumentResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 文档更新时间。格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public CreateDocumentResponse withDocumentTaskInfo(DocumentTaskInfo documentTaskInfo) {
        this.documentTaskInfo = documentTaskInfo;
        return this;
    }

    public CreateDocumentResponse withDocumentTaskInfo(Consumer<DocumentTaskInfo> documentTaskInfoSetter) {
        if (this.documentTaskInfo == null) {
            this.documentTaskInfo = new DocumentTaskInfo();
            documentTaskInfoSetter.accept(this.documentTaskInfo);
        }

        return this;
    }

    /**
     * Get documentTaskInfo
     * @return documentTaskInfo
     */
    public DocumentTaskInfo getDocumentTaskInfo() {
        return documentTaskInfo;
    }

    public void setDocumentTaskInfo(DocumentTaskInfo documentTaskInfo) {
        this.documentTaskInfo = documentTaskInfo;
    }

    public CreateDocumentResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDocumentResponse that = (CreateDocumentResponse) obj;
        return Objects.equals(this.documentId, that.documentId)
            && Objects.equals(this.knowledgeLibraryId, that.knowledgeLibraryId)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.splitType, that.splitType)
            && Objects.equals(this.chunkSize, that.chunkSize) && Objects.equals(this.chunkType, that.chunkType)
            && Objects.equals(this.separators, that.separators) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.documentTaskInfo, that.documentTaskInfo)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId,
            knowledgeLibraryId,
            fileName,
            fileSize,
            fileType,
            splitType,
            chunkSize,
            chunkType,
            separators,
            createTime,
            updateTime,
            documentTaskInfo,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDocumentResponse {\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    knowledgeLibraryId: ").append(toIndentedString(knowledgeLibraryId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    splitType: ").append(toIndentedString(splitType)).append("\n");
        sb.append("    chunkSize: ").append(toIndentedString(chunkSize)).append("\n");
        sb.append("    chunkType: ").append(toIndentedString(chunkType)).append("\n");
        sb.append("    separators: ").append(toIndentedString(separators)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    documentTaskInfo: ").append(toIndentedString(documentTaskInfo)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
