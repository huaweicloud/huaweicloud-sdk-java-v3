package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * FlavorView
 */
public class FlavorView {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    @JacksonXmlProperty(localName = "flavor_id")

    private FlavorId flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_size")

    @JacksonXmlProperty(localName = "storage_size")

    private String storageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_cpu")

    @JacksonXmlProperty(localName = "num_cpu")

    private String numCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_cpu_init")

    @JacksonXmlProperty(localName = "num_cpu_init")

    private String numCpuInit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_size")

    @JacksonXmlProperty(localName = "memory_size")

    private String memorySize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_size_init")

    @JacksonXmlProperty(localName = "memory_size_init")

    private String memorySizeInit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    @JacksonXmlProperty(localName = "label")

    private String label;

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlavorView flavorView = (FlavorView) o;
        return Objects.equals(this.flavorId, flavorView.flavorId)
            && Objects.equals(this.storageSize, flavorView.storageSize)
            && Objects.equals(this.numCpu, flavorView.numCpu) && Objects.equals(this.numCpuInit, flavorView.numCpuInit)
            && Objects.equals(this.memorySize, flavorView.memorySize)
            && Objects.equals(this.memorySizeInit, flavorView.memorySizeInit)
            && Objects.equals(this.label, flavorView.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorId, storageSize, numCpu, numCpuInit, memorySize, memorySizeInit, label);
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
