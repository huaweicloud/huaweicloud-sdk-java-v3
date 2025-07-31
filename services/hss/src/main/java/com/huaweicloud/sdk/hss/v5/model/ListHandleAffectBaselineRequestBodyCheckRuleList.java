package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListHandleAffectBaselineRequestBodyCheckRuleList
 */
public class ListHandleAffectBaselineRequestBodyCheckRuleList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_name")

    private String checkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_id")

    private String checkRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    private String standard;

    public ListHandleAffectBaselineRequestBodyCheckRuleList withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * **参数解释** 基线检查的名称 **约束限制** 不涉及 **取值范围**   字符长度0-256位 **默认取值** 不涉及
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public ListHandleAffectBaselineRequestBodyCheckRuleList withCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
        return this;
    }

    /**
     * **参数解释** 检查项id **约束限制** 不涉及 **取值范围**   字符长度0-256位 **默认取值** 不涉及
     * @return checkRuleId
     */
    public String getCheckRuleId() {
        return checkRuleId;
    }

    public void setCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
    }

    public ListHandleAffectBaselineRequestBodyCheckRuleList withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * **参数解释** 基线检查标准类型 **约束限制** 不涉及 **取值范围**   - cn_standard : 等保合规标准 - hw_standard : 云安全实践标准 - cis_standard : 通用安全标准 **默认取值** 不涉及
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHandleAffectBaselineRequestBodyCheckRuleList that = (ListHandleAffectBaselineRequestBodyCheckRuleList) obj;
        return Objects.equals(this.checkName, that.checkName) && Objects.equals(this.checkRuleId, that.checkRuleId)
            && Objects.equals(this.standard, that.standard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkName, checkRuleId, standard);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHandleAffectBaselineRequestBodyCheckRuleList {\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    checkRuleId: ").append(toIndentedString(checkRuleId)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
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
