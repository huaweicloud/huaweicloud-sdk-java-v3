package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** SlowlogDownloadRequest */
public class SlowlogDownloadRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    public SlowlogDownloadRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /** - 请求ID，uuid，代表此次获取慢日志的请求ID。
     * 
     * @return requestId */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public SlowlogDownloadRequest withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /** - 需要下载的文件的文件名, 当引擎为SQL Server时为必选。
     * 
     * @return fileName */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlowlogDownloadRequest slowlogDownloadRequest = (SlowlogDownloadRequest) o;
        return Objects.equals(this.requestId, slowlogDownloadRequest.requestId)
            && Objects.equals(this.fileName, slowlogDownloadRequest.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, fileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowlogDownloadRequest {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
