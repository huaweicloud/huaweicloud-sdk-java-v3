package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：资源配置。
 */
public class ResourceSpecV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu")

    private Double npu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private Double gpu;

    public ResourceSpecV3 withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * **参数解释**：资源规格。 **取值范围**：不涉及。 
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ResourceSpecV3 withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：CPU核数量，单位为毫核。 **约束限制**：不涉及。 **取值范围**：0~1000000。 **默认取值**：0。
     * minimum: 0
     * maximum: 1000000
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ResourceSpecV3 withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：内存大小，单位MB。 **约束限制**：不涉及。 **取值范围**：0~10000000。 **默认取值**：0。
     * minimum: 0
     * maximum: 10000000
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public ResourceSpecV3 withNpu(Double npu) {
        this.npu = npu;
        return this;
    }

    /**
     * **参数解释**：昇腾卡数量。 **约束限制**：暂时只支持整数。 **取值范围**：0~100。 **默认取值**：0。
     * minimum: 0
     * maximum: 100
     * @return npu
     */
    public Double getNpu() {
        return npu;
    }

    public void setNpu(Double npu) {
        this.npu = npu;
    }

    public ResourceSpecV3 withGpu(Double gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * **参数解释**：GPU卡数量。 **约束限制**：暂时只支持整数。 **取值范围**：0~100。 **默认取值**：0。
     * minimum: 0
     * maximum: 100
     * @return gpu
     */
    public Double getGpu() {
        return gpu;
    }

    public void setGpu(Double gpu) {
        this.gpu = gpu;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceSpecV3 that = (ResourceSpecV3) obj;
        return Objects.equals(this.specCode, that.specCode) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.npu, that.npu)
            && Objects.equals(this.gpu, that.gpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specCode, cpu, memory, npu, gpu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceSpecV3 {\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    npu: ").append(toIndentedString(npu)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
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
