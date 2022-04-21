package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 专属主机属性。
 */
public class RespHostProperty {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type_name")

    private String hostTypeName;

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
    @JsonProperty(value = "available_instance_capacities")

    private List<RespInstanceCapacity> availableInstanceCapacities = null;

    public RespHostProperty withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * 专属主机类型。
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public RespHostProperty withHostTypeName(String hostTypeName) {
        this.hostTypeName = hostTypeName;
        return this;
    }

    /**
     * 专属主机类型的名称。
     * @return hostTypeName
     */
    public String getHostTypeName() {
        return hostTypeName;
    }

    public void setHostTypeName(String hostTypeName) {
        this.hostTypeName = hostTypeName;
    }

    public RespHostProperty withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * 专属主机的vCPUs个数。
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public RespHostProperty withCores(Integer cores) {
        this.cores = cores;
        return this;
    }

    /**
     * 专属主机的物理核数。
     * @return cores
     */
    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public RespHostProperty withSockets(Integer sockets) {
        this.sockets = sockets;
        return this;
    }

    /**
     * 专属主机的物理套接字数量。
     * @return sockets
     */
    public Integer getSockets() {
        return sockets;
    }

    public void setSockets(Integer sockets) {
        this.sockets = sockets;
    }

    public RespHostProperty withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 专属主机的物理内存大小。
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public RespHostProperty withAvailableInstanceCapacities(List<RespInstanceCapacity> availableInstanceCapacities) {
        this.availableInstanceCapacities = availableInstanceCapacities;
        return this;
    }

    public RespHostProperty addAvailableInstanceCapacitiesItem(RespInstanceCapacity availableInstanceCapacitiesItem) {
        if (this.availableInstanceCapacities == null) {
            this.availableInstanceCapacities = new ArrayList<>();
        }
        this.availableInstanceCapacities.add(availableInstanceCapacitiesItem);
        return this;
    }

    public RespHostProperty withAvailableInstanceCapacities(
        Consumer<List<RespInstanceCapacity>> availableInstanceCapacitiesSetter) {
        if (this.availableInstanceCapacities == null) {
            this.availableInstanceCapacities = new ArrayList<>();
        }
        availableInstanceCapacitiesSetter.accept(this.availableInstanceCapacities);
        return this;
    }

    /**
     * 专属主机上创建的云服务器规格。
     * @return availableInstanceCapacities
     */
    public List<RespInstanceCapacity> getAvailableInstanceCapacities() {
        return availableInstanceCapacities;
    }

    public void setAvailableInstanceCapacities(List<RespInstanceCapacity> availableInstanceCapacities) {
        this.availableInstanceCapacities = availableInstanceCapacities;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RespHostProperty respHostProperty = (RespHostProperty) o;
        return Objects.equals(this.hostType, respHostProperty.hostType)
            && Objects.equals(this.hostTypeName, respHostProperty.hostTypeName)
            && Objects.equals(this.vcpus, respHostProperty.vcpus) && Objects.equals(this.cores, respHostProperty.cores)
            && Objects.equals(this.sockets, respHostProperty.sockets)
            && Objects.equals(this.memory, respHostProperty.memory)
            && Objects.equals(this.availableInstanceCapacities, respHostProperty.availableInstanceCapacities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostType, hostTypeName, vcpus, cores, sockets, memory, availableInstanceCapacities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespHostProperty {\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    hostTypeName: ").append(toIndentedString(hostTypeName)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
        sb.append("    sockets: ").append(toIndentedString(sockets)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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
