package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件分享
 */
public class TransferFileReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_type")

    private Integer transferType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_url")

    private String fileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_code")

    private String fileCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_acc_code")

    private String fileAccCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_file_url")

    private String targetFileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_system_name")

    private String fileSystemName;

    public TransferFileReq withTransferType(Integer transferType) {
        this.transferType = transferType;
        return this;
    }

    /**
     * 操作方式, 0:个人->共享, 1:共享->个人。
     * minimum: 0
     * maximum: 1
     * @return transferType
     */
    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    public TransferFileReq withUserName(String userName) {
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

    public TransferFileReq withFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    /**
     * 待流转文件url。
     * @return fileUrl
     */
    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public TransferFileReq withFileCode(String fileCode) {
        this.fileCode = fileCode;
        return this;
    }

    /**
     * 文件编码(仅接收文件使用，从分享返回体获取)。
     * @return fileCode
     */
    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    public TransferFileReq withFileAccCode(String fileAccCode) {
        this.fileAccCode = fileAccCode;
        return this;
    }

    /**
     * 文件提取码(仅接收文件使用，从分享返回体获取)。
     * @return fileAccCode
     */
    public String getFileAccCode() {
        return fileAccCode;
    }

    public void setFileAccCode(String fileAccCode) {
        this.fileAccCode = fileAccCode;
    }

    public TransferFileReq withTargetFileUrl(String targetFileUrl) {
        this.targetFileUrl = targetFileUrl;
        return this;
    }

    /**
     * 目标文件url。
     * @return targetFileUrl
     */
    public String getTargetFileUrl() {
        return targetFileUrl;
    }

    public void setTargetFileUrl(String targetFileUrl) {
        this.targetFileUrl = targetFileUrl;
    }

    public TransferFileReq withFileSystemName(String fileSystemName) {
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
        TransferFileReq that = (TransferFileReq) obj;
        return Objects.equals(this.transferType, that.transferType) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.fileUrl, that.fileUrl) && Objects.equals(this.fileCode, that.fileCode)
            && Objects.equals(this.fileAccCode, that.fileAccCode)
            && Objects.equals(this.targetFileUrl, that.targetFileUrl)
            && Objects.equals(this.fileSystemName, that.fileSystemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transferType, userName, fileUrl, fileCode, fileAccCode, targetFileUrl, fileSystemName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferFileReq {\n");
        sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
        sb.append("    fileCode: ").append(toIndentedString(fileCode)).append("\n");
        sb.append("    fileAccCode: ").append(toIndentedString(fileAccCode)).append("\n");
        sb.append("    targetFileUrl: ").append(toIndentedString(targetFileUrl)).append("\n");
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
