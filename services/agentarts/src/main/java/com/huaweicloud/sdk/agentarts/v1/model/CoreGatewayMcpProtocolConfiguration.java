package com.huaweicloud.sdk.agentarts.v1.model;

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
 * MCP网关配置。
 */
public class CoreGatewayMcpProtocolConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_configuration")

    private CoreGatewaySearchConfiguration searchConfiguration;

    /**
     * Gets or Sets supportedVersions
     */
    public static final class SupportedVersionsEnum {

        /**
         * Enum _2025_03_26 for value: "2025-03-26"
         */
        public static final SupportedVersionsEnum _2025_03_26 = new SupportedVersionsEnum("2025-03-26");

        /**
         * Enum _2025_06_18 for value: "2025-06-18"
         */
        public static final SupportedVersionsEnum _2025_06_18 = new SupportedVersionsEnum("2025-06-18");

        /**
         * Enum _2025_11_25 for value: "2025-11-25"
         */
        public static final SupportedVersionsEnum _2025_11_25 = new SupportedVersionsEnum("2025-11-25");

        private static final Map<String, SupportedVersionsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupportedVersionsEnum> createStaticFields() {
            Map<String, SupportedVersionsEnum> map = new HashMap<>();
            map.put("2025-03-26", _2025_03_26);
            map.put("2025-06-18", _2025_06_18);
            map.put("2025-11-25", _2025_11_25);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupportedVersionsEnum(String value) {
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
        public static SupportedVersionsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SupportedVersionsEnum(value));
        }

        public static SupportedVersionsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupportedVersionsEnum) {
                return this.value.equals(((SupportedVersionsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_versions")

    private List<SupportedVersionsEnum> supportedVersions = null;

    public CoreGatewayMcpProtocolConfiguration withSearchConfiguration(
        CoreGatewaySearchConfiguration searchConfiguration) {
        this.searchConfiguration = searchConfiguration;
        return this;
    }

    public CoreGatewayMcpProtocolConfiguration withSearchConfiguration(
        Consumer<CoreGatewaySearchConfiguration> searchConfigurationSetter) {
        if (this.searchConfiguration == null) {
            this.searchConfiguration = new CoreGatewaySearchConfiguration();
            searchConfigurationSetter.accept(this.searchConfiguration);
        }

        return this;
    }

    /**
     * Get searchConfiguration
     * @return searchConfiguration
     */
    public CoreGatewaySearchConfiguration getSearchConfiguration() {
        return searchConfiguration;
    }

    public void setSearchConfiguration(CoreGatewaySearchConfiguration searchConfiguration) {
        this.searchConfiguration = searchConfiguration;
    }

    public CoreGatewayMcpProtocolConfiguration withSupportedVersions(List<SupportedVersionsEnum> supportedVersions) {
        this.supportedVersions = supportedVersions;
        return this;
    }

    public CoreGatewayMcpProtocolConfiguration addSupportedVersionsItem(SupportedVersionsEnum supportedVersionsItem) {
        if (this.supportedVersions == null) {
            this.supportedVersions = new ArrayList<>();
        }
        this.supportedVersions.add(supportedVersionsItem);
        return this;
    }

    public CoreGatewayMcpProtocolConfiguration withSupportedVersions(
        Consumer<List<SupportedVersionsEnum>> supportedVersionsSetter) {
        if (this.supportedVersions == null) {
            this.supportedVersions = new ArrayList<>();
        }
        supportedVersionsSetter.accept(this.supportedVersions);
        return this;
    }

    /**
     * MCP网关支持的协议版本列表。
     * @return supportedVersions
     */
    public List<SupportedVersionsEnum> getSupportedVersions() {
        return supportedVersions;
    }

    public void setSupportedVersions(List<SupportedVersionsEnum> supportedVersions) {
        this.supportedVersions = supportedVersions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayMcpProtocolConfiguration that = (CoreGatewayMcpProtocolConfiguration) obj;
        return Objects.equals(this.searchConfiguration, that.searchConfiguration)
            && Objects.equals(this.supportedVersions, that.supportedVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchConfiguration, supportedVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayMcpProtocolConfiguration {\n");
        sb.append("    searchConfiguration: ").append(toIndentedString(searchConfiguration)).append("\n");
        sb.append("    supportedVersions: ").append(toIndentedString(supportedVersions)).append("\n");
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
