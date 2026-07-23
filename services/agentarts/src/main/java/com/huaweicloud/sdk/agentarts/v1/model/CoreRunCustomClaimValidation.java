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
 * **参数解释**：  要检查的自定义声明。 **约束限制**: 不涉及。 **取值范围**： 不涉及。 **默认取值**: 不涉及。
 */
public class CoreRunCustomClaimValidation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizing_claim_match_value")

    private CoreRunAuthorizingClaimMatchValue authorizingClaimMatchValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inbound_token_claim_name")

    private String inboundTokenClaimName;

    /**
     * **参数解释**：  要检查的声明值的数据类型。 - STRING: 表示字符串类型。 - STRING_ARRAY: 表示字符串数组类型。 **约束限制**: 不涉及。 **取值范围**： 长度为 1 - 12 个字符。 - STRING - STRING_ARRAY **默认取值**: 不涉及。
     */
    public static final class InboundTokenClaimValueTypeEnum {

        /**
         * Enum STRING for value: "STRING"
         */
        public static final InboundTokenClaimValueTypeEnum STRING = new InboundTokenClaimValueTypeEnum("STRING");

        /**
         * Enum STRING_ARRAY for value: "STRING_ARRAY"
         */
        public static final InboundTokenClaimValueTypeEnum STRING_ARRAY =
            new InboundTokenClaimValueTypeEnum("STRING_ARRAY");

        private static final Map<String, InboundTokenClaimValueTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InboundTokenClaimValueTypeEnum> createStaticFields() {
            Map<String, InboundTokenClaimValueTypeEnum> map = new HashMap<>();
            map.put("STRING", STRING);
            map.put("STRING_ARRAY", STRING_ARRAY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InboundTokenClaimValueTypeEnum(String value) {
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
        public static InboundTokenClaimValueTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new InboundTokenClaimValueTypeEnum(value));
        }

        public static InboundTokenClaimValueTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InboundTokenClaimValueTypeEnum) {
                return this.value.equals(((InboundTokenClaimValueTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inbound_token_claim_value_type")

    private InboundTokenClaimValueTypeEnum inboundTokenClaimValueType;

    public CoreRunCustomClaimValidation withAuthorizingClaimMatchValue(
        CoreRunAuthorizingClaimMatchValue authorizingClaimMatchValue) {
        this.authorizingClaimMatchValue = authorizingClaimMatchValue;
        return this;
    }

    public CoreRunCustomClaimValidation withAuthorizingClaimMatchValue(
        Consumer<CoreRunAuthorizingClaimMatchValue> authorizingClaimMatchValueSetter) {
        if (this.authorizingClaimMatchValue == null) {
            this.authorizingClaimMatchValue = new CoreRunAuthorizingClaimMatchValue();
            authorizingClaimMatchValueSetter.accept(this.authorizingClaimMatchValue);
        }

        return this;
    }

    /**
     * Get authorizingClaimMatchValue
     * @return authorizingClaimMatchValue
     */
    public CoreRunAuthorizingClaimMatchValue getAuthorizingClaimMatchValue() {
        return authorizingClaimMatchValue;
    }

    public void setAuthorizingClaimMatchValue(CoreRunAuthorizingClaimMatchValue authorizingClaimMatchValue) {
        this.authorizingClaimMatchValue = authorizingClaimMatchValue;
    }

    public CoreRunCustomClaimValidation withInboundTokenClaimName(String inboundTokenClaimName) {
        this.inboundTokenClaimName = inboundTokenClaimName;
        return this;
    }

    /**
     * **参数解释**：  要检查的自定义声明字段的名称。 **约束限制**: 不涉及。 **取值范围**： 长度为 1 - 255 个字符，只包含字母数字、下划线、点号、中划线和冒号。 **默认取值**: 不涉及。
     * @return inboundTokenClaimName
     */
    public String getInboundTokenClaimName() {
        return inboundTokenClaimName;
    }

    public void setInboundTokenClaimName(String inboundTokenClaimName) {
        this.inboundTokenClaimName = inboundTokenClaimName;
    }

    public CoreRunCustomClaimValidation withInboundTokenClaimValueType(
        InboundTokenClaimValueTypeEnum inboundTokenClaimValueType) {
        this.inboundTokenClaimValueType = inboundTokenClaimValueType;
        return this;
    }

    /**
     * **参数解释**：  要检查的声明值的数据类型。 - STRING: 表示字符串类型。 - STRING_ARRAY: 表示字符串数组类型。 **约束限制**: 不涉及。 **取值范围**： 长度为 1 - 12 个字符。 - STRING - STRING_ARRAY **默认取值**: 不涉及。
     * @return inboundTokenClaimValueType
     */
    public InboundTokenClaimValueTypeEnum getInboundTokenClaimValueType() {
        return inboundTokenClaimValueType;
    }

    public void setInboundTokenClaimValueType(InboundTokenClaimValueTypeEnum inboundTokenClaimValueType) {
        this.inboundTokenClaimValueType = inboundTokenClaimValueType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunCustomClaimValidation that = (CoreRunCustomClaimValidation) obj;
        return Objects.equals(this.authorizingClaimMatchValue, that.authorizingClaimMatchValue)
            && Objects.equals(this.inboundTokenClaimName, that.inboundTokenClaimName)
            && Objects.equals(this.inboundTokenClaimValueType, that.inboundTokenClaimValueType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizingClaimMatchValue, inboundTokenClaimName, inboundTokenClaimValueType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunCustomClaimValidation {\n");
        sb.append("    authorizingClaimMatchValue: ").append(toIndentedString(authorizingClaimMatchValue)).append("\n");
        sb.append("    inboundTokenClaimName: ").append(toIndentedString(inboundTokenClaimName)).append("\n");
        sb.append("    inboundTokenClaimValueType: ").append(toIndentedString(inboundTokenClaimValueType)).append("\n");
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
