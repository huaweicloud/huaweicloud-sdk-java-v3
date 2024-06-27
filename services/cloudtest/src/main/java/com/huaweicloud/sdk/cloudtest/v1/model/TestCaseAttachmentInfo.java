package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 对外附件
 */
public class TestCaseAttachmentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "override")

    private Boolean override;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_id")

    private String docId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private String fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "override_id")

    private String overrideId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_type")

    private String relatedType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_file_name")

    private String storeFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_type")

    private String systemType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_system")

    private String storageSystem;

    public TestCaseAttachmentInfo withOverride(Boolean override) {
        this.override = override;
        return this;
    }

    /**
     * 附件是否要被覆盖
     * @return override
     */
    public Boolean getOverride() {
        return override;
    }

    public void setOverride(Boolean override) {
        this.override = override;
    }

    public TestCaseAttachmentInfo withDocId(String docId) {
        this.docId = docId;
        return this;
    }

    /**
     * 文档id
     * @return docId
     */
    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public TestCaseAttachmentInfo withFileName(String fileName) {
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

    public TestCaseAttachmentInfo withFilePath(String filePath) {
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

    public TestCaseAttachmentInfo withFileType(String fileType) {
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

    public TestCaseAttachmentInfo withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件大小
     * @return fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public TestCaseAttachmentInfo withOverrideId(String overrideId) {
        this.overrideId = overrideId;
        return this;
    }

    /**
     * 重复用例ID
     * @return overrideId
     */
    public String getOverrideId() {
        return overrideId;
    }

    public void setOverrideId(String overrideId) {
        this.overrideId = overrideId;
    }

    public TestCaseAttachmentInfo withRelatedType(String relatedType) {
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

    public TestCaseAttachmentInfo withStoreFileName(String storeFileName) {
        this.storeFileName = storeFileName;
        return this;
    }

    /**
     * 保存文件名
     * @return storeFileName
     */
    public String getStoreFileName() {
        return storeFileName;
    }

    public void setStoreFileName(String storeFileName) {
        this.storeFileName = storeFileName;
    }

    public TestCaseAttachmentInfo withSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }

    /**
     * 系统区分
     * @return systemType
     */
    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public TestCaseAttachmentInfo withStorageSystem(String storageSystem) {
        this.storageSystem = storageSystem;
        return this;
    }

    /**
     * 区分文件存储系统
     * @return storageSystem
     */
    public String getStorageSystem() {
        return storageSystem;
    }

    public void setStorageSystem(String storageSystem) {
        this.storageSystem = storageSystem;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestCaseAttachmentInfo that = (TestCaseAttachmentInfo) obj;
        return Objects.equals(this.override, that.override) && Objects.equals(this.docId, that.docId)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.overrideId, that.overrideId) && Objects.equals(this.relatedType, that.relatedType)
            && Objects.equals(this.storeFileName, that.storeFileName)
            && Objects.equals(this.systemType, that.systemType)
            && Objects.equals(this.storageSystem, that.storageSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(override,
            docId,
            fileName,
            filePath,
            fileType,
            fileSize,
            overrideId,
            relatedType,
            storeFileName,
            systemType,
            storageSystem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCaseAttachmentInfo {\n");
        sb.append("    override: ").append(toIndentedString(override)).append("\n");
        sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    overrideId: ").append(toIndentedString(overrideId)).append("\n");
        sb.append("    relatedType: ").append(toIndentedString(relatedType)).append("\n");
        sb.append("    storeFileName: ").append(toIndentedString(storeFileName)).append("\n");
        sb.append("    systemType: ").append(toIndentedString(systemType)).append("\n");
        sb.append("    storageSystem: ").append(toIndentedString(storageSystem)).append("\n");
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
