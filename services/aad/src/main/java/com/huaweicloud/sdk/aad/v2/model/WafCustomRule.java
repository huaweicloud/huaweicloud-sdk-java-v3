package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WafCustomRule
 */
public class WafCustomRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Boolean time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Long start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal")

    private Long terminal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<WafCustomCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private WafCustomRuleAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overseas_type")

    private Integer overseasType;

    public WafCustomRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WafCustomRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WafCustomRule withTime(Boolean time) {
        this.time = time;
        return this;
    }

    /**
     * 精准防护规则生效时间。true-自定义生效时间，false-立即生效
     * @return time
     */
    public Boolean getTime() {
        return time;
    }

    public void setTime(Boolean time) {
        this.time = time;
    }

    public WafCustomRule withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * 精准防护规则生效的起始时间戳（秒）
     * @return start
     */
    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public WafCustomRule withTerminal(Long terminal) {
        this.terminal = terminal;
        return this;
    }

    /**
     * 精准防护规则生效的终止时间戳（秒）
     * @return terminal
     */
    public Long getTerminal() {
        return terminal;
    }

    public void setTerminal(Long terminal) {
        this.terminal = terminal;
    }

    public WafCustomRule withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 执行该规则的优先级，值越小，优先级越高。取值范围：0到1000。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public WafCustomRule withConditions(List<WafCustomCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public WafCustomRule addConditionsItem(WafCustomCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public WafCustomRule withConditions(Consumer<List<WafCustomCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * condition
     * @return conditions
     */
    public List<WafCustomCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<WafCustomCondition> conditions) {
        this.conditions = conditions;
    }

    public WafCustomRule withAction(WafCustomRuleAction action) {
        this.action = action;
        return this;
    }

    public WafCustomRule withAction(Consumer<WafCustomRuleAction> actionSetter) {
        if (this.action == null) {
            this.action = new WafCustomRuleAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public WafCustomRuleAction getAction() {
        return action;
    }

    public void setAction(WafCustomRuleAction action) {
        this.action = action;
    }

    public WafCustomRule withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public WafCustomRule withOverseasType(Integer overseasType) {
        this.overseasType = overseasType;
        return this;
    }

    /**
     * 防护区域，0-大陆，1-海外
     * @return overseasType
     */
    public Integer getOverseasType() {
        return overseasType;
    }

    public void setOverseasType(Integer overseasType) {
        this.overseasType = overseasType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WafCustomRule that = (WafCustomRule) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.time, that.time) && Objects.equals(this.start, that.start)
            && Objects.equals(this.terminal, that.terminal) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.conditions, that.conditions) && Objects.equals(this.action, that.action)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.overseasType, that.overseasType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, time, start, terminal, priority, conditions, action, domainName, overseasType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WafCustomRule {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    overseasType: ").append(toIndentedString(overseasType)).append("\n");
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
