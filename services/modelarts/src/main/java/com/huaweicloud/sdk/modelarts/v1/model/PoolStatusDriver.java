package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源池驱动信息。
 */
public class PoolStatusDriver {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private PoolDriverStatus gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu")

    private PoolDriverStatus npu;

    public PoolStatusDriver withGpu(PoolDriverStatus gpu) {
        this.gpu = gpu;
        return this;
    }

    public PoolStatusDriver withGpu(Consumer<PoolDriverStatus> gpuSetter) {
        if (this.gpu == null) {
            this.gpu = new PoolDriverStatus();
            gpuSetter.accept(this.gpu);
        }

        return this;
    }

    /**
     * Get gpu
     * @return gpu
     */
    public PoolDriverStatus getGpu() {
        return gpu;
    }

    public void setGpu(PoolDriverStatus gpu) {
        this.gpu = gpu;
    }

    public PoolStatusDriver withNpu(PoolDriverStatus npu) {
        this.npu = npu;
        return this;
    }

    public PoolStatusDriver withNpu(Consumer<PoolDriverStatus> npuSetter) {
        if (this.npu == null) {
            this.npu = new PoolDriverStatus();
            npuSetter.accept(this.npu);
        }

        return this;
    }

    /**
     * Get npu
     * @return npu
     */
    public PoolDriverStatus getNpu() {
        return npu;
    }

    public void setNpu(PoolDriverStatus npu) {
        this.npu = npu;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolStatusDriver that = (PoolStatusDriver) obj;
        return Objects.equals(this.gpu, that.gpu) && Objects.equals(this.npu, that.npu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gpu, npu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolStatusDriver {\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    npu: ").append(toIndentedString(npu)).append("\n");
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
