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
            && Objects.equals(this.cacheUrlParameterFilter, configsGetBody.cacheUrlParameterFilter);
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
            cacheUrlParameterFilter);
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
