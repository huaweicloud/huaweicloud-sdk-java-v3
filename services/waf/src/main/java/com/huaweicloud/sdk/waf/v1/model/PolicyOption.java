package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 选项
 */
public class PolicyOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="webattack")
    
    private Boolean webattack;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="common")
    
    private Boolean common;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="crawler")
    
    private Boolean crawler;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="crawler_engine")
    
    private Boolean crawlerEngine;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="crawler_scanner")
    
    private Boolean crawlerScanner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="crawler_script")
    
    private Boolean crawlerScript;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="crawler_other")
    
    private Boolean crawlerOther;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="webshell")
    
    private Boolean webshell;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cc")
    
    private Boolean cc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="custom")
    
    private Boolean custom;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="whiteblackip")
    
    private Boolean whiteblackip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ignore")
    
    private Boolean ignore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="privacy")
    
    private Boolean privacy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="antitamper")
    
    private Boolean antitamper;

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
     * 反爬虫是否开启
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
     * 扫描器是否开启
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyOption policyOption = (PolicyOption) o;
        return Objects.equals(this.webattack, policyOption.webattack) &&
            Objects.equals(this.common, policyOption.common) &&
            Objects.equals(this.crawler, policyOption.crawler) &&
            Objects.equals(this.crawlerEngine, policyOption.crawlerEngine) &&
            Objects.equals(this.crawlerScanner, policyOption.crawlerScanner) &&
            Objects.equals(this.crawlerScript, policyOption.crawlerScript) &&
            Objects.equals(this.crawlerOther, policyOption.crawlerOther) &&
            Objects.equals(this.webshell, policyOption.webshell) &&
            Objects.equals(this.cc, policyOption.cc) &&
            Objects.equals(this.custom, policyOption.custom) &&
            Objects.equals(this.whiteblackip, policyOption.whiteblackip) &&
            Objects.equals(this.ignore, policyOption.ignore) &&
            Objects.equals(this.privacy, policyOption.privacy) &&
            Objects.equals(this.antitamper, policyOption.antitamper);
    }
    @Override
    public int hashCode() {
        return Objects.hash(webattack, common, crawler, crawlerEngine, crawlerScanner, crawlerScript, crawlerOther, webshell, cc, custom, whiteblackip, ignore, privacy, antitamper);
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
        sb.append("    ignore: ").append(toIndentedString(ignore)).append("\n");
        sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
        sb.append("    antitamper: ").append(toIndentedString(antitamper)).append("\n");
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

