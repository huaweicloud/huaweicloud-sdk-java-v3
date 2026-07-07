package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数描述**：CPU、GPU专属池下，用户指定自定义规格的响应体信息
 */
public class NotebookCustomSpecRep {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu")

    private Float gpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_type")

    private String gpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Float cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Float memory;

    /**
     * **参数描述**：实例申请的CPU架构。 **取值范围**：枚举类型，取值如下：  - X86_64：x86架构 - AARCH64：ARM架构
     */
    public static final class ArchEnum {

        /**
         * Enum AARCH64 for value: "AARCH64"
         */
        public static final ArchEnum AARCH64 = new ArchEnum("AARCH64");

        /**
         * Enum X86_64 for value: "X86_64"
         */
        public static final ArchEnum X86_64 = new ArchEnum("X86_64");

        private static final Map<String, ArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchEnum> createStaticFields() {
            Map<String, ArchEnum> map = new HashMap<>();
            map.put("AARCH64", AARCH64);
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

    /**
     * **参数描述**：实例申请的规格类型。 **取值范围**：枚举类型，取值如下：  - CPU：CPU规格。 - GPU：GPU规格。
     */
    public static final class CategoryEnum {

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
    @JsonProperty(value = "resource_flavor")

    private String resourceFlavor;

    public NotebookCustomSpecRep withGpu(Float gpu) {
        this.gpu = gpu;
        return this;
    }

    /**
     * **参数描述**：实例申请的GPU卡数。 **取值范围**：不涉及。
     * minimum: 0
     * @return gpu
     */
    public Float getGpu() {
        return gpu;
    }

    public void setGpu(Float gpu) {
        this.gpu = gpu;
    }

    public NotebookCustomSpecRep withGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    /**
     * **参数描述**：实例申请的GPU加速卡类型。 **取值范围**：不涉及。
     * @return gpuType
     */
    public String getGpuType() {
        return gpuType;
    }

    public void setGpuType(String gpuType) {
        this.gpuType = gpuType;
    }

    public NotebookCustomSpecRep withCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数描述**：实例申请的CPU核数大小。 **取值范围**：整数部分最多10位，小数部分最多2位，且数值不得小于0.4。
     * minimum: 0.01
     * @return cpu
     */
    public Float getCpu() {
        return cpu;
    }

    public void setCpu(Float cpu) {
        this.cpu = cpu;
    }

    public NotebookCustomSpecRep withMemory(Float memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数描述**：实例申请的内存大小。 **取值范围**：必须是整数，整数部分最多10位，且数值不得小于513。
     * minimum: 1
     * @return memory
     */
    public Float getMemory() {
        return memory;
    }

    public void setMemory(Float memory) {
        this.memory = memory;
    }

    public NotebookCustomSpecRep withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数描述**：实例申请的CPU架构。 **取值范围**：枚举类型，取值如下：  - X86_64：x86架构 - AARCH64：ARM架构
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    public NotebookCustomSpecRep withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数描述**：实例申请的规格类型。 **取值范围**：枚举类型，取值如下：  - CPU：CPU规格。 - GPU：GPU规格。
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public NotebookCustomSpecRep withResourceFlavor(String resourceFlavor) {
        this.resourceFlavor = resourceFlavor;
        return this;
    }

    /**
     * **参数解释**：实例选择的目标资源池节点实例规格。 **取值范围**：不涉及。
     * @return resourceFlavor
     */
    public String getResourceFlavor() {
        return resourceFlavor;
    }

    public void setResourceFlavor(String resourceFlavor) {
        this.resourceFlavor = resourceFlavor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotebookCustomSpecRep that = (NotebookCustomSpecRep) obj;
        return Objects.equals(this.gpu, that.gpu) && Objects.equals(this.gpuType, that.gpuType)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.arch, that.arch) && Objects.equals(this.category, that.category)
            && Objects.equals(this.resourceFlavor, that.resourceFlavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gpu, gpuType, cpu, memory, arch, category, resourceFlavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotebookCustomSpecRep {\n");
        sb.append("    gpu: ").append(toIndentedString(gpu)).append("\n");
        sb.append("    gpuType: ").append(toIndentedString(gpuType)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    resourceFlavor: ").append(toIndentedString(resourceFlavor)).append("\n");
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
