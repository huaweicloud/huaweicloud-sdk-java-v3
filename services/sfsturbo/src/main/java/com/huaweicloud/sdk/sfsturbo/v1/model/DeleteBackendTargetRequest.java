package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteBackendTargetRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_id")

    private String shareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_data_in_file_system")

    private Boolean deleteDataInFileSystem;

    public DeleteBackendTargetRequest withShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }

    /**
     * 文件系统id
     * @return shareId
     */
    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public DeleteBackendTargetRequest withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 数据存储库 id
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public DeleteBackendTargetRequest withDeleteDataInFileSystem(Boolean deleteDataInFileSystem) {
        this.deleteDataInFileSystem = deleteDataInFileSystem;
        return this;
    }

    /**
     * 删除后端存储库时是否删除文件系统对应目录文件，默认为 false
     * @return deleteDataInFileSystem
     */
    public Boolean getDeleteDataInFileSystem() {
        return deleteDataInFileSystem;
    }

    public void setDeleteDataInFileSystem(Boolean deleteDataInFileSystem) {
        this.deleteDataInFileSystem = deleteDataInFileSystem;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteBackendTargetRequest that = (DeleteBackendTargetRequest) obj;
        return Objects.equals(this.shareId, that.shareId) && Objects.equals(this.targetId, that.targetId)
            && Objects.equals(this.deleteDataInFileSystem, that.deleteDataInFileSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareId, targetId, deleteDataInFileSystem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBackendTargetRequest {\n");
        sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    deleteDataInFileSystem: ").append(toIndentedString(deleteDataInFileSystem)).append("\n");
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
