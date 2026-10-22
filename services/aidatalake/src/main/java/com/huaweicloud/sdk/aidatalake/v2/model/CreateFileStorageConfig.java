package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：文件存储配置。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class CreateFileStorageConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_id")

    private String storageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_path")

    private String storagePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_path")

    private String mountPath;

    public CreateFileStorageConfig withStorageId(String storageId) {
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

    public CreateFileStorageConfig withStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

    /**
     * **参数解释**：存储上的路径。 **约束限制**：存储支持的格式。 **取值范围**：最小长度为1，最大长度为1024。 **默认取值**：/。
     * @return storagePath
     */
    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public CreateFileStorageConfig withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * **参数解释**：挂载到容器的路径。 **约束限制**：容器本地支持的格式，且不能覆盖系统路径，限制必须挂载在/home/service/下。 **取值范围**：最小长度为1，最大长度为1024。 **默认取值**：/home/service/works。
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
        CreateFileStorageConfig that = (CreateFileStorageConfig) obj;
        return Objects.equals(this.storageId, that.storageId) && Objects.equals(this.storagePath, that.storagePath)
            && Objects.equals(this.mountPath, that.mountPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageId, storagePath, mountPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFileStorageConfig {\n");
        sb.append("    storageId: ").append(toIndentedString(storageId)).append("\n");
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
