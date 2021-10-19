package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 修改终端节点服务接口请求结构体 */
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vip_port_id")

    private String vipPortId;

    public UpdateEndpointServiceRequestBody withApprovalEnabled(Boolean approvalEnabled) {
        this.approvalEnabled = approvalEnabled;
        return this;
    }

    /** 是否需要审批。 ● false：不需审批，创建的终端节点连 接直接为accepted状态。 ● true：需审批，创建的终端节点连接 需要终端节点服务所属用户审核后方 可使用。 默认为true，需要审批。
     * 
     * @return approvalEnabled */
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

    /** 终端节点服务的名称，长度不大于16， 允许传入大小写字母、数字、下划线、 中划线。
     * 
     * @return serviceName */
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

    /** 服务开放的端口映射列表，详细内容请 参见表4-22。 同一个终端节点服务下，不允许重复的 端口映射。若多个终端节点服务共用一 个port_id，则终端节点之间服务的所有
     * 端口映射的server_port和protocol的组合 不能重复，单次最多添加200个。
     * 
     * @return ports */
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

    /** 标识终端节点服务后端资源的ID，格式 为通用唯一识别码（Universally Unique Identifier，下文简称UUID）。取值为： ● LB类型：增强型负载均衡器内网IP对 应的端口ID。详细内容请参考《弹性
     * 负载均衡API参考》中的“查询负载均 衡详情”，详见响应消息中的 “vip_port_id”字段。 ● VM类型：弹性云服务器IP地址对应的 网卡ID。详细内容请参考《弹性云服 务器API参考》中的“查询云服务器网
     * 卡信息”，详见响应消息中的 “port_id”字段。 ● VIP类型：虚拟资源所在物理服务器对 应的网卡ID。 说明 当后端资源为“LB类型”时，仅支持修改为 同类型后端资源的“vip_port_id”。
     * 例如，共享型负载均衡仅支持更换为共享型 负载均衡，不支持更换为独享型负载均衡。
     * 
     * @return portId */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public UpdateEndpointServiceRequestBody withVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
        return this;
    }

    /** 虚拟IP的网卡ID。
     * 
     * @return vipPortId */
    public String getVipPortId() {
        return vipPortId;
    }

    public void setVipPortId(String vipPortId) {
        this.vipPortId = vipPortId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEndpointServiceRequestBody updateEndpointServiceRequestBody = (UpdateEndpointServiceRequestBody) o;
        return Objects.equals(this.approvalEnabled, updateEndpointServiceRequestBody.approvalEnabled)
            && Objects.equals(this.serviceName, updateEndpointServiceRequestBody.serviceName)
            && Objects.equals(this.ports, updateEndpointServiceRequestBody.ports)
            && Objects.equals(this.portId, updateEndpointServiceRequestBody.portId)
            && Objects.equals(this.vipPortId, updateEndpointServiceRequestBody.vipPortId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvalEnabled, serviceName, ports, portId, vipPortId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointServiceRequestBody {\n");
        sb.append("    approvalEnabled: ").append(toIndentedString(approvalEnabled)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    vipPortId: ").append(toIndentedString(vipPortId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
