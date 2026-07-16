package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NotebookFlavor
 */
public class NotebookFlavor {

    /**
     * **参数解释**：架构类型。 **取值范围**：枚举类型，取值如下： - x86_64 - aarch64
     */
    public static final class ArchEnum {

        /**
         * Enum X86_64 for value: "x86_64"
         */
        public static final ArchEnum X86_64 = new ArchEnum("x86_64");

        /**
         * Enum AARCH64 for value: "aarch64"
         */
        public static final ArchEnum AARCH64 = new ArchEnum("aarch64");

        private static final Map<String, ArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchEnum> createStaticFields() {
            Map<String, ArchEnum> map = new HashMap<>();
            map.put("x86_64", X86_64);
            map.put("aarch64", AARCH64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ArchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ArchEnum(value));
        }

        public static ArchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchEnum) {
                return this.value.equals(((ArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private ArchEnum arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ascend")

    private AscendInfo ascend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing")

    private BillingInfo billing;

    /**
     * **参数解释**：规格处理器类型。 **取值范围**：枚举类型，取值如下： - CPU - GPU - [ASCEND](tag:hc,hk,fcs_super)
     */
    public static final class CategoryEnum {

        /**
         * Enum ASCEND for value: "ASCEND"
         */
        public static final CategoryEnum ASCEND = new CategoryEnum("ASCEND");

        /**
         * Enum CPU for value: "CPU"
         */
        public static final CategoryEnum CPU = new CategoryEnum("CPU");

        /**
         * Enum GPU for value: "GPU"
         */
        public static final CategoryEnum GPU = new CategoryEnum("GPU");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("ASCEND", ASCEND);
            map.put("CPU", CPU);
            map.put("GPU", GPU);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * **参数解释**：实例类别。 **取值范围**：枚举类型，取值如下： - DEFAULT：CodeLab免费规格实例，每个用户最多只能创建一个。 - NOTEBOOK：计费规格实例。
     */
    public static final class FeatureEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final FeatureEnum DEFAULT = new FeatureEnum("DEFAULT");

        /**
         * Enum NOTEBOOK for value: "NOTEBOOK"
         */
        public static final FeatureEnum NOTEBOOK = new FeatureEnum("NOTEBOOK");

        private static final Map<String, FeatureEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FeatureEnum> createStaticFields() {
            Map<String, FeatureEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("NOTEBOOK", NOTEBOOK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FeatureEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FeatureEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FeatureEnum(value));
        }

        public static FeatureEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FeatureEnum) {
                return this.value.equals(((FeatureEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private FeatureEnum feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free")

    private Boolean free;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private GPUInfo gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Long memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sold_out")

    private Boolean soldOut;

    /**
     * Gets or Sets storages
     */
    public static final class StoragesEnum {

        /**
         * Enum EFS for value: "EFS"
         */
        public static final StoragesEnum EFS = new StoragesEnum("EFS");

        /**
         * Enum EFS_DEDICATED for value: "EFS_DEDICATED"
         */
        public static final StoragesEnum EFS_DEDICATED = new StoragesEnum("EFS_DEDICATED");

        /**
         * Enum EVS for value: "EVS"
         */
        public static final StoragesEnum EVS = new StoragesEnum("EVS");

        /**
         * Enum OBS for value: "OBS"
         */
        public static final StoragesEnum OBS = new StoragesEnum("OBS");

        /**
         * Enum OBSFS for value: "OBSFS"
         */
        public static final StoragesEnum OBSFS = new StoragesEnum("OBSFS");

        private static final Map<String, StoragesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StoragesEnum> createStaticFields() {
            Map<String, StoragesEnum> map = new HashMap<>();
            map.put("EFS", EFS);
            map.put("EFS_DEDICATED", EFS_DEDICATED);
            map.put("EVS", EVS);
            map.put("OBS", OBS);
            map.put("OBSFS", OBSFS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StoragesEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StoragesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StoragesEnum(value));
        }

        public static StoragesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StoragesEnum) {
                return this.value.equals(((StoragesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storages")

    private List<StoragesEnum> storages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private Integer vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evs_max_size")

    private String evsMaxSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evs_sku_code")

    private String evsSkuCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grow_support_type")

    private String growSupportType;

    public NotebookFlavor withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释**：架构类型。 **取值范围**：枚举类型，取值如下： - x86_64 - aarch64
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    public NotebookFlavor withAscend(AscendInfo ascend) {
        this.ascend = ascend;
        return this;
    }

    public NotebookFlavor withAscend(Consumer<AscendInfo> ascendSetter) {
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

    public NotebookFlavor withBilling(BillingInfo billing) {
        this.billing = billing;
        return this;
    }

    public NotebookFlavor withBilling(Consumer<BillingInfo> billingSetter) {
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

    public NotebookFlavor withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**：规格处理器类型。 **取值范围**：枚举类型，取值如下： - CPU - GPU - [ASCEND](tag:hc,hk,fcs_super)
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public NotebookFlavor withDescription(String description) {
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

    public NotebookFlavor withFeature(FeatureEnum feature) {
        this.feature = feature;
        return this;
    }

    /**
     * **参数解释**：实例类别。 **取值范围**：枚举类型，取值如下： - DEFAULT：CodeLab免费规格实例，每个用户最多只能创建一个。 - NOTEBOOK：计费规格实例。
     * @return feature
     */
    public FeatureEnum getFeature() {
        return feature;
    }

    public void setFeature(FeatureEnum feature) {
        this.feature = feature;
    }

    public NotebookFlavor withFree(Boolean free) {
        this.free = free;
        return this;
    }

    /**
     * **参数解释**：是否为免费规格。 **取值范围**：布尔类型： - true：免费规格。 - false：不是免费规格。
     * @return free
     */
    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public NotebookFlavor withGpu(GPUInfo gpu) {
        this.gpu = gpu;
        return this;
    }

    public NotebookFlavor withGpu(Consumer<GPUInfo> gpuSetter) {
        if (this.gpu == null) {
            this.gpu = new GPUInfo();
            gpuSetter.accept(this.gpu);
        }

        return this;
    }

    /**
     * Get gpu
     * @return gpu
     */
    public GPUInfo getGpu() {
        return gpu;
    }

    public void setGpu(GPUInfo gpu) {
        this.gpu = gpu;
    }

    public NotebookFlavor withId(String id) {
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

    public NotebookFlavor withMemory(Long memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：内存大小。 **取值范围**：不涉及。
     * @return memory
     */
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public NotebookFlavor withName(String name) {
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

    public NotebookFlavor withSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
        return this;
    }

    /**
     * **参数解释**：资源是否充足。 **取值范围**：布尔类型： - true 资源不足 - false 资源充足
     * @return soldOut
     */
    public Boolean getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }

    public NotebookFlavor withStorages(List<StoragesEnum> storages) {
        this.storages = storages;
        return this;
    }

    public NotebookFlavor addStoragesItem(StoragesEnum storagesItem) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        this.storages.add(storagesItem);
        return this;
    }

    public NotebookFlavor withStorages(Consumer<List<StoragesEnum>> storagesSetter) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        storagesSetter.accept(this.storages);
        return this;
    }

    /**
     * **参数解释**：规格支持的存储类型。枚举类型，取值如下： - EFS - EVS
     * @return storages
     */
    public List<StoragesEnum> getStorages() {
        return storages;
    }

    public void setStorages(List<StoragesEnum> storages) {
        this.storages = storages;
    }

    public NotebookFlavor withVcpus(Integer vcpus) {
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

    public NotebookFlavor withEvsMaxSize(String evsMaxSize) {
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

    public NotebookFlavor withEvsSkuCode(String evsSkuCode) {
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

    public NotebookFlavor withGrowSupportType(String growSupportType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotebookFlavor that = (NotebookFlavor) obj;
        return Objects.equals(this.arch, that.arch) && Objects.equals(this.ascend, that.ascend)
            && Objects.equals(this.billing, that.billing) && Objects.equals(this.category, that.category)
            && Objects.equals(this.description, that.description) && Objects.equals(this.feature, that.feature)
            && Objects.equals(this.free, that.free) && Objects.equals(this.gpu, that.gpu)
            && Objects.equals(this.id, that.id) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.name, that.name) && Objects.equals(this.soldOut, that.soldOut)
            && Objects.equals(this.storages, that.storages) && Objects.equals(this.vcpus, that.vcpus)
            && Objects.equals(this.evsMaxSize, that.evsMaxSize) && Objects.equals(this.evsSkuCode, that.evsSkuCode)
            && Objects.equals(this.growSupportType, that.growSupportType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arch,
            ascend,
            billing,
            category,
            description,
            feature,
            free,
            gpu,
            id,
            memory,
            name,
            soldOut,
            storages,
            vcpus,
            evsMaxSize,
            evsSkuCode,
            growSupportType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotebookFlavor {\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    ascend: ").append(toIndentedString(ascend)).append("\n");
        sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    free: ").append(toIndentedString(free)).append("\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
        sb.append("    storages: ").append(toIndentedString(storages)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    evsMaxSize: ").append(toIndentedString(evsMaxSize)).append("\n");
        sb.append("    evsSkuCode: ").append(toIndentedString(evsSkuCode)).append("\n");
        sb.append("    growSupportType: ").append(toIndentedString(growSupportType)).append("\n");
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
