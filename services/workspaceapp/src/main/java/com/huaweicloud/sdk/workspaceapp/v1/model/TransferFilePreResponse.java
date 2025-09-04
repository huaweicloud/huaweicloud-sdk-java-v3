package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class TransferFilePreResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_file_url")

    private String targetFileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_system_name")

    private String fileSystemName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folder_name")

    private String folderName;

    public TransferFilePreResponse withTargetFileUrl(String targetFileUrl) {
        this.targetFileUrl = targetFileUrl;
        return this;
    }

    /**
     * 待流转文件url。
     * @return targetFileUrl
     */
    public String getTargetFileUrl() {
        return targetFileUrl;
    }

    public void setTargetFileUrl(String targetFileUrl) {
        this.targetFileUrl = targetFileUrl;
    }

    public TransferFilePreResponse withFileSystemName(String fileSystemName) {
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

    public TransferFilePreResponse withFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }

    /**
     * 用户可自定义的文件夹名称。
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
        TransferFilePreResponse that = (TransferFilePreResponse) obj;
        return Objects.equals(this.targetFileUrl, that.targetFileUrl)
            && Objects.equals(this.fileSystemName, that.fileSystemName)
            && Objects.equals(this.folderName, that.folderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetFileUrl, fileSystemName, folderName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferFilePreResponse {\n");
        sb.append("    targetFileUrl: ").append(toIndentedString(targetFileUrl)).append("\n");
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
