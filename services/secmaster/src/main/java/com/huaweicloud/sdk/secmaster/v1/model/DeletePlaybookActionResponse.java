package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DeletePlaybookActionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-API-Deprecation-Info")

    private String xAPIDeprecationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-API-Deprecation-Date")

    private String xAPIDeprecationDate;

    public DeletePlaybookActionResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 错误码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DeletePlaybookActionResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 响应消息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DeletePlaybookActionResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public DeletePlaybookActionResponse withXAPIDeprecationInfo(String xAPIDeprecationInfo) {
        this.xAPIDeprecationInfo = xAPIDeprecationInfo;
        return this;
    }

    /**
     * Get xAPIDeprecationInfo
     * @return xAPIDeprecationInfo
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-API-Deprecation-Info")
    public String getXAPIDeprecationInfo() {
        return xAPIDeprecationInfo;
    }

    public void setXAPIDeprecationInfo(String xAPIDeprecationInfo) {
        this.xAPIDeprecationInfo = xAPIDeprecationInfo;
    }

    public DeletePlaybookActionResponse withXAPIDeprecationDate(String xAPIDeprecationDate) {
        this.xAPIDeprecationDate = xAPIDeprecationDate;
        return this;
    }

    /**
     * Get xAPIDeprecationDate
     * @return xAPIDeprecationDate
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-API-Deprecation-Date")
    public String getXAPIDeprecationDate() {
        return xAPIDeprecationDate;
    }

    public void setXAPIDeprecationDate(String xAPIDeprecationDate) {
        this.xAPIDeprecationDate = xAPIDeprecationDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeletePlaybookActionResponse that = (DeletePlaybookActionResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.message, that.message)
            && Objects.equals(this.xRequestId, that.xRequestId)
            && Objects.equals(this.xAPIDeprecationInfo, that.xAPIDeprecationInfo)
            && Objects.equals(this.xAPIDeprecationDate, that.xAPIDeprecationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, xRequestId, xAPIDeprecationInfo, xAPIDeprecationDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePlaybookActionResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    xAPIDeprecationInfo: ").append(toIndentedString(xAPIDeprecationInfo)).append("\n");
        sb.append("    xAPIDeprecationDate: ").append(toIndentedString(xAPIDeprecationDate)).append("\n");
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
