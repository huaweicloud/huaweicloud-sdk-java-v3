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
 * DataClassificationSingleRuleDTO
 */
public class DataClassificationSingleRuleDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_code")

    private String ruleCode;

    /**
     * 算法类型, REGEX,REGEX_INSENSITIVE,GROOVY,LENGTH_EQ,LENGTH_GT,LENGTH_LT,BUILTIN
     */
    public static final class AlgorithmTypeEnum {

        /**
         * Enum REGEX for value: "REGEX"
         */
        public static final AlgorithmTypeEnum REGEX = new AlgorithmTypeEnum("REGEX");

        /**
         * Enum REGEX_INSENSITIVE for value: "REGEX_INSENSITIVE"
         */
        public static final AlgorithmTypeEnum REGEX_INSENSITIVE = new AlgorithmTypeEnum("REGEX_INSENSITIVE");

        /**
         * Enum GROOVY for value: "GROOVY"
         */
        public static final AlgorithmTypeEnum GROOVY = new AlgorithmTypeEnum("GROOVY");

        /**
         * Enum LENGTH_EQ for value: "LENGTH_EQ"
         */
        public static final AlgorithmTypeEnum LENGTH_EQ = new AlgorithmTypeEnum("LENGTH_EQ");

        /**
         * Enum LENGTH_GT for value: "LENGTH_GT"
         */
        public static final AlgorithmTypeEnum LENGTH_GT = new AlgorithmTypeEnum("LENGTH_GT");

        /**
         * Enum LENGTH_LT for value: "LENGTH_LT"
         */
        public static final AlgorithmTypeEnum LENGTH_LT = new AlgorithmTypeEnum("LENGTH_LT");

        /**
         * Enum BUILTIN for value: "BUILTIN"
         */
        public static final AlgorithmTypeEnum BUILTIN = new AlgorithmTypeEnum("BUILTIN");

        private static final Map<String, AlgorithmTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AlgorithmTypeEnum> createStaticFields() {
            Map<String, AlgorithmTypeEnum> map = new HashMap<>();
            map.put("REGEX", REGEX);
            map.put("REGEX_INSENSITIVE", REGEX_INSENSITIVE);
            map.put("GROOVY", GROOVY);
            map.put("LENGTH_EQ", LENGTH_EQ);
            map.put("LENGTH_GT", LENGTH_GT);
            map.put("LENGTH_LT", LENGTH_LT);
            map.put("BUILTIN", BUILTIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AlgorithmTypeEnum(String value) {
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
        public static AlgorithmTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlgorithmTypeEnum(value));
        }

        public static AlgorithmTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AlgorithmTypeEnum) {
                return this.value.equals(((AlgorithmTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type")

    private AlgorithmTypeEnum algorithmType;

    /**
     * 匹配类型, CONTENT,COLUMN,COMMIT,TABLE_NAME,TABLE_COMMENT,DATABASE_NAME
     */
    public static final class MatchTypeEnum {

        /**
         * Enum CONTENT for value: "CONTENT"
         */
        public static final MatchTypeEnum CONTENT = new MatchTypeEnum("CONTENT");

        /**
         * Enum COLUMN for value: "COLUMN"
         */
        public static final MatchTypeEnum COLUMN = new MatchTypeEnum("COLUMN");

        /**
         * Enum COMMIT for value: "COMMIT"
         */
        public static final MatchTypeEnum COMMIT = new MatchTypeEnum("COMMIT");

        /**
         * Enum TABLE_NAME for value: "TABLE_NAME"
         */
        public static final MatchTypeEnum TABLE_NAME = new MatchTypeEnum("TABLE_NAME");

        /**
         * Enum TABLE_COMMENT for value: "TABLE_COMMENT"
         */
        public static final MatchTypeEnum TABLE_COMMENT = new MatchTypeEnum("TABLE_COMMENT");

        /**
         * Enum DATABASE_NAME for value: "DATABASE_NAME"
         */
        public static final MatchTypeEnum DATABASE_NAME = new MatchTypeEnum("DATABASE_NAME");

        private static final Map<String, MatchTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MatchTypeEnum> createStaticFields() {
            Map<String, MatchTypeEnum> map = new HashMap<>();
            map.put("CONTENT", CONTENT);
            map.put("COLUMN", COLUMN);
            map.put("COMMIT", COMMIT);
            map.put("TABLE_NAME", TABLE_NAME);
            map.put("TABLE_COMMENT", TABLE_COMMENT);
            map.put("DATABASE_NAME", DATABASE_NAME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MatchTypeEnum(String value) {
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
        public static MatchTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MatchTypeEnum(value));
        }

        public static MatchTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MatchTypeEnum) {
                return this.value.equals(((MatchTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    private MatchTypeEnum matchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "builtin_rule_id")

    private String builtinRuleId;

    public DataClassificationSingleRuleDTO withRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }

    /**
     * 规则序号,大写字母
     * @return ruleCode
     */
    public String getRuleCode() {
        return ruleCode;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public DataClassificationSingleRuleDTO withAlgorithmType(AlgorithmTypeEnum algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }

    /**
     * 算法类型, REGEX,REGEX_INSENSITIVE,GROOVY,LENGTH_EQ,LENGTH_GT,LENGTH_LT,BUILTIN
     * @return algorithmType
     */
    public AlgorithmTypeEnum getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(AlgorithmTypeEnum algorithmType) {
        this.algorithmType = algorithmType;
    }

    public DataClassificationSingleRuleDTO withMatchType(MatchTypeEnum matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * 匹配类型, CONTENT,COLUMN,COMMIT,TABLE_NAME,TABLE_COMMENT,DATABASE_NAME
     * @return matchType
     */
    public MatchTypeEnum getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchTypeEnum matchType) {
        this.matchType = matchType;
    }

    public DataClassificationSingleRuleDTO withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * expression
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public DataClassificationSingleRuleDTO withBuiltinRuleId(String builtinRuleId) {
        this.builtinRuleId = builtinRuleId;
        return this;
    }

    /**
     * 内置规则ID
     * @return builtinRuleId
     */
    public String getBuiltinRuleId() {
        return builtinRuleId;
    }

    public void setBuiltinRuleId(String builtinRuleId) {
        this.builtinRuleId = builtinRuleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataClassificationSingleRuleDTO that = (DataClassificationSingleRuleDTO) obj;
        return Objects.equals(this.ruleCode, that.ruleCode) && Objects.equals(this.algorithmType, that.algorithmType)
            && Objects.equals(this.matchType, that.matchType) && Objects.equals(this.expression, that.expression)
            && Objects.equals(this.builtinRuleId, that.builtinRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleCode, algorithmType, matchType, expression, builtinRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataClassificationSingleRuleDTO {\n");
        sb.append("    ruleCode: ").append(toIndentedString(ruleCode)).append("\n");
        sb.append("    algorithmType: ").append(toIndentedString(algorithmType)).append("\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    builtinRuleId: ").append(toIndentedString(builtinRuleId)).append("\n");
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
