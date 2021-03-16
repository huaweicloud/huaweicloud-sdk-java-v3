package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BackupSync
 */
public class BackupSync  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_id")
    
    private String backupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_name")
    
    private String backupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket_name")
    
    private String bucketName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_path")
    
    private String imagePath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private Integer createdAt;

    public BackupSync withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    


    /**
     * 备份副本ID
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    

    public BackupSync withBackupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    


    /**
     * 备份名称
     * @return backupName
     */
    public String getBackupName() {
        return backupName;
    }

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    

    public BackupSync withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    


    /**
     * 桶名
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    

    public BackupSync withImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }

    


    /**
     * 备份链在存储单元上的路径
     * @return imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    

    public BackupSync withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 备份对象ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    public BackupSync withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * 备份对象名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    

    public BackupSync withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 备份对象资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    

    public BackupSync withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 备份时间戳，例如1548898428
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupSync backupSync = (BackupSync) o;
        return Objects.equals(this.backupId, backupSync.backupId) &&
            Objects.equals(this.backupName, backupSync.backupName) &&
            Objects.equals(this.bucketName, backupSync.bucketName) &&
            Objects.equals(this.imagePath, backupSync.imagePath) &&
            Objects.equals(this.resourceId, backupSync.resourceId) &&
            Objects.equals(this.resourceName, backupSync.resourceName) &&
            Objects.equals(this.resourceType, backupSync.resourceType) &&
            Objects.equals(this.createdAt, backupSync.createdAt);
    }
    @Override
    public int hashCode() {
        return Objects.hash(backupId, backupName, bucketName, imagePath, resourceId, resourceName, resourceType, createdAt);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupSync {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    backupName: ").append(toIndentedString(backupName)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

