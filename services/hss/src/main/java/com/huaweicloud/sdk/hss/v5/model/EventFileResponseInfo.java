package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件信息
 */
public class EventFileResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_alias")

    private String fileAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Integer fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_mtime")

    private Long fileMtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_atime")

    private Long fileAtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_ctime")

    private Long fileCtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_hash")

    private String fileHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_md5")

    private String fileMd5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_sha256")

    private String fileSha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_content")

    private String fileContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_attr")

    private String fileAttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_operation")

    private Integer fileOperation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_action")

    private String fileAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_change_attr")

    private String fileChangeAttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_new_path")

    private String fileNewPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_desc")

    private String fileDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_key_word")

    private String fileKeyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_dir")

    private Boolean isDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_info")

    private String fdInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_count")

    private Integer fdCount;

    public EventFileResponseInfo withFilePath(String filePath) {
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

    public EventFileResponseInfo withFileAlias(String fileAlias) {
        this.fileAlias = fileAlias;
        return this;
    }

    /**
     * 文件别名
     * @return fileAlias
     */
    public String getFileAlias() {
        return fileAlias;
    }

    public void setFileAlias(String fileAlias) {
        this.fileAlias = fileAlias;
    }

    public EventFileResponseInfo withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件大小
     * minimum: 0
     * maximum: 2147483647
     * @return fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public EventFileResponseInfo withFileMtime(Long fileMtime) {
        this.fileMtime = fileMtime;
        return this;
    }

    /**
     * 文件最后一次修改时间
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

    public EventFileResponseInfo withFileAtime(Long fileAtime) {
        this.fileAtime = fileAtime;
        return this;
    }

    /**
     * 文件最后一次访问时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return fileAtime
     */
    public Long getFileAtime() {
        return fileAtime;
    }

    public void setFileAtime(Long fileAtime) {
        this.fileAtime = fileAtime;
    }

    public EventFileResponseInfo withFileCtime(Long fileCtime) {
        this.fileCtime = fileCtime;
        return this;
    }

    /**
     * 文件最后一次状态改变时间
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

    public EventFileResponseInfo withFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }

    /**
     * 文件hash,当前为sha256
     * @return fileHash
     */
    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public EventFileResponseInfo withFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }

    /**
     * 文件md5
     * @return fileMd5
     */
    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public EventFileResponseInfo withFileSha256(String fileSha256) {
        this.fileSha256 = fileSha256;
        return this;
    }

    /**
     * 文件sha256
     * @return fileSha256
     */
    public String getFileSha256() {
        return fileSha256;
    }

    public void setFileSha256(String fileSha256) {
        this.fileSha256 = fileSha256;
    }

    public EventFileResponseInfo withFileType(String fileType) {
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

    public EventFileResponseInfo withFileContent(String fileContent) {
        this.fileContent = fileContent;
        return this;
    }

    /**
     * 文件内容
     * @return fileContent
     */
    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public EventFileResponseInfo withFileAttr(String fileAttr) {
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

    public EventFileResponseInfo withFileOperation(Integer fileOperation) {
        this.fileOperation = fileOperation;
        return this;
    }

    /**
     * 文件操作类型
     * minimum: 0
     * maximum: 2147483647
     * @return fileOperation
     */
    public Integer getFileOperation() {
        return fileOperation;
    }

    public void setFileOperation(Integer fileOperation) {
        this.fileOperation = fileOperation;
    }

    public EventFileResponseInfo withFileAction(String fileAction) {
        this.fileAction = fileAction;
        return this;
    }

    /**
     * 文件动作
     * @return fileAction
     */
    public String getFileAction() {
        return fileAction;
    }

    public void setFileAction(String fileAction) {
        this.fileAction = fileAction;
    }

    public EventFileResponseInfo withFileChangeAttr(String fileChangeAttr) {
        this.fileChangeAttr = fileChangeAttr;
        return this;
    }

    /**
     * 变更前后的属性
     * @return fileChangeAttr
     */
    public String getFileChangeAttr() {
        return fileChangeAttr;
    }

    public void setFileChangeAttr(String fileChangeAttr) {
        this.fileChangeAttr = fileChangeAttr;
    }

    public EventFileResponseInfo withFileNewPath(String fileNewPath) {
        this.fileNewPath = fileNewPath;
        return this;
    }

    /**
     * 新文件路径
     * @return fileNewPath
     */
    public String getFileNewPath() {
        return fileNewPath;
    }

    public void setFileNewPath(String fileNewPath) {
        this.fileNewPath = fileNewPath;
    }

    public EventFileResponseInfo withFileDesc(String fileDesc) {
        this.fileDesc = fileDesc;
        return this;
    }

    /**
     * 文件描述
     * @return fileDesc
     */
    public String getFileDesc() {
        return fileDesc;
    }

    public void setFileDesc(String fileDesc) {
        this.fileDesc = fileDesc;
    }

    public EventFileResponseInfo withFileKeyWord(String fileKeyWord) {
        this.fileKeyWord = fileKeyWord;
        return this;
    }

    /**
     * 文件关键字
     * @return fileKeyWord
     */
    public String getFileKeyWord() {
        return fileKeyWord;
    }

    public void setFileKeyWord(String fileKeyWord) {
        this.fileKeyWord = fileKeyWord;
    }

    public EventFileResponseInfo withIsDir(Boolean isDir) {
        this.isDir = isDir;
        return this;
    }

    /**
     * 是否目录
     * @return isDir
     */
    public Boolean getIsDir() {
        return isDir;
    }

    public void setIsDir(Boolean isDir) {
        this.isDir = isDir;
    }

    public EventFileResponseInfo withFdInfo(String fdInfo) {
        this.fdInfo = fdInfo;
        return this;
    }

    /**
     * 文件句柄信息
     * @return fdInfo
     */
    public String getFdInfo() {
        return fdInfo;
    }

    public void setFdInfo(String fdInfo) {
        this.fdInfo = fdInfo;
    }

    public EventFileResponseInfo withFdCount(Integer fdCount) {
        this.fdCount = fdCount;
        return this;
    }

    /**
     * 文件句柄数量
     * minimum: 0
     * maximum: 2147483647
     * @return fdCount
     */
    public Integer getFdCount() {
        return fdCount;
    }

    public void setFdCount(Integer fdCount) {
        this.fdCount = fdCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventFileResponseInfo that = (EventFileResponseInfo) obj;
        return Objects.equals(this.filePath, that.filePath) && Objects.equals(this.fileAlias, that.fileAlias)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.fileMtime, that.fileMtime)
            && Objects.equals(this.fileAtime, that.fileAtime) && Objects.equals(this.fileCtime, that.fileCtime)
            && Objects.equals(this.fileHash, that.fileHash) && Objects.equals(this.fileMd5, that.fileMd5)
            && Objects.equals(this.fileSha256, that.fileSha256) && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.fileContent, that.fileContent) && Objects.equals(this.fileAttr, that.fileAttr)
            && Objects.equals(this.fileOperation, that.fileOperation)
            && Objects.equals(this.fileAction, that.fileAction)
            && Objects.equals(this.fileChangeAttr, that.fileChangeAttr)
            && Objects.equals(this.fileNewPath, that.fileNewPath) && Objects.equals(this.fileDesc, that.fileDesc)
            && Objects.equals(this.fileKeyWord, that.fileKeyWord) && Objects.equals(this.isDir, that.isDir)
            && Objects.equals(this.fdInfo, that.fdInfo) && Objects.equals(this.fdCount, that.fdCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath,
            fileAlias,
            fileSize,
            fileMtime,
            fileAtime,
            fileCtime,
            fileHash,
            fileMd5,
            fileSha256,
            fileType,
            fileContent,
            fileAttr,
            fileOperation,
            fileAction,
            fileChangeAttr,
            fileNewPath,
            fileDesc,
            fileKeyWord,
            isDir,
            fdInfo,
            fdCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventFileResponseInfo {\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileAlias: ").append(toIndentedString(fileAlias)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileMtime: ").append(toIndentedString(fileMtime)).append("\n");
        sb.append("    fileAtime: ").append(toIndentedString(fileAtime)).append("\n");
        sb.append("    fileCtime: ").append(toIndentedString(fileCtime)).append("\n");
        sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
        sb.append("    fileMd5: ").append(toIndentedString(fileMd5)).append("\n");
        sb.append("    fileSha256: ").append(toIndentedString(fileSha256)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    fileContent: ").append(toIndentedString(fileContent)).append("\n");
        sb.append("    fileAttr: ").append(toIndentedString(fileAttr)).append("\n");
        sb.append("    fileOperation: ").append(toIndentedString(fileOperation)).append("\n");
        sb.append("    fileAction: ").append(toIndentedString(fileAction)).append("\n");
        sb.append("    fileChangeAttr: ").append(toIndentedString(fileChangeAttr)).append("\n");
        sb.append("    fileNewPath: ").append(toIndentedString(fileNewPath)).append("\n");
        sb.append("    fileDesc: ").append(toIndentedString(fileDesc)).append("\n");
        sb.append("    fileKeyWord: ").append(toIndentedString(fileKeyWord)).append("\n");
        sb.append("    isDir: ").append(toIndentedString(isDir)).append("\n");
        sb.append("    fdInfo: ").append(toIndentedString(fdInfo)).append("\n");
        sb.append("    fdCount: ").append(toIndentedString(fdCount)).append("\n");
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
