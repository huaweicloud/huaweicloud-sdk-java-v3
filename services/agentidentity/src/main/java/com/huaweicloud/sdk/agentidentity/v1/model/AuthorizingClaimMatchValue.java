package com.huaweicloud.sdk.agentidentity.v1.model;

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
 * AuthorizingClaimMatchValue
 */
public class AuthorizingClaimMatchValue {

    /**
     * Defines the relationship between the claim field value and the value or values you're matching for.
     */
    public static final class ClaimMatchOperatorEnum {

        /**
         * Enum EQUALS for value: "EQUALS"
         */
        public static final ClaimMatchOperatorEnum EQUALS = new ClaimMatchOperatorEnum("EQUALS");

        /**
         * Enum CONTAINS for value: "CONTAINS"
         */
        public static final ClaimMatchOperatorEnum CONTAINS = new ClaimMatchOperatorEnum("CONTAINS");

        /**
         * Enum CONTAINS_ANY for value: "CONTAINS_ANY"
         */
        public static final ClaimMatchOperatorEnum CONTAINS_ANY = new ClaimMatchOperatorEnum("CONTAINS_ANY");

        private static final Map<String, ClaimMatchOperatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClaimMatchOperatorEnum> createStaticFields() {
            Map<String, ClaimMatchOperatorEnum> map = new HashMap<>();
            map.put("EQUALS", EQUALS);
            map.put("CONTAINS", CONTAINS);
            map.put("CONTAINS_ANY", CONTAINS_ANY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClaimMatchOperatorEnum(String value) {
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
        public static ClaimMatchOperatorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClaimMatchOperatorEnum(value));
        }

        public static ClaimMatchOperatorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClaimMatchOperatorEnum) {
                return this.value.equals(((ClaimMatchOperatorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "claim_match_operator")

    private ClaimMatchOperatorEnum claimMatchOperator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "claim_match_value")

    private ClaimMatchValue claimMatchValue;

    public AuthorizingClaimMatchValue withClaimMatchOperator(ClaimMatchOperatorEnum claimMatchOperator) {
        this.claimMatchOperator = claimMatchOperator;
        return this;
    }

    /**
     * Defines the relationship between the claim field value and the value or values you're matching for.
     * @return claimMatchOperator
     */
    public ClaimMatchOperatorEnum getClaimMatchOperator() {
        return claimMatchOperator;
    }

    public void setClaimMatchOperator(ClaimMatchOperatorEnum claimMatchOperator) {
        this.claimMatchOperator = claimMatchOperator;
    }

    public AuthorizingClaimMatchValue withClaimMatchValue(ClaimMatchValue claimMatchValue) {
        this.claimMatchValue = claimMatchValue;
        return this;
    }

    public AuthorizingClaimMatchValue withClaimMatchValue(Consumer<ClaimMatchValue> claimMatchValueSetter) {
        if (this.claimMatchValue == null) {
            this.claimMatchValue = new ClaimMatchValue();
            claimMatchValueSetter.accept(this.claimMatchValue);
        }

        return this;
    }

    /**
     * Get claimMatchValue
     * @return claimMatchValue
     */
    public ClaimMatchValue getClaimMatchValue() {
        return claimMatchValue;
    }

    public void setClaimMatchValue(ClaimMatchValue claimMatchValue) {
        this.claimMatchValue = claimMatchValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizingClaimMatchValue that = (AuthorizingClaimMatchValue) obj;
        return Objects.equals(this.claimMatchOperator, that.claimMatchOperator)
            && Objects.equals(this.claimMatchValue, that.claimMatchValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claimMatchOperator, claimMatchValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizingClaimMatchValue {\n");
        sb.append("    claimMatchOperator: ").append(toIndentedString(claimMatchOperator)).append("\n");
        sb.append("    claimMatchValue: ").append(toIndentedString(claimMatchValue)).append("\n");
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
