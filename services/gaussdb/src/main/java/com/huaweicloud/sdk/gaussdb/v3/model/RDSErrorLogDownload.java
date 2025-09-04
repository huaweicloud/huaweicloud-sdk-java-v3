package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RDSErrorLogDownload
 */
public class RDSErrorLogDownload {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private String fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_link")

    private String fileLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Long updatedAt;

    public RDSErrorLogDownload withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：  任务ID。  **取值范围**：  不涉及。 
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public RDSErrorLogDownload withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释**：  日志文件名称。  **取值范围**：  不涉及。 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public RDSErrorLogDownload withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：  状态。  **取值范围**：  不涉及。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RDSErrorLogDownload withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * **参数解释**：  文件大小。  **取值范围**：  不涉及。 
     * @return fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public RDSErrorLogDownload withFileLink(String fileLink) {
        this.fileLink = fileLink;
        return this;
    }

    /**
     * **参数解释**：  文件下载链接。  **取值范围**：  不涉及。 
     * @return fileLink
     */
    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public RDSErrorLogDownload withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释**：  创建时间。  **取值范围**：  不涉及。 
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public RDSErrorLogDownload withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**：  更新时间。  **取值范围**：  不涉及。 
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RDSErrorLogDownload that = (RDSErrorLogDownload) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.fileLink, that.fileLink) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, fileName, status, fileSize, fileLink, createAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RDSErrorLogDownload {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileLink: ").append(toIndentedString(fileLink)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
