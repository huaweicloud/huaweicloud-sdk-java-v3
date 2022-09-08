package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建误报屏蔽规则请求体
 */
public class CreateIgnoreRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private List<String> domain = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<CreateCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private Integer mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule")

    private String rule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced")

    private List<Advanced> advanced = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateIgnoreRuleRequestBody withDomain(List<String> domain) {
        this.domain = domain;
        return this;
    }

    public CreateIgnoreRuleRequestBody addDomainItem(String domainItem) {
        if (this.domain == null) {
            this.domain = new ArrayList<>();
        }
        this.domain.add(domainItem);
        return this;
    }

    public CreateIgnoreRuleRequestBody withDomain(Consumer<List<String>> domainSetter) {
        if (this.domain == null) {
            this.domain = new ArrayList<>();
        }
        domainSetter.accept(this.domain);
        return this;
    }

    /**
     * 防护域名或防护网站，数组长度为0时，代表规则对全部域名或防护网站生效
     * @return domain
     */
    public List<String> getDomain() {
        return domain;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }

    public CreateIgnoreRuleRequestBody withConditions(List<CreateCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public CreateIgnoreRuleRequestBody addConditionsItem(CreateCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public CreateIgnoreRuleRequestBody withConditions(Consumer<List<CreateCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 条件列表
     * @return conditions
     */
    public List<CreateCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<CreateCondition> conditions) {
        this.conditions = conditions;
    }

    public CreateIgnoreRuleRequestBody withMode(Integer mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 固定值为1,代表v2版本误报屏蔽规则，v1版本仅用于兼容旧版本，不支持创建
     * @return mode
     */
    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public CreateIgnoreRuleRequestBody withRule(String rule) {
        this.rule = rule;
        return this;
    }

    /**
     * 需要屏蔽的规则，可屏蔽一个或者多个，屏蔽多个时使用半角符;分隔   - 当需要屏蔽某一条内置规则时，该参数值为该内置规则id,可以在Web应用防火墙控制台的防护策略->策略名称->Web基础防护的高级设置->防护规则中查询；也可以在防护事件的事件详情中查询内置规则id   - 当需要屏蔽web基础防护某一类规则时，该参数值为需要屏蔽的web基础防护某一类规则名。其中，xss：xxs攻击；webshell：网站木马；vuln：其他类型攻击；sqli：sql注入攻击；robot：恶意爬虫；rfi：远程文件包含；lfi：本地文件包含；cmdi：命令注入攻击   - 当需要屏蔽Web基础防护模块，该参数值为：all   - 当需要屏蔽规则为所有检测模块时，该参数值为：bypass
     * @return rule
     */
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public CreateIgnoreRuleRequestBody withAdvanced(List<Advanced> advanced) {
        this.advanced = advanced;
        return this;
    }

    public CreateIgnoreRuleRequestBody addAdvancedItem(Advanced advancedItem) {
        if (this.advanced == null) {
            this.advanced = new ArrayList<>();
        }
        this.advanced.add(advancedItem);
        return this;
    }

    public CreateIgnoreRuleRequestBody withAdvanced(Consumer<List<Advanced>> advancedSetter) {
        if (this.advanced == null) {
            this.advanced = new ArrayList<>();
        }
        advancedSetter.accept(this.advanced);
        return this;
    }

    /**
     * 高级配置项
     * @return advanced
     */
    public List<Advanced> getAdvanced() {
        return advanced;
    }

    public void setAdvanced(List<Advanced> advanced) {
        this.advanced = advanced;
    }

    public CreateIgnoreRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 屏蔽规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateIgnoreRuleRequestBody createIgnoreRuleRequestBody = (CreateIgnoreRuleRequestBody) o;
        return Objects.equals(this.domain, createIgnoreRuleRequestBody.domain)
            && Objects.equals(this.conditions, createIgnoreRuleRequestBody.conditions)
            && Objects.equals(this.mode, createIgnoreRuleRequestBody.mode)
            && Objects.equals(this.rule, createIgnoreRuleRequestBody.rule)
            && Objects.equals(this.advanced, createIgnoreRuleRequestBody.advanced)
            && Objects.equals(this.description, createIgnoreRuleRequestBody.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, conditions, mode, rule, advanced, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIgnoreRuleRequestBody {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
