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
 * **参数解释**: 智能体调用相关配置。 
 */
public class CoreRunInvokeConfigResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    /**
     * **参数解释**: 智能体运行时支持的协议类型，默认值HTTP。 - HTTP: HTTP协议 - MCP: MCP协议 **约束限制**: 不涉及。 **取值范围**: 长度为 1 - 4 个字符。允许的值为： - HTTP - MCP **默认值**: HTTP 
     */
    public static final class ProtocolEnum {

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("HTTP");

        /**
         * Enum MCP for value: "MCP"
         */
        public static final ProtocolEnum MCP = new ProtocolEnum("MCP");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("MCP", MCP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_transfer_config")

    private CoreRunFileTransferConfig fileTransferConfig;

    /**
     * **参数解释**: 智能体运行时调用URL的匹配模式。 **取值范围**: - ACCURATE_MATCH - PREFIX_MATCH 
     */
    public static final class UrlMatchTypeEnum {

        /**
         * Enum ACCURATE_MATCH for value: "ACCURATE_MATCH"
         */
        public static final UrlMatchTypeEnum ACCURATE_MATCH = new UrlMatchTypeEnum("ACCURATE_MATCH");

        /**
         * Enum PREFIX_MATCH for value: "PREFIX_MATCH"
         */
        public static final UrlMatchTypeEnum PREFIX_MATCH = new UrlMatchTypeEnum("PREFIX_MATCH");

        private static final Map<String, UrlMatchTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UrlMatchTypeEnum> createStaticFields() {
            Map<String, UrlMatchTypeEnum> map = new HashMap<>();
            map.put("ACCURATE_MATCH", ACCURATE_MATCH);
            map.put("PREFIX_MATCH", PREFIX_MATCH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UrlMatchTypeEnum(String value) {
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
        public static UrlMatchTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UrlMatchTypeEnum(value));
        }

        public static UrlMatchTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UrlMatchTypeEnum) {
                return this.value.equals(((UrlMatchTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_match_type")

    private UrlMatchTypeEnum urlMatchType;

    public CoreRunInvokeConfigResp withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**: 智能体运行时监听的端口号，用于接收外部请求，默认值8080。 **约束限制**: 不涉及。 **取值范围**: 1 - 65535 **默认值**: 8080 
     * minimum: 1
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public CoreRunInvokeConfigResp withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释**: 智能体运行时支持的协议类型，默认值HTTP。 - HTTP: HTTP协议 - MCP: MCP协议 **约束限制**: 不涉及。 **取值范围**: 长度为 1 - 4 个字符。允许的值为： - HTTP - MCP **默认值**: HTTP 
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public CoreRunInvokeConfigResp withFileTransferConfig(CoreRunFileTransferConfig fileTransferConfig) {
        this.fileTransferConfig = fileTransferConfig;
        return this;
    }

    public CoreRunInvokeConfigResp withFileTransferConfig(
        Consumer<CoreRunFileTransferConfig> fileTransferConfigSetter) {
        if (this.fileTransferConfig == null) {
            this.fileTransferConfig = new CoreRunFileTransferConfig();
            fileTransferConfigSetter.accept(this.fileTransferConfig);
        }

        return this;
    }

    /**
     * Get fileTransferConfig
     * @return fileTransferConfig
     */
    public CoreRunFileTransferConfig getFileTransferConfig() {
        return fileTransferConfig;
    }

    public void setFileTransferConfig(CoreRunFileTransferConfig fileTransferConfig) {
        this.fileTransferConfig = fileTransferConfig;
    }

    public CoreRunInvokeConfigResp withUrlMatchType(UrlMatchTypeEnum urlMatchType) {
        this.urlMatchType = urlMatchType;
        return this;
    }

    /**
     * **参数解释**: 智能体运行时调用URL的匹配模式。 **取值范围**: - ACCURATE_MATCH - PREFIX_MATCH 
     * @return urlMatchType
     */
    public UrlMatchTypeEnum getUrlMatchType() {
        return urlMatchType;
    }

    public void setUrlMatchType(UrlMatchTypeEnum urlMatchType) {
        this.urlMatchType = urlMatchType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunInvokeConfigResp that = (CoreRunInvokeConfigResp) obj;
        return Objects.equals(this.port, that.port) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.fileTransferConfig, that.fileTransferConfig)
            && Objects.equals(this.urlMatchType, that.urlMatchType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, protocol, fileTransferConfig, urlMatchType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunInvokeConfigResp {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    fileTransferConfig: ").append(toIndentedString(fileTransferConfig)).append("\n");
        sb.append("    urlMatchType: ").append(toIndentedString(urlMatchType)).append("\n");
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
