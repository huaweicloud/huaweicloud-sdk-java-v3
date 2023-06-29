package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 扫描规则
 */
public class ResponseRule {

    /**
     * 规则类别，内置规则(BUILT_IN)或自建规则(BUILT_SELF)
     */
    public static final class CategoryEnum {

        /**
         * Enum BUILT_IN for value: "BUILT_IN"
         */
        public static final CategoryEnum BUILT_IN = new CategoryEnum("BUILT_IN");

        /**
         * Enum BUILT_SELF for value: "BUILT_SELF"
         */
        public static final CategoryEnum BUILT_SELF = new CategoryEnum("BUILT_SELF");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("BUILT_IN", BUILT_IN);
            map.put("BUILT_SELF", BUILT_SELF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_allowed")

    private Boolean deleteAllowed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_names")

    private String groupNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_operator")

    private String logicOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_match")

    private Integer minMatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private Integer riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_content")

    private String ruleContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_desc")

    private String ruleDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    /**
     * 规则类型，关键字(KEYWORD)、正则表达式(REGEX)或自然语言(NLP)
     */
    public static final class RuleTypeEnum {

        /**
         * Enum KEYWORD for value: "KEYWORD"
         */
        public static final RuleTypeEnum KEYWORD = new RuleTypeEnum("KEYWORD");

        /**
         * Enum REGEX for value: "REGEX"
         */
        public static final RuleTypeEnum REGEX = new RuleTypeEnum("REGEX");

        /**
         * Enum NLP for value: "NLP"
         */
        public static final RuleTypeEnum NLP = new RuleTypeEnum("NLP");

        private static final Map<String, RuleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuleTypeEnum> createStaticFields() {
            Map<String, RuleTypeEnum> map = new HashMap<>();
            map.put("KEYWORD", KEYWORD);
            map.put("REGEX", REGEX);
            map.put("NLP", NLP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuleTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RuleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuleTypeEnum(value));
        }

        public static RuleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RuleTypeEnum) {
                return this.value.equals(((RuleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private RuleTypeEnum ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selected")

    private Boolean selected;

    public ResponseRule withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 规则类别，内置规则(BUILT_IN)或自建规则(BUILT_SELF)
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public ResponseRule withDeleteAllowed(Boolean deleteAllowed) {
        this.deleteAllowed = deleteAllowed;
        return this;
    }

    /**
     * 是否允许删除
     * @return deleteAllowed
     */
    public Boolean getDeleteAllowed() {
        return deleteAllowed;
    }

    public void setDeleteAllowed(Boolean deleteAllowed) {
        this.deleteAllowed = deleteAllowed;
    }

    public ResponseRule withGroupNames(String groupNames) {
        this.groupNames = groupNames;
        return this;
    }

    /**
     * 相关的规则组
     * @return groupNames
     */
    public String getGroupNames() {
        return groupNames;
    }

    public void setGroupNames(String groupNames) {
        this.groupNames = groupNames;
    }

    public ResponseRule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResponseRule withLogicOperator(String logicOperator) {
        this.logicOperator = logicOperator;
        return this;
    }

    /**
     * 逻辑运算符，\"AND\",\"OR\",\"REGEX\"
     * @return logicOperator
     */
    public String getLogicOperator() {
        return logicOperator;
    }

    public void setLogicOperator(String logicOperator) {
        this.logicOperator = logicOperator;
    }

    public ResponseRule withMinMatch(Integer minMatch) {
        this.minMatch = minMatch;
        return this;
    }

    /**
     * 最小匹配次数
     * @return minMatch
     */
    public Integer getMinMatch() {
        return minMatch;
    }

    public void setMinMatch(Integer minMatch) {
        this.minMatch = minMatch;
    }

    public ResponseRule withRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    public ResponseRule withRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
        return this;
    }

    /**
     * 规则内容
     * @return ruleContent
     */
    public String getRuleContent() {
        return ruleContent;
    }

    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent;
    }

    public ResponseRule withRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
        return this;
    }

    /**
     * 规则描述
     * @return ruleDesc
     */
    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public ResponseRule withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * 规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ResponseRule withRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 规则类型，关键字(KEYWORD)、正则表达式(REGEX)或自然语言(NLP)
     * @return ruleType
     */
    public RuleTypeEnum getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
    }

    public ResponseRule withSelected(Boolean selected) {
        this.selected = selected;
        return this;
    }

    /**
     * 是否可选
     * @return selected
     */
    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseRule that = (ResponseRule) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.deleteAllowed, that.deleteAllowed)
            && Objects.equals(this.groupNames, that.groupNames) && Objects.equals(this.id, that.id)
            && Objects.equals(this.logicOperator, that.logicOperator) && Objects.equals(this.minMatch, that.minMatch)
            && Objects.equals(this.riskLevel, that.riskLevel) && Objects.equals(this.ruleContent, that.ruleContent)
            && Objects.equals(this.ruleDesc, that.ruleDesc) && Objects.equals(this.ruleName, that.ruleName)
            && Objects.equals(this.ruleType, that.ruleType) && Objects.equals(this.selected, that.selected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category,
            deleteAllowed,
            groupNames,
            id,
            logicOperator,
            minMatch,
            riskLevel,
            ruleContent,
            ruleDesc,
            ruleName,
            ruleType,
            selected);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseRule {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    deleteAllowed: ").append(toIndentedString(deleteAllowed)).append("\n");
        sb.append("    groupNames: ").append(toIndentedString(groupNames)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    logicOperator: ").append(toIndentedString(logicOperator)).append("\n");
        sb.append("    minMatch: ").append(toIndentedString(minMatch)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    ruleContent: ").append(toIndentedString(ruleContent)).append("\n");
        sb.append("    ruleDesc: ").append(toIndentedString(ruleDesc)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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
