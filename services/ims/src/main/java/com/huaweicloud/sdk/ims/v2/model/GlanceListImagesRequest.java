package com.huaweicloud.sdk.ims.v2.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class GlanceListImagesRequest  {

    /**
     * 镜像类型，目前支持以下类型：公共镜像：gold私有镜像：private共享镜像：shared
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
        

        private static final Map<String, ImagetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImagetypeEnum> createStaticFields() {
            Map<String, ImagetypeEnum> map = new HashMap<>();
            map.put("gold", GOLD);
            map.put("private", PRIVATE);
            map.put("shared", SHARED);
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
            if( value == null ){
                return null;
            }
            ImagetypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ImagetypeEnum(value);
            }
            return result;
        }

        public static ImagetypeEnum valueOf(String value) {
            if( value == null ){
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
    @JsonProperty(value="__imagetype")
    
    private ImagetypeEnum imagetype;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__isregistered")
    
    private Boolean isregistered;
    /**
     * 操作系统位数，一般取值为32或者64
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
            if( value == null ){
                return null;
            }
            OsBitEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsBitEnum(value);
            }
            return result;
        }

        public static OsBitEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsBitEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="__os_bit")
    
    private OsBitEnum osBit;
    /**
     * 镜像系统类型，取值为Linux，Windows，Other
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
            if( value == null ){
                return null;
            }
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsTypeEnum(value);
            }
            return result;
        }

        public static OsTypeEnum valueOf(String value) {
            if( value == null ){
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
    @JsonProperty(value="__os_type")
    
    private OsTypeEnum osType;
    /**
     * 镜像平台分类，取值为Windows，Ubuntu，RedHat，SUSE，CentOS，Debian，OpenSUSE, Oracle Linux，Fedora，Other，CoreOS和EulerOS
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
         * Enum ORACLE_LINUX for value: "Oracle Linux"
         */
        public static final PlatformEnum ORACLE_LINUX = new PlatformEnum("Oracle Linux");
        
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
            map.put("Oracle Linux", ORACLE_LINUX);
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
            if( value == null ){
                return null;
            }
            PlatformEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PlatformEnum(value);
            }
            return result;
        }

        public static PlatformEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PlatformEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="__platform")
    
    private PlatformEnum platform;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_diskintensive")
    
    private String supportDiskintensive;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_highperformance")
    
    private String supportHighperformance;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_kvm")
    
    private String supportKvm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_kvm_gpu_type")
    
    private String supportKvmGpuType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_kvm_infiniband")
    
    private String supportKvmInfiniband;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_largememory")
    
    private String supportLargememory;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_xen")
    
    private String supportXen;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_xen_gpu_type")
    
    private String supportXenGpuType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_xen_hana")
    
    private String supportXenHana;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_format")
    
    private String containerFormat;
    /**
     * 镜像格式，目前支持vhd，zvhd、raw，qcow2。默认值是vhd
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
        

        private static final Map<String, DiskFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DiskFormatEnum> createStaticFields() {
            Map<String, DiskFormatEnum> map = new HashMap<>();
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
            if( value == null ){
                return null;
            }
            DiskFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DiskFormatEnum(value);
            }
            return result;
        }

        public static DiskFormatEnum valueOf(String value) {
            if( value == null ){
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
    @JsonProperty(value="disk_format")
    
    private DiskFormatEnum diskFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_status")
    
    private String memberStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_disk")
    
    private Integer minDisk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_ram")
    
    private Integer minRam;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner")
    
    private String owner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protected")
    
    private Boolean _protected;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_dir")
    
    private String sortDir;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_key")
    
    private String sortKey;
    /**
     * 镜像状态。取值如下：queued：表示镜像元数据已经创建成功，等待上传镜像文件。saving：表示镜像正在上传文件到后端存储。deleted：表示镜像已经删除。killed：表示镜像上传错误。active：表示镜像可以正常使用
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
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
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
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tag")
    
    private String tag;
    /**
     * 是否被其他租户可见，取值如下： public：公共镜像 private：私有镜像 shared：共享镜像
     */
    public static final class VisibilityEnum {

        
        /**
         * Enum PUBLIC for value: "public"
         */
        public static final VisibilityEnum PUBLIC = new VisibilityEnum("public");
        
        /**
         * Enum PRIVATE for value: "private"
         */
        public static final VisibilityEnum PRIVATE = new VisibilityEnum("private");
        
        /**
         * Enum SHARED for value: "shared"
         */
        public static final VisibilityEnum SHARED = new VisibilityEnum("shared");
        

        private static final Map<String, VisibilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VisibilityEnum> createStaticFields() {
            Map<String, VisibilityEnum> map = new HashMap<>();
            map.put("public", PUBLIC);
            map.put("private", PRIVATE);
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
            if( value == null ){
                return null;
            }
            VisibilityEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VisibilityEnum(value);
            }
            return result;
        }

        public static VisibilityEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            VisibilityEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="visibility")
    
    private VisibilityEnum visibility;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;

    public GlanceListImagesRequest withImagetype(ImagetypeEnum imagetype) {
        this.imagetype = imagetype;
        return this;
    }

    


    /**
     * 镜像类型，目前支持以下类型：公共镜像：gold私有镜像：private共享镜像：shared
     * @return imagetype
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__imagetype")
    public ImagetypeEnum getImagetype() {
        return imagetype;
    }

    public void setImagetype(ImagetypeEnum imagetype) {
        this.imagetype = imagetype;
    }

    

    public GlanceListImagesRequest withIsregistered(Boolean isregistered) {
        this.isregistered = isregistered;
        return this;
    }

    


    /**
     * 镜像是否是受保护，取值为true/false。一般查询公共镜像时候取值为true，查询私有镜像可以不指定。
     * @return isregistered
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__isregistered")
    public Boolean getIsregistered() {
        return isregistered;
    }

    public void setIsregistered(Boolean isregistered) {
        this.isregistered = isregistered;
    }

    

    public GlanceListImagesRequest withOsBit(OsBitEnum osBit) {
        this.osBit = osBit;
        return this;
    }

    


    /**
     * 操作系统位数，一般取值为32或者64
     * @return osBit
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__os_bit")
    public OsBitEnum getOsBit() {
        return osBit;
    }

    public void setOsBit(OsBitEnum osBit) {
        this.osBit = osBit;
    }

    

    public GlanceListImagesRequest withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * 镜像系统类型，取值为Linux，Windows，Other
     * @return osType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__os_type")
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    

    public GlanceListImagesRequest withPlatform(PlatformEnum platform) {
        this.platform = platform;
        return this;
    }

    


    /**
     * 镜像平台分类，取值为Windows，Ubuntu，RedHat，SUSE，CentOS，Debian，OpenSUSE, Oracle Linux，Fedora，Other，CoreOS和EulerOS
     * @return platform
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__platform")
    public PlatformEnum getPlatform() {
        return platform;
    }

    public void setPlatform(PlatformEnum platform) {
        this.platform = platform;
    }

    

    public GlanceListImagesRequest withSupportDiskintensive(String supportDiskintensive) {
        this.supportDiskintensive = supportDiskintensive;
        return this;
    }

    


    /**
     * 表示该镜像支持密集存储。如果镜像支持密集存储性能，则值为true，否则无需增加该属性
     * @return supportDiskintensive
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_diskintensive")
    public String getSupportDiskintensive() {
        return supportDiskintensive;
    }

    public void setSupportDiskintensive(String supportDiskintensive) {
        this.supportDiskintensive = supportDiskintensive;
    }

    

    public GlanceListImagesRequest withSupportHighperformance(String supportHighperformance) {
        this.supportHighperformance = supportHighperformance;
        return this;
    }

    


    /**
     * 表示该镜像支持高计算性能。如果镜像支持高计算性能，则值为true，否则无需增加该属性
     * @return supportHighperformance
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_highperformance")
    public String getSupportHighperformance() {
        return supportHighperformance;
    }

    public void setSupportHighperformance(String supportHighperformance) {
        this.supportHighperformance = supportHighperformance;
    }

    

    public GlanceListImagesRequest withSupportKvm(String supportKvm) {
        this.supportKvm = supportKvm;
        return this;
    }

    


    /**
     * 如果镜像支持KVM，取值为true，否则无需增加该属性
     * @return supportKvm
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_kvm")
    public String getSupportKvm() {
        return supportKvm;
    }

    public void setSupportKvm(String supportKvm) {
        this.supportKvm = supportKvm;
    }

    

    public GlanceListImagesRequest withSupportKvmGpuType(String supportKvmGpuType) {
        this.supportKvmGpuType = supportKvmGpuType;
        return this;
    }

    


    /**
     * 表示该镜像是支持KVM虚拟化平台下的GPU类型,如果不支持KVM虚拟机下GPU类型，无需添加该属性。该属性与“__support_xen”和“__support_kvm”属性不共存
     * @return supportKvmGpuType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_kvm_gpu_type")
    public String getSupportKvmGpuType() {
        return supportKvmGpuType;
    }

    public void setSupportKvmGpuType(String supportKvmGpuType) {
        this.supportKvmGpuType = supportKvmGpuType;
    }

    

    public GlanceListImagesRequest withSupportKvmInfiniband(String supportKvmInfiniband) {
        this.supportKvmInfiniband = supportKvmInfiniband;
        return this;
    }

    


    /**
     * 如果镜像支持KVM虚拟化下Infiniband网卡类型，取值为true。否则，无需添加该属性。该属性与“__support_xen”属性不共存。
     * @return supportKvmInfiniband
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_kvm_infiniband")
    public String getSupportKvmInfiniband() {
        return supportKvmInfiniband;
    }

    public void setSupportKvmInfiniband(String supportKvmInfiniband) {
        this.supportKvmInfiniband = supportKvmInfiniband;
    }

    

    public GlanceListImagesRequest withSupportLargememory(String supportLargememory) {
        this.supportLargememory = supportLargememory;
        return this;
    }

    


    /**
     * 表示该镜像支持超大内存。如果镜像支持超大内存，取值为true，否则无需增加该属性
     * @return supportLargememory
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_largememory")
    public String getSupportLargememory() {
        return supportLargememory;
    }

    public void setSupportLargememory(String supportLargememory) {
        this.supportLargememory = supportLargememory;
    }

    

    public GlanceListImagesRequest withSupportXen(String supportXen) {
        this.supportXen = supportXen;
        return this;
    }

    


    /**
     * 如果镜像支持XEN，取值为true，否则无需增加该属性
     * @return supportXen
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_xen")
    public String getSupportXen() {
        return supportXen;
    }

    public void setSupportXen(String supportXen) {
        this.supportXen = supportXen;
    }

    

    public GlanceListImagesRequest withSupportXenGpuType(String supportXenGpuType) {
        this.supportXenGpuType = supportXenGpuType;
        return this;
    }

    


    /**
     * 表示该镜像是支持XEN虚拟化平台下的GPU优化类型,如果不支持XEN虚拟化下GPU类型，无需添加该属性。该属性与“__support_xen”和“__support_kvm”属性不共存
     * @return supportXenGpuType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_xen_gpu_type")
    public String getSupportXenGpuType() {
        return supportXenGpuType;
    }

    public void setSupportXenGpuType(String supportXenGpuType) {
        this.supportXenGpuType = supportXenGpuType;
    }

    

    public GlanceListImagesRequest withSupportXenHana(String supportXenHana) {
        this.supportXenHana = supportXenHana;
        return this;
    }

    


    /**
     * 如果镜像支持XEN虚拟化下HANA类型，取值为true。否则，无需添加该属性。该属性与“__support_xen”和“__support_kvm”属性不共存
     * @return supportXenHana
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_xen_hana")
    public String getSupportXenHana() {
        return supportXenHana;
    }

    public void setSupportXenHana(String supportXenHana) {
        this.supportXenHana = supportXenHana;
    }

    

    public GlanceListImagesRequest withContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
        return this;
    }

    


    /**
     * 容器类型
     * @return containerFormat
     */
    public String getContainerFormat() {
        return containerFormat;
    }

    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }

    

    public GlanceListImagesRequest withDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
        return this;
    }

    


    /**
     * 镜像格式，目前支持vhd，zvhd、raw，qcow2。默认值是vhd
     * @return diskFormat
     */
    public DiskFormatEnum getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
    }

    

    public GlanceListImagesRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 镜像ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public GlanceListImagesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 用于分页，表示查询几条镜像记录，取值为整数，默认返回25条镜像记录
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public GlanceListImagesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * 用于分页，表示从哪个镜像开始查询，取值为镜像ID。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public GlanceListImagesRequest withMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
        return this;
    }

    


    /**
     * 成员状态。目前取值有accepted、rejected、pending。accepted表示已经接受共享的镜像，rejected表示已经拒绝了其他用户共享的镜像，pending表示需要确认的其他用户的共享镜像。需要在查询时，设置“visibility”参数为“shared”
     * @return memberStatus
     */
    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    

    public GlanceListImagesRequest withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    


    /**
     * 镜像运行需要的最小磁盘，单位为GB 。取值为40～1024GB。取值为1～1024GB。取值为40～255GB
     * minimum: 1
     * maximum: 1024
     * @return minDisk
     */
    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    

    public GlanceListImagesRequest withMinRam(Integer minRam) {
        this.minRam = minRam;
        return this;
    }

    


    /**
     * 镜像运行需要的最小内存，单位为MB。参数取值依据弹性云服务器的规格限制，一般设置为0。
     * @return minRam
     */
    public Integer getMinRam() {
        return minRam;
    }

    public void setMinRam(Integer minRam) {
        this.minRam = minRam;
    }

    

    public GlanceListImagesRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 镜像名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public GlanceListImagesRequest withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    


    /**
     * 镜像属于哪个租户
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    

    public GlanceListImagesRequest withProtected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    


    /**
     * 镜像是否是受保护，查询公共镜像时候取值为True，查询私有镜像可以不指定。
     * @return _protected
     */
    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    

    public GlanceListImagesRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    


    /**
     * 用于排序，表示升序还是降序，取值为asc和desc。与sort_key一起组合使用，默认为降序desc
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    

    public GlanceListImagesRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    


    /**
     * 用于排序，表示按照哪个字段排序。取值为镜像属性name，container_format，disk_format，status，id，size字段，默认为创建时间。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    

    public GlanceListImagesRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 镜像状态。取值如下：queued：表示镜像元数据已经创建成功，等待上传镜像文件。saving：表示镜像正在上传文件到后端存储。deleted：表示镜像已经删除。killed：表示镜像上传错误。active：表示镜像可以正常使用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public GlanceListImagesRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    


    /**
     * 标签，用户为镜像增加自定义标签后可以通过该参数过滤查询
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    

    public GlanceListImagesRequest withVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    


    /**
     * 是否被其他租户可见，取值如下： public：公共镜像 private：私有镜像 shared：共享镜像
     * @return visibility
     */
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    

    public GlanceListImagesRequest withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 镜像创建时间。支持按照时间点过滤查询，取值格式为“ 操作符:UTC时间”。 其中操作符支持如下几种： gt：大于 gte：大于等于 lt：小于 lte：小于等于 eq：等于 neq：不等于 时间格式支持：yyyy-MM-ddThh:mm:ssZ或者yyyy-MM-dd hh:mm:ss 例如，查询创建时间在2018-10-28 10:00:00之前的镜像，可以通过如下条件过滤： created_at=gt:2018-10-28T10:00:00Z
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    

    public GlanceListImagesRequest withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 镜像修改时间。支持按照时间点过滤查询，取值格式为 “ 操作符:UTC时间”。 其中操作符支持如下几种： gt：大于 gte：大于等于 lt：小于 lte：小于等于 eq：等于 neq：不等于 时间格式支持：yyyy-MM-ddThh:mm:ssZ或者yyyy-MM-dd hh:mm:ss 例如，查询修改时间在2018-10-28 10:00:00之前的镜像，可以通过如下条件过滤： updated_at=gt:2018-10-28T10:00:00Z
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlanceListImagesRequest glanceListImagesRequest = (GlanceListImagesRequest) o;
        return Objects.equals(this.imagetype, glanceListImagesRequest.imagetype) &&
            Objects.equals(this.isregistered, glanceListImagesRequest.isregistered) &&
            Objects.equals(this.osBit, glanceListImagesRequest.osBit) &&
            Objects.equals(this.osType, glanceListImagesRequest.osType) &&
            Objects.equals(this.platform, glanceListImagesRequest.platform) &&
            Objects.equals(this.supportDiskintensive, glanceListImagesRequest.supportDiskintensive) &&
            Objects.equals(this.supportHighperformance, glanceListImagesRequest.supportHighperformance) &&
            Objects.equals(this.supportKvm, glanceListImagesRequest.supportKvm) &&
            Objects.equals(this.supportKvmGpuType, glanceListImagesRequest.supportKvmGpuType) &&
            Objects.equals(this.supportKvmInfiniband, glanceListImagesRequest.supportKvmInfiniband) &&
            Objects.equals(this.supportLargememory, glanceListImagesRequest.supportLargememory) &&
            Objects.equals(this.supportXen, glanceListImagesRequest.supportXen) &&
            Objects.equals(this.supportXenGpuType, glanceListImagesRequest.supportXenGpuType) &&
            Objects.equals(this.supportXenHana, glanceListImagesRequest.supportXenHana) &&
            Objects.equals(this.containerFormat, glanceListImagesRequest.containerFormat) &&
            Objects.equals(this.diskFormat, glanceListImagesRequest.diskFormat) &&
            Objects.equals(this.id, glanceListImagesRequest.id) &&
            Objects.equals(this.limit, glanceListImagesRequest.limit) &&
            Objects.equals(this.marker, glanceListImagesRequest.marker) &&
            Objects.equals(this.memberStatus, glanceListImagesRequest.memberStatus) &&
            Objects.equals(this.minDisk, glanceListImagesRequest.minDisk) &&
            Objects.equals(this.minRam, glanceListImagesRequest.minRam) &&
            Objects.equals(this.name, glanceListImagesRequest.name) &&
            Objects.equals(this.owner, glanceListImagesRequest.owner) &&
            Objects.equals(this._protected, glanceListImagesRequest._protected) &&
            Objects.equals(this.sortDir, glanceListImagesRequest.sortDir) &&
            Objects.equals(this.sortKey, glanceListImagesRequest.sortKey) &&
            Objects.equals(this.status, glanceListImagesRequest.status) &&
            Objects.equals(this.tag, glanceListImagesRequest.tag) &&
            Objects.equals(this.visibility, glanceListImagesRequest.visibility) &&
            Objects.equals(this.createdAt, glanceListImagesRequest.createdAt) &&
            Objects.equals(this.updatedAt, glanceListImagesRequest.updatedAt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imagetype, isregistered, osBit, osType, platform, supportDiskintensive, supportHighperformance, supportKvm, supportKvmGpuType, supportKvmInfiniband, supportLargememory, supportXen, supportXenGpuType, supportXenHana, containerFormat, diskFormat, id, limit, marker, memberStatus, minDisk, minRam, name, owner, _protected, sortDir, sortKey, status, tag, visibility, createdAt, updatedAt);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceListImagesRequest {\n");
        sb.append("    imagetype: ").append(toIndentedString(imagetype)).append("\n");
        sb.append("    isregistered: ").append(toIndentedString(isregistered)).append("\n");
        sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    supportDiskintensive: ").append(toIndentedString(supportDiskintensive)).append("\n");
        sb.append("    supportHighperformance: ").append(toIndentedString(supportHighperformance)).append("\n");
        sb.append("    supportKvm: ").append(toIndentedString(supportKvm)).append("\n");
        sb.append("    supportKvmGpuType: ").append(toIndentedString(supportKvmGpuType)).append("\n");
        sb.append("    supportKvmInfiniband: ").append(toIndentedString(supportKvmInfiniband)).append("\n");
        sb.append("    supportLargememory: ").append(toIndentedString(supportLargememory)).append("\n");
        sb.append("    supportXen: ").append(toIndentedString(supportXen)).append("\n");
        sb.append("    supportXenGpuType: ").append(toIndentedString(supportXenGpuType)).append("\n");
        sb.append("    supportXenHana: ").append(toIndentedString(supportXenHana)).append("\n");
        sb.append("    containerFormat: ").append(toIndentedString(containerFormat)).append("\n");
        sb.append("    diskFormat: ").append(toIndentedString(diskFormat)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    memberStatus: ").append(toIndentedString(memberStatus)).append("\n");
        sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
        sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

