package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResponseInfoResp
 */
public class ResponseInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private String body;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private List<ResponseInfoHeader> headers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default")

    private Boolean _default;

    public ResponseInfoResp withStatus(Integer status) {
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

    public ResponseInfoResp withBody(String body) {
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

    public ResponseInfoResp withHeaders(List<ResponseInfoHeader> headers) {
        this.headers = headers;
        return this;
    }

    public ResponseInfoResp addHeadersItem(ResponseInfoHeader headersItem) {
        if (this.headers == null) {
            this.headers = new ArrayList<>();
        }
        this.headers.add(headersItem);
        return this;
    }

    public ResponseInfoResp withHeaders(Consumer<List<ResponseInfoHeader>> headersSetter) {
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

    public ResponseInfoResp withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * 是否为默认响应
     * @return _default
     */
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseInfoResp that = (ResponseInfoResp) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.body, that.body)
            && Objects.equals(this.headers, that.headers) && Objects.equals(this._default, that._default);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, body, headers, _default);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseInfoResp {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
