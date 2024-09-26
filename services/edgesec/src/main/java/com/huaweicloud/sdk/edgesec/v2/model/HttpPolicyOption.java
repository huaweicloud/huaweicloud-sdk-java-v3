package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 选项
 */
public class HttpPolicyOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webattack")

    private Boolean webattack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    private Boolean common;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bot_enable")

    private Boolean botEnable;

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
    @JsonProperty(value = "followed_action")

    private Boolean followedAction;

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
    @JsonProperty(value = "anticrawler")

    private Boolean anticrawler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_bot_river")

    private Boolean thirdBotRiver;

    public HttpPolicyOption withWebattack(Boolean webattack) {
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

    public HttpPolicyOption withCommon(Boolean common) {
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

    public HttpPolicyOption withBotEnable(Boolean botEnable) {
        this.botEnable = botEnable;
        return this;
    }

    /**
     * 所有反爬虫是否开启
     * @return botEnable
     */
    public Boolean getBotEnable() {
        return botEnable;
    }

    public void setBotEnable(Boolean botEnable) {
        this.botEnable = botEnable;
    }

    public HttpPolicyOption withCrawler(Boolean crawler) {
        this.crawler = crawler;
        return this;
    }

    /**
     * 特征反爬虫是否开启
     * @return crawler
     */
    public Boolean getCrawler() {
        return crawler;
    }

    public void setCrawler(Boolean crawler) {
        this.crawler = crawler;
    }

    public HttpPolicyOption withCrawlerEngine(Boolean crawlerEngine) {
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

    public HttpPolicyOption withCrawlerScanner(Boolean crawlerScanner) {
        this.crawlerScanner = crawlerScanner;
        return this;
    }

    /**
     * 扫描器是否开启
     * @return crawlerScanner
     */
    public Boolean getCrawlerScanner() {
        return crawlerScanner;
    }

    public void setCrawlerScanner(Boolean crawlerScanner) {
        this.crawlerScanner = crawlerScanner;
    }

    public HttpPolicyOption withCrawlerScript(Boolean crawlerScript) {
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

    public HttpPolicyOption withCrawlerOther(Boolean crawlerOther) {
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

    public HttpPolicyOption withWebshell(Boolean webshell) {
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

    public HttpPolicyOption withCc(Boolean cc) {
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

    public HttpPolicyOption withCustom(Boolean custom) {
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

    public HttpPolicyOption withFollowedAction(Boolean followedAction) {
        this.followedAction = followedAction;
        return this;
    }

    /**
     * 攻击惩罚是否开启
     * @return followedAction
     */
    public Boolean getFollowedAction() {
        return followedAction;
    }

    public void setFollowedAction(Boolean followedAction) {
        this.followedAction = followedAction;
    }

    public HttpPolicyOption withWhiteblackip(Boolean whiteblackip) {
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

    public HttpPolicyOption withGeoip(Boolean geoip) {
        this.geoip = geoip;
        return this;
    }

    /**
     * 地理位置规则是否开启
     * @return geoip
     */
    public Boolean getGeoip() {
        return geoip;
    }

    public void setGeoip(Boolean geoip) {
        this.geoip = geoip;
    }

    public HttpPolicyOption withIgnore(Boolean ignore) {
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

    public HttpPolicyOption withPrivacy(Boolean privacy) {
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

    public HttpPolicyOption withAntitamper(Boolean antitamper) {
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

    public HttpPolicyOption withAntileakage(Boolean antileakage) {
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

    public HttpPolicyOption withAnticrawler(Boolean anticrawler) {
        this.anticrawler = anticrawler;
        return this;
    }

    /**
     * 脚本反爬虫规则是否开启
     * @return anticrawler
     */
    public Boolean getAnticrawler() {
        return anticrawler;
    }

    public void setAnticrawler(Boolean anticrawler) {
        this.anticrawler = anticrawler;
    }

    public HttpPolicyOption withThirdBotRiver(Boolean thirdBotRiver) {
        this.thirdBotRiver = thirdBotRiver;
        return this;
    }

    /**
     * 三方BOT是否开启
     * @return thirdBotRiver
     */
    public Boolean getThirdBotRiver() {
        return thirdBotRiver;
    }

    public void setThirdBotRiver(Boolean thirdBotRiver) {
        this.thirdBotRiver = thirdBotRiver;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpPolicyOption that = (HttpPolicyOption) obj;
        return Objects.equals(this.webattack, that.webattack) && Objects.equals(this.common, that.common)
            && Objects.equals(this.botEnable, that.botEnable) && Objects.equals(this.crawler, that.crawler)
            && Objects.equals(this.crawlerEngine, that.crawlerEngine)
            && Objects.equals(this.crawlerScanner, that.crawlerScanner)
            && Objects.equals(this.crawlerScript, that.crawlerScript)
            && Objects.equals(this.crawlerOther, that.crawlerOther) && Objects.equals(this.webshell, that.webshell)
            && Objects.equals(this.cc, that.cc) && Objects.equals(this.custom, that.custom)
            && Objects.equals(this.followedAction, that.followedAction)
            && Objects.equals(this.whiteblackip, that.whiteblackip) && Objects.equals(this.geoip, that.geoip)
            && Objects.equals(this.ignore, that.ignore) && Objects.equals(this.privacy, that.privacy)
            && Objects.equals(this.antitamper, that.antitamper) && Objects.equals(this.antileakage, that.antileakage)
            && Objects.equals(this.anticrawler, that.anticrawler)
            && Objects.equals(this.thirdBotRiver, that.thirdBotRiver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(webattack,
            common,
            botEnable,
            crawler,
            crawlerEngine,
            crawlerScanner,
            crawlerScript,
            crawlerOther,
            webshell,
            cc,
            custom,
            followedAction,
            whiteblackip,
            geoip,
            ignore,
            privacy,
            antitamper,
            antileakage,
            anticrawler,
            thirdBotRiver);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpPolicyOption {\n");
        sb.append("    webattack: ").append(toIndentedString(webattack)).append("\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
        sb.append("    botEnable: ").append(toIndentedString(botEnable)).append("\n");
        sb.append("    crawler: ").append(toIndentedString(crawler)).append("\n");
        sb.append("    crawlerEngine: ").append(toIndentedString(crawlerEngine)).append("\n");
        sb.append("    crawlerScanner: ").append(toIndentedString(crawlerScanner)).append("\n");
        sb.append("    crawlerScript: ").append(toIndentedString(crawlerScript)).append("\n");
        sb.append("    crawlerOther: ").append(toIndentedString(crawlerOther)).append("\n");
        sb.append("    webshell: ").append(toIndentedString(webshell)).append("\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
        sb.append("    followedAction: ").append(toIndentedString(followedAction)).append("\n");
        sb.append("    whiteblackip: ").append(toIndentedString(whiteblackip)).append("\n");
        sb.append("    geoip: ").append(toIndentedString(geoip)).append("\n");
        sb.append("    ignore: ").append(toIndentedString(ignore)).append("\n");
        sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
        sb.append("    antitamper: ").append(toIndentedString(antitamper)).append("\n");
        sb.append("    antileakage: ").append(toIndentedString(antileakage)).append("\n");
        sb.append("    anticrawler: ").append(toIndentedString(anticrawler)).append("\n");
        sb.append("    thirdBotRiver: ").append(toIndentedString(thirdBotRiver)).append("\n");
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
