package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点资源量。
 */
public class NodeResource {

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

    public NodeResource withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：节点的CPU核心数量。 **取值范围**：不涉及。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public NodeResource withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：节点的内存大小。以Gi为单位。 **取值范围**：不涉及。
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public NodeResource withNvidiaComGpu(String nvidiaComGpu) {
        this.nvidiaComGpu = nvidiaComGpu;
        return this;
    }

    /**
     * **参数解释**：节点的GPU卡数。 **取值范围**：不涉及。
     * @return nvidiaComGpu
     */
    public String getNvidiaComGpu() {
        return nvidiaComGpu;
    }

    public void setNvidiaComGpu(String nvidiaComGpu) {
        this.nvidiaComGpu = nvidiaComGpu;
    }

    public NodeResource withHuaweiComAscendSnt3(String huaweiComAscendSnt3) {
        this.huaweiComAscendSnt3 = huaweiComAscendSnt3;
        return this;
    }

    /**
     * **参数解释**：节点的snt3型NPU卡数量。 **取值范围**：不涉及。
     * @return huaweiComAscendSnt3
     */
    public String getHuaweiComAscendSnt3() {
        return huaweiComAscendSnt3;
    }

    public void setHuaweiComAscendSnt3(String huaweiComAscendSnt3) {
        this.huaweiComAscendSnt3 = huaweiComAscendSnt3;
    }

    public NodeResource withHuaweiComAscendSnt9(String huaweiComAscendSnt9) {
        this.huaweiComAscendSnt9 = huaweiComAscendSnt9;
        return this;
    }

    /**
     * **参数解释**：节点的snt9型NPU卡数量。 **取值范围**：不涉及。
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
        NodeResource that = (NodeResource) obj;
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
        sb.append("class NodeResource {\n");
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
