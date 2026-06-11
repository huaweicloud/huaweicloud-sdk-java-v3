package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源规格详细信息。
 */
public class FlavorInfoResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_num")

    private Integer maxNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Cpu cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private Gpu gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu")

    private Npu npu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Memory memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private DiskResponse disk;

    public FlavorInfoResponse withMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
        return this;
    }

    /**
     * 可以选择的最大节点数量（max_num，为1代表不支持分布式）。
     * @return maxNum
     */
    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public FlavorInfoResponse withCpu(Cpu cpu) {
        this.cpu = cpu;
        return this;
    }

    public FlavorInfoResponse withCpu(Consumer<Cpu> cpuSetter) {
        if (this.cpu == null) {
            this.cpu = new Cpu();
            cpuSetter.accept(this.cpu);
        }

        return this;
    }

    /**
     * Get cpu
     * @return cpu
     */
    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public FlavorInfoResponse withGpu(Gpu gpu) {
        this.gpu = gpu;
        return this;
    }

    public FlavorInfoResponse withGpu(Consumer<Gpu> gpuSetter) {
        if (this.gpu == null) {
            this.gpu = new Gpu();
            gpuSetter.accept(this.gpu);
        }

        return this;
    }

    /**
     * Get gpu
     * @return gpu
     */
    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public FlavorInfoResponse withNpu(Npu npu) {
        this.npu = npu;
        return this;
    }

    public FlavorInfoResponse withNpu(Consumer<Npu> npuSetter) {
        if (this.npu == null) {
            this.npu = new Npu();
            npuSetter.accept(this.npu);
        }

        return this;
    }

    /**
     * Get npu
     * @return npu
     */
    public Npu getNpu() {
        return npu;
    }

    public void setNpu(Npu npu) {
        this.npu = npu;
    }

    public FlavorInfoResponse withMemory(Memory memory) {
        this.memory = memory;
        return this;
    }

    public FlavorInfoResponse withMemory(Consumer<Memory> memorySetter) {
        if (this.memory == null) {
            this.memory = new Memory();
            memorySetter.accept(this.memory);
        }

        return this;
    }

    /**
     * Get memory
     * @return memory
     */
    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public FlavorInfoResponse withDisk(DiskResponse disk) {
        this.disk = disk;
        return this;
    }

    public FlavorInfoResponse withDisk(Consumer<DiskResponse> diskSetter) {
        if (this.disk == null) {
            this.disk = new DiskResponse();
            diskSetter.accept(this.disk);
        }

        return this;
    }

    /**
     * Get disk
     * @return disk
     */
    public DiskResponse getDisk() {
        return disk;
    }

    public void setDisk(DiskResponse disk) {
        this.disk = disk;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorInfoResponse that = (FlavorInfoResponse) obj;
        return Objects.equals(this.maxNum, that.maxNum) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.gpu, that.gpu) && Objects.equals(this.npu, that.npu)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.disk, that.disk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxNum, cpu, gpu, npu, memory, disk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorInfoResponse {\n");
        sb.append("    maxNum: ").append(toIndentedString(maxNum)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    npu: ").append(toIndentedString(npu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
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
