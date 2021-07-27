package com.huaweicloud.sdk.cbr.v1.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.BackupExtendInfo;
import com.huaweicloud.sdk.cbr.v1.model.ReplicationRecordGet;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BackupResp
 */
public class BackupResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="checkpoint_id")
    
    private String checkpointId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private OffsetDateTime createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expired_at")
    
    private OffsetDateTime expiredAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extend_info")
    
    private BackupExtendInfo extendInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;
    /**
     * 备份类型
     */
    public static final class ImageTypeEnum {

        
        /**
         * Enum BACKUP for value: "backup"
         */
        public static final ImageTypeEnum BACKUP = new ImageTypeEnum("backup");
        
        /**
         * Enum REPLICATION for value: "replication"
         */
        public static final ImageTypeEnum REPLICATION = new ImageTypeEnum("replication");
        

        private static final Map<String, ImageTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImageTypeEnum> createStaticFields() {
            Map<String, ImageTypeEnum> map = new HashMap<>();
            map.put("backup", BACKUP);
            map.put("replication", REPLICATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImageTypeEnum(String value) {
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
        public static ImageTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ImageTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ImageTypeEnum(value);
            }
            return result;
        }

        public static ImageTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ImageTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImageTypeEnum) {
                return this.value.equals(((ImageTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_type")
    
    private ImageTypeEnum imageType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_id")
    
    private String parentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protected_at")
    
    private LocalDate protectedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_az")
    
    private String resourceAz;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_size")
    
    private Integer resourceSize;
    /**
     * 资源类型
     */
    public static final class ResourceTypeEnum {

        
        /**
         * Enum OS_NOVA_SERVER for value: "OS::Nova::Server"
         */
        public static final ResourceTypeEnum OS_NOVA_SERVER = new ResourceTypeEnum("OS::Nova::Server");
        
        /**
         * Enum OS_CINDER_VOLUME for value: "OS::Cinder::Volume"
         */
        public static final ResourceTypeEnum OS_CINDER_VOLUME = new ResourceTypeEnum("OS::Cinder::Volume");
        

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("OS::Nova::Server", OS_NOVA_SERVER);
            map.put("OS::Cinder::Volume", OS_CINDER_VOLUME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private ResourceTypeEnum resourceType;
    /**
     * 备份状态
     */
    public static final class StatusEnum {

        
        /**
         * Enum AVAILABLE for value: "available"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("available");
        
        /**
         * Enum PROTECTING for value: "protecting"
         */
        public static final StatusEnum PROTECTING = new StatusEnum("protecting");
        
        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("deleting");
        
        /**
         * Enum RESTORING for value: "restoring"
         */
        public static final StatusEnum RESTORING = new StatusEnum("restoring");
        
        /**
         * Enum ERROR for value: "error"
         */
        public static final StatusEnum ERROR = new StatusEnum("error");
        
        /**
         * Enum WAITING_PROTECT for value: "waiting_protect"
         */
        public static final StatusEnum WAITING_PROTECT = new StatusEnum("waiting_protect");
        
        /**
         * Enum WAITING_DELETE for value: "waiting_delete"
         */
        public static final StatusEnum WAITING_DELETE = new StatusEnum("waiting_delete");
        
        /**
         * Enum WAITING_RESTORE for value: "waiting_restore"
         */
        public static final StatusEnum WAITING_RESTORE = new StatusEnum("waiting_restore");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("available", AVAILABLE);
            map.put("protecting", PROTECTING);
            map.put("deleting", DELETING);
            map.put("restoring", RESTORING);
            map.put("error", ERROR);
            map.put("waiting_protect", WAITING_PROTECT);
            map.put("waiting_delete", WAITING_DELETE);
            map.put("waiting_restore", WAITING_RESTORE);
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
    @JsonProperty(value="updated_at")
    
    private OffsetDateTime updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vault_id")
    
    private String vaultId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication_records")
    
    private List<ReplicationRecordGet> replicationRecords = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public BackupResp withCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
        return this;
    }

    


    /**
     * 还原点ID
     * @return checkpointId
     */
    public String getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(String checkpointId) {
        this.checkpointId = checkpointId;
    }

    

    public BackupResp withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 创建时间，例如:\"2020-02-05T10:38:34.209782\"
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    

    public BackupResp withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 备份描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public BackupResp withExpiredAt(OffsetDateTime expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    


    /**
     * 过期时间，例如:\"2020-02-05T10:38:34.209782\"
     * @return expiredAt
     */
    public OffsetDateTime getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(OffsetDateTime expiredAt) {
        this.expiredAt = expiredAt;
    }

    

    public BackupResp withExtendInfo(BackupExtendInfo extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }

    public BackupResp withExtendInfo(Consumer<BackupExtendInfo> extendInfoSetter) {
        if(this.extendInfo == null ){
            this.extendInfo = new BackupExtendInfo();
            extendInfoSetter.accept(this.extendInfo);
        }
        
        return this;
    }


    /**
     * Get extendInfo
     * @return extendInfo
     */
    public BackupExtendInfo getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(BackupExtendInfo extendInfo) {
        this.extendInfo = extendInfo;
    }

    

    public BackupResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 备份ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public BackupResp withImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
        return this;
    }

    


    /**
     * 备份类型
     * @return imageType
     */
    public ImageTypeEnum getImageType() {
        return imageType;
    }

    public void setImageType(ImageTypeEnum imageType) {
        this.imageType = imageType;
    }

    

    public BackupResp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 备份名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public BackupResp withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    


    /**
     * 父备份ID
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    

    public BackupResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public BackupResp withProtectedAt(LocalDate protectedAt) {
        this.protectedAt = protectedAt;
        return this;
    }

    


    /**
     * 备份时间
     * @return protectedAt
     */
    public LocalDate getProtectedAt() {
        return protectedAt;
    }

    public void setProtectedAt(LocalDate protectedAt) {
        this.protectedAt = protectedAt;
    }

    

    public BackupResp withResourceAz(String resourceAz) {
        this.resourceAz = resourceAz;
        return this;
    }

    


    /**
     * 资源可用区
     * @return resourceAz
     */
    public String getResourceAz() {
        return resourceAz;
    }

    public void setResourceAz(String resourceAz) {
        this.resourceAz = resourceAz;
    }

    

    public BackupResp withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    public BackupResp withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    

    public BackupResp withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    


    /**
     * 资源大小，单位为GB
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    

    public BackupResp withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 资源类型
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    

    public BackupResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 备份状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public BackupResp withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 更新时间，例如:\"2020-02-05T10:38:34.209782\"
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    

    public BackupResp withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    


    /**
     * 存储库ID
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    

    public BackupResp withReplicationRecords(List<ReplicationRecordGet> replicationRecords) {
        this.replicationRecords = replicationRecords;
        return this;
    }

    
    public BackupResp addReplicationRecordsItem(ReplicationRecordGet replicationRecordsItem) {
        if(this.replicationRecords == null) {
            this.replicationRecords = new ArrayList<>();
        }
        this.replicationRecords.add(replicationRecordsItem);
        return this;
    }

    public BackupResp withReplicationRecords(Consumer<List<ReplicationRecordGet>> replicationRecordsSetter) {
        if(this.replicationRecords == null) {
            this.replicationRecords = new ArrayList<>();
        }
        replicationRecordsSetter.accept(this.replicationRecords);
        return this;
    }

    /**
     * 复制记录
     * @return replicationRecords
     */
    public List<ReplicationRecordGet> getReplicationRecords() {
        return replicationRecords;
    }

    public void setReplicationRecords(List<ReplicationRecordGet> replicationRecords) {
        this.replicationRecords = replicationRecords;
    }

    

    public BackupResp withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目id,默认为‘0’。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupResp backupResp = (BackupResp) o;
        return Objects.equals(this.checkpointId, backupResp.checkpointId) &&
            Objects.equals(this.createdAt, backupResp.createdAt) &&
            Objects.equals(this.description, backupResp.description) &&
            Objects.equals(this.expiredAt, backupResp.expiredAt) &&
            Objects.equals(this.extendInfo, backupResp.extendInfo) &&
            Objects.equals(this.id, backupResp.id) &&
            Objects.equals(this.imageType, backupResp.imageType) &&
            Objects.equals(this.name, backupResp.name) &&
            Objects.equals(this.parentId, backupResp.parentId) &&
            Objects.equals(this.projectId, backupResp.projectId) &&
            Objects.equals(this.protectedAt, backupResp.protectedAt) &&
            Objects.equals(this.resourceAz, backupResp.resourceAz) &&
            Objects.equals(this.resourceId, backupResp.resourceId) &&
            Objects.equals(this.resourceName, backupResp.resourceName) &&
            Objects.equals(this.resourceSize, backupResp.resourceSize) &&
            Objects.equals(this.resourceType, backupResp.resourceType) &&
            Objects.equals(this.status, backupResp.status) &&
            Objects.equals(this.updatedAt, backupResp.updatedAt) &&
            Objects.equals(this.vaultId, backupResp.vaultId) &&
            Objects.equals(this.replicationRecords, backupResp.replicationRecords) &&
            Objects.equals(this.enterpriseProjectId, backupResp.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(checkpointId, createdAt, description, expiredAt, extendInfo, id, imageType, name, parentId, projectId, protectedAt, resourceAz, resourceId, resourceName, resourceSize, resourceType, status, updatedAt, vaultId, replicationRecords, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupResp {\n");
        sb.append("    checkpointId: ").append(toIndentedString(checkpointId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
        sb.append("    extendInfo: ").append(toIndentedString(extendInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    protectedAt: ").append(toIndentedString(protectedAt)).append("\n");
        sb.append("    resourceAz: ").append(toIndentedString(resourceAz)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
        sb.append("    replicationRecords: ").append(toIndentedString(replicationRecords)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

