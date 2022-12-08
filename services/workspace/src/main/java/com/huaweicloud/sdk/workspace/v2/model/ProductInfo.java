package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

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
    @JsonProperty(value = "architecture")

    private String architecture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_desc")

    private String cpuDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_gpu")

    private Boolean isGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_disk_type")

    private String systemDiskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_disk_size")

    private String systemDiskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_desc")

    private String gpuDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_switch")

    private String billSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descriptions")

    private String descriptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

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
    @JsonProperty(value = "domain_ids")

    private List<String> domainIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_product_list")

    private List<String> subProductList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    public ProductInfo withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品id。
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
     * 规格ID。
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
     * 产品类型。取值为： BASE：表示产品基础套餐，套餐镜像中不包括除操作系统之外的其他商业软件，私有镜像场景只能使用此类套餐。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProductInfo withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * 产品架构，当前支持：arm、x86。
     * @return architecture
     */
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public ProductInfo withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * cpu。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ProductInfo withCpuDesc(String cpuDesc) {
        this.cpuDesc = cpuDesc;
        return this;
    }

    /**
     * cpu描述。
     * @return cpuDesc
     */
    public String getCpuDesc() {
        return cpuDesc;
    }

    public void setCpuDesc(String cpuDesc) {
        this.cpuDesc = cpuDesc;
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
     * 系统盘大小，单位GB。
     * @return systemDiskSize
     */
    public String getSystemDiskSize() {
        return systemDiskSize;
    }

    public void setSystemDiskSize(String systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
    }

    public ProductInfo withGpuDesc(String gpuDesc) {
        this.gpuDesc = gpuDesc;
        return this;
    }

    /**
     * GPU描述。
     * @return gpuDesc
     */
    public String getGpuDesc() {
        return gpuDesc;
    }

    public void setGpuDesc(String gpuDesc) {
        this.gpuDesc = gpuDesc;
    }

    public ProductInfo withBillSwitch(String billSwitch) {
        this.billSwitch = billSwitch;
        return this;
    }

    /**
     * 话单开关，默认on,on-出话单模式,off-关话单模式,只支持反序列化，不支持序列化，不在接口中展示。
     * @return billSwitch
     */
    public String getBillSwitch() {
        return billSwitch;
    }

    public void setBillSwitch(String billSwitch) {
        this.billSwitch = billSwitch;
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
     * 周期套餐标识。0表示包周期，1表示按需。
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
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
     * 资源规格。
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
     * 云服务编码。
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

    public ProductInfo withDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }

    public ProductInfo addDomainIdsItem(String domainIdsItem) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        this.domainIds.add(domainIdsItem);
        return this;
    }

    public ProductInfo withDomainIds(Consumer<List<String>> domainIdsSetter) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        domainIdsSetter.accept(this.domainIds);
        return this;
    }

    /**
     * 该产品套餐支持的专有域id（domainId）。
     * @return domainIds
     */
    public List<String> getDomainIds() {
        return domainIds;
    }

    public void setDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
    }

    public ProductInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 产品状态，normal：正常、sellout：售空、abandon：下线。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductInfo withSubProductList(List<String> subProductList) {
        this.subProductList = subProductList;
        return this;
    }

    public ProductInfo addSubProductListItem(String subProductListItem) {
        if (this.subProductList == null) {
            this.subProductList = new ArrayList<>();
        }
        this.subProductList.add(subProductListItem);
        return this;
    }

    public ProductInfo withSubProductList(Consumer<List<String>> subProductListSetter) {
        if (this.subProductList == null) {
            this.subProductList = new ArrayList<>();
        }
        subProductListSetter.accept(this.subProductList);
        return this;
    }

    /**
     * 专属主机的子产品。
     * @return subProductList
     */
    public List<String> getSubProductList() {
        return subProductList;
    }

    public void setSubProductList(List<String> subProductList) {
        this.subProductList = subProductList;
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductInfo productInfo = (ProductInfo) o;
        return Objects.equals(this.productId, productInfo.productId)
            && Objects.equals(this.flavorId, productInfo.flavorId) && Objects.equals(this.type, productInfo.type)
            && Objects.equals(this.architecture, productInfo.architecture) && Objects.equals(this.cpu, productInfo.cpu)
            && Objects.equals(this.cpuDesc, productInfo.cpuDesc) && Objects.equals(this.memory, productInfo.memory)
            && Objects.equals(this.isGpu, productInfo.isGpu)
            && Objects.equals(this.systemDiskType, productInfo.systemDiskType)
            && Objects.equals(this.systemDiskSize, productInfo.systemDiskSize)
            && Objects.equals(this.gpuDesc, productInfo.gpuDesc)
            && Objects.equals(this.billSwitch, productInfo.billSwitch)
            && Objects.equals(this.descriptions, productInfo.descriptions)
            && Objects.equals(this.chargeMode, productInfo.chargeMode)
            && Objects.equals(this.containDataDisk, productInfo.containDataDisk)
            && Objects.equals(this.resourceType, productInfo.resourceType)
            && Objects.equals(this.cloudServiceType, productInfo.cloudServiceType)
            && Objects.equals(this.volumeProductType, productInfo.volumeProductType)
            && Objects.equals(this.domainIds, productInfo.domainIds) && Objects.equals(this.status, productInfo.status)
            && Objects.equals(this.subProductList, productInfo.subProductList)
            && Objects.equals(this.packageType, productInfo.packageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId,
            flavorId,
            type,
            architecture,
            cpu,
            cpuDesc,
            memory,
            isGpu,
            systemDiskType,
            systemDiskSize,
            gpuDesc,
            billSwitch,
            descriptions,
            chargeMode,
            containDataDisk,
            resourceType,
            cloudServiceType,
            volumeProductType,
            domainIds,
            status,
            subProductList,
            packageType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductInfo {\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    cpuDesc: ").append(toIndentedString(cpuDesc)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    isGpu: ").append(toIndentedString(isGpu)).append("\n");
        sb.append("    systemDiskType: ").append(toIndentedString(systemDiskType)).append("\n");
        sb.append("    systemDiskSize: ").append(toIndentedString(systemDiskSize)).append("\n");
        sb.append("    gpuDesc: ").append(toIndentedString(gpuDesc)).append("\n");
        sb.append("    billSwitch: ").append(toIndentedString(billSwitch)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    containDataDisk: ").append(toIndentedString(containDataDisk)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    volumeProductType: ").append(toIndentedString(volumeProductType)).append("\n");
        sb.append("    domainIds: ").append(toIndentedString(domainIds)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    subProductList: ").append(toIndentedString(subProductList)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
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
