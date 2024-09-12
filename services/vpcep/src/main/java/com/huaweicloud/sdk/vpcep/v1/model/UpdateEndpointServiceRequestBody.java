package com.huaweicloud.sdk.vpcep.v1.model;

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
 * 修改终端节点服务接口请求结构体
 */
public class UpdateEndpointServiceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_enabled")

    private Boolean approvalEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<PortList> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    /**
     * 用于控制将哪些信息（如客户端的源IP、源端口、marker_id等）携带到服务端。 支持携带的客户端信息包括如下两种类型：  - TCP TOA：表示将客户端信息插入到tcp option字段中携带至服务端。 说明：仅当后端资源为OBS时，支持TCP TOA类型信息携带方式。  - Proxy Protocol：表示将客户端信息插入到tcp payload字段中携带至服务端。 仅当服务端支持解析上述字段时，该参数设置才有效。 该参数的取值包括：  - close：表示关闭代理协议。  - toa_open：表示开启代理协议“tcp_toa”。  - proxy_open：表示开启代理协议“proxy_protocol”。  - open：表示同时开启代理协议“tcp_toa”和“proxy_protocol”。 默认值为“close”。
     */
    public static final class TcpProxyEnum {

        /**
         * Enum CLOSE for value: "close"
         */
        public static final TcpProxyEnum CLOSE = new TcpProxyEnum("close");

        /**
         * Enum TOA_OPEN for value: "toa_open"
         */
        public static final TcpProxyEnum TOA_OPEN = new TcpProxyEnum("toa_open");

        /**
         * Enum PROXY_OPEN for value: "proxy_open"
         */
        public static final TcpProxyEnum PROXY_OPEN = new TcpProxyEnum("proxy_open");

        /**
         * Enum OPEN for value: "open"
         */
        public static final TcpProxyEnum OPEN = new TcpProxyEnum("open");

        /**
         * Enum PROXY_VNI for value: "proxy_vni"
         */
        public static final TcpProxyEnum PROXY_VNI = new TcpProxyEnum("proxy_vni");

        private static final Map<String, TcpProxyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TcpProxyEnum> createStaticFields() {
            Map<String, TcpProxyEnum> map = new HashMap<>();
            map.put("close", CLOSE);
            map.put("toa_open", TOA_OPEN);
            map.put("proxy_open", PROXY_OPEN);
            map.put("open", OPEN);
            map.put("proxy_vni", PROXY_VNI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TcpProxyEnum(String value) {
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
        public static TcpProxyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TcpProxyEnum(value));
        }

        public static TcpProxyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TcpProxyEnum) {
                return this.value.equals(((TcpProxyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcp_proxy")

    private TcpProxyEnum tcpProxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    public UpdateEndpointServiceRequestBody withApprovalEnabled(Boolean approvalEnabled) {
        this.approvalEnabled = approvalEnabled;
        return this;
    }

    /**
     * 是否需要审批。  - false：不需审批，创建的终端节点连接直接为accepted状态。  - true：需审批，创建的终端节点连接需要终端节点服务所属用户审核后方可使用。 默认为true，需要审批。
     * @return approvalEnabled
     */
    public Boolean getApprovalEnabled() {
        return approvalEnabled;
    }

    public void setApprovalEnabled(Boolean approvalEnabled) {
        this.approvalEnabled = approvalEnabled;
    }

    public UpdateEndpointServiceRequestBody withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 终端节点服务的名称，长度不大于16，允许传入大小写字母、数字、下划线、中划线。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public UpdateEndpointServiceRequestBody withPorts(List<PortList> ports) {
        this.ports = ports;
        return this;
    }

    public UpdateEndpointServiceRequestBody addPortsItem(PortList portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public UpdateEndpointServiceRequestBody withPorts(Consumer<List<PortList>> portsSetter) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    /**
     * 服务开放的端口映射列表，同一个终端节点服务下，不允许重复的端口映射。 若多个终端节点服务共用一个port_id， 则终端节点之间服务的所有端口映射的server_port和protocol的组合不能重复， 单次最多添加200个。 该参数值将被全量更新。
     * @return ports
     */
    public List<PortList> getPorts() {
        return ports;
    }

    public void setPorts(List<PortList> ports) {
        this.ports = ports;
    }

    public UpdateEndpointServiceRequestBody withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 弹性云服务器IP地址对应的网卡ID
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public UpdateEndpointServiceRequestBody withTcpProxy(TcpProxyEnum tcpProxy) {
        this.tcpProxy = tcpProxy;
        return this;
    }

    /**
     * 用于控制将哪些信息（如客户端的源IP、源端口、marker_id等）携带到服务端。 支持携带的客户端信息包括如下两种类型：  - TCP TOA：表示将客户端信息插入到tcp option字段中携带至服务端。 说明：仅当后端资源为OBS时，支持TCP TOA类型信息携带方式。  - Proxy Protocol：表示将客户端信息插入到tcp payload字段中携带至服务端。 仅当服务端支持解析上述字段时，该参数设置才有效。 该参数的取值包括：  - close：表示关闭代理协议。  - toa_open：表示开启代理协议“tcp_toa”。  - proxy_open：表示开启代理协议“proxy_protocol”。  - open：表示同时开启代理协议“tcp_toa”和“proxy_protocol”。 默认值为“close”。
     * @return tcpProxy
     */
    public TcpProxyEnum getTcpProxy() {
        return tcpProxy;
    }

    public void setTcpProxy(TcpProxyEnum tcpProxy) {
        this.tcpProxy = tcpProxy;
    }

    public UpdateEndpointServiceRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述字段，支持中英文字母、数字等字符，不支持“<”或“>”字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateEndpointServiceRequestBody withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 接口型VLAN场景服务端IPv4地址或域名
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEndpointServiceRequestBody that = (UpdateEndpointServiceRequestBody) obj;
        return Objects.equals(this.approvalEnabled, that.approvalEnabled)
            && Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.ports, that.ports)
            && Objects.equals(this.portId, that.portId) && Objects.equals(this.tcpProxy, that.tcpProxy)
            && Objects.equals(this.description, that.description) && Objects.equals(this.ip, that.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvalEnabled, serviceName, ports, portId, tcpProxy, description, ip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointServiceRequestBody {\n");
        sb.append("    approvalEnabled: ").append(toIndentedString(approvalEnabled)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    tcpProxy: ").append(toIndentedString(tcpProxy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
