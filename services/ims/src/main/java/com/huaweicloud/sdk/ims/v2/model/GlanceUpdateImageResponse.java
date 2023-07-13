package com.huaweicloud.sdk.ims.v2.model;

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
public class GlanceUpdateImageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__data_origin")

    private String dataOrigin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__image_size")

    private String imageSize;

    /**
     * 镜像后端存储类型，目前只支持uds
     */
    public static final class ImageSourceTypeEnum {

        /**
         * Enum UDS for value: "uds"
         */
        public static final ImageSourceTypeEnum UDS = new ImageSourceTypeEnum("uds");

        /**
         * Enum SWIFT for value: "swift"
         */
        public static final ImageSourceTypeEnum SWIFT = new ImageSourceTypeEnum("swift");

        private static final Map<String, ImageSourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImageSourceTypeEnum> createStaticFields() {
            Map<String, ImageSourceTypeEnum> map = new HashMap<>();
            map.put("uds", UDS);
            map.put("swift", SWIFT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImageSourceTypeEnum(String value) {
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
        public static ImageSourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImageSourceTypeEnum(value));
        }

        public static ImageSourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImageSourceTypeEnum) {
                return this.value.equals(((ImageSourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__image_source_type")

    private ImageSourceTypeEnum imageSourceType;

    /**
     * 镜像类型，目前支持以下类型：公共镜像：gold私有镜像：private共享镜像：shared 市场镜像：market
     */
    public static final class ImagetypeEnum {

        /**
         * Enum GOLD for value: "gold"
         */
        public static final ImagetypeEnum GOLD = new ImagetypeEnum("gold");

        /**
         * Enum PRIVATE for value: "private"
         */
        public static final ImagetypeEnum PRIVATE = new ImagetypeEnum("private");

        /**
         * Enum SHARED for value: "shared"
         */
        public static final ImagetypeEnum SHARED = new ImagetypeEnum("shared");

        /**
         * Enum MARKET for value: "market"
         */
        public static final ImagetypeEnum MARKET = new ImagetypeEnum("market");

        private static final Map<String, ImagetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImagetypeEnum> createStaticFields() {
            Map<String, ImagetypeEnum> map = new HashMap<>();
            map.put("gold", GOLD);
            map.put("private", PRIVATE);
            map.put("shared", SHARED);
            map.put("market", MARKET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImagetypeEnum(String value) {
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
        public static ImagetypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImagetypeEnum(value));
        }

        public static ImagetypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImagetypeEnum) {
                return this.value.equals(((ImagetypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__imagetype")

    private ImagetypeEnum imagetype;

    /**
     * 是否是注册过的镜像，取值为“true”或者“false”。
     */
    public static final class IsregisteredEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final IsregisteredEnum TRUE = new IsregisteredEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final IsregisteredEnum FALSE = new IsregisteredEnum("false");

        private static final Map<String, IsregisteredEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsregisteredEnum> createStaticFields() {
            Map<String, IsregisteredEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsregisteredEnum(String value) {
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
        public static IsregisteredEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsregisteredEnum(value));
        }

        public static IsregisteredEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsregisteredEnum) {
                return this.value.equals(((IsregisteredEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__isregistered")

    private IsregisteredEnum isregistered;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__originalimagename")

    private String originalimagename;

    /**
     * 操作系统位数，一般取值为“32”或者“64”。
     */
    public static final class OsBitEnum {

        /**
         * Enum _32 for value: "32"
         */
        public static final OsBitEnum _32 = new OsBitEnum("32");

        /**
         * Enum _64 for value: "64"
         */
        public static final OsBitEnum _64 = new OsBitEnum("64");

        private static final Map<String, OsBitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsBitEnum> createStaticFields() {
            Map<String, OsBitEnum> map = new HashMap<>();
            map.put("32", _32);
            map.put("64", _64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsBitEnum(String value) {
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
        public static OsBitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsBitEnum(value));
        }

        public static OsBitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsBitEnum) {
                return this.value.equals(((OsBitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_bit")

    private OsBitEnum osBit;

    /**
     * 操作系统类型，目前取值Linux， Windows，Other。
     */
    public static final class OsTypeEnum {

        /**
         * Enum LINUX for value: "Linux"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("Linux");

        /**
         * Enum WINDOWS for value: "Windows"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("Windows");

        /**
         * Enum OTHER for value: "Other"
         */
        public static final OsTypeEnum OTHER = new OsTypeEnum("Other");

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("Linux", LINUX);
            map.put("Windows", WINDOWS);
            map.put("Other", OTHER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsTypeEnum(String value) {
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
        public static OsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsTypeEnum(value));
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsTypeEnum) {
                return this.value.equals(((OsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_type")

    private OsTypeEnum osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_version")

    private String osVersion;

    /**
     * 镜像平台分类，取值为Windows，Ubuntu，RedHat，SUSE，CentOS，Debian，OpenSUSE, Oracle Linux，Fedora，Other，CoreOS和EulerOS。
     */
    public static final class PlatformEnum {

        /**
         * Enum WINDOWS for value: "Windows"
         */
        public static final PlatformEnum WINDOWS = new PlatformEnum("Windows");

        /**
         * Enum UBUNTU for value: "Ubuntu"
         */
        public static final PlatformEnum UBUNTU = new PlatformEnum("Ubuntu");

        /**
         * Enum REDHAT for value: "RedHat"
         */
        public static final PlatformEnum REDHAT = new PlatformEnum("RedHat");

        /**
         * Enum SUSE for value: "SUSE"
         */
        public static final PlatformEnum SUSE = new PlatformEnum("SUSE");

        /**
         * Enum CENTOS for value: "CentOS"
         */
        public static final PlatformEnum CENTOS = new PlatformEnum("CentOS");

        /**
         * Enum DEBIAN for value: "Debian"
         */
        public static final PlatformEnum DEBIAN = new PlatformEnum("Debian");

        /**
         * Enum OPENSUSE for value: "OpenSUSE"
         */
        public static final PlatformEnum OPENSUSE = new PlatformEnum("OpenSUSE");

        /**
         * Enum ORACLELINUX for value: "OracleLinux"
         */
        public static final PlatformEnum ORACLELINUX = new PlatformEnum("OracleLinux");

        /**
         * Enum FEDORA for value: "Fedora"
         */
        public static final PlatformEnum FEDORA = new PlatformEnum("Fedora");

        /**
         * Enum OTHER for value: "Other"
         */
        public static final PlatformEnum OTHER = new PlatformEnum("Other");

        /**
         * Enum COREOS for value: "CoreOS"
         */
        public static final PlatformEnum COREOS = new PlatformEnum("CoreOS");

        /**
         * Enum EULEROS for value: "EulerOS"
         */
        public static final PlatformEnum EULEROS = new PlatformEnum("EulerOS");

        private static final Map<String, PlatformEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PlatformEnum> createStaticFields() {
            Map<String, PlatformEnum> map = new HashMap<>();
            map.put("Windows", WINDOWS);
            map.put("Ubuntu", UBUNTU);
            map.put("RedHat", REDHAT);
            map.put("SUSE", SUSE);
            map.put("CentOS", CENTOS);
            map.put("Debian", DEBIAN);
            map.put("OpenSUSE", OPENSUSE);
            map.put("OracleLinux", ORACLELINUX);
            map.put("Fedora", FEDORA);
            map.put("Other", OTHER);
            map.put("CoreOS", COREOS);
            map.put("EulerOS", EULEROS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PlatformEnum(String value) {
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
        public static PlatformEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PlatformEnum(value));
        }

        public static PlatformEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PlatformEnum) {
                return this.value.equals(((PlatformEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__platform")

    private PlatformEnum platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__productcode")

    private String productcode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_diskintensive")

    private String supportDiskintensive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_highperformance")

    private String supportHighperformance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm")

    private String supportKvm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_gpu_type")

    private String supportKvmGpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_infiniband")

    private String supportKvmInfiniband;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_largememory")

    private String supportLargememory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_xen")

    private String supportXen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_xen_gpu_type")

    private String supportXenGpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_xen_hana")

    private String supportXenHana;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checksum")

    private String checksum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_format")

    private String containerFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    /**
     * 镜像的格式，目前支持vhd，zvhd、raw，qcow2,zvhd2。默认值是vhd。
     */
    public static final class DiskFormatEnum {

        /**
         * Enum VHD for value: "vhd"
         */
        public static final DiskFormatEnum VHD = new DiskFormatEnum("vhd");

        /**
         * Enum ZVHD for value: "zvhd"
         */
        public static final DiskFormatEnum ZVHD = new DiskFormatEnum("zvhd");

        /**
         * Enum RAW for value: "raw"
         */
        public static final DiskFormatEnum RAW = new DiskFormatEnum("raw");

        /**
         * Enum QCOW2 for value: "qcow2"
         */
        public static final DiskFormatEnum QCOW2 = new DiskFormatEnum("qcow2");

        /**
         * Enum ZVHD2 for value: "zvhd2"
         */
        public static final DiskFormatEnum ZVHD2 = new DiskFormatEnum("zvhd2");

        private static final Map<String, DiskFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DiskFormatEnum> createStaticFields() {
            Map<String, DiskFormatEnum> map = new HashMap<>();
            map.put("vhd", VHD);
            map.put("zvhd", ZVHD);
            map.put("raw", RAW);
            map.put("qcow2", QCOW2);
            map.put("zvhd2", ZVHD2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DiskFormatEnum(String value) {
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
        public static DiskFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DiskFormatEnum(value));
        }

        public static DiskFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DiskFormatEnum) {
                return this.value.equals(((DiskFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_format")

    private DiskFormatEnum diskFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file")

    private String file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_disk")

    private Integer minDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ram")

    private Integer minRam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected")

    private Boolean _protected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self")

    private String self;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    /**
     * 镜像状态。取值如下：queued：表示镜像元数据已经创建成功，等待上传镜像文件。saving：表示镜像正在上传文件到后端存储。deleted：表示镜像已经删除。killed：表示镜像上传错误。active：表示镜像可以正常使用。
     */
    public static final class StatusEnum {

        /**
         * Enum QUEUED for value: "queued"
         */
        public static final StatusEnum QUEUED = new StatusEnum("queued");

        /**
         * Enum SAVING for value: "saving"
         */
        public static final StatusEnum SAVING = new StatusEnum("saving");

        /**
         * Enum DELETED for value: "deleted"
         */
        public static final StatusEnum DELETED = new StatusEnum("deleted");

        /**
         * Enum KILLED for value: "killed"
         */
        public static final StatusEnum KILLED = new StatusEnum("killed");

        /**
         * Enum ACTIVE for value: "active"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("active");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("queued", QUEUED);
            map.put("saving", SAVING);
            map.put("deleted", DELETED);
            map.put("killed", KILLED);
            map.put("active", ACTIVE);
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
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    /**
     * 镜像使用环境类型：FusionCompute，Ironic，DataImage。
     */
    public static final class VirtualEnvTypeEnum {

        /**
         * Enum FUSIONCOMPUTE for value: "FusionCompute"
         */
        public static final VirtualEnvTypeEnum FUSIONCOMPUTE = new VirtualEnvTypeEnum("FusionCompute");

        /**
         * Enum IRONIC for value: "Ironic"
         */
        public static final VirtualEnvTypeEnum IRONIC = new VirtualEnvTypeEnum("Ironic");

        /**
         * Enum DATAIMAGE for value: "DataImage"
         */
        public static final VirtualEnvTypeEnum DATAIMAGE = new VirtualEnvTypeEnum("DataImage");

        private static final Map<String, VirtualEnvTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VirtualEnvTypeEnum> createStaticFields() {
            Map<String, VirtualEnvTypeEnum> map = new HashMap<>();
            map.put("FusionCompute", FUSIONCOMPUTE);
            map.put("Ironic", IRONIC);
            map.put("DataImage", DATAIMAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VirtualEnvTypeEnum(String value) {
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
        public static VirtualEnvTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VirtualEnvTypeEnum(value));
        }

        public static VirtualEnvTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VirtualEnvTypeEnum) {
                return this.value.equals(((VirtualEnvTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_env_type")

    private VirtualEnvTypeEnum virtualEnvType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_size")

    private Integer virtualSize;

    /**
     * 是否被其他租户可见，取值如下：private：私有镜像public：公共镜像shared：共享镜像
     */
    public static final class VisibilityEnum {

        /**
         * Enum PRIVATE for value: "private"
         */
        public static final VisibilityEnum PRIVATE = new VisibilityEnum("private");

        /**
         * Enum PUBLIC for value: "public"
         */
        public static final VisibilityEnum PUBLIC = new VisibilityEnum("public");

        /**
         * Enum SHARED for value: "shared"
         */
        public static final VisibilityEnum SHARED = new VisibilityEnum("shared");

        private static final Map<String, VisibilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VisibilityEnum> createStaticFields() {
            Map<String, VisibilityEnum> map = new HashMap<>();
            map.put("private", PRIVATE);
            map.put("public", PUBLIC);
            map.put("shared", SHARED);
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

    /**
     * 表示当前镜像支持CloudInit密码/密钥注入方式，建议设置为\"true\"或者\"false\"。如果取值为\"true\"，表示该镜像不支持CloudInit注入密码/密钥，其他取值时表示支持CloudInit注入密钥/密码。
     */
    public static final class SupportFcInjectEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final SupportFcInjectEnum TRUE = new SupportFcInjectEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final SupportFcInjectEnum FALSE = new SupportFcInjectEnum("false");

        private static final Map<String, SupportFcInjectEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupportFcInjectEnum> createStaticFields() {
            Map<String, SupportFcInjectEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupportFcInjectEnum(String value) {
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
        public static SupportFcInjectEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SupportFcInjectEnum(value));
        }

        public static SupportFcInjectEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupportFcInjectEnum) {
                return this.value.equals(((SupportFcInjectEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_fc_inject")

    private SupportFcInjectEnum supportFcInject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 云主机云服务器的启动方式。目前支持： bios：表示bios引导启动。 uefi：表示uefi引导启动。
     */
    public static final class HwFirmwareTypeEnum {

        /**
         * Enum BIOS for value: "bios"
         */
        public static final HwFirmwareTypeEnum BIOS = new HwFirmwareTypeEnum("bios");

        /**
         * Enum UEFI for value: "uefi"
         */
        public static final HwFirmwareTypeEnum UEFI = new HwFirmwareTypeEnum("uefi");

        private static final Map<String, HwFirmwareTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HwFirmwareTypeEnum> createStaticFields() {
            Map<String, HwFirmwareTypeEnum> map = new HashMap<>();
            map.put("bios", BIOS);
            map.put("uefi", UEFI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HwFirmwareTypeEnum(String value) {
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
        public static HwFirmwareTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HwFirmwareTypeEnum(value));
        }

        public static HwFirmwareTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HwFirmwareTypeEnum) {
                return this.value.equals(((HwFirmwareTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw_firmware_type")

    private HwFirmwareTypeEnum hwFirmwareType;

    /**
     * 是否为ARM架构类型的镜像，取值为“true”或者“false”。
     */
    public static final class SupportArmEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final SupportArmEnum TRUE = new SupportArmEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final SupportArmEnum FALSE = new SupportArmEnum("false");

        private static final Map<String, SupportArmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SupportArmEnum> createStaticFields() {
            Map<String, SupportArmEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SupportArmEnum(String value) {
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
        public static SupportArmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SupportArmEnum(value));
        }

        public static SupportArmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SupportArmEnum) {
                return this.value.equals(((SupportArmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_arm")

    private SupportArmEnum supportArm;

    /**
     * 表示当前市场镜像是否下架。 true：已下架 false：未下架
     */
    public static final class IsOffshelvedEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final IsOffshelvedEnum TRUE = new IsOffshelvedEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final IsOffshelvedEnum FALSE = new IsOffshelvedEnum("false");

        private static final Map<String, IsOffshelvedEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsOffshelvedEnum> createStaticFields() {
            Map<String, IsOffshelvedEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsOffshelvedEnum(String value) {
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
        public static IsOffshelvedEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsOffshelvedEnum(value));
        }

        public static IsOffshelvedEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsOffshelvedEnum) {
                return this.value.equals(((IsOffshelvedEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__is_offshelved")

    private IsOffshelvedEnum isOffshelved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__lazyloading")

    private String lazyloading;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_feature_list")

    private String osFeatureList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__root_origin")

    private String rootOrigin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__sequence_num")

    private String sequenceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_agent_list")

    private String supportAgentList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__cmkid")

    private String systemCmkid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_at")

    private String activeAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw_vif_multiqueue_enabled")

    private String hwVifMultiqueueEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_ram")

    private String maxRam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__image_location")

    private String imageLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__is_config_init")

    private String isConfigInit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__account_code")

    private String accountCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_amd")

    private String supportAmd;

    public GlanceUpdateImageResponse withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 备份ID。如果是备份创建的镜像，则填写为备份的ID，否则为空。
     * @return backupId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__backup_id")
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public GlanceUpdateImageResponse withDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
        return this;
    }

    /**
     * 镜像来源。公共镜像为空。
     * @return dataOrigin
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__data_origin")
    public String getDataOrigin() {
        return dataOrigin;
    }

    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public GlanceUpdateImageResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 镜像描述信息。
     * @return description
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GlanceUpdateImageResponse withImageSize(String imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    /**
     * 镜像文件的大小，单位为字节。目前取值为大于0的字符串。
     * @return imageSize
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__image_size")
    public String getImageSize() {
        return imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    public GlanceUpdateImageResponse withImageSourceType(ImageSourceTypeEnum imageSourceType) {
        this.imageSourceType = imageSourceType;
        return this;
    }

    /**
     * 镜像后端存储类型，目前只支持uds
     * @return imageSourceType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__image_source_type")
    public ImageSourceTypeEnum getImageSourceType() {
        return imageSourceType;
    }

    public void setImageSourceType(ImageSourceTypeEnum imageSourceType) {
        this.imageSourceType = imageSourceType;
    }

    public GlanceUpdateImageResponse withImagetype(ImagetypeEnum imagetype) {
        this.imagetype = imagetype;
        return this;
    }

    /**
     * 镜像类型，目前支持以下类型：公共镜像：gold私有镜像：private共享镜像：shared 市场镜像：market
     * @return imagetype
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__imagetype")
    public ImagetypeEnum getImagetype() {
        return imagetype;
    }

    public void setImagetype(ImagetypeEnum imagetype) {
        this.imagetype = imagetype;
    }

    public GlanceUpdateImageResponse withIsregistered(IsregisteredEnum isregistered) {
        this.isregistered = isregistered;
        return this;
    }

    /**
     * 是否是注册过的镜像，取值为“true”或者“false”。
     * @return isregistered
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__isregistered")
    public IsregisteredEnum getIsregistered() {
        return isregistered;
    }

    public void setIsregistered(IsregisteredEnum isregistered) {
        this.isregistered = isregistered;
    }

    public GlanceUpdateImageResponse withOriginalimagename(String originalimagename) {
        this.originalimagename = originalimagename;
        return this;
    }

    /**
     * 父镜像ID。公共镜像或通过文件创建的私有镜像，取值为空。
     * @return originalimagename
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__originalimagename")
    public String getOriginalimagename() {
        return originalimagename;
    }

    public void setOriginalimagename(String originalimagename) {
        this.originalimagename = originalimagename;
    }

    public GlanceUpdateImageResponse withOsBit(OsBitEnum osBit) {
        this.osBit = osBit;
        return this;
    }

    /**
     * 操作系统位数，一般取值为“32”或者“64”。
     * @return osBit
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_bit")
    public OsBitEnum getOsBit() {
        return osBit;
    }

    public void setOsBit(OsBitEnum osBit) {
        this.osBit = osBit;
    }

    public GlanceUpdateImageResponse withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，目前取值Linux， Windows，Other。
     * @return osType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_type")
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public GlanceUpdateImageResponse withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 操作系统具体版本。
     * @return osVersion
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_version")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public GlanceUpdateImageResponse withPlatform(PlatformEnum platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 镜像平台分类，取值为Windows，Ubuntu，RedHat，SUSE，CentOS，Debian，OpenSUSE, Oracle Linux，Fedora，Other，CoreOS和EulerOS。
     * @return platform
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__platform")
    public PlatformEnum getPlatform() {
        return platform;
    }

    public void setPlatform(PlatformEnum platform) {
        this.platform = platform;
    }

    public GlanceUpdateImageResponse withProductcode(String productcode) {
        this.productcode = productcode;
        return this;
    }

    /**
     * 市场镜像的产品ID。
     * @return productcode
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__productcode")
    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    public GlanceUpdateImageResponse withSupportDiskintensive(String supportDiskintensive) {
        this.supportDiskintensive = supportDiskintensive;
        return this;
    }

    /**
     * 表示该镜像支持密集存储。如果镜像支持密集存储性能，则值为true，否则无需增加该属性。
     * @return supportDiskintensive
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_diskintensive")
    public String getSupportDiskintensive() {
        return supportDiskintensive;
    }

    public void setSupportDiskintensive(String supportDiskintensive) {
        this.supportDiskintensive = supportDiskintensive;
    }

    public GlanceUpdateImageResponse withSupportHighperformance(String supportHighperformance) {
        this.supportHighperformance = supportHighperformance;
        return this;
    }

    /**
     * 表示该镜像支持高计算性能。如果镜像支持高计算性能，则值为true，否则无需增加该属性。
     * @return supportHighperformance
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_highperformance")
    public String getSupportHighperformance() {
        return supportHighperformance;
    }

    public void setSupportHighperformance(String supportHighperformance) {
        this.supportHighperformance = supportHighperformance;
    }

    public GlanceUpdateImageResponse withSupportKvm(String supportKvm) {
        this.supportKvm = supportKvm;
        return this;
    }

    /**
     * 如果镜像支持KVM，取值为true，否则无需增加该属性。
     * @return supportKvm
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm")
    public String getSupportKvm() {
        return supportKvm;
    }

    public void setSupportKvm(String supportKvm) {
        this.supportKvm = supportKvm;
    }

    public GlanceUpdateImageResponse withSupportKvmGpuType(String supportKvmGpuType) {
        this.supportKvmGpuType = supportKvmGpuType;
        return this;
    }

    /**
     * 表示该镜像是支持KVM虚拟化平台下的GPU类型，如果不支持KVM虚拟机下GPU类型，无需添加该属性。该属性与“__support_xen”和“__support_kvm”属性不共存。
     * @return supportKvmGpuType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_gpu_type")
    public String getSupportKvmGpuType() {
        return supportKvmGpuType;
    }

    public void setSupportKvmGpuType(String supportKvmGpuType) {
        this.supportKvmGpuType = supportKvmGpuType;
    }

    public GlanceUpdateImageResponse withSupportKvmInfiniband(String supportKvmInfiniband) {
        this.supportKvmInfiniband = supportKvmInfiniband;
        return this;
    }

    /**
     * 如果镜像支持KVM虚拟化下Infiniband网卡类型，取值为true。否则，无需添加该属性。该属性与“__support_xen”属性不共存。
     * @return supportKvmInfiniband
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_infiniband")
    public String getSupportKvmInfiniband() {
        return supportKvmInfiniband;
    }

    public void setSupportKvmInfiniband(String supportKvmInfiniband) {
        this.supportKvmInfiniband = supportKvmInfiniband;
    }

    public GlanceUpdateImageResponse withSupportLargememory(String supportLargememory) {
        this.supportLargememory = supportLargememory;
        return this;
    }

    /**
     * 表示该镜像支持超大内存。如果镜像支持超大内存，取值为true，否则无需增加该属性
     * @return supportLargememory
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_largememory")
    public String getSupportLargememory() {
        return supportLargememory;
    }

    public void setSupportLargememory(String supportLargememory) {
        this.supportLargememory = supportLargememory;
    }

    public GlanceUpdateImageResponse withSupportXen(String supportXen) {
        this.supportXen = supportXen;
        return this;
    }

    /**
     * 如果镜像支持XEN，取值为true，否则无需增加该属性。
     * @return supportXen
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_xen")
    public String getSupportXen() {
        return supportXen;
    }

    public void setSupportXen(String supportXen) {
        this.supportXen = supportXen;
    }

    public GlanceUpdateImageResponse withSupportXenGpuType(String supportXenGpuType) {
        this.supportXenGpuType = supportXenGpuType;
        return this;
    }

    /**
     * 表示该镜像是支持XEN虚拟化平台下的GPU优化类型，取值参考8.10-表 镜像支持的GPU类型说明。镜像操作系统类型请参考8.10-表 镜像类型。如果不支持XEN虚拟化下GPU类型，无需添加该属性。该属性与“__support_xen”和“__support_kvm”属性不共存。
     * @return supportXenGpuType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_xen_gpu_type")
    public String getSupportXenGpuType() {
        return supportXenGpuType;
    }

    public void setSupportXenGpuType(String supportXenGpuType) {
        this.supportXenGpuType = supportXenGpuType;
    }

    public GlanceUpdateImageResponse withSupportXenHana(String supportXenHana) {
        this.supportXenHana = supportXenHana;
        return this;
    }

    /**
     * 如果镜像支持XEN虚拟化下HANA类型，取值为true。否则，无需添加该属性。该属性与“__support_xen”和“__support_kvm”属性不共存。
     * @return supportXenHana
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_xen_hana")
    public String getSupportXenHana() {
        return supportXenHana;
    }

    public void setSupportXenHana(String supportXenHana) {
        this.supportXenHana = supportXenHana;
    }

    public GlanceUpdateImageResponse withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * 目前暂时不使用。
     * @return checksum
     */
    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public GlanceUpdateImageResponse withContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
        return this;
    }

    /**
     * 容器类型。
     * @return containerFormat
     */
    public String getContainerFormat() {
        return containerFormat;
    }

    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }

    public GlanceUpdateImageResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。格式为UTC时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public GlanceUpdateImageResponse withDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
        return this;
    }

    /**
     * 镜像的格式，目前支持vhd，zvhd、raw，qcow2,zvhd2。默认值是vhd。
     * @return diskFormat
     */
    public DiskFormatEnum getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
    }

    public GlanceUpdateImageResponse withFile(String file) {
        this.file = file;
        return this;
    }

    /**
     * 镜像文件下载和上传链接。
     * @return file
     */
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public GlanceUpdateImageResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 镜像ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GlanceUpdateImageResponse withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    /**
     * 镜像运行需要的最小磁盘容量，单位为GB 
     * @return minDisk
     */
    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    public GlanceUpdateImageResponse withMinRam(Integer minRam) {
        this.minRam = minRam;
        return this;
    }

    /**
     * 镜像运行最小内存，单位为MB。
     * @return minRam
     */
    public Integer getMinRam() {
        return minRam;
    }

    public void setMinRam(Integer minRam) {
        this.minRam = minRam;
    }

    public GlanceUpdateImageResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 镜像名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GlanceUpdateImageResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 镜像属于哪个租户。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public GlanceUpdateImageResponse withProtected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    /**
     * 是否是受保护的，受保护的镜像不允许删除。取值为true或false。
     * @return _protected
     */
    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public GlanceUpdateImageResponse withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * 镜像视图。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public GlanceUpdateImageResponse withSelf(String self) {
        this.self = self;
        return this;
    }

    /**
     * 镜像链接信息。
     * @return self
     */
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public GlanceUpdateImageResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 目前暂时不使用。
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public GlanceUpdateImageResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 镜像状态。取值如下：queued：表示镜像元数据已经创建成功，等待上传镜像文件。saving：表示镜像正在上传文件到后端存储。deleted：表示镜像已经删除。killed：表示镜像上传错误。active：表示镜像可以正常使用。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public GlanceUpdateImageResponse withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public GlanceUpdateImageResponse addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public GlanceUpdateImageResponse withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 镜像标签列表，提供用户可以自定义管理私有镜像的能力。用户可以通过镜像标签接口为每个镜像增加不同的标签，在查询接口中可以根据标签进行过滤。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public GlanceUpdateImageResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。格式为UTC时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GlanceUpdateImageResponse withVirtualEnvType(VirtualEnvTypeEnum virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
        return this;
    }

    /**
     * 镜像使用环境类型：FusionCompute，Ironic，DataImage。
     * @return virtualEnvType
     */
    public VirtualEnvTypeEnum getVirtualEnvType() {
        return virtualEnvType;
    }

    public void setVirtualEnvType(VirtualEnvTypeEnum virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
    }

    public GlanceUpdateImageResponse withVirtualSize(Integer virtualSize) {
        this.virtualSize = virtualSize;
        return this;
    }

    /**
     * 目前暂时不使用。
     * @return virtualSize
     */
    public Integer getVirtualSize() {
        return virtualSize;
    }

    public void setVirtualSize(Integer virtualSize) {
        this.virtualSize = virtualSize;
    }

    public GlanceUpdateImageResponse withVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * 是否被其他租户可见，取值如下：private：私有镜像public：公共镜像shared：共享镜像
     * @return visibility
     */
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public GlanceUpdateImageResponse withSupportFcInject(SupportFcInjectEnum supportFcInject) {
        this.supportFcInject = supportFcInject;
        return this;
    }

    /**
     * 表示当前镜像支持CloudInit密码/密钥注入方式，建议设置为\"true\"或者\"false\"。如果取值为\"true\"，表示该镜像不支持CloudInit注入密码/密钥，其他取值时表示支持CloudInit注入密钥/密码。
     * @return supportFcInject
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_fc_inject")
    public SupportFcInjectEnum getSupportFcInject() {
        return supportFcInject;
    }

    public void setSupportFcInject(SupportFcInjectEnum supportFcInject) {
        this.supportFcInject = supportFcInject;
    }

    public GlanceUpdateImageResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 表示当前镜像所属的企业项目。 取值为0或无该值，表示属于default企业项目。 取值为UUID，表示属于该UUID对应的企业项目。 关于企业项目ID的获取及企业项目特性的详细信息，请参考《企业管理用户指南》。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public GlanceUpdateImageResponse withHwFirmwareType(HwFirmwareTypeEnum hwFirmwareType) {
        this.hwFirmwareType = hwFirmwareType;
        return this;
    }

    /**
     * 云主机云服务器的启动方式。目前支持： bios：表示bios引导启动。 uefi：表示uefi引导启动。
     * @return hwFirmwareType
     */
    public HwFirmwareTypeEnum getHwFirmwareType() {
        return hwFirmwareType;
    }

    public void setHwFirmwareType(HwFirmwareTypeEnum hwFirmwareType) {
        this.hwFirmwareType = hwFirmwareType;
    }

    public GlanceUpdateImageResponse withSupportArm(SupportArmEnum supportArm) {
        this.supportArm = supportArm;
        return this;
    }

    /**
     * 是否为ARM架构类型的镜像，取值为“true”或者“false”。
     * @return supportArm
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_arm")
    public SupportArmEnum getSupportArm() {
        return supportArm;
    }

    public void setSupportArm(SupportArmEnum supportArm) {
        this.supportArm = supportArm;
    }

    public GlanceUpdateImageResponse withIsOffshelved(IsOffshelvedEnum isOffshelved) {
        this.isOffshelved = isOffshelved;
        return this;
    }

    /**
     * 表示当前市场镜像是否下架。 true：已下架 false：未下架
     * @return isOffshelved
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__is_offshelved")
    public IsOffshelvedEnum getIsOffshelved() {
        return isOffshelved;
    }

    public void setIsOffshelved(IsOffshelvedEnum isOffshelved) {
        this.isOffshelved = isOffshelved;
    }

    public GlanceUpdateImageResponse withLazyloading(String lazyloading) {
        this.lazyloading = lazyloading;
        return this;
    }

    /**
     * 镜像是否支持延迟加载。取值为True或False。
     * @return lazyloading
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__lazyloading")
    public String getLazyloading() {
        return lazyloading;
    }

    public void setLazyloading(String lazyloading) {
        this.lazyloading = lazyloading;
    }

    public GlanceUpdateImageResponse withOsFeatureList(String osFeatureList) {
        this.osFeatureList = osFeatureList;
        return this;
    }

    /**
     * 镜像附加属性。该属性采用JSON格式来标识镜像支持的高级特性清单。
     * @return osFeatureList
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_feature_list")
    public String getOsFeatureList() {
        return osFeatureList;
    }

    public void setOsFeatureList(String osFeatureList) {
        this.osFeatureList = osFeatureList;
    }

    public GlanceUpdateImageResponse withRootOrigin(String rootOrigin) {
        this.rootOrigin = rootOrigin;
        return this;
    }

    /**
     * 表示当前镜像来源是从外部导入。取值：file。
     * @return rootOrigin
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__root_origin")
    public String getRootOrigin() {
        return rootOrigin;
    }

    public void setRootOrigin(String rootOrigin) {
        this.rootOrigin = rootOrigin;
    }

    public GlanceUpdateImageResponse withSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
        return this;
    }

    /**
     * 目前暂时不用
     * @return sequenceNum
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__sequence_num")
    public String getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public GlanceUpdateImageResponse withSupportAgentList(String supportAgentList) {
        this.supportAgentList = supportAgentList;
        return this;
    }

    /**
     * 镜像是否支持企业主机安全或主机监控。 hss：企业主机安全 ces：主机监控
     * @return supportAgentList
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_agent_list")
    public String getSupportAgentList() {
        return supportAgentList;
    }

    public void setSupportAgentList(String supportAgentList) {
        this.supportAgentList = supportAgentList;
    }

    public GlanceUpdateImageResponse withSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
        return this;
    }

    /**
     * 加密镜像所使用的密钥ID。
     * @return systemCmkid
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__system__cmkid")
    public String getSystemCmkid() {
        return systemCmkid;
    }

    public void setSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
    }

    public GlanceUpdateImageResponse withActiveAt(String activeAt) {
        this.activeAt = activeAt;
        return this;
    }

    /**
     * 镜像状态变为正常的时间。
     * @return activeAt
     */
    public String getActiveAt() {
        return activeAt;
    }

    public void setActiveAt(String activeAt) {
        this.activeAt = activeAt;
    }

    public GlanceUpdateImageResponse withHwVifMultiqueueEnabled(String hwVifMultiqueueEnabled) {
        this.hwVifMultiqueueEnabled = hwVifMultiqueueEnabled;
        return this;
    }

    /**
     * 镜像是否支持网卡多队列。取值为true或者false。
     * @return hwVifMultiqueueEnabled
     */
    public String getHwVifMultiqueueEnabled() {
        return hwVifMultiqueueEnabled;
    }

    public void setHwVifMultiqueueEnabled(String hwVifMultiqueueEnabled) {
        this.hwVifMultiqueueEnabled = hwVifMultiqueueEnabled;
    }

    public GlanceUpdateImageResponse withMaxRam(String maxRam) {
        this.maxRam = maxRam;
        return this;
    }

    /**
     * 镜像支持的最大内存，单位为MB。取值可以参考云服务器规格限制，一般不设置。
     * @return maxRam
     */
    public String getMaxRam() {
        return maxRam;
    }

    public void setMaxRam(String maxRam) {
        this.maxRam = maxRam;
    }

    public GlanceUpdateImageResponse withImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
        return this;
    }

    /**
     * 镜像的存储位置。
     * @return imageLocation
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__image_location")
    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public GlanceUpdateImageResponse withIsConfigInit(String isConfigInit) {
        this.isConfigInit = isConfigInit;
        return this;
    }

    /**
     * 是否完成了初始化配置。取值为true或false
     * @return isConfigInit
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__is_config_init")
    public String getIsConfigInit() {
        return isConfigInit;
    }

    public void setIsConfigInit(String isConfigInit) {
        this.isConfigInit = isConfigInit;
    }

    public GlanceUpdateImageResponse withAccountCode(String accountCode) {
        this.accountCode = accountCode;
        return this;
    }

    /**
     * 收费镜像标识。
     * @return accountCode
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__account_code")
    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public GlanceUpdateImageResponse withSupportAmd(String supportAmd) {
        this.supportAmd = supportAmd;
        return this;
    }

    /**
     * 是否是AMD架构类型的镜像。取值为“true”或者“false”。
     * @return supportAmd
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_amd")
    public String getSupportAmd() {
        return supportAmd;
    }

    public void setSupportAmd(String supportAmd) {
        this.supportAmd = supportAmd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlanceUpdateImageResponse that = (GlanceUpdateImageResponse) obj;
        return Objects.equals(this.backupId, that.backupId) && Objects.equals(this.dataOrigin, that.dataOrigin)
            && Objects.equals(this.description, that.description) && Objects.equals(this.imageSize, that.imageSize)
            && Objects.equals(this.imageSourceType, that.imageSourceType)
            && Objects.equals(this.imagetype, that.imagetype) && Objects.equals(this.isregistered, that.isregistered)
            && Objects.equals(this.originalimagename, that.originalimagename) && Objects.equals(this.osBit, that.osBit)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.osVersion, that.osVersion)
            && Objects.equals(this.platform, that.platform) && Objects.equals(this.productcode, that.productcode)
            && Objects.equals(this.supportDiskintensive, that.supportDiskintensive)
            && Objects.equals(this.supportHighperformance, that.supportHighperformance)
            && Objects.equals(this.supportKvm, that.supportKvm)
            && Objects.equals(this.supportKvmGpuType, that.supportKvmGpuType)
            && Objects.equals(this.supportKvmInfiniband, that.supportKvmInfiniband)
            && Objects.equals(this.supportLargememory, that.supportLargememory)
            && Objects.equals(this.supportXen, that.supportXen)
            && Objects.equals(this.supportXenGpuType, that.supportXenGpuType)
            && Objects.equals(this.supportXenHana, that.supportXenHana) && Objects.equals(this.checksum, that.checksum)
            && Objects.equals(this.containerFormat, that.containerFormat)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.diskFormat, that.diskFormat)
            && Objects.equals(this.file, that.file) && Objects.equals(this.id, that.id)
            && Objects.equals(this.minDisk, that.minDisk) && Objects.equals(this.minRam, that.minRam)
            && Objects.equals(this.name, that.name) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this._protected, that._protected) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.self, that.self) && Objects.equals(this.size, that.size)
            && Objects.equals(this.status, that.status) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.virtualEnvType, that.virtualEnvType)
            && Objects.equals(this.virtualSize, that.virtualSize) && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.supportFcInject, that.supportFcInject)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.hwFirmwareType, that.hwFirmwareType)
            && Objects.equals(this.supportArm, that.supportArm) && Objects.equals(this.isOffshelved, that.isOffshelved)
            && Objects.equals(this.lazyloading, that.lazyloading)
            && Objects.equals(this.osFeatureList, that.osFeatureList)
            && Objects.equals(this.rootOrigin, that.rootOrigin) && Objects.equals(this.sequenceNum, that.sequenceNum)
            && Objects.equals(this.supportAgentList, that.supportAgentList)
            && Objects.equals(this.systemCmkid, that.systemCmkid) && Objects.equals(this.activeAt, that.activeAt)
            && Objects.equals(this.hwVifMultiqueueEnabled, that.hwVifMultiqueueEnabled)
            && Objects.equals(this.maxRam, that.maxRam) && Objects.equals(this.imageLocation, that.imageLocation)
            && Objects.equals(this.isConfigInit, that.isConfigInit)
            && Objects.equals(this.accountCode, that.accountCode) && Objects.equals(this.supportAmd, that.supportAmd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupId,
            dataOrigin,
            description,
            imageSize,
            imageSourceType,
            imagetype,
            isregistered,
            originalimagename,
            osBit,
            osType,
            osVersion,
            platform,
            productcode,
            supportDiskintensive,
            supportHighperformance,
            supportKvm,
            supportKvmGpuType,
            supportKvmInfiniband,
            supportLargememory,
            supportXen,
            supportXenGpuType,
            supportXenHana,
            checksum,
            containerFormat,
            createdAt,
            diskFormat,
            file,
            id,
            minDisk,
            minRam,
            name,
            owner,
            _protected,
            schema,
            self,
            size,
            status,
            tags,
            updatedAt,
            virtualEnvType,
            virtualSize,
            visibility,
            supportFcInject,
            enterpriseProjectId,
            hwFirmwareType,
            supportArm,
            isOffshelved,
            lazyloading,
            osFeatureList,
            rootOrigin,
            sequenceNum,
            supportAgentList,
            systemCmkid,
            activeAt,
            hwVifMultiqueueEnabled,
            maxRam,
            imageLocation,
            isConfigInit,
            accountCode,
            supportAmd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceUpdateImageResponse {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    dataOrigin: ").append(toIndentedString(dataOrigin)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
        sb.append("    imageSourceType: ").append(toIndentedString(imageSourceType)).append("\n");
        sb.append("    imagetype: ").append(toIndentedString(imagetype)).append("\n");
        sb.append("    isregistered: ").append(toIndentedString(isregistered)).append("\n");
        sb.append("    originalimagename: ").append(toIndentedString(originalimagename)).append("\n");
        sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    productcode: ").append(toIndentedString(productcode)).append("\n");
        sb.append("    supportDiskintensive: ").append(toIndentedString(supportDiskintensive)).append("\n");
        sb.append("    supportHighperformance: ").append(toIndentedString(supportHighperformance)).append("\n");
        sb.append("    supportKvm: ").append(toIndentedString(supportKvm)).append("\n");
        sb.append("    supportKvmGpuType: ").append(toIndentedString(supportKvmGpuType)).append("\n");
        sb.append("    supportKvmInfiniband: ").append(toIndentedString(supportKvmInfiniband)).append("\n");
        sb.append("    supportLargememory: ").append(toIndentedString(supportLargememory)).append("\n");
        sb.append("    supportXen: ").append(toIndentedString(supportXen)).append("\n");
        sb.append("    supportXenGpuType: ").append(toIndentedString(supportXenGpuType)).append("\n");
        sb.append("    supportXenHana: ").append(toIndentedString(supportXenHana)).append("\n");
        sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
        sb.append("    containerFormat: ").append(toIndentedString(containerFormat)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    diskFormat: ").append(toIndentedString(diskFormat)).append("\n");
        sb.append("    file: ").append(toIndentedString(file)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
        sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    virtualEnvType: ").append(toIndentedString(virtualEnvType)).append("\n");
        sb.append("    virtualSize: ").append(toIndentedString(virtualSize)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    supportFcInject: ").append(toIndentedString(supportFcInject)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    hwFirmwareType: ").append(toIndentedString(hwFirmwareType)).append("\n");
        sb.append("    supportArm: ").append(toIndentedString(supportArm)).append("\n");
        sb.append("    isOffshelved: ").append(toIndentedString(isOffshelved)).append("\n");
        sb.append("    lazyloading: ").append(toIndentedString(lazyloading)).append("\n");
        sb.append("    osFeatureList: ").append(toIndentedString(osFeatureList)).append("\n");
        sb.append("    rootOrigin: ").append(toIndentedString(rootOrigin)).append("\n");
        sb.append("    sequenceNum: ").append(toIndentedString(sequenceNum)).append("\n");
        sb.append("    supportAgentList: ").append(toIndentedString(supportAgentList)).append("\n");
        sb.append("    systemCmkid: ").append(toIndentedString(systemCmkid)).append("\n");
        sb.append("    activeAt: ").append(toIndentedString(activeAt)).append("\n");
        sb.append("    hwVifMultiqueueEnabled: ").append(toIndentedString(hwVifMultiqueueEnabled)).append("\n");
        sb.append("    maxRam: ").append(toIndentedString(maxRam)).append("\n");
        sb.append("    imageLocation: ").append(toIndentedString(imageLocation)).append("\n");
        sb.append("    isConfigInit: ").append(toIndentedString(isConfigInit)).append("\n");
        sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
        sb.append("    supportAmd: ").append(toIndentedString(supportAmd)).append("\n");
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
