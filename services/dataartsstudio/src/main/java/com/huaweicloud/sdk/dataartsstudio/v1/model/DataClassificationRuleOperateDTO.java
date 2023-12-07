package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DataClassificationRuleOperateDTO
 */
public class DataClassificationRuleOperateDTO {

    /**
     * 规则类型, CUSTOM, BUILTIN
     */
    public static final class RuleTypeEnum {

        /**
         * Enum CUSTOM for value: "CUSTOM"
         */
        public static final RuleTypeEnum CUSTOM = new RuleTypeEnum("CUSTOM");

        /**
         * Enum BUILTIN for value: "BUILTIN"
         */
        public static final RuleTypeEnum BUILTIN = new RuleTypeEnum("BUILTIN");

        private static final Map<String, RuleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuleTypeEnum> createStaticFields() {
            Map<String, RuleTypeEnum> map = new HashMap<>();
            map.put("CUSTOM", CUSTOM);
            map.put("BUILTIN", BUILTIN);
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
    @JsonProperty(value = "secrecy_level_id")

    private String secrecyLevelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 规则方式, REGULAR, NONE, DEFAULT
     */
    public static final class MethodEnum {

        /**
         * Enum REGULAR for value: "REGULAR"
         */
        public static final MethodEnum REGULAR = new MethodEnum("REGULAR");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final MethodEnum NONE = new MethodEnum("NONE");

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final MethodEnum DEFAULT = new MethodEnum("DEFAULT");

        private static final Map<String, MethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MethodEnum> createStaticFields() {
            Map<String, MethodEnum> map = new HashMap<>();
            map.put("REGULAR", REGULAR);
            map.put("NONE", NONE);
            map.put("DEFAULT", DEFAULT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MethodEnum(String value) {
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
        public static MethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MethodEnum(value));
        }

        public static MethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MethodEnum) {
                return this.value.equals(((MethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private MethodEnum method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content_expression")

    private String contentExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_expression")

    private String columnExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_expression")

    private String commitExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "builtin_rule_id")

    private String builtinRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private String categoryId;

    public DataClassificationRuleOperateDTO withRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 规则类型, CUSTOM, BUILTIN
     * @return ruleType
     */
    public RuleTypeEnum getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
    }

    public DataClassificationRuleOperateDTO withSecrecyLevelId(String secrecyLevelId) {
        this.secrecyLevelId = secrecyLevelId;
        return this;
    }

    /**
     * 密级ID
     * @return secrecyLevelId
     */
    public String getSecrecyLevelId() {
        return secrecyLevelId;
    }

    public void setSecrecyLevelId(String secrecyLevelId) {
        this.secrecyLevelId = secrecyLevelId;
    }

    public DataClassificationRuleOperateDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataClassificationRuleOperateDTO withMethod(MethodEnum method) {
        this.method = method;
        return this;
    }

    /**
     * 规则方式, REGULAR, NONE, DEFAULT
     * @return method
     */
    public MethodEnum getMethod() {
        return method;
    }

    public void setMethod(MethodEnum method) {
        this.method = method;
    }

    public DataClassificationRuleOperateDTO withContentExpression(String contentExpression) {
        this.contentExpression = contentExpression;
        return this;
    }

    /**
     * 内容表达式
     * @return contentExpression
     */
    public String getContentExpression() {
        return contentExpression;
    }

    public void setContentExpression(String contentExpression) {
        this.contentExpression = contentExpression;
    }

    public DataClassificationRuleOperateDTO withColumnExpression(String columnExpression) {
        this.columnExpression = columnExpression;
        return this;
    }

    /**
     * 列表达式
     * @return columnExpression
     */
    public String getColumnExpression() {
        return columnExpression;
    }

    public void setColumnExpression(String columnExpression) {
        this.columnExpression = columnExpression;
    }

    public DataClassificationRuleOperateDTO withCommitExpression(String commitExpression) {
        this.commitExpression = commitExpression;
        return this;
    }

    /**
     * 备注表达式
     * @return commitExpression
     */
    public String getCommitExpression() {
        return commitExpression;
    }

    public void setCommitExpression(String commitExpression) {
        this.commitExpression = commitExpression;
    }

    public DataClassificationRuleOperateDTO withBuiltinRuleId(String builtinRuleId) {
        this.builtinRuleId = builtinRuleId;
        return this;
    }

    /**
     * 内置规则id
     * @return builtinRuleId
     */
    public String getBuiltinRuleId() {
        return builtinRuleId;
    }

    public void setBuiltinRuleId(String builtinRuleId) {
        this.builtinRuleId = builtinRuleId;
    }

    public DataClassificationRuleOperateDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DataClassificationRuleOperateDTO withCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * 分类ID
     * @return categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataClassificationRuleOperateDTO that = (DataClassificationRuleOperateDTO) obj;
        return Objects.equals(this.ruleType, that.ruleType) && Objects.equals(this.secrecyLevelId, that.secrecyLevelId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.method, that.method)
            && Objects.equals(this.contentExpression, that.contentExpression)
            && Objects.equals(this.columnExpression, that.columnExpression)
            && Objects.equals(this.commitExpression, that.commitExpression)
            && Objects.equals(this.builtinRuleId, that.builtinRuleId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.categoryId, that.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleType,
            secrecyLevelId,
            name,
            method,
            contentExpression,
            columnExpression,
            commitExpression,
            builtinRuleId,
            description,
            categoryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataClassificationRuleOperateDTO {\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    secrecyLevelId: ").append(toIndentedString(secrecyLevelId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    contentExpression: ").append(toIndentedString(contentExpression)).append("\n");
        sb.append("    columnExpression: ").append(toIndentedString(columnExpression)).append("\n");
        sb.append("    commitExpression: ").append(toIndentedString(commitExpression)).append("\n");
        sb.append("    builtinRuleId: ").append(toIndentedString(builtinRuleId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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
