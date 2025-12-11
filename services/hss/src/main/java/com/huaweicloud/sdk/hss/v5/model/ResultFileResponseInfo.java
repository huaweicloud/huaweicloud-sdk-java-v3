package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件信息
 */
public class ResultFileResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_hash")

    private String fileHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Long fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_owner")

    private String fileOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_attr")

    private String fileAttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_ctime")

    private Long fileCtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_mtime")

    private Long fileMtime;

    public ResultFileResponseInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释**： 文件路径 **取值范围**： 字符长度1-256位 
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ResultFileResponseInfo withFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }

    /**
     * **参数解释**： 文件哈希 **取值范围**： 字符长度1-256位 
     * @return fileHash
     */
    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public ResultFileResponseInfo withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * **参数解释**: 文件大小 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值9223372036854775807 **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return fileSize
     */
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public ResultFileResponseInfo withFileOwner(String fileOwner) {
        this.fileOwner = fileOwner;
        return this;
    }

    /**
     * **参数解释**： 文件属性 **取值范围**： 字符长度0-64位 
     * @return fileOwner
     */
    public String getFileOwner() {
        return fileOwner;
    }

    public void setFileOwner(String fileOwner) {
        this.fileOwner = fileOwner;
    }

    public ResultFileResponseInfo withFileAttr(String fileAttr) {
        this.fileAttr = fileAttr;
        return this;
    }

    /**
     * **参数解释**： 文件的系统属性（如读写权限、隐藏属性、执行权限等） **取值范围**： 字符长度1-256位 
     * @return fileAttr
     */
    public String getFileAttr() {
        return fileAttr;
    }

    public void setFileAttr(String fileAttr) {
        this.fileAttr = fileAttr;
    }

    public ResultFileResponseInfo withFileCtime(Long fileCtime) {
        this.fileCtime = fileCtime;
        return this;
    }

    /**
     * **参数解释**： 文件创建时间 **取值范围**： 非负长整数，时间格式：毫秒级时间戳（UTC时区，从1970-01-01 00:00:00开始计算），单位：ms 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return fileCtime
     */
    public Long getFileCtime() {
        return fileCtime;
    }

    public void setFileCtime(Long fileCtime) {
        this.fileCtime = fileCtime;
    }

    public ResultFileResponseInfo withFileMtime(Long fileMtime) {
        this.fileMtime = fileMtime;
        return this;
    }

    /**
     * **参数解释**： 文件更新时间 **取值范围**： 非负长整数，时间格式：毫秒级时间戳（UTC时区，从1970-01-01 00:00:00开始计算），单位：ms 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return fileMtime
     */
    public Long getFileMtime() {
        return fileMtime;
    }

    public void setFileMtime(Long fileMtime) {
        this.fileMtime = fileMtime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResultFileResponseInfo that = (ResultFileResponseInfo) obj;
        return Objects.equals(this.filePath, that.filePath) && Objects.equals(this.fileHash, that.fileHash)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.fileOwner, that.fileOwner)
            && Objects.equals(this.fileAttr, that.fileAttr) && Objects.equals(this.fileCtime, that.fileCtime)
            && Objects.equals(this.fileMtime, that.fileMtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath, fileHash, fileSize, fileOwner, fileAttr, fileCtime, fileMtime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultFileResponseInfo {\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileOwner: ").append(toIndentedString(fileOwner)).append("\n");
        sb.append("    fileAttr: ").append(toIndentedString(fileAttr)).append("\n");
        sb.append("    fileCtime: ").append(toIndentedString(fileCtime)).append("\n");
        sb.append("    fileMtime: ").append(toIndentedString(fileMtime)).append("\n");
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
