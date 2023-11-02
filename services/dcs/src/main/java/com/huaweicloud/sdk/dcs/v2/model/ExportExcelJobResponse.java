package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ExportExcelJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "link")

    private String link;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_code")

    private String errCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "err_msg")

    private String errMsg;

    public ExportExcelJobResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ExportExcelJobResponse withFileName(String fileName) {
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

    public ExportExcelJobResponse withLink(String link) {
        this.link = link;
        return this;
    }

    /**
     * 链接
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ExportExcelJobResponse withErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }

    /**
     * 错误码
     * @return errCode
     */
    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public ExportExcelJobResponse withErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

    /**
     * 错误信息
     * @return errMsg
     */
    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportExcelJobResponse that = (ExportExcelJobResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.link, that.link) && Objects.equals(this.errCode, that.errCode)
            && Objects.equals(this.errMsg, that.errMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, fileName, link, errCode, errMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportExcelJobResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    errCode: ").append(toIndentedString(errCode)).append("\n");
        sb.append("    errMsg: ").append(toIndentedString(errMsg)).append("\n");
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
