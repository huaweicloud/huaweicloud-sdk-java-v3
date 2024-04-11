package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 访问URL重写。
 */
public class RequestUrlRewrite {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private UrlRewriteCondition condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_status_code")

    private Integer redirectStatusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url")

    private String redirectUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_host")

    private String redirectHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_mode")

    private String executionMode;

    public RequestUrlRewrite withCondition(UrlRewriteCondition condition) {
        this.condition = condition;
        return this;
    }

    public RequestUrlRewrite withCondition(Consumer<UrlRewriteCondition> conditionSetter) {
        if (this.condition == null) {
            this.condition = new UrlRewriteCondition();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public UrlRewriteCondition getCondition() {
        return condition;
    }

    public void setCondition(UrlRewriteCondition condition) {
        this.condition = condition;
    }

    public RequestUrlRewrite withRedirectStatusCode(Integer redirectStatusCode) {
        this.redirectStatusCode = redirectStatusCode;
        return this;
    }

    /**
     * 重定向状态码。支持301、302、303、307。
     * @return redirectStatusCode
     */
    public Integer getRedirectStatusCode() {
        return redirectStatusCode;
    }

    public void setRedirectStatusCode(Integer redirectStatusCode) {
        this.redirectStatusCode = redirectStatusCode;
    }

    public RequestUrlRewrite withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * 重定向URL。重定向后的URL，以正斜线（/）开头，不含http://头及域名，如：/test/index.html。   - 当匹配类型为全路径时，\"\\*\"可以用“$1”捕获，例如：匹配内容为/test/\\*.jpg，重定向URL配置为/newtest/$1.jpg，则用户请求/test/11.jpg时，$1捕获11，重定向后请求的URL为/newtest/11.jpg。
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public RequestUrlRewrite withRedirectHost(String redirectHost) {
        this.redirectHost = redirectHost;
        return this;
    }

    /**
     * 支持将客户端请求重定向到其他域名。   > 不填时默认为当前域名。   > 支持字符长度为1-255，必须以http://或https://开头，例如http://www.example.com。
     * @return redirectHost
     */
    public String getRedirectHost() {
        return redirectHost;
    }

    public void setRedirectHost(String redirectHost) {
        this.redirectHost = redirectHost;
    }

    public RequestUrlRewrite withExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }

    /**
     * 执行规则：   - redirect：如果请求的URL匹配了当前规则，该请求将被重定向到目标Path。执行完当前规则后，当存在其他配置规则时，会继续匹配剩余规则。   - break：如果请求的URL匹配了当前规则，请求将被改写为目标Path。执行完当前规则后，当存在其他配置规则时，将不再匹配剩余规则，此时不支持配置重定向Host和重定向状态码，返回状态码200。
     * @return executionMode
     */
    public String getExecutionMode() {
        return executionMode;
    }

    public void setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RequestUrlRewrite that = (RequestUrlRewrite) obj;
        return Objects.equals(this.condition, that.condition)
            && Objects.equals(this.redirectStatusCode, that.redirectStatusCode)
            && Objects.equals(this.redirectUrl, that.redirectUrl)
            && Objects.equals(this.redirectHost, that.redirectHost)
            && Objects.equals(this.executionMode, that.executionMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, redirectStatusCode, redirectUrl, redirectHost, executionMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestUrlRewrite {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    redirectStatusCode: ").append(toIndentedString(redirectStatusCode)).append("\n");
        sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
        sb.append("    redirectHost: ").append(toIndentedString(redirectHost)).append("\n");
        sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
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
