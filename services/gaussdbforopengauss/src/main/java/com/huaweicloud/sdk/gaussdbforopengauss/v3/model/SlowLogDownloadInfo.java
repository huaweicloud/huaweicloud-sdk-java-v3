package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SlowLogDownloadInfo
 */
public class SlowLogDownloadInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private String fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_link")

    private String fileLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Long updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public SlowLogDownloadInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 慢日志ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SlowLogDownloadInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SlowLogDownloadInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public SlowLogDownloadInfo withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * 工作流ID
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public SlowLogDownloadInfo withFileName(String fileName) {
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

    public SlowLogDownloadInfo withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件大小, 单位：Byte
     * @return fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public SlowLogDownloadInfo withFileLink(String fileLink) {
        this.fileLink = fileLink;
        return this;
    }

    /**
     * 文件下载链接
     * @return fileLink
     */
    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public SlowLogDownloadInfo withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 桶名称
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public SlowLogDownloadInfo withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public SlowLogDownloadInfo withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SlowLogDownloadInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SlowLogDownloadInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SlowLogDownloadInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 消息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlowLogDownloadInfo that = (SlowLogDownloadInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.workflowId, that.workflowId)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.fileLink, that.fileLink) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.version, that.version) && Objects.equals(this.status, that.status)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            instanceId,
            nodeId,
            workflowId,
            fileName,
            fileSize,
            fileLink,
            bucketName,
            createdAt,
            updatedAt,
            version,
            status,
            message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowLogDownloadInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileLink: ").append(toIndentedString(fileLink)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
