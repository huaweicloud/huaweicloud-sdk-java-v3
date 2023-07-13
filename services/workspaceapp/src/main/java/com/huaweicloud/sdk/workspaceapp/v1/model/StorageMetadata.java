package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 存储定义
 */
public class StorageMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_handle")

    private String storageHandle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_class")

    private String storageClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_location")

    private String exportLocation;

    public StorageMetadata withStorageHandle(String storageHandle) {
        this.storageHandle = storageHandle;
        return this;
    }

    /**
     * SFS文件系统名称
     * @return storageHandle
     */
    public String getStorageHandle() {
        return storageHandle;
    }

    public void setStorageHandle(String storageHandle) {
        this.storageHandle = storageHandle;
    }

    public StorageMetadata withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * 存储类型 * `sfs` - sfs3.0存储
     * @return storageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    public StorageMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StorageMetadata withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 所在区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public StorageMetadata withExportLocation(String exportLocation) {
        this.exportLocation = exportLocation;
        return this;
    }

    /**
     * 访问地址:protocol://[bucket-name].sfs3.[region-name].myhuaweicloud.com:port
     * @return exportLocation
     */
    public String getExportLocation() {
        return exportLocation;
    }

    public void setExportLocation(String exportLocation) {
        this.exportLocation = exportLocation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorageMetadata that = (StorageMetadata) obj;
        return Objects.equals(this.storageHandle, that.storageHandle)
            && Objects.equals(this.storageClass, that.storageClass) && Objects.equals(this.name, that.name)
            && Objects.equals(this.region, that.region) && Objects.equals(this.exportLocation, that.exportLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageHandle, storageClass, name, region, exportLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageMetadata {\n");
        sb.append("    storageHandle: ").append(toIndentedString(storageHandle)).append("\n");
        sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    exportLocation: ").append(toIndentedString(exportLocation)).append("\n");
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
