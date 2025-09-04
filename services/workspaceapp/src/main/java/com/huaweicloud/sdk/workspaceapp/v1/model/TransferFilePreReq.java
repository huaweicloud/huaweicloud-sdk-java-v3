package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件预流转请求体
 */
public class TransferFilePreReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_code")

    private String fileCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_acc_code")

    private String fileAccCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_system_name")

    private String fileSystemName;

    public TransferFilePreReq withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 分享者或接收者的用户标识。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public TransferFilePreReq withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 待流转的文件名称，不包含完整路径。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public TransferFilePreReq withFileCode(String fileCode) {
        this.fileCode = fileCode;
        return this;
    }

    /**
     * 文件编码。
     * @return fileCode
     */
    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    public TransferFilePreReq withFileAccCode(String fileAccCode) {
        this.fileAccCode = fileAccCode;
        return this;
    }

    /**
     * 文件提取码。
     * @return fileAccCode
     */
    public String getFileAccCode() {
        return fileAccCode;
    }

    public void setFileAccCode(String fileAccCode) {
        this.fileAccCode = fileAccCode;
    }

    public TransferFilePreReq withFileSystemName(String fileSystemName) {
        this.fileSystemName = fileSystemName;
        return this;
    }

    /**
     * 文件系统名称。
     * @return fileSystemName
     */
    public String getFileSystemName() {
        return fileSystemName;
    }

    public void setFileSystemName(String fileSystemName) {
        this.fileSystemName = fileSystemName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransferFilePreReq that = (TransferFilePreReq) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.fileCode, that.fileCode) && Objects.equals(this.fileAccCode, that.fileAccCode)
            && Objects.equals(this.fileSystemName, that.fileSystemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, fileName, fileCode, fileAccCode, fileSystemName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferFilePreReq {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileCode: ").append(toIndentedString(fileCode)).append("\n");
        sb.append("    fileAccCode: ").append(toIndentedString(fileAccCode)).append("\n");
        sb.append("    fileSystemName: ").append(toIndentedString(fileSystemName)).append("\n");
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
