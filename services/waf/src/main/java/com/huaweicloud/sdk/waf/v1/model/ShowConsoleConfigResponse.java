package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowConsoleConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps")

    @JacksonXmlProperty(localName = "eps")

    private Boolean eps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls")

    @JacksonXmlProperty(localName = "tls")

    private Boolean tls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6")

    @JacksonXmlProperty(localName = "ipv6")

    private Boolean ipv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert")

    @JacksonXmlProperty(localName = "alert")

    private Boolean alert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom")

    @JacksonXmlProperty(localName = "custom")

    private Boolean custom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_mode")

    @JacksonXmlProperty(localName = "elb_mode")

    private Boolean elbMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_lts")

    @JacksonXmlProperty(localName = "event_lts")

    private Boolean eventLts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_dns")

    @JacksonXmlProperty(localName = "multi_dns")

    private Boolean multiDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_ip")

    @JacksonXmlProperty(localName = "search_ip")

    private Boolean searchIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc_enhance")

    @JacksonXmlProperty(localName = "cc_enhance")

    private Boolean ccEnhance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cname_switch")

    @JacksonXmlProperty(localName = "cname_switch")

    private Boolean cnameSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_block")

    @JacksonXmlProperty(localName = "custom_block")

    private Boolean customBlock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_ignore")

    @JacksonXmlProperty(localName = "advanced_ignore")

    private Boolean advancedIgnore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "js_crawler_enable")

    @JacksonXmlProperty(localName = "js_crawler_enable")

    private Boolean jsCrawlerEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deep_decode_enable")

    @JacksonXmlProperty(localName = "deep_decode_enable")

    private Boolean deepDecodeEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overview_bandwidth")

    @JacksonXmlProperty(localName = "overview_bandwidth")

    private Boolean overviewBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_use_oldcname")

    @JacksonXmlProperty(localName = "proxy_use_oldcname")

    private Boolean proxyUseOldcname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_all_headers_enable")

    @JacksonXmlProperty(localName = "check_all_headers_enable")

    private Boolean checkAllHeadersEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geoip_enable")

    @JacksonXmlProperty(localName = "geoip_enable")

    private Boolean geoipEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "load_balance_enable")

    @JacksonXmlProperty(localName = "load_balance_enable")

    private Boolean loadBalanceEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_protection_enable")

    @JacksonXmlProperty(localName = "ipv6_protection_enable")

    private Boolean ipv6ProtectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_sharing_enable")

    @JacksonXmlProperty(localName = "policy_sharing_enable")

    private Boolean policySharingEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_group")

    @JacksonXmlProperty(localName = "ip_group")

    private Boolean ipGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot_action_enable")

    @JacksonXmlProperty(localName = "robot_action_enable")

    private Boolean robotActionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2_enable")

    @JacksonXmlProperty(localName = "http2_enable")

    private Boolean http2Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout_config_enable")

    @JacksonXmlProperty(localName = "timeout_config_enable")

    private Boolean timeoutConfigEnable;

    public ShowConsoleConfigResponse withEps(Boolean eps) {
        this.eps = eps;
        return this;
    }

    /**
     * 是否支持EPS，false：不支持；true：支持
     * @return eps
     */
    public Boolean getEps() {
        return eps;
    }

    public void setEps(Boolean eps) {
        this.eps = eps;
    }

    public ShowConsoleConfigResponse withTls(Boolean tls) {
        this.tls = tls;
        return this;
    }

    /**
     * 是否支持的TLS版本（TLS v1.0/TLS v1.1/TLS v1.2）,默认为TLS v1.0版本，false：不支持；true：支持
     * @return tls
     */
    public Boolean getTls() {
        return tls;
    }

    public void setTls(Boolean tls) {
        this.tls = tls;
    }

    public ShowConsoleConfigResponse withIpv6(Boolean ipv6) {
        this.ipv6 = ipv6;
        return this;
    }

    /**
     * 是否支持IPV6，false：不支持；true：支持
     * @return ipv6
     */
    public Boolean getIpv6() {
        return ipv6;
    }

    public void setIpv6(Boolean ipv6) {
        this.ipv6 = ipv6;
    }

    public ShowConsoleConfigResponse withAlert(Boolean alert) {
        this.alert = alert;
        return this;
    }

    /**
     * 是否支持告警，false：不支持；true：支持
     * @return alert
     */
    public Boolean getAlert() {
        return alert;
    }

    public void setAlert(Boolean alert) {
        this.alert = alert;
    }

    public ShowConsoleConfigResponse withCustom(Boolean custom) {
        this.custom = custom;
        return this;
    }

    /**
     * 是否支持精准防护，false：不支持；true：支持
     * @return custom
     */
    public Boolean getCustom() {
        return custom;
    }

    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    public ShowConsoleConfigResponse withElbMode(Boolean elbMode) {
        this.elbMode = elbMode;
        return this;
    }

    /**
     * 是否支持ELB模式，false：不支持；true：支持
     * @return elbMode
     */
    public Boolean getElbMode() {
        return elbMode;
    }

    public void setElbMode(Boolean elbMode) {
        this.elbMode = elbMode;
    }

    public ShowConsoleConfigResponse withEventLts(Boolean eventLts) {
        this.eventLts = eventLts;
        return this;
    }

    /**
     * 是否支持LTS全量日志，false：不支持；true：支持
     * @return eventLts
     */
    public Boolean getEventLts() {
        return eventLts;
    }

    public void setEventLts(Boolean eventLts) {
        this.eventLts = eventLts;
    }

    public ShowConsoleConfigResponse withMultiDns(Boolean multiDns) {
        this.multiDns = multiDns;
        return this;
    }

    /**
     * 是否支持多DNS解析，false：不支持；true：支持
     * @return multiDns
     */
    public Boolean getMultiDns() {
        return multiDns;
    }

    public void setMultiDns(Boolean multiDns) {
        this.multiDns = multiDns;
    }

    public ShowConsoleConfigResponse withSearchIp(Boolean searchIp) {
        this.searchIp = searchIp;
        return this;
    }

    /**
     * 是否支持搜索IP，false：不支持；true：支持
     * @return searchIp
     */
    public Boolean getSearchIp() {
        return searchIp;
    }

    public void setSearchIp(Boolean searchIp) {
        this.searchIp = searchIp;
    }

    public ShowConsoleConfigResponse withCcEnhance(Boolean ccEnhance) {
        this.ccEnhance = ccEnhance;
        return this;
    }

    /**
     * 是否支持CC增强，false：不支持；true：支持
     * @return ccEnhance
     */
    public Boolean getCcEnhance() {
        return ccEnhance;
    }

    public void setCcEnhance(Boolean ccEnhance) {
        this.ccEnhance = ccEnhance;
    }

    public ShowConsoleConfigResponse withCnameSwitch(Boolean cnameSwitch) {
        this.cnameSwitch = cnameSwitch;
        return this;
    }

    /**
     * 是否支持cname切换，false：不支持；true：支持
     * @return cnameSwitch
     */
    public Boolean getCnameSwitch() {
        return cnameSwitch;
    }

    public void setCnameSwitch(Boolean cnameSwitch) {
        this.cnameSwitch = cnameSwitch;
    }

    public ShowConsoleConfigResponse withCustomBlock(Boolean customBlock) {
        this.customBlock = customBlock;
        return this;
    }

    /**
     * 是否支持自定义拦截页面，false：不支持，true：支持
     * @return customBlock
     */
    public Boolean getCustomBlock() {
        return customBlock;
    }

    public void setCustomBlock(Boolean customBlock) {
        this.customBlock = customBlock;
    }

    public ShowConsoleConfigResponse withAdvancedIgnore(Boolean advancedIgnore) {
        this.advancedIgnore = advancedIgnore;
        return this;
    }

    /**
     * 是否支持误报屏蔽，false：不支持；true：支持
     * @return advancedIgnore
     */
    public Boolean getAdvancedIgnore() {
        return advancedIgnore;
    }

    public void setAdvancedIgnore(Boolean advancedIgnore) {
        this.advancedIgnore = advancedIgnore;
    }

    public ShowConsoleConfigResponse withJsCrawlerEnable(Boolean jsCrawlerEnable) {
        this.jsCrawlerEnable = jsCrawlerEnable;
        return this;
    }

    /**
     * 是否支持js反爬虫，false：不支持；true：支持
     * @return jsCrawlerEnable
     */
    public Boolean getJsCrawlerEnable() {
        return jsCrawlerEnable;
    }

    public void setJsCrawlerEnable(Boolean jsCrawlerEnable) {
        this.jsCrawlerEnable = jsCrawlerEnable;
    }

    public ShowConsoleConfigResponse withDeepDecodeEnable(Boolean deepDecodeEnable) {
        this.deepDecodeEnable = deepDecodeEnable;
        return this;
    }

    /**
     * 是否支持web基础防护深度检测，false：不支持；true：支持
     * @return deepDecodeEnable
     */
    public Boolean getDeepDecodeEnable() {
        return deepDecodeEnable;
    }

    public void setDeepDecodeEnable(Boolean deepDecodeEnable) {
        this.deepDecodeEnable = deepDecodeEnable;
    }

    public ShowConsoleConfigResponse withOverviewBandwidth(Boolean overviewBandwidth) {
        this.overviewBandwidth = overviewBandwidth;
        return this;
    }

    /**
     * 是否支持安全总览带宽统计，false：不支持；true：支持
     * @return overviewBandwidth
     */
    public Boolean getOverviewBandwidth() {
        return overviewBandwidth;
    }

    public void setOverviewBandwidth(Boolean overviewBandwidth) {
        this.overviewBandwidth = overviewBandwidth;
    }

    public ShowConsoleConfigResponse withProxyUseOldcname(Boolean proxyUseOldcname) {
        this.proxyUseOldcname = proxyUseOldcname;
        return this;
    }

    /**
     * 是否支持使用旧cname解析，false：不支持；true：支持
     * @return proxyUseOldcname
     */
    public Boolean getProxyUseOldcname() {
        return proxyUseOldcname;
    }

    public void setProxyUseOldcname(Boolean proxyUseOldcname) {
        this.proxyUseOldcname = proxyUseOldcname;
    }

    public ShowConsoleConfigResponse withCheckAllHeadersEnable(Boolean checkAllHeadersEnable) {
        this.checkAllHeadersEnable = checkAllHeadersEnable;
        return this;
    }

    /**
     * 是否支持检查所有的header，false：不支持；true：支持
     * @return checkAllHeadersEnable
     */
    public Boolean getCheckAllHeadersEnable() {
        return checkAllHeadersEnable;
    }

    public void setCheckAllHeadersEnable(Boolean checkAllHeadersEnable) {
        this.checkAllHeadersEnable = checkAllHeadersEnable;
    }

    public ShowConsoleConfigResponse withGeoipEnable(Boolean geoipEnable) {
        this.geoipEnable = geoipEnable;
        return this;
    }

    /**
     * 是否支持地理位置访问控制，false：不支持；true：支持
     * @return geoipEnable
     */
    public Boolean getGeoipEnable() {
        return geoipEnable;
    }

    public void setGeoipEnable(Boolean geoipEnable) {
        this.geoipEnable = geoipEnable;
    }

    public ShowConsoleConfigResponse withLoadBalanceEnable(Boolean loadBalanceEnable) {
        this.loadBalanceEnable = loadBalanceEnable;
        return this;
    }

    /**
     * 是否支持域名访问负载均衡配置，false：不支持；true：支持
     * @return loadBalanceEnable
     */
    public Boolean getLoadBalanceEnable() {
        return loadBalanceEnable;
    }

    public void setLoadBalanceEnable(Boolean loadBalanceEnable) {
        this.loadBalanceEnable = loadBalanceEnable;
    }

    public ShowConsoleConfigResponse withIpv6ProtectionEnable(Boolean ipv6ProtectionEnable) {
        this.ipv6ProtectionEnable = ipv6ProtectionEnable;
        return this;
    }

    /**
     * 是否支持ipv6防护，false：不支持；true：支持
     * @return ipv6ProtectionEnable
     */
    public Boolean getIpv6ProtectionEnable() {
        return ipv6ProtectionEnable;
    }

    public void setIpv6ProtectionEnable(Boolean ipv6ProtectionEnable) {
        this.ipv6ProtectionEnable = ipv6ProtectionEnable;
    }

    public ShowConsoleConfigResponse withPolicySharingEnable(Boolean policySharingEnable) {
        this.policySharingEnable = policySharingEnable;
        return this;
    }

    /**
     * 是否支持策略共享，false：不支持；true：支持
     * @return policySharingEnable
     */
    public Boolean getPolicySharingEnable() {
        return policySharingEnable;
    }

    public void setPolicySharingEnable(Boolean policySharingEnable) {
        this.policySharingEnable = policySharingEnable;
    }

    public ShowConsoleConfigResponse withIpGroup(Boolean ipGroup) {
        this.ipGroup = ipGroup;
        return this;
    }

    /**
     * 是否支持ip地址组，false：不支持；true：支持
     * @return ipGroup
     */
    public Boolean getIpGroup() {
        return ipGroup;
    }

    public void setIpGroup(Boolean ipGroup) {
        this.ipGroup = ipGroup;
    }

    public ShowConsoleConfigResponse withRobotActionEnable(Boolean robotActionEnable) {
        this.robotActionEnable = robotActionEnable;
        return this;
    }

    /**
     * 是否支持网站反爬虫，false：不支持；true：支持
     * @return robotActionEnable
     */
    public Boolean getRobotActionEnable() {
        return robotActionEnable;
    }

    public void setRobotActionEnable(Boolean robotActionEnable) {
        this.robotActionEnable = robotActionEnable;
    }

    public ShowConsoleConfigResponse withHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
        return this;
    }

    /**
     * 是否支持http2，false：不支持；true：支持
     * @return http2Enable
     */
    public Boolean getHttp2Enable() {
        return http2Enable;
    }

    public void setHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
    }

    public ShowConsoleConfigResponse withTimeoutConfigEnable(Boolean timeoutConfigEnable) {
        this.timeoutConfigEnable = timeoutConfigEnable;
        return this;
    }

    /**
     * 是否支持超时配置，false：不支持；true：支持
     * @return timeoutConfigEnable
     */
    public Boolean getTimeoutConfigEnable() {
        return timeoutConfigEnable;
    }

    public void setTimeoutConfigEnable(Boolean timeoutConfigEnable) {
        this.timeoutConfigEnable = timeoutConfigEnable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowConsoleConfigResponse showConsoleConfigResponse = (ShowConsoleConfigResponse) o;
        return Objects.equals(this.eps, showConsoleConfigResponse.eps)
            && Objects.equals(this.tls, showConsoleConfigResponse.tls)
            && Objects.equals(this.ipv6, showConsoleConfigResponse.ipv6)
            && Objects.equals(this.alert, showConsoleConfigResponse.alert)
            && Objects.equals(this.custom, showConsoleConfigResponse.custom)
            && Objects.equals(this.elbMode, showConsoleConfigResponse.elbMode)
            && Objects.equals(this.eventLts, showConsoleConfigResponse.eventLts)
            && Objects.equals(this.multiDns, showConsoleConfigResponse.multiDns)
            && Objects.equals(this.searchIp, showConsoleConfigResponse.searchIp)
            && Objects.equals(this.ccEnhance, showConsoleConfigResponse.ccEnhance)
            && Objects.equals(this.cnameSwitch, showConsoleConfigResponse.cnameSwitch)
            && Objects.equals(this.customBlock, showConsoleConfigResponse.customBlock)
            && Objects.equals(this.advancedIgnore, showConsoleConfigResponse.advancedIgnore)
            && Objects.equals(this.jsCrawlerEnable, showConsoleConfigResponse.jsCrawlerEnable)
            && Objects.equals(this.deepDecodeEnable, showConsoleConfigResponse.deepDecodeEnable)
            && Objects.equals(this.overviewBandwidth, showConsoleConfigResponse.overviewBandwidth)
            && Objects.equals(this.proxyUseOldcname, showConsoleConfigResponse.proxyUseOldcname)
            && Objects.equals(this.checkAllHeadersEnable, showConsoleConfigResponse.checkAllHeadersEnable)
            && Objects.equals(this.geoipEnable, showConsoleConfigResponse.geoipEnable)
            && Objects.equals(this.loadBalanceEnable, showConsoleConfigResponse.loadBalanceEnable)
            && Objects.equals(this.ipv6ProtectionEnable, showConsoleConfigResponse.ipv6ProtectionEnable)
            && Objects.equals(this.policySharingEnable, showConsoleConfigResponse.policySharingEnable)
            && Objects.equals(this.ipGroup, showConsoleConfigResponse.ipGroup)
            && Objects.equals(this.robotActionEnable, showConsoleConfigResponse.robotActionEnable)
            && Objects.equals(this.http2Enable, showConsoleConfigResponse.http2Enable)
            && Objects.equals(this.timeoutConfigEnable, showConsoleConfigResponse.timeoutConfigEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eps,
            tls,
            ipv6,
            alert,
            custom,
            elbMode,
            eventLts,
            multiDns,
            searchIp,
            ccEnhance,
            cnameSwitch,
            customBlock,
            advancedIgnore,
            jsCrawlerEnable,
            deepDecodeEnable,
            overviewBandwidth,
            proxyUseOldcname,
            checkAllHeadersEnable,
            geoipEnable,
            loadBalanceEnable,
            ipv6ProtectionEnable,
            policySharingEnable,
            ipGroup,
            robotActionEnable,
            http2Enable,
            timeoutConfigEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConsoleConfigResponse {\n");
        sb.append("    eps: ").append(toIndentedString(eps)).append("\n");
        sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
        sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
        sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
        sb.append("    elbMode: ").append(toIndentedString(elbMode)).append("\n");
        sb.append("    eventLts: ").append(toIndentedString(eventLts)).append("\n");
        sb.append("    multiDns: ").append(toIndentedString(multiDns)).append("\n");
        sb.append("    searchIp: ").append(toIndentedString(searchIp)).append("\n");
        sb.append("    ccEnhance: ").append(toIndentedString(ccEnhance)).append("\n");
        sb.append("    cnameSwitch: ").append(toIndentedString(cnameSwitch)).append("\n");
        sb.append("    customBlock: ").append(toIndentedString(customBlock)).append("\n");
        sb.append("    advancedIgnore: ").append(toIndentedString(advancedIgnore)).append("\n");
        sb.append("    jsCrawlerEnable: ").append(toIndentedString(jsCrawlerEnable)).append("\n");
        sb.append("    deepDecodeEnable: ").append(toIndentedString(deepDecodeEnable)).append("\n");
        sb.append("    overviewBandwidth: ").append(toIndentedString(overviewBandwidth)).append("\n");
        sb.append("    proxyUseOldcname: ").append(toIndentedString(proxyUseOldcname)).append("\n");
        sb.append("    checkAllHeadersEnable: ").append(toIndentedString(checkAllHeadersEnable)).append("\n");
        sb.append("    geoipEnable: ").append(toIndentedString(geoipEnable)).append("\n");
        sb.append("    loadBalanceEnable: ").append(toIndentedString(loadBalanceEnable)).append("\n");
        sb.append("    ipv6ProtectionEnable: ").append(toIndentedString(ipv6ProtectionEnable)).append("\n");
        sb.append("    policySharingEnable: ").append(toIndentedString(policySharingEnable)).append("\n");
        sb.append("    ipGroup: ").append(toIndentedString(ipGroup)).append("\n");
        sb.append("    robotActionEnable: ").append(toIndentedString(robotActionEnable)).append("\n");
        sb.append("    http2Enable: ").append(toIndentedString(http2Enable)).append("\n");
        sb.append("    timeoutConfigEnable: ").append(toIndentedString(timeoutConfigEnable)).append("\n");
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
