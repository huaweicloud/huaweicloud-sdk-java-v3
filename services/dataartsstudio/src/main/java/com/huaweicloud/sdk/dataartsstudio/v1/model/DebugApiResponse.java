package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DebugApiResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Long timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_header")

    private ApiTestRequestHeader requestHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_header")

    private ApiTestResponseHeader responseHeader;

    public DebugApiResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求编号
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public DebugApiResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 请求url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DebugApiResponse withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 调试结果
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public DebugApiResponse withTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 调试耗时
     * @return timeout
     */
    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    public DebugApiResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * 是否调试成功
     * @return success
     */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public DebugApiResponse withRequestHeader(ApiTestRequestHeader requestHeader) {
        this.requestHeader = requestHeader;
        return this;
    }

    public DebugApiResponse withRequestHeader(Consumer<ApiTestRequestHeader> requestHeaderSetter) {
        if (this.requestHeader == null) {
            this.requestHeader = new ApiTestRequestHeader();
            requestHeaderSetter.accept(this.requestHeader);
        }

        return this;
    }

    /**
     * Get requestHeader
     * @return requestHeader
     */
    public ApiTestRequestHeader getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(ApiTestRequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }

    public DebugApiResponse withResponseHeader(ApiTestResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
        return this;
    }

    public DebugApiResponse withResponseHeader(Consumer<ApiTestResponseHeader> responseHeaderSetter) {
        if (this.responseHeader == null) {
            this.responseHeader = new ApiTestResponseHeader();
            responseHeaderSetter.accept(this.responseHeader);
        }

        return this;
    }

    /**
     * Get responseHeader
     * @return responseHeader
     */
    public ApiTestResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(ApiTestResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DebugApiResponse debugApiResponse = (DebugApiResponse) o;
        return Objects.equals(this.requestId, debugApiResponse.requestId)
            && Objects.equals(this.url, debugApiResponse.url) && Objects.equals(this.result, debugApiResponse.result)
            && Objects.equals(this.timeout, debugApiResponse.timeout)
            && Objects.equals(this.success, debugApiResponse.success)
            && Objects.equals(this.requestHeader, debugApiResponse.requestHeader)
            && Objects.equals(this.responseHeader, debugApiResponse.responseHeader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, url, result, timeout, success, requestHeader, responseHeader);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugApiResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
        sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
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
