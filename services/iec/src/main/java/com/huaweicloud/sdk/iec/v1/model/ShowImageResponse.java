package com.huaweicloud.sdk.iec.v1.model;

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

/** Response Object */
public class ShowImageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** 镜像状态。 */
    public static final class StatusEnum {

        /** Enum QUEUED for value: "queued" */
        public static final StatusEnum QUEUED = new StatusEnum("queued");

        /** Enum SAVING for value: "saving" */
        public static final StatusEnum SAVING = new StatusEnum("saving");

        /** Enum DELETED for value: "deleted" */
        public static final StatusEnum DELETED = new StatusEnum("deleted");

        /** Enum KILLED for value: "killed" */
        public static final StatusEnum KILLED = new StatusEnum("killed");

        /** Enum ACTIVE for value: "active" */
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /** 镜像格式。 */
    public static final class DiskFormatEnum {

        /** Enum ZVHD2 for value: "zvhd2" */
        public static final DiskFormatEnum ZVHD2 = new DiskFormatEnum("zvhd2");

        /** Enum VHD for value: "vhd" */
        public static final DiskFormatEnum VHD = new DiskFormatEnum("vhd");

        /** Enum ZVHD for value: "zvhd" */
        public static final DiskFormatEnum ZVHD = new DiskFormatEnum("zvhd");

        /** Enum RAW for value: "raw" */
        public static final DiskFormatEnum RAW = new DiskFormatEnum("raw");

        /** Enum QCOW2 for value: "qcow2" */
        public static final DiskFormatEnum QCOW2 = new DiskFormatEnum("qcow2");

        private static final Map<String, DiskFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DiskFormatEnum> createStaticFields() {
            Map<String, DiskFormatEnum> map = new HashMap<>();
            map.put("zvhd2", ZVHD2);
            map.put("vhd", VHD);
            map.put("zvhd", ZVHD);
            map.put("raw", RAW);
            map.put("qcow2", QCOW2);
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
            DiskFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DiskFormatEnum(value);
            }
            return result;
        }

        public static DiskFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DiskFormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "min_disk")

    private Integer minDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_ram")

    private Integer minRam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected")

    private Boolean _protected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "self")

    private String self;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private Boolean deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_env_type")

    private String virtualEnvType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted_at")

    private String deletedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_job_id")

    private String relationJobId;

    /** 镜像类型。 取值范围： - gold：公有镜像； - private：私有镜像。 */
    public static final class ImagetypeEnum {

        /** Enum GOLD for value: "gold" */
        public static final ImagetypeEnum GOLD = new ImagetypeEnum("gold");

        /** Enum PRIVATE_ for value: "private " */
        public static final ImagetypeEnum PRIVATE_ = new ImagetypeEnum("private ");

        private static final Map<String, ImagetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImagetypeEnum> createStaticFields() {
            Map<String, ImagetypeEnum> map = new HashMap<>();
            map.put("gold", GOLD);
            map.put("private ", PRIVATE_);
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
            ImagetypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ImagetypeEnum(value);
            }
            return result;
        }

        public static ImagetypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ImagetypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__platform")

    private String platform;

    /** 镜像系统类型。 */
    public static final class OsTypeEnum {

        /** Enum LINUX for value: "Linux" */
        public static final OsTypeEnum LINUX = new OsTypeEnum("Linux");

        /** Enum WINDOWS for value: "Windows" */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("Windows");

        /** Enum OTHER for value: "Other" */
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
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsTypeEnum(value);
            }
            return result;
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__isregistered")

    private Boolean isregistered;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm")

    private String supportKvm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_gpu_type")

    private String supportKvmGpuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_ascend_310")

    private String supportKvmAscend310;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_hi1822_hiovs")

    private String supportKvmHi1822Hiovs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_arm")

    private String supportArm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw_firmware_type")

    private String hwFirmwareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_source")

    private String dataSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_gpu_t4")

    private String supportGpuT4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_region_info")

    private CloudImageRegionInfo originRegionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_region_info")

    private List<EdgeImageRegionInfo> edgeRegionInfo = null;

    public ShowImageResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** 镜像ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowImageResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 镜像名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowImageResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 镜像状态。
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowImageResponse withDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
        return this;
    }

    /** 镜像格式。
     * 
     * @return diskFormat */
    public DiskFormatEnum getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
    }

    public ShowImageResponse withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    /** 最小系统盘（单位：GB），取值为40～1024GB。 minimum: 40 maximum: 1024
     * 
     * @return minDisk */
    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    public ShowImageResponse withMinRam(Integer minRam) {
        this.minRam = minRam;
        return this;
    }

    /** 最小内存（单位：MB），默认值为0。
     * 
     * @return minRam */
    public Integer getMinRam() {
        return minRam;
    }

    public void setMinRam(Integer minRam) {
        this.minRam = minRam;
    }

    public ShowImageResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /** 镜像所属租户ID。
     * 
     * @return owner */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ShowImageResponse withProtected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    /** 是否受保护。
     * 
     * @return _protected */
    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public ShowImageResponse withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /** 可见性。
     * 
     * @return visibility */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public ShowImageResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 创建时间。
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowImageResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** 更新时间。
     * 
     * @return updatedAt */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowImageResponse withSelf(String self) {
        this.self = self;
        return this;
    }

    /** 镜像链接信息。
     * 
     * @return self */
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public ShowImageResponse withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /** 是否是删除的镜像，取值为true或者false。
     * 
     * @return deleted */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public ShowImageResponse withVirtualEnvType(String virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
        return this;
    }

    /** 镜像使用环境类型。
     * 
     * @return virtualEnvType */
    public String getVirtualEnvType() {
        return virtualEnvType;
    }

    public void setVirtualEnvType(String virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
    }

    public ShowImageResponse withDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    /** 删除时间，格式为UTC时间。
     * 
     * @return deletedAt */
    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public ShowImageResponse withRelationJobId(String relationJobId) {
        this.relationJobId = relationJobId;
        return this;
    }

    /** 镜像关联的任务ID。
     * 
     * @return relationJobId */
    public String getRelationJobId() {
        return relationJobId;
    }

    public void setRelationJobId(String relationJobId) {
        this.relationJobId = relationJobId;
    }

    public ShowImageResponse withImagetype(ImagetypeEnum imagetype) {
        this.imagetype = imagetype;
        return this;
    }

    /** 镜像类型。 取值范围： - gold：公有镜像； - private：私有镜像。
     * 
     * @return imagetype */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__imagetype")
    public ImagetypeEnum getImagetype() {
        return imagetype;
    }

    public void setImagetype(ImagetypeEnum imagetype) {
        this.imagetype = imagetype;
    }

    public ShowImageResponse withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /** 镜像平台分类。
     * 
     * @return platform */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__platform")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public ShowImageResponse withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /** 镜像系统类型。
     * 
     * @return osType */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_type")
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public ShowImageResponse withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /** 镜像的操作系统具体版本。
     * 
     * @return osVersion */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__os_version")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public ShowImageResponse withIsregistered(Boolean isregistered) {
        this.isregistered = isregistered;
        return this;
    }

    /** 是否是注册过的镜像。
     * 
     * @return isregistered */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__isregistered")
    public Boolean getIsregistered() {
        return isregistered;
    }

    public void setIsregistered(Boolean isregistered) {
        this.isregistered = isregistered;
    }

    public ShowImageResponse withSupportKvm(String supportKvm) {
        this.supportKvm = supportKvm;
        return this;
    }

    /** 如果镜像支持KVM，取值为true，否则无该属性。
     * 
     * @return supportKvm */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm")
    public String getSupportKvm() {
        return supportKvm;
    }

    public void setSupportKvm(String supportKvm) {
        this.supportKvm = supportKvm;
    }

    public ShowImageResponse withSupportKvmGpuType(String supportKvmGpuType) {
        this.supportKvmGpuType = supportKvmGpuType;
        return this;
    }

    /** 如果镜像是支持KVM虚拟化平台下的GPU类型，取值为“V100_vGPU”或者“RTX5000”，否则无该属性。
     * 
     * @return supportKvmGpuType */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_gpu_type")
    public String getSupportKvmGpuType() {
        return supportKvmGpuType;
    }

    public void setSupportKvmGpuType(String supportKvmGpuType) {
        this.supportKvmGpuType = supportKvmGpuType;
    }

    public ShowImageResponse withSupportKvmAscend310(String supportKvmAscend310) {
        this.supportKvmAscend310 = supportKvmAscend310;
        return this;
    }

    /** 如果镜像支持AI加速，取值为true，否则无该属性。
     * 
     * @return supportKvmAscend310 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_ascend_310")
    public String getSupportKvmAscend310() {
        return supportKvmAscend310;
    }

    public void setSupportKvmAscend310(String supportKvmAscend310) {
        this.supportKvmAscend310 = supportKvmAscend310;
    }

    public ShowImageResponse withSupportKvmHi1822Hiovs(String supportKvmHi1822Hiovs) {
        this.supportKvmHi1822Hiovs = supportKvmHi1822Hiovs;
        return this;
    }

    /** 如果镜像支持计算增强，取值为true，否则无该属性。
     * 
     * @return supportKvmHi1822Hiovs */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_kvm_hi1822_hiovs")
    public String getSupportKvmHi1822Hiovs() {
        return supportKvmHi1822Hiovs;
    }

    public void setSupportKvmHi1822Hiovs(String supportKvmHi1822Hiovs) {
        this.supportKvmHi1822Hiovs = supportKvmHi1822Hiovs;
    }

    public ShowImageResponse withSupportArm(String supportArm) {
        this.supportArm = supportArm;
        return this;
    }

    /** 如果镜像为ARM架构类型，取值为true，否则无该属性。
     * 
     * @return supportArm */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_arm")
    public String getSupportArm() {
        return supportArm;
    }

    public void setSupportArm(String supportArm) {
        this.supportArm = supportArm;
    }

    public ShowImageResponse withHwFirmwareType(String hwFirmwareType) {
        this.hwFirmwareType = hwFirmwareType;
        return this;
    }

    /** 镜像启动模式，取值为uefi或bios，不指定时无该属性。
     * 
     * @return hwFirmwareType */
    public String getHwFirmwareType() {
        return hwFirmwareType;
    }

    public void setHwFirmwareType(String hwFirmwareType) {
        this.hwFirmwareType = hwFirmwareType;
    }

    public ShowImageResponse withDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /** 镜像来源。 - 来源边缘实例：instance:<实例id> - 来源IMS：ims:<镜像id>:<region id>
     * 
     * @return dataSource */
    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public ShowImageResponse withSupportGpuT4(String supportGpuT4) {
        this.supportGpuT4 = supportGpuT4;
        return this;
    }

    /** 如果镜像支持GPU T4类型，取值为true，否则无该属性。
     * 
     * @return supportGpuT4 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__support_gpu_t4")
    public String getSupportGpuT4() {
        return supportGpuT4;
    }

    public void setSupportGpuT4(String supportGpuT4) {
        this.supportGpuT4 = supportGpuT4;
    }

    public ShowImageResponse withOriginRegionInfo(CloudImageRegionInfo originRegionInfo) {
        this.originRegionInfo = originRegionInfo;
        return this;
    }

    public ShowImageResponse withOriginRegionInfo(Consumer<CloudImageRegionInfo> originRegionInfoSetter) {
        if (this.originRegionInfo == null) {
            this.originRegionInfo = new CloudImageRegionInfo();
            originRegionInfoSetter.accept(this.originRegionInfo);
        }

        return this;
    }

    /** Get originRegionInfo
     * 
     * @return originRegionInfo */
    public CloudImageRegionInfo getOriginRegionInfo() {
        return originRegionInfo;
    }

    public void setOriginRegionInfo(CloudImageRegionInfo originRegionInfo) {
        this.originRegionInfo = originRegionInfo;
    }

    public ShowImageResponse withEdgeRegionInfo(List<EdgeImageRegionInfo> edgeRegionInfo) {
        this.edgeRegionInfo = edgeRegionInfo;
        return this;
    }

    public ShowImageResponse addEdgeRegionInfoItem(EdgeImageRegionInfo edgeRegionInfoItem) {
        if (this.edgeRegionInfo == null) {
            this.edgeRegionInfo = new ArrayList<>();
        }
        this.edgeRegionInfo.add(edgeRegionInfoItem);
        return this;
    }

    public ShowImageResponse withEdgeRegionInfo(Consumer<List<EdgeImageRegionInfo>> edgeRegionInfoSetter) {
        if (this.edgeRegionInfo == null) {
            this.edgeRegionInfo = new ArrayList<>();
        }
        edgeRegionInfoSetter.accept(this.edgeRegionInfo);
        return this;
    }

    /** 边缘区域详情。
     * 
     * @return edgeRegionInfo */
    public List<EdgeImageRegionInfo> getEdgeRegionInfo() {
        return edgeRegionInfo;
    }

    public void setEdgeRegionInfo(List<EdgeImageRegionInfo> edgeRegionInfo) {
        this.edgeRegionInfo = edgeRegionInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowImageResponse showImageResponse = (ShowImageResponse) o;
        return Objects.equals(this.id, showImageResponse.id) && Objects.equals(this.name, showImageResponse.name)
            && Objects.equals(this.status, showImageResponse.status)
            && Objects.equals(this.diskFormat, showImageResponse.diskFormat)
            && Objects.equals(this.minDisk, showImageResponse.minDisk)
            && Objects.equals(this.minRam, showImageResponse.minRam)
            && Objects.equals(this.owner, showImageResponse.owner)
            && Objects.equals(this._protected, showImageResponse._protected)
            && Objects.equals(this.visibility, showImageResponse.visibility)
            && Objects.equals(this.createdAt, showImageResponse.createdAt)
            && Objects.equals(this.updatedAt, showImageResponse.updatedAt)
            && Objects.equals(this.self, showImageResponse.self)
            && Objects.equals(this.deleted, showImageResponse.deleted)
            && Objects.equals(this.virtualEnvType, showImageResponse.virtualEnvType)
            && Objects.equals(this.deletedAt, showImageResponse.deletedAt)
            && Objects.equals(this.relationJobId, showImageResponse.relationJobId)
            && Objects.equals(this.imagetype, showImageResponse.imagetype)
            && Objects.equals(this.platform, showImageResponse.platform)
            && Objects.equals(this.osType, showImageResponse.osType)
            && Objects.equals(this.osVersion, showImageResponse.osVersion)
            && Objects.equals(this.isregistered, showImageResponse.isregistered)
            && Objects.equals(this.supportKvm, showImageResponse.supportKvm)
            && Objects.equals(this.supportKvmGpuType, showImageResponse.supportKvmGpuType)
            && Objects.equals(this.supportKvmAscend310, showImageResponse.supportKvmAscend310)
            && Objects.equals(this.supportKvmHi1822Hiovs, showImageResponse.supportKvmHi1822Hiovs)
            && Objects.equals(this.supportArm, showImageResponse.supportArm)
            && Objects.equals(this.hwFirmwareType, showImageResponse.hwFirmwareType)
            && Objects.equals(this.dataSource, showImageResponse.dataSource)
            && Objects.equals(this.supportGpuT4, showImageResponse.supportGpuT4)
            && Objects.equals(this.originRegionInfo, showImageResponse.originRegionInfo)
            && Objects.equals(this.edgeRegionInfo, showImageResponse.edgeRegionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            diskFormat,
            minDisk,
            minRam,
            owner,
            _protected,
            visibility,
            createdAt,
            updatedAt,
            self,
            deleted,
            virtualEnvType,
            deletedAt,
            relationJobId,
            imagetype,
            platform,
            osType,
            osVersion,
            isregistered,
            supportKvm,
            supportKvmGpuType,
            supportKvmAscend310,
            supportKvmHi1822Hiovs,
            supportArm,
            hwFirmwareType,
            dataSource,
            supportGpuT4,
            originRegionInfo,
            edgeRegionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    diskFormat: ").append(toIndentedString(diskFormat)).append("\n");
        sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
        sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    virtualEnvType: ").append(toIndentedString(virtualEnvType)).append("\n");
        sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
        sb.append("    relationJobId: ").append(toIndentedString(relationJobId)).append("\n");
        sb.append("    imagetype: ").append(toIndentedString(imagetype)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    isregistered: ").append(toIndentedString(isregistered)).append("\n");
        sb.append("    supportKvm: ").append(toIndentedString(supportKvm)).append("\n");
        sb.append("    supportKvmGpuType: ").append(toIndentedString(supportKvmGpuType)).append("\n");
        sb.append("    supportKvmAscend310: ").append(toIndentedString(supportKvmAscend310)).append("\n");
        sb.append("    supportKvmHi1822Hiovs: ").append(toIndentedString(supportKvmHi1822Hiovs)).append("\n");
        sb.append("    supportArm: ").append(toIndentedString(supportArm)).append("\n");
        sb.append("    hwFirmwareType: ").append(toIndentedString(hwFirmwareType)).append("\n");
        sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
        sb.append("    supportGpuT4: ").append(toIndentedString(supportGpuT4)).append("\n");
        sb.append("    originRegionInfo: ").append(toIndentedString(originRegionInfo)).append("\n");
        sb.append("    edgeRegionInfo: ").append(toIndentedString(edgeRegionInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
