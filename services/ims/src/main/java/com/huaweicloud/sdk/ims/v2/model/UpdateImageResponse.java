package com.huaweicloud.sdk.ims.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateImageResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__backup_id")
    
    private String backupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__data_origin")
    
    private String dataOrigin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__image_size")
    
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ImageSourceTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ImageSourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ImageSourceTypeEnum(value);
            }
            return result;
        }

        public static ImageSourceTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ImageSourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ImageSourceTypeEnum) {
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
    @JsonProperty(value="__image_source_type")
    
    private ImageSourceTypeEnum imageSourceType;
    /**
     * 镜像类型，目前支持以下类型： 公共镜像：gold 私有镜像：private 共享镜像：shared
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
            return String.valueOf(value);
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
    /**
     * 是否是注册过的镜像，取值为“true”或者“false”
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IsregisteredEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            IsregisteredEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IsregisteredEnum(value);
            }
            return result;
        }

        public static IsregisteredEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            IsregisteredEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof IsregisteredEnum) {
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
    @JsonProperty(value="__isregistered")
    
    private IsregisteredEnum isregistered;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__originalimagename")
    
    private String originalimagename;
    /**
     * 操作系统位数，一般取值为“32”或者“64”
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
            return String.valueOf(value);
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
     * 操作系统类型，目前取值Linux， Windows，Other
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
            return String.valueOf(value);
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
    @JsonProperty(value="__os_version")
    
    private String osVersion;
    /**
     * 镜像平台分类
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
            return String.valueOf(value);
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
    @JsonProperty(value="__productcode")
    
    private String productcode;


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
    @JsonProperty(value="__system_support_market")
    
    private Boolean systemSupportMarket;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="checksum")
    
    private String checksum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_format")
    
    private String containerFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk_format")
    
    private String diskFormat;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file")
    
    private String file;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


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
    @JsonProperty(value="schema")
    
    private String schema;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="self")
    
    private String self;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;
    /**
     * 镜像状态。取值如下：queued：表示镜像元数据已经创建成功，等待 上传镜像文件。saving：表示镜像 正在上传文件到后端存储。deleted：表示镜像已经删除。killed：表示镜像上传错误。active：表示镜像可以正常使用
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
            return String.valueOf(value);
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
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;
    /**
     * 镜像使用环境类型：FusionCompute，Ironic，DataImage。如果弹性云服务器镜像，则取值为FusionCompute，如果是数据卷镜像则取Dat            aImage，如果是裸金属服务器镜像，则取值是Ironic
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VirtualEnvTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            VirtualEnvTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VirtualEnvTypeEnum(value);
            }
            return result;
        }

        public static VirtualEnvTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            VirtualEnvTypeEnum result = STATIC_FIELDS.get(value);
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
    @JsonProperty(value="virtual_size")
    
    private Integer virtualSize;
    /**
     * 是否被其他租户可见，取值为private或public
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
        

        private static final Map<String, VisibilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VisibilityEnum> createStaticFields() {
            Map<String, VisibilityEnum> map = new HashMap<>();
            map.put("private", PRIVATE);
            map.put("public", PUBLIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VisibilityEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
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
    /**
     * 表示当前镜像支持CloudInit密码/密钥注入方式，建议设置为\"true\"或者\"false\"。 如果取值为\"true\"，表示该镜像不支持CloudInit注入密码/密钥，其他取值时表示支持CloudInit注入密钥/密码。
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SupportFcInjectEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SupportFcInjectEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SupportFcInjectEnum(value);
            }
            return result;
        }

        public static SupportFcInjectEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SupportFcInjectEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SupportFcInjectEnum) {
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
    @JsonProperty(value="__support_fc_inject")
    
    private SupportFcInjectEnum supportFcInject;
    /**
     * 云服务器的启动方式。目前支持： bios：表示bios引导启动。 uefi：表示uefi引导启动。
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static HwFirmwareTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            HwFirmwareTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new HwFirmwareTypeEnum(value);
            }
            return result;
        }

        public static HwFirmwareTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            HwFirmwareTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof HwFirmwareTypeEnum) {
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
    @JsonProperty(value="hw_firmware_type")
    
    private HwFirmwareTypeEnum hwFirmwareType;
    /**
     * 是否是ARM架构类型的镜像，取值为“true”或者“false”。
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SupportArmEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SupportArmEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SupportArmEnum(value);
            }
            return result;
        }

        public static SupportArmEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SupportArmEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof SupportArmEnum) {
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
    @JsonProperty(value="__support_arm")
    
    private SupportArmEnum supportArm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_ram")
    
    private String maxRam;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__system__cmkid")
    
    private String systemCmkid;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__os_feature_list")
    
    private String osFeatureList;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__account_code")
    
    private String accountCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hw_vif_multiqueue_enabled")
    
    private String hwVifMultiqueueEnabled;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__is_offshelved")
    
    private String isOffshelved;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__lazyloading")
    
    private String lazyloading;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__root_origin")
    
    private String rootOrigin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__sequence_num")
    
    private String sequenceNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="active_at")
    
    private String activeAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_agent_list")
    
    private String supportAgentList;

    public UpdateImageResponse withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    


    /**
     * 备份ID。如果是备份创建的镜像，则填写为备份的ID，否则为空
     * @return backupId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__backup_id")
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    

    public UpdateImageResponse withDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
        return this;
    }

    


    /**
     * 镜像来源。公共镜像为空
     * @return dataOrigin
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__data_origin")
    public String getDataOrigin() {
        return dataOrigin;
    }

    public void setDataOrigin(String dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    

    public UpdateImageResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 镜像描述信息。 支持字母、数字、中文等，不支持回车、<、 >，长度不能超过1024个字符。
     * @return description
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public UpdateImageResponse withImageSize(String imageSize) {
        this.imageSize = imageSize;
        return this;
    }

    


    /**
     * 镜像文件的大小，单位为字节
     * @return imageSize
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__image_size")
    public String getImageSize() {
        return imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    

    public UpdateImageResponse withImageSourceType(ImageSourceTypeEnum imageSourceType) {
        this.imageSourceType = imageSourceType;
        return this;
    }

    


    /**
     * 镜像后端存储类型，目前只支持uds
     * @return imageSourceType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__image_source_type")
    public ImageSourceTypeEnum getImageSourceType() {
        return imageSourceType;
    }

    public void setImageSourceType(ImageSourceTypeEnum imageSourceType) {
        this.imageSourceType = imageSourceType;
    }

    

    public UpdateImageResponse withImagetype(ImagetypeEnum imagetype) {
        this.imagetype = imagetype;
        return this;
    }

    


    /**
     * 镜像类型，目前支持以下类型： 公共镜像：gold 私有镜像：private 共享镜像：shared
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

    

    public UpdateImageResponse withIsregistered(IsregisteredEnum isregistered) {
        this.isregistered = isregistered;
        return this;
    }

    


    /**
     * 是否是注册过的镜像，取值为“true”或者“false”
     * @return isregistered
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__isregistered")
    public IsregisteredEnum getIsregistered() {
        return isregistered;
    }

    public void setIsregistered(IsregisteredEnum isregistered) {
        this.isregistered = isregistered;
    }

    

    public UpdateImageResponse withOriginalimagename(String originalimagename) {
        this.originalimagename = originalimagename;
        return this;
    }

    


    /**
     * 父镜像ID。公共镜像或通过文件创建的私有镜像，取值为空
     * @return originalimagename
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__originalimagename")
    public String getOriginalimagename() {
        return originalimagename;
    }

    public void setOriginalimagename(String originalimagename) {
        this.originalimagename = originalimagename;
    }

    

    public UpdateImageResponse withOsBit(OsBitEnum osBit) {
        this.osBit = osBit;
        return this;
    }

    


    /**
     * 操作系统位数，一般取值为“32”或者“64”
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

    

    public UpdateImageResponse withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * 操作系统类型，目前取值Linux， Windows，Other
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

    

    public UpdateImageResponse withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    


    /**
     * 操作系统具体版本
     * @return osVersion
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__os_version")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    

    public UpdateImageResponse withPlatform(PlatformEnum platform) {
        this.platform = platform;
        return this;
    }

    


    /**
     * 镜像平台分类
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

    

    public UpdateImageResponse withProductcode(String productcode) {
        this.productcode = productcode;
        return this;
    }

    


    /**
     * 市场镜像的产品ID
     * @return productcode
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__productcode")
    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    

    public UpdateImageResponse withSupportDiskintensive(String supportDiskintensive) {
        this.supportDiskintensive = supportDiskintensive;
        return this;
    }

    


    /**
     * 镜像来源表示该镜像支持密集存储。如果镜像支持密集存储性能，则值为true，否则无需增加该属性。
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

    

    public UpdateImageResponse withSupportHighperformance(String supportHighperformance) {
        this.supportHighperformance = supportHighperformance;
        return this;
    }

    


    /**
     * 表示该镜像支持高计算性能。如果镜像支持高计算性能，则值为true，否则无需增加该属性。
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

    

    public UpdateImageResponse withSupportKvm(String supportKvm) {
        this.supportKvm = supportKvm;
        return this;
    }

    


    /**
     * 如果镜像支持KVM，取值为true，否则无需增加该属性。
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

    

    public UpdateImageResponse withSupportKvmGpuType(String supportKvmGpuType) {
        this.supportKvmGpuType = supportKvmGpuType;
        return this;
    }

    


    /**
     * 表示该镜像是支持KVM虚拟化平台下的GPU类型，如果不支持KVM虚拟机下GPU类型，无需添加该属性。该属性与“__support_xen”和“__support_kvm”属性不共存。
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

    

    public UpdateImageResponse withSupportKvmInfiniband(String supportKvmInfiniband) {
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

    

    public UpdateImageResponse withSupportLargememory(String supportLargememory) {
        this.supportLargememory = supportLargememory;
        return this;
    }

    


    /**
     * 表示该镜像支持超大内存。如果镜像支持超大内存，取值为true，否则无需增加该属性。
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

    

    public UpdateImageResponse withSupportXen(String supportXen) {
        this.supportXen = supportXen;
        return this;
    }

    


    /**
     * 如果镜像支持XEN，取值为true，否则无需增加该属性。
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

    

    public UpdateImageResponse withSupportXenGpuType(String supportXenGpuType) {
        this.supportXenGpuType = supportXenGpuType;
        return this;
    }

    


    /**
     * 表示该镜像是支持XEN虚拟化平台下的GPU优化类型，如果不支持XEN虚拟化下GPU类型，无需添加该属性            。该属性与“__support_xen”和“__support_kvm”属性不共存。
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

    

    public UpdateImageResponse withSupportXenHana(String supportXenHana) {
        this.supportXenHana = supportXenHana;
        return this;
    }

    


    /**
     * 如果镜像支持XEN虚拟化下HANA类型，取值为true。否则，无需添加该属性。该属性与“__support_xen”             和“__support_kvm”属性不共存。
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

    

    public UpdateImageResponse withSystemSupportMarket(Boolean systemSupportMarket) {
        this.systemSupportMarket = systemSupportMarket;
        return this;
    }

    


    /**
     * 表示当前镜像是否支持发布为市场镜像,true表示支持,false 表示不支持
     * @return systemSupportMarket
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__system_support_market")
    public Boolean getSystemSupportMarket() {
        return systemSupportMarket;
    }

    public void setSystemSupportMarket(Boolean systemSupportMarket) {
        this.systemSupportMarket = systemSupportMarket;
    }

    

    public UpdateImageResponse withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    


    /**
     * 目前暂时不使用
     * @return checksum
     */
    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    

    public UpdateImageResponse withContainerFormat(String containerFormat) {
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

    

    public UpdateImageResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 创建时间。格式为UTC时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    

    public UpdateImageResponse withDiskFormat(String diskFormat) {
        this.diskFormat = diskFormat;
        return this;
    }

    


    /**
     * 镜像的格式，目前支持vhd，zvhd、raw，qcow2。默认值是vhd
     * @return diskFormat
     */
    public String getDiskFormat() {
        return diskFormat;
    }

    public void setDiskFormat(String diskFormat) {
        this.diskFormat = diskFormat;
    }

    

    public UpdateImageResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 表示当前镜像所属的企业项目。取值为0或无该值，表示属于default企业项目，取值为UUID，表示属于该UUID对应的企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public UpdateImageResponse withFile(String file) {
        this.file = file;
        return this;
    }

    


    /**
     * 镜像文件下载和上传链接
     * @return file
     */
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    

    public UpdateImageResponse withId(String id) {
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

    

    public UpdateImageResponse withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    


    /**
     * 镜像运行需要的最小磁盘容量，单位为GB。取值为40～1024GB。
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

    

    public UpdateImageResponse withMinRam(Integer minRam) {
        this.minRam = minRam;
        return this;
    }

    


    /**
     * 镜像运行需要的最小内存，单位为MB。参数取值依据弹性云服务器的规格限制，默认设置为0
     * @return minRam
     */
    public Integer getMinRam() {
        return minRam;
    }

    public void setMinRam(Integer minRam) {
        this.minRam = minRam;
    }

    

    public UpdateImageResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 镜像名称。 名称的首尾字母不能为空格。 名称的长度至为1～128位。 名称包含以下4种字符： 大写字母 小写字母 数字 特殊字符包含-、.、_、空格和中文。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UpdateImageResponse withOwner(String owner) {
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

    

    public UpdateImageResponse withProtected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }

    


    /**
     * 是否是受保护的，受保护的镜像不允许删除。取值为true或false
     * @return _protected
     */
    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    

    public UpdateImageResponse withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    


    /**
     * 镜像视图
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    

    public UpdateImageResponse withSelf(String self) {
        this.self = self;
        return this;
    }

    


    /**
     * 镜像链接信息
     * @return self
     */
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    

    public UpdateImageResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 目前暂时不使用
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public UpdateImageResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 镜像状态。取值如下：queued：表示镜像元数据已经创建成功，等待 上传镜像文件。saving：表示镜像 正在上传文件到后端存储。deleted：表示镜像已经删除。killed：表示镜像上传错误。active：表示镜像可以正常使用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public UpdateImageResponse withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public UpdateImageResponse addTagsItem(String tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateImageResponse withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 镜像标签列表
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    

    public UpdateImageResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 更新时间。格式为UTC时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    

    public UpdateImageResponse withVirtualEnvType(VirtualEnvTypeEnum virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
        return this;
    }

    


    /**
     * 镜像使用环境类型：FusionCompute，Ironic，DataImage。如果弹性云服务器镜像，则取值为FusionCompute，如果是数据卷镜像则取Dat            aImage，如果是裸金属服务器镜像，则取值是Ironic
     * @return virtualEnvType
     */
    public VirtualEnvTypeEnum getVirtualEnvType() {
        return virtualEnvType;
    }

    public void setVirtualEnvType(VirtualEnvTypeEnum virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
    }

    

    public UpdateImageResponse withVirtualSize(Integer virtualSize) {
        this.virtualSize = virtualSize;
        return this;
    }

    


    /**
     * 目前暂时不使用
     * @return virtualSize
     */
    public Integer getVirtualSize() {
        return virtualSize;
    }

    public void setVirtualSize(Integer virtualSize) {
        this.virtualSize = virtualSize;
    }

    

    public UpdateImageResponse withVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    


    /**
     * 是否被其他租户可见，取值为private或public
     * @return visibility
     */
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    

    public UpdateImageResponse withSupportFcInject(SupportFcInjectEnum supportFcInject) {
        this.supportFcInject = supportFcInject;
        return this;
    }

    


    /**
     * 表示当前镜像支持CloudInit密码/密钥注入方式，建议设置为\"true\"或者\"false\"。 如果取值为\"true\"，表示该镜像不支持CloudInit注入密码/密钥，其他取值时表示支持CloudInit注入密钥/密码。
     * @return supportFcInject
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_fc_inject")
    public SupportFcInjectEnum getSupportFcInject() {
        return supportFcInject;
    }

    public void setSupportFcInject(SupportFcInjectEnum supportFcInject) {
        this.supportFcInject = supportFcInject;
    }

    

    public UpdateImageResponse withHwFirmwareType(HwFirmwareTypeEnum hwFirmwareType) {
        this.hwFirmwareType = hwFirmwareType;
        return this;
    }

    


    /**
     * 云服务器的启动方式。目前支持： bios：表示bios引导启动。 uefi：表示uefi引导启动。
     * @return hwFirmwareType
     */
    public HwFirmwareTypeEnum getHwFirmwareType() {
        return hwFirmwareType;
    }

    public void setHwFirmwareType(HwFirmwareTypeEnum hwFirmwareType) {
        this.hwFirmwareType = hwFirmwareType;
    }

    

    public UpdateImageResponse withSupportArm(SupportArmEnum supportArm) {
        this.supportArm = supportArm;
        return this;
    }

    


    /**
     * 是否是ARM架构类型的镜像，取值为“true”或者“false”。
     * @return supportArm
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_arm")
    public SupportArmEnum getSupportArm() {
        return supportArm;
    }

    public void setSupportArm(SupportArmEnum supportArm) {
        this.supportArm = supportArm;
    }

    

    public UpdateImageResponse withMaxRam(String maxRam) {
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

    

    public UpdateImageResponse withSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
        return this;
    }

    


    /**
     * 加密镜像所使用的密钥ID。
     * @return systemCmkid
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__system__cmkid")
    public String getSystemCmkid() {
        return systemCmkid;
    }

    public void setSystemCmkid(String systemCmkid) {
        this.systemCmkid = systemCmkid;
    }

    

    public UpdateImageResponse withOsFeatureList(String osFeatureList) {
        this.osFeatureList = osFeatureList;
        return this;
    }

    


    /**
     * 镜像附加属性。该属性采用JSON格式来标识镜像支持的高级特性清单。
     * @return osFeatureList
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__os_feature_list")
    public String getOsFeatureList() {
        return osFeatureList;
    }

    public void setOsFeatureList(String osFeatureList) {
        this.osFeatureList = osFeatureList;
    }

    

    public UpdateImageResponse withAccountCode(String accountCode) {
        this.accountCode = accountCode;
        return this;
    }

    


    /**
     * 收费镜像标识。
     * @return accountCode
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__account_code")
    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    

    public UpdateImageResponse withHwVifMultiqueueEnabled(String hwVifMultiqueueEnabled) {
        this.hwVifMultiqueueEnabled = hwVifMultiqueueEnabled;
        return this;
    }

    


    /**
     * 镜像是否支持网卡多队列。取值为“true”或者“false”。
     * @return hwVifMultiqueueEnabled
     */
    public String getHwVifMultiqueueEnabled() {
        return hwVifMultiqueueEnabled;
    }

    public void setHwVifMultiqueueEnabled(String hwVifMultiqueueEnabled) {
        this.hwVifMultiqueueEnabled = hwVifMultiqueueEnabled;
    }

    

    public UpdateImageResponse withIsOffshelved(String isOffshelved) {
        this.isOffshelved = isOffshelved;
        return this;
    }

    


    /**
     * 表示当前市场镜像是否下架。true：已下架 false：未下架
     * @return isOffshelved
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__is_offshelved")
    public String getIsOffshelved() {
        return isOffshelved;
    }

    public void setIsOffshelved(String isOffshelved) {
        this.isOffshelved = isOffshelved;
    }

    

    public UpdateImageResponse withLazyloading(String lazyloading) {
        this.lazyloading = lazyloading;
        return this;
    }

    


    /**
     * 镜像是否支持延迟加载。取值为“True”或“False”。
     * @return lazyloading
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__lazyloading")
    public String getLazyloading() {
        return lazyloading;
    }

    public void setLazyloading(String lazyloading) {
        this.lazyloading = lazyloading;
    }

    

    public UpdateImageResponse withRootOrigin(String rootOrigin) {
        this.rootOrigin = rootOrigin;
        return this;
    }

    


    /**
     * 表示当前镜像来源是从外部导入。取值：file。
     * @return rootOrigin
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__root_origin")
    public String getRootOrigin() {
        return rootOrigin;
    }

    public void setRootOrigin(String rootOrigin) {
        this.rootOrigin = rootOrigin;
    }

    

    public UpdateImageResponse withSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
        return this;
    }

    


    /**
     * 表示当前镜像对应云服务器的系统盘插槽位置。目前暂时不用
     * @return sequenceNum
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__sequence_num")
    public String getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(String sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    

    public UpdateImageResponse withActiveAt(String activeAt) {
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

    

    public UpdateImageResponse withSupportAgentList(String supportAgentList) {
        this.supportAgentList = supportAgentList;
        return this;
    }

    


    /**
     * 镜像是否支持企业主机安全或主机监控。 hss：企业主机安全 ces：主机监控
     * @return supportAgentList
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__support_agent_list")
    public String getSupportAgentList() {
        return supportAgentList;
    }

    public void setSupportAgentList(String supportAgentList) {
        this.supportAgentList = supportAgentList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateImageResponse updateImageResponse = (UpdateImageResponse) o;
        return Objects.equals(this.backupId, updateImageResponse.backupId) &&
            Objects.equals(this.dataOrigin, updateImageResponse.dataOrigin) &&
            Objects.equals(this.description, updateImageResponse.description) &&
            Objects.equals(this.imageSize, updateImageResponse.imageSize) &&
            Objects.equals(this.imageSourceType, updateImageResponse.imageSourceType) &&
            Objects.equals(this.imagetype, updateImageResponse.imagetype) &&
            Objects.equals(this.isregistered, updateImageResponse.isregistered) &&
            Objects.equals(this.originalimagename, updateImageResponse.originalimagename) &&
            Objects.equals(this.osBit, updateImageResponse.osBit) &&
            Objects.equals(this.osType, updateImageResponse.osType) &&
            Objects.equals(this.osVersion, updateImageResponse.osVersion) &&
            Objects.equals(this.platform, updateImageResponse.platform) &&
            Objects.equals(this.productcode, updateImageResponse.productcode) &&
            Objects.equals(this.supportDiskintensive, updateImageResponse.supportDiskintensive) &&
            Objects.equals(this.supportHighperformance, updateImageResponse.supportHighperformance) &&
            Objects.equals(this.supportKvm, updateImageResponse.supportKvm) &&
            Objects.equals(this.supportKvmGpuType, updateImageResponse.supportKvmGpuType) &&
            Objects.equals(this.supportKvmInfiniband, updateImageResponse.supportKvmInfiniband) &&
            Objects.equals(this.supportLargememory, updateImageResponse.supportLargememory) &&
            Objects.equals(this.supportXen, updateImageResponse.supportXen) &&
            Objects.equals(this.supportXenGpuType, updateImageResponse.supportXenGpuType) &&
            Objects.equals(this.supportXenHana, updateImageResponse.supportXenHana) &&
            Objects.equals(this.systemSupportMarket, updateImageResponse.systemSupportMarket) &&
            Objects.equals(this.checksum, updateImageResponse.checksum) &&
            Objects.equals(this.containerFormat, updateImageResponse.containerFormat) &&
            Objects.equals(this.createdAt, updateImageResponse.createdAt) &&
            Objects.equals(this.diskFormat, updateImageResponse.diskFormat) &&
            Objects.equals(this.enterpriseProjectId, updateImageResponse.enterpriseProjectId) &&
            Objects.equals(this.file, updateImageResponse.file) &&
            Objects.equals(this.id, updateImageResponse.id) &&
            Objects.equals(this.minDisk, updateImageResponse.minDisk) &&
            Objects.equals(this.minRam, updateImageResponse.minRam) &&
            Objects.equals(this.name, updateImageResponse.name) &&
            Objects.equals(this.owner, updateImageResponse.owner) &&
            Objects.equals(this._protected, updateImageResponse._protected) &&
            Objects.equals(this.schema, updateImageResponse.schema) &&
            Objects.equals(this.self, updateImageResponse.self) &&
            Objects.equals(this.size, updateImageResponse.size) &&
            Objects.equals(this.status, updateImageResponse.status) &&
            Objects.equals(this.tags, updateImageResponse.tags) &&
            Objects.equals(this.updatedAt, updateImageResponse.updatedAt) &&
            Objects.equals(this.virtualEnvType, updateImageResponse.virtualEnvType) &&
            Objects.equals(this.virtualSize, updateImageResponse.virtualSize) &&
            Objects.equals(this.visibility, updateImageResponse.visibility) &&
            Objects.equals(this.supportFcInject, updateImageResponse.supportFcInject) &&
            Objects.equals(this.hwFirmwareType, updateImageResponse.hwFirmwareType) &&
            Objects.equals(this.supportArm, updateImageResponse.supportArm) &&
            Objects.equals(this.maxRam, updateImageResponse.maxRam) &&
            Objects.equals(this.systemCmkid, updateImageResponse.systemCmkid) &&
            Objects.equals(this.osFeatureList, updateImageResponse.osFeatureList) &&
            Objects.equals(this.accountCode, updateImageResponse.accountCode) &&
            Objects.equals(this.hwVifMultiqueueEnabled, updateImageResponse.hwVifMultiqueueEnabled) &&
            Objects.equals(this.isOffshelved, updateImageResponse.isOffshelved) &&
            Objects.equals(this.lazyloading, updateImageResponse.lazyloading) &&
            Objects.equals(this.rootOrigin, updateImageResponse.rootOrigin) &&
            Objects.equals(this.sequenceNum, updateImageResponse.sequenceNum) &&
            Objects.equals(this.activeAt, updateImageResponse.activeAt) &&
            Objects.equals(this.supportAgentList, updateImageResponse.supportAgentList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backupId, dataOrigin, description, imageSize, imageSourceType, imagetype, isregistered, originalimagename, osBit, osType, osVersion, platform, productcode, supportDiskintensive, supportHighperformance, supportKvm, supportKvmGpuType, supportKvmInfiniband, supportLargememory, supportXen, supportXenGpuType, supportXenHana, systemSupportMarket, checksum, containerFormat, createdAt, diskFormat, enterpriseProjectId, file, id, minDisk, minRam, name, owner, _protected, schema, self, size, status, tags, updatedAt, virtualEnvType, virtualSize, visibility, supportFcInject, hwFirmwareType, supportArm, maxRam, systemCmkid, osFeatureList, accountCode, hwVifMultiqueueEnabled, isOffshelved, lazyloading, rootOrigin, sequenceNum, activeAt, supportAgentList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateImageResponse {\n");
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
        sb.append("    systemSupportMarket: ").append(toIndentedString(systemSupportMarket)).append("\n");
        sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
        sb.append("    containerFormat: ").append(toIndentedString(containerFormat)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    diskFormat: ").append(toIndentedString(diskFormat)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
        sb.append("    hwFirmwareType: ").append(toIndentedString(hwFirmwareType)).append("\n");
        sb.append("    supportArm: ").append(toIndentedString(supportArm)).append("\n");
        sb.append("    maxRam: ").append(toIndentedString(maxRam)).append("\n");
        sb.append("    systemCmkid: ").append(toIndentedString(systemCmkid)).append("\n");
        sb.append("    osFeatureList: ").append(toIndentedString(osFeatureList)).append("\n");
        sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
        sb.append("    hwVifMultiqueueEnabled: ").append(toIndentedString(hwVifMultiqueueEnabled)).append("\n");
        sb.append("    isOffshelved: ").append(toIndentedString(isOffshelved)).append("\n");
        sb.append("    lazyloading: ").append(toIndentedString(lazyloading)).append("\n");
        sb.append("    rootOrigin: ").append(toIndentedString(rootOrigin)).append("\n");
        sb.append("    sequenceNum: ").append(toIndentedString(sequenceNum)).append("\n");
        sb.append("    activeAt: ").append(toIndentedString(activeAt)).append("\n");
        sb.append("    supportAgentList: ").append(toIndentedString(supportAgentList)).append("\n");
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

