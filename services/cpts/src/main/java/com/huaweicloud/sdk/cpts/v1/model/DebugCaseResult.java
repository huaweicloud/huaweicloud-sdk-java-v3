package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DebugCaseResult
 */
public class DebugCaseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorReason")

    private String errorReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header")

    private DebugCaseResultHeader header;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "responseTime")

    private Integer responseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Integer result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returnBody")

    private String returnBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returnHeader")

    private DebugCaseReturnHeader returnHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusCode")

    private String statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public DebugCaseResult withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * 响应内容
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public DebugCaseResult withErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    /**
     * 错误原因
     * @return errorReason
     */
    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    public DebugCaseResult withHeader(DebugCaseResultHeader header) {
        this.header = header;
        return this;
    }

    public DebugCaseResult withHeader(Consumer<DebugCaseResultHeader> headerSetter) {
        if (this.header == null) {
            this.header = new DebugCaseResultHeader();
            headerSetter.accept(this.header);
        }

        return this;
    }

    /**
     * Get header
     * @return header
     */
    public DebugCaseResultHeader getHeader() {
        return header;
    }

    public void setHeader(DebugCaseResultHeader header) {
        this.header = header;
    }

    public DebugCaseResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 请求名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DebugCaseResult withResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    /**
     * 响应时间
     * minimum: 0
     * maximum: 1024
     * @return responseTime
     */
    public Integer getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
    }

    public DebugCaseResult withResult(Integer result) {
        this.result = result;
        return this;
    }

    /**
     * 调试结果（1：成功；）
     * minimum: 0
     * maximum: 2147483647
     * @return result
     */
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public DebugCaseResult withReturnBody(String returnBody) {
        this.returnBody = returnBody;
        return this;
    }

    /**
     * 响应正文
     * @return returnBody
     */
    public String getReturnBody() {
        return returnBody;
    }

    public void setReturnBody(String returnBody) {
        this.returnBody = returnBody;
    }

    public DebugCaseResult withReturnHeader(DebugCaseReturnHeader returnHeader) {
        this.returnHeader = returnHeader;
        return this;
    }

    public DebugCaseResult withReturnHeader(Consumer<DebugCaseReturnHeader> returnHeaderSetter) {
        if (this.returnHeader == null) {
            this.returnHeader = new DebugCaseReturnHeader();
            returnHeaderSetter.accept(this.returnHeader);
        }

        return this;
    }

    /**
     * Get returnHeader
     * @return returnHeader
     */
    public DebugCaseReturnHeader getReturnHeader() {
        return returnHeader;
    }

    public void setReturnHeader(DebugCaseReturnHeader returnHeader) {
        this.returnHeader = returnHeader;
    }

    public DebugCaseResult withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 响应状态码
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public DebugCaseResult withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 请求地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DebugCaseResult that = (DebugCaseResult) obj;
        return Objects.equals(this.body, that.body) && Objects.equals(this.errorReason, that.errorReason)
            && Objects.equals(this.header, that.header) && Objects.equals(this.name, that.name)
            && Objects.equals(this.responseTime, that.responseTime) && Objects.equals(this.result, that.result)
            && Objects.equals(this.returnBody, that.returnBody) && Objects.equals(this.returnHeader, that.returnHeader)
            && Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(body, errorReason, header, name, responseTime, result, returnBody, returnHeader, statusCode, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugCaseResult {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    responseTime: ").append(toIndentedString(responseTime)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    returnBody: ").append(toIndentedString(returnBody)).append("\n");
        sb.append("    returnHeader: ").append(toIndentedString(returnHeader)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
