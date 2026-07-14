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
 * ImageRegRequest
 */
public class ImageRegRequest {

    /**
     * **参数解释**：该镜像所支持处理器架构类型。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - X86_64：x86处理器架构。 - AARCH64：ARM体系架构。  **默认取值**：X86_64。
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * **参数解释**：指定镜像来源，可选项。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - CUSTOMIZE: 用户自定义构建镜像。 - IMAGE_SAVE：Notebook实例保存镜像。  **默认取值**：CUSTOMIZE。
     */
    public static final class OriginEnum {

        /**
         * Enum CUSTOMIZE for value: "CUSTOMIZE"
         */
        public static final OriginEnum CUSTOMIZE = new OriginEnum("CUSTOMIZE");

        /**
         * Enum IMAGE_SAVE for value: "IMAGE_SAVE"
         */
        public static final OriginEnum IMAGE_SAVE = new OriginEnum("IMAGE_SAVE");

        private static final Map<String, OriginEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OriginEnum> createStaticFields() {
            Map<String, OriginEnum> map = new HashMap<>();
            map.put("CUSTOMIZE", CUSTOMIZE);
            map.put("IMAGE_SAVE", IMAGE_SAVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OriginEnum(String value) {
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
        public static OriginEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OriginEnum(value));
        }

        public static OriginEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OriginEnum) {
                return this.value.equals(((OriginEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin")

    private OriginEnum origin;

    /**
     * Gets or Sets resourceCategory
     */
    public static final class ResourceCategoryEnum {

        /**
         * Enum ASCEND for value: "ASCEND"
         */
        public static final ResourceCategoryEnum ASCEND = new ResourceCategoryEnum("ASCEND");

        /**
         * Enum CPU for value: "CPU"
         */
        public static final ResourceCategoryEnum CPU = new ResourceCategoryEnum("CPU");

        /**
         * Enum GPU for value: "GPU"
         */
        public static final ResourceCategoryEnum GPU = new ResourceCategoryEnum("GPU");

        private static final Map<String, ResourceCategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceCategoryEnum> createStaticFields() {
            Map<String, ResourceCategoryEnum> map = new HashMap<>();
            map.put("ASCEND", ASCEND);
            map.put("CPU", CPU);
            map.put("GPU", GPU);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceCategoryEnum(String value) {
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
        public static ResourceCategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceCategoryEnum(value));
        }

        public static ResourceCategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceCategoryEnum) {
                return this.value.equals(((ResourceCategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_category")

    private List<ResourceCategoryEnum> resourceCategory = null;

    /**
     * **参数解释**：镜像支持服务类型。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - COMMON：通用镜像。 - INFERENCE: 建议仅在推理部署场景使用。 - TRAIN: 建议仅在训练任务场景使用。 - DEV: 建议仅在开发调测场景使用。 - UNKNOWN: 未明确设置的镜像支持的服务类型。  **默认取值**：UNKNOWN。
     */
    public static final class ServiceTypeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final ServiceTypeEnum COMMON = new ServiceTypeEnum("COMMON");

        /**
         * Enum DEV for value: "DEV"
         */
        public static final ServiceTypeEnum DEV = new ServiceTypeEnum("DEV");

        /**
         * Enum INFERENCE for value: "INFERENCE"
         */
        public static final ServiceTypeEnum INFERENCE = new ServiceTypeEnum("INFERENCE");

        /**
         * Enum TRAIN for value: "TRAIN"
         */
        public static final ServiceTypeEnum TRAIN = new ServiceTypeEnum("TRAIN");

        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final ServiceTypeEnum UNKNOWN = new ServiceTypeEnum("UNKNOWN");

        private static final Map<String, ServiceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServiceTypeEnum> createStaticFields() {
            Map<String, ServiceTypeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("DEV", DEV);
            map.put("INFERENCE", INFERENCE);
            map.put("TRAIN", TRAIN);
            map.put("UNKNOWN", UNKNOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServiceTypeEnum(String value) {
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
        public static ServiceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServiceTypeEnum(value));
        }

        public static ServiceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServiceTypeEnum) {
                return this.value.equals(((ServiceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private ServiceTypeEnum serviceType;

    /**
     * Gets or Sets services
     */
    public static final class ServicesEnum {

        /**
         * Enum AI_FLOW for value: "AI_FLOW"
         */
        public static final ServicesEnum AI_FLOW = new ServicesEnum("AI_FLOW");

        /**
         * Enum MA_STUDIO for value: "MA_STUDIO"
         */
        public static final ServicesEnum MA_STUDIO = new ServicesEnum("MA_STUDIO");

        /**
         * Enum NOTEBOOK for value: "NOTEBOOK"
         */
        public static final ServicesEnum NOTEBOOK = new ServicesEnum("NOTEBOOK");

        /**
         * Enum SSH for value: "SSH"
         */
        public static final ServicesEnum SSH = new ServicesEnum("SSH");

        /**
         * Enum TENSOR_BOARD for value: "TENSOR_BOARD"
         */
        public static final ServicesEnum TENSOR_BOARD = new ServicesEnum("TENSOR_BOARD");

        /**
         * Enum WEB_IDE for value: "WEB_IDE"
         */
        public static final ServicesEnum WEB_IDE = new ServicesEnum("WEB_IDE");

        private static final Map<String, ServicesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServicesEnum> createStaticFields() {
            Map<String, ServicesEnum> map = new HashMap<>();
            map.put("AI_FLOW", AI_FLOW);
            map.put("MA_STUDIO", MA_STUDIO);
            map.put("NOTEBOOK", NOTEBOOK);
            map.put("SSH", SSH);
            map.put("TENSOR_BOARD", TENSOR_BOARD);
            map.put("WEB_IDE", WEB_IDE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServicesEnum(String value) {
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
        public static ServicesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServicesEnum(value));
        }

        public static ServicesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServicesEnum) {
                return this.value.equals(((ServicesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "services")

    private List<ServicesEnum> services = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swr_path")

    private String swrPath;

    /**
     * **参数解释**：镜像可见度。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - PRIVATE：私有镜像。 - PUBLIC: 所有用户可以根据image_id来进行只读使用。  **默认取值**：PRIVATE。
     */
    public static final class VisibilityEnum {

        /**
         * Enum HIDDEN for value: "HIDDEN"
         */
        public static final VisibilityEnum HIDDEN = new VisibilityEnum("HIDDEN");

        /**
         * Enum PRIVATE for value: "PRIVATE"
         */
        public static final VisibilityEnum PRIVATE = new VisibilityEnum("PRIVATE");

        /**
         * Enum PUBLIC for value: "PUBLIC"
         */
        public static final VisibilityEnum PUBLIC = new VisibilityEnum("PUBLIC");

        private static final Map<String, VisibilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VisibilityEnum> createStaticFields() {
            Map<String, VisibilityEnum> map = new HashMap<>();
            map.put("HIDDEN", HIDDEN);
            map.put("PRIVATE", PRIVATE);
            map.put("PUBLIC", PUBLIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VisibilityEnum(String value) {
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
        public static VisibilityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VisibilityEnum(value));
        }

        public static VisibilityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VisibilityEnum) {
                return this.value.equals(((VisibilityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private VisibilityEnum visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_type")

    private String flavorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swr_instance_id")

    private String swrInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_me")

    private String readMe;

    public ImageRegRequest withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释**：该镜像所支持处理器架构类型。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - X86_64：x86处理器架构。 - AARCH64：ARM体系架构。  **默认取值**：X86_64。
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    public ImageRegRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：该镜像所对应的描述信息。 **约束限制**：不涉及。 **取值范围**：长度限制512个字符。 **默认取值**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageRegRequest withOrigin(OriginEnum origin) {
        this.origin = origin;
        return this;
    }

    /**
     * **参数解释**：指定镜像来源，可选项。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - CUSTOMIZE: 用户自定义构建镜像。 - IMAGE_SAVE：Notebook实例保存镜像。  **默认取值**：CUSTOMIZE。
     * @return origin
     */
    public OriginEnum getOrigin() {
        return origin;
    }

    public void setOrigin(OriginEnum origin) {
        this.origin = origin;
    }

    public ImageRegRequest withResourceCategory(List<ResourceCategoryEnum> resourceCategory) {
        this.resourceCategory = resourceCategory;
        return this;
    }

    public ImageRegRequest addResourceCategoryItem(ResourceCategoryEnum resourceCategoryItem) {
        if (this.resourceCategory == null) {
            this.resourceCategory = new ArrayList<>();
        }
        this.resourceCategory.add(resourceCategoryItem);
        return this;
    }

    public ImageRegRequest withResourceCategory(Consumer<List<ResourceCategoryEnum>> resourceCategorySetter) {
        if (this.resourceCategory == null) {
            this.resourceCategory = new ArrayList<>();
        }
        resourceCategorySetter.accept(this.resourceCategory);
        return this;
    }

    /**
     * **参数解释**：镜像支持的规格，默认值CPU、GPU。 枚举值如下： - CPU - GPU - [ASCEND](tag:hc,hk,fcs_super)。  **约束限制**：不涉及。
     * @return resourceCategory
     */
    public List<ResourceCategoryEnum> getResourceCategory() {
        return resourceCategory;
    }

    public void setResourceCategory(List<ResourceCategoryEnum> resourceCategory) {
        this.resourceCategory = resourceCategory;
    }

    public ImageRegRequest withServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * **参数解释**：镜像支持服务类型。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - COMMON：通用镜像。 - INFERENCE: 建议仅在推理部署场景使用。 - TRAIN: 建议仅在训练任务场景使用。 - DEV: 建议仅在开发调测场景使用。 - UNKNOWN: 未明确设置的镜像支持的服务类型。  **默认取值**：UNKNOWN。
     * @return serviceType
     */
    public ServiceTypeEnum getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
    }

    public ImageRegRequest withServices(List<ServicesEnum> services) {
        this.services = services;
        return this;
    }

    public ImageRegRequest addServicesItem(ServicesEnum servicesItem) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        this.services.add(servicesItem);
        return this;
    }

    public ImageRegRequest withServices(Consumer<List<ServicesEnum>> servicesSetter) {
        if (this.services == null) {
            this.services = new ArrayList<>();
        }
        servicesSetter.accept(this.services);
        return this;
    }

    /**
     * **参数解释**：镜像支持的服务，默认值NOTEBOOK、SSH。枚举值如下: - NOTEBOOK：镜像支持通过https协议访问Notebook。 - SSH：镜像支持本地IDE通过SSH协议远程连接Notebook。  **约束限制**：不涉及。
     * @return services
     */
    public List<ServicesEnum> getServices() {
        return services;
    }

    public void setServices(List<ServicesEnum> services) {
        this.services = services;
    }

    public ImageRegRequest withSwrPath(String swrPath) {
        this.swrPath = swrPath;
        return this;
    }

    /**
     * **参数解释**：SWR镜像地址。 **约束限制**：不涉及。 **取值范围**：长度最长为2048个字符，最短为16个字符，地址格式为：[仓库地址[:端口]]/[命名空间]/[镜像名称]:[标签]。 **默认取值**：不涉及。
     * @return swrPath
     */
    public String getSwrPath() {
        return swrPath;
    }

    public void setSwrPath(String swrPath) {
        this.swrPath = swrPath;
    }

    public ImageRegRequest withVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释**：镜像可见度。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： - PRIVATE：私有镜像。 - PUBLIC: 所有用户可以根据image_id来进行只读使用。  **默认取值**：PRIVATE。
     * @return visibility
     */
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public ImageRegRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。[获取方法请参见[查询工作空间列表](ListWorkspace.xml)。](tag:hc)未创建工作空间时默认值为“0”，存在创建并使用的工作空间，以实际取值为准。 **约束限制**：不涉及。 **取值范围**：0或32位仅包含字符0-9或小写字母a-z的字符串。 **默认取值**：0。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ImageRegRequest withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * **参数解释**：资源类型。 **约束限制**：不涉及。 **取值范围**：枚举类型，取值如下： -ASCEND_SNT9：昇腾910芯片。 -ASCEND_SNT9B：昇腾910B芯片。 -ASCEND_SNT3：昇腾310芯片。  **默认取值**：不涉及。
     * @return flavorType
     */
    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public ImageRegRequest withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public ImageRegRequest addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ImageRegRequest withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：该镜像所属镜像组对应的标签。 **约束限制**：最大支持20个标签。 **取值范围**：key值最大支持长度128，value值最大支持255。 **默认取值**：不涉及。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public ImageRegRequest withSwrInstanceId(String swrInstanceId) {
        this.swrInstanceId = swrInstanceId;
        return this;
    }

    /**
     * **参数解释**：企业版SWR仓库ID。 **参数约束**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return swrInstanceId
     */
    public String getSwrInstanceId() {
        return swrInstanceId;
    }

    public void setSwrInstanceId(String swrInstanceId) {
        this.swrInstanceId = swrInstanceId;
    }

    public ImageRegRequest withReadMe(String readMe) {
        this.readMe = readMe;
        return this;
    }

    /**
     * **参数解释**：镜像指导。 **参数约束**：不涉及。 **取值范围**：字符串长度限制为3000个字符。 **默认取值**：不涉及。
     * @return readMe
     */
    public String getReadMe() {
        return readMe;
    }

    public void setReadMe(String readMe) {
        this.readMe = readMe;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageRegRequest that = (ImageRegRequest) obj;
        return Objects.equals(this.arch, that.arch) && Objects.equals(this.description, that.description)
            && Objects.equals(this.origin, that.origin) && Objects.equals(this.resourceCategory, that.resourceCategory)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.services, that.services)
            && Objects.equals(this.swrPath, that.swrPath) && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.flavorType, that.flavorType)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.swrInstanceId, that.swrInstanceId)
            && Objects.equals(this.readMe, that.readMe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arch,
            description,
            origin,
            resourceCategory,
            serviceType,
            services,
            swrPath,
            visibility,
            workspaceId,
            flavorType,
            tags,
            swrInstanceId,
            readMe);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageRegRequest {\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    resourceCategory: ").append(toIndentedString(resourceCategory)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    services: ").append(toIndentedString(services)).append("\n");
        sb.append("    swrPath: ").append(toIndentedString(swrPath)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    flavorType: ").append(toIndentedString(flavorType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    swrInstanceId: ").append(toIndentedString(swrInstanceId)).append("\n");
        sb.append("    readMe: ").append(toIndentedString(readMe)).append("\n");
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
