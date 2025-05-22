package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 异常规则信息对象。 **取值范围**： 不涉及。
 */
public class ExceptRuleBo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queues")

    private List<String> queues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "except_rules")

    private Map<String, String> exceptRules = null;

    public ExceptRuleBo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 规则名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExceptRuleBo withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**： 触发异常规则操作。 **取值范围**： 不涉及。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ExceptRuleBo withQueues(List<String> queues) {
        this.queues = queues;
        return this;
    }

    public ExceptRuleBo addQueuesItem(String queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public ExceptRuleBo withQueues(Consumer<List<String>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * **参数解释**： 异常规则绑定的资源池名称列表。 **取值范围**： 不涉及。
     * @return queues
     */
    public List<String> getQueues() {
        return queues;
    }

    public void setQueues(List<String> queues) {
        this.queues = queues;
    }

    public ExceptRuleBo withExceptRules(Map<String, String> exceptRules) {
        this.exceptRules = exceptRules;
        return this;
    }

    public ExceptRuleBo putExceptRulesItem(String key, String exceptRulesItem) {
        if (this.exceptRules == null) {
            this.exceptRules = new HashMap<>();
        }
        this.exceptRules.put(key, exceptRulesItem);
        return this;
    }

    public ExceptRuleBo withExceptRules(Consumer<Map<String, String>> exceptRulesSetter) {
        if (this.exceptRules == null) {
            this.exceptRules = new HashMap<>();
        }
        exceptRulesSetter.accept(this.exceptRules);
        return this;
    }

    /**
     * **参数解释**： 异常规则配置项。 **取值范围**： 不涉及。
     * @return exceptRules
     */
    public Map<String, String> getExceptRules() {
        return exceptRules;
    }

    public void setExceptRules(Map<String, String> exceptRules) {
        this.exceptRules = exceptRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExceptRuleBo that = (ExceptRuleBo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.action, that.action)
            && Objects.equals(this.queues, that.queues) && Objects.equals(this.exceptRules, that.exceptRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, action, queues, exceptRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExceptRuleBo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
        sb.append("    exceptRules: ").append(toIndentedString(exceptRules)).append("\n");
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
