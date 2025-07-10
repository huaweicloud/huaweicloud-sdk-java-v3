package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 规则引擎配置内容 **约束限制：** 不涉及
 */
public class CreateRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private Conditions conditions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<Actions> actions = null;

    public CreateRuleRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 规则名称 **约束限制：** 不涉及 **取值范围：** 1-50个字符 **默认取值：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRuleRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 是否开启规则 **约束限制：** 不涉及 **取值范围：** - on: 开启 - off: 关闭 **默认取值：** 不涉及
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateRuleRequest withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释：** 规则的优先级，数值越大，优先级越高 **约束限制：** 优先级不能重复 **取值范围：** 1-100 **默认取值：** 不涉及
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public CreateRuleRequest withConditions(Conditions conditions) {
        this.conditions = conditions;
        return this;
    }

    public CreateRuleRequest withConditions(Consumer<Conditions> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new Conditions();
            conditionsSetter.accept(this.conditions);
        }

        return this;
    }

    /**
     * Get conditions
     * @return conditions
     */
    public Conditions getConditions() {
        return conditions;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public CreateRuleRequest withActions(List<Actions> actions) {
        this.actions = actions;
        return this;
    }

    public CreateRuleRequest addActionsItem(Actions actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public CreateRuleRequest withActions(Consumer<List<Actions>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * **参数解释：** 满足规则条件后执行的动作 **约束限制：** 不涉及
     * @return actions
     */
    public List<Actions> getActions() {
        return actions;
    }

    public void setActions(List<Actions> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRuleRequest that = (CreateRuleRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.conditions, that.conditions)
            && Objects.equals(this.actions, that.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, priority, conditions, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRuleRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
