package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SyncImageResponse extends SdkResponse {

    /**
     * **参数解释**：该镜像所支持处理器架构类型。 **取值范围**：枚举类型，取值如下： - X86_64：x86处理器架构。 - AARCH64：ARM体系架构。
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
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * Gets or Sets devServices
     */
    public static final class DevServicesEnum {

        /**
         * Enum NOTEBOOK for value: "NOTEBOOK"
         */
        public static final DevServicesEnum NOTEBOOK = new DevServicesEnum("NOTEBOOK");

        /**
         * Enum SSH for value: "SSH"
         */
        public static final DevServicesEnum SSH = new DevServicesEnum("SSH");

        private static final Map<String, DevServicesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DevServicesEnum> createStaticFields() {
            Map<String, DevServicesEnum> map = new HashMap<>();
            map.put("NOTEBOOK", NOTEBOOK);
            map.put("SSH", SSH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DevServicesEnum(String value) {
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
        public static DevServicesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DevServicesEnum(value));
        }

        public static DevServicesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DevServicesEnum) {
                return this.value.equals(((DevServicesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_services")

    private List<DevServicesEnum> devServices = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    /**
     * **参数解释**：指定镜像来源。 **取值范围**：枚举类型，取值如下： - CUSTOMIZE：用户自定义构建镜像。 - IMAGE_SAVE：Notebook实例保存镜像。
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
     * Gets or Sets resourceCategories
     */
    public static final class ResourceCategoriesEnum {

        /**
         * Enum ASCEND for value: "ASCEND"
         */
        public static final ResourceCategoriesEnum ASCEND = new ResourceCategoriesEnum("ASCEND");

        /**
         * Enum CPU for value: "CPU"
         */
        public static final ResourceCategoriesEnum CPU = new ResourceCategoriesEnum("CPU");

        /**
         * Enum GPU for value: "GPU"
         */
        public static final ResourceCategoriesEnum GPU = new ResourceCategoriesEnum("GPU");

        private static final Map<String, ResourceCategoriesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceCategoriesEnum> createStaticFields() {
            Map<String, ResourceCategoriesEnum> map = new HashMap<>();
            map.put("ASCEND", ASCEND);
            map.put("CPU", CPU);
            map.put("GPU", GPU);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceCategoriesEnum(String value) {
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
        public static ResourceCategoriesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceCategoriesEnum(value));
        }

        public static ResourceCategoriesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceCategoriesEnum) {
                return this.value.equals(((ResourceCategoriesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_categories")

    private List<ResourceCategoriesEnum> resourceCategories = null;

    /**
     * **参数解释**：镜像支持服务类型。 **取值范围**：枚举类型，取值如下： - COMMON：通用镜像。 - INFERENCE：建议仅在推理部署场景使用。 - TRAIN：建议仅在训练任务场景使用。 - DEV：建议仅在开发调测场景使用。 - UNKNOWN：未明确设置的镜像支持的服务类型。
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    /**
     * **参数解释**：镜像状态。 **取值范围**：枚举类型，取值如下： - INIT：初始化。 - CREATING：镜像保存中，此时Notebook不可用。 - CREATE_FAILED：镜像保存失败。 - ERROR：错误。 - DELETED：已删除。 - ACTIVE：镜像保存成功，保存的镜像可以在SWR控制台查看，同时可以基于保存的镜像创建Notebook实例。
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("CREATE_FAILED");

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum INIT for value: "INIT"
         */
        public static final StatusEnum INIT = new StatusEnum("INIT");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("CREATING", CREATING);
            map.put("DELETED", DELETED);
            map.put("ERROR", ERROR);
            map.put("INIT", INIT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_message")

    private String statusMessage;

    /**
     * Gets or Sets supportResCategories
     */
    public static final class SupportResCategoriesEnum {

        /**
         * Enum ASCEND for value: "ASCEND"
         */
        public static final SupportResCategoriesEnum ASCEND = new SupportResCategoriesEnum("ASCEND");

        /**
         * Enum CPU for value: "CPU"
         */
        public static final SupportResCategoriesEnum CPU = new SupportResCategoriesEnum("CPU");

        /**
         * Enum GPU for value: "GPU"
         */
        public static final SupportResCategoriesEnum GPU = new SupportResCategoriesEnum("GPU");

        private static final Map<String, SupportResCategoriesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupportResCategoriesEnum> createStaticFields() {
            Map<String, SupportResCategoriesEnum> map = new HashMap<>();
            map.put("ASCEND", ASCEND);
            map.put("CPU", CPU);
            map.put("GPU", GPU);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupportResCategoriesEnum(String value) {
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
        public static SupportResCategoriesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SupportResCategoriesEnum(value));
        }

        public static SupportResCategoriesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupportResCategoriesEnum) {
                return this.value.equals(((SupportResCategoriesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_res_categories")

    private List<SupportResCategoriesEnum> supportResCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swr_path")

    private String swrPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    /**
     * **参数解释**：镜像类型。 **取值范围**：枚举类型，取值如下： - BUILD_IN：系统内置镜像。 - DEDICATED：用户保存的镜像。
     */
    public static final class TypeEnum {

        /**
         * Enum BUILD_IN for value: "BUILD_IN"
         */
        public static final TypeEnum BUILD_IN = new TypeEnum("BUILD_IN");

        /**
         * Enum DEDICATED for value: "DEDICATED"
         */
        public static final TypeEnum DEDICATED = new TypeEnum("DEDICATED");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("BUILD_IN", BUILD_IN);
            map.put("DEDICATED", DEDICATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    /**
     * **参数解释**：镜像可见度。 **取值范围**：枚举类型，取值如下： - PRIVATE：私有镜像。 - PUBLIC：所有用户可以根据image_id来进行只读使用。
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
    @JsonProperty(value = "swr_instance_id")

    private String swrInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_name")

    private String showName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_tag")

    private String showTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TmsTagResponse> tags = null;

    public SyncImageResponse withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释**：该镜像所支持处理器架构类型。 **取值范围**：枚举类型，取值如下： - X86_64：x86处理器架构。 - AARCH64：ARM体系架构。
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    public SyncImageResponse withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释**：镜像创建的时间，UTC毫秒。 **取值范围**：不涉及。
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public SyncImageResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：该镜像所对应的描述信息。 **取值范围**：长度限制512个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SyncImageResponse withDevServices(List<DevServicesEnum> devServices) {
        this.devServices = devServices;
        return this;
    }

    public SyncImageResponse addDevServicesItem(DevServicesEnum devServicesItem) {
        if (this.devServices == null) {
            this.devServices = new ArrayList<>();
        }
        this.devServices.add(devServicesItem);
        return this;
    }

    public SyncImageResponse withDevServices(Consumer<List<DevServicesEnum>> devServicesSetter) {
        if (this.devServices == null) {
            this.devServices = new ArrayList<>();
        }
        devServicesSetter.accept(this.devServices);
        return this;
    }

    /**
     * **参数解释**：镜像支持的服务。 **取值范围**：枚举类型，取值如下： - NOTEBOOK：镜像支持通过https协议访问Notebook。 - SSH：镜像支持本地IDE通过SSH协议远程连接Notebook。
     * @return devServices
     */
    public List<DevServicesEnum> getDevServices() {
        return devServices;
    }

    public void setDevServices(List<DevServicesEnum> devServices) {
        this.devServices = devServices;
    }

    public SyncImageResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：待创建Notebook实例的镜像，需要指定镜像ID，ID格式为通用唯一识别码（Universally Unique Identifier，简称UUID）。预置镜像的ID参考[查询支持的镜像列表](ListImage.xml)获取。 **取值范围**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SyncImageResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：镜像名称。 **取值范围**：长度限制512个字符，支持小写字母、数字、中划线、下划线和点。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SyncImageResponse withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释**：镜像所属组织，可以在SWR控制台“组织管理”创建和查看。 **取值范围**：不涉及。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public SyncImageResponse withOrigin(OriginEnum origin) {
        this.origin = origin;
        return this;
    }

    /**
     * **参数解释**：指定镜像来源。 **取值范围**：枚举类型，取值如下： - CUSTOMIZE：用户自定义构建镜像。 - IMAGE_SAVE：Notebook实例保存镜像。
     * @return origin
     */
    public OriginEnum getOrigin() {
        return origin;
    }

    public void setOrigin(OriginEnum origin) {
        this.origin = origin;
    }

    public SyncImageResponse withResourceCategories(List<ResourceCategoriesEnum> resourceCategories) {
        this.resourceCategories = resourceCategories;
        return this;
    }

    public SyncImageResponse addResourceCategoriesItem(ResourceCategoriesEnum resourceCategoriesItem) {
        if (this.resourceCategories == null) {
            this.resourceCategories = new ArrayList<>();
        }
        this.resourceCategories.add(resourceCategoriesItem);
        return this;
    }

    public SyncImageResponse withResourceCategories(Consumer<List<ResourceCategoriesEnum>> resourceCategoriesSetter) {
        if (this.resourceCategories == null) {
            this.resourceCategories = new ArrayList<>();
        }
        resourceCategoriesSetter.accept(this.resourceCategories);
        return this;
    }

    /**
     * **参数解释**：镜像支持的规格。枚举类型，取值如下： - CPU - GPU - [ASCEND](tag:hc,hk,fcs_super)
     * @return resourceCategories
     */
    public List<ResourceCategoriesEnum> getResourceCategories() {
        return resourceCategories;
    }

    public void setResourceCategories(List<ResourceCategoriesEnum> resourceCategories) {
        this.resourceCategories = resourceCategories;
    }

    public SyncImageResponse withServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * **参数解释**：镜像支持服务类型。 **取值范围**：枚举类型，取值如下： - COMMON：通用镜像。 - INFERENCE：建议仅在推理部署场景使用。 - TRAIN：建议仅在训练任务场景使用。 - DEV：建议仅在开发调测场景使用。 - UNKNOWN：未明确设置的镜像支持的服务类型。
     * @return serviceType
     */
    public ServiceTypeEnum getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
    }

    public SyncImageResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**：镜像大小（单位KB）。 **取值范围**：不涉及。
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public SyncImageResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：镜像状态。 **取值范围**：枚举类型，取值如下： - INIT：初始化。 - CREATING：镜像保存中，此时Notebook不可用。 - CREATE_FAILED：镜像保存失败。 - ERROR：错误。 - DELETED：已删除。 - ACTIVE：镜像保存成功，保存的镜像可以在SWR控制台查看，同时可以基于保存的镜像创建Notebook实例。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public SyncImageResponse withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * **参数解释**：镜像保存操作过程中，构建信息展示。 **取值范围**：不涉及。
     * @return statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public SyncImageResponse withSupportResCategories(List<SupportResCategoriesEnum> supportResCategories) {
        this.supportResCategories = supportResCategories;
        return this;
    }

    public SyncImageResponse addSupportResCategoriesItem(SupportResCategoriesEnum supportResCategoriesItem) {
        if (this.supportResCategories == null) {
            this.supportResCategories = new ArrayList<>();
        }
        this.supportResCategories.add(supportResCategoriesItem);
        return this;
    }

    public SyncImageResponse withSupportResCategories(
        Consumer<List<SupportResCategoriesEnum>> supportResCategoriesSetter) {
        if (this.supportResCategories == null) {
            this.supportResCategories = new ArrayList<>();
        }
        supportResCategoriesSetter.accept(this.supportResCategories);
        return this;
    }

    /**
     * **参数解释**：镜像支持的规格。 枚举类型，取值如下： - CPU - GPU - [ASCEND](tag:hc,hk,fcs_super)
     * @return supportResCategories
     */
    public List<SupportResCategoriesEnum> getSupportResCategories() {
        return supportResCategories;
    }

    public void setSupportResCategories(List<SupportResCategoriesEnum> supportResCategories) {
        this.supportResCategories = supportResCategories;
    }

    public SyncImageResponse withSwrPath(String swrPath) {
        this.swrPath = swrPath;
        return this;
    }

    /**
     * **参数解释**：SWR镜像地址。 **取值范围**：不涉及。
     * @return swrPath
     */
    public String getSwrPath() {
        return swrPath;
    }

    public void setSwrPath(String swrPath) {
        this.swrPath = swrPath;
    }

    public SyncImageResponse withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数解释**：镜像Tag。 **取值范围**：不涉及。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public SyncImageResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：镜像类型。 **取值范围**：枚举类型，取值如下： - BUILD_IN：系统内置镜像。 - DEDICATED：用户保存的镜像。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SyncImageResponse withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释**：镜像最后更新的时间，UTC毫秒。 **取值范围**：不涉及。
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public SyncImageResponse withVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释**：镜像可见度。 **取值范围**：枚举类型，取值如下： - PRIVATE：私有镜像。 - PUBLIC：所有用户可以根据image_id来进行只读使用。
     * @return visibility
     */
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public SyncImageResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。未创建工作空间时默认值为“0”，存在创建并使用的工作空间，以实际取值为准。 **取值范围**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public SyncImageResponse withFlavorType(String flavorType) {
        this.flavorType = flavorType;
        return this;
    }

    /**
     * **参数解释**：镜像的资源类型。 **取值范围**：枚举类型，取值如下： - ASCEND_SNT9：昇腾910芯片。 - ASCEND_SNT9B：昇腾910B芯片。 - ASCEND_SNT3：昇腾310芯片。
     * @return flavorType
     */
    public String getFlavorType() {
        return flavorType;
    }

    public void setFlavorType(String flavorType) {
        this.flavorType = flavorType;
    }

    public SyncImageResponse withSwrInstanceId(String swrInstanceId) {
        this.swrInstanceId = swrInstanceId;
        return this;
    }

    /**
     * 参数解释：SWR企业仓库ID。未使用SWR企业仓时该字段为null。 约束限制：不涉及。 取值范围：128位UUID。 默认取值：null。
     * @return swrInstanceId
     */
    public String getSwrInstanceId() {
        return swrInstanceId;
    }

    public void setSwrInstanceId(String swrInstanceId) {
        this.swrInstanceId = swrInstanceId;
    }

    public SyncImageResponse withShowName(String showName) {
        this.showName = showName;
        return this;
    }

    /**
     * **参数解释**：镜像展示名称，仅预置镜像具备该字段。
     * @return showName
     */
    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public SyncImageResponse withShowTag(String showTag) {
        this.showTag = showTag;
        return this;
    }

    /**
     * **参数解释**：镜像展示版本号，仅预置镜像具备该字段。
     * @return showTag
     */
    public String getShowTag() {
        return showTag;
    }

    public void setShowTag(String showTag) {
        this.showTag = showTag;
    }

    public SyncImageResponse withTags(List<TmsTagResponse> tags) {
        this.tags = tags;
        return this;
    }

    public SyncImageResponse addTagsItem(TmsTagResponse tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SyncImageResponse withTags(Consumer<List<TmsTagResponse>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：镜像标签。
     * @return tags
     */
    public List<TmsTagResponse> getTags() {
        return tags;
    }

    public void setTags(List<TmsTagResponse> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SyncImageResponse that = (SyncImageResponse) obj;
        return Objects.equals(this.arch, that.arch) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.description, that.description) && Objects.equals(this.devServices, that.devServices)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.origin, that.origin)
            && Objects.equals(this.resourceCategories, that.resourceCategories)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.size, that.size)
            && Objects.equals(this.status, that.status) && Objects.equals(this.statusMessage, that.statusMessage)
            && Objects.equals(this.supportResCategories, that.supportResCategories)
            && Objects.equals(this.swrPath, that.swrPath) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.type, that.type) && Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.visibility, that.visibility) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.flavorType, that.flavorType)
            && Objects.equals(this.swrInstanceId, that.swrInstanceId) && Objects.equals(this.showName, that.showName)
            && Objects.equals(this.showTag, that.showTag) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arch,
            createAt,
            description,
            devServices,
            id,
            name,
            namespace,
            origin,
            resourceCategories,
            serviceType,
            size,
            status,
            statusMessage,
            supportResCategories,
            swrPath,
            tag,
            type,
            updateAt,
            visibility,
            workspaceId,
            flavorType,
            swrInstanceId,
            showName,
            showTag,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncImageResponse {\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    devServices: ").append(toIndentedString(devServices)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    resourceCategories: ").append(toIndentedString(resourceCategories)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
        sb.append("    supportResCategories: ").append(toIndentedString(supportResCategories)).append("\n");
        sb.append("    swrPath: ").append(toIndentedString(swrPath)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    flavorType: ").append(toIndentedString(flavorType)).append("\n");
        sb.append("    swrInstanceId: ").append(toIndentedString(swrInstanceId)).append("\n");
        sb.append("    showName: ").append(toIndentedString(showName)).append("\n");
        sb.append("    showTag: ").append(toIndentedString(showTag)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
