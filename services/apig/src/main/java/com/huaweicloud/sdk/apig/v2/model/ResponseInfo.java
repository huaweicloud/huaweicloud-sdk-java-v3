package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResponseInfo
 */
public class ResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private List<ResponseInfoHeader> headers = null;

    public ResponseInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 响应的HTTP状态码。范围为200-599，但不允许为444。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ResponseInfo withBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * 响应的Body模板
     * @return body
     */
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ResponseInfo withHeaders(List<ResponseInfoHeader> headers) {
        this.headers = headers;
        return this;
    }

    public ResponseInfo addHeadersItem(ResponseInfoHeader headersItem) {
        if (this.headers == null) {
            this.headers = new ArrayList<>();
        }
        this.headers.add(headersItem);
        return this;
    }

    public ResponseInfo withHeaders(Consumer<List<ResponseInfoHeader>> headersSetter) {
        if (this.headers == null) {
            this.headers = new ArrayList<>();
        }
        headersSetter.accept(this.headers);
        return this;
    }

    /**
     * 自定义的响应头
     * @return headers
     */
    public List<ResponseInfoHeader> getHeaders() {
        return headers;
    }

    public void setHeaders(List<ResponseInfoHeader> headers) {
        this.headers = headers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseInfo that = (ResponseInfo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.body, that.body)
            && Objects.equals(this.headers, that.headers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, body, headers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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
