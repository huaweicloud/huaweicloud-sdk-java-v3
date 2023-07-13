package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 防护策略检测模块开关选项，如是否开启Web基础防护等
 */
public class PolicyOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webattack")

    private Boolean webattack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    private Boolean common;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crawler")

    private Boolean crawler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crawler_engine")

    private Boolean crawlerEngine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crawler_scanner")

    private Boolean crawlerScanner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crawler_script")

    private Boolean crawlerScript;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crawler_other")

    private Boolean crawlerOther;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webshell")

    private Boolean webshell;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc")

    private Boolean cc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom")

    private Boolean custom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whiteblackip")

    private Boolean whiteblackip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geoip")

    private Boolean geoip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore")

    private Boolean ignore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privacy")

    private Boolean privacy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "antitamper")

    private Boolean antitamper;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "antileakage")

    private Boolean antileakage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bot_enable")

    private Boolean botEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modulex_enabled")

    private Boolean modulexEnabled;

    public PolicyOption withWebattack(Boolean webattack) {
        this.webattack = webattack;
        return this;
    }

    /**
     * 基础防护是否开启
     * @return webattack
     */
    public Boolean getWebattack() {
        return webattack;
    }

    public void setWebattack(Boolean webattack) {
        this.webattack = webattack;
    }

    public PolicyOption withCommon(Boolean common) {
        this.common = common;
        return this;
    }

    /**
     * 常规检测是否开启
     * @return common
     */
    public Boolean getCommon() {
        return common;
    }

    public void setCommon(Boolean common) {
        this.common = common;
    }

    public PolicyOption withCrawler(Boolean crawler) {
        this.crawler = crawler;
        return this;
    }

    /**
     * 预留参数，改参数值一直为true，用户可忽略该参数值
     * @return crawler
     */
    public Boolean getCrawler() {
        return crawler;
    }

    public void setCrawler(Boolean crawler) {
        this.crawler = crawler;
    }

    public PolicyOption withCrawlerEngine(Boolean crawlerEngine) {
        this.crawlerEngine = crawlerEngine;
        return this;
    }

    /**
     * 搜索engine是否开启
     * @return crawlerEngine
     */
    public Boolean getCrawlerEngine() {
        return crawlerEngine;
    }

    public void setCrawlerEngine(Boolean crawlerEngine) {
        this.crawlerEngine = crawlerEngine;
    }

    public PolicyOption withCrawlerScanner(Boolean crawlerScanner) {
        this.crawlerScanner = crawlerScanner;
        return this;
    }

    /**
     * 反爬虫检测是否开启
     * @return crawlerScanner
     */
    public Boolean getCrawlerScanner() {
        return crawlerScanner;
    }

    public void setCrawlerScanner(Boolean crawlerScanner) {
        this.crawlerScanner = crawlerScanner;
    }

    public PolicyOption withCrawlerScript(Boolean crawlerScript) {
        this.crawlerScript = crawlerScript;
        return this;
    }

    /**
     * 脚本反爬虫是否开启
     * @return crawlerScript
     */
    public Boolean getCrawlerScript() {
        return crawlerScript;
    }

    public void setCrawlerScript(Boolean crawlerScript) {
        this.crawlerScript = crawlerScript;
    }

    public PolicyOption withCrawlerOther(Boolean crawlerOther) {
        this.crawlerOther = crawlerOther;
        return this;
    }

    /**
     * 其他爬虫是否开启
     * @return crawlerOther
     */
    public Boolean getCrawlerOther() {
        return crawlerOther;
    }

    public void setCrawlerOther(Boolean crawlerOther) {
        this.crawlerOther = crawlerOther;
    }

    public PolicyOption withWebshell(Boolean webshell) {
        this.webshell = webshell;
        return this;
    }

    /**
     * Webshell检测是否开启
     * @return webshell
     */
    public Boolean getWebshell() {
        return webshell;
    }

    public void setWebshell(Boolean webshell) {
        this.webshell = webshell;
    }

    public PolicyOption withCc(Boolean cc) {
        this.cc = cc;
        return this;
    }

    /**
     * cc规则是否开启
     * @return cc
     */
    public Boolean getCc() {
        return cc;
    }

    public void setCc(Boolean cc) {
        this.cc = cc;
    }

    public PolicyOption withCustom(Boolean custom) {
        this.custom = custom;
        return this;
    }

    /**
     * 精准防护是否开启
     * @return custom
     */
    public Boolean getCustom() {
        return custom;
    }

    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    public PolicyOption withWhiteblackip(Boolean whiteblackip) {
        this.whiteblackip = whiteblackip;
        return this;
    }

    /**
     * 黑白名单防护是否开启
     * @return whiteblackip
     */
    public Boolean getWhiteblackip() {
        return whiteblackip;
    }

    public void setWhiteblackip(Boolean whiteblackip) {
        this.whiteblackip = whiteblackip;
    }

    public PolicyOption withGeoip(Boolean geoip) {
        this.geoip = geoip;
        return this;
    }

    /**
     * 地理位置访问控制规则是否开启
     * @return geoip
     */
    public Boolean getGeoip() {
        return geoip;
    }

    public void setGeoip(Boolean geoip) {
        this.geoip = geoip;
    }

    public PolicyOption withIgnore(Boolean ignore) {
        this.ignore = ignore;
        return this;
    }

    /**
     * 误报屏蔽是否开启
     * @return ignore
     */
    public Boolean getIgnore() {
        return ignore;
    }

    public void setIgnore(Boolean ignore) {
        this.ignore = ignore;
    }

    public PolicyOption withPrivacy(Boolean privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * 隐私屏蔽是否开启
     * @return privacy
     */
    public Boolean getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Boolean privacy) {
        this.privacy = privacy;
    }

    public PolicyOption withAntitamper(Boolean antitamper) {
        this.antitamper = antitamper;
        return this;
    }

    /**
     * 网页防篡改规则是否开启
     * @return antitamper
     */
    public Boolean getAntitamper() {
        return antitamper;
    }

    public void setAntitamper(Boolean antitamper) {
        this.antitamper = antitamper;
    }

    public PolicyOption withAntileakage(Boolean antileakage) {
        this.antileakage = antileakage;
        return this;
    }

    /**
     * 防敏感信息泄露规则是否开启
     * @return antileakage
     */
    public Boolean getAntileakage() {
        return antileakage;
    }

    public void setAntileakage(Boolean antileakage) {
        this.antileakage = antileakage;
    }

    public PolicyOption withBotEnable(Boolean botEnable) {
        this.botEnable = botEnable;
        return this;
    }

    /**
     * 网站反爬虫总开关是否开启
     * @return botEnable
     */
    public Boolean getBotEnable() {
        return botEnable;
    }

    public void setBotEnable(Boolean botEnable) {
        this.botEnable = botEnable;
    }

    public PolicyOption withModulexEnabled(Boolean modulexEnabled) {
        this.modulexEnabled = modulexEnabled;
        return this;
    }

    /**
     * modulex智能cc防护是否开启，该特性是公测特性，在公测期间，只支持仅记录模式。
     * @return modulexEnabled
     */
    public Boolean getModulexEnabled() {
        return modulexEnabled;
    }

    public void setModulexEnabled(Boolean modulexEnabled) {
        this.modulexEnabled = modulexEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyOption that = (PolicyOption) obj;
        return Objects.equals(this.webattack, that.webattack) && Objects.equals(this.common, that.common)
            && Objects.equals(this.crawler, that.crawler) && Objects.equals(this.crawlerEngine, that.crawlerEngine)
            && Objects.equals(this.crawlerScanner, that.crawlerScanner)
            && Objects.equals(this.crawlerScript, that.crawlerScript)
            && Objects.equals(this.crawlerOther, that.crawlerOther) && Objects.equals(this.webshell, that.webshell)
            && Objects.equals(this.cc, that.cc) && Objects.equals(this.custom, that.custom)
            && Objects.equals(this.whiteblackip, that.whiteblackip) && Objects.equals(this.geoip, that.geoip)
            && Objects.equals(this.ignore, that.ignore) && Objects.equals(this.privacy, that.privacy)
            && Objects.equals(this.antitamper, that.antitamper) && Objects.equals(this.antileakage, that.antileakage)
            && Objects.equals(this.botEnable, that.botEnable)
            && Objects.equals(this.modulexEnabled, that.modulexEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(webattack,
            common,
            crawler,
            crawlerEngine,
            crawlerScanner,
            crawlerScript,
            crawlerOther,
            webshell,
            cc,
            custom,
            whiteblackip,
            geoip,
            ignore,
            privacy,
            antitamper,
            antileakage,
            botEnable,
            modulexEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyOption {\n");
        sb.append("    webattack: ").append(toIndentedString(webattack)).append("\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
        sb.append("    crawler: ").append(toIndentedString(crawler)).append("\n");
        sb.append("    crawlerEngine: ").append(toIndentedString(crawlerEngine)).append("\n");
        sb.append("    crawlerScanner: ").append(toIndentedString(crawlerScanner)).append("\n");
        sb.append("    crawlerScript: ").append(toIndentedString(crawlerScript)).append("\n");
        sb.append("    crawlerOther: ").append(toIndentedString(crawlerOther)).append("\n");
        sb.append("    webshell: ").append(toIndentedString(webshell)).append("\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
        sb.append("    whiteblackip: ").append(toIndentedString(whiteblackip)).append("\n");
        sb.append("    geoip: ").append(toIndentedString(geoip)).append("\n");
        sb.append("    ignore: ").append(toIndentedString(ignore)).append("\n");
        sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
        sb.append("    antitamper: ").append(toIndentedString(antitamper)).append("\n");
        sb.append("    antileakage: ").append(toIndentedString(antileakage)).append("\n");
        sb.append("    botEnable: ").append(toIndentedString(botEnable)).append("\n");
        sb.append("    modulexEnabled: ").append(toIndentedString(modulexEnabled)).append("\n");
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
