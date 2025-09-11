package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AttachmentVO
 */
public class AttachmentVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_type")

    private String attachmentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private Object createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_directory")

    private String diskDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filesize")

    private String filesize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private Object modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_filename")

    private String storeFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workitem_id")

    private String workitemId;

    public AttachmentVO withAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }

    /**
     * 附件类型
     * @return attachmentType
     */
    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public AttachmentVO withCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建人信息
     * @return createdBy
     */
    public Object getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Object createdBy) {
        this.createdBy = createdBy;
    }

    public AttachmentVO withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 创建时间
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public AttachmentVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 附件描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AttachmentVO withDiskDirectory(String diskDirectory) {
        this.diskDirectory = diskDirectory;
        return this;
    }

    /**
     * 存储路径
     * @return diskDirectory
     */
    public String getDiskDirectory() {
        return diskDirectory;
    }

    public void setDiskDirectory(String diskDirectory) {
        this.diskDirectory = diskDirectory;
    }

    public AttachmentVO withFilesize(String filesize) {
        this.filesize = filesize;
        return this;
    }

    /**
     * 文件大小
     * @return filesize
     */
    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public AttachmentVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 文件id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AttachmentVO withModifiedBy(Object modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * 更新人信息
     * @return modifiedBy
     */
    public Object getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Object modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public AttachmentVO withStoreFilename(String storeFilename) {
        this.storeFilename = storeFilename;
        return this;
    }

    /**
     * 文件名称
     * @return storeFilename
     */
    public String getStoreFilename() {
        return storeFilename;
    }

    public void setStoreFilename(String storeFilename) {
        this.storeFilename = storeFilename;
    }

    public AttachmentVO withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 文件hash名称
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AttachmentVO withWorkitemId(String workitemId) {
        this.workitemId = workitemId;
        return this;
    }

    /**
     * 工作项id
     * @return workitemId
     */
    public String getWorkitemId() {
        return workitemId;
    }

    public void setWorkitemId(String workitemId) {
        this.workitemId = workitemId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachmentVO that = (AttachmentVO) obj;
        return Objects.equals(this.attachmentType, that.attachmentType)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.diskDirectory, that.diskDirectory) && Objects.equals(this.filesize, that.filesize)
            && Objects.equals(this.id, that.id) && Objects.equals(this.modifiedBy, that.modifiedBy)
            && Objects.equals(this.storeFilename, that.storeFilename) && Objects.equals(this.title, that.title)
            && Objects.equals(this.workitemId, that.workitemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachmentType,
            createdBy,
            createdDate,
            description,
            diskDirectory,
            filesize,
            id,
            modifiedBy,
            storeFilename,
            title,
            workitemId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachmentVO {\n");
        sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    diskDirectory: ").append(toIndentedString(diskDirectory)).append("\n");
        sb.append("    filesize: ").append(toIndentedString(filesize)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    storeFilename: ").append(toIndentedString(storeFilename)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    workitemId: ").append(toIndentedString(workitemId)).append("\n");
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
