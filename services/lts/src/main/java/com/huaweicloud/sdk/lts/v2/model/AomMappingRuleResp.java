package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AomMappingRuleResp
 */
public class AomMappingRuleResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_info")

    private AomMappingRuleInfo ruleInfo;

    public AomMappingRuleResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AomMappingRuleResp withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 接入规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public AomMappingRuleResp withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 接入规则id
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public AomMappingRuleResp withRuleInfo(AomMappingRuleInfo ruleInfo) {
        this.ruleInfo = ruleInfo;
        return this;
    }

    public AomMappingRuleResp withRuleInfo(Consumer<AomMappingRuleInfo> ruleInfoSetter) {
        if (this.ruleInfo == null) {
            this.ruleInfo = new AomMappingRuleInfo();
            ruleInfoSetter.accept(this.ruleInfo);
        }

        return this;
    }

    /**
     * Get ruleInfo
     * @return ruleInfo
     */
    public AomMappingRuleInfo getRuleInfo() {
        return ruleInfo;
    }

    public void setRuleInfo(AomMappingRuleInfo ruleInfo) {
        this.ruleInfo = ruleInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AomMappingRuleResp aomMappingRuleResp = (AomMappingRuleResp) o;
        return Objects.equals(this.projectId, aomMappingRuleResp.projectId)
            && Objects.equals(this.ruleName, aomMappingRuleResp.ruleName)
            && Objects.equals(this.ruleId, aomMappingRuleResp.ruleId)
            && Objects.equals(this.ruleInfo, aomMappingRuleResp.ruleInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, ruleName, ruleId, ruleInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AomMappingRuleResp {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleInfo: ").append(toIndentedString(ruleInfo)).append("\n");
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
