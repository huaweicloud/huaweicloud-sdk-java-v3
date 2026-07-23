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
 * 自定义声明验证配置。
 */
public class CoreGatewayCustomClaimValidation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inbound_token_claim_name")

    private String inboundTokenClaimName;

    /**
     * 入站令牌声明值类型。
     */
    public static final class InboundTokenClaimValueTypeEnum {

        /**
         * Enum STRING for value: "string"
         */
        public static final InboundTokenClaimValueTypeEnum STRING = new InboundTokenClaimValueTypeEnum("string");

        /**
         * Enum STRING_ARRAY for value: "string_array"
         */
        public static final InboundTokenClaimValueTypeEnum STRING_ARRAY =
            new InboundTokenClaimValueTypeEnum("string_array");

        private static final Map<String, InboundTokenClaimValueTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InboundTokenClaimValueTypeEnum> createStaticFields() {
            Map<String, InboundTokenClaimValueTypeEnum> map = new HashMap<>();
            map.put("string", STRING);
            map.put("string_array", STRING_ARRAY);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizing_claim_match_value")

    private CoreGatewayAuthorizingClaimMatchValue authorizingClaimMatchValue;

    public CoreGatewayCustomClaimValidation withInboundTokenClaimName(String inboundTokenClaimName) {
        this.inboundTokenClaimName = inboundTokenClaimName;
        return this;
    }

    /**
     * 声明名称。
     * @return inboundTokenClaimName
     */
    public String getInboundTokenClaimName() {
        return inboundTokenClaimName;
    }

    public void setInboundTokenClaimName(String inboundTokenClaimName) {
        this.inboundTokenClaimName = inboundTokenClaimName;
    }

    public CoreGatewayCustomClaimValidation withInboundTokenClaimValueType(
        InboundTokenClaimValueTypeEnum inboundTokenClaimValueType) {
        this.inboundTokenClaimValueType = inboundTokenClaimValueType;
        return this;
    }

    /**
     * 入站令牌声明值类型。
     * @return inboundTokenClaimValueType
     */
    public InboundTokenClaimValueTypeEnum getInboundTokenClaimValueType() {
        return inboundTokenClaimValueType;
    }

    public void setInboundTokenClaimValueType(InboundTokenClaimValueTypeEnum inboundTokenClaimValueType) {
        this.inboundTokenClaimValueType = inboundTokenClaimValueType;
    }

    public CoreGatewayCustomClaimValidation withAuthorizingClaimMatchValue(
        CoreGatewayAuthorizingClaimMatchValue authorizingClaimMatchValue) {
        this.authorizingClaimMatchValue = authorizingClaimMatchValue;
        return this;
    }

    public CoreGatewayCustomClaimValidation withAuthorizingClaimMatchValue(
        Consumer<CoreGatewayAuthorizingClaimMatchValue> authorizingClaimMatchValueSetter) {
        if (this.authorizingClaimMatchValue == null) {
            this.authorizingClaimMatchValue = new CoreGatewayAuthorizingClaimMatchValue();
            authorizingClaimMatchValueSetter.accept(this.authorizingClaimMatchValue);
        }

        return this;
    }

    /**
     * Get authorizingClaimMatchValue
     * @return authorizingClaimMatchValue
     */
    public CoreGatewayAuthorizingClaimMatchValue getAuthorizingClaimMatchValue() {
        return authorizingClaimMatchValue;
    }

    public void setAuthorizingClaimMatchValue(CoreGatewayAuthorizingClaimMatchValue authorizingClaimMatchValue) {
        this.authorizingClaimMatchValue = authorizingClaimMatchValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayCustomClaimValidation that = (CoreGatewayCustomClaimValidation) obj;
        return Objects.equals(this.inboundTokenClaimName, that.inboundTokenClaimName)
            && Objects.equals(this.inboundTokenClaimValueType, that.inboundTokenClaimValueType)
            && Objects.equals(this.authorizingClaimMatchValue, that.authorizingClaimMatchValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inboundTokenClaimName, inboundTokenClaimValueType, authorizingClaimMatchValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayCustomClaimValidation {\n");
        sb.append("    inboundTokenClaimName: ").append(toIndentedString(inboundTokenClaimName)).append("\n");
        sb.append("    inboundTokenClaimValueType: ").append(toIndentedString(inboundTokenClaimValueType)).append("\n");
        sb.append("    authorizingClaimMatchValue: ").append(toIndentedString(authorizingClaimMatchValue)).append("\n");
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
