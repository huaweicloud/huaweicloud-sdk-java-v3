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
 * **参数解释**：  自定义声明匹配配置。 **约束限制**: 不涉及。 **取值范围**： 不涉及。 **默认取值**: 不涉及。
 */
public class CoreRunAuthorizingClaimMatchValue {

    /**
     * **参数解释**：  定义声明字段值与要匹配的值之间的关系。 - EQUALS: 表示完全匹配 - CONTAINS: 表示包含匹配项 - CONTAINS_ANY: 表示包含任意匹配项。 **约束限制**: 不涉及。 **取值范围**： 长度为 1 - 12 个字符。允许的值： - EQUALS - CONTAINS - CONTAINS_ANY。 **默认取值**: 不涉及。
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

    private CoreRunClaimMatchValue claimMatchValue;

    public CoreRunAuthorizingClaimMatchValue withClaimMatchOperator(ClaimMatchOperatorEnum claimMatchOperator) {
        this.claimMatchOperator = claimMatchOperator;
        return this;
    }

    /**
     * **参数解释**：  定义声明字段值与要匹配的值之间的关系。 - EQUALS: 表示完全匹配 - CONTAINS: 表示包含匹配项 - CONTAINS_ANY: 表示包含任意匹配项。 **约束限制**: 不涉及。 **取值范围**： 长度为 1 - 12 个字符。允许的值： - EQUALS - CONTAINS - CONTAINS_ANY。 **默认取值**: 不涉及。
     * @return claimMatchOperator
     */
    public ClaimMatchOperatorEnum getClaimMatchOperator() {
        return claimMatchOperator;
    }

    public void setClaimMatchOperator(ClaimMatchOperatorEnum claimMatchOperator) {
        this.claimMatchOperator = claimMatchOperator;
    }

    public CoreRunAuthorizingClaimMatchValue withClaimMatchValue(CoreRunClaimMatchValue claimMatchValue) {
        this.claimMatchValue = claimMatchValue;
        return this;
    }

    public CoreRunAuthorizingClaimMatchValue withClaimMatchValue(
        Consumer<CoreRunClaimMatchValue> claimMatchValueSetter) {
        if (this.claimMatchValue == null) {
            this.claimMatchValue = new CoreRunClaimMatchValue();
            claimMatchValueSetter.accept(this.claimMatchValue);
        }

        return this;
    }

    /**
     * Get claimMatchValue
     * @return claimMatchValue
     */
    public CoreRunClaimMatchValue getClaimMatchValue() {
        return claimMatchValue;
    }

    public void setClaimMatchValue(CoreRunClaimMatchValue claimMatchValue) {
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
        CoreRunAuthorizingClaimMatchValue that = (CoreRunAuthorizingClaimMatchValue) obj;
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
        sb.append("class CoreRunAuthorizingClaimMatchValue {\n");
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
