package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class FailedObjectRecordDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private Boolean result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_file_key")

    @JacksonXmlProperty(localName = "list_file_key")

    private String listFileKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    @JacksonXmlProperty(localName = "error_code")

    private String errorCode;

    public FailedObjectRecordDto withResult(Boolean result) {
        this.result = result;
        return this;
    }

    /**
     * 是否支持失败对象重传。
     * @return result
     */
    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public FailedObjectRecordDto withListFileKey(String listFileKey) {
        this.listFileKey = listFileKey;
        return this;
    }

    /**
     * 失败对象列表文件路径。
     * @return listFileKey
     */
    public String getListFileKey() {
        return listFileKey;
    }

    public void setListFileKey(String listFileKey) {
        this.listFileKey = listFileKey;
    }

    public FailedObjectRecordDto withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 失败对象列表上传失败的错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FailedObjectRecordDto failedObjectRecordDto = (FailedObjectRecordDto) o;
        return Objects.equals(this.result, failedObjectRecordDto.result)
            && Objects.equals(this.listFileKey, failedObjectRecordDto.listFileKey)
            && Objects.equals(this.errorCode, failedObjectRecordDto.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, listFileKey, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailedObjectRecordDto {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    listFileKey: ").append(toIndentedString(listFileKey)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
