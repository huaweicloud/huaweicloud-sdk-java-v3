package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class AttachmentVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updator")

    private String updator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_id")

    private String docId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_uri")

    private String parentUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_type")

    private String parentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_file_name")

    private String storeFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Integer fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_type")

    private String systemType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_timestamp")

    private Long createTimeTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_timestamp")

    private Long updateTimeTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_type")

    private String relatedType;

    public AttachmentVo withUri(String uri) {
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

    public AttachmentVo withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public AttachmentVo withUpdator(String updator) {
        this.updator = updator;
        return this;
    }

    /**
     * 更新人
     * @return updator
     */
    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public AttachmentVo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 逻辑region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public AttachmentVo withDocId(String docId) {
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

    public AttachmentVo withParentUri(String parentUri) {
        this.parentUri = parentUri;
        return this;
    }

    /**
     * 父节点Uri
     * @return parentUri
     */
    public String getParentUri() {
        return parentUri;
    }

    public void setParentUri(String parentUri) {
        this.parentUri = parentUri;
    }

    public AttachmentVo withParentType(String parentType) {
        this.parentType = parentType;
        return this;
    }

    /**
     * 父节点类型
     * @return parentType
     */
    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public AttachmentVo withFileName(String fileName) {
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

    public AttachmentVo withStoreFileName(String storeFileName) {
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

    public AttachmentVo withFilePath(String filePath) {
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

    public AttachmentVo withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件大小
     * @return fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public AttachmentVo withFileType(String fileType) {
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

    public AttachmentVo withSystemType(String systemType) {
        this.systemType = systemType;
        return this;
    }

    /**
     * 系统区分：docman或testman
     * @return systemType
     */
    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public AttachmentVo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public AttachmentVo withCreateTimeTimestamp(Long createTimeTimestamp) {
        this.createTimeTimestamp = createTimeTimestamp;
        return this;
    }

    /**
     * 创建时间时间戳
     * @return createTimeTimestamp
     */
    public Long getCreateTimeTimestamp() {
        return createTimeTimestamp;
    }

    public void setCreateTimeTimestamp(Long createTimeTimestamp) {
        this.createTimeTimestamp = createTimeTimestamp;
    }

    public AttachmentVo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public AttachmentVo withUpdateTimeTimestamp(Long updateTimeTimestamp) {
        this.updateTimeTimestamp = updateTimeTimestamp;
        return this;
    }

    /**
     * 更新时间时间戳
     * @return updateTimeTimestamp
     */
    public Long getUpdateTimeTimestamp() {
        return updateTimeTimestamp;
    }

    public void setUpdateTimeTimestamp(Long updateTimeTimestamp) {
        this.updateTimeTimestamp = updateTimeTimestamp;
    }

    public AttachmentVo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public AttachmentVo withRelatedType(String relatedType) {
        this.relatedType = relatedType;
        return this;
    }

    /**
     * 附件类型 0 本地上传  other 关联文档
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
        AttachmentVo that = (AttachmentVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.updator, that.updator) && Objects.equals(this.region, that.region)
            && Objects.equals(this.docId, that.docId) && Objects.equals(this.parentUri, that.parentUri)
            && Objects.equals(this.parentType, that.parentType) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.storeFileName, that.storeFileName) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.systemType, that.systemType) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createTimeTimestamp, that.createTimeTimestamp)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateTimeTimestamp, that.updateTimeTimestamp)
            && Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.relatedType, that.relatedType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            creator,
            updator,
            region,
            docId,
            parentUri,
            parentType,
            fileName,
            storeFileName,
            filePath,
            fileSize,
            fileType,
            systemType,
            createTime,
            createTimeTimestamp,
            updateTime,
            updateTimeTimestamp,
            projectUuid,
            relatedType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachmentVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    updator: ").append(toIndentedString(updator)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    docId: ").append(toIndentedString(docId)).append("\n");
        sb.append("    parentUri: ").append(toIndentedString(parentUri)).append("\n");
        sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    storeFileName: ").append(toIndentedString(storeFileName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    systemType: ").append(toIndentedString(systemType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createTimeTimestamp: ").append(toIndentedString(createTimeTimestamp)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateTimeTimestamp: ").append(toIndentedString(updateTimeTimestamp)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
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
