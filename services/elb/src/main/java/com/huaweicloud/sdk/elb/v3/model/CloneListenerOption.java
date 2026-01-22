package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 监听器复制到实例相关配置参数。
 */
public class CloneListenerOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_ranges")

    private List<PortRange> portRanges = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reuse_pool")

    private Boolean reusePool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_mapping_list")

    private List<SubnetMappingList> subnetMappingList = null;

    public CloneListenerOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：新监听器的名称。 **约束限制**：不涉及 **取值范围**：[0-255]个字符，传入空字符串则取默认值。 **默认取值**：原监听器名称+ “-copy”。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CloneListenerOption withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * **参数解释**：新监听器所在的负载均衡器ID（UUID）。 **约束限制**： - 不支持复制到网关型负载均衡器。 - 目的负载均衡器类型需要支持源监听器协议。源监听器协议为HTTP、HTTPS，目的负载均衡器需要为应用型负载均衡器；源监听器协议为TCP、UDP、TLS，目的负载均衡器需要为网络型负载均衡器。 - 只支持共享型负载均衡器复制到共享型负载均衡器，独享型负载均衡器复制到独享型负载均衡器。 - 源监听器的负载均衡器启用IP类型后端转发，目的负载均衡器也需要启动IP类型后端转发功能。 - 源监听器协议为TLS，目的负载均衡器需要支持创建TLS协议监听器。 **取值范围**：标准的UUID格式，长度为36个字符。 **默认取值**：不涉及
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public CloneListenerOption withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * **参数解释**：新监听器的监听端口。 **约束限制**： - 不能与目的负载均衡器下已有监听器监听端口重复。 - 0表示开启监听端口范围的能力，此时port_ranges为必填字段。 - 共享型负载均衡器上的HTTP和TERMINATED_HTTPS监听器不支持设置21端口。 **取值范围**：0-65535 **默认取值**：不涉及
     * minimum: 1
     * maximum: 65535
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    public CloneListenerOption withPortRanges(List<PortRange> portRanges) {
        this.portRanges = portRanges;
        return this;
    }

    public CloneListenerOption addPortRangesItem(PortRange portRangesItem) {
        if (this.portRanges == null) {
            this.portRanges = new ArrayList<>();
        }
        this.portRanges.add(portRangesItem);
        return this;
    }

    public CloneListenerOption withPortRanges(Consumer<List<PortRange>> portRangesSetter) {
        if (this.portRanges == null) {
            this.portRanges = new ArrayList<>();
        }
        portRangesSetter.accept(this.portRanges);
        return this;
    }

    /**
     * **参数解释**：端口监听范围（闭区间)，最多指定10个端口组，每个组范围不可有重叠部分。 **约束限制**： - 仅当protocol_port为0或未传入protocol_port时可以传入该字段。 - 仅TCP, UDP，TLS监听器支持该字段。 - 不能与目的负载均衡器下已有端口冲突
     * @return portRanges
     */
    public List<PortRange> getPortRanges() {
        return portRanges;
    }

    public void setPortRanges(List<PortRange> portRanges) {
        this.portRanges = portRanges;
    }

    public CloneListenerOption withReusePool(Boolean reusePool) {
        this.reusePool = reusePool;
        return this;
    }

    /**
     * **参数解释**：新监听器是否复用或复制源监听器的后端服务器组和后端服务器的标识。 - 复用：目的监听器将会直接使用源监听器的后端服务器组。 - 复制：系统将会根据原有配置创建新的后端服务器组，然后将其关联到目的监听器使用。 **约束限制**： - 配置为true时，需要开启后端服务器组多挂实例功能。 - 只在独享型场景复制、同VPC场景可配。 **取值范围**： - true：复用源监听器的后端服务器组。 - false：复制源监听器的后端服务器组。 **默认取值**：false
     * @return reusePool
     */
    public Boolean getReusePool() {
        return reusePool;
    }

    public void setReusePool(Boolean reusePool) {
        this.reusePool = reusePool;
    }

    public CloneListenerOption withSubnetMappingList(List<SubnetMappingList> subnetMappingList) {
        this.subnetMappingList = subnetMappingList;
        return this;
    }

    public CloneListenerOption addSubnetMappingListItem(SubnetMappingList subnetMappingListItem) {
        if (this.subnetMappingList == null) {
            this.subnetMappingList = new ArrayList<>();
        }
        this.subnetMappingList.add(subnetMappingListItem);
        return this;
    }

    public CloneListenerOption withSubnetMappingList(Consumer<List<SubnetMappingList>> subnetMappingListSetter) {
        if (this.subnetMappingList == null) {
            this.subnetMappingList = new ArrayList<>();
        }
        subnetMappingListSetter.accept(this.subnetMappingList);
        return this;
    }

    /**
     * **参数解释**：源监听器下后端服务器子网信息和新监听器下后端服务器子网信息一一对应关系。 **约束限制**： - 将监听器复制到不同VPC下的负载均衡器时，该字段必填。复制到同一个VPC下的负载均衡器时不填。 - 若源监听器所在负载均衡器已开启ip_target_enable（该功能默认不开启），则不允许跨VPC复制，即该字段不允许填。 - 每一组subnet_cidr_id都需要是新监听器下后端服务器的VPC子网ID，每一组dst_subnet_cidr_id都需要为源监听器下后端服务器的的VPC子网ID，不允许少填多填、或重复对应关系。 - 每一组的subnet_cidr_id和dst_subnet_cidr_id的两个子网必须存在且网段相同。
     * @return subnetMappingList
     */
    public List<SubnetMappingList> getSubnetMappingList() {
        return subnetMappingList;
    }

    public void setSubnetMappingList(List<SubnetMappingList> subnetMappingList) {
        this.subnetMappingList = subnetMappingList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloneListenerOption that = (CloneListenerOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.loadbalancerId, that.loadbalancerId)
            && Objects.equals(this.protocolPort, that.protocolPort) && Objects.equals(this.portRanges, that.portRanges)
            && Objects.equals(this.reusePool, that.reusePool)
            && Objects.equals(this.subnetMappingList, that.subnetMappingList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, loadbalancerId, protocolPort, portRanges, reusePool, subnetMappingList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneListenerOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    portRanges: ").append(toIndentedString(portRanges)).append("\n");
        sb.append("    reusePool: ").append(toIndentedString(reusePool)).append("\n");
        sb.append("    subnetMappingList: ").append(toIndentedString(subnetMappingList)).append("\n");
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
