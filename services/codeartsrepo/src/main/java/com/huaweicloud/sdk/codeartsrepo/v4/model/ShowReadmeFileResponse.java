package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowReadmeFileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blob_id")

    private String blobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding")

    private Object encoding;

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
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")

    private String xTotal;

    public ShowReadmeFileResponse withBlobId(String blobId) {
        this.blobId = blobId;
        return this;
    }

    /**
     * **参数解释：** blob文件ID。 **约束限制：** 不涉及。
     * @return blobId
     */
    public String getBlobId() {
        return blobId;
    }

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    public ShowReadmeFileResponse withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释：** 经过base64编码后的文件内容。 **约束限制：** 不涉及。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ShowReadmeFileResponse withEncoding(Object encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * **参数解释：** 文件编码方式。 **约束限制：** - base64。
     * @return encoding
     */
    public Object getEncoding() {
        return encoding;
    }

    public void setEncoding(Object encoding) {
        this.encoding = encoding;
    }

    public ShowReadmeFileResponse withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ShowReadmeFileResponse withFilePath(String filePath) {
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

    public ShowReadmeFileResponse withFileType(String fileType) {
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

    public ShowReadmeFileResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释：** 文件字节大小。 **约束限制：** 不涉及。
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ShowReadmeFileResponse withXTotal(String xTotal) {
        this.xTotal = xTotal;
        return this;
    }

    /**
     * Get xTotal
     * @return xTotal
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Total")
    public String getXTotal() {
        return xTotal;
    }

    public void setXTotal(String xTotal) {
        this.xTotal = xTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReadmeFileResponse that = (ShowReadmeFileResponse) obj;
        return Objects.equals(this.blobId, that.blobId) && Objects.equals(this.content, that.content)
            && Objects.equals(this.encoding, that.encoding) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.size, that.size) && Objects.equals(this.xTotal, that.xTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blobId, content, encoding, fileName, filePath, fileType, size, xTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReadmeFileResponse {\n");
        sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    xTotal: ").append(toIndentedString(xTotal)).append("\n");
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
