package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApiTestResponseHeader
 */
public class ApiTestResponseHeader {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_status")

    private String resultStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_length")

    private Integer contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_control")

    private String cacheControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_type")

    private String contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_request_id")

    private String xRequestId;

    public ApiTestResponseHeader withResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }

    /**
     * 是否成功
     * @return resultStatus
     */
    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public ApiTestResponseHeader withContentLength(Integer contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * 内容大小
     * @return contentLength
     */
    public Integer getContentLength() {
        return contentLength;
    }

    public void setContentLength(Integer contentLength) {
        this.contentLength = contentLength;
    }

    public ApiTestResponseHeader withConnection(String connection) {
        this.connection = connection;
        return this;
    }

    /**
     * 连接状态
     * @return connection
     */
    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public ApiTestResponseHeader withCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * 缓存控制（固定值）
     * @return cacheControl
     */
    public String getCacheControl() {
        return cacheControl;
    }

    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    public ApiTestResponseHeader withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * 内容类型 （固定值）
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public ApiTestResponseHeader withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 日期
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ApiTestResponseHeader withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * 请求ID
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_request_id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiTestResponseHeader apiTestResponseHeader = (ApiTestResponseHeader) o;
        return Objects.equals(this.resultStatus, apiTestResponseHeader.resultStatus)
            && Objects.equals(this.contentLength, apiTestResponseHeader.contentLength)
            && Objects.equals(this.connection, apiTestResponseHeader.connection)
            && Objects.equals(this.cacheControl, apiTestResponseHeader.cacheControl)
            && Objects.equals(this.contentType, apiTestResponseHeader.contentType)
            && Objects.equals(this.date, apiTestResponseHeader.date)
            && Objects.equals(this.xRequestId, apiTestResponseHeader.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultStatus, contentLength, connection, cacheControl, contentType, date, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiTestResponseHeader {\n");
        sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    cacheControl: ").append(toIndentedString(cacheControl)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
