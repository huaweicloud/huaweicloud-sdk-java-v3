package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 作业使用的资源量信息。
 */
public class ResourceRequirementVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nvidia.com/gpu")

    private String nvidiaComGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huawei.com/ascend-310")

    private String huaweiComAscend310;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huawei.com/ascend-1980")

    private String huaweiComAscend1980;

    public ResourceRequirementVO withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：作业的运行使用的CPU资源量。 **取值范围**：不涉及。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ResourceRequirementVO withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：作业的运行使用的内存资源量。 **取值范围**：不涉及。
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public ResourceRequirementVO withNvidiaComGpu(String nvidiaComGpu) {
        this.nvidiaComGpu = nvidiaComGpu;
        return this;
    }

    /**
     * **参数解释**：作业的运行使用的GPU资源量。 **取值范围**：不涉及。
     * @return nvidiaComGpu
     */
    public String getNvidiaComGpu() {
        return nvidiaComGpu;
    }

    public void setNvidiaComGpu(String nvidiaComGpu) {
        this.nvidiaComGpu = nvidiaComGpu;
    }

    public ResourceRequirementVO withHuaweiComAscend310(String huaweiComAscend310) {
        this.huaweiComAscend310 = huaweiComAscend310;
        return this;
    }

    /**
     * **参数解释**：作业的运行使用的snt3类型NPU资源量。 **取值范围**：不涉及。
     * @return huaweiComAscend310
     */
    public String getHuaweiComAscend310() {
        return huaweiComAscend310;
    }

    public void setHuaweiComAscend310(String huaweiComAscend310) {
        this.huaweiComAscend310 = huaweiComAscend310;
    }

    public ResourceRequirementVO withHuaweiComAscend1980(String huaweiComAscend1980) {
        this.huaweiComAscend1980 = huaweiComAscend1980;
        return this;
    }

    /**
     * **参数解释**：作业的运行使用的snt9类型NPU资源量。 **取值范围**：不涉及。
     * @return huaweiComAscend1980
     */
    public String getHuaweiComAscend1980() {
        return huaweiComAscend1980;
    }

    public void setHuaweiComAscend1980(String huaweiComAscend1980) {
        this.huaweiComAscend1980 = huaweiComAscend1980;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceRequirementVO that = (ResourceRequirementVO) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.nvidiaComGpu, that.nvidiaComGpu)
            && Objects.equals(this.huaweiComAscend310, that.huaweiComAscend310)
            && Objects.equals(this.huaweiComAscend1980, that.huaweiComAscend1980);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, nvidiaComGpu, huaweiComAscend310, huaweiComAscend1980);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceRequirementVO {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    nvidiaComGpu: ").append(toIndentedString(nvidiaComGpu)).append("\n");
        sb.append("    huaweiComAscend310: ").append(toIndentedString(huaweiComAscend310)).append("\n");
        sb.append("    huaweiComAscend1980: ").append(toIndentedString(huaweiComAscend1980)).append("\n");
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
