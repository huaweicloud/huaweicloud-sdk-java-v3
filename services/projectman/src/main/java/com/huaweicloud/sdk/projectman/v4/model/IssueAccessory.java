package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IssueAccessory
 */
public class IssueAccessory {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_id")

    private Integer attachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private Integer issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_num_id")

    private Integer creatorNumId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_type")

    private String containerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_file_name")

    private String diskFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digest")

    private String digest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_directory")

    private String diskDirectory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    public IssueAccessory withAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * 附件id
     * @return attachmentId
     */
    public Integer getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    public IssueAccessory withIssueId(Integer issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 工作鞋ID
     * @return issueId
     */
    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public IssueAccessory withCreatorNumId(Integer creatorNumId) {
        this.creatorNumId = creatorNumId;
        return this;
    }

    /**
     * 创建者数字ID
     * @return creatorNumId
     */
    public Integer getCreatorNumId() {
        return creatorNumId;
    }

    public void setCreatorNumId(Integer creatorNumId) {
        this.creatorNumId = creatorNumId;
    }

    public IssueAccessory withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 附件创建时间
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public IssueAccessory withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 上传时文件名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public IssueAccessory withContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }

    /**
     * 附件id
     * @return containerType
     */
    public String getContainerType() {
        return containerType;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
    }

    public IssueAccessory withDiskFileName(String diskFileName) {
        this.diskFileName = diskFileName;
        return this;
    }

    /**
     * 附件名称
     * @return diskFileName
     */
    public String getDiskFileName() {
        return diskFileName;
    }

    public void setDiskFileName(String diskFileName) {
        this.diskFileName = diskFileName;
    }

    public IssueAccessory withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * 附件id
     * @return digest
     */
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public IssueAccessory withDiskDirectory(String diskDirectory) {
        this.diskDirectory = diskDirectory;
        return this;
    }

    /**
     * 附件路径
     * @return diskDirectory
     */
    public String getDiskDirectory() {
        return diskDirectory;
    }

    public void setDiskDirectory(String diskDirectory) {
        this.diskDirectory = diskDirectory;
    }

    public IssueAccessory withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建这用户uuid
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssueAccessory that = (IssueAccessory) obj;
        return Objects.equals(this.attachmentId, that.attachmentId) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.creatorNumId, that.creatorNumId)
            && Objects.equals(this.createdDate, that.createdDate) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.containerType, that.containerType)
            && Objects.equals(this.diskFileName, that.diskFileName) && Objects.equals(this.digest, that.digest)
            && Objects.equals(this.diskDirectory, that.diskDirectory) && Objects.equals(this.creatorId, that.creatorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachmentId,
            issueId,
            creatorNumId,
            createdDate,
            fileName,
            containerType,
            diskFileName,
            digest,
            diskDirectory,
            creatorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueAccessory {\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    creatorNumId: ").append(toIndentedString(creatorNumId)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    containerType: ").append(toIndentedString(containerType)).append("\n");
        sb.append("    diskFileName: ").append(toIndentedString(diskFileName)).append("\n");
        sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
        sb.append("    diskDirectory: ").append(toIndentedString(diskDirectory)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
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
