package com.huaweicloud.sdk.dds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DownloadSlowlogResult
 */
public class DownloadSlowlogResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_link")
    
    private String fileLink;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_name")
    
    private String fileName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_size")
    
    private String fileSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_name")
    
    private String nodeName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_at")
    
    private Integer updateAt;

    public DownloadSlowlogResult withFileLink(String fileLink) {
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

    public DownloadSlowlogResult withFileName(String fileName) {
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

    public DownloadSlowlogResult withFileSize(String fileSize) {
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

    public DownloadSlowlogResult withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    


    /**
     * 文件所属节点名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public DownloadSlowlogResult withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 文件查询状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DownloadSlowlogResult withUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    


    /**
     * 文件最后更新时间
     * @return updateAt
     */
    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadSlowlogResult downloadSlowlogResult = (DownloadSlowlogResult) o;
        return Objects.equals(this.fileLink, downloadSlowlogResult.fileLink) &&
            Objects.equals(this.fileName, downloadSlowlogResult.fileName) &&
            Objects.equals(this.fileSize, downloadSlowlogResult.fileSize) &&
            Objects.equals(this.nodeName, downloadSlowlogResult.nodeName) &&
            Objects.equals(this.status, downloadSlowlogResult.status) &&
            Objects.equals(this.updateAt, downloadSlowlogResult.updateAt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fileLink, fileName, fileSize, nodeName, status, updateAt);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadSlowlogResult {\n");
        sb.append("    fileLink: ").append(toIndentedString(fileLink)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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

