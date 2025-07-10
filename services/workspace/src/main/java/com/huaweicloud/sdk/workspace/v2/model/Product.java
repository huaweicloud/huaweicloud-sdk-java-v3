package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Product
 */
public class Product {

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
    @JsonProperty(value = "data_disk_size")

    private String dataDiskSize;

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
    @JsonProperty(value = "product_desc")

    private Map<String, String> productDesc = null;

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
    @JsonProperty(value = "package_type")

    private String packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private Map<String, String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_space_size")

    private Integer shareSpaceSize;

    public Product withProductId(String productId) {
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

    public Product withFlavorId(String flavorId) {
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

    public Product withType(String type) {
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

    public Product withArchitecture(String architecture) {
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

    public Product withCpu(String cpu) {
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

    public Product withCpuDesc(String cpuDesc) {
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

    public Product withMemory(String memory) {
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

    public Product withIsGpu(Boolean isGpu) {
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

    public Product withSystemDiskType(String systemDiskType) {
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

    public Product withSystemDiskSize(String systemDiskSize) {
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

    public Product withDataDiskSize(String dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }

    /**
     * 数据盘大小，单位GB。
     * @return dataDiskSize
     */
    public String getDataDiskSize() {
        return dataDiskSize;
    }

    public void setDataDiskSize(String dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
    }

    public Product withGpuDesc(String gpuDesc) {
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

    public Product withBillSwitch(String billSwitch) {
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

    public Product withDescriptions(String descriptions) {
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

    public Product withProductDesc(Map<String, String> productDesc) {
        this.productDesc = productDesc;
        return this;
    }

    public Product putProductDescItem(String key, String productDescItem) {
        if (this.productDesc == null) {
            this.productDesc = new HashMap<>();
        }
        this.productDesc.put(key, productDescItem);
        return this;
    }

    public Product withProductDesc(Consumer<Map<String, String>> productDescSetter) {
        if (this.productDesc == null) {
            this.productDesc = new HashMap<>();
        }
        productDescSetter.accept(this.productDesc);
        return this;
    }

    /**
     * 产品名称<语言，各语言对应的产品描述>。
     * @return productDesc
     */
    public Map<String, String> getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(Map<String, String> productDesc) {
        this.productDesc = productDesc;
    }

    public Product withChargeMode(String chargeMode) {
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

    public Product withContainDataDisk(Boolean containDataDisk) {
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

    public Product withResourceType(String resourceType) {
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

    public Product withCloudServiceType(String cloudServiceType) {
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

    public Product withVolumeProductType(String volumeProductType) {
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

    public Product withDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }

    public Product addDomainIdsItem(String domainIdsItem) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        this.domainIds.add(domainIdsItem);
        return this;
    }

    public Product withDomainIds(Consumer<List<String>> domainIdsSetter) {
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

    public Product withStatus(String status) {
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

    public Product withPackageType(String packageType) {
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

    public Product withName(Map<String, String> name) {
        this.name = name;
        return this;
    }

    public Product putNameItem(String key, String nameItem) {
        if (this.name == null) {
            this.name = new HashMap<>();
        }
        this.name.put(key, nameItem);
        return this;
    }

    public Product withName(Consumer<Map<String, String>> nameSetter) {
        if (this.name == null) {
            this.name = new HashMap<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 产品名称<语言，各语言对应的产品名>。
     * @return name
     */
    public Map<String, String> getName() {
        return name;
    }

    public void setName(Map<String, String> name) {
        this.name = name;
    }

    public Product withShareSpaceSize(Integer shareSpaceSize) {
        this.shareSpaceSize = shareSpaceSize;
        return this;
    }

    /**
     * 协同方数。该套餐支持的最大协同人数。
     * minimum: 0
     * maximum: 100
     * @return shareSpaceSize
     */
    public Integer getShareSpaceSize() {
        return shareSpaceSize;
    }

    public void setShareSpaceSize(Integer shareSpaceSize) {
        this.shareSpaceSize = shareSpaceSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product that = (Product) obj;
        return Objects.equals(this.productId, that.productId) && Objects.equals(this.flavorId, that.flavorId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.architecture, that.architecture)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.cpuDesc, that.cpuDesc)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.isGpu, that.isGpu)
            && Objects.equals(this.systemDiskType, that.systemDiskType)
            && Objects.equals(this.systemDiskSize, that.systemDiskSize)
            && Objects.equals(this.dataDiskSize, that.dataDiskSize) && Objects.equals(this.gpuDesc, that.gpuDesc)
            && Objects.equals(this.billSwitch, that.billSwitch) && Objects.equals(this.descriptions, that.descriptions)
            && Objects.equals(this.productDesc, that.productDesc) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.containDataDisk, that.containDataDisk)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.volumeProductType, that.volumeProductType)
            && Objects.equals(this.domainIds, that.domainIds) && Objects.equals(this.status, that.status)
            && Objects.equals(this.packageType, that.packageType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.shareSpaceSize, that.shareSpaceSize);
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
            dataDiskSize,
            gpuDesc,
            billSwitch,
            descriptions,
            productDesc,
            chargeMode,
            containDataDisk,
            resourceType,
            cloudServiceType,
            volumeProductType,
            domainIds,
            status,
            packageType,
            name,
            shareSpaceSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Product {\n");
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
        sb.append("    dataDiskSize: ").append(toIndentedString(dataDiskSize)).append("\n");
        sb.append("    gpuDesc: ").append(toIndentedString(gpuDesc)).append("\n");
        sb.append("    billSwitch: ").append(toIndentedString(billSwitch)).append("\n");
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    productDesc: ").append(toIndentedString(productDesc)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    containDataDisk: ").append(toIndentedString(containDataDisk)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    volumeProductType: ").append(toIndentedString(volumeProductType)).append("\n");
        sb.append("    domainIds: ").append(toIndentedString(domainIds)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shareSpaceSize: ").append(toIndentedString(shareSpaceSize)).append("\n");
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
