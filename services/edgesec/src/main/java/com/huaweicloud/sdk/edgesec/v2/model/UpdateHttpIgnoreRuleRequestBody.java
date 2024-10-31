package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateHttpIgnoreRuleRequestBody
 */
public class UpdateHttpIgnoreRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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
    @JsonProperty(value = "mode")

    private Integer mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<String> domains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_logic")

    private String urlLogic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced")

    private HttpIgnoreRuleCondition advanced;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<HttpIgnoreRuleCondition> conditions = null;

    public UpdateHttpIgnoreRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateHttpIgnoreRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述，最长512字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateHttpIgnoreRuleRequestBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 规则开关状态
     * minimum: 0
     * maximum: 1
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UpdateHttpIgnoreRuleRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 误报路径
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UpdateHttpIgnoreRuleRequestBody withRule(String rule) {
        this.rule = rule;
        return this;
    }

    /**
     * 需要屏蔽的规则，可屏蔽一个或者多个，屏蔽多个时使用半角符;分隔   - 当需要屏蔽某一条内置规则时，该参数值为该内置规则id,可以在Web应用防火墙控制台的防护策略->策略名称->Web基础防护的高级设置->防护规则中查询；也可以在防护事件的事件详情中查询内置规则id   - 当需要屏蔽web基础防护某一类规则时，该参数值为需要屏蔽的web基础防护某一类规则名。其中，xss：xss攻击；webshell：网站木马；vuln：其他类型攻击；sqli：sql注入攻击；robot：恶意爬虫；rfi：远程文件包含；lfi：本地文件包含；cmdi：命令注入攻击   - 当需要屏蔽Web基础防护模块，该参数值为：all   - 当需要屏蔽规则为所有检测模块时，该参数值为：bypass
     * @return rule
     */
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public UpdateHttpIgnoreRuleRequestBody withMode(Integer mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 误报屏蔽模式，默认为0即旧模式
     * minimum: 0
     * @return mode
     */
    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public UpdateHttpIgnoreRuleRequestBody withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public UpdateHttpIgnoreRuleRequestBody addDomainsItem(String domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public UpdateHttpIgnoreRuleRequestBody withDomains(Consumer<List<String>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 防护域名或防护网站，数组长度为0时，代表规则对全部域名或防护网站生效
     * @return domains
     */
    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public UpdateHttpIgnoreRuleRequestBody withUrlLogic(String urlLogic) {
        this.urlLogic = urlLogic;
        return this;
    }

    /**
     * 屏蔽规则url类型（前缀：prefix，等于：equal）
     * @return urlLogic
     */
    public String getUrlLogic() {
        return urlLogic;
    }

    public void setUrlLogic(String urlLogic) {
        this.urlLogic = urlLogic;
    }

    public UpdateHttpIgnoreRuleRequestBody withAdvanced(HttpIgnoreRuleCondition advanced) {
        this.advanced = advanced;
        return this;
    }

    public UpdateHttpIgnoreRuleRequestBody withAdvanced(Consumer<HttpIgnoreRuleCondition> advancedSetter) {
        if (this.advanced == null) {
            this.advanced = new HttpIgnoreRuleCondition();
            advancedSetter.accept(this.advanced);
        }

        return this;
    }

    /**
     * Get advanced
     * @return advanced
     */
    public HttpIgnoreRuleCondition getAdvanced() {
        return advanced;
    }

    public void setAdvanced(HttpIgnoreRuleCondition advanced) {
        this.advanced = advanced;
    }

    public UpdateHttpIgnoreRuleRequestBody withConditions(List<HttpIgnoreRuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public UpdateHttpIgnoreRuleRequestBody addConditionsItem(HttpIgnoreRuleCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public UpdateHttpIgnoreRuleRequestBody withConditions(Consumer<List<HttpIgnoreRuleCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 命中条件
     * @return conditions
     */
    public List<HttpIgnoreRuleCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<HttpIgnoreRuleCondition> conditions) {
        this.conditions = conditions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHttpIgnoreRuleRequestBody that = (UpdateHttpIgnoreRuleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.url, that.url)
            && Objects.equals(this.rule, that.rule) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.domains, that.domains) && Objects.equals(this.urlLogic, that.urlLogic)
            && Objects.equals(this.advanced, that.advanced) && Objects.equals(this.conditions, that.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, status, url, rule, mode, domains, urlLogic, advanced, conditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHttpIgnoreRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    urlLogic: ").append(toIndentedString(urlLogic)).append("\n");
        sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
