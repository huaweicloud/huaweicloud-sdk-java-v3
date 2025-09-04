package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class TransferFileResponse extends SdkResponse {

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
    @JsonProperty(value = "file_system_name")

    private String fileSystemName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_name")

    private String folderName;

    public TransferFileResponse withFileUrl(String fileUrl) {
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

    public TransferFileResponse withFileCode(String fileCode) {
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

    public TransferFileResponse withFileAccCode(String fileAccCode) {
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

    public TransferFileResponse withFileSystemName(String fileSystemName) {
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

    public TransferFileResponse withFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }

    /**
     * 文件夹名称。
     * @return folderName
     */
    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransferFileResponse that = (TransferFileResponse) obj;
        return Objects.equals(this.fileUrl, that.fileUrl) && Objects.equals(this.fileCode, that.fileCode)
            && Objects.equals(this.fileAccCode, that.fileAccCode)
            && Objects.equals(this.fileSystemName, that.fileSystemName)
            && Objects.equals(this.folderName, that.folderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileUrl, fileCode, fileAccCode, fileSystemName, folderName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferFileResponse {\n");
        sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
        sb.append("    fileCode: ").append(toIndentedString(fileCode)).append("\n");
        sb.append("    fileAccCode: ").append(toIndentedString(fileAccCode)).append("\n");
        sb.append("    fileSystemName: ").append(toIndentedString(fileSystemName)).append("\n");
        sb.append("    folderName: ").append(toIndentedString(folderName)).append("\n");
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
