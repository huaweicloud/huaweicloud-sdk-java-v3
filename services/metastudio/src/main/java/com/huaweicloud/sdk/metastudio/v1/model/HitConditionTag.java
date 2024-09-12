package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 命中条件定义
 */
public class HitConditionTag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    /**
     * **参数解释**： 字段取值处理 **约束限制**： 不涉及 **取值范围**： * SUM：累计 * AVG：平均 * COUNT：计数 * NONE：无处理
     */
    public static final class OperationEnum {

        /**
         * Enum SUM for value: "SUM"
         */
        public static final OperationEnum SUM = new OperationEnum("SUM");

        /**
         * Enum AVG for value: "AVG"
         */
        public static final OperationEnum AVG = new OperationEnum("AVG");

        /**
         * Enum COUNT for value: "COUNT"
         */
        public static final OperationEnum COUNT = new OperationEnum("COUNT");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final OperationEnum NONE = new OperationEnum("NONE");

        private static final Map<String, OperationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationEnum> createStaticFields() {
            Map<String, OperationEnum> map = new HashMap<>();
            map.put("SUM", SUM);
            map.put("AVG", AVG);
            map.put("COUNT", COUNT);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationEnum(String value) {
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
        public static OperationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationEnum(value));
        }

        public static OperationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationEnum) {
                return this.value.equals(((OperationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private OperationEnum operation;

    /**
     * **参数解释**： 匹配类型。关键词匹配建议使用REGEX。 **约束限制**： 不涉及。 **取值范围**： * EQUAL: 完全相等 * REGEX：正则匹配 * MATH_GT：数值大于 * MATH_GE：数值大于等于  * MATH_LT：数值小于 * MATH_LE：数值小于等于 * MATH_EQ：数值相等  **默认取值**： 不涉及
     */
    public static final class MatchEnum {

        /**
         * Enum EQUAL for value: "EQUAL"
         */
        public static final MatchEnum EQUAL = new MatchEnum("EQUAL");

        /**
         * Enum REGEX for value: "REGEX"
         */
        public static final MatchEnum REGEX = new MatchEnum("REGEX");

        /**
         * Enum MATH_GT for value: "MATH_GT"
         */
        public static final MatchEnum MATH_GT = new MatchEnum("MATH_GT");

        /**
         * Enum MATH_GE for value: "MATH_GE"
         */
        public static final MatchEnum MATH_GE = new MatchEnum("MATH_GE");

        /**
         * Enum MATH_LT for value: "MATH_LT"
         */
        public static final MatchEnum MATH_LT = new MatchEnum("MATH_LT");

        /**
         * Enum MATH_LE for value: "MATH_LE"
         */
        public static final MatchEnum MATH_LE = new MatchEnum("MATH_LE");

        /**
         * Enum MATH_EQ for value: "MATH_EQ"
         */
        public static final MatchEnum MATH_EQ = new MatchEnum("MATH_EQ");

        private static final Map<String, MatchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MatchEnum> createStaticFields() {
            Map<String, MatchEnum> map = new HashMap<>();
            map.put("EQUAL", EQUAL);
            map.put("REGEX", REGEX);
            map.put("MATH_GT", MATH_GT);
            map.put("MATH_GE", MATH_GE);
            map.put("MATH_LT", MATH_LT);
            map.put("MATH_LE", MATH_LE);
            map.put("MATH_EQ", MATH_EQ);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MatchEnum(String value) {
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
        public static MatchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MatchEnum(value));
        }

        public static MatchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MatchEnum) {
                return this.value.equals(((MatchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match")

    private MatchEnum match;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public HitConditionTag withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数解释**： 事件内容关键字段 > * event_type为1,2,3,4：与LiveEventReport中event.content中反序列化后的JSON字段对应。如：弹幕事件上报事件。   {     \"timestamp\": 1694481224245,     \"type\": 1,     \"content\": \"{\\\"user\\\":{\\\"userId\\\":\\\"2027271526\\\",\\\"name\\\":\\\"***\\\",\\\"level\\\":17,\\\"badge\\\":\\\"\\\",\\\"badgeLevel\\\":0},\\\"content\\\":\\\"***\\\"}\"   }   匹配弹幕内容，填写content；匹配用户平台等级，填写level。 > * 10：固定填写content即可。  **约束限制**： 不涉及 **取值范围**： 字符长度0-256位 **默认取值**： 不涉及
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public HitConditionTag withOperation(OperationEnum operation) {
        this.operation = operation;
        return this;
    }

    /**
     * **参数解释**： 字段取值处理 **约束限制**： 不涉及 **取值范围**： * SUM：累计 * AVG：平均 * COUNT：计数 * NONE：无处理
     * @return operation
     */
    public OperationEnum getOperation() {
        return operation;
    }

    public void setOperation(OperationEnum operation) {
        this.operation = operation;
    }

    public HitConditionTag withMatch(MatchEnum match) {
        this.match = match;
        return this;
    }

    /**
     * **参数解释**： 匹配类型。关键词匹配建议使用REGEX。 **约束限制**： 不涉及。 **取值范围**： * EQUAL: 完全相等 * REGEX：正则匹配 * MATH_GT：数值大于 * MATH_GE：数值大于等于  * MATH_LT：数值小于 * MATH_LE：数值小于等于 * MATH_EQ：数值相等  **默认取值**： 不涉及
     * @return match
     */
    public MatchEnum getMatch() {
        return match;
    }

    public void setMatch(MatchEnum match) {
        this.match = match;
    }

    public HitConditionTag withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**： 匹配值。 **约束限制**： 不涉及 **取值范围**： 字符长度0-1024 **默认取值**： 不涉及。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HitConditionTag that = (HitConditionTag) obj;
        return Objects.equals(this.tag, that.tag) && Objects.equals(this.operation, that.operation)
            && Objects.equals(this.match, that.match) && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, operation, match, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HitConditionTag {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
