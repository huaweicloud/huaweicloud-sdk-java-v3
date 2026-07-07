package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GPUInfo
 */
public class GPUInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private Integer gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_memory")

    private String gpuMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public GPUInfo withGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * **参数解释**：GPU卡数。 **取值范围**：不涉及。
     * @return gpu
     */
    public Integer getGpu() {
        return gpu;
    }

    public void setGpu(Integer gpu) {
        this.gpu = gpu;
    }

    public GPUInfo withGpuMemory(String gpuMemory) {
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

    public GPUInfo withType(String type) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GPUInfo that = (GPUInfo) obj;
        return Objects.equals(this.gpu, that.gpu) && Objects.equals(this.gpuMemory, that.gpuMemory)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gpu, gpuMemory, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GPUInfo {\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    gpuMemory: ").append(toIndentedString(gpuMemory)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
