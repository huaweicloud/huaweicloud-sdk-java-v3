package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 域名模板配置 **约束限制：** 不涉及
 */
public class TemplateConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_response_header")

    private List<HttpResponseHeader> httpResponseHeader = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_rules")

    private List<CacheRules> cacheRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_follow302_status")

    private String originFollow302Status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress")

    private Compress compress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_range_status")

    private String originRangeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_filter")

    private IpFilter ipFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referer")

    private RefererConfig referer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_agent_filter")

    private UserAgentFilter userAgentFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_limit_strategy")

    private List<FlowLimitStrategy> flowLimitStrategy = null;

    public TemplateConfigs withHttpResponseHeader(List<HttpResponseHeader> httpResponseHeader) {
        this.httpResponseHeader = httpResponseHeader;
        return this;
    }

    public TemplateConfigs addHttpResponseHeaderItem(HttpResponseHeader httpResponseHeaderItem) {
        if (this.httpResponseHeader == null) {
            this.httpResponseHeader = new ArrayList<>();
        }
        this.httpResponseHeader.add(httpResponseHeaderItem);
        return this;
    }

    public TemplateConfigs withHttpResponseHeader(Consumer<List<HttpResponseHeader>> httpResponseHeaderSetter) {
        if (this.httpResponseHeader == null) {
            this.httpResponseHeader = new ArrayList<>();
        }
        httpResponseHeaderSetter.accept(this.httpResponseHeader);
        return this;
    }

    /**
     * Get httpResponseHeader
     * @return httpResponseHeader
     */
    public List<HttpResponseHeader> getHttpResponseHeader() {
        return httpResponseHeader;
    }

    public void setHttpResponseHeader(List<HttpResponseHeader> httpResponseHeader) {
        this.httpResponseHeader = httpResponseHeader;
    }

    public TemplateConfigs withCacheRules(List<CacheRules> cacheRules) {
        this.cacheRules = cacheRules;
        return this;
    }

    public TemplateConfigs addCacheRulesItem(CacheRules cacheRulesItem) {
        if (this.cacheRules == null) {
            this.cacheRules = new ArrayList<>();
        }
        this.cacheRules.add(cacheRulesItem);
        return this;
    }

    public TemplateConfigs withCacheRules(Consumer<List<CacheRules>> cacheRulesSetter) {
        if (this.cacheRules == null) {
            this.cacheRules = new ArrayList<>();
        }
        cacheRulesSetter.accept(this.cacheRules);
        return this;
    }

    /**
     * Get cacheRules
     * @return cacheRules
     */
    public List<CacheRules> getCacheRules() {
        return cacheRules;
    }

    public void setCacheRules(List<CacheRules> cacheRules) {
        this.cacheRules = cacheRules;
    }

    public TemplateConfigs withOriginFollow302Status(String originFollow302Status) {
        this.originFollow302Status = originFollow302Status;
        return this;
    }

    /**
     * **参数解释：** 开启回源跟随，当源站地址因业务需求做了301/302 重定向，CDN节点会先跳转到301/302对应地址获取资源，缓存后再返回给用户 **约束限制：** 不涉及 **取值范围：** - on: 开启 - off: 关闭 **默认取值：** 不涉及
     * @return originFollow302Status
     */
    public String getOriginFollow302Status() {
        return originFollow302Status;
    }

    public void setOriginFollow302Status(String originFollow302Status) {
        this.originFollow302Status = originFollow302Status;
    }

    public TemplateConfigs withCompress(Compress compress) {
        this.compress = compress;
        return this;
    }

    public TemplateConfigs withCompress(Consumer<Compress> compressSetter) {
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

    public TemplateConfigs withOriginRangeStatus(String originRangeStatus) {
        this.originRangeStatus = originRangeStatus;
        return this;
    }

    /**
     * **参数解释：** Range回源，开启后，源站在收到CDN节点回源请求时，根据HTTP请求头中的Range信息返回指定范围的数据给CDN节点 **约束限制：** 开启Range回源的前提是您的源站支持Range请求，即HTTP请求头中包含Range字段，否则可能导致回源失败 **取值范围：** - on: 开启 - off: 关闭 **默认取值：** 不涉及
     * @return originRangeStatus
     */
    public String getOriginRangeStatus() {
        return originRangeStatus;
    }

    public void setOriginRangeStatus(String originRangeStatus) {
        this.originRangeStatus = originRangeStatus;
    }

    public TemplateConfigs withIpFilter(IpFilter ipFilter) {
        this.ipFilter = ipFilter;
        return this;
    }

    public TemplateConfigs withIpFilter(Consumer<IpFilter> ipFilterSetter) {
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

    public TemplateConfigs withReferer(RefererConfig referer) {
        this.referer = referer;
        return this;
    }

    public TemplateConfigs withReferer(Consumer<RefererConfig> refererSetter) {
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

    public TemplateConfigs withUserAgentFilter(UserAgentFilter userAgentFilter) {
        this.userAgentFilter = userAgentFilter;
        return this;
    }

    public TemplateConfigs withUserAgentFilter(Consumer<UserAgentFilter> userAgentFilterSetter) {
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

    public TemplateConfigs withFlowLimitStrategy(List<FlowLimitStrategy> flowLimitStrategy) {
        this.flowLimitStrategy = flowLimitStrategy;
        return this;
    }

    public TemplateConfigs addFlowLimitStrategyItem(FlowLimitStrategy flowLimitStrategyItem) {
        if (this.flowLimitStrategy == null) {
            this.flowLimitStrategy = new ArrayList<>();
        }
        this.flowLimitStrategy.add(flowLimitStrategyItem);
        return this;
    }

    public TemplateConfigs withFlowLimitStrategy(Consumer<List<FlowLimitStrategy>> flowLimitStrategySetter) {
        if (this.flowLimitStrategy == null) {
            this.flowLimitStrategy = new ArrayList<>();
        }
        flowLimitStrategySetter.accept(this.flowLimitStrategy);
        return this;
    }

    /**
     * **参数解释：** 设置用量封顶阈值，当实际用量大于阈值时停用域名，有效预防流量盗刷或恶意攻击带来的高额账单。  > 由于监控数据存在时延，域名将在用量达到阈值后的10分钟左右被停用  **约束限制：** 不涉及
     * @return flowLimitStrategy
     */
    public List<FlowLimitStrategy> getFlowLimitStrategy() {
        return flowLimitStrategy;
    }

    public void setFlowLimitStrategy(List<FlowLimitStrategy> flowLimitStrategy) {
        this.flowLimitStrategy = flowLimitStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateConfigs that = (TemplateConfigs) obj;
        return Objects.equals(this.httpResponseHeader, that.httpResponseHeader)
            && Objects.equals(this.cacheRules, that.cacheRules)
            && Objects.equals(this.originFollow302Status, that.originFollow302Status)
            && Objects.equals(this.compress, that.compress)
            && Objects.equals(this.originRangeStatus, that.originRangeStatus)
            && Objects.equals(this.ipFilter, that.ipFilter) && Objects.equals(this.referer, that.referer)
            && Objects.equals(this.userAgentFilter, that.userAgentFilter)
            && Objects.equals(this.flowLimitStrategy, that.flowLimitStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpResponseHeader,
            cacheRules,
            originFollow302Status,
            compress,
            originRangeStatus,
            ipFilter,
            referer,
            userAgentFilter,
            flowLimitStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateConfigs {\n");
        sb.append("    httpResponseHeader: ").append(toIndentedString(httpResponseHeader)).append("\n");
        sb.append("    cacheRules: ").append(toIndentedString(cacheRules)).append("\n");
        sb.append("    originFollow302Status: ").append(toIndentedString(originFollow302Status)).append("\n");
        sb.append("    compress: ").append(toIndentedString(compress)).append("\n");
        sb.append("    originRangeStatus: ").append(toIndentedString(originRangeStatus)).append("\n");
        sb.append("    ipFilter: ").append(toIndentedString(ipFilter)).append("\n");
        sb.append("    referer: ").append(toIndentedString(referer)).append("\n");
        sb.append("    userAgentFilter: ").append(toIndentedString(userAgentFilter)).append("\n");
        sb.append("    flowLimitStrategy: ").append(toIndentedString(flowLimitStrategy)).append("\n");
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
