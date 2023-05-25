package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StorageUsage
 */
public class StorageUsage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_count")

    private Integer backupCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_size")

    private Integer backupSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_size_multiaz")

    private Integer backupSizeMultiaz;

    public StorageUsage withBackupCount(Integer backupCount) {
        this.backupCount = backupCount;
        return this;
    }

    /**
     * 备份数量
     * @return backupCount
     */
    public Integer getBackupCount() {
        return backupCount;
    }

    public void setBackupCount(Integer backupCount) {
        this.backupCount = backupCount;
    }

    public StorageUsage withBackupSize(Integer backupSize) {
        this.backupSize = backupSize;
        return this;
    }

    /**
     * 备份容量
     * @return backupSize
     */
    public Integer getBackupSize() {
        return backupSize;
    }

    public void setBackupSize(Integer backupSize) {
        this.backupSize = backupSize;
    }

    public StorageUsage withResourceId(String resourceId) {
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

    public StorageUsage withResourceName(String resourceName) {
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

    public StorageUsage withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public StorageUsage withBackupSizeMultiaz(Integer backupSizeMultiaz) {
        this.backupSizeMultiaz = backupSizeMultiaz;
        return this;
    }

    /**
     * 多AZ备份大小
     * @return backupSizeMultiaz
     */
    public Integer getBackupSizeMultiaz() {
        return backupSizeMultiaz;
    }

    public void setBackupSizeMultiaz(Integer backupSizeMultiaz) {
        this.backupSizeMultiaz = backupSizeMultiaz;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageUsage storageUsage = (StorageUsage) o;
        return Objects.equals(this.backupCount, storageUsage.backupCount)
            && Objects.equals(this.backupSize, storageUsage.backupSize)
            && Objects.equals(this.resourceId, storageUsage.resourceId)
            && Objects.equals(this.resourceName, storageUsage.resourceName)
            && Objects.equals(this.resourceType, storageUsage.resourceType)
            && Objects.equals(this.backupSizeMultiaz, storageUsage.backupSizeMultiaz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupCount, backupSize, resourceId, resourceName, resourceType, backupSizeMultiaz);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageUsage {\n");
        sb.append("    backupCount: ").append(toIndentedString(backupCount)).append("\n");
        sb.append("    backupSize: ").append(toIndentedString(backupSize)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    backupSizeMultiaz: ").append(toIndentedString(backupSizeMultiaz)).append("\n");
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
