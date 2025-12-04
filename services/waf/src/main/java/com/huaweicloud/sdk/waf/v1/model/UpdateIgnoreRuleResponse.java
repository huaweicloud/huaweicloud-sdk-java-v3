package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateIgnoreRuleResponse extends SdkResponse {

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
    @JsonProperty(value = "mode")

    private Integer mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_logic")

    private String urlLogic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<Condition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced")

    private IgnoreAdvanced advanced;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private List<String> domain = null;

    public UpdateIgnoreRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateIgnoreRuleResponse withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * 策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public UpdateIgnoreRuleResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建规则的时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public UpdateIgnoreRuleResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateIgnoreRuleResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 规则状态标识，用于指定规则的启用或关闭状态 **约束限制：** 不涉及 **取值范围：**  - 0：关闭  - 1：开启 **默认取值：** 不涉及
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UpdateIgnoreRuleResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 误报规则屏蔽路径，仅在mode为0的状态下有该字段
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UpdateIgnoreRuleResponse withRule(String rule) {
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

    public UpdateIgnoreRuleResponse withMode(Integer mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 版本号，0代表v1旧版本，1代表v2新版本；mode为0时，不存在conditions字段，存在url和url_logic字段；mode为1时，不存在url和url_logic字段，存在conditions字段
     * @return mode
     */
    public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public UpdateIgnoreRuleResponse withUrlLogic(String urlLogic) {
        this.urlLogic = urlLogic;
        return this;
    }

    /**
     * url匹配逻辑
     * @return urlLogic
     */
    public String getUrlLogic() {
        return urlLogic;
    }

    public void setUrlLogic(String urlLogic) {
        this.urlLogic = urlLogic;
    }

    public UpdateIgnoreRuleResponse withConditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public UpdateIgnoreRuleResponse addConditionsItem(Condition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public UpdateIgnoreRuleResponse withConditions(Consumer<List<Condition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 条件
     * @return conditions
     */
    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public UpdateIgnoreRuleResponse withAdvanced(IgnoreAdvanced advanced) {
        this.advanced = advanced;
        return this;
    }

    public UpdateIgnoreRuleResponse withAdvanced(Consumer<IgnoreAdvanced> advancedSetter) {
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

    public UpdateIgnoreRuleResponse withDomain(List<String> domain) {
        this.domain = domain;
        return this;
    }

    public UpdateIgnoreRuleResponse addDomainItem(String domainItem) {
        if (this.domain == null) {
            this.domain = new ArrayList<>();
        }
        this.domain.add(domainItem);
        return this;
    }

    public UpdateIgnoreRuleResponse withDomain(Consumer<List<String>> domainSetter) {
        if (this.domain == null) {
            this.domain = new ArrayList<>();
        }
        domainSetter.accept(this.domain);
        return this;
    }

    /**
     * 防护域名或防护网站
     * @return domain
     */
    public List<String> getDomain() {
        return domain;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIgnoreRuleResponse that = (UpdateIgnoreRuleResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.policyid, that.policyid)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.url, that.url)
            && Objects.equals(this.rule, that.rule) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.urlLogic, that.urlLogic) && Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.advanced, that.advanced) && Objects.equals(this.domain, that.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            policyid,
            timestamp,
            description,
            status,
            url,
            rule,
            mode,
            urlLogic,
            conditions,
            advanced,
            domain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIgnoreRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    urlLogic: ").append(toIndentedString(urlLogic)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
