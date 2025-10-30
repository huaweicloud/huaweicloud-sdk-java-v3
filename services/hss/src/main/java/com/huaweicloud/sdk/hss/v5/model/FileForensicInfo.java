package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件取证信息
 */
public class FileForensicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_new_path")

    private String fileNewPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_sha256")

    private String fileSha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_action")

    private String fileAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_operation")

    private Integer fileOperation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Integer fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_hash")

    private String fileHash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_desc")

    private String fileDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_dir")

    private Boolean isDir;

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
    @JsonProperty(value = "file_alias")

    private String fileAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_md5")

    private String fileMd5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_key_word")

    private String fileKeyWord;

    public FileForensicInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释**： 文件路径 **取值范围**： 不涉及
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public FileForensicInfo withFileNewPath(String fileNewPath) {
        this.fileNewPath = fileNewPath;
        return this;
    }

    /**
     * **参数解释**： 文件新路径 **取值范围**： 不涉及
     * @return fileNewPath
     */
    public String getFileNewPath() {
        return fileNewPath;
    }

    public void setFileNewPath(String fileNewPath) {
        this.fileNewPath = fileNewPath;
    }

    public FileForensicInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释**： 文件名称 **取值范围**： 不涉及
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileForensicInfo withFileSha256(String fileSha256) {
        this.fileSha256 = fileSha256;
        return this;
    }

    /**
     * **参数解释**： 文件sha256 **取值范围**： 不涉及
     * @return fileSha256
     */
    public String getFileSha256() {
        return fileSha256;
    }

    public void setFileSha256(String fileSha256) {
        this.fileSha256 = fileSha256;
    }

    public FileForensicInfo withFileAction(String fileAction) {
        this.fileAction = fileAction;
        return this;
    }

    /**
     * **参数解释**： 文件动作 **取值范围**： 不涉及
     * @return fileAction
     */
    public String getFileAction() {
        return fileAction;
    }

    public void setFileAction(String fileAction) {
        this.fileAction = fileAction;
    }

    public FileForensicInfo withFileOperation(Integer fileOperation) {
        this.fileOperation = fileOperation;
        return this;
    }

    /**
     * **参数解释**： 文件操作类型 **取值范围**： 不涉及
     * @return fileOperation
     */
    public Integer getFileOperation() {
        return fileOperation;
    }

    public void setFileOperation(Integer fileOperation) {
        this.fileOperation = fileOperation;
    }

    public FileForensicInfo withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * **参数解释**： 文件大小 **取值范围**： 不涉及
     * @return fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public FileForensicInfo withFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }

    /**
     * **参数解释**： 文件hash,当前为sha256 **取值范围**： 不涉及
     * @return fileHash
     */
    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public FileForensicInfo withFileDesc(String fileDesc) {
        this.fileDesc = fileDesc;
        return this;
    }

    /**
     * **参数解释**： 文件描述 **取值范围**： 不涉及
     * @return fileDesc
     */
    public String getFileDesc() {
        return fileDesc;
    }

    public void setFileDesc(String fileDesc) {
        this.fileDesc = fileDesc;
    }

    public FileForensicInfo withIsDir(Boolean isDir) {
        this.isDir = isDir;
        return this;
    }

    /**
     * **参数解释**： 是否目录 **取值范围**： 不涉及
     * @return isDir
     */
    public Boolean getIsDir() {
        return isDir;
    }

    public void setIsDir(Boolean isDir) {
        this.isDir = isDir;
    }

    public FileForensicInfo withFileMtime(Long fileMtime) {
        this.fileMtime = fileMtime;
        return this;
    }

    /**
     * **参数解释**： 文件最后一次修改时间(毫秒) **取值范围**： 不涉及
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

    public FileForensicInfo withFileAtime(Long fileAtime) {
        this.fileAtime = fileAtime;
        return this;
    }

    /**
     * **参数解释**： 文件最后一次访问时间(毫秒) **取值范围**： 不涉及
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

    public FileForensicInfo withFileCtime(Long fileCtime) {
        this.fileCtime = fileCtime;
        return this;
    }

    /**
     * **参数解释**： 文件最后一次状态改变时间(毫秒) **取值范围**： 不涉及
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

    public FileForensicInfo withFileAlias(String fileAlias) {
        this.fileAlias = fileAlias;
        return this;
    }

    /**
     * **参数解释**： 文件别名 **取值范围**： 不涉及
     * @return fileAlias
     */
    public String getFileAlias() {
        return fileAlias;
    }

    public void setFileAlias(String fileAlias) {
        this.fileAlias = fileAlias;
    }

    public FileForensicInfo withFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
        return this;
    }

    /**
     * **参数解释**： 文件md5 **取值范围**： 不涉及
     * @return fileMd5
     */
    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public FileForensicInfo withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * **参数解释**： 文件类型 **取值范围**： 不涉及
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public FileForensicInfo withFileKeyWord(String fileKeyWord) {
        this.fileKeyWord = fileKeyWord;
        return this;
    }

    /**
     * **参数解释**： 文件关键字 **取值范围**： 不涉及
     * @return fileKeyWord
     */
    public String getFileKeyWord() {
        return fileKeyWord;
    }

    public void setFileKeyWord(String fileKeyWord) {
        this.fileKeyWord = fileKeyWord;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileForensicInfo that = (FileForensicInfo) obj;
        return Objects.equals(this.filePath, that.filePath) && Objects.equals(this.fileNewPath, that.fileNewPath)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileSha256, that.fileSha256)
            && Objects.equals(this.fileAction, that.fileAction)
            && Objects.equals(this.fileOperation, that.fileOperation) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.fileHash, that.fileHash) && Objects.equals(this.fileDesc, that.fileDesc)
            && Objects.equals(this.isDir, that.isDir) && Objects.equals(this.fileMtime, that.fileMtime)
            && Objects.equals(this.fileAtime, that.fileAtime) && Objects.equals(this.fileCtime, that.fileCtime)
            && Objects.equals(this.fileAlias, that.fileAlias) && Objects.equals(this.fileMd5, that.fileMd5)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.fileKeyWord, that.fileKeyWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath,
            fileNewPath,
            fileName,
            fileSha256,
            fileAction,
            fileOperation,
            fileSize,
            fileHash,
            fileDesc,
            isDir,
            fileMtime,
            fileAtime,
            fileCtime,
            fileAlias,
            fileMd5,
            fileType,
            fileKeyWord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileForensicInfo {\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileNewPath: ").append(toIndentedString(fileNewPath)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileSha256: ").append(toIndentedString(fileSha256)).append("\n");
        sb.append("    fileAction: ").append(toIndentedString(fileAction)).append("\n");
        sb.append("    fileOperation: ").append(toIndentedString(fileOperation)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
        sb.append("    fileDesc: ").append(toIndentedString(fileDesc)).append("\n");
        sb.append("    isDir: ").append(toIndentedString(isDir)).append("\n");
        sb.append("    fileMtime: ").append(toIndentedString(fileMtime)).append("\n");
        sb.append("    fileAtime: ").append(toIndentedString(fileAtime)).append("\n");
        sb.append("    fileCtime: ").append(toIndentedString(fileCtime)).append("\n");
        sb.append("    fileAlias: ").append(toIndentedString(fileAlias)).append("\n");
        sb.append("    fileMd5: ").append(toIndentedString(fileMd5)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    fileKeyWord: ").append(toIndentedString(fileKeyWord)).append("\n");
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
