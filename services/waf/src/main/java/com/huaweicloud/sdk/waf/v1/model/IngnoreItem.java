package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** IngnoreItem */
public class IngnoreItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private String rule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private List<String> domain = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_logic")

    private String urlLogic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced")

    private Advance advanced;

    public IngnoreItem withId(String id) {
        this.id = id;
        return this;
    }

    /** 规则id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IngnoreItem withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /** 策略id
     * 
     * @return policyid */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public IngnoreItem withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /** 创建规则的时间戳
     * 
     * @return timestamp */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public IngnoreItem withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 规则描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IngnoreItem withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 状态（0：关闭，1：开启）
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public IngnoreItem withUrl(String url) {
        this.url = url;
        return this;
    }

    /** 防篡改规则防护的url，需要填写标准的url格式，例如/admin/xxx或者/admin/_*,以\"*\"号结尾代表路径前缀
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public IngnoreItem withRule(String rule) {
        this.rule = rule;
        return this;
    }

    /** 屏蔽的规则，可以是命中规则id，对应防护事件的命中规则；或者所有规则（所有规则：all）；或者攻击类型枚举（XSS攻击：xss，sqli，命令注入：cmdi，恶意爬虫：robot，本地文件包含：lfi，远程文件包含：rfi，网站木马：webshell，cc攻击：cc，精准防护：custom_custom，IP黑白名单：custom_whiteblackip，地理位置访问控制：custom_geoip，防篡改：antitamper，反爬虫：anticrawler，网站信息防泄漏：leakage，非法请求：illegal，其它类型攻击：vuln）
     * 
     * @return rule */
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public IngnoreItem withDomain(List<String> domain) {
        this.domain = domain;
        return this;
    }

    public IngnoreItem addDomainItem(String domainItem) {
        if (this.domain == null) {
            this.domain = new ArrayList<>();
        }
        this.domain.add(domainItem);
        return this;
    }

    public IngnoreItem withDomain(Consumer<List<String>> domainSetter) {
        if (this.domain == null) {
            this.domain = new ArrayList<>();
        }
        domainSetter.accept(this.domain);
        return this;
    }

    /** 防护的域名
     * 
     * @return domain */
    public List<String> getDomain() {
        return domain;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }

    public IngnoreItem withUrlLogic(String urlLogic) {
        this.urlLogic = urlLogic;
        return this;
    }

    /** url匹配逻辑（prefix：前缀匹配，equal：全等）
     * 
     * @return urlLogic */
    public String getUrlLogic() {
        return urlLogic;
    }

    public void setUrlLogic(String urlLogic) {
        this.urlLogic = urlLogic;
    }

    public IngnoreItem withAdvanced(Advance advanced) {
        this.advanced = advanced;
        return this;
    }

    public IngnoreItem withAdvanced(Consumer<Advance> advancedSetter) {
        if (this.advanced == null) {
            this.advanced = new Advance();
            advancedSetter.accept(this.advanced);
        }

        return this;
    }

    /** Get advanced
     * 
     * @return advanced */
    public Advance getAdvanced() {
        return advanced;
    }

    public void setAdvanced(Advance advanced) {
        this.advanced = advanced;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IngnoreItem ingnoreItem = (IngnoreItem) o;
        return Objects.equals(this.id, ingnoreItem.id) && Objects.equals(this.policyid, ingnoreItem.policyid)
            && Objects.equals(this.timestamp, ingnoreItem.timestamp)
            && Objects.equals(this.description, ingnoreItem.description)
            && Objects.equals(this.status, ingnoreItem.status) && Objects.equals(this.url, ingnoreItem.url)
            && Objects.equals(this.rule, ingnoreItem.rule) && Objects.equals(this.domain, ingnoreItem.domain)
            && Objects.equals(this.urlLogic, ingnoreItem.urlLogic)
            && Objects.equals(this.advanced, ingnoreItem.advanced);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, policyid, timestamp, description, status, url, rule, domain, urlLogic, advanced);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IngnoreItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    urlLogic: ").append(toIndentedString(urlLogic)).append("\n");
        sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
