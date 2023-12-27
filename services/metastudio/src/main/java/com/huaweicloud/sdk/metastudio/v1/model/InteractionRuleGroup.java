package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 互动规则库信息
 */
public class InteractionRuleGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interaction_rules")

    private List<InteractionRuleInfo> interactionRules = null;

    public InteractionRuleGroup withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 互动规则库名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public InteractionRuleGroup withInteractionRules(List<InteractionRuleInfo> interactionRules) {
        this.interactionRules = interactionRules;
        return this;
    }

    public InteractionRuleGroup addInteractionRulesItem(InteractionRuleInfo interactionRulesItem) {
        if (this.interactionRules == null) {
            this.interactionRules = new ArrayList<>();
        }
        this.interactionRules.add(interactionRulesItem);
        return this;
    }

    public InteractionRuleGroup withInteractionRules(Consumer<List<InteractionRuleInfo>> interactionRulesSetter) {
        if (this.interactionRules == null) {
            this.interactionRules = new ArrayList<>();
        }
        interactionRulesSetter.accept(this.interactionRules);
        return this;
    }

    /**
     * 互动规则列表
     * @return interactionRules
     */
    public List<InteractionRuleInfo> getInteractionRules() {
        return interactionRules;
    }

    public void setInteractionRules(List<InteractionRuleInfo> interactionRules) {
        this.interactionRules = interactionRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InteractionRuleGroup that = (InteractionRuleGroup) obj;
        return Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.interactionRules, that.interactionRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, interactionRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteractionRuleGroup {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    interactionRules: ").append(toIndentedString(interactionRules)).append("\n");
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
