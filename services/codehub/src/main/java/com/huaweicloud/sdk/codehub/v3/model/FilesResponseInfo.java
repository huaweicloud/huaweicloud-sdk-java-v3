package com.huaweicloud.sdk.codehub.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * FilesResponseInfo
 */
public class FilesResponseInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_name")
    
    private String fileName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_path")
    
    private String filePath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private String size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encoding")
    
    private String encoding;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ref")
    
    private String ref;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="blob_id")
    
    private String blobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_type")
    
    private String fileType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    private String content;

    public FilesResponseInfo withFileName(String fileName) {
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

    public FilesResponseInfo withFilePath(String filePath) {
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

    public FilesResponseInfo withSize(String size) {
        this.size = size;
        return this;
    }

    


    /**
     * 文件大小
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public FilesResponseInfo withEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    


    /**
     * 编码类型
     * @return encoding
     */
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public FilesResponseInfo withRef(String ref) {
        this.ref = ref;
        return this;
    }

    


    /**
     * 分支名称
     * @return ref
     */
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public FilesResponseInfo withBlobId(String blobId) {
        this.blobId = blobId;
        return this;
    }

    


    /**
     * 文件块id
     * @return blobId
     */
    public String getBlobId() {
        return blobId;
    }

    public void setBlobId(String blobId) {
        this.blobId = blobId;
    }

    public FilesResponseInfo withFileType(String fileType) {
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

    public FilesResponseInfo withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 文件内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilesResponseInfo filesResponseInfo = (FilesResponseInfo) o;
        return Objects.equals(this.fileName, filesResponseInfo.fileName) &&
            Objects.equals(this.filePath, filesResponseInfo.filePath) &&
            Objects.equals(this.size, filesResponseInfo.size) &&
            Objects.equals(this.encoding, filesResponseInfo.encoding) &&
            Objects.equals(this.ref, filesResponseInfo.ref) &&
            Objects.equals(this.blobId, filesResponseInfo.blobId) &&
            Objects.equals(this.fileType, filesResponseInfo.fileType) &&
            Objects.equals(this.content, filesResponseInfo.content);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fileName, filePath, size, encoding, ref, blobId, fileType, content);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilesResponseInfo {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

