package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class GlanceListImagesRequest  {

    /**
     * Gets or Sets imagetype
     */
    public static class ImagetypeEnum {

        
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

        

        public static Map<String, ImagetypeEnum> staticFields =
                new HashMap<String, ImagetypeEnum>() {
                    { 
                        put("gold", GOLD);
                        put("private", PRIVATE);
                        put("shared", SHARED);
                    }
                };

        private String value;

        ImagetypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ImagetypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ImagetypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ImagetypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ImagetypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ImagetypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ImagetypeEnum) {
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
    
    private Boolean isregistered = true;
    /**
     * Gets or Sets osBit
     */
    public static class OsBitEnum {

        
        /**
         * Enum _32 for value: "32"
         */
        public static final OsBitEnum _32 = new OsBitEnum("32");

        
        /**
         * Enum _64 for value: "64"
         */
        public static final OsBitEnum _64 = new OsBitEnum("64");

        

        public static Map<String, OsBitEnum> staticFields =
                new HashMap<String, OsBitEnum>() {
                    { 
                        put("32", _32);
                        put("64", _64);
                    }
                };

        private String value;

        OsBitEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsBitEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OsBitEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OsBitEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OsBitEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsBitEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OsBitEnum) {
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
     * Gets or Sets osType
     */
    public static class OsTypeEnum {

        
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

        

        public static Map<String, OsTypeEnum> staticFields =
                new HashMap<String, OsTypeEnum>() {
                    { 
                        put("Linux", LINUX);
                        put("Windows", WINDOWS);
                        put("Other", OTHER);
                    }
                };

        private String value;

        OsTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OsTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OsTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OsTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OsTypeEnum) {
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
     * Gets or Sets platform
     */
    public static class PlatformEnum {

        
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
         * Enum EULEOS for value: "EuleOS"
         */
        public static final PlatformEnum EULEOS = new PlatformEnum("EuleOS");

        

        public static Map<String, PlatformEnum> staticFields =
                new HashMap<String, PlatformEnum>() {
                    { 
                        put("Windows", WINDOWS);
                        put("Ubuntu", UBUNTU);
                        put("RedHat", REDHAT);
                        put("SUSE", SUSE);
                        put("CentOS", CENTOS);
                        put("Debian", DEBIAN);
                        put("OpenSUSE", OPENSUSE);
                        put("Oracle Linux", ORACLE_LINUX);
                        put("Fedora", FEDORA);
                        put("Other", OTHER);
                        put("CoreOS", COREOS);
                        put("EuleOS", EULEOS);
                    }
                };

        private String value;

        PlatformEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PlatformEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            PlatformEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new PlatformEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static PlatformEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PlatformEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PlatformEnum) {
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
    
    private String containerFormat = "bare";
    /**
     * Gets or Sets diskFormat
     */
    public static class DiskFormatEnum {

        
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

        

        public static Map<String, DiskFormatEnum> staticFields =
                new HashMap<String, DiskFormatEnum>() {
                    { 
                        put("vhd", VHD);
                        put("zvhd", ZVHD);
                        put("raw", RAW);
                        put("qcow2", QCOW2);
                    }
                };

        private String value;

        DiskFormatEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DiskFormatEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            DiskFormatEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DiskFormatEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DiskFormatEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DiskFormatEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DiskFormatEnum) {
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
    
    private DiskFormatEnum diskFormat = DiskFormatEnum.VHD;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 25;


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
     * Gets or Sets status
     */
    public static class StatusEnum {

        
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

        

        public static Map<String, StatusEnum> staticFields =
                new HashMap<String, StatusEnum>() {
                    { 
                        put("queued", QUEUED);
                        put("saving", SAVING);
                        put("deleted", DELETED);
                        put("killed", KILLED);
                        put("active", ACTIVE);
                    }
                };

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new StatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
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
     * Gets or Sets visibility
     */
    public static class VisibilityEnum {

        
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

        

        public static Map<String, VisibilityEnum> staticFields =
                new HashMap<String, VisibilityEnum>() {
                    { 
                        put("public", PUBLIC);
                        put("private", PRIVATE);
                        put("shared", SHARED);
                    }
                };

        private String value;

        VisibilityEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VisibilityEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            VisibilityEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new VisibilityEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static VisibilityEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            VisibilityEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof VisibilityEnum) {
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
     * Get imagetype
     * @return imagetype
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get isregistered
     * @return isregistered
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get osBit
     * @return osBit
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get osType
     * @return osType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get platform
     * @return platform
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get supportDiskintensive
     * @return supportDiskintensive
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get supportHighperformance
     * @return supportHighperformance
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get supportKvm
     * @return supportKvm
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get supportKvmGpuType
     * @return supportKvmGpuType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get supportKvmInfiniband
     * @return supportKvmInfiniband
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get supportLargememory
     * @return supportLargememory
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get supportXen
     * @return supportXen
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get supportXenGpuType
     * @return supportXenGpuType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get supportXenHana
     * @return supportXenHana
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
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
     * Get containerFormat
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
     * Get diskFormat
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
     * Get id
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
     * Get limit
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
     * Get marker
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
     * Get memberStatus
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
     * Get minDisk
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
     * Get minRam
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
     * Get name
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
     * Get owner
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
     * Get _protected
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
     * Get sortDir
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
     * Get sortKey
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
     * Get status
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
     * Get tag
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
     * Get visibility
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
     * Get createdAt
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
     * Get updatedAt
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

