package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 存储定义元数据
 */
public class Storage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_handle")

    private String storageHandle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_class")

    private String storageClass;

    public Storage withStorageHandle(String storageHandle) {
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

    public Storage withStorageClass(String storageClass) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Storage that = (Storage) obj;
        return Objects.equals(this.storageHandle, that.storageHandle)
            && Objects.equals(this.storageClass, that.storageClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageHandle, storageClass);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Storage {\n");
        sb.append("    storageHandle: ").append(toIndentedString(storageHandle)).append("\n");
        sb.append("    storageClass: ").append(toIndentedString(storageClass)).append("\n");
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
