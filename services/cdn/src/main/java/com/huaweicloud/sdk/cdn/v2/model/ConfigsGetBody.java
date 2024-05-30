package com.huaweicloud.sdk.cdn.v2.model;

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
    @JsonProperty(value = "business_type")

    private String businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_area")

    private String serviceArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

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

    private List<SourcesConfigResponseBody> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_protocol")

    private String originProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_follow302_status")

    private String originFollow302Status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_rules")

    private List<CacheRules> cacheRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_filter")

    private IpFilter ipFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referer")

    private RefererConfig referer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_redirect")

    private ForceRedirectConfig forceRedirect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress")

    private Compress compress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_url_parameter_filter")

    private CacheUrlParameterFilterGetBody cacheUrlParameterFilter;

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
    @JsonProperty(value = "flexible_origin")

    private List<FlexibleOrigins> flexibleOrigin = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slice_etag_status")

    private String sliceEtagStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_receive_timeout")

    private Integer originReceiveTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_auth")

    private CommonRemoteAuth remoteAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "websocket")

    private WebSocketSeek websocket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_seek")

    private VideoSeek videoSeek;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_limit_rules")

    private List<RequestLimitRules> requestLimitRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_frequency_limit")

    private IpFrequencyLimitQuery ipFrequencyLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hsts")

    private HstsQuery hsts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quic")

    private Quic quic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code_redirect_rules")

    private List<ErrorCodeRedirectRules> errorCodeRedirectRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sni")

    private Sni sni;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_url_rewrite")

    private List<RequestUrlRewrite> requestUrlRewrite = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "browser_cache_rules")

    private List<BrowserCacheRules> browserCacheRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_area_filter")

    private List<AccessAreaFilter> accessAreaFilter = null;

    public ConfigsGetBody withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * 业务类型： - web：网站加速； - download：文件下载加速； - video：点播加速； - wholesite：全站加速。
     * @return businessType
     */
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public ConfigsGetBody withServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
        return this;
    }

    /**
     * 服务区域： - mainland_china：中国大陆； - global：全球； - outside_mainland_china：中国大陆境外。
     * @return serviceArea
     */
    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public ConfigsGetBody withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 域名备注。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

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

    public ConfigsGetBody withSources(List<SourcesConfigResponseBody> sources) {
        this.sources = sources;
        return this;
    }

    public ConfigsGetBody addSourcesItem(SourcesConfigResponseBody sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public ConfigsGetBody withSources(Consumer<List<SourcesConfigResponseBody>> sourcesSetter) {
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
    public List<SourcesConfigResponseBody> getSources() {
        return sources;
    }

    public void setSources(List<SourcesConfigResponseBody> sources) {
        this.sources = sources;
    }

    public ConfigsGetBody withOriginProtocol(String originProtocol) {
        this.originProtocol = originProtocol;
        return this;
    }

    /**
     * 回源协议，follow：协议跟随回源，http：HTTP回源(默认)，https：https回源。
     * @return originProtocol
     */
    public String getOriginProtocol() {
        return originProtocol;
    }

    public void setOriginProtocol(String originProtocol) {
        this.originProtocol = originProtocol;
    }

    public ConfigsGetBody withOriginFollow302Status(String originFollow302Status) {
        this.originFollow302Status = originFollow302Status;
        return this;
    }

    /**
     * 回源跟随，on：开启，off：关闭。
     * @return originFollow302Status
     */
    public String getOriginFollow302Status() {
        return originFollow302Status;
    }

    public void setOriginFollow302Status(String originFollow302Status) {
        this.originFollow302Status = originFollow302Status;
    }

    public ConfigsGetBody withCacheRules(List<CacheRules> cacheRules) {
        this.cacheRules = cacheRules;
        return this;
    }

    public ConfigsGetBody addCacheRulesItem(CacheRules cacheRulesItem) {
        if (this.cacheRules == null) {
            this.cacheRules = new ArrayList<>();
        }
        this.cacheRules.add(cacheRulesItem);
        return this;
    }

    public ConfigsGetBody withCacheRules(Consumer<List<CacheRules>> cacheRulesSetter) {
        if (this.cacheRules == null) {
            this.cacheRules = new ArrayList<>();
        }
        cacheRulesSetter.accept(this.cacheRules);
        return this;
    }

    /**
     * 缓存规则。
     * @return cacheRules
     */
    public List<CacheRules> getCacheRules() {
        return cacheRules;
    }

    public void setCacheRules(List<CacheRules> cacheRules) {
        this.cacheRules = cacheRules;
    }

    public ConfigsGetBody withIpFilter(IpFilter ipFilter) {
        this.ipFilter = ipFilter;
        return this;
    }

    public ConfigsGetBody withIpFilter(Consumer<IpFilter> ipFilterSetter) {
        if (this.ipFilter == null) {
            this.ipFilter = new IpFilter();
            ipFilterSetter.accept(this.ipFilter);
        }

        return this;
    }

    /**
     * Get ipFilter
     * @return ipFilter
     */
    public IpFilter getIpFilter() {
        return ipFilter;
    }

    public void setIpFilter(IpFilter ipFilter) {
        this.ipFilter = ipFilter;
    }

    public ConfigsGetBody withReferer(RefererConfig referer) {
        this.referer = referer;
        return this;
    }

    public ConfigsGetBody withReferer(Consumer<RefererConfig> refererSetter) {
        if (this.referer == null) {
            this.referer = new RefererConfig();
            refererSetter.accept(this.referer);
        }

        return this;
    }

    /**
     * Get referer
     * @return referer
     */
    public RefererConfig getReferer() {
        return referer;
    }

    public void setReferer(RefererConfig referer) {
        this.referer = referer;
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

    public ConfigsGetBody withCacheUrlParameterFilter(CacheUrlParameterFilterGetBody cacheUrlParameterFilter) {
        this.cacheUrlParameterFilter = cacheUrlParameterFilter;
        return this;
    }

    public ConfigsGetBody withCacheUrlParameterFilter(
        Consumer<CacheUrlParameterFilterGetBody> cacheUrlParameterFilterSetter) {
        if (this.cacheUrlParameterFilter == null) {
            this.cacheUrlParameterFilter = new CacheUrlParameterFilterGetBody();
            cacheUrlParameterFilterSetter.accept(this.cacheUrlParameterFilter);
        }

        return this;
    }

    /**
     * Get cacheUrlParameterFilter
     * @return cacheUrlParameterFilter
     */
    public CacheUrlParameterFilterGetBody getCacheUrlParameterFilter() {
        return cacheUrlParameterFilter;
    }

    public void setCacheUrlParameterFilter(CacheUrlParameterFilterGetBody cacheUrlParameterFilter) {
        this.cacheUrlParameterFilter = cacheUrlParameterFilter;
    }

    public ConfigsGetBody withIpv6Accelerate(Integer ipv6Accelerate) {
        this.ipv6Accelerate = ipv6Accelerate;
        return this;
    }

    /**
     * ipv6设置，1：打开；0：关闭。
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
     * 状态码缓存时间。
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
     * Range回源，开启: on，off:关闭。
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
     * 改写回源URL。
     * @return originRequestUrlRewrite
     */
    public List<OriginRequestUrlRewrite> getOriginRequestUrlRewrite() {
        return originRequestUrlRewrite;
    }

    public void setOriginRequestUrlRewrite(List<OriginRequestUrlRewrite> originRequestUrlRewrite) {
        this.originRequestUrlRewrite = originRequestUrlRewrite;
    }

    public ConfigsGetBody withFlexibleOrigin(List<FlexibleOrigins> flexibleOrigin) {
        this.flexibleOrigin = flexibleOrigin;
        return this;
    }

    public ConfigsGetBody addFlexibleOriginItem(FlexibleOrigins flexibleOriginItem) {
        if (this.flexibleOrigin == null) {
            this.flexibleOrigin = new ArrayList<>();
        }
        this.flexibleOrigin.add(flexibleOriginItem);
        return this;
    }

    public ConfigsGetBody withFlexibleOrigin(Consumer<List<FlexibleOrigins>> flexibleOriginSetter) {
        if (this.flexibleOrigin == null) {
            this.flexibleOrigin = new ArrayList<>();
        }
        flexibleOriginSetter.accept(this.flexibleOrigin);
        return this;
    }

    /**
     * 高级回源。
     * @return flexibleOrigin
     */
    public List<FlexibleOrigins> getFlexibleOrigin() {
        return flexibleOrigin;
    }

    public void setFlexibleOrigin(List<FlexibleOrigins> flexibleOrigin) {
        this.flexibleOrigin = flexibleOrigin;
    }

    public ConfigsGetBody withSliceEtagStatus(String sliceEtagStatus) {
        this.sliceEtagStatus = sliceEtagStatus;
        return this;
    }

    /**
     * 回源是否校验ETag，on：开启，off：关闭。
     * @return sliceEtagStatus
     */
    public String getSliceEtagStatus() {
        return sliceEtagStatus;
    }

    public void setSliceEtagStatus(String sliceEtagStatus) {
        this.sliceEtagStatus = sliceEtagStatus;
    }

    public ConfigsGetBody withOriginReceiveTimeout(Integer originReceiveTimeout) {
        this.originReceiveTimeout = originReceiveTimeout;
        return this;
    }

    /**
     * 回源超时时间，单位：秒。
     * @return originReceiveTimeout
     */
    public Integer getOriginReceiveTimeout() {
        return originReceiveTimeout;
    }

    public void setOriginReceiveTimeout(Integer originReceiveTimeout) {
        this.originReceiveTimeout = originReceiveTimeout;
    }

    public ConfigsGetBody withRemoteAuth(CommonRemoteAuth remoteAuth) {
        this.remoteAuth = remoteAuth;
        return this;
    }

    public ConfigsGetBody withRemoteAuth(Consumer<CommonRemoteAuth> remoteAuthSetter) {
        if (this.remoteAuth == null) {
            this.remoteAuth = new CommonRemoteAuth();
            remoteAuthSetter.accept(this.remoteAuth);
        }

        return this;
    }

    /**
     * Get remoteAuth
     * @return remoteAuth
     */
    public CommonRemoteAuth getRemoteAuth() {
        return remoteAuth;
    }

    public void setRemoteAuth(CommonRemoteAuth remoteAuth) {
        this.remoteAuth = remoteAuth;
    }

    public ConfigsGetBody withWebsocket(WebSocketSeek websocket) {
        this.websocket = websocket;
        return this;
    }

    public ConfigsGetBody withWebsocket(Consumer<WebSocketSeek> websocketSetter) {
        if (this.websocket == null) {
            this.websocket = new WebSocketSeek();
            websocketSetter.accept(this.websocket);
        }

        return this;
    }

    /**
     * Get websocket
     * @return websocket
     */
    public WebSocketSeek getWebsocket() {
        return websocket;
    }

    public void setWebsocket(WebSocketSeek websocket) {
        this.websocket = websocket;
    }

    public ConfigsGetBody withVideoSeek(VideoSeek videoSeek) {
        this.videoSeek = videoSeek;
        return this;
    }

    public ConfigsGetBody withVideoSeek(Consumer<VideoSeek> videoSeekSetter) {
        if (this.videoSeek == null) {
            this.videoSeek = new VideoSeek();
            videoSeekSetter.accept(this.videoSeek);
        }

        return this;
    }

    /**
     * Get videoSeek
     * @return videoSeek
     */
    public VideoSeek getVideoSeek() {
        return videoSeek;
    }

    public void setVideoSeek(VideoSeek videoSeek) {
        this.videoSeek = videoSeek;
    }

    public ConfigsGetBody withRequestLimitRules(List<RequestLimitRules> requestLimitRules) {
        this.requestLimitRules = requestLimitRules;
        return this;
    }

    public ConfigsGetBody addRequestLimitRulesItem(RequestLimitRules requestLimitRulesItem) {
        if (this.requestLimitRules == null) {
            this.requestLimitRules = new ArrayList<>();
        }
        this.requestLimitRules.add(requestLimitRulesItem);
        return this;
    }

    public ConfigsGetBody withRequestLimitRules(Consumer<List<RequestLimitRules>> requestLimitRulesSetter) {
        if (this.requestLimitRules == null) {
            this.requestLimitRules = new ArrayList<>();
        }
        requestLimitRulesSetter.accept(this.requestLimitRules);
        return this;
    }

    /**
     * 请求限速。
     * @return requestLimitRules
     */
    public List<RequestLimitRules> getRequestLimitRules() {
        return requestLimitRules;
    }

    public void setRequestLimitRules(List<RequestLimitRules> requestLimitRules) {
        this.requestLimitRules = requestLimitRules;
    }

    public ConfigsGetBody withIpFrequencyLimit(IpFrequencyLimitQuery ipFrequencyLimit) {
        this.ipFrequencyLimit = ipFrequencyLimit;
        return this;
    }

    public ConfigsGetBody withIpFrequencyLimit(Consumer<IpFrequencyLimitQuery> ipFrequencyLimitSetter) {
        if (this.ipFrequencyLimit == null) {
            this.ipFrequencyLimit = new IpFrequencyLimitQuery();
            ipFrequencyLimitSetter.accept(this.ipFrequencyLimit);
        }

        return this;
    }

    /**
     * Get ipFrequencyLimit
     * @return ipFrequencyLimit
     */
    public IpFrequencyLimitQuery getIpFrequencyLimit() {
        return ipFrequencyLimit;
    }

    public void setIpFrequencyLimit(IpFrequencyLimitQuery ipFrequencyLimit) {
        this.ipFrequencyLimit = ipFrequencyLimit;
    }

    public ConfigsGetBody withHsts(HstsQuery hsts) {
        this.hsts = hsts;
        return this;
    }

    public ConfigsGetBody withHsts(Consumer<HstsQuery> hstsSetter) {
        if (this.hsts == null) {
            this.hsts = new HstsQuery();
            hstsSetter.accept(this.hsts);
        }

        return this;
    }

    /**
     * Get hsts
     * @return hsts
     */
    public HstsQuery getHsts() {
        return hsts;
    }

    public void setHsts(HstsQuery hsts) {
        this.hsts = hsts;
    }

    public ConfigsGetBody withQuic(Quic quic) {
        this.quic = quic;
        return this;
    }

    public ConfigsGetBody withQuic(Consumer<Quic> quicSetter) {
        if (this.quic == null) {
            this.quic = new Quic();
            quicSetter.accept(this.quic);
        }

        return this;
    }

    /**
     * Get quic
     * @return quic
     */
    public Quic getQuic() {
        return quic;
    }

    public void setQuic(Quic quic) {
        this.quic = quic;
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

    public ConfigsGetBody withSni(Sni sni) {
        this.sni = sni;
        return this;
    }

    public ConfigsGetBody withSni(Consumer<Sni> sniSetter) {
        if (this.sni == null) {
            this.sni = new Sni();
            sniSetter.accept(this.sni);
        }

        return this;
    }

    /**
     * Get sni
     * @return sni
     */
    public Sni getSni() {
        return sni;
    }

    public void setSni(Sni sni) {
        this.sni = sni;
    }

    public ConfigsGetBody withRequestUrlRewrite(List<RequestUrlRewrite> requestUrlRewrite) {
        this.requestUrlRewrite = requestUrlRewrite;
        return this;
    }

    public ConfigsGetBody addRequestUrlRewriteItem(RequestUrlRewrite requestUrlRewriteItem) {
        if (this.requestUrlRewrite == null) {
            this.requestUrlRewrite = new ArrayList<>();
        }
        this.requestUrlRewrite.add(requestUrlRewriteItem);
        return this;
    }

    public ConfigsGetBody withRequestUrlRewrite(Consumer<List<RequestUrlRewrite>> requestUrlRewriteSetter) {
        if (this.requestUrlRewrite == null) {
            this.requestUrlRewrite = new ArrayList<>();
        }
        requestUrlRewriteSetter.accept(this.requestUrlRewrite);
        return this;
    }

    /**
     * 访问URL重写。
     * @return requestUrlRewrite
     */
    public List<RequestUrlRewrite> getRequestUrlRewrite() {
        return requestUrlRewrite;
    }

    public void setRequestUrlRewrite(List<RequestUrlRewrite> requestUrlRewrite) {
        this.requestUrlRewrite = requestUrlRewrite;
    }

    public ConfigsGetBody withBrowserCacheRules(List<BrowserCacheRules> browserCacheRules) {
        this.browserCacheRules = browserCacheRules;
        return this;
    }

    public ConfigsGetBody addBrowserCacheRulesItem(BrowserCacheRules browserCacheRulesItem) {
        if (this.browserCacheRules == null) {
            this.browserCacheRules = new ArrayList<>();
        }
        this.browserCacheRules.add(browserCacheRulesItem);
        return this;
    }

    public ConfigsGetBody withBrowserCacheRules(Consumer<List<BrowserCacheRules>> browserCacheRulesSetter) {
        if (this.browserCacheRules == null) {
            this.browserCacheRules = new ArrayList<>();
        }
        browserCacheRulesSetter.accept(this.browserCacheRules);
        return this;
    }

    /**
     * 浏览器缓存过期时间。
     * @return browserCacheRules
     */
    public List<BrowserCacheRules> getBrowserCacheRules() {
        return browserCacheRules;
    }

    public void setBrowserCacheRules(List<BrowserCacheRules> browserCacheRules) {
        this.browserCacheRules = browserCacheRules;
    }

    public ConfigsGetBody withAccessAreaFilter(List<AccessAreaFilter> accessAreaFilter) {
        this.accessAreaFilter = accessAreaFilter;
        return this;
    }

    public ConfigsGetBody addAccessAreaFilterItem(AccessAreaFilter accessAreaFilterItem) {
        if (this.accessAreaFilter == null) {
            this.accessAreaFilter = new ArrayList<>();
        }
        this.accessAreaFilter.add(accessAreaFilterItem);
        return this;
    }

    public ConfigsGetBody withAccessAreaFilter(Consumer<List<AccessAreaFilter>> accessAreaFilterSetter) {
        if (this.accessAreaFilter == null) {
            this.accessAreaFilter = new ArrayList<>();
        }
        accessAreaFilterSetter.accept(this.accessAreaFilter);
        return this;
    }

    /**
     * Get accessAreaFilter
     * @return accessAreaFilter
     */
    public List<AccessAreaFilter> getAccessAreaFilter() {
        return accessAreaFilter;
    }

    public void setAccessAreaFilter(List<AccessAreaFilter> accessAreaFilter) {
        this.accessAreaFilter = accessAreaFilter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigsGetBody that = (ConfigsGetBody) obj;
        return Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.serviceArea, that.serviceArea) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.originRequestHeader, that.originRequestHeader)
            && Objects.equals(this.httpResponseHeader, that.httpResponseHeader)
            && Objects.equals(this.urlAuth, that.urlAuth) && Objects.equals(this.https, that.https)
            && Objects.equals(this.sources, that.sources) && Objects.equals(this.originProtocol, that.originProtocol)
            && Objects.equals(this.originFollow302Status, that.originFollow302Status)
            && Objects.equals(this.cacheRules, that.cacheRules) && Objects.equals(this.ipFilter, that.ipFilter)
            && Objects.equals(this.referer, that.referer) && Objects.equals(this.forceRedirect, that.forceRedirect)
            && Objects.equals(this.compress, that.compress)
            && Objects.equals(this.cacheUrlParameterFilter, that.cacheUrlParameterFilter)
            && Objects.equals(this.ipv6Accelerate, that.ipv6Accelerate)
            && Objects.equals(this.errorCodeCache, that.errorCodeCache)
            && Objects.equals(this.originRangeStatus, that.originRangeStatus)
            && Objects.equals(this.userAgentFilter, that.userAgentFilter)
            && Objects.equals(this.originRequestUrlRewrite, that.originRequestUrlRewrite)
            && Objects.equals(this.flexibleOrigin, that.flexibleOrigin)
            && Objects.equals(this.sliceEtagStatus, that.sliceEtagStatus)
            && Objects.equals(this.originReceiveTimeout, that.originReceiveTimeout)
            && Objects.equals(this.remoteAuth, that.remoteAuth) && Objects.equals(this.websocket, that.websocket)
            && Objects.equals(this.videoSeek, that.videoSeek)
            && Objects.equals(this.requestLimitRules, that.requestLimitRules)
            && Objects.equals(this.ipFrequencyLimit, that.ipFrequencyLimit) && Objects.equals(this.hsts, that.hsts)
            && Objects.equals(this.quic, that.quic)
            && Objects.equals(this.errorCodeRedirectRules, that.errorCodeRedirectRules)
            && Objects.equals(this.sni, that.sni) && Objects.equals(this.requestUrlRewrite, that.requestUrlRewrite)
            && Objects.equals(this.browserCacheRules, that.browserCacheRules)
            && Objects.equals(this.accessAreaFilter, that.accessAreaFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessType,
            serviceArea,
            remark,
            originRequestHeader,
            httpResponseHeader,
            urlAuth,
            https,
            sources,
            originProtocol,
            originFollow302Status,
            cacheRules,
            ipFilter,
            referer,
            forceRedirect,
            compress,
            cacheUrlParameterFilter,
            ipv6Accelerate,
            errorCodeCache,
            originRangeStatus,
            userAgentFilter,
            originRequestUrlRewrite,
            flexibleOrigin,
            sliceEtagStatus,
            originReceiveTimeout,
            remoteAuth,
            websocket,
            videoSeek,
            requestLimitRules,
            ipFrequencyLimit,
            hsts,
            quic,
            errorCodeRedirectRules,
            sni,
            requestUrlRewrite,
            browserCacheRules,
            accessAreaFilter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigsGetBody {\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    serviceArea: ").append(toIndentedString(serviceArea)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    originRequestHeader: ").append(toIndentedString(originRequestHeader)).append("\n");
        sb.append("    httpResponseHeader: ").append(toIndentedString(httpResponseHeader)).append("\n");
        sb.append("    urlAuth: ").append(toIndentedString(urlAuth)).append("\n");
        sb.append("    https: ").append(toIndentedString(https)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    originProtocol: ").append(toIndentedString(originProtocol)).append("\n");
        sb.append("    originFollow302Status: ").append(toIndentedString(originFollow302Status)).append("\n");
        sb.append("    cacheRules: ").append(toIndentedString(cacheRules)).append("\n");
        sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
        sb.append("    referer: ").append(toIndentedString(referer)).append("\n");
        sb.append("    forceRedirect: ").append(toIndentedString(forceRedirect)).append("\n");
        sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
        sb.append("    cacheUrlParameterFilter: ").append(toIndentedString(cacheUrlParameterFilter)).append("\n");
        sb.append("    ipv6Accelerate: ").append(toIndentedString(ipv6Accelerate)).append("\n");
        sb.append("    errorCodeCache: ").append(toIndentedString(errorCodeCache)).append("\n");
        sb.append("    originRangeStatus: ").append(toIndentedString(originRangeStatus)).append("\n");
        sb.append("    userAgentFilter: ").append(toIndentedString(userAgentFilter)).append("\n");
        sb.append("    originRequestUrlRewrite: ").append(toIndentedString(originRequestUrlRewrite)).append("\n");
        sb.append("    flexibleOrigin: ").append(toIndentedString(flexibleOrigin)).append("\n");
        sb.append("    sliceEtagStatus: ").append(toIndentedString(sliceEtagStatus)).append("\n");
        sb.append("    originReceiveTimeout: ").append(toIndentedString(originReceiveTimeout)).append("\n");
        sb.append("    remoteAuth: ").append(toIndentedString(remoteAuth)).append("\n");
        sb.append("    websocket: ").append(toIndentedString(websocket)).append("\n");
        sb.append("    videoSeek: ").append(toIndentedString(videoSeek)).append("\n");
        sb.append("    requestLimitRules: ").append(toIndentedString(requestLimitRules)).append("\n");
        sb.append("    ipFrequencyLimit: ").append(toIndentedString(ipFrequencyLimit)).append("\n");
        sb.append("    hsts: ").append(toIndentedString(hsts)).append("\n");
        sb.append("    quic: ").append(toIndentedString(quic)).append("\n");
        sb.append("    errorCodeRedirectRules: ").append(toIndentedString(errorCodeRedirectRules)).append("\n");
        sb.append("    sni: ").append(toIndentedString(sni)).append("\n");
        sb.append("    requestUrlRewrite: ").append(toIndentedString(requestUrlRewrite)).append("\n");
        sb.append("    browserCacheRules: ").append(toIndentedString(browserCacheRules)).append("\n");
        sb.append("    accessAreaFilter: ").append(toIndentedString(accessAreaFilter)).append("\n");
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
