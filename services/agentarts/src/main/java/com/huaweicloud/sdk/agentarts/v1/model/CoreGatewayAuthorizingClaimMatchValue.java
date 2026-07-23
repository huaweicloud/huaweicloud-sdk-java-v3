package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 授权声明匹配值配置。
 */
public class CoreGatewayAuthorizingClaimMatchValue {

    /**
     * 匹配操作符。
     */
    public static final class MatchOperatorEnum {

        /**
         * Enum EQUALS for value: "equals"
         */
        public static final MatchOperatorEnum EQUALS = new MatchOperatorEnum("equals");

        /**
         * Enum CONTAINS for value: "contains"
         */
        public static final MatchOperatorEnum CONTAINS = new MatchOperatorEnum("contains");

        /**
         * Enum CONTAINS_ANY for value: "contains_any"
         */
        public static final MatchOperatorEnum CONTAINS_ANY = new MatchOperatorEnum("contains_any");

        private static final Map<String, MatchOperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MatchOperatorEnum> createStaticFields() {
            Map<String, MatchOperatorEnum> map = new HashMap<>();
            map.put("equals", EQUALS);
            map.put("contains", CONTAINS);
            map.put("contains_any", CONTAINS_ANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MatchOperatorEnum(String value) {
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
        public static MatchOperatorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MatchOperatorEnum(value));
        }

        public static MatchOperatorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MatchOperatorEnum) {
                return this.value.equals(((MatchOperatorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_operator")

    private MatchOperatorEnum matchOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_value")

    private CoreGatewayMatchValue matchValue;

    public CoreGatewayAuthorizingClaimMatchValue withMatchOperator(MatchOperatorEnum matchOperator) {
        this.matchOperator = matchOperator;
        return this;
    }

    /**
     * 匹配操作符。
     * @return matchOperator
     */
    public MatchOperatorEnum getMatchOperator() {
        return matchOperator;
    }

    public void setMatchOperator(MatchOperatorEnum matchOperator) {
        this.matchOperator = matchOperator;
    }

    public CoreGatewayAuthorizingClaimMatchValue withMatchValue(CoreGatewayMatchValue matchValue) {
        this.matchValue = matchValue;
        return this;
    }

    public CoreGatewayAuthorizingClaimMatchValue withMatchValue(Consumer<CoreGatewayMatchValue> matchValueSetter) {
        if (this.matchValue == null) {
            this.matchValue = new CoreGatewayMatchValue();
            matchValueSetter.accept(this.matchValue);
        }

        return this;
    }

    /**
     * Get matchValue
     * @return matchValue
     */
    public CoreGatewayMatchValue getMatchValue() {
        return matchValue;
    }

    public void setMatchValue(CoreGatewayMatchValue matchValue) {
        this.matchValue = matchValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayAuthorizingClaimMatchValue that = (CoreGatewayAuthorizingClaimMatchValue) obj;
        return Objects.equals(this.matchOperator, that.matchOperator)
            && Objects.equals(this.matchValue, that.matchValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchOperator, matchValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayAuthorizingClaimMatchValue {\n");
        sb.append("    matchOperator: ").append(toIndentedString(matchOperator)).append("\n");
        sb.append("    matchValue: ").append(toIndentedString(matchValue)).append("\n");
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
