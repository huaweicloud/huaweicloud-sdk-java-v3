package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FlavorView
 */
public class FlavorView {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private FlavorId flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_size")

    private String storageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_cpu")

    private String numCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_cpu_init")

    private String numCpuInit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_size")

    private String memorySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_size_init")

    private String memorySizeInit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom")

    private Boolean custom;

    public FlavorView withFlavorId(FlavorId flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * Get flavorId
     * @return flavorId
     */
    public FlavorId getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(FlavorId flavorId) {
        this.flavorId = flavorId;
    }

    public FlavorView withStorageSize(String storageSize) {
        this.storageSize = storageSize;
        return this;
    }

    /**
     * 存储大小。
     * @return storageSize
     */
    public String getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(String storageSize) {
        this.storageSize = storageSize;
    }

    public FlavorView withNumCpu(String numCpu) {
        this.numCpu = numCpu;
        return this;
    }

    /**
     * CPU限制。
     * @return numCpu
     */
    public String getNumCpu() {
        return numCpu;
    }

    public void setNumCpu(String numCpu) {
        this.numCpu = numCpu;
    }

    public FlavorView withNumCpuInit(String numCpuInit) {
        this.numCpuInit = numCpuInit;
        return this;
    }

    /**
     * CPU初始。
     * @return numCpuInit
     */
    public String getNumCpuInit() {
        return numCpuInit;
    }

    public void setNumCpuInit(String numCpuInit) {
        this.numCpuInit = numCpuInit;
    }

    public FlavorView withMemorySize(String memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * 内存限制。
     * @return memorySize
     */
    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    public FlavorView withMemorySizeInit(String memorySizeInit) {
        this.memorySizeInit = memorySizeInit;
        return this;
    }

    /**
     * 内存初始。
     * @return memorySizeInit
     */
    public String getMemorySizeInit() {
        return memorySizeInit;
    }

    public void setMemorySizeInit(String memorySizeInit) {
        this.memorySizeInit = memorySizeInit;
    }

    public FlavorView withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 展示标签。
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public FlavorView withCustom(Boolean custom) {
        this.custom = custom;
        return this;
    }

    /**
     * 是否是自定义资源规格。
     * @return custom
     */
    public Boolean getCustom() {
        return custom;
    }

    public void setCustom(Boolean custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorView that = (FlavorView) obj;
        return Objects.equals(this.flavorId, that.flavorId) && Objects.equals(this.storageSize, that.storageSize)
            && Objects.equals(this.numCpu, that.numCpu) && Objects.equals(this.numCpuInit, that.numCpuInit)
            && Objects.equals(this.memorySize, that.memorySize)
            && Objects.equals(this.memorySizeInit, that.memorySizeInit) && Objects.equals(this.label, that.label)
            && Objects.equals(this.custom, that.custom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorId, storageSize, numCpu, numCpuInit, memorySize, memorySizeInit, label, custom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorView {\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    storageSize: ").append(toIndentedString(storageSize)).append("\n");
        sb.append("    numCpu: ").append(toIndentedString(numCpu)).append("\n");
        sb.append("    numCpuInit: ").append(toIndentedString(numCpuInit)).append("\n");
        sb.append("    memorySize: ").append(toIndentedString(memorySize)).append("\n");
        sb.append("    memorySizeInit: ").append(toIndentedString(memorySizeInit)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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
