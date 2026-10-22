package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：资源限制。 
 */
public class ResourceLimit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_allocatable")

    private ComputeAllocatable computeAllocatable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_size")

    private ComputeSize computeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "worker_sizes")

    private List<WorkerSizeInfo> workerSizes = null;

    public ResourceLimit withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：资源类型。 **取值范围**：   - CPU：中央处理器。   - GPU：图形处理器。   - NPU：神经网络处理器。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ResourceLimit withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * **参数解释**：资源规格编码，标识资源池中具体的资源规格，由系统生成，例如\"aidatalake.cpu.x86.general.1c2g\"。 **取值范围**：由英文字母、数字、小数点和中划线组成，长度为1~64个字符。 
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public ResourceLimit withComputeAllocatable(ComputeAllocatable computeAllocatable) {
        this.computeAllocatable = computeAllocatable;
        return this;
    }

    public ResourceLimit withComputeAllocatable(Consumer<ComputeAllocatable> computeAllocatableSetter) {
        if (this.computeAllocatable == null) {
            this.computeAllocatable = new ComputeAllocatable();
            computeAllocatableSetter.accept(this.computeAllocatable);
        }

        return this;
    }

    /**
     * Get computeAllocatable
     * @return computeAllocatable
     */
    public ComputeAllocatable getComputeAllocatable() {
        return computeAllocatable;
    }

    public void setComputeAllocatable(ComputeAllocatable computeAllocatable) {
        this.computeAllocatable = computeAllocatable;
    }

    public ResourceLimit withComputeSize(ComputeSize computeSize) {
        this.computeSize = computeSize;
        return this;
    }

    public ResourceLimit withComputeSize(Consumer<ComputeSize> computeSizeSetter) {
        if (this.computeSize == null) {
            this.computeSize = new ComputeSize();
            computeSizeSetter.accept(this.computeSize);
        }

        return this;
    }

    /**
     * Get computeSize
     * @return computeSize
     */
    public ComputeSize getComputeSize() {
        return computeSize;
    }

    public void setComputeSize(ComputeSize computeSize) {
        this.computeSize = computeSize;
    }

    public ResourceLimit withWorkerSizes(List<WorkerSizeInfo> workerSizes) {
        this.workerSizes = workerSizes;
        return this;
    }

    public ResourceLimit addWorkerSizesItem(WorkerSizeInfo workerSizesItem) {
        if (this.workerSizes == null) {
            this.workerSizes = new ArrayList<>();
        }
        this.workerSizes.add(workerSizesItem);
        return this;
    }

    public ResourceLimit withWorkerSizes(Consumer<List<WorkerSizeInfo>> workerSizesSetter) {
        if (this.workerSizes == null) {
            this.workerSizes = new ArrayList<>();
        }
        workerSizesSetter.accept(this.workerSizes);
        return this;
    }

    /**
     * **参数解释**：可选的资源配置枚举列表。
     * @return workerSizes
     */
    public List<WorkerSizeInfo> getWorkerSizes() {
        return workerSizes;
    }

    public void setWorkerSizes(List<WorkerSizeInfo> workerSizes) {
        this.workerSizes = workerSizes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLimit that = (ResourceLimit) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.computeAllocatable, that.computeAllocatable)
            && Objects.equals(this.computeSize, that.computeSize) && Objects.equals(this.workerSizes, that.workerSizes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, specCode, computeAllocatable, computeSize, workerSizes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceLimit {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    computeAllocatable: ").append(toIndentedString(computeAllocatable)).append("\n");
        sb.append("    computeSize: ").append(toIndentedString(computeSize)).append("\n");
        sb.append("    workerSizes: ").append(toIndentedString(workerSizes)).append("\n");
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
