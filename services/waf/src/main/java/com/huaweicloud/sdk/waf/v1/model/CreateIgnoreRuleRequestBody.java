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

    private IgnoreAdvanced advanced;

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
     * 防护域名或防护网站，数组长度为0时，代表规则对全部域名或防护网站生效。当防护域名的接入模式为云模式-ELB接入时，该参数需以<域名>:\\<id\\>格式填写（如www.example.com:b061fb5b-8ea0-4357-b0f4-cb6178ab378a），若域名绑定的负载均衡器（ELB）下所有监听器都接入WAF防护，填入的id为负载均衡器（ELB）id，否则填入的id为指定监听器id；可通过ShowPremiumHost接口查询与该域名绑定的ELB实例id，在帮助中心-ELB服务-API文档下查询监听器id
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
     * **参数解释：** 需要屏蔽的规则 **约束限制：** 参数值根据\"不检测模块\"变化 **取值范围：** 不检测模块: - 所有模块: bypass - Web基础防护模块按照规则类型划分:   - ID: 内置规则id，通过ListWebBasicProtectionRules接口获取ID，多个id以分号;分隔，比如：\"000000;111111\"   - 类别: 多个类型以分号;分隔，比如：\"xss;webshell\"     - xss：XSS攻击     - webshell：网站木马     - vuln：其他类型攻击     - sqli：SQL注入攻击     - robot：恶意爬虫     - rfi：远程文件包含     - lfi：本地文件包含     - cmdi：命令注入攻击   - 所有内置规则 - 非法请求: illegal **默认取值：** 不涉及
     * @return rule
     */
    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public CreateIgnoreRuleRequestBody withAdvanced(IgnoreAdvanced advanced) {
        this.advanced = advanced;
        return this;
    }

    public CreateIgnoreRuleRequestBody withAdvanced(Consumer<IgnoreAdvanced> advancedSetter) {
        if (this.advanced == null) {
            this.advanced = new IgnoreAdvanced();
            advancedSetter.accept(this.advanced);
        }

        return this;
    }

    /**
     * Get advanced
     * @return advanced
     */
    public IgnoreAdvanced getAdvanced() {
        return advanced;
    }

    public void setAdvanced(IgnoreAdvanced advanced) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateIgnoreRuleRequestBody that = (CreateIgnoreRuleRequestBody) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.rule, that.rule)
            && Objects.equals(this.advanced, that.advanced) && Objects.equals(this.description, that.description);
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
