package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateCustomRuleConfigRequestInfo
 */
public class UpdateCustomRuleConfigRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all_host")

    private Boolean isAllHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_rule_value_info")

    private CustomRuleValueInfo customRuleValueInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_ids")

    private List<String> agentIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    public UpdateCustomRuleConfigRequestInfo withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * **参数解释**： 规则名称 **约束限制**： 不涉及 **取值范围**： 字符长度1-64位 **默认取值**： 不涉及 
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public UpdateCustomRuleConfigRequestInfo withIsAllHost(Boolean isAllHost) {
        this.isAllHost = isAllHost;
        return this;
    }

    /**
     * **参数解释**: 是否选择所有主机 **约束限制**: 不涉及 **取值范围**: - true：是 - false：否  **默认取值**: false 
     * @return isAllHost
     */
    public Boolean getIsAllHost() {
        return isAllHost;
    }

    public void setIsAllHost(Boolean isAllHost) {
        this.isAllHost = isAllHost;
    }

    public UpdateCustomRuleConfigRequestInfo withCustomRuleValueInfo(CustomRuleValueInfo customRuleValueInfo) {
        this.customRuleValueInfo = customRuleValueInfo;
        return this;
    }

    public UpdateCustomRuleConfigRequestInfo withCustomRuleValueInfo(
        Consumer<CustomRuleValueInfo> customRuleValueInfoSetter) {
        if (this.customRuleValueInfo == null) {
            this.customRuleValueInfo = new CustomRuleValueInfo();
            customRuleValueInfoSetter.accept(this.customRuleValueInfo);
        }

        return this;
    }

    /**
     * Get customRuleValueInfo
     * @return customRuleValueInfo
     */
    public CustomRuleValueInfo getCustomRuleValueInfo() {
        return customRuleValueInfo;
    }

    public void setCustomRuleValueInfo(CustomRuleValueInfo customRuleValueInfo) {
        this.customRuleValueInfo = customRuleValueInfo;
    }

    public UpdateCustomRuleConfigRequestInfo withAgentIds(List<String> agentIds) {
        this.agentIds = agentIds;
        return this;
    }

    public UpdateCustomRuleConfigRequestInfo addAgentIdsItem(String agentIdsItem) {
        if (this.agentIds == null) {
            this.agentIds = new ArrayList<>();
        }
        this.agentIds.add(agentIdsItem);
        return this;
    }

    public UpdateCustomRuleConfigRequestInfo withAgentIds(Consumer<List<String>> agentIdsSetter) {
        if (this.agentIds == null) {
            this.agentIds = new ArrayList<>();
        }
        agentIdsSetter.accept(this.agentIds);
        return this;
    }

    /**
     * **参数解释**: agent列表 **约束限制**: 不涉及 **取值范围**: 1-1000个agentID **默认取值**: 不涉及 
     * @return agentIds
     */
    public List<String> getAgentIds() {
        return agentIds;
    }

    public void setAgentIds(List<String> agentIds) {
        this.agentIds = agentIds;
    }

    public UpdateCustomRuleConfigRequestInfo withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * **参数解释**： 规则ID **约束限制**： 必填 **取值范围**： 字符长度1-36位 **默认取值**： 不涉及 
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCustomRuleConfigRequestInfo that = (UpdateCustomRuleConfigRequestInfo) obj;
        return Objects.equals(this.ruleName, that.ruleName) && Objects.equals(this.isAllHost, that.isAllHost)
            && Objects.equals(this.customRuleValueInfo, that.customRuleValueInfo)
            && Objects.equals(this.agentIds, that.agentIds) && Objects.equals(this.ruleId, that.ruleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, isAllHost, customRuleValueInfo, agentIds, ruleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCustomRuleConfigRequestInfo {\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    isAllHost: ").append(toIndentedString(isAllHost)).append("\n");
        sb.append("    customRuleValueInfo: ").append(toIndentedString(customRuleValueInfo)).append("\n");
        sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
