package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源规格描述信息。
 */
public class ResourceFlavorSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpuArch")

    private String cpuArch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private ResourceFlavorSpecGpu gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu")

    private ResourceFlavorSpecNpu npu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataVolume")

    private List<ResourceFlavorSpecDataVolume> dataVolume = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billingModes")

    private List<Integer> billingModes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billingCode")

    private String billingCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobFlavors")

    private List<String> jobFlavors = null;

    public ResourceFlavorSpec withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：资源规格类型。 **取值范围**：可选值如下： - Dedicate：物理资源规格。物理资源规格可以创建节点资源。 [- Logical：逻辑资源规格。](tag:hcso)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceFlavorSpec withCpuArch(String cpuArch) {
        this.cpuArch = cpuArch;
        return this;
    }

    /**
     * **参数解释**：资源规格实例的计算架构。 **取值范围**：可选值如下： - x86：x86架构。 - arm64：ARM架构。
     * @return cpuArch
     */
    public String getCpuArch() {
        return cpuArch;
    }

    public void setCpuArch(String cpuArch) {
        this.cpuArch = cpuArch;
    }

    public ResourceFlavorSpec withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：资源规格实例的CPU核心数量。 **取值范围**：不涉及。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ResourceFlavorSpec withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：资源规格实例的内存大小。以Gi为单位。 **取值范围**：不涉及。
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public ResourceFlavorSpec withGpu(ResourceFlavorSpecGpu gpu) {
        this.gpu = gpu;
        return this;
    }

    public ResourceFlavorSpec withGpu(Consumer<ResourceFlavorSpecGpu> gpuSetter) {
        if (this.gpu == null) {
            this.gpu = new ResourceFlavorSpecGpu();
            gpuSetter.accept(this.gpu);
        }

        return this;
    }

    /**
     * Get gpu
     * @return gpu
     */
    public ResourceFlavorSpecGpu getGpu() {
        return gpu;
    }

    public void setGpu(ResourceFlavorSpecGpu gpu) {
        this.gpu = gpu;
    }

    public ResourceFlavorSpec withNpu(ResourceFlavorSpecNpu npu) {
        this.npu = npu;
        return this;
    }

    public ResourceFlavorSpec withNpu(Consumer<ResourceFlavorSpecNpu> npuSetter) {
        if (this.npu == null) {
            this.npu = new ResourceFlavorSpecNpu();
            npuSetter.accept(this.npu);
        }

        return this;
    }

    /**
     * Get npu
     * @return npu
     */
    public ResourceFlavorSpecNpu getNpu() {
        return npu;
    }

    public void setNpu(ResourceFlavorSpecNpu npu) {
        this.npu = npu;
    }

    public ResourceFlavorSpec withDataVolume(List<ResourceFlavorSpecDataVolume> dataVolume) {
        this.dataVolume = dataVolume;
        return this;
    }

    public ResourceFlavorSpec addDataVolumeItem(ResourceFlavorSpecDataVolume dataVolumeItem) {
        if (this.dataVolume == null) {
            this.dataVolume = new ArrayList<>();
        }
        this.dataVolume.add(dataVolumeItem);
        return this;
    }

    public ResourceFlavorSpec withDataVolume(Consumer<List<ResourceFlavorSpecDataVolume>> dataVolumeSetter) {
        if (this.dataVolume == null) {
            this.dataVolume = new ArrayList<>();
        }
        dataVolumeSetter.accept(this.dataVolume);
        return this;
    }

    /**
     * **参数解释**：资源规格实例的存储资源信息。
     * @return dataVolume
     */
    public List<ResourceFlavorSpecDataVolume> getDataVolume() {
        return dataVolume;
    }

    public void setDataVolume(List<ResourceFlavorSpecDataVolume> dataVolume) {
        this.dataVolume = dataVolume;
    }

    public ResourceFlavorSpec withBillingModes(List<Integer> billingModes) {
        this.billingModes = billingModes;
        return this;
    }

    public ResourceFlavorSpec addBillingModesItem(Integer billingModesItem) {
        if (this.billingModes == null) {
            this.billingModes = new ArrayList<>();
        }
        this.billingModes.add(billingModesItem);
        return this;
    }

    public ResourceFlavorSpec withBillingModes(Consumer<List<Integer>> billingModesSetter) {
        if (this.billingModes == null) {
            this.billingModes = new ArrayList<>();
        }
        billingModesSetter.accept(this.billingModes);
        return this;
    }

    /**
     * **参数解释**：资源规格支持的计费模式。
     * @return billingModes
     */
    public List<Integer> getBillingModes() {
        return billingModes;
    }

    public void setBillingModes(List<Integer> billingModes) {
        this.billingModes = billingModes;
    }

    public ResourceFlavorSpec withBillingCode(String billingCode) {
        this.billingCode = billingCode;
        return this;
    }

    /**
     * **参数解释**：资源规格计费码。 **取值范围**：不涉及。
     * @return billingCode
     */
    public String getBillingCode() {
        return billingCode;
    }

    public void setBillingCode(String billingCode) {
        this.billingCode = billingCode;
    }

    public ResourceFlavorSpec withJobFlavors(List<String> jobFlavors) {
        this.jobFlavors = jobFlavors;
        return this;
    }

    public ResourceFlavorSpec addJobFlavorsItem(String jobFlavorsItem) {
        if (this.jobFlavors == null) {
            this.jobFlavors = new ArrayList<>();
        }
        this.jobFlavors.add(jobFlavorsItem);
        return this;
    }

    public ResourceFlavorSpec withJobFlavors(Consumer<List<String>> jobFlavorsSetter) {
        if (this.jobFlavors == null) {
            this.jobFlavors = new ArrayList<>();
        }
        jobFlavorsSetter.accept(this.jobFlavors);
        return this;
    }

    /**
     * **参数解释**：资源规格支持的作业类型列表。
     * @return jobFlavors
     */
    public List<String> getJobFlavors() {
        return jobFlavors;
    }

    public void setJobFlavors(List<String> jobFlavors) {
        this.jobFlavors = jobFlavors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceFlavorSpec that = (ResourceFlavorSpec) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.cpuArch, that.cpuArch)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.gpu, that.gpu) && Objects.equals(this.npu, that.npu)
            && Objects.equals(this.dataVolume, that.dataVolume) && Objects.equals(this.billingModes, that.billingModes)
            && Objects.equals(this.billingCode, that.billingCode) && Objects.equals(this.jobFlavors, that.jobFlavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cpuArch, cpu, memory, gpu, npu, dataVolume, billingModes, billingCode, jobFlavors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceFlavorSpec {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cpuArch: ").append(toIndentedString(cpuArch)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    npu: ").append(toIndentedString(npu)).append("\n");
        sb.append("    dataVolume: ").append(toIndentedString(dataVolume)).append("\n");
        sb.append("    billingModes: ").append(toIndentedString(billingModes)).append("\n");
        sb.append("    billingCode: ").append(toIndentedString(billingCode)).append("\n");
        sb.append("    jobFlavors: ").append(toIndentedString(jobFlavors)).append("\n");
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
