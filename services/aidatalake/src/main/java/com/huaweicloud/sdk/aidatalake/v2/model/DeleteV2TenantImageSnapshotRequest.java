package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteV2TenantImageSnapshotRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_snapshot_id")

    private String imageSnapshotId;

    public DeleteV2TenantImageSnapshotRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：镜像ID。可通过[查询自定义镜像列表]获取镜像ID(ListV2TenantImages.xml)。 **约束限制**：不涉及。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public DeleteV2TenantImageSnapshotRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * **参数解释**：镜像版本ID。可通过[查询自定义镜像版本列表](ListV2TenantImageVersions.xml)获取镜像版本ID。 **约束限制**：不涉及。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public DeleteV2TenantImageSnapshotRequest withImageSnapshotId(String imageSnapshotId) {
        this.imageSnapshotId = imageSnapshotId;
        return this;
    }

    /**
     * **参数解释**：镜像快照ID。可通过[查询镜像快照列表]获取镜像ID(ListV2TenantImageSnapshots.xml)。 **约束限制**：不涉及。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return imageSnapshotId
     */
    public String getImageSnapshotId() {
        return imageSnapshotId;
    }

    public void setImageSnapshotId(String imageSnapshotId) {
        this.imageSnapshotId = imageSnapshotId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteV2TenantImageSnapshotRequest that = (DeleteV2TenantImageSnapshotRequest) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.imageSnapshotId, that.imageSnapshotId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, versionId, imageSnapshotId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteV2TenantImageSnapshotRequest {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    imageSnapshotId: ").append(toIndentedString(imageSnapshotId)).append("\n");
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
