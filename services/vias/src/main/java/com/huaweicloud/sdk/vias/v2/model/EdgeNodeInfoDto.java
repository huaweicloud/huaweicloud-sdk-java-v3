package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EdgeNodeInfoDto
 */
public class EdgeNodeInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_gpu")

    private Boolean enableGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_npu")

    private Boolean enableNpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_info")

    private List<GpuInfo> gpuInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_info")

    private List<NpuInfo> npuInfo = null;

    public EdgeNodeInfoDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 边缘节点ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EdgeNodeInfoDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘池名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EdgeNodeInfoDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息。描述为空则不返回该字段。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EdgeNodeInfoDto withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 边缘池状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public EdgeNodeInfoDto withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU核心数量。
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public EdgeNodeInfoDto withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * 计算机架构。
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public EdgeNodeInfoDto withEnableGpu(Boolean enableGpu) {
        this.enableGpu = enableGpu;
        return this;
    }

    /**
     * 是否使用GPU。
     * @return enableGpu
     */
    public Boolean getEnableGpu() {
        return enableGpu;
    }

    public void setEnableGpu(Boolean enableGpu) {
        this.enableGpu = enableGpu;
    }

    public EdgeNodeInfoDto withEnableNpu(Boolean enableNpu) {
        this.enableNpu = enableNpu;
        return this;
    }

    /**
     * 是否使用NPU。
     * @return enableNpu
     */
    public Boolean getEnableNpu() {
        return enableNpu;
    }

    public void setEnableNpu(Boolean enableNpu) {
        this.enableNpu = enableNpu;
    }

    public EdgeNodeInfoDto withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存大小。
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public EdgeNodeInfoDto withGpuInfo(List<GpuInfo> gpuInfo) {
        this.gpuInfo = gpuInfo;
        return this;
    }

    public EdgeNodeInfoDto addGpuInfoItem(GpuInfo gpuInfoItem) {
        if (this.gpuInfo == null) {
            this.gpuInfo = new ArrayList<>();
        }
        this.gpuInfo.add(gpuInfoItem);
        return this;
    }

    public EdgeNodeInfoDto withGpuInfo(Consumer<List<GpuInfo>> gpuInfoSetter) {
        if (this.gpuInfo == null) {
            this.gpuInfo = new ArrayList<>();
        }
        gpuInfoSetter.accept(this.gpuInfo);
        return this;
    }

    /**
     * GPU信息。
     * @return gpuInfo
     */
    public List<GpuInfo> getGpuInfo() {
        return gpuInfo;
    }

    public void setGpuInfo(List<GpuInfo> gpuInfo) {
        this.gpuInfo = gpuInfo;
    }

    public EdgeNodeInfoDto withNpuInfo(List<NpuInfo> npuInfo) {
        this.npuInfo = npuInfo;
        return this;
    }

    public EdgeNodeInfoDto addNpuInfoItem(NpuInfo npuInfoItem) {
        if (this.npuInfo == null) {
            this.npuInfo = new ArrayList<>();
        }
        this.npuInfo.add(npuInfoItem);
        return this;
    }

    public EdgeNodeInfoDto withNpuInfo(Consumer<List<NpuInfo>> npuInfoSetter) {
        if (this.npuInfo == null) {
            this.npuInfo = new ArrayList<>();
        }
        npuInfoSetter.accept(this.npuInfo);
        return this;
    }

    /**
     * NPU信息。
     * @return npuInfo
     */
    public List<NpuInfo> getNpuInfo() {
        return npuInfo;
    }

    public void setNpuInfo(List<NpuInfo> npuInfo) {
        this.npuInfo = npuInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EdgeNodeInfoDto that = (EdgeNodeInfoDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.state, that.state)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.arch, that.arch)
            && Objects.equals(this.enableGpu, that.enableGpu) && Objects.equals(this.enableNpu, that.enableNpu)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.gpuInfo, that.gpuInfo)
            && Objects.equals(this.npuInfo, that.npuInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, state, cpu, arch, enableGpu, enableNpu, memory, gpuInfo, npuInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeNodeInfoDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    enableGpu: ").append(toIndentedString(enableGpu)).append("\n");
        sb.append("    enableNpu: ").append(toIndentedString(enableNpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    gpuInfo: ").append(toIndentedString(gpuInfo)).append("\n");
        sb.append("    npuInfo: ").append(toIndentedString(npuInfo)).append("\n");
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
