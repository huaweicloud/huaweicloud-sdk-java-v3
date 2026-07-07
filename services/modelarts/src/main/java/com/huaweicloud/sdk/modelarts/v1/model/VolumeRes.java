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
 * **参数解释**：实例存储信息。
 */
public class VolumeRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private Integer capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_path")

    private String mountPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ownership")

    private String ownership;

    /**
     * **参数解释**：EVS扩容状态，扩容时的状态为RESIZING，此时实例可以正常使用。 **取值范围**：不涉及。
     */
    public static final class StatusEnum {

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum DELETE_FAILED for value: "DELETE_FAILED"
         */
        public static final StatusEnum DELETE_FAILED = new StatusEnum("DELETE_FAILED");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StatusEnum DELETING = new StatusEnum("DELETING");

        /**
         * Enum IN_USE for value: "IN_USE"
         */
        public static final StatusEnum IN_USE = new StatusEnum("IN_USE");

        /**
         * Enum MOUNTED for value: "MOUNTED"
         */
        public static final StatusEnum MOUNTED = new StatusEnum("MOUNTED");

        /**
         * Enum MOUNTING for value: "MOUNTING"
         */
        public static final StatusEnum MOUNTING = new StatusEnum("MOUNTING");

        /**
         * Enum MOUNT_FAILED for value: "MOUNT_FAILED"
         */
        public static final StatusEnum MOUNT_FAILED = new StatusEnum("MOUNT_FAILED");

        /**
         * Enum RESIZING for value: "RESIZING"
         */
        public static final StatusEnum RESIZING = new StatusEnum("RESIZING");

        /**
         * Enum UNMOUNTED for value: "UNMOUNTED"
         */
        public static final StatusEnum UNMOUNTED = new StatusEnum("UNMOUNTED");

        /**
         * Enum UNMOUNTING for value: "UNMOUNTING"
         */
        public static final StatusEnum UNMOUNTING = new StatusEnum("UNMOUNTING");

        /**
         * Enum UNMOUNT_FAILED for value: "UNMOUNT_FAILED"
         */
        public static final StatusEnum UNMOUNT_FAILED = new StatusEnum("UNMOUNT_FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("DELETED", DELETED);
            map.put("DELETE_FAILED", DELETE_FAILED);
            map.put("DELETING", DELETING);
            map.put("IN_USE", IN_USE);
            map.put("MOUNTED", MOUNTED);
            map.put("MOUNTING", MOUNTING);
            map.put("MOUNT_FAILED", MOUNT_FAILED);
            map.put("RESIZING", RESIZING);
            map.put("UNMOUNTED", UNMOUNTED);
            map.put("UNMOUNTING", UNMOUNTING);
            map.put("UNMOUNT_FAILED", UNMOUNT_FAILED);
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
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only")

    private Boolean readOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dew_secret_name")

    private String dewSecretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evs_sku_code")

    private String evsSkuCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_type")

    private String mountType;

    public VolumeRes withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * **参数解释**：存储容量。 **取值范围**：EVS默认5G，EFS默认50G，最大限制4096G。
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public VolumeRes withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**：支持的存储类型。不同存储类型的差异，详见[[开发环境中如何选择存储](https://support.huaweicloud.com/usermanual-standard-modelarts/devtool-modelarts_0004.html#section6)](tag:hc)[[开发环境中如何选择存储](https://support.huaweicloud.com/intl/zh-cn/usermanual-standard-modelarts/devtool-modelarts_0004.html#section5)](tag:hk)[《用户指南》的“开发环境中如何选择存储”章节](tag:fcs,fcs-super)。 **取值范围**：枚举类型，取值如下： - SFS：弹性文件服务 - EVS：云硬盘 - OBS：对象存储服务 - OBSFS：并行文件系统 - EFS：弹性文件服务（SFS Turbo）
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public VolumeRes withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * **参数解释**：存储挂载至Notebook实例的目录，当前固定在/home/ma-user/work/下。 **取值范围**：不涉及。
     * @return mountPath
     */
    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    public VolumeRes withOwnership(String ownership) {
        this.ownership = ownership;
        return this;
    }

    /**
     * **参数解释**：资源所属。 **取值范围**：枚举类型，取值如下： - MANAGED：托管，即资源在服务上。 - DEDICATED：非托管，即资源在用户账号上，只有在category为EFS时支持。
     * @return ownership
     */
    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public VolumeRes withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：EVS扩容状态，扩容时的状态为RESIZING，此时实例可以正常使用。 **取值范围**：不涉及。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public VolumeRes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：EFS专属存储盘ID或OBS存储ID，只有作为扩展存储时返回。 **取值范围**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VolumeRes withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * **参数解释**：扩展存储挂载目录是否只读。 **取值范围**：不涉及。
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public VolumeRes withDewSecretName(String dewSecretName) {
        this.dewSecretName = dewSecretName;
        return this;
    }

    /**
     * **参数解释**：DEW存储的用户AKSK凭据名称。 **取值范围**：不涉及。
     * @return dewSecretName
     */
    public String getDewSecretName() {
        return dewSecretName;
    }

    public void setDewSecretName(String dewSecretName) {
        this.dewSecretName = dewSecretName;
    }

    public VolumeRes withEvsSkuCode(String evsSkuCode) {
        this.evsSkuCode = evsSkuCode;
        return this;
    }

    /**
     * **参数解释**：规格包含的evs时，evs存储的sku编码。 **取值范围**：不涉及。
     * @return evsSkuCode
     */
    public String getEvsSkuCode() {
        return evsSkuCode;
    }

    public void setEvsSkuCode(String evsSkuCode) {
        this.evsSkuCode = evsSkuCode;
    }

    public VolumeRes withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * **参数解释**：只有当category为EFS或OBS或OBSFS时，挂载存储源路径。 **取值范围**：不涉及。
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public VolumeRes withMountType(String mountType) {
        this.mountType = mountType;
        return this;
    }

    /**
     * **参数解释**：存储挂载类型。 **取值范围**：枚举类型，取值如下：  - STATIC:不支持在实例运行期间挂载以及卸载的存储 - DYNAMIC:支持在实例运行期间挂载以及卸载的存储
     * @return mountType
     */
    public String getMountType() {
        return mountType;
    }

    public void setMountType(String mountType) {
        this.mountType = mountType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeRes that = (VolumeRes) obj;
        return Objects.equals(this.capacity, that.capacity) && Objects.equals(this.category, that.category)
            && Objects.equals(this.mountPath, that.mountPath) && Objects.equals(this.ownership, that.ownership)
            && Objects.equals(this.status, that.status) && Objects.equals(this.id, that.id)
            && Objects.equals(this.readOnly, that.readOnly) && Objects.equals(this.dewSecretName, that.dewSecretName)
            && Objects.equals(this.evsSkuCode, that.evsSkuCode) && Objects.equals(this.uri, that.uri)
            && Objects.equals(this.mountType, that.mountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity,
            category,
            mountPath,
            ownership,
            status,
            id,
            readOnly,
            dewSecretName,
            evsSkuCode,
            uri,
            mountType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeRes {\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
        sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    dewSecretName: ").append(toIndentedString(dewSecretName)).append("\n");
        sb.append("    evsSkuCode: ").append(toIndentedString(evsSkuCode)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    mountType: ").append(toIndentedString(mountType)).append("\n");
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
