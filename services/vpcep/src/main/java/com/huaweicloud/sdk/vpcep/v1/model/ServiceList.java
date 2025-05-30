package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServiceList
 */
public class ServiceList {

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
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<PortList> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagList> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_count")

    private Integer connectionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcp_proxy")

    private String tcpProxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private List<Error> error = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supported_editions")

    private List<String> supportedEditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_policy")

    private Boolean enablePolicy;

    public ServiceList withId(String id) {
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

    public ServiceList withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 标识终端节点服务后端资源的ID， 格式为通用唯一识别码（Universally Unique Identifier，下文简称UUID）。取值为：  - LB类型：负载均衡器内网IP对应的端口ID。  - VM类型：弹性云服务器IP地址对应的网卡ID。  - VIP类型：虚拟资源所在物理服务器对应的网卡ID。（该字段已废弃，请优先使用LB类型）
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public ServiceList withServiceName(String serviceName) {
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

    public ServiceList withServerType(String serverType) {
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

    public ServiceList withVpcId(String vpcId) {
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

    public ServiceList withApprovalEnabled(Boolean approvalEnabled) {
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

    public ServiceList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 终端节点服务的状态。  - creating：创建中  - available：可连接  - failed：失败  - deleting：删除中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServiceList withServiceType(String serviceType) {
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

    public ServiceList withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 终端节点服务的创建时间。 采用UTC时间格式，格式为：YYYY-MM-DDTHH:MM:SSZ
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ServiceList withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 终端节点服务的更新时间。 采用UTC时间格式，格式为：YYYY-MM-DDTHH:MM:SSZ
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ServiceList withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，获取方法请参见获取项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ServiceList withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * Domain ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ServiceList withPorts(List<PortList> ports) {
        this.ports = ports;
        return this;
    }

    public ServiceList addPortsItem(PortList portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public ServiceList withPorts(Consumer<List<PortList>> portsSetter) {
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

    public ServiceList withIp(String ip) {
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

    public ServiceList withTags(List<TagList> tags) {
        this.tags = tags;
        return this;
    }

    public ServiceList addTagsItem(TagList tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ServiceList withTags(Consumer<List<TagList>> tagsSetter) {
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

    public ServiceList withConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
        return this;
    }

    /**
     * 终端节点服务下连接的状态为“创建中”或“已接受”的终端节点的个数。
     * minimum: 0
     * @return connectionCount
     */
    public Integer getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
    }

    public ServiceList withTcpProxy(String tcpProxy) {
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

    public ServiceList withError(List<Error> error) {
        this.error = error;
        return this;
    }

    public ServiceList addErrorItem(Error errorItem) {
        if (this.error == null) {
            this.error = new ArrayList<>();
        }
        this.error.add(errorItem);
        return this;
    }

    public ServiceList withError(Consumer<List<Error>> errorSetter) {
        if (this.error == null) {
            this.error = new ArrayList<>();
        }
        errorSetter.accept(this.error);
        return this;
    }

    /**
     * 提交任务异常时返回的异常信息
     * @return error
     */
    public List<Error> getError() {
        return error;
    }

    public void setError(List<Error> error) {
        this.error = error;
    }

    public ServiceList withDescription(String description) {
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

    public ServiceList withSupportedEditions(List<String> supportedEditions) {
        this.supportedEditions = supportedEditions;
        return this;
    }

    public ServiceList addSupportedEditionsItem(String supportedEditionsItem) {
        if (this.supportedEditions == null) {
            this.supportedEditions = new ArrayList<>();
        }
        this.supportedEditions.add(supportedEditionsItem);
        return this;
    }

    public ServiceList withSupportedEditions(Consumer<List<String>> supportedEditionsSetter) {
        if (this.supportedEditions == null) {
            this.supportedEditions = new ArrayList<>();
        }
        supportedEditionsSetter.accept(this.supportedEditions);
        return this;
    }

    /**
     * 终端节点服务支持的类型，取值范围为profession-专业型，basic-基础型
     * @return supportedEditions
     */
    public List<String> getSupportedEditions() {
        return supportedEditions;
    }

    public void setSupportedEditions(List<String> supportedEditions) {
        this.supportedEditions = supportedEditions;
    }

    public ServiceList withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 终端节点服务对应Pool的Public Border Group信息
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public ServiceList withEnablePolicy(Boolean enablePolicy) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceList that = (ServiceList) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.portId, that.portId)
            && Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.serverType, that.serverType)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.approvalEnabled, that.approvalEnabled)
            && Objects.equals(this.status, that.status) && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.ports, that.ports) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.connectionCount, that.connectionCount)
            && Objects.equals(this.tcpProxy, that.tcpProxy) && Objects.equals(this.error, that.error)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.supportedEditions, that.supportedEditions)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.enablePolicy, that.enablePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            portId,
            serviceName,
            serverType,
            vpcId,
            approvalEnabled,
            status,
            serviceType,
            createdAt,
            updatedAt,
            projectId,
            domainId,
            ports,
            ip,
            tags,
            connectionCount,
            tcpProxy,
            error,
            description,
            supportedEditions,
            publicBorderGroup,
            enablePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    approvalEnabled: ").append(toIndentedString(approvalEnabled)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    connectionCount: ").append(toIndentedString(connectionCount)).append("\n");
        sb.append("    tcpProxy: ").append(toIndentedString(tcpProxy)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    supportedEditions: ").append(toIndentedString(supportedEditions)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
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
