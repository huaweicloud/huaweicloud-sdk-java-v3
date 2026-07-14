package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 自定义规格配置。当需要使用自定义规格时需要填写此参数。 **约束限制：** 不涉及。 **参数示例：** \&quot;custom_spec\&quot;: {     \&quot;arch\&quot;: \&quot;x86\&quot;,     \&quot;cpu\&quot;: 0.51,     \&quot;memory\&quot;: 1024.0 }
 */
public class CustomResourceSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private Float gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Float cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ascend")

    private Integer ascend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    public CustomResourceSpec withGpu(Float gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * **参数解释：** GPU个数。 **约束限制：** 不涉及。 **取值范围：** 支持配置小数，输入值不能小于0（最多支持2位小数，小数点后第3位做四舍五入处理）。 **默认取值：** 不涉及。
     * @return gpu
     */
    public Float getGpu() {
        return gpu;
    }

    public void setGpu(Float gpu) {
        this.gpu = gpu;
    }

    public CustomResourceSpec withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释：** 内存，单位为MB。 **约束限制：** 不涉及。 **取值范围：** 仅支持整数。 **默认取值：** 不涉及。
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public CustomResourceSpec withCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释：** CPU核数。 **约束限制：** 不涉及。 **取值范围：** 支持配置小数，输入值不能小于0.01（最多支持2位小数，小数点后第3位做四舍五入处理）。 **默认取值：** 不涉及。
     * @return cpu
     */
    public Float getCpu() {
        return cpu;
    }

    public void setCpu(Float cpu) {
        this.cpu = cpu;
    }

    public CustomResourceSpec withAscend(Integer ascend) {
        this.ascend = ascend;
        return this;
    }

    /**
     * **参数解释：** Ascend芯片个数。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return ascend
     */
    public Integer getAscend() {
        return ascend;
    }

    public void setAscend(Integer ascend) {
        this.ascend = ascend;
    }

    public CustomResourceSpec withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释：** 架构类型。 **约束限制：** 不涉及。 **取值范围：** 枚举值：x86\\arm64。 **默认取值：** 不涉及。
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomResourceSpec that = (CustomResourceSpec) obj;
        return Objects.equals(this.gpu, that.gpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.ascend, that.ascend)
            && Objects.equals(this.arch, that.arch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gpu, memory, cpu, ascend, arch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomResourceSpec {\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    ascend: ").append(toIndentedString(ascend)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
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
