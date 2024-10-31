package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateHttpIgnoreRuleRequestBody
 */
public class CreateHttpIgnoreRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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

    public CreateHttpIgnoreRuleRequestBody withName(String name) {
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

    public CreateHttpIgnoreRuleRequestBody withDescription(String description) {
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

    public CreateHttpIgnoreRuleRequestBody withUrl(String url) {
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

    public CreateHttpIgnoreRuleRequestBody withRule(String rule) {
        this.rule = rule;
        return this;
    }

    /**
     * 规则编号
     * @return rule
     */
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public CreateHttpIgnoreRuleRequestBody withMode(Integer mode) {
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

    public CreateHttpIgnoreRuleRequestBody withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public CreateHttpIgnoreRuleRequestBody addDomainsItem(String domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public CreateHttpIgnoreRuleRequestBody withDomains(Consumer<List<String>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 域名列表
     * @return domains
     */
    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public CreateHttpIgnoreRuleRequestBody withUrlLogic(String urlLogic) {
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

    public CreateHttpIgnoreRuleRequestBody withAdvanced(HttpIgnoreRuleCondition advanced) {
        this.advanced = advanced;
        return this;
    }

    public CreateHttpIgnoreRuleRequestBody withAdvanced(Consumer<HttpIgnoreRuleCondition> advancedSetter) {
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

    public CreateHttpIgnoreRuleRequestBody withConditions(List<HttpIgnoreRuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public CreateHttpIgnoreRuleRequestBody addConditionsItem(HttpIgnoreRuleCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public CreateHttpIgnoreRuleRequestBody withConditions(Consumer<List<HttpIgnoreRuleCondition>> conditionsSetter) {
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
        CreateHttpIgnoreRuleRequestBody that = (CreateHttpIgnoreRuleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.url, that.url) && Objects.equals(this.rule, that.rule)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.domains, that.domains)
            && Objects.equals(this.urlLogic, that.urlLogic) && Objects.equals(this.advanced, that.advanced)
            && Objects.equals(this.conditions, that.conditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, url, rule, mode, domains, urlLogic, advanced, conditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHttpIgnoreRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
