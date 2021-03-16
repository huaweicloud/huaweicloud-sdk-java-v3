package com.huaweicloud.sdk.ims.v2.model;




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
public class ListTagsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Integer page;
    /**
     * Gets or Sets imagetype
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;
    /**
     * Gets or Sets status
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
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_disk")
    
    private Integer minDisk;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__platform")
    
    private String platform;
    /**
     * Gets or Sets osType
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
    /**
     * Gets or Sets memberStatus
     */
    public static final class MemberStatusEnum {

        
        /**
         * Enum ACCEPTED for value: "accepted"
         */
        public static final MemberStatusEnum ACCEPTED = new MemberStatusEnum("accepted");
        
        /**
         * Enum REJECTED for value: "rejected"
         */
        public static final MemberStatusEnum REJECTED = new MemberStatusEnum("rejected");
        
        /**
         * Enum PENDING for value: "pending"
         */
        public static final MemberStatusEnum PENDING = new MemberStatusEnum("pending");
        

        private static final Map<String, MemberStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MemberStatusEnum> createStaticFields() {
            Map<String, MemberStatusEnum> map = new HashMap<>();
            map.put("accepted", ACCEPTED);
            map.put("rejected", REJECTED);
            map.put("pending", PENDING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MemberStatusEnum(String value) {
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
        public static MemberStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            MemberStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MemberStatusEnum(value);
            }
            return result;
        }

        public static MemberStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            MemberStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof MemberStatusEnum) {
                return this.value.equals(((MemberStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_status")
    
    private MemberStatusEnum memberStatus;
    /**
     * Gets or Sets virtualEnvType
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
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;
    /**
     * Gets or Sets architecture
     */
    public static final class ArchitectureEnum {

        
        /**
         * Enum X86 for value: "x86"
         */
        public static final ArchitectureEnum X86 = new ArchitectureEnum("x86");
        
        /**
         * Enum ARM for value: "arm"
         */
        public static final ArchitectureEnum ARM = new ArchitectureEnum("arm");
        

        private static final Map<String, ArchitectureEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchitectureEnum> createStaticFields() {
            Map<String, ArchitectureEnum> map = new HashMap<>();
            map.put("x86", X86);
            map.put("arm", ARM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchitectureEnum(String value) {
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
        public static ArchitectureEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ArchitectureEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ArchitectureEnum(value);
            }
            return result;
        }

        public static ArchitectureEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ArchitectureEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ArchitectureEnum) {
                return this.value.equals(((ArchitectureEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="architecture")
    
    private ArchitectureEnum architecture;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;

    public ListTagsRequest withLimit(Integer limit) {
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

    

    public ListTagsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * Get page
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    

    public ListTagsRequest withImagetype(ImagetypeEnum imagetype) {
        this.imagetype = imagetype;
        return this;
    }

    


    /**
     * Get imagetype
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

    

    public ListTagsRequest withId(String id) {
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

    

    public ListTagsRequest withStatus(StatusEnum status) {
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

    

    public ListTagsRequest withName(String name) {
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

    

    public ListTagsRequest withMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
        return this;
    }

    


    /**
     * Get minDisk
     * @return minDisk
     */
    public Integer getMinDisk() {
        return minDisk;
    }

    public void setMinDisk(Integer minDisk) {
        this.minDisk = minDisk;
    }

    

    public ListTagsRequest withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    


    /**
     * Get platform
     * @return platform
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="__platform")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    

    public ListTagsRequest withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * Get osType
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

    

    public ListTagsRequest withMemberStatus(MemberStatusEnum memberStatus) {
        this.memberStatus = memberStatus;
        return this;
    }

    


    /**
     * Get memberStatus
     * @return memberStatus
     */
    public MemberStatusEnum getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(MemberStatusEnum memberStatus) {
        this.memberStatus = memberStatus;
    }

    

    public ListTagsRequest withVirtualEnvType(VirtualEnvTypeEnum virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
        return this;
    }

    


    /**
     * Get virtualEnvType
     * @return virtualEnvType
     */
    public VirtualEnvTypeEnum getVirtualEnvType() {
        return virtualEnvType;
    }

    public void setVirtualEnvType(VirtualEnvTypeEnum virtualEnvType) {
        this.virtualEnvType = virtualEnvType;
    }

    

    public ListTagsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * Get enterpriseProjectId
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ListTagsRequest withArchitecture(ArchitectureEnum architecture) {
        this.architecture = architecture;
        return this;
    }

    


    /**
     * Get architecture
     * @return architecture
     */
    public ArchitectureEnum getArchitecture() {
        return architecture;
    }

    public void setArchitecture(ArchitectureEnum architecture) {
        this.architecture = architecture;
    }

    

    public ListTagsRequest withCreatedAt(String createdAt) {
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

    

    public ListTagsRequest withUpdatedAt(String updatedAt) {
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
        ListTagsRequest listTagsRequest = (ListTagsRequest) o;
        return Objects.equals(this.limit, listTagsRequest.limit) &&
            Objects.equals(this.page, listTagsRequest.page) &&
            Objects.equals(this.imagetype, listTagsRequest.imagetype) &&
            Objects.equals(this.id, listTagsRequest.id) &&
            Objects.equals(this.status, listTagsRequest.status) &&
            Objects.equals(this.name, listTagsRequest.name) &&
            Objects.equals(this.minDisk, listTagsRequest.minDisk) &&
            Objects.equals(this.platform, listTagsRequest.platform) &&
            Objects.equals(this.osType, listTagsRequest.osType) &&
            Objects.equals(this.memberStatus, listTagsRequest.memberStatus) &&
            Objects.equals(this.virtualEnvType, listTagsRequest.virtualEnvType) &&
            Objects.equals(this.enterpriseProjectId, listTagsRequest.enterpriseProjectId) &&
            Objects.equals(this.architecture, listTagsRequest.architecture) &&
            Objects.equals(this.createdAt, listTagsRequest.createdAt) &&
            Objects.equals(this.updatedAt, listTagsRequest.updatedAt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, page, imagetype, id, status, name, minDisk, platform, osType, memberStatus, virtualEnvType, enterpriseProjectId, architecture, createdAt, updatedAt);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    imagetype: ").append(toIndentedString(imagetype)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    minDisk: ").append(toIndentedString(minDisk)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    memberStatus: ").append(toIndentedString(memberStatus)).append("\n");
        sb.append("    virtualEnvType: ").append(toIndentedString(virtualEnvType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
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

