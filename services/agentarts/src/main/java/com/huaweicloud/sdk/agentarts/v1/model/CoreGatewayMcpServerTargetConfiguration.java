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
 * **参数解释：** MCP目标服务配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreGatewayMcpServerTargetConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    /**
     * **参数解释：** MCP 服务器类型。 **约束限制：** 不涉及。 **取值范围：** - `sse`: 使用 Server-Sent Events 长连接 - `streamable_http`: 使用可流式 HTTP 请求 **默认取值：** 不涉及。 
     */
    public static final class ServerTypeEnum {

        /**
         * Enum SSE for value: "sse"
         */
        public static final ServerTypeEnum SSE = new ServerTypeEnum("sse");

        /**
         * Enum STREAMABLE_HTTP for value: "streamable_http"
         */
        public static final ServerTypeEnum STREAMABLE_HTTP = new ServerTypeEnum("streamable_http");

        private static final Map<String, ServerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServerTypeEnum> createStaticFields() {
            Map<String, ServerTypeEnum> map = new HashMap<>();
            map.put("sse", SSE);
            map.put("streamable_http", STREAMABLE_HTTP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServerTypeEnum(String value) {
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
        public static ServerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServerTypeEnum(value));
        }

        public static ServerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServerTypeEnum) {
                return this.value.equals(((ServerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private ServerTypeEnum serverType;

    public CoreGatewayMcpServerTargetConfiguration withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * **参数解释：** MCP服务器端点 URL。 **约束限制：** 不涉及。 **取值范围：** 长度为 1-512个字符，匹配以 https:// 开头的任意字符串，符合正则条件https://.*。 **默认取值：** 不涉及。 
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public CoreGatewayMcpServerTargetConfiguration withServerType(ServerTypeEnum serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * **参数解释：** MCP 服务器类型。 **约束限制：** 不涉及。 **取值范围：** - `sse`: 使用 Server-Sent Events 长连接 - `streamable_http`: 使用可流式 HTTP 请求 **默认取值：** 不涉及。 
     * @return serverType
     */
    public ServerTypeEnum getServerType() {
        return serverType;
    }

    public void setServerType(ServerTypeEnum serverType) {
        this.serverType = serverType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayMcpServerTargetConfiguration that = (CoreGatewayMcpServerTargetConfiguration) obj;
        return Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.serverType, that.serverType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, serverType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayMcpServerTargetConfiguration {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
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
