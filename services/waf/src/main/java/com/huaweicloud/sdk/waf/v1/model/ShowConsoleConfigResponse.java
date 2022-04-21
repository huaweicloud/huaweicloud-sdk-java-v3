package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowConsoleConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps")

    private Boolean eps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls")

    private Boolean tls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6")

    private Boolean ipv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert")

    private Boolean alert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom")

    private Boolean custom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_mode")

    private Boolean elbMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_lts")

    private Boolean eventLts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_dns")

    private Boolean multiDns;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_ip")

    private Boolean searchIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc_enhance")

    private Boolean ccEnhance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cname_switch")

    private Boolean cnameSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_block")

    private Boolean customBlock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_ignore")

    private Boolean advancedIgnore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "js_crawler_enable")

    private Boolean jsCrawlerEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deep_decode_enable")

    private Boolean deepDecodeEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overview_bandwidth")

    private Boolean overviewBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_use_oldcname")

    private Boolean proxyUseOldcname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_all_headers_enable")

    private Boolean checkAllHeadersEnable;

    public ShowConsoleConfigResponse withEps(Boolean eps) {
        this.eps = eps;
        return this;
    }

    /**
     * 支持EPS
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
     * 支持最低的TLS版本（TLS v1.0/TLS v1.1/TLS v1.2）,默认为TLS v1.0版本
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
     * 支持IPV6
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
     * 支持告警
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
     * 支持精准防护
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
     * 支持ELB模式
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
     * 支持LTS全量日志
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
     * 支持多DNS解析
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
     * 支持搜索IP
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
     * 支持CC增强
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
     * 支持cname切换
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
     * 支持精准拦截
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
     * 支持误报屏蔽
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
     * 支持js反爬虫
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
     * 支持深度解析
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
     * 支持安全总览带宽统计
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
     * 支持使用旧cname解析
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
     * 支持检查所有的header
     * @return checkAllHeadersEnable
     */
    public Boolean getCheckAllHeadersEnable() {
        return checkAllHeadersEnable;
    }

    public void setCheckAllHeadersEnable(Boolean checkAllHeadersEnable) {
        this.checkAllHeadersEnable = checkAllHeadersEnable;
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
            && Objects.equals(this.checkAllHeadersEnable, showConsoleConfigResponse.checkAllHeadersEnable);
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
            checkAllHeadersEnable);
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
