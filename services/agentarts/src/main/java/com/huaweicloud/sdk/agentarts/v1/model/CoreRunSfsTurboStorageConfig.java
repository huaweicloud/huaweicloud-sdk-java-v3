package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * **参数解释**: SFS Turbo挂载配置。
 */
public class CoreRunSfsTurboStorageConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sfs_turbo_id")

    private UUID sfsTurboId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sfs_path")

    private String sfsPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mount_path")

    private String mountPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only")

    private Boolean readOnly;

    public CoreRunSfsTurboStorageConfig withSfsTurboId(UUID sfsTurboId) {
        this.sfsTurboId = sfsTurboId;
        return this;
    }

    /**
     * **参数解释**: SFS Turbo实例ID。
     * @return sfsTurboId
     */
    public UUID getSfsTurboId() {
        return sfsTurboId;
    }

    public void setSfsTurboId(UUID sfsTurboId) {
        this.sfsTurboId = sfsTurboId;
    }

    public CoreRunSfsTurboStorageConfig withSfsPath(String sfsPath) {
        this.sfsPath = sfsPath;
        return this;
    }

    /**
     * **参数解释**: SFS Turbo存储的目录路径。
     * @return sfsPath
     */
    public String getSfsPath() {
        return sfsPath;
    }

    public void setSfsPath(String sfsPath) {
        this.sfsPath = sfsPath;
    }

    public CoreRunSfsTurboStorageConfig withMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    /**
     * **参数解释**: 挂载到运行时的目录路径。
     * @return mountPath
     */
    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    public CoreRunSfsTurboStorageConfig withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * **参数解释**: 是否以只读方式挂载。
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunSfsTurboStorageConfig that = (CoreRunSfsTurboStorageConfig) obj;
        return Objects.equals(this.sfsTurboId, that.sfsTurboId) && Objects.equals(this.sfsPath, that.sfsPath)
            && Objects.equals(this.mountPath, that.mountPath) && Objects.equals(this.readOnly, that.readOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sfsTurboId, sfsPath, mountPath, readOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunSfsTurboStorageConfig {\n");
        sb.append("    sfsTurboId: ").append(toIndentedString(sfsTurboId)).append("\n");
        sb.append("    sfsPath: ").append(toIndentedString(sfsPath)).append("\n");
        sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
