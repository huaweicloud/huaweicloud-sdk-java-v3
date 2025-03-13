package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImportRuleSecrecyLevelDto
 */
public class ImportRuleSecrecyLevelDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "builtin_rule_id")

    private String builtinRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secrecy_level")

    private String secrecyLevel;

    public ImportRuleSecrecyLevelDto withBuiltinRuleId(String builtinRuleId) {
        this.builtinRuleId = builtinRuleId;
        return this;
    }

    /**
     * 内置规则模板id。
     * @return builtinRuleId
     */
    public String getBuiltinRuleId() {
        return builtinRuleId;
    }

    public void setBuiltinRuleId(String builtinRuleId) {
        this.builtinRuleId = builtinRuleId;
    }

    public ImportRuleSecrecyLevelDto withSecrecyLevel(String secrecyLevel) {
        this.secrecyLevel = secrecyLevel;
        return this;
    }

    /**
     * 密级id，获取方法请参见[获取数据密级](ListSecuritySecrecyLevels.xml)。
     * @return secrecyLevel
     */
    public String getSecrecyLevel() {
        return secrecyLevel;
    }

    public void setSecrecyLevel(String secrecyLevel) {
        this.secrecyLevel = secrecyLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportRuleSecrecyLevelDto that = (ImportRuleSecrecyLevelDto) obj;
        return Objects.equals(this.builtinRuleId, that.builtinRuleId)
            && Objects.equals(this.secrecyLevel, that.secrecyLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(builtinRuleId, secrecyLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportRuleSecrecyLevelDto {\n");
        sb.append("    builtinRuleId: ").append(toIndentedString(builtinRuleId)).append("\n");
        sb.append("    secrecyLevel: ").append(toIndentedString(secrecyLevel)).append("\n");
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
