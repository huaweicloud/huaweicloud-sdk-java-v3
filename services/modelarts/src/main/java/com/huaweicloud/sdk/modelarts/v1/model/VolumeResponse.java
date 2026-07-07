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
 * VolumeResponse
 */
public class VolumeResponse {

    /**
     * **参数解释**：notebook返回的扩展存储类型 **参数约束**：不涉及 - OBS：对象存储服务 - OBSFS：并行文件存储 - EFS：弹性文件服务
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_path")

    private String mountPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /**
     * **参数解释**：存储状态 - MOUNTING: 正在挂载中； - MOUNTED: 已挂载成功； - UNMOUNTING: 正在卸载中； - UNMOUNTED: 已卸载完成； - MOUNT_FAILED: 挂载失败 - UNMOUNT_FAILED：卸载失败； **参数约束**：不涉及
     */
    public static final class StatusEnum {

        /**
         * Enum MOUNTING for value: "MOUNTING"
         */
        public static final StatusEnum MOUNTING = new StatusEnum("MOUNTING");

        /**
         * Enum MOUNTED for value: "MOUNTED"
         */
        public static final StatusEnum MOUNTED = new StatusEnum("MOUNTED");

        /**
         * Enum UNMOUNTING for value: "UNMOUNTING"
         */
        public static final StatusEnum UNMOUNTING = new StatusEnum("UNMOUNTING");

        /**
         * Enum UNMOUNTED for value: "UNMOUNTED"
         */
        public static final StatusEnum UNMOUNTED = new StatusEnum("UNMOUNTED");

        /**
         * Enum MOUNT_FAILED for value: "MOUNT_FAILED"
         */
        public static final StatusEnum MOUNT_FAILED = new StatusEnum("MOUNT_FAILED");

        /**
         * Enum UNMOUNT_FAILED for value: "UNMOUNT_FAILED"
         */
        public static final StatusEnum UNMOUNT_FAILED = new StatusEnum("UNMOUNT_FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("MOUNTING", MOUNTING);
            map.put("MOUNTED", MOUNTED);
            map.put("UNMOUNTING", UNMOUNTING);
            map.put("UNMOUNTED", UNMOUNTED);
            map.put("MOUNT_FAILED", MOUNT_FAILED);
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

    /**
     * **参数解释**：存储挂载类型，枚举类。 **约束限制**：无限制。 - STATIC:不支持在实例运行期间挂载以及卸载的存储 - DYNAMIC:支持在实例运行期间挂载以及卸载的存储
     */
    public static final class MountTypeEnum {

        /**
         * Enum STATIC for value: "STATIC"
         */
        public static final MountTypeEnum STATIC = new MountTypeEnum("STATIC");

        /**
         * Enum DYNAMIC for value: "DYNAMIC"
         */
        public static final MountTypeEnum DYNAMIC = new MountTypeEnum("DYNAMIC");

        private static final Map<String, MountTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MountTypeEnum> createStaticFields() {
            Map<String, MountTypeEnum> map = new HashMap<>();
            map.put("STATIC", STATIC);
            map.put("DYNAMIC", DYNAMIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MountTypeEnum(String value) {
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
        public static MountTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MountTypeEnum(value));
        }

        public static MountTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MountTypeEnum) {
                return this.value.equals(((MountTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_type")

    private MountTypeEnum mountType;

    public VolumeResponse withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**：notebook返回的扩展存储类型 **参数约束**：不涉及 - OBS：对象存储服务 - OBSFS：并行文件存储 - EFS：弹性文件服务
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public VolumeResponse withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * **参数解释**：存储挂载至Notebook实例的目录 **参数约束**：不涉及
     * @return mountPath
     */
    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    public VolumeResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**：当category为OBS、OBSFS时，挂载存储源路径。 **参数约束**：不涉及
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VolumeResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：存储状态 - MOUNTING: 正在挂载中； - MOUNTED: 已挂载成功； - UNMOUNTING: 正在卸载中； - UNMOUNTED: 已卸载完成； - MOUNT_FAILED: 挂载失败 - UNMOUNT_FAILED：卸载失败； **参数约束**：不涉及
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public VolumeResponse withMountType(MountTypeEnum mountType) {
        this.mountType = mountType;
        return this;
    }

    /**
     * **参数解释**：存储挂载类型，枚举类。 **约束限制**：无限制。 - STATIC:不支持在实例运行期间挂载以及卸载的存储 - DYNAMIC:支持在实例运行期间挂载以及卸载的存储
     * @return mountType
     */
    public MountTypeEnum getMountType() {
        return mountType;
    }

    public void setMountType(MountTypeEnum mountType) {
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
        VolumeResponse that = (VolumeResponse) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.mountPath, that.mountPath)
            && Objects.equals(this.url, that.url) && Objects.equals(this.status, that.status)
            && Objects.equals(this.mountType, that.mountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, mountPath, url, status, mountType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeResponse {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
