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
 * **参数解释**：实例的扩展存储配置 **约束限制**：最大数量为30。
 */
public class VolumeMountRequest {

    /**
     * **参数解释**：notebook支持的扩展存储类型，详见[[开发环境中如何选择存储](https://support.huaweicloud.com/usermanual-standard-modelarts/devtool-modelarts_0004.html#section7)](tag:hc)[[开发环境中如何选择存储](https://support.huaweicloud.com/intl/zh-cn/usermanual-standard-modelarts/devtool-modelarts_0004.html#section6)](tag:hk)[《用户指南》的“开发环境中如何选择存储”章节](tag:fcs,fcs-super) **约束限制**：不涉及 **默认取值**：不涉及。 **取值范围**：枚举类型，取值如下： - EVS：云硬盘 - OBS：对象存储服务 - OBSFS：并行文件系统（PFS） - EFS：弹性文件服务（SFS Turbo）
     */
    public static final class CategoryEnum {

        /**
         * Enum OBS for value: "OBS"
         */
        public static final CategoryEnum OBS = new CategoryEnum("OBS");

        /**
         * Enum OBSFS for value: "OBSFS"
         */
        public static final CategoryEnum OBSFS = new CategoryEnum("OBSFS");

        /**
         * Enum EFS for value: "EFS"
         */
        public static final CategoryEnum EFS = new CategoryEnum("EFS");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("OBS", OBS);
            map.put("OBSFS", OBSFS);
            map.put("EFS", EFS);
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

    /**
     * **参数解释**：资源所属 **参数约束**：不涉及。 **取值范围**：枚举类型，取值如下： - MANAGED：托管，即资源在服务上。 - DEDICATED：非托管，即资源在用户账号上，只有在category为EFS时支持。 **默认取值**：不涉及。
     */
    public static final class OwnershipEnum {

        /**
         * Enum MANAGED for value: "MANAGED"
         */
        public static final OwnershipEnum MANAGED = new OwnershipEnum("MANAGED");

        /**
         * Enum DEDICATED for value: "DEDICATED"
         */
        public static final OwnershipEnum DEDICATED = new OwnershipEnum("DEDICATED");

        private static final Map<String, OwnershipEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OwnershipEnum> createStaticFields() {
            Map<String, OwnershipEnum> map = new HashMap<>();
            map.put("MANAGED", MANAGED);
            map.put("DEDICATED", DEDICATED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OwnershipEnum(String value) {
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
        public static OwnershipEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OwnershipEnum(value));
        }

        public static OwnershipEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OwnershipEnum) {
                return this.value.equals(((OwnershipEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ownership")

    private OwnershipEnum ownership;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_path")

    private String mountPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only")

    private Boolean readOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dew_secret_name")

    private String dewSecretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Integer capacity;

    public VolumeMountRequest withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**：notebook支持的扩展存储类型，详见[[开发环境中如何选择存储](https://support.huaweicloud.com/usermanual-standard-modelarts/devtool-modelarts_0004.html#section7)](tag:hc)[[开发环境中如何选择存储](https://support.huaweicloud.com/intl/zh-cn/usermanual-standard-modelarts/devtool-modelarts_0004.html#section6)](tag:hk)[《用户指南》的“开发环境中如何选择存储”章节](tag:fcs,fcs-super) **约束限制**：不涉及 **默认取值**：不涉及。 **取值范围**：枚举类型，取值如下： - EVS：云硬盘 - OBS：对象存储服务 - OBSFS：并行文件系统（PFS） - EFS：弹性文件服务（SFS Turbo）
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public VolumeMountRequest withOwnership(OwnershipEnum ownership) {
        this.ownership = ownership;
        return this;
    }

    /**
     * **参数解释**：资源所属 **参数约束**：不涉及。 **取值范围**：枚举类型，取值如下： - MANAGED：托管，即资源在服务上。 - DEDICATED：非托管，即资源在用户账号上，只有在category为EFS时支持。 **默认取值**：不涉及。
     * @return ownership
     */
    public OwnershipEnum getOwnership() {
        return ownership;
    }

    public void setOwnership(OwnershipEnum ownership) {
        this.ownership = ownership;
    }

    public VolumeMountRequest withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * **参数解释**：EFS专属存储盘uri或OBS并行文件系统路径 - EFS：登录弹性文件服务控制台，在文件系统列表中，单击文件系统名称进入详情页。其中，“共享路径”即为此参数的参数值。 - OBS：并行文件系统命名格式为：obs://<桶名>/<目录路径>/。登录对象存储服务控制台，在并行文件系统列表中，文件系统名称为桶名。单击文件系统名称进入详情页，在文件栏选择特定目录后，单击右侧“更多/复制路径”，该路径即为目录路径。 **参数约束**：只有当category为EFS或OBS或OBSFS，同时ownership为DEDICATED时必填，最大长度1024字符
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public VolumeMountRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：EFS专属存储盘ID，参数值获取方式如下：登录弹性文件服务控制台，在文件系统列表中，单击文件系统名称进入详情页。其中，“ID”即为此参数的参数值。 **参数约束**：只有当category为EFS，同时ownership为DEDICATED时必填。必须符合 UUID 格式（如 280a8bd5-03e2-4a5c-bea1-83d81e75bc53）。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VolumeMountRequest withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * **参数解释**：在Notebook实例中挂载的路径 **参数约束**：最大长度 256 字符
     * @return mountPath
     */
    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    public VolumeMountRequest withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * **参数解释**：扩展存储挂载目录是否只读。默认值为false，可读写 **参数约束**：不涉及
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public VolumeMountRequest withDewSecretName(String dewSecretName) {
        this.dewSecretName = dewSecretName;
        return this;
    }

    /**
     * **参数解释**：DEW存储的用户AKSK凭据名称 **参数约束**：当category为OBS时必填，仅支持大小写字母、数字、中划线、下划线，长度 1-64 字符
     * @return dewSecretName
     */
    public String getDewSecretName() {
        return dewSecretName;
    }

    public void setDewSecretName(String dewSecretName) {
        this.dewSecretName = dewSecretName;
    }

    public VolumeMountRequest withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * **参数解释**：EVS云硬盘存储容量，单位GB。 **约束限制**：category为EVS时有效。 **取值范围**：不涉及。 **默认取值**：5。
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeMountRequest that = (VolumeMountRequest) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.ownership, that.ownership)
            && Objects.equals(this.uri, that.uri) && Objects.equals(this.id, that.id)
            && Objects.equals(this.mountPath, that.mountPath) && Objects.equals(this.readOnly, that.readOnly)
            && Objects.equals(this.dewSecretName, that.dewSecretName) && Objects.equals(this.capacity, that.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, ownership, uri, id, mountPath, readOnly, dewSecretName, capacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeMountRequest {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    dewSecretName: ").append(toIndentedString(dewSecretName)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
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
