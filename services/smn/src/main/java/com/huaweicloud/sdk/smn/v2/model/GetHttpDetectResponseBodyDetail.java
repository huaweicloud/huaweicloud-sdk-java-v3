package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 终端探测详情
 */
public class GetHttpDetectResponseBodyDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpCode")

    private Integer httpCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpResponse")

    private String httpResponse;

    public GetHttpDetectResponseBodyDetail withHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }

    /**
     * 探测终端返回的http返回码，0代表用户在黑名单无法发送，-1代表用户终端超过5秒未响应，-2代表队列已满，Http探测任务未执行。其他httpcode为终端实际返回值。
     * @return httpCode
     */
    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public GetHttpDetectResponseBodyDetail withHttpResponse(String httpResponse) {
        this.httpResponse = httpResponse;
        return this;
    }

    /**
     * 终端探测响应体，如果httpCode为0，-1，-2, 2xx时响应体内容固定，由SMN定义。其余httpCode的响应体内容为终端返回内容。
     * @return httpResponse
     */
    public String getHttpResponse() {
        return httpResponse;
    }

    public void setHttpResponse(String httpResponse) {
        this.httpResponse = httpResponse;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetHttpDetectResponseBodyDetail that = (GetHttpDetectResponseBodyDetail) obj;
        return Objects.equals(this.httpCode, that.httpCode) && Objects.equals(this.httpResponse, that.httpResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpCode, httpResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetHttpDetectResponseBodyDetail {\n");
        sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
        sb.append("    httpResponse: ").append(toIndentedString(httpResponse)).append("\n");
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
