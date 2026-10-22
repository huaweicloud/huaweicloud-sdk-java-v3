package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DeleteV2TenantImageSnapshotResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_snapshot_id")

    private String imageSnapshotId;

    public DeleteV2TenantImageSnapshotResponse withImageSnapshotId(String imageSnapshotId) {
        this.imageSnapshotId = imageSnapshotId;
        return this;
    }

    /**
     * **参数解释**：被删除的镜像快照ID。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 
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
        DeleteV2TenantImageSnapshotResponse that = (DeleteV2TenantImageSnapshotResponse) obj;
        return Objects.equals(this.imageSnapshotId, that.imageSnapshotId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageSnapshotId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteV2TenantImageSnapshotResponse {\n");
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
