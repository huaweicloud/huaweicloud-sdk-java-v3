package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：作业运行请求的资源量。
 */
public class WorkloadResourceRequirement {

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
    @JsonProperty(value = "huawei.com/ascend-snt3")

    private String huaweiComAscendSnt3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huawei.com/ascend-snt9")

    private String huaweiComAscendSnt9;

    public WorkloadResourceRequirement withCpu(String cpu) {
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

    public WorkloadResourceRequirement withMemory(String memory) {
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

    public WorkloadResourceRequirement withNvidiaComGpu(String nvidiaComGpu) {
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

    public WorkloadResourceRequirement withHuaweiComAscendSnt3(String huaweiComAscendSnt3) {
        this.huaweiComAscendSnt3 = huaweiComAscendSnt3;
        return this;
    }

    /**
     * **参数解释**：作业的运行使用的snt3类型NPU资源量。 **取值范围**：不涉及
     * @return huaweiComAscendSnt3
     */
    public String getHuaweiComAscendSnt3() {
        return huaweiComAscendSnt3;
    }

    public void setHuaweiComAscendSnt3(String huaweiComAscendSnt3) {
        this.huaweiComAscendSnt3 = huaweiComAscendSnt3;
    }

    public WorkloadResourceRequirement withHuaweiComAscendSnt9(String huaweiComAscendSnt9) {
        this.huaweiComAscendSnt9 = huaweiComAscendSnt9;
        return this;
    }

    /**
     * **参数解释**：作业的运行使用的snt9类型NPU资源量。 **取值范围**：不涉及。
     * @return huaweiComAscendSnt9
     */
    public String getHuaweiComAscendSnt9() {
        return huaweiComAscendSnt9;
    }

    public void setHuaweiComAscendSnt9(String huaweiComAscendSnt9) {
        this.huaweiComAscendSnt9 = huaweiComAscendSnt9;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadResourceRequirement that = (WorkloadResourceRequirement) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.nvidiaComGpu, that.nvidiaComGpu)
            && Objects.equals(this.huaweiComAscendSnt3, that.huaweiComAscendSnt3)
            && Objects.equals(this.huaweiComAscendSnt9, that.huaweiComAscendSnt9);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, memory, nvidiaComGpu, huaweiComAscendSnt3, huaweiComAscendSnt9);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadResourceRequirement {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    nvidiaComGpu: ").append(toIndentedString(nvidiaComGpu)).append("\n");
        sb.append("    huaweiComAscendSnt3: ").append(toIndentedString(huaweiComAscendSnt3)).append("\n");
        sb.append("    huaweiComAscendSnt9: ").append(toIndentedString(huaweiComAscendSnt9)).append("\n");
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
