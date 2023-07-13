package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComponentAffinity
 */
public class ComponentAffinity {

    /**
     * 指定亲和和反亲和的类型
     */
    public static final class KindEnum {

        /**
         * Enum NODE for value: "node"
         */
        public static final KindEnum NODE = new KindEnum("node");

        /**
         * Enum POD for value: "pod"
         */
        public static final KindEnum POD = new KindEnum("pod");

        private static final Map<String, KindEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KindEnum> createStaticFields() {
            Map<String, KindEnum> map = new HashMap<>();
            map.put("node", NODE);
            map.put("pod", POD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KindEnum(String value) {
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
        public static KindEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KindEnum(value));
        }

        public static KindEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KindEnum) {
                return this.value.equals(((KindEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private KindEnum kind;

    /**
     * Gets or Sets condition
     */
    public static final class ConditionEnum {

        /**
         * Enum REQUIRED for value: "required"
         */
        public static final ConditionEnum REQUIRED = new ConditionEnum("required");

        /**
         * Enum PREFERRED for value: "preferred"
         */
        public static final ConditionEnum PREFERRED = new ConditionEnum("preferred");

        private static final Map<String, ConditionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionEnum> createStaticFields() {
            Map<String, ConditionEnum> map = new HashMap<>();
            map.put("required", REQUIRED);
            map.put("preferred", PREFERRED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConditionEnum(String value) {
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
        public static ConditionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConditionEnum(value));
        }

        public static ConditionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConditionEnum) {
                return this.value.equals(((ConditionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private ConditionEnum condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_expressions")

    private List<ComponentAffinityMatchExpressions> matchExpressions = null;

    public ComponentAffinity withKind(KindEnum kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 指定亲和和反亲和的类型
     * @return kind
     */
    public KindEnum getKind() {
        return kind;
    }

    public void setKind(KindEnum kind) {
        this.kind = kind;
    }

    public ComponentAffinity withCondition(ConditionEnum condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public ConditionEnum getCondition() {
        return condition;
    }

    public void setCondition(ConditionEnum condition) {
        this.condition = condition;
    }

    public ComponentAffinity withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get weight
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public ComponentAffinity withMatchExpressions(List<ComponentAffinityMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }

    public ComponentAffinity addMatchExpressionsItem(ComponentAffinityMatchExpressions matchExpressionsItem) {
        if (this.matchExpressions == null) {
            this.matchExpressions = new ArrayList<>();
        }
        this.matchExpressions.add(matchExpressionsItem);
        return this;
    }

    public ComponentAffinity withMatchExpressions(
        Consumer<List<ComponentAffinityMatchExpressions>> matchExpressionsSetter) {
        if (this.matchExpressions == null) {
            this.matchExpressions = new ArrayList<>();
        }
        matchExpressionsSetter.accept(this.matchExpressions);
        return this;
    }

    /**
     * 匹配的条件列表
     * @return matchExpressions
     */
    public List<ComponentAffinityMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(List<ComponentAffinityMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentAffinity that = (ComponentAffinity) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.condition, that.condition)
            && Objects.equals(this.weight, that.weight) && Objects.equals(this.matchExpressions, that.matchExpressions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, condition, weight, matchExpressions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentAffinity {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
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
