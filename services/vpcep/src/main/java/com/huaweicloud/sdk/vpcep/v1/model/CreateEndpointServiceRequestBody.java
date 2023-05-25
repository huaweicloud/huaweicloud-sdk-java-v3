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
 * 创建终端节点服务接口请求结构体
 */
public class CreateEndpointServiceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_enabled")

    private Boolean approvalEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    /**
     * 资源类型。 ● VM：云服务器，适用于作为服务器使用。 ● VIP：虚拟IP，适用于作为虚IP场景使用。（该字段已废弃，请优先使用LB类型） ● LB：负载均衡，适用于高访问量业务和对可靠性和容灾性要求较高的业务。
     */
    public static final class ServerTypeEnum {

        /**
         * Enum VM for value: "VM"
         */
        public static final ServerTypeEnum VM = new ServerTypeEnum("VM");

        /**
         * Enum VIP for value: "VIP"
         */
        public static final ServerTypeEnum VIP = new ServerTypeEnum("VIP");

        /**
         * Enum LB for value: "LB"
         */
        public static final ServerTypeEnum LB = new ServerTypeEnum("LB");

        private static final Map<String, ServerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServerTypeEnum> createStaticFields() {
            Map<String, ServerTypeEnum> map = new HashMap<>();
            map.put("VM", VM);
            map.put("VIP", VIP);
            map.put("LB", LB);
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
            ServerTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ServerTypeEnum(value);
            }
            return result;
        }

        public static ServerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ServerTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<PortList> ports = null;

    /**
    * 用于控制将哪些信息（如客户端的源IP、源端口、marker_id等）携带到服务端。 支持携带的客户端信息包括如下两种类型： ● TCP TOA：表示将客户端信息插入到tcp option字段中携带至服务端。 说明：仅当后端资源为OBS时，支持TCP TOA类型信息携带方式。 ● Proxy Protocol：表示将客户端信息插入到tcp payload字段中携带至服务端。 仅当服务端支持解析上述字段时，该参数设置才有效。 该参数的取值包括： ● close：表示关闭代理协议。 ● toa_open：表示开启代理协议“tcp_toa”。 ● proxy_open：表示开启代理协议“proxy_protocol”。 ● open：表示同时开启代理协议“tcp_toa”和“proxy_protocol”。 ● proxy_vni: 关闭toa，开启proxy和vni。 默认值为“close”。
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
            TcpProxyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TcpProxyEnum(value);
            }
            return result;
        }

        public static TcpProxyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TcpProxyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "tags")

    private List<TagList> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_policy")

    private Boolean enablePolicy;

    public CreateEndpointServiceRequestBody withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 标识终端节点服务后端资源的ID， 格式为通用唯一识别码（Universally Unique Identifier，下文简称UUID）。 取值为： ● LB类型：负载均衡器内网IP对应的端口ID。 详细内容请参考《弹性负载均衡API参考》中的“查询负载均衡详情”。 ● VM类型：弹性云服务器IP地址对应的网卡ID。 详细内容请参考《弹性云服务器API参考》中的“查询云服务器网卡信息”， 详见响应消息中的“port_id”字段。 ● VIP类型：虚拟IP所在虚拟机的网卡ID（VIP类型业务已不支持，该取值类型已废弃） 说明： ● 创建终端节点服务时，VPC的子网网段不能与198.19.128.0/17重叠。 ● VPC路由表中自定义路由的目的地址不能与198.19.128.0/17重叠。
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public CreateEndpointServiceRequestBody withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 终端节点服务的名称，长度不大于16，允许传入大小写字母、数字、下划线、中划线。 ● 传入为空，存入值为regionName+.+serviceId ● 传入不为空并校验通过，存入值为regionName+.+serviceName+.+serviceId
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public CreateEndpointServiceRequestBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 终端节点服务对应后端资源所在的VPC的ID。 详细内容请参考《虚拟私有云API参考》中的“查询VPC”，详见响应消息中的“id”字段。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateEndpointServiceRequestBody withApprovalEnabled(Boolean approvalEnabled) {
        this.approvalEnabled = approvalEnabled;
        return this;
    }

    /**
     * 是否需要审批。 ● false：不需要审批，创建的终端节点连接直接为accepted状态。 ● true：需要审批，创建的终端节点连接为pendingAcceptance状态， 需要终端节点服务所属用户审核后方可使用。 默认为true，需要审批。
     * @return approvalEnabled
     */
    public Boolean getApprovalEnabled() {
        return approvalEnabled;
    }

    public void setApprovalEnabled(Boolean approvalEnabled) {
        this.approvalEnabled = approvalEnabled;
    }

    public CreateEndpointServiceRequestBody withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 终端节点服务类型。 仅支持将用户私有服务创建为interface类型的终端节点服务。 终端节点服务类型包括“网关（gateway）型”和“接口（interface）型”： ● gateway：由运维人员配置。用户无需创建，可直接使用。 ● interface：包括运维人员配置的云服务和用户自己创建的私有服务。 其中，运维人员配置的云服务无需创建， 用户可直接使用。 您可以通过查询公共终端节点服务列表， 查看由运维人员配置的所有用户可见且可连接的终端节点服务， 并通过创建终端节点创建访问Gateway和Interface类型终端节点服务的终端节点。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public CreateEndpointServiceRequestBody withServerType(ServerTypeEnum serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * 资源类型。 ● VM：云服务器，适用于作为服务器使用。 ● VIP：虚拟IP，适用于作为虚IP场景使用。（该字段已废弃，请优先使用LB类型） ● LB：负载均衡，适用于高访问量业务和对可靠性和容灾性要求较高的业务。
     * @return serverType
     */
    public ServerTypeEnum getServerType() {
        return serverType;
    }

    public void setServerType(ServerTypeEnum serverType) {
        this.serverType = serverType;
    }

    public CreateEndpointServiceRequestBody withPorts(List<PortList> ports) {
        this.ports = ports;
        return this;
    }

    public CreateEndpointServiceRequestBody addPortsItem(PortList portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public CreateEndpointServiceRequestBody withPorts(Consumer<List<PortList>> portsSetter) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    /**
     * 服务开放的端口映射列表，详细内容请参见表4-10。 同一个终端节点服务下，不允许重复的端口映射。若多个终端节点服务共用一个port_id， 则终端节点服务之间的所有端口映射的server_port和protocol的组合不能重复， 单次最多添加200个。
     * @return ports
     */
    public List<PortList> getPorts() {
        return ports;
    }

    public void setPorts(List<PortList> ports) {
        this.ports = ports;
    }

    public CreateEndpointServiceRequestBody withTcpProxy(TcpProxyEnum tcpProxy) {
        this.tcpProxy = tcpProxy;
        return this;
    }

    /**
     * 用于控制将哪些信息（如客户端的源IP、源端口、marker_id等）携带到服务端。 支持携带的客户端信息包括如下两种类型： ● TCP TOA：表示将客户端信息插入到tcp option字段中携带至服务端。 说明：仅当后端资源为OBS时，支持TCP TOA类型信息携带方式。 ● Proxy Protocol：表示将客户端信息插入到tcp payload字段中携带至服务端。 仅当服务端支持解析上述字段时，该参数设置才有效。 该参数的取值包括： ● close：表示关闭代理协议。 ● toa_open：表示开启代理协议“tcp_toa”。 ● proxy_open：表示开启代理协议“proxy_protocol”。 ● open：表示同时开启代理协议“tcp_toa”和“proxy_protocol”。 ● proxy_vni: 关闭toa，开启proxy和vni。 默认值为“close”。
     * @return tcpProxy
     */
    public TcpProxyEnum getTcpProxy() {
        return tcpProxy;
    }

    public void setTcpProxy(TcpProxyEnum tcpProxy) {
        this.tcpProxy = tcpProxy;
    }

    public CreateEndpointServiceRequestBody withTags(List<TagList> tags) {
        this.tags = tags;
        return this;
    }

    public CreateEndpointServiceRequestBody addTagsItem(TagList tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateEndpointServiceRequestBody withTags(Consumer<List<TagList>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签列表。同一个终端节点服务最多可添加10个标签。
     * @return tags
     */
    public List<TagList> getTags() {
        return tags;
    }

    public void setTags(List<TagList> tags) {
        this.tags = tags;
    }

    public CreateEndpointServiceRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述字段，支持中英文字母、数字等字符，不支持“<”或“>”字符。  描述字段，支持中英文字母、数字等字符，不支持“<”或“>”字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateEndpointServiceRequestBody withEnablePolicy(Boolean enablePolicy) {
        this.enablePolicy = enablePolicy;
        return this;
    }

    /**
     * 是否开启终端节点策略。 ● false：不支持设置终端节点策略 ● true：支持设置终端节点策略 默认为false
     * @return enablePolicy
     */
    public Boolean getEnablePolicy() {
        return enablePolicy;
    }

    public void setEnablePolicy(Boolean enablePolicy) {
        this.enablePolicy = enablePolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEndpointServiceRequestBody createEndpointServiceRequestBody = (CreateEndpointServiceRequestBody) o;
        return Objects.equals(this.portId, createEndpointServiceRequestBody.portId)
            && Objects.equals(this.serviceName, createEndpointServiceRequestBody.serviceName)
            && Objects.equals(this.vpcId, createEndpointServiceRequestBody.vpcId)
            && Objects.equals(this.approvalEnabled, createEndpointServiceRequestBody.approvalEnabled)
            && Objects.equals(this.serviceType, createEndpointServiceRequestBody.serviceType)
            && Objects.equals(this.serverType, createEndpointServiceRequestBody.serverType)
            && Objects.equals(this.ports, createEndpointServiceRequestBody.ports)
            && Objects.equals(this.tcpProxy, createEndpointServiceRequestBody.tcpProxy)
            && Objects.equals(this.tags, createEndpointServiceRequestBody.tags)
            && Objects.equals(this.description, createEndpointServiceRequestBody.description)
            && Objects.equals(this.enablePolicy, createEndpointServiceRequestBody.enablePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portId,
            serviceName,
            vpcId,
            approvalEnabled,
            serviceType,
            serverType,
            ports,
            tcpProxy,
            tags,
            description,
            enablePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEndpointServiceRequestBody {\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    approvalEnabled: ").append(toIndentedString(approvalEnabled)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    tcpProxy: ").append(toIndentedString(tcpProxy)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enablePolicy: ").append(toIndentedString(enablePolicy)).append("\n");
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
