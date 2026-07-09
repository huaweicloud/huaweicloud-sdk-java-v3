package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源池驱动数据模型。
 */
public class PoolDriver {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpuVersion")

    private String gpuVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npuVersion")

    private String npuVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateStrategy")

    private String updateStrategy;

    public PoolDriver withGpuVersion(String gpuVersion) {
        this.gpuVersion = gpuVersion;
        return this;
    }

    /**
     * **参数解释**：资源池默认的GPU驱动版本。物理资源池中包含GPU规格时有效。 **取值范围**：不涉及。
     * @return gpuVersion
     */
    public String getGpuVersion() {
        return gpuVersion;
    }

    public void setGpuVersion(String gpuVersion) {
        this.gpuVersion = gpuVersion;
    }

    public PoolDriver withNpuVersion(String npuVersion) {
        this.npuVersion = npuVersion;
        return this;
    }

    /**
     * **参数解释**：资源池默认的NPU驱动版本。物理资源池中包含NPU规格时有效。 **取值范围**：不涉及。
     * @return npuVersion
     */
    public String getNpuVersion() {
        return npuVersion;
    }

    public void setNpuVersion(String npuVersion) {
        this.npuVersion = npuVersion;
    }

    public PoolDriver withUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }

    /**
     * **参数解释**：资源池驱动升级策略。 **取值范围**：可选值如下： - force：强制升级，立即升级节点驱动，可能影响节点上正在运行的作业。 - idle：安全升级，待节点上没有作业运行时进行驱动升级。
     * @return updateStrategy
     */
    public String getUpdateStrategy() {
        return updateStrategy;
    }

    public void setUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolDriver that = (PoolDriver) obj;
        return Objects.equals(this.gpuVersion, that.gpuVersion) && Objects.equals(this.npuVersion, that.npuVersion)
            && Objects.equals(this.updateStrategy, that.updateStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gpuVersion, npuVersion, updateStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolDriver {\n");
        sb.append("    gpuVersion: ").append(toIndentedString(gpuVersion)).append("\n");
        sb.append("    npuVersion: ").append(toIndentedString(npuVersion)).append("\n");
        sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
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
