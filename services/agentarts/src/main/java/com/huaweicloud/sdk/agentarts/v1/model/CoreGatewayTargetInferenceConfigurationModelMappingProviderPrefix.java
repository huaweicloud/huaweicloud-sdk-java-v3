package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 前缀配置。
 */
public class CoreGatewayTargetInferenceConfigurationModelMappingProviderPrefix {

    /**
     * 分隔符。
     */
    public static final class SeparatorEnum {

        /**
         * Enum PERIOD for value: "."
         */
        public static final SeparatorEnum PERIOD = new SeparatorEnum(".");

        /**
         * Enum SLASH for value: "/"
         */
        public static final SeparatorEnum SLASH = new SeparatorEnum("/");

        private static final Map<String, SeparatorEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeparatorEnum> createStaticFields() {
            Map<String, SeparatorEnum> map = new HashMap<>();
            map.put(".", PERIOD);
            map.put("/", SLASH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeparatorEnum(String value) {
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
        public static SeparatorEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeparatorEnum(value));
        }

        public static SeparatorEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeparatorEnum) {
                return this.value.equals(((SeparatorEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "separator")

    private SeparatorEnum separator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strip")

    private Boolean strip;

    public CoreGatewayTargetInferenceConfigurationModelMappingProviderPrefix withSeparator(SeparatorEnum separator) {
        this.separator = separator;
        return this;
    }

    /**
     * 分隔符。
     * @return separator
     */
    public SeparatorEnum getSeparator() {
        return separator;
    }

    public void setSeparator(SeparatorEnum separator) {
        this.separator = separator;
    }

    public CoreGatewayTargetInferenceConfigurationModelMappingProviderPrefix withStrip(Boolean strip) {
        this.strip = strip;
        return this;
    }

    /**
     * 是否去除前缀。
     * @return strip
     */
    public Boolean getStrip() {
        return strip;
    }

    public void setStrip(Boolean strip) {
        this.strip = strip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayTargetInferenceConfigurationModelMappingProviderPrefix that =
            (CoreGatewayTargetInferenceConfigurationModelMappingProviderPrefix) obj;
        return Objects.equals(this.separator, that.separator) && Objects.equals(this.strip, that.strip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(separator, strip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayTargetInferenceConfigurationModelMappingProviderPrefix {\n");
        sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
        sb.append("    strip: ").append(toIndentedString(strip)).append("\n");
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
