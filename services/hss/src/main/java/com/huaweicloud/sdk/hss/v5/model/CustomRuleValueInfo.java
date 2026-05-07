package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CustomRuleValueInfo
 */
public class CustomRuleValueInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash_type")

    private String hashType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_block")

    private Integer autoBlock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_values")

    private List<String> ruleValues = null;

    public CustomRuleValueInfo withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * **参数解释**： 规则类型 **约束限制**： 必填 **取值范围**： - black_hash：黑hash  **默认取值**： 不涉及 
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public CustomRuleValueInfo withHashType(String hashType) {
        this.hashType = hashType;
        return this;
    }

    /**
     * **参数解释**： hash类型 **约束限制**： 必填 **取值范围**： - SHA-256：sha256sum - MD5：md5sum - SHA-1：sha1sum  **默认取值**： 不涉及 
     * @return hashType
     */
    public String getHashType() {
        return hashType;
    }

    public void setHashType(String hashType) {
        this.hashType = hashType;
    }

    public CustomRuleValueInfo withAutoBlock(Integer autoBlock) {
        this.autoBlock = autoBlock;
        return this;
    }

    /**
     * **参数解释**： 是否自动阻断告警 **约束限制**： 必填 **取值范围**： - 0：不自动阻断告警 - 1：自动阻断告警  **默认取值**： 不涉及 
     * @return autoBlock
     */
    public Integer getAutoBlock() {
        return autoBlock;
    }

    public void setAutoBlock(Integer autoBlock) {
        this.autoBlock = autoBlock;
    }

    public CustomRuleValueInfo withRuleValues(List<String> ruleValues) {
        this.ruleValues = ruleValues;
        return this;
    }

    public CustomRuleValueInfo addRuleValuesItem(String ruleValuesItem) {
        if (this.ruleValues == null) {
            this.ruleValues = new ArrayList<>();
        }
        this.ruleValues.add(ruleValuesItem);
        return this;
    }

    public CustomRuleValueInfo withRuleValues(Consumer<List<String>> ruleValuesSetter) {
        if (this.ruleValues == null) {
            this.ruleValues = new ArrayList<>();
        }
        ruleValuesSetter.accept(this.ruleValues);
        return this;
    }

    /**
     * **参数解释**： 规则集列表 **约束限制**: 必填 **取值范围**: 1-1000个规则值 **默认取值**: 不涉及 
     * @return ruleValues
     */
    public List<String> getRuleValues() {
        return ruleValues;
    }

    public void setRuleValues(List<String> ruleValues) {
        this.ruleValues = ruleValues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomRuleValueInfo that = (CustomRuleValueInfo) obj;
        return Objects.equals(this.ruleType, that.ruleType) && Objects.equals(this.hashType, that.hashType)
            && Objects.equals(this.autoBlock, that.autoBlock) && Objects.equals(this.ruleValues, that.ruleValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleType, hashType, autoBlock, ruleValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomRuleValueInfo {\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    hashType: ").append(toIndentedString(hashType)).append("\n");
        sb.append("    autoBlock: ").append(toIndentedString(autoBlock)).append("\n");
        sb.append("    ruleValues: ").append(toIndentedString(ruleValues)).append("\n");
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
