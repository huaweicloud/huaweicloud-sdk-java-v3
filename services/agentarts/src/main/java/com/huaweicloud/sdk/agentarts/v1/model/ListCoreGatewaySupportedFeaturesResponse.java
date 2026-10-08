package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCoreGatewaySupportedFeaturesResponse extends SdkResponse {

    /**
     * **参数解释：** 网关支持的特性名称。 - 'inference_target': 支持创建推理目标 - 'session_management': 支持会话管理 - 'mcp_protocol_versions': 支持选择MCP协议版本 - 'targets_status_management': 支持目标状态管理 - 'semantic_search': 支持语义检索 - 'debug': 支持调测能力 **取值范围：** 长度为1-36个字符。 
     */
    public static final class SupportedFeaturesEnum {

        /**
         * Enum INFERENCE_TARGET for value: "inference_target"
         */
        public static final SupportedFeaturesEnum INFERENCE_TARGET = new SupportedFeaturesEnum("inference_target");

        /**
         * Enum SESSION_MANAGEMENT for value: "session_management"
         */
        public static final SupportedFeaturesEnum SESSION_MANAGEMENT = new SupportedFeaturesEnum("session_management");

        /**
         * Enum MCP_PROTOCOL_VERSIONS for value: "mcp_protocol_versions"
         */
        public static final SupportedFeaturesEnum MCP_PROTOCOL_VERSIONS =
            new SupportedFeaturesEnum("mcp_protocol_versions");

        /**
         * Enum TARGETS_STATUS_MANAGEMENT for value: "targets_status_management"
         */
        public static final SupportedFeaturesEnum TARGETS_STATUS_MANAGEMENT =
            new SupportedFeaturesEnum("targets_status_management");

        /**
         * Enum SEMANTIC_SEARCH for value: "semantic_search"
         */
        public static final SupportedFeaturesEnum SEMANTIC_SEARCH = new SupportedFeaturesEnum("semantic_search");

        /**
         * Enum DEBUG for value: "debug"
         */
        public static final SupportedFeaturesEnum DEBUG = new SupportedFeaturesEnum("debug");

        private static final Map<String, SupportedFeaturesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupportedFeaturesEnum> createStaticFields() {
            Map<String, SupportedFeaturesEnum> map = new HashMap<>();
            map.put("inference_target", INFERENCE_TARGET);
            map.put("session_management", SESSION_MANAGEMENT);
            map.put("mcp_protocol_versions", MCP_PROTOCOL_VERSIONS);
            map.put("targets_status_management", TARGETS_STATUS_MANAGEMENT);
            map.put("semantic_search", SEMANTIC_SEARCH);
            map.put("debug", DEBUG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupportedFeaturesEnum(String value) {
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
        public static SupportedFeaturesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SupportedFeaturesEnum(value));
        }

        public static SupportedFeaturesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupportedFeaturesEnum) {
                return this.value.equals(((SupportedFeaturesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_features")

    private List<SupportedFeaturesEnum> supportedFeatures = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListCoreGatewaySupportedFeaturesResponse withSupportedFeatures(
        List<SupportedFeaturesEnum> supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
        return this;
    }

    public ListCoreGatewaySupportedFeaturesResponse addSupportedFeaturesItem(
        SupportedFeaturesEnum supportedFeaturesItem) {
        if (this.supportedFeatures == null) {
            this.supportedFeatures = new ArrayList<>();
        }
        this.supportedFeatures.add(supportedFeaturesItem);
        return this;
    }

    public ListCoreGatewaySupportedFeaturesResponse withSupportedFeatures(
        Consumer<List<SupportedFeaturesEnum>> supportedFeaturesSetter) {
        if (this.supportedFeatures == null) {
            this.supportedFeatures = new ArrayList<>();
        }
        supportedFeaturesSetter.accept(this.supportedFeatures);
        return this;
    }

    /**
     * **参数解释：** 网关支持的特性列表。 **取值范围：** 数组长度为1-100个。 
     * @return supportedFeatures
     */
    public List<SupportedFeaturesEnum> getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(List<SupportedFeaturesEnum> supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }

    public ListCoreGatewaySupportedFeaturesResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释：** 当前页返回的特性数量。 **取值范围：** 取值为 0-100个。 
     * minimum: 0
     * maximum: 100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListCoreGatewaySupportedFeaturesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 特性总数。 **取值范围：** 取值为 0-1000000个。 
     * minimum: 0
     * maximum: 1000000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCoreGatewaySupportedFeaturesResponse that = (ListCoreGatewaySupportedFeaturesResponse) obj;
        return Objects.equals(this.supportedFeatures, that.supportedFeatures) && Objects.equals(this.size, that.size)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportedFeatures, size, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCoreGatewaySupportedFeaturesResponse {\n");
        sb.append("    supportedFeatures: ").append(toIndentedString(supportedFeatures)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
