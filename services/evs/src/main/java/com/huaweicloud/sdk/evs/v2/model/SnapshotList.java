package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 查询快照列表响应结果中的snapshots字段。
 */
public class SnapshotList  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private Map<String, String> metadata = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_id")
    
    private String volumeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private String size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-extended-snapshot-attributes:project_id")
    
    private String osExtendedSnapshotAttributesProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-extended-snapshot-attributes:progress")
    
    private String osExtendedSnapshotAttributesProgress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_storage_id")
    
    private String dedicatedStorageId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_storage_name")
    
    private String dedicatedStorageName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type")
    
    private String serviceType;

    public SnapshotList withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 云硬盘快照ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SnapshotList withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 云硬盘快照的状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SnapshotList withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 云硬盘快照名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SnapshotList withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 云硬盘快照描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SnapshotList withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 云硬盘快照创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public SnapshotList withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 云硬盘快照更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SnapshotList withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    

    public SnapshotList putMetadataItem(String key, String metadataItem) {
         if (this.metadata == null) {
            this.metadata = new HashMap<>();
         }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public SnapshotList withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }
    /**
     * 云硬盘快照的元数据信息
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public SnapshotList withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    


    /**
     * 快照所属的云硬盘。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public SnapshotList withSize(String size) {
        this.size = size;
        return this;
    }

    


    /**
     * 云硬盘快照大小
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public SnapshotList withOsExtendedSnapshotAttributesProjectId(String osExtendedSnapshotAttributesProjectId) {
        this.osExtendedSnapshotAttributesProjectId = osExtendedSnapshotAttributesProjectId;
        return this;
    }

    


    /**
     * 租户ID
     * @return osExtendedSnapshotAttributesProjectId
     */
    public String getOsExtendedSnapshotAttributesProjectId() {
        return osExtendedSnapshotAttributesProjectId;
    }

    public void setOsExtendedSnapshotAttributesProjectId(String osExtendedSnapshotAttributesProjectId) {
        this.osExtendedSnapshotAttributesProjectId = osExtendedSnapshotAttributesProjectId;
    }

    public SnapshotList withOsExtendedSnapshotAttributesProgress(String osExtendedSnapshotAttributesProgress) {
        this.osExtendedSnapshotAttributesProgress = osExtendedSnapshotAttributesProgress;
        return this;
    }

    


    /**
     * 快照进度
     * @return osExtendedSnapshotAttributesProgress
     */
    public String getOsExtendedSnapshotAttributesProgress() {
        return osExtendedSnapshotAttributesProgress;
    }

    public void setOsExtendedSnapshotAttributesProgress(String osExtendedSnapshotAttributesProgress) {
        this.osExtendedSnapshotAttributesProgress = osExtendedSnapshotAttributesProgress;
    }

    public SnapshotList withDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
        return this;
    }

    


    /**
     * 专属存储ID
     * @return dedicatedStorageId
     */
    public String getDedicatedStorageId() {
        return dedicatedStorageId;
    }

    public void setDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
    }

    public SnapshotList withDedicatedStorageName(String dedicatedStorageName) {
        this.dedicatedStorageName = dedicatedStorageName;
        return this;
    }

    


    /**
     * 专属存储的名称
     * @return dedicatedStorageName
     */
    public String getDedicatedStorageName() {
        return dedicatedStorageName;
    }

    public void setDedicatedStorageName(String dedicatedStorageName) {
        this.dedicatedStorageName = dedicatedStorageName;
    }

    public SnapshotList withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    


    /**
     * 服务类型
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotList snapshotList = (SnapshotList) o;
        return Objects.equals(this.id, snapshotList.id) &&
            Objects.equals(this.status, snapshotList.status) &&
            Objects.equals(this.name, snapshotList.name) &&
            Objects.equals(this.description, snapshotList.description) &&
            Objects.equals(this.createdAt, snapshotList.createdAt) &&
            Objects.equals(this.updatedAt, snapshotList.updatedAt) &&
            Objects.equals(this.metadata, snapshotList.metadata) &&
            Objects.equals(this.volumeId, snapshotList.volumeId) &&
            Objects.equals(this.size, snapshotList.size) &&
            Objects.equals(this.osExtendedSnapshotAttributesProjectId, snapshotList.osExtendedSnapshotAttributesProjectId) &&
            Objects.equals(this.osExtendedSnapshotAttributesProgress, snapshotList.osExtendedSnapshotAttributesProgress) &&
            Objects.equals(this.dedicatedStorageId, snapshotList.dedicatedStorageId) &&
            Objects.equals(this.dedicatedStorageName, snapshotList.dedicatedStorageName) &&
            Objects.equals(this.serviceType, snapshotList.serviceType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, status, name, description, createdAt, updatedAt, metadata, volumeId, size, osExtendedSnapshotAttributesProjectId, osExtendedSnapshotAttributesProgress, dedicatedStorageId, dedicatedStorageName, serviceType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotList {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
            sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    osExtendedSnapshotAttributesProjectId: ").append(toIndentedString(osExtendedSnapshotAttributesProjectId)).append("\n");
            sb.append("    osExtendedSnapshotAttributesProgress: ").append(toIndentedString(osExtendedSnapshotAttributesProgress)).append("\n");
            sb.append("    dedicatedStorageId: ").append(toIndentedString(dedicatedStorageId)).append("\n");
            sb.append("    dedicatedStorageName: ").append(toIndentedString(dedicatedStorageName)).append("\n");
            sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
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

