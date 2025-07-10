package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProductInfo
 */
public class ProductInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descriptions")

    private String descriptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private String architecture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_gpu")

    private Boolean isGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_disk_type")

    private String systemDiskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_disk_size")

    private String systemDiskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contain_data_disk")

    private Boolean containDataDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_product_type")

    private String volumeProductType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ProductInfo withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductInfo withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 产品规格ID。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public ProductInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 产品类型。  - BASE：表示产品基础套餐，套餐镜像中不包括除操作系统之外的其他商业软件，私有镜像场景只能使用此类套餐。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProductInfo withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ProductInfo withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存。
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public ProductInfo withDescriptions(String descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    /**
     * 产品描述。
     * @return descriptions
     */
    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public ProductInfo withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 周期套餐标识，0表示包周期，1表示按需。
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public ProductInfo withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * 产品架构。
     * @return architecture
     */
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public ProductInfo withIsGpu(Boolean isGpu) {
        this.isGpu = isGpu;
        return this;
    }

    /**
     * 是否是GPU类型的规格。
     * @return isGpu
     */
    public Boolean getIsGpu() {
        return isGpu;
    }

    public void setIsGpu(Boolean isGpu) {
        this.isGpu = isGpu;
    }

    public ProductInfo withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * 套餐类型。 - ultimate：尊享版 - enterprise：企业版 - general: 通用办公版 - workstation: 云工作站 - dedicated: 专属办公版 - solver: 解算版 - agile: 敏捷办公版
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public ProductInfo withSystemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }

    /**
     * 系统盘类型。
     * @return systemDiskType
     */
    public String getSystemDiskType() {
        return systemDiskType;
    }

    public void setSystemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
    }

    public ProductInfo withSystemDiskSize(String systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }

    /**
     * 系统盘大小。
     * @return systemDiskSize
     */
    public String getSystemDiskSize() {
        return systemDiskSize;
    }

    public void setSystemDiskSize(String systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
    }

    public ProductInfo withContainDataDisk(Boolean containDataDisk) {
        this.containDataDisk = containDataDisk;
        return this;
    }

    /**
     * 套餐计费是否包含了数据盘,off-不包含。
     * @return containDataDisk
     */
    public Boolean getContainDataDisk() {
        return containDataDisk;
    }

    public void setContainDataDisk(Boolean containDataDisk) {
        this.containDataDisk = containDataDisk;
    }

    public ProductInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ProductInfo withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务类型。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public ProductInfo withVolumeProductType(String volumeProductType) {
        this.volumeProductType = volumeProductType;
        return this;
    }

    /**
     * 磁盘产品类型。
     * @return volumeProductType
     */
    public String getVolumeProductType() {
        return volumeProductType;
    }

    public void setVolumeProductType(String volumeProductType) {
        this.volumeProductType = volumeProductType;
    }

    public ProductInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 默认在售状态，normal代表正常，sellout代表售空，abandon代表下线。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductInfo that = (ProductInfo) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.flavorId, that.flavorId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.descriptions, that.descriptions)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.architecture, that.architecture)
            && Objects.equals(this.isGpu, that.isGpu) && Objects.equals(this.packageType, that.packageType)
            && Objects.equals(this.systemDiskType, that.systemDiskType)
            && Objects.equals(this.systemDiskSize, that.systemDiskSize)
            && Objects.equals(this.containDataDisk, that.containDataDisk)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.volumeProductType, that.volumeProductType)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId,
            flavorId,
            type,
            cpu,
            memory,
            descriptions,
            chargeMode,
            architecture,
            isGpu,
            packageType,
            systemDiskType,
            systemDiskSize,
            containDataDisk,
            resourceType,
            cloudServiceType,
            volumeProductType,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductInfo {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    isGpu: ").append(toIndentedString(isGpu)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    systemDiskType: ").append(toIndentedString(systemDiskType)).append("\n");
        sb.append("    systemDiskSize: ").append(toIndentedString(systemDiskSize)).append("\n");
        sb.append("    containDataDisk: ").append(toIndentedString(containDataDisk)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    volumeProductType: ").append(toIndentedString(volumeProductType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
