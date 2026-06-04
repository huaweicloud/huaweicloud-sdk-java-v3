package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自定义错误页面。
 */
public class ErrorCodeRedirectRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private Integer errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_mode")

    private String executionMode;

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
     * **参数解释：** 重定向的错误码 **约束限制：** 不涉及 **取值范围：** - 4xx: 400, 403, 404, 405, 414, 416, 451 - 5xx: 500, 501, 502, 503, 504  **默认取值：** 不涉及
     * @return errorCode
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorCodeRedirectRules withExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }

    /**
     * **参数解释：** 执行规则 **约束限制：** 不涉及 **取值范围：** - break：如果错误码匹配了当前配置，请求将被重定向到目标Path。执行完当前规则后，当存在其他配置规则时，将不再匹配剩余规则。 - redirect：如果错误码匹配了当前配置，请求将被重定向到目标Path。执行完当前规则后，当存在其他配置规则时，将继续匹配剩余规则。  **默认取值：** 不涉及
     * @return executionMode
     */
    public String getExecutionMode() {
        return executionMode;
    }

    public void setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
    }

    public ErrorCodeRedirectRules withTargetCode(Integer targetCode) {
        this.targetCode = targetCode;
        return this;
    }

    /**
     * **参数解释：** 重定向状态码 **约束限制：** 当执行规则选择redirect时，需要配置该参数 **取值范围：** - 301 - 302  **默认取值：** 不涉及
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
     * **参数解释：** 重定向的目标链接 **约束限制：** “执行规则”选择“Break”时：全路径匹配，支持输入一个目标地址，以“/”作为首字符，字符长度不超过512，如：/errorcode.html。 “执行规则”选择“Redirect”时：输入的URL须以http://或https:// 开头 ，字符长度不超过512，包含完整的域名和路径信息，如：http://example.com/errorcode.html。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return targetLink
     */
    public String getTargetLink() {
        return targetLink;
    }

    public void setTargetLink(String targetLink) {
        this.targetLink = targetLink;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ErrorCodeRedirectRules that = (ErrorCodeRedirectRules) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.executionMode, that.executionMode)
            && Objects.equals(this.targetCode, that.targetCode) && Objects.equals(this.targetLink, that.targetLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, executionMode, targetCode, targetLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorCodeRedirectRules {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
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
