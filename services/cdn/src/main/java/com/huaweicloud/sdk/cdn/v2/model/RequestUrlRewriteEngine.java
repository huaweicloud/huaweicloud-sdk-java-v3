package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 访问URL重写，当用户请求URL与CDN节点缓存资源的URL不一致时，可以通过访问URL重写功能重定向到目标URL **约束限制：** 不涉及
 */
public class RequestUrlRewriteEngine {

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

    public RequestUrlRewriteEngine withRedirectStatusCode(Integer redirectStatusCode) {
        this.redirectStatusCode = redirectStatusCode;
        return this;
    }

    /**
     * **参数解释：** 重定向状态码 **约束限制：** 不涉及 **取值范围：** - 301 - 302 - 303 - 307 **默认取值：** 不涉及
     * @return redirectStatusCode
     */
    public Integer getRedirectStatusCode() {
        return redirectStatusCode;
    }

    public void setRedirectStatusCode(Integer redirectStatusCode) {
        this.redirectStatusCode = redirectStatusCode;
    }

    public RequestUrlRewriteEngine withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * **参数解释：** 重定向URL **约束限制：** - 重定向后的URL，以正斜线（/）开头，不含http://头及域名，如：/test/index.html - 当匹配类型为全路径时，\"\\*\"可以用“$1”捕获，例如：匹配内容为/test/\\*.jpg，重定向URL配置为/newtest/$1.jpg，则用户请求/test/11.jpg时，$1捕获11，重定向后请求的URL为/newtest/11.jpg **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public RequestUrlRewriteEngine withRedirectHost(String redirectHost) {
        this.redirectHost = redirectHost;
        return this;
    }

    /**
     * **参数解释：** 支持将客户端请求重定向到其他域名 **约束限制：** 不涉及 **取值范围：** - 1-255个字符 - 必须以http://或https://开头 **默认取值：** 不填时默认为当前域名
     * @return redirectHost
     */
    public String getRedirectHost() {
        return redirectHost;
    }

    public void setRedirectHost(String redirectHost) {
        this.redirectHost = redirectHost;
    }

    public RequestUrlRewriteEngine withExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }

    /**
     * **参数解释：** 执行规则 **约束限制：** 不涉及 **取值范围：** - redirect: 如果请求的URL匹配了当前规则，该请求将被重定向到目标Path。执行完当前规则后，当存在其他配置规则时，会继续匹配剩余规则 - break: 如果请求的URL匹配了当前规则，请求将被改写为目标Path。执行完当前规则后，当存在其他配置规则时，将不再匹配剩余规则，此时不支持配置重定向Host和重定向状态码，返回状态码200 **默认取值：** 不涉及
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
        RequestUrlRewriteEngine that = (RequestUrlRewriteEngine) obj;
        return Objects.equals(this.redirectStatusCode, that.redirectStatusCode)
            && Objects.equals(this.redirectUrl, that.redirectUrl)
            && Objects.equals(this.redirectHost, that.redirectHost)
            && Objects.equals(this.executionMode, that.executionMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redirectStatusCode, redirectUrl, redirectHost, executionMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestUrlRewriteEngine {\n");
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
