package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规则请求结构体
 */
public class Rule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_group")

    @JacksonXmlProperty(localName = "condition_group")

    private ConditionGroup conditionGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    @JacksonXmlProperty(localName = "actions")

    private List<RuleAction> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    @JacksonXmlProperty(localName = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    @JacksonXmlProperty(localName = "app_id")

    private String appId;

    public Rule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数说明**：规则名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：规则的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Rule withConditionGroup(ConditionGroup conditionGroup) {
        this.conditionGroup = conditionGroup;
        return this;
    }

    public Rule withConditionGroup(Consumer<ConditionGroup> conditionGroupSetter) {
        if (this.conditionGroup == null) {
            this.conditionGroup = new ConditionGroup();
            conditionGroupSetter.accept(this.conditionGroup);
        }

        return this;
    }

    /**
     * Get conditionGroup
     * @return conditionGroup
     */
    public ConditionGroup getConditionGroup() {
        return conditionGroup;
    }

    public void setConditionGroup(ConditionGroup conditionGroup) {
        this.conditionGroup = conditionGroup;
    }

    public Rule withActions(List<RuleAction> actions) {
        this.actions = actions;
        return this;
    }

    public Rule addActionsItem(RuleAction actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public Rule withActions(Consumer<List<RuleAction>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数说明**：规则的动作列表，单个规则最多支持设置10个动作。
     * @return actions
     */
    public List<RuleAction> getActions() {
        return actions;
    }

    public void setActions(List<RuleAction> actions) {
        this.actions = actions;
    }

    public Rule withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * **参数说明**：规则的类型。 **取值范围**： - DEVICE_LINKAGE：设备联动。 - DATA_FORWARDING：数据转发。 - EDGE：边缘侧。
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public Rule withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：规则的状态，默认值：active。 **取值范围**： - active：激活。 - inactive：未激活。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Rule withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * **参数说明**：资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定创建的规则归属到哪个资源空间下，否则创建的规则将会归属到[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)下。 **取值范围**：长度不超过36，只允许字母、数字、下划线（_）、连接符（-）的组合。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rule rule = (Rule) o;
        return Objects.equals(this.name, rule.name) && Objects.equals(this.description, rule.description)
            && Objects.equals(this.conditionGroup, rule.conditionGroup) && Objects.equals(this.actions, rule.actions)
            && Objects.equals(this.ruleType, rule.ruleType) && Objects.equals(this.status, rule.status)
            && Objects.equals(this.appId, rule.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, conditionGroup, actions, ruleType, status, appId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rule {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    conditionGroup: ").append(toIndentedString(conditionGroup)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
