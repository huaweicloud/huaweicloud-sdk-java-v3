package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResumePauseCustomRuleIdsRequestInfo
 */
public class ResumePauseCustomRuleIdsRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Integer enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id_list")

    private List<String> ruleIdList = null;

    public ResumePauseCustomRuleIdsRequestInfo withEnable(Integer enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释**: 启用、停用 **约束限制**: 必填 **取值范围**: - 1：启用 - 0：停用  **默认取值**: 不涉及 
     * minimum: 0
     * maximum: 10
     * @return enable
     */
    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public ResumePauseCustomRuleIdsRequestInfo withRuleIdList(List<String> ruleIdList) {
        this.ruleIdList = ruleIdList;
        return this;
    }

    public ResumePauseCustomRuleIdsRequestInfo addRuleIdListItem(String ruleIdListItem) {
        if (this.ruleIdList == null) {
            this.ruleIdList = new ArrayList<>();
        }
        this.ruleIdList.add(ruleIdListItem);
        return this;
    }

    public ResumePauseCustomRuleIdsRequestInfo withRuleIdList(Consumer<List<String>> ruleIdListSetter) {
        if (this.ruleIdList == null) {
            this.ruleIdList = new ArrayList<>();
        }
        ruleIdListSetter.accept(this.ruleIdList);
        return this;
    }

    /**
     * **参数解释**： 规则ID列表 **约束限制**: 必填 **取值范围**: 1-1000个规则值 **默认取值**: 不涉及 
     * @return ruleIdList
     */
    public List<String> getRuleIdList() {
        return ruleIdList;
    }

    public void setRuleIdList(List<String> ruleIdList) {
        this.ruleIdList = ruleIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResumePauseCustomRuleIdsRequestInfo that = (ResumePauseCustomRuleIdsRequestInfo) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.ruleIdList, that.ruleIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, ruleIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResumePauseCustomRuleIdsRequestInfo {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    ruleIdList: ").append(toIndentedString(ruleIdList)).append("\n");
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
