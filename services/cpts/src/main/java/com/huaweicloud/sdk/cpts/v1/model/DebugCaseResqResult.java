package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** DebugCaseResqResult */
public class DebugCaseResqResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorReason")

    private String errorReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header")

    private DebugCaseResqHeader header;

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

    private DebugCaseResqReturnHeader returnHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusCode")

    private String statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public DebugCaseResqResult withBody(String body) {
        this.body = body;
        return this;
    }

    /** body
     * 
     * @return body */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public DebugCaseResqResult withErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    /** errorReason
     * 
     * @return errorReason */
    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    public DebugCaseResqResult withHeader(DebugCaseResqHeader header) {
        this.header = header;
        return this;
    }

    public DebugCaseResqResult withHeader(Consumer<DebugCaseResqHeader> headerSetter) {
        if (this.header == null) {
            this.header = new DebugCaseResqHeader();
            headerSetter.accept(this.header);
        }

        return this;
    }

    /** Get header
     * 
     * @return header */
    public DebugCaseResqHeader getHeader() {
        return header;
    }

    public void setHeader(DebugCaseResqHeader header) {
        this.header = header;
    }

    public DebugCaseResqResult withName(String name) {
        this.name = name;
        return this;
    }

    /** name
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DebugCaseResqResult withResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
        return this;
    }

    /** responseTime minimum: 0 maximum: 1024
     * 
     * @return responseTime */
    public Integer getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
    }

    public DebugCaseResqResult withResult(Integer result) {
        this.result = result;
        return this;
    }

    /** result minimum: 0 maximum: 2147483647
     * 
     * @return result */
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public DebugCaseResqResult withReturnBody(String returnBody) {
        this.returnBody = returnBody;
        return this;
    }

    /** returnBody
     * 
     * @return returnBody */
    public String getReturnBody() {
        return returnBody;
    }

    public void setReturnBody(String returnBody) {
        this.returnBody = returnBody;
    }

    public DebugCaseResqResult withReturnHeader(DebugCaseResqReturnHeader returnHeader) {
        this.returnHeader = returnHeader;
        return this;
    }

    public DebugCaseResqResult withReturnHeader(Consumer<DebugCaseResqReturnHeader> returnHeaderSetter) {
        if (this.returnHeader == null) {
            this.returnHeader = new DebugCaseResqReturnHeader();
            returnHeaderSetter.accept(this.returnHeader);
        }

        return this;
    }

    /** Get returnHeader
     * 
     * @return returnHeader */
    public DebugCaseResqReturnHeader getReturnHeader() {
        return returnHeader;
    }

    public void setReturnHeader(DebugCaseResqReturnHeader returnHeader) {
        this.returnHeader = returnHeader;
    }

    public DebugCaseResqResult withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /** statusCode
     * 
     * @return statusCode */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public DebugCaseResqResult withUrl(String url) {
        this.url = url;
        return this;
    }

    /** url
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DebugCaseResqResult debugCaseResqResult = (DebugCaseResqResult) o;
        return Objects.equals(this.body, debugCaseResqResult.body)
            && Objects.equals(this.errorReason, debugCaseResqResult.errorReason)
            && Objects.equals(this.header, debugCaseResqResult.header)
            && Objects.equals(this.name, debugCaseResqResult.name)
            && Objects.equals(this.responseTime, debugCaseResqResult.responseTime)
            && Objects.equals(this.result, debugCaseResqResult.result)
            && Objects.equals(this.returnBody, debugCaseResqResult.returnBody)
            && Objects.equals(this.returnHeader, debugCaseResqResult.returnHeader)
            && Objects.equals(this.statusCode, debugCaseResqResult.statusCode)
            && Objects.equals(this.url, debugCaseResqResult.url);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(body, errorReason, header, name, responseTime, result, returnBody, returnHeader, statusCode, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugCaseResqResult {\n");
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
