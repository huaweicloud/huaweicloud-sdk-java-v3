package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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
public class UpdateEndpointServiceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    @JacksonXmlProperty(localName = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_port_id")

    @JacksonXmlProperty(localName = "vip_port_id")

    private String vipPortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    @JacksonXmlProperty(localName = "service_name")

    private String serviceName;

    /**
     * 资源类型。 ● VM：云服务器。 ● VIP：虚拟IP。 ● LB：增强负载均衡型。
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

    @JacksonXmlProperty(localName = "server_type")

    private ServerTypeEnum serverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    @JacksonXmlProperty(localName = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    @JacksonXmlProperty(localName = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_enabled")

    @JacksonXmlProperty(localName = "approval_enabled")

    private Boolean approvalEnabled;

    /**
     * 终端节点服务的状态。 ● creating：创建中 ● available：可连接 ● failed：失败
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("creating");

        /**
         * Enum AVAILABLE for value: "available"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("available");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatusEnum FAILED = new StatusEnum("failed");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("creating", CREATING);
            map.put("available", AVAILABLE);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    @JacksonXmlProperty(localName = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    @JacksonXmlProperty(localName = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    /**
     * 网段类型。 ● public：公网网段 ● internal：内网网段 默认值为internal。
     */
    public static final class CidrTypeEnum {

        /**
         * Enum PUBLIC for value: "public"
         */
        public static final CidrTypeEnum PUBLIC = new CidrTypeEnum("public");

        /**
         * Enum INTERNAL for value: "internal"
         */
        public static final CidrTypeEnum INTERNAL = new CidrTypeEnum("internal");

        private static final Map<String, CidrTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CidrTypeEnum> createStaticFields() {
            Map<String, CidrTypeEnum> map = new HashMap<>();
            map.put("public", PUBLIC);
            map.put("internal", INTERNAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CidrTypeEnum(String value) {
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
        public static CidrTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CidrTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CidrTypeEnum(value);
            }
            return result;
        }

        public static CidrTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CidrTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CidrTypeEnum) {
                return this.value.equals(((CidrTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr_type")

    @JacksonXmlProperty(localName = "cidr_type")

    private CidrTypeEnum cidrType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    @JacksonXmlProperty(localName = "ports")

    private List<PortList> ports = null;

    /**
    * 用于控制是否将客户端的源IP、源端口、 marker_id等信息携带到服务端。信息携带支持 两种方式： ● TCP TOA：表示将客户端信息插入到tcp option字段中携带至服务端。 说明 仅当后端资源为OBS时，支持TCP TOA类型信息 携带方式。 ● Proxy Protocol：表示将客户端相关信息插入 到tcp payload字段中携带至服务端。 仅当服务端支持解析上述字段时，该参数设置 才有效。 参数的取值包括： ● close：表示关闭代理协议。 ● toa_open：表示开启代理协议“tcp_toa”。 ● proxy_open：表示开启代理协议 “proxy_protocol”。 ● open：表示同时开启代理协议“tcp_toa” 和“proxy_protocol”。 默认值为“close”。
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

        private static final Map<String, TcpProxyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TcpProxyEnum> createStaticFields() {
            Map<String, TcpProxyEnum> map = new HashMap<>();
            map.put("close", CLOSE);
            map.put("toa_open", TOA_OPEN);
            map.put("proxy_open", PROXY_OPEN);
            map.put("open", OPEN);
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

    @JacksonXmlProperty(localName = "tcp_proxy")

    private TcpProxyEnum tcpProxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<TagList> tags = null;

    public UpdateEndpointServiceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 终端节点服务的ID，唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateEndpointServiceResponse withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 标识终端节点服务后端资源的ID，格式为通用唯一识别码 （Universally Unique Identifier，下文简称UUID）。取值为： ● LB类型：增强型负载均衡器内网IP对应的端口ID。 ● VM类型：弹性云服务器IP地址对应的网卡ID。 ● VIP类型：虚拟资源所在物理服务器对应的网卡ID。
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public UpdateEndpointServiceResponse withVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
        return this;
    }

    /**
     * 虚拟IP的网卡ID。 仅当“port_id”为“VIP类型”时，返回该参数。
     * @return vipPortId
     */
    public String getVipPortId() {
        return vipPortId;
    }

    public void setVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
    }

    public UpdateEndpointServiceResponse withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 终端节点服务的名称。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public UpdateEndpointServiceResponse withServerType(ServerTypeEnum serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * 资源类型。 ● VM：云服务器。 ● VIP：虚拟IP。 ● LB：增强负载均衡型。
     * @return serverType
     */
    public ServerTypeEnum getServerType() {
        return serverType;
    }

    public void setServerType(ServerTypeEnum serverType) {
        this.serverType = serverType;
    }

    public UpdateEndpointServiceResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 终端节点服务对应后端资源所在的VPC的ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public UpdateEndpointServiceResponse withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 终端节点服务对应的集群id
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public UpdateEndpointServiceResponse withApprovalEnabled(Boolean approvalEnabled) {
        this.approvalEnabled = approvalEnabled;
        return this;
    }

    /**
     * 是否需要审批。 ● false：不需要审批，创建的终端节点连接直接为accepted状态。 ● true：需要审批，创建的终端节点连接为pendingAcceptance状态，需要终端节点服务所属用户审核后方可使用。
     * @return approvalEnabled
     */
    public Boolean getApprovalEnabled() {
        return approvalEnabled;
    }

    public void setApprovalEnabled(Boolean approvalEnabled) {
        this.approvalEnabled = approvalEnabled;
    }

    public UpdateEndpointServiceResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 终端节点服务的状态。 ● creating：创建中 ● available：可连接 ● failed：失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateEndpointServiceResponse withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 终端节点服务类型。 终端节点服务类型包括“网关（gataway）型”和“接口（interface）型”： ● gataway：由运维人员配置。用户无需创建，可直接使用。 ● interface：包括运维人员配置的云服务和用户自己创建的私有服务。其中，运维人员配 置的云服务无需创建，用户可直接使用。 您可以通过创建终端节点创建访问Gateway和Interface类型终端节点服务的终端节点。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public UpdateEndpointServiceResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 终端节点服务的创建时间。 采用UTC时间格式，格式为：YYYY-MMDDTHH:MM:SSZ
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UpdateEndpointServiceResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 终端节点服务的更新时间。 采用UTC时间格式，格式为：YYYY-MMDDTHH:MM:SSZ
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UpdateEndpointServiceResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateEndpointServiceResponse withCidrType(CidrTypeEnum cidrType) {
        this.cidrType = cidrType;
        return this;
    }

    /**
     * 网段类型。 ● public：公网网段 ● internal：内网网段 默认值为internal。
     * @return cidrType
     */
    public CidrTypeEnum getCidrType() {
        return cidrType;
    }

    public void setCidrType(CidrTypeEnum cidrType) {
        this.cidrType = cidrType;
    }

    public UpdateEndpointServiceResponse withPorts(List<PortList> ports) {
        this.ports = ports;
        return this;
    }

    public UpdateEndpointServiceResponse addPortsItem(PortList portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public UpdateEndpointServiceResponse withPorts(Consumer<List<PortList>> portsSetter) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    /**
     * 服务开放的端口映射列表，详细内容请参见表 4-13 同一个终端节点服务下，不允许重复的端口映 射。若多个终端节点服务共用一个port_id，则 终端节点服务之间的所有端口映射的 server_port和protocol的组合不能重复。
     * @return ports
     */
    public List<PortList> getPorts() {
        return ports;
    }

    public void setPorts(List<PortList> ports) {
        this.ports = ports;
    }

    public UpdateEndpointServiceResponse withTcpProxy(TcpProxyEnum tcpProxy) {
        this.tcpProxy = tcpProxy;
        return this;
    }

    /**
     * 用于控制是否将客户端的源IP、源端口、 marker_id等信息携带到服务端。信息携带支持 两种方式： ● TCP TOA：表示将客户端信息插入到tcp option字段中携带至服务端。 说明 仅当后端资源为OBS时，支持TCP TOA类型信息 携带方式。 ● Proxy Protocol：表示将客户端相关信息插入 到tcp payload字段中携带至服务端。 仅当服务端支持解析上述字段时，该参数设置 才有效。 参数的取值包括： ● close：表示关闭代理协议。 ● toa_open：表示开启代理协议“tcp_toa”。 ● proxy_open：表示开启代理协议 “proxy_protocol”。 ● open：表示同时开启代理协议“tcp_toa” 和“proxy_protocol”。 默认值为“close”。
     * @return tcpProxy
     */
    public TcpProxyEnum getTcpProxy() {
        return tcpProxy;
    }

    public void setTcpProxy(TcpProxyEnum tcpProxy) {
        this.tcpProxy = tcpProxy;
    }

    public UpdateEndpointServiceResponse withTags(List<TagList> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateEndpointServiceResponse addTagsItem(TagList tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateEndpointServiceResponse withTags(Consumer<List<TagList>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 资源标签列表
     * @return tags
     */
    public List<TagList> getTags() {
        return tags;
    }

    public void setTags(List<TagList> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEndpointServiceResponse updateEndpointServiceResponse = (UpdateEndpointServiceResponse) o;
        return Objects.equals(this.id, updateEndpointServiceResponse.id)
            && Objects.equals(this.portId, updateEndpointServiceResponse.portId)
            && Objects.equals(this.vipPortId, updateEndpointServiceResponse.vipPortId)
            && Objects.equals(this.serviceName, updateEndpointServiceResponse.serviceName)
            && Objects.equals(this.serverType, updateEndpointServiceResponse.serverType)
            && Objects.equals(this.vpcId, updateEndpointServiceResponse.vpcId)
            && Objects.equals(this.poolId, updateEndpointServiceResponse.poolId)
            && Objects.equals(this.approvalEnabled, updateEndpointServiceResponse.approvalEnabled)
            && Objects.equals(this.status, updateEndpointServiceResponse.status)
            && Objects.equals(this.serviceType, updateEndpointServiceResponse.serviceType)
            && Objects.equals(this.createdAt, updateEndpointServiceResponse.createdAt)
            && Objects.equals(this.updatedAt, updateEndpointServiceResponse.updatedAt)
            && Objects.equals(this.projectId, updateEndpointServiceResponse.projectId)
            && Objects.equals(this.cidrType, updateEndpointServiceResponse.cidrType)
            && Objects.equals(this.ports, updateEndpointServiceResponse.ports)
            && Objects.equals(this.tcpProxy, updateEndpointServiceResponse.tcpProxy)
            && Objects.equals(this.tags, updateEndpointServiceResponse.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            portId,
            vipPortId,
            serviceName,
            serverType,
            vpcId,
            poolId,
            approvalEnabled,
            status,
            serviceType,
            createdAt,
            updatedAt,
            projectId,
            cidrType,
            ports,
            tcpProxy,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointServiceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    vipPortId: ").append(toIndentedString(vipPortId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    approvalEnabled: ").append(toIndentedString(approvalEnabled)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    cidrType: ").append(toIndentedString(cidrType)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    tcpProxy: ").append(toIndentedString(tcpProxy)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
