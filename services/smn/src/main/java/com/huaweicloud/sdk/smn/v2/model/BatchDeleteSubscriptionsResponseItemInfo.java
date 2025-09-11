package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchDeleteSubscriptionsResponseItemInfo
 */
public class BatchDeleteSubscriptionsResponseItemInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_code")

    private Integer httpCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public BatchDeleteSubscriptionsResponseItemInfo withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public BatchDeleteSubscriptionsResponseItemInfo withHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }

    /**
     * 返回码。
     * @return httpCode
     */
    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public BatchDeleteSubscriptionsResponseItemInfo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 服务异常错误信息编码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BatchDeleteSubscriptionsResponseItemInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 服务异常错误信息描述。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteSubscriptionsResponseItemInfo that = (BatchDeleteSubscriptionsResponseItemInfo) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.httpCode, that.httpCode)
            && Objects.equals(this.code, that.code) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, httpCode, code, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteSubscriptionsResponseItemInfo {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
