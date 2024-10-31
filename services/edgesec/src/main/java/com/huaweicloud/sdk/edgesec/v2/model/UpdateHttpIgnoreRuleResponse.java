package com.huaweicloud.sdk.edgesec.v2.model;

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
public class UpdateHttpIgnoreRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_num")

    private Integer hitNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clear_time")

    private Long clearTime;

    public UpdateHttpIgnoreRuleResponse withId(String id) {
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

    public UpdateHttpIgnoreRuleResponse withName(String name) {
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

    public UpdateHttpIgnoreRuleResponse withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 规则所在策略id
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdateHttpIgnoreRuleResponse withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 规则所在策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public UpdateHttpIgnoreRuleResponse withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建规则时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public UpdateHttpIgnoreRuleResponse withDescription(String description) {
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

    public UpdateHttpIgnoreRuleResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 规则开关状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UpdateHttpIgnoreRuleResponse withUrl(String url) {
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

    public UpdateHttpIgnoreRuleResponse withRule(String rule) {
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

    public UpdateHttpIgnoreRuleResponse withMode(Integer mode) {
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

    public UpdateHttpIgnoreRuleResponse withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public UpdateHttpIgnoreRuleResponse addDomainsItem(String domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public UpdateHttpIgnoreRuleResponse withDomains(Consumer<List<String>> domainsSetter) {
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

    public UpdateHttpIgnoreRuleResponse withUrlLogic(String urlLogic) {
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

    public UpdateHttpIgnoreRuleResponse withAdvanced(HttpIgnoreRuleCondition advanced) {
        this.advanced = advanced;
        return this;
    }

    public UpdateHttpIgnoreRuleResponse withAdvanced(Consumer<HttpIgnoreRuleCondition> advancedSetter) {
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

    public UpdateHttpIgnoreRuleResponse withConditions(List<HttpIgnoreRuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public UpdateHttpIgnoreRuleResponse addConditionsItem(HttpIgnoreRuleCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public UpdateHttpIgnoreRuleResponse withConditions(Consumer<List<HttpIgnoreRuleCondition>> conditionsSetter) {
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

    public UpdateHttpIgnoreRuleResponse withHitNum(Integer hitNum) {
        this.hitNum = hitNum;
        return this;
    }

    /**
     * 命中次数
     * @return hitNum
     */
    public Integer getHitNum() {
        return hitNum;
    }

    public void setHitNum(Integer hitNum) {
        this.hitNum = hitNum;
    }

    public UpdateHttpIgnoreRuleResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 最后更新时间戳
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateHttpIgnoreRuleResponse withClearTime(Long clearTime) {
        this.clearTime = clearTime;
        return this;
    }

    /**
     * 上一次命中次数清零时间戳
     * @return clearTime
     */
    public Long getClearTime() {
        return clearTime;
    }

    public void setClearTime(Long clearTime) {
        this.clearTime = clearTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHttpIgnoreRuleResponse that = (UpdateHttpIgnoreRuleResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.url, that.url)
            && Objects.equals(this.rule, that.rule) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.domains, that.domains) && Objects.equals(this.urlLogic, that.urlLogic)
            && Objects.equals(this.advanced, that.advanced) && Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.hitNum, that.hitNum) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.clearTime, that.clearTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            policyId,
            policyName,
            timestamp,
            description,
            status,
            url,
            rule,
            mode,
            domains,
            urlLogic,
            advanced,
            conditions,
            hitNum,
            updateTime,
            clearTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHttpIgnoreRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    urlLogic: ").append(toIndentedString(urlLogic)).append("\n");
        sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    hitNum: ").append(toIndentedString(hitNum)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    clearTime: ").append(toIndentedString(clearTime)).append("\n");
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
