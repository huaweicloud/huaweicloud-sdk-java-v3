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
 * InferFlavor
 */
public class InferFlavor {

    /**
     * **参数解释：** 架构类型。 **取值范围：** - X86_64 - arm64
     */
    public static final class ArchEnum {

        /**
         * Enum ARM64 for value: "arm64"
         */
        public static final ArchEnum ARM64 = new ArchEnum("arm64");

        /**
         * Enum X86_64 for value: "X86_64"
         */
        public static final ArchEnum X86_64 = new ArchEnum("X86_64");

        private static final Map<String, ArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchEnum> createStaticFields() {
            Map<String, ArchEnum> map = new HashMap<>();
            map.put("arm64", ARM64);
            map.put("X86_64", X86_64);
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

    private AscendResource ascend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing")

    private BillingResource billing;

    /**
     * **参数解释：** 规格处理器类型。 **取值范围：** - CPU - GPU - [ASCEND](tag:hws,hws_hk,hk,fcs_super)
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
     * **参数解释：** 规格类别。 **取值范围：** - DEFAULT：CodeLab规格。 - NOTEBOOK：Notebook规格。
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

    private GPUResource gpu;

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

    public InferFlavor withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释：** 架构类型。 **取值范围：** - X86_64 - arm64
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    public InferFlavor withAscend(AscendResource ascend) {
        this.ascend = ascend;
        return this;
    }

    public InferFlavor withAscend(Consumer<AscendResource> ascendSetter) {
        if (this.ascend == null) {
            this.ascend = new AscendResource();
            ascendSetter.accept(this.ascend);
        }

        return this;
    }

    /**
     * Get ascend
     * @return ascend
     */
    public AscendResource getAscend() {
        return ascend;
    }

    public void setAscend(AscendResource ascend) {
        this.ascend = ascend;
    }

    public InferFlavor withBilling(BillingResource billing) {
        this.billing = billing;
        return this;
    }

    public InferFlavor withBilling(Consumer<BillingResource> billingSetter) {
        if (this.billing == null) {
            this.billing = new BillingResource();
            billingSetter.accept(this.billing);
        }

        return this;
    }

    /**
     * Get billing
     * @return billing
     */
    public BillingResource getBilling() {
        return billing;
    }

    public void setBilling(BillingResource billing) {
        this.billing = billing;
    }

    public InferFlavor withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释：** 规格处理器类型。 **取值范围：** - CPU - GPU - [ASCEND](tag:hws,hws_hk,hk,fcs_super)
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public InferFlavor withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 规格描述信息。 **取值范围：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InferFlavor withFeature(FeatureEnum feature) {
        this.feature = feature;
        return this;
    }

    /**
     * **参数解释：** 规格类别。 **取值范围：** - DEFAULT：CodeLab规格。 - NOTEBOOK：Notebook规格。
     * @return feature
     */
    public FeatureEnum getFeature() {
        return feature;
    }

    public void setFeature(FeatureEnum feature) {
        this.feature = feature;
    }

    public InferFlavor withFree(Boolean free) {
        this.free = free;
        return this;
    }

    /**
     * **参数解释：** 是否为免费规格。 **取值范围：** - true: 免费规格。 - false: 付费规格。
     * @return free
     */
    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public InferFlavor withGpu(GPUResource gpu) {
        this.gpu = gpu;
        return this;
    }

    public InferFlavor withGpu(Consumer<GPUResource> gpuSetter) {
        if (this.gpu == null) {
            this.gpu = new GPUResource();
            gpuSetter.accept(this.gpu);
        }

        return this;
    }

    /**
     * Get gpu
     * @return gpu
     */
    public GPUResource getGpu() {
        return gpu;
    }

    public void setGpu(GPUResource gpu) {
        this.gpu = gpu;
    }

    public InferFlavor withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 规格ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InferFlavor withMemory(Long memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释：** 内存大小。 **取值范围：** 不涉及。
     * @return memory
     */
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public InferFlavor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 规格名称。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InferFlavor withSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
        return this;
    }

    /**
     * **参数解释：** 资源是否充足。 **取值范围：** - true 资源不足。 - false 资源充足。
     * @return soldOut
     */
    public Boolean getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }

    public InferFlavor withStorages(List<StoragesEnum> storages) {
        this.storages = storages;
        return this;
    }

    public InferFlavor addStoragesItem(StoragesEnum storagesItem) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        this.storages.add(storagesItem);
        return this;
    }

    public InferFlavor withStorages(Consumer<List<StoragesEnum>> storagesSetter) {
        if (this.storages == null) {
            this.storages = new ArrayList<>();
        }
        storagesSetter.accept(this.storages);
        return this;
    }

    /**
     * **参数解释：** 规格支持的存储类型。
     * @return storages
     */
    public List<StoragesEnum> getStorages() {
        return storages;
    }

    public void setStorages(List<StoragesEnum> storages) {
        this.storages = storages;
    }

    public InferFlavor withVcpus(Integer vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * **参数解释：** CPU核数。 **取值范围：** 不涉及。
     * @return vcpus
     */
    public Integer getVcpus() {
        return vcpus;
    }

    public void setVcpus(Integer vcpus) {
        this.vcpus = vcpus;
    }

    public InferFlavor withEvsMaxSize(String evsMaxSize) {
        this.evsMaxSize = evsMaxSize;
        return this;
    }

    /**
     * **参数解释：** EVS磁盘最大容量。 **取值范围：** 不涉及。
     * @return evsMaxSize
     */
    public String getEvsMaxSize() {
        return evsMaxSize;
    }

    public void setEvsMaxSize(String evsMaxSize) {
        this.evsMaxSize = evsMaxSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InferFlavor that = (InferFlavor) obj;
        return Objects.equals(this.arch, that.arch) && Objects.equals(this.ascend, that.ascend)
            && Objects.equals(this.billing, that.billing) && Objects.equals(this.category, that.category)
            && Objects.equals(this.description, that.description) && Objects.equals(this.feature, that.feature)
            && Objects.equals(this.free, that.free) && Objects.equals(this.gpu, that.gpu)
            && Objects.equals(this.id, that.id) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.name, that.name) && Objects.equals(this.soldOut, that.soldOut)
            && Objects.equals(this.storages, that.storages) && Objects.equals(this.vcpus, that.vcpus)
            && Objects.equals(this.evsMaxSize, that.evsMaxSize);
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
            evsMaxSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InferFlavor {\n");
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
