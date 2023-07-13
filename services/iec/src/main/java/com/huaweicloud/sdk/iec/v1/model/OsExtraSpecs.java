package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class OsExtraSpecs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond:operation:status")

    private String condOperationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs:generation")

    private String ecsGeneration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs:performancetype")

    private String ecsPerformancetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs:virtualization_env_types")

    private String ecsVirtualizationEnvTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info:cpu:name")

    private String infoCpuName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info:gpu:name")

    private String infoGpuName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_passthrough:alias")

    private String pciPassthroughAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_passthrough:enable_gpu")

    private String pciPassthroughEnableGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pci_passthrough:gpu_specs")

    private String pciPassthroughGpuSpecs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    public OsExtraSpecs withCondOperationStatus(String condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
        return this;
    }

    /**
     * 此参数是Region级配置，某个AZ没有在cond:operation:az参数中配置时默认使用此参数的取值。不配置或无此参数时等同于“normal”。
     * @return condOperationStatus
     */
    public String getCondOperationStatus() {
        return condOperationStatus;
    }

    public void setCondOperationStatus(String condOperationStatus) {
        this.condOperationStatus = condOperationStatus;
    }

    public OsExtraSpecs withEcsGeneration(String ecsGeneration) {
        this.ecsGeneration = ecsGeneration;
        return this;
    }

    /**
     * 边缘实例类型的代数。
     * @return ecsGeneration
     */
    public String getEcsGeneration() {
        return ecsGeneration;
    }

    public void setEcsGeneration(String ecsGeneration) {
        this.ecsGeneration = ecsGeneration;
    }

    public OsExtraSpecs withEcsPerformancetype(String ecsPerformancetype) {
        this.ecsPerformancetype = ecsPerformancetype;
        return this;
    }

    /**
     * 边缘实例规格的分类。
     * @return ecsPerformancetype
     */
    public String getEcsPerformancetype() {
        return ecsPerformancetype;
    }

    public void setEcsPerformancetype(String ecsPerformancetype) {
        this.ecsPerformancetype = ecsPerformancetype;
    }

    public OsExtraSpecs withEcsVirtualizationEnvTypes(String ecsVirtualizationEnvTypes) {
        this.ecsVirtualizationEnvTypes = ecsVirtualizationEnvTypes;
        return this;
    }

    /**
     * 虚拟化类型。
     * @return ecsVirtualizationEnvTypes
     */
    public String getEcsVirtualizationEnvTypes() {
        return ecsVirtualizationEnvTypes;
    }

    public void setEcsVirtualizationEnvTypes(String ecsVirtualizationEnvTypes) {
        this.ecsVirtualizationEnvTypes = ecsVirtualizationEnvTypes;
    }

    public OsExtraSpecs withInfoCpuName(String infoCpuName) {
        this.infoCpuName = infoCpuName;
        return this;
    }

    /**
     * 此参数是规格的CPU详细信息。
     * @return infoCpuName
     */
    public String getInfoCpuName() {
        return infoCpuName;
    }

    public void setInfoCpuName(String infoCpuName) {
        this.infoCpuName = infoCpuName;
    }

    public OsExtraSpecs withInfoGpuName(String infoGpuName) {
        this.infoGpuName = infoGpuName;
        return this;
    }

    /**
     * 此参数是规格的GPU详细信息。
     * @return infoGpuName
     */
    public String getInfoGpuName() {
        return infoGpuName;
    }

    public void setInfoGpuName(String infoGpuName) {
        this.infoGpuName = infoGpuName;
    }

    public OsExtraSpecs withPciPassthroughAlias(String pciPassthroughAlias) {
        this.pciPassthroughAlias = pciPassthroughAlias;
        return this;
    }

    /**
     * P1型本地直通GPU的型号和数量，参数值可设置为“nvidia-p100:1”，表示使用该规格创建的边缘实例将占用1张NVIDIA P100显卡。
     * @return pciPassthroughAlias
     */
    public String getPciPassthroughAlias() {
        return pciPassthroughAlias;
    }

    public void setPciPassthroughAlias(String pciPassthroughAlias) {
        this.pciPassthroughAlias = pciPassthroughAlias;
    }

    public OsExtraSpecs withPciPassthroughEnableGpu(String pciPassthroughEnableGpu) {
        this.pciPassthroughEnableGpu = pciPassthroughEnableGpu;
        return this;
    }

    /**
     * 显卡是否直通。 值为“true”，表示GPU直通。
     * @return pciPassthroughEnableGpu
     */
    public String getPciPassthroughEnableGpu() {
        return pciPassthroughEnableGpu;
    }

    public void setPciPassthroughEnableGpu(String pciPassthroughEnableGpu) {
        this.pciPassthroughEnableGpu = pciPassthroughEnableGpu;
    }

    public OsExtraSpecs withPciPassthroughGpuSpecs(String pciPassthroughGpuSpecs) {
        this.pciPassthroughGpuSpecs = pciPassthroughGpuSpecs;
        return this;
    }

    /**
     * G1型和G2型边缘实例应用的技术，包括GPU虚拟化和GPU直通。
     * @return pciPassthroughGpuSpecs
     */
    public String getPciPassthroughGpuSpecs() {
        return pciPassthroughGpuSpecs;
    }

    public void setPciPassthroughGpuSpecs(String pciPassthroughGpuSpecs) {
        this.pciPassthroughGpuSpecs = pciPassthroughGpuSpecs;
    }

    public OsExtraSpecs withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，resource_type是为了区分边缘实例的物理主机类型。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OsExtraSpecs that = (OsExtraSpecs) obj;
        return Objects.equals(this.condOperationStatus, that.condOperationStatus)
            && Objects.equals(this.ecsGeneration, that.ecsGeneration)
            && Objects.equals(this.ecsPerformancetype, that.ecsPerformancetype)
            && Objects.equals(this.ecsVirtualizationEnvTypes, that.ecsVirtualizationEnvTypes)
            && Objects.equals(this.infoCpuName, that.infoCpuName) && Objects.equals(this.infoGpuName, that.infoGpuName)
            && Objects.equals(this.pciPassthroughAlias, that.pciPassthroughAlias)
            && Objects.equals(this.pciPassthroughEnableGpu, that.pciPassthroughEnableGpu)
            && Objects.equals(this.pciPassthroughGpuSpecs, that.pciPassthroughGpuSpecs)
            && Objects.equals(this.resourceType, that.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condOperationStatus,
            ecsGeneration,
            ecsPerformancetype,
            ecsVirtualizationEnvTypes,
            infoCpuName,
            infoGpuName,
            pciPassthroughAlias,
            pciPassthroughEnableGpu,
            pciPassthroughGpuSpecs,
            resourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OsExtraSpecs {\n");
        sb.append("    condOperationStatus: ").append(toIndentedString(condOperationStatus)).append("\n");
        sb.append("    ecsGeneration: ").append(toIndentedString(ecsGeneration)).append("\n");
        sb.append("    ecsPerformancetype: ").append(toIndentedString(ecsPerformancetype)).append("\n");
        sb.append("    ecsVirtualizationEnvTypes: ").append(toIndentedString(ecsVirtualizationEnvTypes)).append("\n");
        sb.append("    infoCpuName: ").append(toIndentedString(infoCpuName)).append("\n");
        sb.append("    infoGpuName: ").append(toIndentedString(infoGpuName)).append("\n");
        sb.append("    pciPassthroughAlias: ").append(toIndentedString(pciPassthroughAlias)).append("\n");
        sb.append("    pciPassthroughEnableGpu: ").append(toIndentedString(pciPassthroughEnableGpu)).append("\n");
        sb.append("    pciPassthroughGpuSpecs: ").append(toIndentedString(pciPassthroughGpuSpecs)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
