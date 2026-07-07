package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数描述**：自定义规格参数信息。 **约束限制**：CPU、GPU专属池下，支持的自定义规格参数，此字段与请求体中的flavor字段不可同时填写。
 */
public class NotebookCustomSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private Float gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Float cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Float memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_type")

    private String gpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_flavor")

    private String resourceFlavor;

    public NotebookCustomSpec withGpu(Float gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * **参数描述**：实例申请的GPU卡数。 **约束限制**：CPU专属池场景下无此字段，GPU专属池场景必填。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * minimum: 0
     * maximum: 8
     * @return gpu
     */
    public Float getGpu() {
        return gpu;
    }

    public void setGpu(Float gpu) {
        this.gpu = gpu;
    }

    public NotebookCustomSpec withCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数描述**：实例申请的CPU核数大小。 **约束限制**：CPU/GPU专属池场景下自定义规格必填。 **取值范围**：整数部分最多10位，小数部分最多2位，且数值不得小于0.4。 **默认取值**：不涉及。
     * minimum: 0.3
     * @return cpu
     */
    public Float getCpu() {
        return cpu;
    }

    public void setCpu(Float cpu) {
        this.cpu = cpu;
    }

    public NotebookCustomSpec withMemory(Float memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数描述**：实例申请的内存大小。 **约束限制**：CPU/GPU专属池场景下自定义规格必填。 **取值范围**：必须是整数，整数部分最多10位，且数值不得小于513。 **默认取值**：不涉及。
     * minimum: 512
     * @return memory
     */
    public Float getMemory() {
        return memory;
    }

    public void setMemory(Float memory) {
        this.memory = memory;
    }

    public NotebookCustomSpec withGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    /**
     * **参数描述**：实例申请的GPU加速卡类型。 **约束限制**：CPU专属池场景下无此字段，GPU专属池场景下必填。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return gpuType
     */
    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    public NotebookCustomSpec withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数描述**：实例申请的CPU架构。 **约束限制**：CPU/GPU专属池场景下自定义规格必填。 **取值范围**：枚举类型，取值如下： - X86_64：x86架构 - AARCH64：ARM架构  **默认取值**：不涉及。
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public NotebookCustomSpec withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数描述**：实例申请的规格类型。 **约束限制**：CPU/GPU专属池场景下自定义规格必填。 **取值范围**：枚举类型，取值如下： - CPU：CPU规格。 - GPU：GPU规格。  **默认取值**：不涉及。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public NotebookCustomSpec withResourceFlavor(String resourceFlavor) {
        this.resourceFlavor = resourceFlavor;
        return this;
    }

    /**
     * **参数解释**：实例选择的目标资源池节点实例规格。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return resourceFlavor
     */
    public String getResourceFlavor() {
        return resourceFlavor;
    }

    public void setResourceFlavor(String resourceFlavor) {
        this.resourceFlavor = resourceFlavor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotebookCustomSpec that = (NotebookCustomSpec) obj;
        return Objects.equals(this.gpu, that.gpu) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.gpuType, that.gpuType)
            && Objects.equals(this.arch, that.arch) && Objects.equals(this.category, that.category)
            && Objects.equals(this.resourceFlavor, that.resourceFlavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gpu, cpu, memory, gpuType, arch, category, resourceFlavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotebookCustomSpec {\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    gpuType: ").append(toIndentedString(gpuType)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    resourceFlavor: ").append(toIndentedString(resourceFlavor)).append("\n");
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
