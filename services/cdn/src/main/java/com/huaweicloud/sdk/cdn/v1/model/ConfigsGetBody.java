package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置项。
 */
public class ConfigsGetBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_request_header")

    private List<OriginRequestHeader> originRequestHeader = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_response_header")

    private List<HttpResponseHeader> httpResponseHeader = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_auth")

    private UrlAuthGetBody urlAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https")

    private HttpGetBody https;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<SourcesConfig> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_protocol")

    private String originProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_redirect")

    private ForceRedirectConfig forceRedirect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress")

    private Compress compress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_url_parameter_filter")

    private CacheUrlParameterFilter cacheUrlParameterFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_accelerate")

    private Integer ipv6Accelerate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code_cache")

    private List<ErrorCodeCache> errorCodeCache = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_range_status")

    private String originRangeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_agent_filter")

    private UserAgentFilter userAgentFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_request_url_rewrite")

    private List<OriginRequestUrlRewrite> originRequestUrlRewrite = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code_redirect_rules")

    private List<ErrorCodeRedirectRules> errorCodeRedirectRules = null;

    public ConfigsGetBody withOriginRequestHeader(List<OriginRequestHeader> originRequestHeader) {
        this.originRequestHeader = originRequestHeader;
        return this;
    }

    public ConfigsGetBody addOriginRequestHeaderItem(OriginRequestHeader originRequestHeaderItem) {
        if (this.originRequestHeader == null) {
            this.originRequestHeader = new ArrayList<>();
        }
        this.originRequestHeader.add(originRequestHeaderItem);
        return this;
    }

    public ConfigsGetBody withOriginRequestHeader(Consumer<List<OriginRequestHeader>> originRequestHeaderSetter) {
        if (this.originRequestHeader == null) {
            this.originRequestHeader = new ArrayList<>();
        }
        originRequestHeaderSetter.accept(this.originRequestHeader);
        return this;
    }

    /**
     * 回源请求头配置
     * @return originRequestHeader
     */
    public List<OriginRequestHeader> getOriginRequestHeader() {
        return originRequestHeader;
    }

    public void setOriginRequestHeader(List<OriginRequestHeader> originRequestHeader) {
        this.originRequestHeader = originRequestHeader;
    }

    public ConfigsGetBody withHttpResponseHeader(List<HttpResponseHeader> httpResponseHeader) {
        this.httpResponseHeader = httpResponseHeader;
        return this;
    }

    public ConfigsGetBody addHttpResponseHeaderItem(HttpResponseHeader httpResponseHeaderItem) {
        if (this.httpResponseHeader == null) {
            this.httpResponseHeader = new ArrayList<>();
        }
        this.httpResponseHeader.add(httpResponseHeaderItem);
        return this;
    }

    public ConfigsGetBody withHttpResponseHeader(Consumer<List<HttpResponseHeader>> httpResponseHeaderSetter) {
        if (this.httpResponseHeader == null) {
            this.httpResponseHeader = new ArrayList<>();
        }
        httpResponseHeaderSetter.accept(this.httpResponseHeader);
        return this;
    }

    /**
     * http header配置
     * @return httpResponseHeader
     */
    public List<HttpResponseHeader> getHttpResponseHeader() {
        return httpResponseHeader;
    }

    public void setHttpResponseHeader(List<HttpResponseHeader> httpResponseHeader) {
        this.httpResponseHeader = httpResponseHeader;
    }

    public ConfigsGetBody withUrlAuth(UrlAuthGetBody urlAuth) {
        this.urlAuth = urlAuth;
        return this;
    }

    public ConfigsGetBody withUrlAuth(Consumer<UrlAuthGetBody> urlAuthSetter) {
        if (this.urlAuth == null) {
            this.urlAuth = new UrlAuthGetBody();
            urlAuthSetter.accept(this.urlAuth);
        }

        return this;
    }

    /**
     * Get urlAuth
     * @return urlAuth
     */
    public UrlAuthGetBody getUrlAuth() {
        return urlAuth;
    }

    public void setUrlAuth(UrlAuthGetBody urlAuth) {
        this.urlAuth = urlAuth;
    }

    public ConfigsGetBody withHttps(HttpGetBody https) {
        this.https = https;
        return this;
    }

    public ConfigsGetBody withHttps(Consumer<HttpGetBody> httpsSetter) {
        if (this.https == null) {
            this.https = new HttpGetBody();
            httpsSetter.accept(this.https);
        }

        return this;
    }

    /**
     * Get https
     * @return https
     */
    public HttpGetBody getHttps() {
        return https;
    }

    public void setHttps(HttpGetBody https) {
        this.https = https;
    }

    public ConfigsGetBody withSources(List<SourcesConfig> sources) {
        this.sources = sources;
        return this;
    }

    public ConfigsGetBody addSourcesItem(SourcesConfig sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public ConfigsGetBody withSources(Consumer<List<SourcesConfig>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 源站配置。
     * @return sources
     */
    public List<SourcesConfig> getSources() {
        return sources;
    }

    public void setSources(List<SourcesConfig> sources) {
        this.sources = sources;
    }

    public ConfigsGetBody withOriginProtocol(String originProtocol) {
        this.originProtocol = originProtocol;
        return this;
    }

    /**
     * 回源协议（follow：协议跟随回源，http：HTTP回源(默认)，https：https回源）。
     * @return originProtocol
     */
    public String getOriginProtocol() {
        return originProtocol;
    }

    public void setOriginProtocol(String originProtocol) {
        this.originProtocol = originProtocol;
    }

    public ConfigsGetBody withForceRedirect(ForceRedirectConfig forceRedirect) {
        this.forceRedirect = forceRedirect;
        return this;
    }

    public ConfigsGetBody withForceRedirect(Consumer<ForceRedirectConfig> forceRedirectSetter) {
        if (this.forceRedirect == null) {
            this.forceRedirect = new ForceRedirectConfig();
            forceRedirectSetter.accept(this.forceRedirect);
        }

        return this;
    }

    /**
     * Get forceRedirect
     * @return forceRedirect
     */
    public ForceRedirectConfig getForceRedirect() {
        return forceRedirect;
    }

    public void setForceRedirect(ForceRedirectConfig forceRedirect) {
        this.forceRedirect = forceRedirect;
    }

    public ConfigsGetBody withCompress(Compress compress) {
        this.compress = compress;
        return this;
    }

    public ConfigsGetBody withCompress(Consumer<Compress> compressSetter) {
        if (this.compress == null) {
            this.compress = new Compress();
            compressSetter.accept(this.compress);
        }

        return this;
    }

    /**
     * Get compress
     * @return compress
     */
    public Compress getCompress() {
        return compress;
    }

    public void setCompress(Compress compress) {
        this.compress = compress;
    }

    public ConfigsGetBody withCacheUrlParameterFilter(CacheUrlParameterFilter cacheUrlParameterFilter) {
        this.cacheUrlParameterFilter = cacheUrlParameterFilter;
        return this;
    }

    public ConfigsGetBody withCacheUrlParameterFilter(Consumer<CacheUrlParameterFilter> cacheUrlParameterFilterSetter) {
        if (this.cacheUrlParameterFilter == null) {
            this.cacheUrlParameterFilter = new CacheUrlParameterFilter();
            cacheUrlParameterFilterSetter.accept(this.cacheUrlParameterFilter);
        }

        return this;
    }

    /**
     * Get cacheUrlParameterFilter
     * @return cacheUrlParameterFilter
     */
    public CacheUrlParameterFilter getCacheUrlParameterFilter() {
        return cacheUrlParameterFilter;
    }

    public void setCacheUrlParameterFilter(CacheUrlParameterFilter cacheUrlParameterFilter) {
        this.cacheUrlParameterFilter = cacheUrlParameterFilter;
    }

    public ConfigsGetBody withIpv6Accelerate(Integer ipv6Accelerate) {
        this.ipv6Accelerate = ipv6Accelerate;
        return this;
    }

    /**
     * ipv6设置（1：打开；0：关闭）
     * @return ipv6Accelerate
     */
    public Integer getIpv6Accelerate() {
        return ipv6Accelerate;
    }

    public void setIpv6Accelerate(Integer ipv6Accelerate) {
        this.ipv6Accelerate = ipv6Accelerate;
    }

    public ConfigsGetBody withErrorCodeCache(List<ErrorCodeCache> errorCodeCache) {
        this.errorCodeCache = errorCodeCache;
        return this;
    }

    public ConfigsGetBody addErrorCodeCacheItem(ErrorCodeCache errorCodeCacheItem) {
        if (this.errorCodeCache == null) {
            this.errorCodeCache = new ArrayList<>();
        }
        this.errorCodeCache.add(errorCodeCacheItem);
        return this;
    }

    public ConfigsGetBody withErrorCodeCache(Consumer<List<ErrorCodeCache>> errorCodeCacheSetter) {
        if (this.errorCodeCache == null) {
            this.errorCodeCache = new ArrayList<>();
        }
        errorCodeCacheSetter.accept(this.errorCodeCache);
        return this;
    }

    /**
     * 状态码缓存时间
     * @return errorCodeCache
     */
    public List<ErrorCodeCache> getErrorCodeCache() {
        return errorCodeCache;
    }

    public void setErrorCodeCache(List<ErrorCodeCache> errorCodeCache) {
        this.errorCodeCache = errorCodeCache;
    }

    public ConfigsGetBody withOriginRangeStatus(String originRangeStatus) {
        this.originRangeStatus = originRangeStatus;
        return this;
    }

    /**
     * Range回源，即分片回源 开启Range回源的前提是您的源站支持Range请求，即HTTP请求头中包含Range字段，否则可能导致回源失败。 开启: on 关闭: off
     * @return originRangeStatus
     */
    public String getOriginRangeStatus() {
        return originRangeStatus;
    }

    public void setOriginRangeStatus(String originRangeStatus) {
        this.originRangeStatus = originRangeStatus;
    }

    public ConfigsGetBody withUserAgentFilter(UserAgentFilter userAgentFilter) {
        this.userAgentFilter = userAgentFilter;
        return this;
    }

    public ConfigsGetBody withUserAgentFilter(Consumer<UserAgentFilter> userAgentFilterSetter) {
        if (this.userAgentFilter == null) {
            this.userAgentFilter = new UserAgentFilter();
            userAgentFilterSetter.accept(this.userAgentFilter);
        }

        return this;
    }

    /**
     * Get userAgentFilter
     * @return userAgentFilter
     */
    public UserAgentFilter getUserAgentFilter() {
        return userAgentFilter;
    }

    public void setUserAgentFilter(UserAgentFilter userAgentFilter) {
        this.userAgentFilter = userAgentFilter;
    }

    public ConfigsGetBody withOriginRequestUrlRewrite(List<OriginRequestUrlRewrite> originRequestUrlRewrite) {
        this.originRequestUrlRewrite = originRequestUrlRewrite;
        return this;
    }

    public ConfigsGetBody addOriginRequestUrlRewriteItem(OriginRequestUrlRewrite originRequestUrlRewriteItem) {
        if (this.originRequestUrlRewrite == null) {
            this.originRequestUrlRewrite = new ArrayList<>();
        }
        this.originRequestUrlRewrite.add(originRequestUrlRewriteItem);
        return this;
    }

    public ConfigsGetBody withOriginRequestUrlRewrite(
        Consumer<List<OriginRequestUrlRewrite>> originRequestUrlRewriteSetter) {
        if (this.originRequestUrlRewrite == null) {
            this.originRequestUrlRewrite = new ArrayList<>();
        }
        originRequestUrlRewriteSetter.accept(this.originRequestUrlRewrite);
        return this;
    }

    /**
     * 改写回源URL，最多配置20条。
     * @return originRequestUrlRewrite
     */
    public List<OriginRequestUrlRewrite> getOriginRequestUrlRewrite() {
        return originRequestUrlRewrite;
    }

    public void setOriginRequestUrlRewrite(List<OriginRequestUrlRewrite> originRequestUrlRewrite) {
        this.originRequestUrlRewrite = originRequestUrlRewrite;
    }

    public ConfigsGetBody withErrorCodeRedirectRules(List<ErrorCodeRedirectRules> errorCodeRedirectRules) {
        this.errorCodeRedirectRules = errorCodeRedirectRules;
        return this;
    }

    public ConfigsGetBody addErrorCodeRedirectRulesItem(ErrorCodeRedirectRules errorCodeRedirectRulesItem) {
        if (this.errorCodeRedirectRules == null) {
            this.errorCodeRedirectRules = new ArrayList<>();
        }
        this.errorCodeRedirectRules.add(errorCodeRedirectRulesItem);
        return this;
    }

    public ConfigsGetBody withErrorCodeRedirectRules(
        Consumer<List<ErrorCodeRedirectRules>> errorCodeRedirectRulesSetter) {
        if (this.errorCodeRedirectRules == null) {
            this.errorCodeRedirectRules = new ArrayList<>();
        }
        errorCodeRedirectRulesSetter.accept(this.errorCodeRedirectRules);
        return this;
    }

    /**
     * 自定义错误页面
     * @return errorCodeRedirectRules
     */
    public List<ErrorCodeRedirectRules> getErrorCodeRedirectRules() {
        return errorCodeRedirectRules;
    }

    public void setErrorCodeRedirectRules(List<ErrorCodeRedirectRules> errorCodeRedirectRules) {
        this.errorCodeRedirectRules = errorCodeRedirectRules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigsGetBody configsGetBody = (ConfigsGetBody) o;
        return Objects.equals(this.originRequestHeader, configsGetBody.originRequestHeader)
            && Objects.equals(this.httpResponseHeader, configsGetBody.httpResponseHeader)
            && Objects.equals(this.urlAuth, configsGetBody.urlAuth) && Objects.equals(this.https, configsGetBody.https)
            && Objects.equals(this.sources, configsGetBody.sources)
            && Objects.equals(this.originProtocol, configsGetBody.originProtocol)
            && Objects.equals(this.forceRedirect, configsGetBody.forceRedirect)
            && Objects.equals(this.compress, configsGetBody.compress)
            && Objects.equals(this.cacheUrlParameterFilter, configsGetBody.cacheUrlParameterFilter)
            && Objects.equals(this.ipv6Accelerate, configsGetBody.ipv6Accelerate)
            && Objects.equals(this.errorCodeCache, configsGetBody.errorCodeCache)
            && Objects.equals(this.originRangeStatus, configsGetBody.originRangeStatus)
            && Objects.equals(this.userAgentFilter, configsGetBody.userAgentFilter)
            && Objects.equals(this.originRequestUrlRewrite, configsGetBody.originRequestUrlRewrite)
            && Objects.equals(this.errorCodeRedirectRules, configsGetBody.errorCodeRedirectRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originRequestHeader,
            httpResponseHeader,
            urlAuth,
            https,
            sources,
            originProtocol,
            forceRedirect,
            compress,
            cacheUrlParameterFilter,
            ipv6Accelerate,
            errorCodeCache,
            originRangeStatus,
            userAgentFilter,
            originRequestUrlRewrite,
            errorCodeRedirectRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigsGetBody {\n");
        sb.append("    originRequestHeader: ").append(toIndentedString(originRequestHeader)).append("\n");
        sb.append("    httpResponseHeader: ").append(toIndentedString(httpResponseHeader)).append("\n");
        sb.append("    urlAuth: ").append(toIndentedString(urlAuth)).append("\n");
        sb.append("    https: ").append(toIndentedString(https)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    originProtocol: ").append(toIndentedString(originProtocol)).append("\n");
        sb.append("    forceRedirect: ").append(toIndentedString(forceRedirect)).append("\n");
        sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
        sb.append("    cacheUrlParameterFilter: ").append(toIndentedString(cacheUrlParameterFilter)).append("\n");
        sb.append("    ipv6Accelerate: ").append(toIndentedString(ipv6Accelerate)).append("\n");
        sb.append("    errorCodeCache: ").append(toIndentedString(errorCodeCache)).append("\n");
        sb.append("    originRangeStatus: ").append(toIndentedString(originRangeStatus)).append("\n");
        sb.append("    userAgentFilter: ").append(toIndentedString(userAgentFilter)).append("\n");
        sb.append("    originRequestUrlRewrite: ").append(toIndentedString(originRequestUrlRewrite)).append("\n");
        sb.append("    errorCodeRedirectRules: ").append(toIndentedString(errorCodeRedirectRules)).append("\n");
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
