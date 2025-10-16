package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateElbClusterPortRequestBody
 */
public class CreateElbClusterPortRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_id")

    private String elbId;

    /**
     * 新增的端口的模式。除了VPN外，其他类型的服务只支持 PROXY
     */
    public static final class ModeEnum {

        /**
         * Enum TUNNEL for value: "TUNNEL"
         */
        public static final ModeEnum TUNNEL = new ModeEnum("TUNNEL");

        /**
         * Enum PROXY for value: "PROXY"
         */
        public static final ModeEnum PROXY = new ModeEnum("PROXY");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("TUNNEL", TUNNEL);
            map.put("PROXY", PROXY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lb_listener_port")

    private Integer lbListenerPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_port")

    private Integer serverPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_lb_listener_port")

    private Integer tunnelLbListenerPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunnel_server_port")

    private Integer tunnelServerPort;

    public CreateElbClusterPortRequestBody withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateElbClusterPortRequestBody withElbId(String elbId) {
        this.elbId = elbId;
        return this;
    }

    /**
     * elb id。端口映射将会在该elb中创建
     * @return elbId
     */
    public String getElbId() {
        return elbId;
    }

    public void setElbId(String elbId) {
        this.elbId = elbId;
    }

    public CreateElbClusterPortRequestBody withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 新增的端口的模式。除了VPN外，其他类型的服务只支持 PROXY
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public CreateElbClusterPortRequestBody withLbListenerPort(Integer lbListenerPort) {
        this.lbListenerPort = lbListenerPort;
        return this;
    }

    /**
     * 将在elb中为代理通道创建的监听器的端口
     * minimum: 1
     * maximum: 65535
     * @return lbListenerPort
     */
    public Integer getLbListenerPort() {
        return lbListenerPort;
    }

    public void setLbListenerPort(Integer lbListenerPort) {
        this.lbListenerPort = lbListenerPort;
    }

    public CreateElbClusterPortRequestBody withServerPort(Integer serverPort) {
        this.serverPort = serverPort;
        return this;
    }

    /**
     * 将在elb中为代理通道创建的后端服务组中后端服务器的端口。无默认值。
     * minimum: 1
     * maximum: 65535
     * @return serverPort
     */
    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public CreateElbClusterPortRequestBody withTunnelLbListenerPort(Integer tunnelLbListenerPort) {
        this.tunnelLbListenerPort = tunnelLbListenerPort;
        return this;
    }

    /**
     * 将在elb中给VPN隧道创建的监听器的端口。当mode=TUNNEL时，必填
     * minimum: 1
     * maximum: 65535
     * @return tunnelLbListenerPort
     */
    public Integer getTunnelLbListenerPort() {
        return tunnelLbListenerPort;
    }

    public void setTunnelLbListenerPort(Integer tunnelLbListenerPort) {
        this.tunnelLbListenerPort = tunnelLbListenerPort;
    }

    public CreateElbClusterPortRequestBody withTunnelServerPort(Integer tunnelServerPort) {
        this.tunnelServerPort = tunnelServerPort;
        return this;
    }

    /**
     * 将在elb中给VPN隧道创建的后端服务组中后端服务器的端口。 当mode=TUNNEL时，必填，有默认值:20706。
     * minimum: 1
     * maximum: 65535
     * @return tunnelServerPort
     */
    public Integer getTunnelServerPort() {
        return tunnelServerPort;
    }

    public void setTunnelServerPort(Integer tunnelServerPort) {
        this.tunnelServerPort = tunnelServerPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateElbClusterPortRequestBody that = (CreateElbClusterPortRequestBody) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.elbId, that.elbId)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.lbListenerPort, that.lbListenerPort)
            && Objects.equals(this.serverPort, that.serverPort)
            && Objects.equals(this.tunnelLbListenerPort, that.tunnelLbListenerPort)
            && Objects.equals(this.tunnelServerPort, that.tunnelServerPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, elbId, mode, lbListenerPort, serverPort, tunnelLbListenerPort, tunnelServerPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateElbClusterPortRequestBody {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    elbId: ").append(toIndentedString(elbId)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    lbListenerPort: ").append(toIndentedString(lbListenerPort)).append("\n");
        sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
        sb.append("    tunnelLbListenerPort: ").append(toIndentedString(tunnelLbListenerPort)).append("\n");
        sb.append("    tunnelServerPort: ").append(toIndentedString(tunnelServerPort)).append("\n");
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
