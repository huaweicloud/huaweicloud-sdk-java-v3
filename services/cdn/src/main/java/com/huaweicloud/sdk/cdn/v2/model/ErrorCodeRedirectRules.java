package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自定义错误页面
 */
public class ErrorCodeRedirectRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private Integer errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_code")

    private Integer targetCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_link")

    private String targetLink;

    public ErrorCodeRedirectRules withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 重定向的错误码，当前支持以下状态码 4xx:400, 403, 404, 405, 414, 416, 451 5xx:500, 501, 502, 503, 504
     * @return errorCode
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorCodeRedirectRules withTargetCode(Integer targetCode) {
        this.targetCode = targetCode;
        return this;
    }

    /**
     * 重定向状态码，取值为301或302
     * @return targetCode
     */
    public Integer getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(Integer targetCode) {
        this.targetCode = targetCode;
    }

    public ErrorCodeRedirectRules withTargetLink(String targetLink) {
        this.targetLink = targetLink;
        return this;
    }

    /**
     * 重定向的目标链接
     * @return targetLink
     */
    public String getTargetLink() {
        return targetLink;
    }

    public void setTargetLink(String targetLink) {
        this.targetLink = targetLink;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorCodeRedirectRules errorCodeRedirectRules = (ErrorCodeRedirectRules) o;
        return Objects.equals(this.errorCode, errorCodeRedirectRules.errorCode)
            && Objects.equals(this.targetCode, errorCodeRedirectRules.targetCode)
            && Objects.equals(this.targetLink, errorCodeRedirectRules.targetLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, targetCode, targetLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorCodeRedirectRules {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    targetCode: ").append(toIndentedString(targetCode)).append("\n");
        sb.append("    targetLink: ").append(toIndentedString(targetLink)).append("\n");
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
