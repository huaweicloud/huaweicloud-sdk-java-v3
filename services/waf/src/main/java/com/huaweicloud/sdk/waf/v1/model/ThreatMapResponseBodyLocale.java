package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 告警通知里，各个事件类型的描述 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class ThreatMapResponseBodyLocale {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmdi")

    private String cmdi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llm_prompt_injection")

    private String llmPromptInjection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "anticrawler")

    private String anticrawler;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_custom")

    private String customCustom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_bot_river")

    private String thirdBotRiver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "robot")

    private String robot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_idc_ip")

    private String customIdcIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "antiscan_dir_traversal")

    private String antiscanDirTraversal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_bot")

    private String advancedBot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xss")

    private String xss;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "antiscan_high_freq_scan")

    private String antiscanHighFreqScan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webshell")

    private String webshell;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cc")

    private String cc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "botm")

    private String botm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "illegal")

    private String illegal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llm_prompt_sensitive")

    private String llmPromptSensitive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sqli")

    private String sqli;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lfi")

    private String lfi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "antitamper")

    private String antitamper;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_geoip")

    private String customGeoip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rfi")

    private String rfi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuln")

    private String vuln;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "llm_response_sensitive")

    private String llmResponseSensitive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_whiteblackip")

    private String customWhiteblackip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "leakage")

    private String leakage;

    public ThreatMapResponseBodyLocale withCmdi(String cmdi) {
        this.cmdi = cmdi;
        return this;
    }

    /**
     * **参数解释：** 命令注入攻击，攻击者通过注入恶意命令来执行非授权操作 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return cmdi
     */
    public String getCmdi() {
        return cmdi;
    }

    public void setCmdi(String cmdi) {
        this.cmdi = cmdi;
    }

    public ThreatMapResponseBodyLocale withLlmPromptInjection(String llmPromptInjection) {
        this.llmPromptInjection = llmPromptInjection;
        return this;
    }

    /**
     * **参数解释：** 大模型提示词注入攻击，攻击者通过构造特殊输入来篡改AI模型的提示词 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return llmPromptInjection
     */
    public String getLlmPromptInjection() {
        return llmPromptInjection;
    }

    public void setLlmPromptInjection(String llmPromptInjection) {
        this.llmPromptInjection = llmPromptInjection;
    }

    public ThreatMapResponseBodyLocale withAnticrawler(String anticrawler) {
        this.anticrawler = anticrawler;
        return this;
    }

    /**
     * **参数解释：** 网站反爬虫策略，用于阻止自动化程序非法获取网站内容 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return anticrawler
     */
    public String getAnticrawler() {
        return anticrawler;
    }

    public void setAnticrawler(String anticrawler) {
        this.anticrawler = anticrawler;
    }

    public ThreatMapResponseBodyLocale withCustomCustom(String customCustom) {
        this.customCustom = customCustom;
        return this;
    }

    /**
     * **参数解释：** 精准防护，基于特定规则的定制化安全防护策略 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return customCustom
     */
    public String getCustomCustom() {
        return customCustom;
    }

    public void setCustomCustom(String customCustom) {
        this.customCustom = customCustom;
    }

    public ThreatMapResponseBodyLocale withThirdBotRiver(String thirdBotRiver) {
        this.thirdBotRiver = thirdBotRiver;
        return this;
    }

    /**
     * **参数解释：** 第三方BOT，来自第三方服务的自动化交互程序 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return thirdBotRiver
     */
    public String getThirdBotRiver() {
        return thirdBotRiver;
    }

    public void setThirdBotRiver(String thirdBotRiver) {
        this.thirdBotRiver = thirdBotRiver;
    }

    public ThreatMapResponseBodyLocale withRobot(String robot) {
        this.robot = robot;
        return this;
    }

    /**
     * **参数解释：** 恶意爬虫，用于非法获取数据或进行攻击的自动化程序 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return robot
     */
    public String getRobot() {
        return robot;
    }

    public void setRobot(String robot) {
        this.robot = robot;
    }

    public ThreatMapResponseBodyLocale withCustomIdcIp(String customIdcIp) {
        this.customIdcIp = customIdcIp;
        return this;
    }

    /**
     * **参数解释：** IDC情报，基于数据中心IP地址的威胁情报 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return customIdcIp
     */
    public String getCustomIdcIp() {
        return customIdcIp;
    }

    public void setCustomIdcIp(String customIdcIp) {
        this.customIdcIp = customIdcIp;
    }

    public ThreatMapResponseBodyLocale withAntiscanDirTraversal(String antiscanDirTraversal) {
        this.antiscanDirTraversal = antiscanDirTraversal;
        return this;
    }

    /**
     * **参数解释：** 目录遍历防护，防止攻击者通过目录遍历访问系统文件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return antiscanDirTraversal
     */
    public String getAntiscanDirTraversal() {
        return antiscanDirTraversal;
    }

    public void setAntiscanDirTraversal(String antiscanDirTraversal) {
        this.antiscanDirTraversal = antiscanDirTraversal;
    }

    public ThreatMapResponseBodyLocale withAdvancedBot(String advancedBot) {
        this.advancedBot = advancedBot;
        return this;
    }

    /**
     * **参数解释：** 高级BOT，具有复杂行为模式的自动化程序 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return advancedBot
     */
    public String getAdvancedBot() {
        return advancedBot;
    }

    public void setAdvancedBot(String advancedBot) {
        this.advancedBot = advancedBot;
    }

    public ThreatMapResponseBodyLocale withXss(String xss) {
        this.xss = xss;
        return this;
    }

    /**
     * **参数解释：** XSS攻击，跨站脚本攻击，攻击者通过注入恶意脚本获取用户信息 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return xss
     */
    public String getXss() {
        return xss;
    }

    public void setXss(String xss) {
        this.xss = xss;
    }

    public ThreatMapResponseBodyLocale withAntiscanHighFreqScan(String antiscanHighFreqScan) {
        this.antiscanHighFreqScan = antiscanHighFreqScan;
        return this;
    }

    /**
     * **参数解释：** 高频扫描封锁，对异常高频请求进行识别和拦截 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return antiscanHighFreqScan
     */
    public String getAntiscanHighFreqScan() {
        return antiscanHighFreqScan;
    }

    public void setAntiscanHighFreqScan(String antiscanHighFreqScan) {
        this.antiscanHighFreqScan = antiscanHighFreqScan;
    }

    public ThreatMapResponseBodyLocale withWebshell(String webshell) {
        this.webshell = webshell;
        return this;
    }

    /**
     * **参数解释：** 网站木马，攻击者上传的用于远程控制网站的恶意程序 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return webshell
     */
    public String getWebshell() {
        return webshell;
    }

    public void setWebshell(String webshell) {
        this.webshell = webshell;
    }

    public ThreatMapResponseBodyLocale withCc(String cc) {
        this.cc = cc;
        return this;
    }

    /**
     * **参数解释：** CC攻击，挑战型攻击，通过大量请求耗尽服务器资源 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return cc
     */
    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public ThreatMapResponseBodyLocale withBotm(String botm) {
        this.botm = botm;
        return this;
    }

    /**
     * **参数解释：** BOT攻击，利用自动化程序进行的恶意攻击 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return botm
     */
    public String getBotm() {
        return botm;
    }

    public void setBotm(String botm) {
        this.botm = botm;
    }

    public ThreatMapResponseBodyLocale withIllegal(String illegal) {
        this.illegal = illegal;
        return this;
    }

    /**
     * **参数解释：** 非法请求，违反安全策略或业务规则的请求 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return illegal
     */
    public String getIllegal() {
        return illegal;
    }

    public void setIllegal(String illegal) {
        this.illegal = illegal;
    }

    public ThreatMapResponseBodyLocale withLlmPromptSensitive(String llmPromptSensitive) {
        this.llmPromptSensitive = llmPromptSensitive;
        return this;
    }

    /**
     * **参数解释：** 大模型提示词合规检测，识别提示词中的敏感信息 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return llmPromptSensitive
     */
    public String getLlmPromptSensitive() {
        return llmPromptSensitive;
    }

    public void setLlmPromptSensitive(String llmPromptSensitive) {
        this.llmPromptSensitive = llmPromptSensitive;
    }

    public ThreatMapResponseBodyLocale withSqli(String sqli) {
        this.sqli = sqli;
        return this;
    }

    /**
     * **参数解释：** SQL注入，攻击者通过注入恶意SQL语句来获取或篡改数据 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return sqli
     */
    public String getSqli() {
        return sqli;
    }

    public void setSqli(String sqli) {
        this.sqli = sqli;
    }

    public ThreatMapResponseBodyLocale withLfi(String lfi) {
        this.lfi = lfi;
        return this;
    }

    /**
     * **参数解释：** 本地文件包含，攻击者利用漏洞包含本地文件获取信息 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return lfi
     */
    public String getLfi() {
        return lfi;
    }

    public void setLfi(String lfi) {
        this.lfi = lfi;
    }

    public ThreatMapResponseBodyLocale withAntitamper(String antitamper) {
        this.antitamper = antitamper;
        return this;
    }

    /**
     * **参数解释：** 网页防篡改，保护网站内容不被非法修改 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return antitamper
     */
    public String getAntitamper() {
        return antitamper;
    }

    public void setAntitamper(String antitamper) {
        this.antitamper = antitamper;
    }

    public ThreatMapResponseBodyLocale withCustomGeoip(String customGeoip) {
        this.customGeoip = customGeoip;
        return this;
    }

    /**
     * **参数解释：** 地理位置访问控制，基于地理位置的访问限制策略 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return customGeoip
     */
    public String getCustomGeoip() {
        return customGeoip;
    }

    public void setCustomGeoip(String customGeoip) {
        this.customGeoip = customGeoip;
    }

    public ThreatMapResponseBodyLocale withRfi(String rfi) {
        this.rfi = rfi;
        return this;
    }

    /**
     * **参数解释：** 远程文件包含，攻击者利用漏洞包含远程文件执行恶意代码 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return rfi
     */
    public String getRfi() {
        return rfi;
    }

    public void setRfi(String rfi) {
        this.rfi = rfi;
    }

    public ThreatMapResponseBodyLocale withVuln(String vuln) {
        this.vuln = vuln;
        return this;
    }

    /**
     * **参数解释：** 其他类型攻击，未归类的安全漏洞或攻击 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return vuln
     */
    public String getVuln() {
        return vuln;
    }

    public void setVuln(String vuln) {
        this.vuln = vuln;
    }

    public ThreatMapResponseBodyLocale withLlmResponseSensitive(String llmResponseSensitive) {
        this.llmResponseSensitive = llmResponseSensitive;
        return this;
    }

    /**
     * **参数解释：** 大模型响应合规检测，识别AI模型输出中的敏感信息 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return llmResponseSensitive
     */
    public String getLlmResponseSensitive() {
        return llmResponseSensitive;
    }

    public void setLlmResponseSensitive(String llmResponseSensitive) {
        this.llmResponseSensitive = llmResponseSensitive;
    }

    public ThreatMapResponseBodyLocale withCustomWhiteblackip(String customWhiteblackip) {
        this.customWhiteblackip = customWhiteblackip;
        return this;
    }

    /**
     * **参数解释：** IP黑白名单，基于IP地址的访问控制策略 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return customWhiteblackip
     */
    public String getCustomWhiteblackip() {
        return customWhiteblackip;
    }

    public void setCustomWhiteblackip(String customWhiteblackip) {
        this.customWhiteblackip = customWhiteblackip;
    }

    public ThreatMapResponseBodyLocale withLeakage(String leakage) {
        this.leakage = leakage;
        return this;
    }

    /**
     * **参数解释：** 网站信息泄露，敏感信息意外暴露的安全事件 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return leakage
     */
    public String getLeakage() {
        return leakage;
    }

    public void setLeakage(String leakage) {
        this.leakage = leakage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThreatMapResponseBodyLocale that = (ThreatMapResponseBodyLocale) obj;
        return Objects.equals(this.cmdi, that.cmdi) && Objects.equals(this.llmPromptInjection, that.llmPromptInjection)
            && Objects.equals(this.anticrawler, that.anticrawler)
            && Objects.equals(this.customCustom, that.customCustom)
            && Objects.equals(this.thirdBotRiver, that.thirdBotRiver) && Objects.equals(this.robot, that.robot)
            && Objects.equals(this.customIdcIp, that.customIdcIp)
            && Objects.equals(this.antiscanDirTraversal, that.antiscanDirTraversal)
            && Objects.equals(this.advancedBot, that.advancedBot) && Objects.equals(this.xss, that.xss)
            && Objects.equals(this.antiscanHighFreqScan, that.antiscanHighFreqScan)
            && Objects.equals(this.webshell, that.webshell) && Objects.equals(this.cc, that.cc)
            && Objects.equals(this.botm, that.botm) && Objects.equals(this.illegal, that.illegal)
            && Objects.equals(this.llmPromptSensitive, that.llmPromptSensitive) && Objects.equals(this.sqli, that.sqli)
            && Objects.equals(this.lfi, that.lfi) && Objects.equals(this.antitamper, that.antitamper)
            && Objects.equals(this.customGeoip, that.customGeoip) && Objects.equals(this.rfi, that.rfi)
            && Objects.equals(this.vuln, that.vuln)
            && Objects.equals(this.llmResponseSensitive, that.llmResponseSensitive)
            && Objects.equals(this.customWhiteblackip, that.customWhiteblackip)
            && Objects.equals(this.leakage, that.leakage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cmdi,
            llmPromptInjection,
            anticrawler,
            customCustom,
            thirdBotRiver,
            robot,
            customIdcIp,
            antiscanDirTraversal,
            advancedBot,
            xss,
            antiscanHighFreqScan,
            webshell,
            cc,
            botm,
            illegal,
            llmPromptSensitive,
            sqli,
            lfi,
            antitamper,
            customGeoip,
            rfi,
            vuln,
            llmResponseSensitive,
            customWhiteblackip,
            leakage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThreatMapResponseBodyLocale {\n");
        sb.append("    cmdi: ").append(toIndentedString(cmdi)).append("\n");
        sb.append("    llmPromptInjection: ").append(toIndentedString(llmPromptInjection)).append("\n");
        sb.append("    anticrawler: ").append(toIndentedString(anticrawler)).append("\n");
        sb.append("    customCustom: ").append(toIndentedString(customCustom)).append("\n");
        sb.append("    thirdBotRiver: ").append(toIndentedString(thirdBotRiver)).append("\n");
        sb.append("    robot: ").append(toIndentedString(robot)).append("\n");
        sb.append("    customIdcIp: ").append(toIndentedString(customIdcIp)).append("\n");
        sb.append("    antiscanDirTraversal: ").append(toIndentedString(antiscanDirTraversal)).append("\n");
        sb.append("    advancedBot: ").append(toIndentedString(advancedBot)).append("\n");
        sb.append("    xss: ").append(toIndentedString(xss)).append("\n");
        sb.append("    antiscanHighFreqScan: ").append(toIndentedString(antiscanHighFreqScan)).append("\n");
        sb.append("    webshell: ").append(toIndentedString(webshell)).append("\n");
        sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
        sb.append("    botm: ").append(toIndentedString(botm)).append("\n");
        sb.append("    illegal: ").append(toIndentedString(illegal)).append("\n");
        sb.append("    llmPromptSensitive: ").append(toIndentedString(llmPromptSensitive)).append("\n");
        sb.append("    sqli: ").append(toIndentedString(sqli)).append("\n");
        sb.append("    lfi: ").append(toIndentedString(lfi)).append("\n");
        sb.append("    antitamper: ").append(toIndentedString(antitamper)).append("\n");
        sb.append("    customGeoip: ").append(toIndentedString(customGeoip)).append("\n");
        sb.append("    rfi: ").append(toIndentedString(rfi)).append("\n");
        sb.append("    vuln: ").append(toIndentedString(vuln)).append("\n");
        sb.append("    llmResponseSensitive: ").append(toIndentedString(llmResponseSensitive)).append("\n");
        sb.append("    customWhiteblackip: ").append(toIndentedString(customWhiteblackip)).append("\n");
        sb.append("    leakage: ").append(toIndentedString(leakage)).append("\n");
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
