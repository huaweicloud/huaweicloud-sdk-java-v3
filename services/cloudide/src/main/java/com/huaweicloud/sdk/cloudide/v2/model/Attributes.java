package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Attributes
 */
public class Attributes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_limit")

    private String cpuLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_limit_bytes")

    private String memoryLimitBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pvc_quantity")

    private String pvcQuantity;

    public Attributes withCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }

    /**
     * cpu限制
     * @return cpuLimit
     */
    public String getCpuLimit() {
        return cpuLimit;
    }

    public void setCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
    }

    public Attributes withMemoryLimitBytes(String memoryLimitBytes) {
        this.memoryLimitBytes = memoryLimitBytes;
        return this;
    }

    /**
     * 内存限制
     * @return memoryLimitBytes
     */
    public String getMemoryLimitBytes() {
        return memoryLimitBytes;
    }

    public void setMemoryLimitBytes(String memoryLimitBytes) {
        this.memoryLimitBytes = memoryLimitBytes;
    }

    public Attributes withPvcQuantity(String pvcQuantity) {
        this.pvcQuantity = pvcQuantity;
        return this;
    }

    /**
     * pvc规格
     * @return pvcQuantity
     */
    public String getPvcQuantity() {
        return pvcQuantity;
    }

    public void setPvcQuantity(String pvcQuantity) {
        this.pvcQuantity = pvcQuantity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Attributes attributes = (Attributes) o;
        return Objects.equals(this.cpuLimit, attributes.cpuLimit)
            && Objects.equals(this.memoryLimitBytes, attributes.memoryLimitBytes)
            && Objects.equals(this.pvcQuantity, attributes.pvcQuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuLimit, memoryLimitBytes, pvcQuantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Attributes {\n");
        sb.append("    cpuLimit: ").append(toIndentedString(cpuLimit)).append("\n");
        sb.append("    memoryLimitBytes: ").append(toIndentedString(memoryLimitBytes)).append("\n");
        sb.append("    pvcQuantity: ").append(toIndentedString(pvcQuantity)).append("\n");
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
