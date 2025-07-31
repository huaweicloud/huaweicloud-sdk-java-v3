package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 恢复的文件详情
 */
public class DelIsolatedFileRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_hash")

    private String fileHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_attr")

    private String fileAttr;

    public DelIsolatedFileRequestInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 服务器ID **取值范围**: 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public DelIsolatedFileRequestInfo withFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }

    /**
     * 文件哈希
     * @return fileHash
     */
    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public DelIsolatedFileRequestInfo withFilePath(String filePath) {
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

    public DelIsolatedFileRequestInfo withFileAttr(String fileAttr) {
        this.fileAttr = fileAttr;
        return this;
    }

    /**
     * 文件属性
     * @return fileAttr
     */
    public String getFileAttr() {
        return fileAttr;
    }

    public void setFileAttr(String fileAttr) {
        this.fileAttr = fileAttr;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DelIsolatedFileRequestInfo that = (DelIsolatedFileRequestInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.fileHash, that.fileHash)
            && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.fileAttr, that.fileAttr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, fileHash, filePath, fileAttr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DelIsolatedFileRequestInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileAttr: ").append(toIndentedString(fileAttr)).append("\n");
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
