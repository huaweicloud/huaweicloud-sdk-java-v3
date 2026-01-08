package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云办公主机的属性。
 */
public class ListHostsRspHostProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private Integer vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cores")

    private Integer cores;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sockets")

    private Integer sockets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type_name")

    private String hostTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_instance_capacities")

    private List<ListHostsRspHostPropertiesAvailableInstanceCapacities> availableInstanceCapacities = null;

    public ListHostsRspHostProperties withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * 云办公主机的vCPUs个数。
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public ListHostsRspHostProperties withCores(Integer cores) {
        this.cores = cores;
        return this;
    }

    /**
     * 云办公主机的物理核数。
     * @return cores
     */
    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public ListHostsRspHostProperties withSockets(Integer sockets) {
        this.sockets = sockets;
        return this;
    }

    /**
     * 云办公主机的物理套接字数量。
     * @return sockets
     */
    public Integer getSockets() {
        return sockets;
    }

    public void setSockets(Integer sockets) {
        this.sockets = sockets;
    }

    public ListHostsRspHostProperties withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 云办公主机的物理内存大小。
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public ListHostsRspHostProperties withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * 云办公主机类型。
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public ListHostsRspHostProperties withHostTypeName(String hostTypeName) {
        this.hostTypeName = hostTypeName;
        return this;
    }

    /**
     * 云办公主机类型名称。
     * @return hostTypeName
     */
    public String getHostTypeName() {
        return hostTypeName;
    }

    public void setHostTypeName(String hostTypeName) {
        this.hostTypeName = hostTypeName;
    }

    public ListHostsRspHostProperties withAvailableInstanceCapacities(
        List<ListHostsRspHostPropertiesAvailableInstanceCapacities> availableInstanceCapacities) {
        this.availableInstanceCapacities = availableInstanceCapacities;
        return this;
    }

    public ListHostsRspHostProperties addAvailableInstanceCapacitiesItem(
        ListHostsRspHostPropertiesAvailableInstanceCapacities availableInstanceCapacitiesItem) {
        if (this.availableInstanceCapacities == null) {
            this.availableInstanceCapacities = new ArrayList<>();
        }
        this.availableInstanceCapacities.add(availableInstanceCapacitiesItem);
        return this;
    }

    public ListHostsRspHostProperties withAvailableInstanceCapacities(
        Consumer<List<ListHostsRspHostPropertiesAvailableInstanceCapacities>> availableInstanceCapacitiesSetter) {
        if (this.availableInstanceCapacities == null) {
            this.availableInstanceCapacities = new ArrayList<>();
        }
        availableInstanceCapacitiesSetter.accept(this.availableInstanceCapacities);
        return this;
    }

    /**
     * 可以创建的规格。
     * @return availableInstanceCapacities
     */
    public List<ListHostsRspHostPropertiesAvailableInstanceCapacities> getAvailableInstanceCapacities() {
        return availableInstanceCapacities;
    }

    public void setAvailableInstanceCapacities(
        List<ListHostsRspHostPropertiesAvailableInstanceCapacities> availableInstanceCapacities) {
        this.availableInstanceCapacities = availableInstanceCapacities;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHostsRspHostProperties that = (ListHostsRspHostProperties) obj;
        return Objects.equals(this.vcpus, that.vcpus) && Objects.equals(this.cores, that.cores)
            && Objects.equals(this.sockets, that.sockets) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.hostType, that.hostType) && Objects.equals(this.hostTypeName, that.hostTypeName)
            && Objects.equals(this.availableInstanceCapacities, that.availableInstanceCapacities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vcpus, cores, sockets, memory, hostType, hostTypeName, availableInstanceCapacities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHostsRspHostProperties {\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
        sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    hostTypeName: ").append(toIndentedString(hostTypeName)).append("\n");
        sb.append("    availableInstanceCapacities: ")
            .append(toIndentedString(availableInstanceCapacities))
            .append("\n");
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
