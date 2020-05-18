package com.huaweicloud.sdk.ims.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class GlanceCreateImageMetadataResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="visibility")
    
    private String visibility;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protected")
    
    private Boolean _protected;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_format")
    
    private String containerFormat;
    /**
     * 镜像文件格式。目前支持vhd、zvhd、raw、qcow2。默认值是vhd。
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
    
    private DiskFormatEnum diskFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_ram")
    
    private Integer minRam;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_disk")
    
    private Integer minDisk;
    /**
     * 镜像状态。取值如下：queued：表示镜像元数据已经创建成功，等待上传镜像文件。saving：表示镜像正在上传文件到后端存储。deleted：表示镜像已经删除。killed：表示镜像上传错误。active：表示镜像可以正常使用。
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
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="self")
    
    private String self;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file")
    
    private String file;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schema")
    
    private String schema;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__image_source_type")
    
    private String imageSourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__image_size")
    
    private String imageSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__isregistered")
    
    private String isregistered;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__os_version")
    
    private String osVersion;
    /**
     * 镜像的操作系统类型，取值由__os_version确定。支持Windows、Linux和other。
     */
    public static class OsTypeEnum {

        
        /**
         * Enum WINDOWS for value: "Windows"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("Windows");

        
        /**
         * Enum LINUX for value: "Linux"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("Linux");

        
        /**
         * Enum OTHER for value: "other"
         */
        public static final OsTypeEnum OTHER = new OsTypeEnum("other");

        

        public static Map<String, OsTypeEnum> staticFields =
                new HashMap<String, OsTypeEnum>() {
                    { 
                        put("Windows", WINDOWS);
                        put("Linux", LINUX);
                        put("other", OTHER);
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__platform")
    
    private String platform;
    /**
     * 表示操作系统位数。取值由__os_version确定，取值为32或64。
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__imagetype")
    
    private String imagetype;
    /**
     * 平台类型。镜像使用环境类型：FusionCompute、Ironic、DataImage。如果是云主机云服务器镜像，则取值为FusionCompute。如果是数据卷镜像则取值是DataImage。如果是物理机裸金属服务器镜像，则取值是Ironic。
     */
    public static class VirtualEnvTypeEnum {

        
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

        

        public static Map<String, VirtualEnvTypeEnum> staticFields =
                new HashMap<String, VirtualEnvTypeEnum>() {
                    { 
                        put("FusionCompute", FUSIONCOMPUTE);
                        put("Ironic", IRONIC);
                        put("DataImage", DATAIMAGE);
                    }
                };

        private String value;

        VirtualEnvTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VirtualEnvTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            VirtualEnvTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new VirtualEnvTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static VirtualEnvTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            VirtualEnvTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof VirtualEnvTypeEnum) {
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
    @JsonProperty(value="virtual_env_type")
    
    private VirtualEnvTypeEnum virtualEnvType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="owner")
    
    private String owner;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="virtual_size")
    
    private Integer virtualSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="properties")
    
    private Object properties = null;

    public GlanceCreateImageMetadataResponse withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    


    /**
     * 其他租户是否可见。取值为private。
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public GlanceCreateImageMetadataResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 镜像名称，如果未指定name的取值，则默认为空，但是使用该镜像创建虚拟机会失败。名称的长度为1～128位。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GlanceCreateImageMetadataResponse withProtected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    


    /**
     * 镜像是否被保护，保护后的镜像不可删除。取值为false
     * @return _protected
     */
    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public GlanceCreateImageMetadataResponse withContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
        return this;
    }

    


    /**
     * 容器格式。取值为bare。
     * @return containerFormat
     */
    public String getContainerFormat() {
        return containerFormat;
    }

    public void setContainerFormat(String containerFormat) {
        this.containerFormat = containerFormat;
    }

    public GlanceCreateImageMetadataResponse withDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
        return this;
    }

    


    /**
     * 镜像文件格式。目前支持vhd、zvhd、raw、qcow2。默认值是vhd。
     * @return diskFormat
     */
    public DiskFormatEnum getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(DiskFormatEnum diskFormat) {
        this.diskFormat = diskFormat;
    }

    public GlanceCreateImageMetadataResponse withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public GlanceCreateImageMetadataResponse addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public GlanceCreateImageMetadataResponse withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 镜像标签列表。长度为1～255位。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public GlanceCreateImageMetadataResponse withMinRam(Integer minRam) {
        this.minRam = minRam;
        return this;
    }

    


    /**
     * 镜像运行最小内存，单位为MB。取值参考ECS规格限制，一般设置为0。云服务器的规格限制，请参见规格清单。
     * @return minRam
     */
    public Integer getMinRam() {
        return minRam;
    }

    public void setMinRam(Integer minRam) {
        this.minRam = minRam;
    }

    public GlanceCreateImageMetadataResponse withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    


    /**
     * 镜像运行需要的最小磁盘容量，单位为GB 。取值为40～1024GB。必须大于镜像系统盘容量，否则创建云主机云服务器可能失败。
     * minimum: 40
     * maximum: 1024
     * @return minDisk
     */
    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    public GlanceCreateImageMetadataResponse withStatus(StatusEnum status) {
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

    public GlanceCreateImageMetadataResponse withCreatedAt(String createdAt) {
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

    public GlanceCreateImageMetadataResponse withUpdatedAt(String updatedAt) {
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

    public GlanceCreateImageMetadataResponse withSelf(String self) {
        this.self = self;
        return this;
    }

    


    /**
     * 本镜像链接。
     * @return self
     */
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public GlanceCreateImageMetadataResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 镜像ID，用户调用创建镜像接口后，需保存该镜像的ID，用来调用上传镜像接口完成镜像上传。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GlanceCreateImageMetadataResponse withFile(String file) {
        this.file = file;
        return this;
    }

    


    /**
     * 上传下载镜像文件的地址链接。
     * @return file
     */
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public GlanceCreateImageMetadataResponse withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    


    /**
     * 视图链接。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public GlanceCreateImageMetadataResponse withImageSourceType(String imageSourceType) {
        this.imageSourceType = imageSourceType;
        return this;
    }

    


    /**
     * 镜像后端存储类型，目前支持uds。
     * @return imageSourceType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getImageSourceType() {
        return imageSourceType;
    }

    public void setImageSourceType(String imageSourceType) {
        this.imageSourceType = imageSourceType;
    }

    public GlanceCreateImageMetadataResponse withImageSize(String imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    


    /**
     * 镜像大小。单位为字节。
     * @return imageSize
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getImageSize() {
        return imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    public GlanceCreateImageMetadataResponse withIsregistered(String isregistered) {
        this.isregistered = isregistered;
        return this;
    }

    


    /**
     * 镜像是否注册。只有已注册的镜像才能在Portal界面上查询到。取值为true。
     * @return isregistered
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getIsregistered() {
        return isregistered;
    }

    public void setIsregistered(String isregistered) {
        this.isregistered = isregistered;
    }

    public GlanceCreateImageMetadataResponse withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    


    /**
     * 镜像的操作系统具体版本。
     * @return osVersion
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public GlanceCreateImageMetadataResponse withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * 镜像的操作系统类型，取值由__os_version确定。支持Windows、Linux和other。
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

    public GlanceCreateImageMetadataResponse withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    


    /**
     * 表示镜像支持的操作系统平台。取值由__os_version确定
     * @return platform
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public GlanceCreateImageMetadataResponse withOsBit(OsBitEnum osBit) {
        this.osBit = osBit;
        return this;
    }

    


    /**
     * 表示操作系统位数。取值由__os_version确定，取值为32或64。
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

    public GlanceCreateImageMetadataResponse withImagetype(String imagetype) {
        this.imagetype = imagetype;
        return this;
    }

    


    /**
     * 镜像类型。取值为private，表示私有镜像。
     * @return imagetype
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getImagetype() {
        return imagetype;
    }

    public void setImagetype(String imagetype) {
        this.imagetype = imagetype;
    }

    public GlanceCreateImageMetadataResponse withVirtualEnvType(VirtualEnvTypeEnum virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
        return this;
    }

    


    /**
     * 平台类型。镜像使用环境类型：FusionCompute、Ironic、DataImage。如果是云主机云服务器镜像，则取值为FusionCompute。如果是数据卷镜像则取值是DataImage。如果是物理机裸金属服务器镜像，则取值是Ironic。
     * @return virtualEnvType
     */
    public VirtualEnvTypeEnum getVirtualEnvType() {
        return virtualEnvType;
    }

    public void setVirtualEnvType(VirtualEnvTypeEnum virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
    }

    public GlanceCreateImageMetadataResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    


    /**
     * 镜像所属项目ID。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public GlanceCreateImageMetadataResponse withVirtualSize(Integer virtualSize) {
        this.virtualSize = virtualSize;
        return this;
    }

    


    /**
     * 镜像虚拟大小。单位为字节。
     * @return virtualSize
     */
    public Integer getVirtualSize() {
        return virtualSize;
    }

    public void setVirtualSize(Integer virtualSize) {
        this.virtualSize = virtualSize;
    }

    public GlanceCreateImageMetadataResponse withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    


    /**
     * 镜像属性的集合，不表示具体的镜像属性
     * @return properties
     */
    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlanceCreateImageMetadataResponse glanceCreateImageMetadataResponse = (GlanceCreateImageMetadataResponse) o;
        return Objects.equals(this.visibility, glanceCreateImageMetadataResponse.visibility) &&
            Objects.equals(this.name, glanceCreateImageMetadataResponse.name) &&
            Objects.equals(this._protected, glanceCreateImageMetadataResponse._protected) &&
            Objects.equals(this.containerFormat, glanceCreateImageMetadataResponse.containerFormat) &&
            Objects.equals(this.diskFormat, glanceCreateImageMetadataResponse.diskFormat) &&
            Objects.equals(this.tags, glanceCreateImageMetadataResponse.tags) &&
            Objects.equals(this.minRam, glanceCreateImageMetadataResponse.minRam) &&
            Objects.equals(this.minDisk, glanceCreateImageMetadataResponse.minDisk) &&
            Objects.equals(this.status, glanceCreateImageMetadataResponse.status) &&
            Objects.equals(this.createdAt, glanceCreateImageMetadataResponse.createdAt) &&
            Objects.equals(this.updatedAt, glanceCreateImageMetadataResponse.updatedAt) &&
            Objects.equals(this.self, glanceCreateImageMetadataResponse.self) &&
            Objects.equals(this.id, glanceCreateImageMetadataResponse.id) &&
            Objects.equals(this.file, glanceCreateImageMetadataResponse.file) &&
            Objects.equals(this.schema, glanceCreateImageMetadataResponse.schema) &&
            Objects.equals(this.imageSourceType, glanceCreateImageMetadataResponse.imageSourceType) &&
            Objects.equals(this.imageSize, glanceCreateImageMetadataResponse.imageSize) &&
            Objects.equals(this.isregistered, glanceCreateImageMetadataResponse.isregistered) &&
            Objects.equals(this.osVersion, glanceCreateImageMetadataResponse.osVersion) &&
            Objects.equals(this.osType, glanceCreateImageMetadataResponse.osType) &&
            Objects.equals(this.platform, glanceCreateImageMetadataResponse.platform) &&
            Objects.equals(this.osBit, glanceCreateImageMetadataResponse.osBit) &&
            Objects.equals(this.imagetype, glanceCreateImageMetadataResponse.imagetype) &&
            Objects.equals(this.virtualEnvType, glanceCreateImageMetadataResponse.virtualEnvType) &&
            Objects.equals(this.owner, glanceCreateImageMetadataResponse.owner) &&
            Objects.equals(this.virtualSize, glanceCreateImageMetadataResponse.virtualSize) &&
            Objects.equals(this.properties, glanceCreateImageMetadataResponse.properties);
    }
    @Override
    public int hashCode() {
        return Objects.hash(visibility, name, _protected, containerFormat, diskFormat, tags, minRam, minDisk, status, createdAt, updatedAt, self, id, file, schema, imageSourceType, imageSize, isregistered, osVersion, osType, platform, osBit, imagetype, virtualEnvType, owner, virtualSize, properties);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceCreateImageMetadataResponse {\n");
            sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
            sb.append("    containerFormat: ").append(toIndentedString(containerFormat)).append("\n");
            sb.append("    diskFormat: ").append(toIndentedString(diskFormat)).append("\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
            sb.append("    minRam: ").append(toIndentedString(minRam)).append("\n");
            sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
            sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
            sb.append("    self: ").append(toIndentedString(self)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    file: ").append(toIndentedString(file)).append("\n");
            sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
            sb.append("    imageSourceType: ").append(toIndentedString(imageSourceType)).append("\n");
            sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
            sb.append("    isregistered: ").append(toIndentedString(isregistered)).append("\n");
            sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
            sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
            sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
            sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
            sb.append("    imagetype: ").append(toIndentedString(imagetype)).append("\n");
            sb.append("    virtualEnvType: ").append(toIndentedString(virtualEnvType)).append("\n");
            sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
            sb.append("    virtualSize: ").append(toIndentedString(virtualSize)).append("\n");
            sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

