package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Flavor
 */
public class Flavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing")

    private BillingInfo billing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evs_max_size")

    private String evsMaxSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evs_sku_code")

    private String evsSkuCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private String feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free")

    private Boolean free;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grow_support_type")

    private String growSupportType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sold_out")

    private Boolean soldOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storages")

    private List<String> storages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private Integer vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private GPUsInfo gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ascend")

    private AscendInfo ascend;

    public Flavor withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释**：硬件架构类型。 **取值范围**：枚举类型，取值如下： - x86_64：X86架构。 - aarch64：ARM架构。
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public Flavor withBilling(BillingInfo billing) {
        this.billing = billing;
        return this;
    }

    public Flavor withBilling(Consumer<BillingInfo> billingSetter) {
        if (this.billing == null) {
            this.billing = new BillingInfo();
            billingSetter.accept(this.billing);
        }

        return this;
    }

    /**
     * Get billing
     * @return billing
     */
    public BillingInfo getBilling() {
        return billing;
    }

    public void setBilling(BillingInfo billing) {
        this.billing = billing;
    }

    public Flavor withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**：处理器类型。 **取值范围**：枚举类型，取值如下： - CPU - GPU - ASCEND
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Flavor withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：规格描述信息。 **取值范围**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Flavor withEvsMaxSize(String evsMaxSize) {
        this.evsMaxSize = evsMaxSize;
        return this;
    }

    /**
     * **参数解释**：规格包含EVS时，EVS存储创建的最大上限(单位：GB)。 **取值范围**：不涉及。
     * @return evsMaxSize
     */
    public String getEvsMaxSize() {
        return evsMaxSize;
    }

    public void setEvsMaxSize(String evsMaxSize) {
        this.evsMaxSize = evsMaxSize;
    }

    public Flavor withEvsSkuCode(String evsSkuCode) {
        this.evsSkuCode = evsSkuCode;
        return this;
    }

    /**
     * **参数解释**：规格包含EVS时，EVS存储的sku编码。 **取值范围**：不涉及。
     * @return evsSkuCode
     */
    public String getEvsSkuCode() {
        return evsSkuCode;
    }

    public void setEvsSkuCode(String evsSkuCode) {
        this.evsSkuCode = evsSkuCode;
    }

    public Flavor withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * **参数解释**：规格类别。 **取值范围**：枚举类型，取值如下： - DEFAULT：CodeLab规格。 - NOTEBOOK：Notebook规格。
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Flavor withFree(Boolean free) {
        this.free = free;
        return this;
    }

    /**
     * **参数解释**：是否为免费规格。 **取值范围**：布尔类型： - true：免费规格。 - false：非免费规格。
     * @return free
     */
    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public Flavor withGrowSupportType(String growSupportType) {
        this.growSupportType = growSupportType;
        return this;
    }

    /**
     * **参数解释**：支持站点类型。 **取值范围**：枚举类型，取值如下： - COMMON：国内与国际站都支持。 - NATIONAL：仅在国内站支持。 - INTERNATIONAL：仅在国际站支持。 - NONE：国内与国际站都不支持。
     * @return growSupportType
     */
    public String getGrowSupportType() {
        return growSupportType;
    }

    public void setGrowSupportType(String growSupportType) {
        this.growSupportType = growSupportType;
    }

    public Flavor withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：规格ID。 **取值范围**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Flavor withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：内存大小。 **取值范围**：不涉及。
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Flavor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：规格名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flavor withSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
        return this;
    }

    /**
     * **参数解释**：是否告罄。 **取值范围**：布尔类型： - true：告罄。 - false：未告罄。
     * @return soldOut
     */
    public Boolean getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }

    public Flavor withStorages(List<String> storages) {
        this.storages = storages;
        return this;
    }

    public Flavor addStoragesItem(String storagesItem) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        this.storages.add(storagesItem);
        return this;
    }

    public Flavor withStorages(Consumer<List<String>> storagesSetter) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        storagesSetter.accept(this.storages);
        return this;
    }

    /**
     * **参数解释**：规格支持的存储类型。 **取值范围**：枚举类型，取值如下： - EVS：云硬盘。 - OBS：对象存储服务。 - OBSFS：并行文件系统。 - EFS：弹性文件服务（SFS Turbo）
     * @return storages
     */
    public List<String> getStorages() {
        return storages;
    }

    public void setStorages(List<String> storages) {
        this.storages = storages;
    }

    public Flavor withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * **参数解释**：CPU核数。 **取值范围**：不涉及。
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public Flavor withGpu(GPUsInfo gpu) {
        this.gpu = gpu;
        return this;
    }

    public Flavor withGpu(Consumer<GPUsInfo> gpuSetter) {
        if (this.gpu == null) {
            this.gpu = new GPUsInfo();
            gpuSetter.accept(this.gpu);
        }

        return this;
    }

    /**
     * Get gpu
     * @return gpu
     */
    public GPUsInfo getGpu() {
        return gpu;
    }

    public void setGpu(GPUsInfo gpu) {
        this.gpu = gpu;
    }

    public Flavor withAscend(AscendInfo ascend) {
        this.ascend = ascend;
        return this;
    }

    public Flavor withAscend(Consumer<AscendInfo> ascendSetter) {
        if (this.ascend == null) {
            this.ascend = new AscendInfo();
            ascendSetter.accept(this.ascend);
        }

        return this;
    }

    /**
     * Get ascend
     * @return ascend
     */
    public AscendInfo getAscend() {
        return ascend;
    }

    public void setAscend(AscendInfo ascend) {
        this.ascend = ascend;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Flavor that = (Flavor) obj;
        return Objects.equals(this.arch, that.arch) && Objects.equals(this.billing, that.billing)
            && Objects.equals(this.category, that.category) && Objects.equals(this.description, that.description)
            && Objects.equals(this.evsMaxSize, that.evsMaxSize) && Objects.equals(this.evsSkuCode, that.evsSkuCode)
            && Objects.equals(this.feature, that.feature) && Objects.equals(this.free, that.free)
            && Objects.equals(this.growSupportType, that.growSupportType) && Objects.equals(this.id, that.id)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.name, that.name)
            && Objects.equals(this.soldOut, that.soldOut) && Objects.equals(this.storages, that.storages)
            && Objects.equals(this.vcpus, that.vcpus) && Objects.equals(this.gpu, that.gpu)
            && Objects.equals(this.ascend, that.ascend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arch,
            billing,
            category,
            description,
            evsMaxSize,
            evsSkuCode,
            feature,
            free,
            growSupportType,
            id,
            memory,
            name,
            soldOut,
            storages,
            vcpus,
            gpu,
            ascend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Flavor {\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    evsMaxSize: ").append(toIndentedString(evsMaxSize)).append("\n");
        sb.append("    evsSkuCode: ").append(toIndentedString(evsSkuCode)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    free: ").append(toIndentedString(free)).append("\n");
        sb.append("    growSupportType: ").append(toIndentedString(growSupportType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
        sb.append("    storages: ").append(toIndentedString(storages)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    ascend: ").append(toIndentedString(ascend)).append("\n");
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
