package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 微服务引擎专享版相关参数。
 */
public class EngineSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availableCpuMemory")

    private String availableCpuMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linear")

    private String linear;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availablePrefix")

    private String availablePrefix;

    public EngineSpec withAvailableCpuMemory(String availableCpuMemory) {
        this.availableCpuMemory = availableCpuMemory;
        return this;
    }

    /**
     * CPU及内存规格。
     * @return availableCpuMemory
     */
    public String getAvailableCpuMemory() {
        return availableCpuMemory;
    }

    public void setAvailableCpuMemory(String availableCpuMemory) {
        this.availableCpuMemory = availableCpuMemory;
    }

    public EngineSpec withLinear(String linear) {
        this.linear = linear;
        return this;
    }

    /**
     * 是否为线性规格。
     * @return linear
     */
    public String getLinear() {
        return linear;
    }

    public void setLinear(String linear) {
        this.linear = linear;
    }

    public EngineSpec withAvailablePrefix(String availablePrefix) {
        this.availablePrefix = availablePrefix;
        return this;
    }

    /**
     * 可用节点规格类型前缀。
     * @return availablePrefix
     */
    public String getAvailablePrefix() {
        return availablePrefix;
    }

    public void setAvailablePrefix(String availablePrefix) {
        this.availablePrefix = availablePrefix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EngineSpec that = (EngineSpec) obj;
        return Objects.equals(this.availableCpuMemory, that.availableCpuMemory)
            && Objects.equals(this.linear, that.linear) && Objects.equals(this.availablePrefix, that.availablePrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableCpuMemory, linear, availablePrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineSpec {\n");
        sb.append("    availableCpuMemory: ").append(toIndentedString(availableCpuMemory)).append("\n");
        sb.append("    linear: ").append(toIndentedString(linear)).append("\n");
        sb.append("    availablePrefix: ").append(toIndentedString(availablePrefix)).append("\n");
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
