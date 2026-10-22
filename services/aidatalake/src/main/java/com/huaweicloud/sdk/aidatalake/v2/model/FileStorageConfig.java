package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件存储配置
 */
public class FileStorageConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_id")

    private String storageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_name")

    private String storageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_path")

    private String storagePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_path")

    private String mountPath;

    public FileStorageConfig withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * **参数解释**：存储资源ID，可通过[查询存储资源列表](ListV2Storages.xml)获取存储资源ID。 **约束限制**：不涉及。 **取值范围**：长度为1~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return storageId
     */
    public String getStorageId() {
        return storageId;
    }

    public void setStorageId(String storageId) {
        this.storageId = storageId;
    }

    public FileStorageConfig withStorageName(String storageName) {
        this.storageName = storageName;
        return this;
    }

    /**
     * **参数解释**：存储的名称，对应PVC的名称。 **约束限制**：不涉及。 **取值范围**：支持小写字母、数字、中划线的组合，长度为1~63个字符。 **默认取值**：不涉及。
     * @return storageName
     */
    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public FileStorageConfig withStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

    /**
     * **参数解释**：存储上的路径。 **约束限制**：不涉及。 **取值范围**：支持英文字母、数字、斜杠及特殊字符，最小长度为1，最大长度为1024。 **默认取值**：不涉及。
     * @return storagePath
     */
    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public FileStorageConfig withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * **参数解释**：挂载到容器的路径。 **约束限制**：不涉及。 **取值范围**：支持英文字母、数字、斜杠及特殊字符，最小长度为1，最大长度为1024。 **默认取值**：不涉及。
     * @return mountPath
     */
    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FileStorageConfig that = (FileStorageConfig) obj;
        return Objects.equals(this.storageId, that.storageId) && Objects.equals(this.storageName, that.storageName)
            && Objects.equals(this.storagePath, that.storagePath) && Objects.equals(this.mountPath, that.mountPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageId, storageName, storagePath, mountPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileStorageConfig {\n");
        sb.append("    storageId: ").append(toIndentedString(storageId)).append("\n");
        sb.append("    storageName: ").append(toIndentedString(storageName)).append("\n");
        sb.append("    storagePath: ").append(toIndentedString(storagePath)).append("\n");
        sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
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
