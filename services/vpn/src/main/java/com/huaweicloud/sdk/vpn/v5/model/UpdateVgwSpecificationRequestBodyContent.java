package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateVgwSpecificationRequestBodyContent
 */
public class UpdateVgwSpecificationRequestBodyContent {

    /**
     * 修改后的VPN网关的规格类型
     */
    public static final class FlavorEnum {

        /**
         * Enum BASIC for value: "Basic"
         */
        public static final FlavorEnum BASIC = new FlavorEnum("Basic");

        /**
         * Enum PROFESSIONAL1 for value: "Professional1"
         */
        public static final FlavorEnum PROFESSIONAL1 = new FlavorEnum("Professional1");

        /**
         * Enum PROFESSIONAL2 for value: "Professional2"
         */
        public static final FlavorEnum PROFESSIONAL2 = new FlavorEnum("Professional2");

        /**
         * Enum PROFESSIONAL1_NONFIXEDIP for value: "Professional1-NonFixedIP"
         */
        public static final FlavorEnum PROFESSIONAL1_NONFIXEDIP = new FlavorEnum("Professional1-NonFixedIP");

        /**
         * Enum PROFESSIONAL2_NONFIXEDIP for value: "Professional2-NonFixedIP"
         */
        public static final FlavorEnum PROFESSIONAL2_NONFIXEDIP = new FlavorEnum("Professional2-NonFixedIP");

        private static final Map<String, FlavorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FlavorEnum> createStaticFields() {
            Map<String, FlavorEnum> map = new HashMap<>();
            map.put("Basic", BASIC);
            map.put("Professional1", PROFESSIONAL1);
            map.put("Professional2", PROFESSIONAL2);
            map.put("Professional1-NonFixedIP", PROFESSIONAL1_NONFIXEDIP);
            map.put("Professional2-NonFixedIP", PROFESSIONAL2_NONFIXEDIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FlavorEnum(String value) {
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
        public static FlavorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlavorEnum(value));
        }

        public static FlavorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FlavorEnum) {
                return this.value.equals(((FlavorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorEnum flavor;

    public UpdateVgwSpecificationRequestBodyContent withFlavor(FlavorEnum flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 修改后的VPN网关的规格类型
     * @return flavor
     */
    public FlavorEnum getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorEnum flavor) {
        this.flavor = flavor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVgwSpecificationRequestBodyContent that = (UpdateVgwSpecificationRequestBodyContent) obj;
        return Objects.equals(this.flavor, that.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVgwSpecificationRequestBodyContent {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
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
