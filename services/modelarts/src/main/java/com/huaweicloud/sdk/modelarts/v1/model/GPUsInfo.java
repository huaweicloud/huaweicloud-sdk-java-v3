package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GPUsInfo
 */
public class GPUsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private Double gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_memory")

    private String gpuMemory;

    public GPUsInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：GPU类型。 **取值范围**：不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GPUsInfo withGpu(Double gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * **参数解释**：GPU卡数。 **取值范围**：不涉及。
     * @return gpu
     */
    public Double getGpu() {
        return gpu;
    }

    public void setGpu(Double gpu) {
        this.gpu = gpu;
    }

    public GPUsInfo withGpuMemory(String gpuMemory) {
        this.gpuMemory = gpuMemory;
        return this;
    }

    /**
     * **参数解释**：GPU内存。 **取值范围**：不涉及。
     * @return gpuMemory
     */
    public String getGpuMemory() {
        return gpuMemory;
    }

    public void setGpuMemory(String gpuMemory) {
        this.gpuMemory = gpuMemory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GPUsInfo that = (GPUsInfo) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.gpu, that.gpu)
            && Objects.equals(this.gpuMemory, that.gpuMemory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, gpu, gpuMemory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GPUsInfo {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    gpuMemory: ").append(toIndentedString(gpuMemory)).append("\n");
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
