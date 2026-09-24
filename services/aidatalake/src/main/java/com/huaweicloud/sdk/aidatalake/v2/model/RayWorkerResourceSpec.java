package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：Ray Worker资源配置。 **约束限制**：不涉及。
 */
public class RayWorkerResourceSpec {

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
    @JsonProperty(value = "worker_replicas")

    private Integer workerReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_autoscaling")

    private Boolean enableAutoscaling;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worker_min_replicas")

    private Integer workerMinReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worker_max_replicas")

    private Integer workerMaxReplicas;

    public RayWorkerResourceSpec withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：CPU核数量，单位为毫核。 **约束限制**：不涉及。 **取值范围**：最小值为1000。 **默认取值**：不涉及。
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public RayWorkerResourceSpec withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：内存大小，单位MB。 **约束限制**：不涉及。 **取值范围**：最小值为1024。 **默认取值**：不涉及。
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public RayWorkerResourceSpec withGpu(Double gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * **参数解释**：节点的GPU数量。 **约束限制**：不支持小于1的值或带小数部分的值（如0.5, 1.5）。 **取值范围**：需配置为大于等于1.0，且必须为整数值（如1.0, 2.0, 3.0, ...）。 **默认取值**：不涉及。
     * @return gpu
     */
    public Double getGpu() {
        return gpu;
    }

    public void setGpu(Double gpu) {
        this.gpu = gpu;
    }

    public RayWorkerResourceSpec withNpu(Double npu) {
        this.npu = npu;
        return this;
    }

    /**
     * **参数解释**：节点的NPU数量。 **约束限制**：不支持小于1的值或带小数部分的值（如0.5, 1.5）。 **取值范围**：需配置为大于等于1.0，且必须为整数值（如1.0, 2.0, 3.0, ...）。 **默认取值**：不涉及。
     * @return npu
     */
    public Double getNpu() {
        return npu;
    }

    public void setNpu(Double npu) {
        this.npu = npu;
    }

    public RayWorkerResourceSpec withWorkerReplicas(Integer workerReplicas) {
        this.workerReplicas = workerReplicas;
        return this;
    }

    /**
     * **参数解释**：Worker副本数量。 **约束限制**：不涉及。 **取值范围**：1~64。 **默认取值**：不涉及。
     * @return workerReplicas
     */
    public Integer getWorkerReplicas() {
        return workerReplicas;
    }

    public void setWorkerReplicas(Integer workerReplicas) {
        this.workerReplicas = workerReplicas;
    }

    public RayWorkerResourceSpec withEnableAutoscaling(Boolean enableAutoscaling) {
        this.enableAutoscaling = enableAutoscaling;
        return this;
    }

    /**
     * **参数解释**：是否开启worker节点的弹性伸缩。 **约束限制**：不涉及。 **取值范围**：可选值有：   - true：开启弹性伸缩。取该值时worker_min_replicas和worker_max_replicas必须设置。   - false：不开启弹性伸缩。取该值时worker_replicas必须设置。 **默认取值**：false。
     * @return enableAutoscaling
     */
    public Boolean getEnableAutoscaling() {
        return enableAutoscaling;
    }

    public void setEnableAutoscaling(Boolean enableAutoscaling) {
        this.enableAutoscaling = enableAutoscaling;
    }

    public RayWorkerResourceSpec withWorkerMinReplicas(Integer workerMinReplicas) {
        this.workerMinReplicas = workerMinReplicas;
        return this;
    }

    /**
     * **参数解释**：Worker最小副本数量。 **约束限制**：不涉及。 **取值范围**：0~64。 **默认取值**：不涉及。
     * @return workerMinReplicas
     */
    public Integer getWorkerMinReplicas() {
        return workerMinReplicas;
    }

    public void setWorkerMinReplicas(Integer workerMinReplicas) {
        this.workerMinReplicas = workerMinReplicas;
    }

    public RayWorkerResourceSpec withWorkerMaxReplicas(Integer workerMaxReplicas) {
        this.workerMaxReplicas = workerMaxReplicas;
        return this;
    }

    /**
     * **参数解释**：Worker最大副本数量。 **约束限制**：不涉及。 **取值范围**：1~64。 **默认取值**：不涉及。
     * @return workerMaxReplicas
     */
    public Integer getWorkerMaxReplicas() {
        return workerMaxReplicas;
    }

    public void setWorkerMaxReplicas(Integer workerMaxReplicas) {
        this.workerMaxReplicas = workerMaxReplicas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RayWorkerResourceSpec that = (RayWorkerResourceSpec) obj;
        return Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.gpu, that.gpu) && Objects.equals(this.npu, that.npu)
            && Objects.equals(this.workerReplicas, that.workerReplicas)
            && Objects.equals(this.enableAutoscaling, that.enableAutoscaling)
            && Objects.equals(this.workerMinReplicas, that.workerMinReplicas)
            && Objects.equals(this.workerMaxReplicas, that.workerMaxReplicas);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(cpu, memory, gpu, npu, workerReplicas, enableAutoscaling, workerMinReplicas, workerMaxReplicas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayWorkerResourceSpec {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    npu: ").append(toIndentedString(npu)).append("\n");
        sb.append("    workerReplicas: ").append(toIndentedString(workerReplicas)).append("\n");
        sb.append("    enableAutoscaling: ").append(toIndentedString(enableAutoscaling)).append("\n");
        sb.append("    workerMinReplicas: ").append(toIndentedString(workerMinReplicas)).append("\n");
        sb.append("    workerMaxReplicas: ").append(toIndentedString(workerMaxReplicas)).append("\n");
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
