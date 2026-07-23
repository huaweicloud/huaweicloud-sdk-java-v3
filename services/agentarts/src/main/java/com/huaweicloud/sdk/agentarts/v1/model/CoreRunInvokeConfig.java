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
 * **参数解释**: 智能体调用相关配置。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
 */
public class CoreRunInvokeConfig {

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

    public CoreRunInvokeConfig withPort(Integer port) {
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

    public CoreRunInvokeConfig withProtocol(ProtocolEnum protocol) {
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

    public CoreRunInvokeConfig withFileTransferConfig(CoreRunFileTransferConfig fileTransferConfig) {
        this.fileTransferConfig = fileTransferConfig;
        return this;
    }

    public CoreRunInvokeConfig withFileTransferConfig(Consumer<CoreRunFileTransferConfig> fileTransferConfigSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunInvokeConfig that = (CoreRunInvokeConfig) obj;
        return Objects.equals(this.port, that.port) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.fileTransferConfig, that.fileTransferConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, protocol, fileTransferConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunInvokeConfig {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    fileTransferConfig: ").append(toIndentedString(fileTransferConfig)).append("\n");
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
