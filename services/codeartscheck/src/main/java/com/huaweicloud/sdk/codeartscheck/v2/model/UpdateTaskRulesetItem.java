package com.huaweicloud.sdk.codeartscheck.v2.model;

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
     * **参数解释：** 检查语言，支持的语言请关注服务更新特性文档。 **约束限制:** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
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
     * **参数解释：** 规则集ID。 **约束限制:** 长度为[1~32]个字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
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
     * **参数解释：** 是否启用。 **约束限制:** 不涉及。 **取值范围：** - 0：不启用。 - 1：启用。 **默认取值：** 不涉及。
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
     * **参数解释：** 新/老数据。 **约束限制:** 不涉及。 **取值范围：** 1 **默认取值：** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTaskRulesetItem that = (UpdateTaskRulesetItem) obj;
        return Objects.equals(this.language, that.language) && Objects.equals(this.ruleSetId, that.ruleSetId)
            && Objects.equals(this.ifUse, that.ifUse) && Objects.equals(this.status, that.status);
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
