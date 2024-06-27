package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
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

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private String serverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approval_enabled")

    private Boolean approvalEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<PortList> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcp_proxy")

    private String tcpProxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagList> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_policy")

    private Boolean enablePolicy;

    /**
     * 指定终端节点服务的IP版本，仅专业型终端节点服务支持此参数 ● ipv4,  IPv4 ● ipv6,  IPv6
     */
    public static final class IpVersionEnum {

        /**
         * Enum IPV4 for value: "ipv4"
         */
        public static final IpVersionEnum IPV4 = new IpVersionEnum("ipv4");

        /**
         * Enum IPV6 for value: "ipv6"
         */
        public static final IpVersionEnum IPV6 = new IpVersionEnum("ipv6");

        private static final Map<String, IpVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IpVersionEnum> createStaticFields() {
            Map<String, IpVersionEnum> map = new HashMap<>();
            map.put("ipv4", IPV4);
            map.put("ipv6", IPV6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IpVersionEnum(String value) {
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
        public static IpVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IpVersionEnum(value));
        }

        public static IpVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IpVersionEnum) {
                return this.value.equals(((IpVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private IpVersionEnum ipVersion;

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
     * 标识终端节点服务后端资源的ID， 格式为通用唯一识别码（Universally Unique Identifier，下文简称UUID）。 取值为：  - LB类型：负载均衡器内网IP对应的端口ID。  - VM类型：弹性云服务器IP地址对应的网卡ID。  - VIP类型：虚拟资源所在物理服务器对应的网卡ID。（该字段已废弃，请优先使用LB类型）
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
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

    public UpdateEndpointServiceResponse withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * 资源类型。  - VM：云服务器。  - VIP：虚拟IP。  - LB：增强负载均衡型。
     * @return serverType
     */
    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
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
     * 是否需要审批。  - false：不需要审批，创建的终端节点连接直接为accepted状态。  - true：需要审批，创建的终端节点连接为pendingAcceptance状态， 需要终端节点服务所属用户审核后方可使用。
     * @return approvalEnabled
     */
    public Boolean getApprovalEnabled() {
        return approvalEnabled;
    }

    public void setApprovalEnabled(Boolean approvalEnabled) {
        this.approvalEnabled = approvalEnabled;
    }

    public UpdateEndpointServiceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 终端节点服务的状态。  - creating：创建中  - available：可连接  - failed：失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateEndpointServiceResponse withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 终端节点服务类型。 终端节点服务类型包括“网关（gateway）型”和“接口（interface）型”：  - gateway：由运维人员配置。用户无需创建，可直接使用。  - interface：包括运维人员配置的云服务和用户自己创建的私有服务。 其中，运维人员配置的云服务无需创建，用户可直接使用。 您可以通过创建终端节点创建访问Gateway和Interface类型终端节点服务的终端节点。
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public UpdateEndpointServiceResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 终端节点服务的创建时间。 采用UTC时间格式，格式为：YYYY-MMDDTHH:MM:SSZ
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public UpdateEndpointServiceResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 终端节点服务的更新时间。 采用UTC时间格式，格式为：YYYY-MMDDTHH:MM:SSZ
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
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
     * 服务开放的端口映射列表 同一个终端节点服务下，不允许重复的端口映射。 若多个终端节点服务共用一个port_id， 则终端节点服务之间的所有端口映射的server_port和protocol的组合不能重复。
     * @return ports
     */
    public List<PortList> getPorts() {
        return ports;
    }

    public void setPorts(List<PortList> ports) {
        this.ports = ports;
    }

    public UpdateEndpointServiceResponse withTcpProxy(String tcpProxy) {
        this.tcpProxy = tcpProxy;
        return this;
    }

    /**
     * 用于控制将哪些信息（如客户端的源IP、源端口、marker_id等）携带到服务端。 支持携带的客户端信息包括如下两种类型：  - TCP TOA：表示将客户端信息插入到tcp option字段中携带至服务端。 说明：仅当后端资源为OBS时，支持TCP TOA类型信息携带方式。  - Proxy Protocol：表示将客户端信息插入到tcp payload字段中携带至服务端。 仅当服务端支持解析上述字段时，该参数设置才有效。 该参数的取值包括：  - close：表示关闭代理协议。  - toa_open：表示开启代理协议“tcp_toa”。  - proxy_open：表示开启代理协议“proxy_protocol”。  - open：表示同时开启代理协议“tcp_toa”和“proxy_protocol”。 默认值为“close”。
     * @return tcpProxy
     */
    public String getTcpProxy() {
        return tcpProxy;
    }

    public void setTcpProxy(String tcpProxy) {
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

    public UpdateEndpointServiceResponse withDescription(String description) {
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

    public UpdateEndpointServiceResponse withEnablePolicy(Boolean enablePolicy) {
        this.enablePolicy = enablePolicy;
        return this;
    }

    /**
     * 是否允许自定义终端节点策略。  - false：不支持设置终端节点策略  - true：支持设置终端节点策略 默认为false
     * @return enablePolicy
     */
    public Boolean getEnablePolicy() {
        return enablePolicy;
    }

    public void setEnablePolicy(Boolean enablePolicy) {
        this.enablePolicy = enablePolicy;
    }

    public UpdateEndpointServiceResponse withIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * 指定终端节点服务的IP版本，仅专业型终端节点服务支持此参数 ● ipv4,  IPv4 ● ipv6,  IPv6
     * @return ipVersion
     */
    public IpVersionEnum getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateEndpointServiceResponse that = (UpdateEndpointServiceResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.portId, that.portId)
            && Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.serverType, that.serverType)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.poolId, that.poolId)
            && Objects.equals(this.approvalEnabled, that.approvalEnabled) && Objects.equals(this.status, that.status)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.ports, that.ports) && Objects.equals(this.tcpProxy, that.tcpProxy)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.description, that.description)
            && Objects.equals(this.enablePolicy, that.enablePolicy) && Objects.equals(this.ipVersion, that.ipVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            portId,
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
            ports,
            tcpProxy,
            tags,
            description,
            enablePolicy,
            ipVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointServiceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
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
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    tcpProxy: ").append(toIndentedString(tcpProxy)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enablePolicy: ").append(toIndentedString(enablePolicy)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
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
