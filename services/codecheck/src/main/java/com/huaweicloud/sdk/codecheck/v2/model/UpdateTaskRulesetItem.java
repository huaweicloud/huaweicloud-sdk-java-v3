package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateTaskRulesetItem
 */
public class UpdateTaskRulesetItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_set_id")

    private String ruleSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "if_use")

    private String ifUse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public UpdateTaskRulesetItem withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 规则集语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public UpdateTaskRulesetItem withRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
        return this;
    }

    /**
     * 规则集ID,通过调用ListTaskRuleset接口，根据响应参数中的template_id获得
     * @return ruleSetId
     */
    public String getRuleSetId() {
        return ruleSetId;
    }

    public void setRuleSetId(String ruleSetId) {
        this.ruleSetId = ruleSetId;
    }

    public UpdateTaskRulesetItem withIfUse(String ifUse) {
        this.ifUse = ifUse;
        return this;
    }

    /**
     * 任务语言和规则集的关系是否启用，1是启用，0是未启用
     * @return ifUse
     */
    public String getIfUse() {
        return ifUse;
    }

    public void setIfUse(String ifUse) {
        this.ifUse = ifUse;
    }

    public UpdateTaskRulesetItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 新/老数据表示，默认1
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTaskRulesetItem updateTaskRulesetItem = (UpdateTaskRulesetItem) o;
        return Objects.equals(this.language, updateTaskRulesetItem.language)
            && Objects.equals(this.ruleSetId, updateTaskRulesetItem.ruleSetId)
            && Objects.equals(this.ifUse, updateTaskRulesetItem.ifUse)
            && Objects.equals(this.status, updateTaskRulesetItem.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, ruleSetId, ifUse, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskRulesetItem {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    ruleSetId: ").append(toIndentedString(ruleSetId)).append("\n");
        sb.append("    ifUse: ").append(toIndentedString(ifUse)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
