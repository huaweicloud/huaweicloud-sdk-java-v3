package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会议纪要信息。
 */
public class ListMeetingFileResponseDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileCode")

    private String fileCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileId")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileName")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileSize")

    private Long fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnailFileId")

    private String thumbnailFileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnailFileName")

    private String thumbnailFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnailFileSize")

    private Long thumbnailFileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pdfFileId")

    private String pdfFileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pdfFileName")

    private String pdfFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pdfFileSize")

    private Long pdfFileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userId")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private Long creationTimestamp;

    public ListMeetingFileResponseDTO withFileCode(String fileCode) {
        this.fileCode = fileCode;
        return this;
    }

    /**
     * 会议纪要文件码。
     * @return fileCode
     */
    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    public ListMeetingFileResponseDTO withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * 文件主题。
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ListMeetingFileResponseDTO withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 文件Id。
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public ListMeetingFileResponseDTO withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ListMeetingFileResponseDTO withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件大小，单位字节。
     * @return fileSize
     */
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public ListMeetingFileResponseDTO withThumbnailFileId(String thumbnailFileId) {
        this.thumbnailFileId = thumbnailFileId;
        return this;
    }

    /**
     * 缩略图文件Id。
     * @return thumbnailFileId
     */
    public String getThumbnailFileId() {
        return thumbnailFileId;
    }

    public void setThumbnailFileId(String thumbnailFileId) {
        this.thumbnailFileId = thumbnailFileId;
    }

    public ListMeetingFileResponseDTO withThumbnailFileName(String thumbnailFileName) {
        this.thumbnailFileName = thumbnailFileName;
        return this;
    }

    /**
     * 缩略图文件名。
     * @return thumbnailFileName
     */
    public String getThumbnailFileName() {
        return thumbnailFileName;
    }

    public void setThumbnailFileName(String thumbnailFileName) {
        this.thumbnailFileName = thumbnailFileName;
    }

    public ListMeetingFileResponseDTO withThumbnailFileSize(Long thumbnailFileSize) {
        this.thumbnailFileSize = thumbnailFileSize;
        return this;
    }

    /**
     * 缩略图文件大小，单位字节。
     * @return thumbnailFileSize
     */
    public Long getThumbnailFileSize() {
        return thumbnailFileSize;
    }

    public void setThumbnailFileSize(Long thumbnailFileSize) {
        this.thumbnailFileSize = thumbnailFileSize;
    }

    public ListMeetingFileResponseDTO withPdfFileId(String pdfFileId) {
        this.pdfFileId = pdfFileId;
        return this;
    }

    /**
     * pdf文件Id。
     * @return pdfFileId
     */
    public String getPdfFileId() {
        return pdfFileId;
    }

    public void setPdfFileId(String pdfFileId) {
        this.pdfFileId = pdfFileId;
    }

    public ListMeetingFileResponseDTO withPdfFileName(String pdfFileName) {
        this.pdfFileName = pdfFileName;
        return this;
    }

    /**
     * pdf文件名。
     * @return pdfFileName
     */
    public String getPdfFileName() {
        return pdfFileName;
    }

    public void setPdfFileName(String pdfFileName) {
        this.pdfFileName = pdfFileName;
    }

    public ListMeetingFileResponseDTO withPdfFileSize(Long pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    /**
     * pdf文件大小，单位字节。
     * @return pdfFileSize
     */
    public Long getPdfFileSize() {
        return pdfFileSize;
    }

    public void setPdfFileSize(Long pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
    }

    public ListMeetingFileResponseDTO withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户UUID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ListMeetingFileResponseDTO withCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * 文件创建时间戳。
     * @return creationTimestamp
     */
    public Long getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(Long creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMeetingFileResponseDTO listMeetingFileResponseDTO = (ListMeetingFileResponseDTO) o;
        return Objects.equals(this.fileCode, listMeetingFileResponseDTO.fileCode)
            && Objects.equals(this.topic, listMeetingFileResponseDTO.topic)
            && Objects.equals(this.fileId, listMeetingFileResponseDTO.fileId)
            && Objects.equals(this.fileName, listMeetingFileResponseDTO.fileName)
            && Objects.equals(this.fileSize, listMeetingFileResponseDTO.fileSize)
            && Objects.equals(this.thumbnailFileId, listMeetingFileResponseDTO.thumbnailFileId)
            && Objects.equals(this.thumbnailFileName, listMeetingFileResponseDTO.thumbnailFileName)
            && Objects.equals(this.thumbnailFileSize, listMeetingFileResponseDTO.thumbnailFileSize)
            && Objects.equals(this.pdfFileId, listMeetingFileResponseDTO.pdfFileId)
            && Objects.equals(this.pdfFileName, listMeetingFileResponseDTO.pdfFileName)
            && Objects.equals(this.pdfFileSize, listMeetingFileResponseDTO.pdfFileSize)
            && Objects.equals(this.userId, listMeetingFileResponseDTO.userId)
            && Objects.equals(this.creationTimestamp, listMeetingFileResponseDTO.creationTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileCode,
            topic,
            fileId,
            fileName,
            fileSize,
            thumbnailFileId,
            thumbnailFileName,
            thumbnailFileSize,
            pdfFileId,
            pdfFileName,
            pdfFileSize,
            userId,
            creationTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMeetingFileResponseDTO {\n");
        sb.append("    fileCode: ").append(toIndentedString(fileCode)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    thumbnailFileId: ").append(toIndentedString(thumbnailFileId)).append("\n");
        sb.append("    thumbnailFileName: ").append(toIndentedString(thumbnailFileName)).append("\n");
        sb.append("    thumbnailFileSize: ").append(toIndentedString(thumbnailFileSize)).append("\n");
        sb.append("    pdfFileId: ").append(toIndentedString(pdfFileId)).append("\n");
        sb.append("    pdfFileName: ").append(toIndentedString(pdfFileName)).append("\n");
        sb.append("    pdfFileSize: ").append(toIndentedString(pdfFileSize)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
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
