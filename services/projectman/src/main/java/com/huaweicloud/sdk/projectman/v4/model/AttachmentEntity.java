package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 附件对象
 */
public class AttachmentEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_directory")

    private String diskDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private String fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_filename")

    private String storeFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private UserEntity modifiedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private UserEntity createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_type")

    private String attachmentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    public AttachmentEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 附件Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AttachmentEntity withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 附件所属工作项Id
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public AttachmentEntity withDiskDirectory(String diskDirectory) {
        this.diskDirectory = diskDirectory;
        return this;
    }

    /**
     * 在服务器存储的相对路径
     * @return diskDirectory
     */
    public String getDiskDirectory() {
        return diskDirectory;
    }

    public void setDiskDirectory(String diskDirectory) {
        this.diskDirectory = diskDirectory;
    }

    public AttachmentEntity withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 附件大小，单位为Byte，单个附件最大为200MB
     * @return fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public AttachmentEntity withStoreFilename(String storeFilename) {
        this.storeFilename = storeFilename;
        return this;
    }

    /**
     * 附件原名称
     * @return storeFilename
     */
    public String getStoreFilename() {
        return storeFilename;
    }

    public void setStoreFilename(String storeFilename) {
        this.storeFilename = storeFilename;
    }

    public AttachmentEntity withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 附件在数据库中存储的名称。格式为uuid+.扩展名
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AttachmentEntity withModifiedBy(UserEntity modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    public AttachmentEntity withModifiedBy(Consumer<UserEntity> modifiedBySetter) {
        if (this.modifiedBy == null) {
            this.modifiedBy = new UserEntity();
            modifiedBySetter.accept(this.modifiedBy);
        }

        return this;
    }

    /**
     * Get modifiedBy
     * @return modifiedBy
     */
    public UserEntity getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(UserEntity modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public AttachmentEntity withCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public AttachmentEntity withCreatedBy(Consumer<UserEntity> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new UserEntity();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public UserEntity getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserEntity createdBy) {
        this.createdBy = createdBy;
    }

    public AttachmentEntity withAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
        return this;
    }

    /**
     * 附件类型，即文件扩展名
     * @return attachmentType
     */
    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public AttachmentEntity withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 附件上传时间的时间戳
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachmentEntity that = (AttachmentEntity) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.diskDirectory, that.diskDirectory) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.storeFilename, that.storeFilename) && Objects.equals(this.title, that.title)
            && Objects.equals(this.modifiedBy, that.modifiedBy) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.attachmentType, that.attachmentType)
            && Objects.equals(this.createdDate, that.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            issueId,
            diskDirectory,
            fileSize,
            storeFilename,
            title,
            modifiedBy,
            createdBy,
            attachmentType,
            createdDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachmentEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    diskDirectory: ").append(toIndentedString(diskDirectory)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    storeFilename: ").append(toIndentedString(storeFilename)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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
