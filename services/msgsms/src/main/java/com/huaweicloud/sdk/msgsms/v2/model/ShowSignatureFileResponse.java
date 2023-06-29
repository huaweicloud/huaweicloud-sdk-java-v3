package com.huaweicloud.sdk.msgsms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSignatureFileResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_ref")

    private Integer fileRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Integer fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private Integer fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_type")

    private Integer moduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_desc")

    private String fileDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public ShowSignatureFileResponse withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 文件ID
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public ShowSignatureFileResponse withFileName(String fileName) {
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

    public ShowSignatureFileResponse withFileRef(Integer fileRef) {
        this.fileRef = fileRef;
        return this;
    }

    /**
     * 文件引用
     * minimum: 1
     * maximum: 2147483647
     * @return fileRef
     */
    public Integer getFileRef() {
        return fileRef;
    }

    public void setFileRef(Integer fileRef) {
        this.fileRef = fileRef;
    }

    public ShowSignatureFileResponse withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件大小
     * minimum: 1
     * maximum: 2147483647
     * @return fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public ShowSignatureFileResponse withFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文件类型
     * minimum: 1
     * maximum: 2147483647
     * @return fileType
     */
    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public ShowSignatureFileResponse withModuleType(Integer moduleType) {
        this.moduleType = moduleType;
        return this;
    }

    /**
     * 模块类型
     * minimum: 1
     * maximum: 2147483647
     * @return moduleType
     */
    public Integer getModuleType() {
        return moduleType;
    }

    public void setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
    }

    public ShowSignatureFileResponse withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作人
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ShowSignatureFileResponse withFileDesc(String fileDesc) {
        this.fileDesc = fileDesc;
        return this;
    }

    /**
     * 描述
     * @return fileDesc
     */
    public String getFileDesc() {
        return fileDesc;
    }

    public void setFileDesc(String fileDesc) {
        this.fileDesc = fileDesc;
    }

    public ShowSignatureFileResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSignatureFileResponse that = (ShowSignatureFileResponse) obj;
        return Objects.equals(this.fileId, that.fileId) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.fileRef, that.fileRef) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.moduleType, that.moduleType)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.fileDesc, that.fileDesc)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId, fileName, fileRef, fileSize, fileType, moduleType, operator, fileDesc, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSignatureFileResponse {\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileRef: ").append(toIndentedString(fileRef)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    moduleType: ").append(toIndentedString(moduleType)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    fileDesc: ").append(toIndentedString(fileDesc)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
