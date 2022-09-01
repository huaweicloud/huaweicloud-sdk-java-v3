package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 服务开放的端口映射列表
 */
public class PortList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_port")

    @JacksonXmlProperty(localName = "client_port")

    private Integer clientPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_port")

    @JacksonXmlProperty(localName = "server_port")

    private Integer serverPort;

    /**
     * 端口映射协议，支持TCP。
     */
    public static final class ProtocolEnum {

        /**
         * Enum TCP for value: "TCP"
         */
        public static final ProtocolEnum TCP = new ProtocolEnum("TCP");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("TCP", TCP);
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
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtocolEnum(value);
            }
            return result;
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "protocol")

    private ProtocolEnum protocol;

    public PortList withClientPort(Integer clientPort) {
        this.clientPort = clientPort;
        return this;
    }

    /**
     * 终端节点访问的端口。 终端节点提供给用户，作为访问终端节 点服务的端口，范围1-65535。
     * @return clientPort
     */
    public Integer getClientPort() {
        return clientPort;
    }

    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    public PortList withServerPort(Integer serverPort) {
        this.serverPort = serverPort;
        return this;
    }

    /**
     * 终端节点服务的端口。 终端节点服务绑定了后端资源，作为提 供服务的端口，范围1-65535。
     * @return serverPort
     */
    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public PortList withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 端口映射协议，支持TCP。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PortList portList = (PortList) o;
        return Objects.equals(this.clientPort, portList.clientPort)
            && Objects.equals(this.serverPort, portList.serverPort) && Objects.equals(this.protocol, portList.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientPort, serverPort, protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortList {\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
