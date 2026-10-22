package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * WorkerGroupConfig
 */
public class WorkerGroupConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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
    @JsonProperty(value = "gpu")

    private Double gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu")

    private Double npu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private ImageVersionInfo image;

    public WorkerGroupConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：工作组名称。 **约束限制**：已有工作组名称不支持修改，需和当前工作组名称保持一致；新增工作组该字段必填。 **取值范围**：长度为1~63个字符，支持字母、数字和中划线的组合。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerGroupConfig withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * **参数解释**：节点规格。 **约束限制**：不涉及。 **取值范围**：支持英文字母、数字、小数点及连字符，长度为1~64个字符。 **默认取值**：不涉及。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public WorkerGroupConfig withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：通算CPU大小，单位毫核。 **约束限制**：不涉及。 **取值范围**：0~2147483647。 **默认取值**：不涉及。
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public WorkerGroupConfig withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：通算内存大小，单位MB。 **约束限制**：不涉及。 **取值范围**：0~2147483647。 **默认取值**：不涉及。
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public WorkerGroupConfig withGpu(Double gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * **参数解释**：GPU卡数量。 **约束限制**：暂时只支持整数。 **取值范围**：0~2147483647。 **默认取值**：不涉及。
     * @return gpu
     */
    public Double getGpu() {
        return gpu;
    }

    public void setGpu(Double gpu) {
        this.gpu = gpu;
    }

    public WorkerGroupConfig withNpu(Double npu) {
        this.npu = npu;
        return this;
    }

    /**
     * **参数解释**：NPU卡数量。 **约束限制**：暂时只支持整数。 **取值范围**：0~2147483647。 **默认取值**：不涉及。
     * @return npu
     */
    public Double getNpu() {
        return npu;
    }

    public void setNpu(Double npu) {
        this.npu = npu;
    }

    public WorkerGroupConfig withImage(ImageVersionInfo image) {
        this.image = image;
        return this;
    }

    public WorkerGroupConfig withImage(Consumer<ImageVersionInfo> imageSetter) {
        if (this.image == null) {
            this.image = new ImageVersionInfo();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public ImageVersionInfo getImage() {
        return image;
    }

    public void setImage(ImageVersionInfo image) {
        this.image = image;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkerGroupConfig that = (WorkerGroupConfig) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.gpu, that.gpu) && Objects.equals(this.npu, that.npu)
            && Objects.equals(this.image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, specCode, cpu, memory, gpu, npu, image);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkerGroupConfig {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    npu: ").append(toIndentedString(npu)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
