package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProtocolReqVo
 */
public class ProtocolReqVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic")

    private BasicInfoVo basic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private Map<String, String> headers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_body")

    private String requestBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public ProtocolReqVo withBasic(BasicInfoVo basic) {
        this.basic = basic;
        return this;
    }

    public ProtocolReqVo withBasic(Consumer<BasicInfoVo> basicSetter) {
        if (this.basic == null) {
            this.basic = new BasicInfoVo();
            basicSetter.accept(this.basic);
        }

        return this;
    }

    /**
     * Get basic
     * @return basic
     */
    public BasicInfoVo getBasic() {
        return basic;
    }

    public void setBasic(BasicInfoVo basic) {
        this.basic = basic;
    }

    public ProtocolReqVo withHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    public ProtocolReqVo putHeadersItem(String key, String headersItem) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(key, headersItem);
        return this;
    }

    public ProtocolReqVo withHeaders(Consumer<Map<String, String>> headersSetter) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        headersSetter.accept(this.headers);
        return this;
    }

    /**
     * 请求头
     * @return headers
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public ProtocolReqVo withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * 方法
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ProtocolReqVo withRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * 请求body体
     * @return requestBody
     */
    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public ProtocolReqVo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * url
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
        ProtocolReqVo that = (ProtocolReqVo) obj;
        return Objects.equals(this.basic, that.basic) && Objects.equals(this.headers, that.headers)
            && Objects.equals(this.method, that.method) && Objects.equals(this.requestBody, that.requestBody)
            && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basic, headers, method, requestBody, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtocolReqVo {\n");
        sb.append("    basic: ").append(toIndentedString(basic)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
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
