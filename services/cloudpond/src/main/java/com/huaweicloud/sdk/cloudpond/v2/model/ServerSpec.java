package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务器规格
 */
public class ServerSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private ServerType serverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_type")

    private String flavorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "performance_type")

    private String performanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power")

    private Integer power;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private Integer unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private Integer vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_capacity")

    private Integer storageCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_name")

    private String cpuName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_architecture")

    private String cpuArchitecture;

    public ServerSpec withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 服务器规格ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServerSpec withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 服务器规格名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServerSpec withServerType(ServerType serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * Get serverType
     * @return serverType
     */
    public ServerType getServerType() {
        return serverType;
    }

    public void setServerType(ServerType serverType) {
        this.serverType = serverType;
    }

    public ServerSpec withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * 服务器发放的资源规格类型
     * @return flavorType
     */
    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public ServerSpec withPerformanceType(String performanceType) {
        this.performanceType = performanceType;
        return this;
    }

    /**
     * 服务器规格分类。如通用计算型/云桌面型/网关型等。
     * @return performanceType
     */
    public String getPerformanceType() {
        return performanceType;
    }

    public void setPerformanceType(String performanceType) {
        this.performanceType = performanceType;
    }

    public ServerSpec withPower(Integer power) {
        this.power = power;
        return this;
    }

    /**
     * 服务器功率（单位：w）
     * @return power
     */
    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public ServerSpec withUnit(Integer unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 设备高度。U位数
     * @return unit
     */
    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public ServerSpec withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * 可用虚拟CPU核数
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public ServerSpec withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 可用内存大小。单位：GB
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public ServerSpec withStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
        return this;
    }

    /**
     * 可用存储容量。单位：TiB
     * @return storageCapacity
     */
    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public ServerSpec withCpuName(String cpuName) {
        this.cpuName = cpuName;
        return this;
    }

    /**
     * 名称
     * @return cpuName
     */
    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public ServerSpec withCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
        return this;
    }

    /**
     * CPU架构
     * @return cpuArchitecture
     */
    public String getCpuArchitecture() {
        return cpuArchitecture;
    }

    public void setCpuArchitecture(String cpuArchitecture) {
        this.cpuArchitecture = cpuArchitecture;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerSpec that = (ServerSpec) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.serverType, that.serverType) && Objects.equals(this.flavorType, that.flavorType)
            && Objects.equals(this.performanceType, that.performanceType) && Objects.equals(this.power, that.power)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.vcpus, that.vcpus)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.storageCapacity, that.storageCapacity)
            && Objects.equals(this.cpuName, that.cpuName) && Objects.equals(this.cpuArchitecture, that.cpuArchitecture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            serverType,
            flavorType,
            performanceType,
            power,
            unit,
            vcpus,
            memory,
            storageCapacity,
            cpuName,
            cpuArchitecture);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerSpec {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    flavorType: ").append(toIndentedString(flavorType)).append("\n");
        sb.append("    performanceType: ").append(toIndentedString(performanceType)).append("\n");
        sb.append("    power: ").append(toIndentedString(power)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    storageCapacity: ").append(toIndentedString(storageCapacity)).append("\n");
        sb.append("    cpuName: ").append(toIndentedString(cpuName)).append("\n");
        sb.append("    cpuArchitecture: ").append(toIndentedString(cpuArchitecture)).append("\n");
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
