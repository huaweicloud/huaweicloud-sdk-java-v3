package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
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
    @JsonProperty(value = "sessions")

    private Integer sessions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cond_operation_az")

    private String condOperationAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_product_list")

    private List<String> subProductList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ids")

    private List<String> domainIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "series_type")

    private String seriesType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private OffsetDateTime expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_gpu_type")

    private String supportGpuType;

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
     * 产品类型。 - BASE：表示产品基础套餐，套餐镜像中不包括除操作系统之外的其他商业软件，私有镜像场景只能使用此类套餐。 - ADVANCED：表示产品高级套餐，套餐镜像中包括了一些商业软件。
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
     * 产品架构，当前仅支持x86。 - x86 - arm
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
     * CPU。
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
     * CPU描述。
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
     * 内存大小，单位兆：MB。
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
     * 系统盘大小。
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
     * 套餐标识。 - 1：表示包周期。 - 0：表示按需。
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
     * 套餐计费是否包含了数据盘。
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

    public ProductInfo withSessions(Integer sessions) {
        this.sessions = sessions;
        return this;
    }

    /**
     * 套餐默认支持的最大会话数。
     * @return sessions
     */
    public Integer getSessions() {
        return sessions;
    }

    public void setSessions(Integer sessions) {
        this.sessions = sessions;
    }

    public ProductInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 产品套餐在销售模式下的状态，取值自ECS的cond:operation:status。 不配置时等同于normal在售状态。 * `normal` - 正常商用 * `abandon` - 下线（即不显示） * `sellout` - 售罄 * `obt` - 公测 * `obt_sellout` - 公测售罄 * `promotion` - 推荐(等同normal，也是商用)
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProductInfo withCondOperationAz(String condOperationAz) {
        this.condOperationAz = condOperationAz;
        return this;
    }

    /**
     * 产品套餐在可用区的状态，配套status使用。 > - 此参数是AZ级配置，优选取此参数的值，某个AZ没有在此参数中配置时默认使用status参数的取值。 > - 配置格式“az(xx)”。()内为某个AZ的flavor状态，()内必须要填有状态，不填为无效配置。 > - 例如：套餐在某个region的az0正常商用，az1售罄，az2公测，az3正常商用，其他az显示下线，可配置为： >   - “status”设置为：“abandon” 。 >   - “cond_operation_az”设置为：“az0(normal), az1(sellout), az2(obt), az3(normal)”。  > -  说明：如果flavor在某个AZ下的状态与status配置状态不同，必须配置该参数。
     * @return condOperationAz
     */
    public String getCondOperationAz() {
        return condOperationAz;
    }

    public void setCondOperationAz(String condOperationAz) {
        this.condOperationAz = condOperationAz;
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
     * 产品属于专有的domainId。
     * @return domainIds
     */
    public List<String> getDomainIds() {
        return domainIds;
    }

    public void setDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
    }

    public ProductInfo withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * 套餐类型： - general：表示产品通用套餐。 - dedicated：表示产品专属主机套餐。
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public ProductInfo withSeriesType(String seriesType) {
        this.seriesType = seriesType;
        return this;
    }

    /**
     * 系列类型。
     * @return seriesType
     */
    public String getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(String seriesType) {
        this.seriesType = seriesType;
    }

    public ProductInfo withExpireTime(OffsetDateTime expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 产品套餐过期时间,产品将在改时间点后逐步下架。
     * @return expireTime
     */
    public OffsetDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(OffsetDateTime expireTime) {
        this.expireTime = expireTime;
    }

    public ProductInfo withSupportGpuType(String supportGpuType) {
        this.supportGpuType = supportGpuType;
        return this;
    }

    /**
     * 产品套餐支持的GPU类型。
     * @return supportGpuType
     */
    public String getSupportGpuType() {
        return supportGpuType;
    }

    public void setSupportGpuType(String supportGpuType) {
        this.supportGpuType = supportGpuType;
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
            && Objects.equals(this.type, that.type) && Objects.equals(this.architecture, that.architecture)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.cpuDesc, that.cpuDesc)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.isGpu, that.isGpu)
            && Objects.equals(this.systemDiskType, that.systemDiskType)
            && Objects.equals(this.systemDiskSize, that.systemDiskSize) && Objects.equals(this.gpuDesc, that.gpuDesc)
            && Objects.equals(this.descriptions, that.descriptions) && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.containDataDisk, that.containDataDisk)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.volumeProductType, that.volumeProductType)
            && Objects.equals(this.sessions, that.sessions) && Objects.equals(this.status, that.status)
            && Objects.equals(this.condOperationAz, that.condOperationAz)
            && Objects.equals(this.subProductList, that.subProductList)
            && Objects.equals(this.domainIds, that.domainIds) && Objects.equals(this.packageType, that.packageType)
            && Objects.equals(this.seriesType, that.seriesType) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.supportGpuType, that.supportGpuType);
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
            descriptions,
            chargeMode,
            containDataDisk,
            resourceType,
            cloudServiceType,
            volumeProductType,
            sessions,
            status,
            condOperationAz,
            subProductList,
            domainIds,
            packageType,
            seriesType,
            expireTime,
            supportGpuType);
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
        sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    containDataDisk: ").append(toIndentedString(containDataDisk)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    volumeProductType: ").append(toIndentedString(volumeProductType)).append("\n");
        sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    condOperationAz: ").append(toIndentedString(condOperationAz)).append("\n");
        sb.append("    subProductList: ").append(toIndentedString(subProductList)).append("\n");
        sb.append("    domainIds: ").append(toIndentedString(domainIds)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    supportGpuType: ").append(toIndentedString(supportGpuType)).append("\n");
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
