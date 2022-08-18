package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 导入函数请求结构体
 */
public class ImportFunctionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func_name")

    private String funcName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_code")

    private String fileCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package")

    private String _package;

    public ImportFunctionRequestBody withFuncName(String funcName) {
        this.funcName = funcName;
        return this;
    }

    /**
     * 函数名
     * @return funcName
     */
    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public ImportFunctionRequestBody withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ImportFunctionRequestBody withFileType(String fileType) {
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

    public ImportFunctionRequestBody withFileCode(String fileCode) {
        this.fileCode = fileCode;
        return this;
    }

    /**
     * 函数代码。代码必须要进行base64编码
     * @return fileCode
     */
    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    public ImportFunctionRequestBody withPackage(String _package) {
        this._package = _package;
        return this;
    }

    /**
     * 应用名称，默认为default
     * @return _package
     */
    public String getPackage() {
        return _package;
    }

    public void setPackage(String _package) {
        this._package = _package;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportFunctionRequestBody importFunctionRequestBody = (ImportFunctionRequestBody) o;
        return Objects.equals(this.funcName, importFunctionRequestBody.funcName)
            && Objects.equals(this.fileName, importFunctionRequestBody.fileName)
            && Objects.equals(this.fileType, importFunctionRequestBody.fileType)
            && Objects.equals(this.fileCode, importFunctionRequestBody.fileCode)
            && Objects.equals(this._package, importFunctionRequestBody._package);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcName, fileName, fileType, fileCode, _package);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportFunctionRequestBody {\n");
        sb.append("    funcName: ").append(toIndentedString(funcName)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    fileCode: ").append(toIndentedString(fileCode)).append("\n");
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
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
