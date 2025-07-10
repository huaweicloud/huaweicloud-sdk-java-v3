package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 规则行为 **约束限制：** 不涉及
 */
public class Actions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flexible_origin")

    private List<FlexibleOriginsEngine> flexibleOrigin = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_request_header")

    private List<OriginRequestHeader> originRequestHeader = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_response_header")

    private List<HttpResponseHeader> httpResponseHeader = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_control")

    private AccessControl accessControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_limit_rules")

    private RequestLimitRulesEngine requestLimitRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_request_url_rewrite")

    private OriginRequestUrlRewriteEngine originRequestUrlRewrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_rule")

    private CacheRulesEngine cacheRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_url_rewrite")

    private RequestUrlRewriteEngine requestUrlRewrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "browser_cache_rule")

    private BrowserCacheRulesEngine browserCacheRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code_cache")

    private ErrorCodeCacheEngine errorCodeCache;

    public Actions withFlexibleOrigin(List<FlexibleOriginsEngine> flexibleOrigin) {
        this.flexibleOrigin = flexibleOrigin;
        return this;
    }

    public Actions addFlexibleOriginItem(FlexibleOriginsEngine flexibleOriginItem) {
        if (this.flexibleOrigin == null) {
            this.flexibleOrigin = new ArrayList<>();
        }
        this.flexibleOrigin.add(flexibleOriginItem);
        return this;
    }

    public Actions withFlexibleOrigin(Consumer<List<FlexibleOriginsEngine>> flexibleOriginSetter) {
        if (this.flexibleOrigin == null) {
            this.flexibleOrigin = new ArrayList<>();
        }
        flexibleOriginSetter.accept(this.flexibleOrigin);
        return this;
    }

    /**
     * **参数解释：** 高级回源，实现根据不同的资源类型或路径回源到不同源站 **约束限制：** 最多配置20条
     * @return flexibleOrigin
     */
    public List<FlexibleOriginsEngine> getFlexibleOrigin() {
        return flexibleOrigin;
    }

    public void setFlexibleOrigin(List<FlexibleOriginsEngine> flexibleOrigin) {
        this.flexibleOrigin = flexibleOrigin;
    }

    public Actions withOriginRequestHeader(List<OriginRequestHeader> originRequestHeader) {
        this.originRequestHeader = originRequestHeader;
        return this;
    }

    public Actions addOriginRequestHeaderItem(OriginRequestHeader originRequestHeaderItem) {
        if (this.originRequestHeader == null) {
            this.originRequestHeader = new ArrayList<>();
        }
        this.originRequestHeader.add(originRequestHeaderItem);
        return this;
    }

    public Actions withOriginRequestHeader(Consumer<List<OriginRequestHeader>> originRequestHeaderSetter) {
        if (this.originRequestHeader == null) {
            this.originRequestHeader = new ArrayList<>();
        }
        originRequestHeaderSetter.accept(this.originRequestHeader);
        return this;
    }

    /**
     * **参数解释：** CDN节点回源时，改写用户回源请求URL的HTTP头部信息 **约束限制：** - 该功能将覆盖原有配置（清空之前的配置），在使用此接口时，请上传全量头部信息 - 如果域名在后台配置了特殊请求头，需要将对应的请求头一并传入
     * @return originRequestHeader
     */
    public List<OriginRequestHeader> getOriginRequestHeader() {
        return originRequestHeader;
    }

    public void setOriginRequestHeader(List<OriginRequestHeader> originRequestHeader) {
        this.originRequestHeader = originRequestHeader;
    }

    public Actions withHttpResponseHeader(List<HttpResponseHeader> httpResponseHeader) {
        this.httpResponseHeader = httpResponseHeader;
        return this;
    }

    public Actions addHttpResponseHeaderItem(HttpResponseHeader httpResponseHeaderItem) {
        if (this.httpResponseHeader == null) {
            this.httpResponseHeader = new ArrayList<>();
        }
        this.httpResponseHeader.add(httpResponseHeaderItem);
        return this;
    }

    public Actions withHttpResponseHeader(Consumer<List<HttpResponseHeader>> httpResponseHeaderSetter) {
        if (this.httpResponseHeader == null) {
            this.httpResponseHeader = new ArrayList<>();
        }
        httpResponseHeaderSetter.accept(this.httpResponseHeader);
        return this;
    }

    /**
     * **参数解释：** 配置节点响应给客户端的头部信息，配置响应消息后，用户请求加速域名下的资源时，CDN返回给用户的消息中将包含该域名配置的响应头信息 **约束限制：** - 该功能将覆盖原有配置（清空之前的配置），在使用此接口时，请上传全量头部信息 - 如果域名在后台配置了特殊请求头，需要将对应的请求头一并传入
     * @return httpResponseHeader
     */
    public List<HttpResponseHeader> getHttpResponseHeader() {
        return httpResponseHeader;
    }

    public void setHttpResponseHeader(List<HttpResponseHeader> httpResponseHeader) {
        this.httpResponseHeader = httpResponseHeader;
    }

    public Actions withAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
        return this;
    }

    public Actions withAccessControl(Consumer<AccessControl> accessControlSetter) {
        if (this.accessControl == null) {
            this.accessControl = new AccessControl();
            accessControlSetter.accept(this.accessControl);
        }

        return this;
    }

    /**
     * Get accessControl
     * @return accessControl
     */
    public AccessControl getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
    }

    public Actions withRequestLimitRules(RequestLimitRulesEngine requestLimitRules) {
        this.requestLimitRules = requestLimitRules;
        return this;
    }

    public Actions withRequestLimitRules(Consumer<RequestLimitRulesEngine> requestLimitRulesSetter) {
        if (this.requestLimitRules == null) {
            this.requestLimitRules = new RequestLimitRulesEngine();
            requestLimitRulesSetter.accept(this.requestLimitRules);
        }

        return this;
    }

    /**
     * Get requestLimitRules
     * @return requestLimitRules
     */
    public RequestLimitRulesEngine getRequestLimitRules() {
        return requestLimitRules;
    }

    public void setRequestLimitRules(RequestLimitRulesEngine requestLimitRules) {
        this.requestLimitRules = requestLimitRules;
    }

    public Actions withOriginRequestUrlRewrite(OriginRequestUrlRewriteEngine originRequestUrlRewrite) {
        this.originRequestUrlRewrite = originRequestUrlRewrite;
        return this;
    }

    public Actions withOriginRequestUrlRewrite(Consumer<OriginRequestUrlRewriteEngine> originRequestUrlRewriteSetter) {
        if (this.originRequestUrlRewrite == null) {
            this.originRequestUrlRewrite = new OriginRequestUrlRewriteEngine();
            originRequestUrlRewriteSetter.accept(this.originRequestUrlRewrite);
        }

        return this;
    }

    /**
     * Get originRequestUrlRewrite
     * @return originRequestUrlRewrite
     */
    public OriginRequestUrlRewriteEngine getOriginRequestUrlRewrite() {
        return originRequestUrlRewrite;
    }

    public void setOriginRequestUrlRewrite(OriginRequestUrlRewriteEngine originRequestUrlRewrite) {
        this.originRequestUrlRewrite = originRequestUrlRewrite;
    }

    public Actions withCacheRule(CacheRulesEngine cacheRule) {
        this.cacheRule = cacheRule;
        return this;
    }

    public Actions withCacheRule(Consumer<CacheRulesEngine> cacheRuleSetter) {
        if (this.cacheRule == null) {
            this.cacheRule = new CacheRulesEngine();
            cacheRuleSetter.accept(this.cacheRule);
        }

        return this;
    }

    /**
     * Get cacheRule
     * @return cacheRule
     */
    public CacheRulesEngine getCacheRule() {
        return cacheRule;
    }

    public void setCacheRule(CacheRulesEngine cacheRule) {
        this.cacheRule = cacheRule;
    }

    public Actions withRequestUrlRewrite(RequestUrlRewriteEngine requestUrlRewrite) {
        this.requestUrlRewrite = requestUrlRewrite;
        return this;
    }

    public Actions withRequestUrlRewrite(Consumer<RequestUrlRewriteEngine> requestUrlRewriteSetter) {
        if (this.requestUrlRewrite == null) {
            this.requestUrlRewrite = new RequestUrlRewriteEngine();
            requestUrlRewriteSetter.accept(this.requestUrlRewrite);
        }

        return this;
    }

    /**
     * Get requestUrlRewrite
     * @return requestUrlRewrite
     */
    public RequestUrlRewriteEngine getRequestUrlRewrite() {
        return requestUrlRewrite;
    }

    public void setRequestUrlRewrite(RequestUrlRewriteEngine requestUrlRewrite) {
        this.requestUrlRewrite = requestUrlRewrite;
    }

    public Actions withBrowserCacheRule(BrowserCacheRulesEngine browserCacheRule) {
        this.browserCacheRule = browserCacheRule;
        return this;
    }

    public Actions withBrowserCacheRule(Consumer<BrowserCacheRulesEngine> browserCacheRuleSetter) {
        if (this.browserCacheRule == null) {
            this.browserCacheRule = new BrowserCacheRulesEngine();
            browserCacheRuleSetter.accept(this.browserCacheRule);
        }

        return this;
    }

    /**
     * Get browserCacheRule
     * @return browserCacheRule
     */
    public BrowserCacheRulesEngine getBrowserCacheRule() {
        return browserCacheRule;
    }

    public void setBrowserCacheRule(BrowserCacheRulesEngine browserCacheRule) {
        this.browserCacheRule = browserCacheRule;
    }

    public Actions withErrorCodeCache(ErrorCodeCacheEngine errorCodeCache) {
        this.errorCodeCache = errorCodeCache;
        return this;
    }

    public Actions withErrorCodeCache(Consumer<ErrorCodeCacheEngine> errorCodeCacheSetter) {
        if (this.errorCodeCache == null) {
            this.errorCodeCache = new ErrorCodeCacheEngine();
            errorCodeCacheSetter.accept(this.errorCodeCache);
        }

        return this;
    }

    /**
     * Get errorCodeCache
     * @return errorCodeCache
     */
    public ErrorCodeCacheEngine getErrorCodeCache() {
        return errorCodeCache;
    }

    public void setErrorCodeCache(ErrorCodeCacheEngine errorCodeCache) {
        this.errorCodeCache = errorCodeCache;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Actions that = (Actions) obj;
        return Objects.equals(this.flexibleOrigin, that.flexibleOrigin)
            && Objects.equals(this.originRequestHeader, that.originRequestHeader)
            && Objects.equals(this.httpResponseHeader, that.httpResponseHeader)
            && Objects.equals(this.accessControl, that.accessControl)
            && Objects.equals(this.requestLimitRules, that.requestLimitRules)
            && Objects.equals(this.originRequestUrlRewrite, that.originRequestUrlRewrite)
            && Objects.equals(this.cacheRule, that.cacheRule)
            && Objects.equals(this.requestUrlRewrite, that.requestUrlRewrite)
            && Objects.equals(this.browserCacheRule, that.browserCacheRule)
            && Objects.equals(this.errorCodeCache, that.errorCodeCache);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flexibleOrigin,
            originRequestHeader,
            httpResponseHeader,
            accessControl,
            requestLimitRules,
            originRequestUrlRewrite,
            cacheRule,
            requestUrlRewrite,
            browserCacheRule,
            errorCodeCache);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Actions {\n");
        sb.append("    flexibleOrigin: ").append(toIndentedString(flexibleOrigin)).append("\n");
        sb.append("    originRequestHeader: ").append(toIndentedString(originRequestHeader)).append("\n");
        sb.append("    httpResponseHeader: ").append(toIndentedString(httpResponseHeader)).append("\n");
        sb.append("    accessControl: ").append(toIndentedString(accessControl)).append("\n");
        sb.append("    requestLimitRules: ").append(toIndentedString(requestLimitRules)).append("\n");
        sb.append("    originRequestUrlRewrite: ").append(toIndentedString(originRequestUrlRewrite)).append("\n");
        sb.append("    cacheRule: ").append(toIndentedString(cacheRule)).append("\n");
        sb.append("    requestUrlRewrite: ").append(toIndentedString(requestUrlRewrite)).append("\n");
        sb.append("    browserCacheRule: ").append(toIndentedString(browserCacheRule)).append("\n");
        sb.append("    errorCodeCache: ").append(toIndentedString(errorCodeCache)).append("\n");
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
