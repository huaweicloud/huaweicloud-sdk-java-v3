package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据归档请求参数
 */
public class CreateBackupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_paths")

    private List<String> subPaths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_type")

    private StorageType storageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_archived_data")

    private Boolean deleteArchivedData;

    public CreateBackupReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 归档描述，最大长度为1000
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateBackupReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 归档名称,最大长度为100
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateBackupReq withSubPaths(List<String> subPaths) {
        this.subPaths = subPaths;
        return this;
    }

    public CreateBackupReq addSubPathsItem(String subPathsItem) {
        if (this.subPaths == null) {
            this.subPaths = new ArrayList<>();
        }
        this.subPaths.add(subPathsItem);
        return this;
    }

    public CreateBackupReq withSubPaths(Consumer<List<String>> subPathsSetter) {
        if (this.subPaths == null) {
            this.subPaths = new ArrayList<>();
        }
        subPathsSetter.accept(this.subPaths);
        return this;
    }

    /**
     * 归档路径集
     * @return subPaths
     */
    public List<String> getSubPaths() {
        return subPaths;
    }

    public void setSubPaths(List<String> subPaths) {
        this.subPaths = subPaths;
    }

    public CreateBackupReq withStorageType(StorageType storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * Get storageType
     * @return storageType
     */
    public StorageType getStorageType() {
        return storageType;
    }

    public void setStorageType(StorageType storageType) {
        this.storageType = storageType;
    }

    public CreateBackupReq withDeleteArchivedData(Boolean deleteArchivedData) {
        this.deleteArchivedData = deleteArchivedData;
        return this;
    }

    /**
     * 是否删除已归档数据
     * @return deleteArchivedData
     */
    public Boolean getDeleteArchivedData() {
        return deleteArchivedData;
    }

    public void setDeleteArchivedData(Boolean deleteArchivedData) {
        this.deleteArchivedData = deleteArchivedData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateBackupReq createBackupReq = (CreateBackupReq) o;
        return Objects.equals(this.description, createBackupReq.description)
            && Objects.equals(this.name, createBackupReq.name)
            && Objects.equals(this.subPaths, createBackupReq.subPaths)
            && Objects.equals(this.storageType, createBackupReq.storageType)
            && Objects.equals(this.deleteArchivedData, createBackupReq.deleteArchivedData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, subPaths, storageType, deleteArchivedData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBackupReq {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subPaths: ").append(toIndentedString(subPaths)).append("\n");
        sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
        sb.append("    deleteArchivedData: ").append(toIndentedString(deleteArchivedData)).append("\n");
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
