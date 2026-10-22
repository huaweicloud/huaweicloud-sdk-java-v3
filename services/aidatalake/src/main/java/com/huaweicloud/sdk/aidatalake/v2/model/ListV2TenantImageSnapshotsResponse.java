package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListV2TenantImageSnapshotsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_snapshots")

    private List<V2ImageSnapshotInfo> imageSnapshots = null;

    public ListV2TenantImageSnapshotsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：快照总数。 **约束限制**：不涉及。 **取值范围**：0~10000。 **默认取值**：不涉及。 
     * minimum: 0
     * maximum: 10000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListV2TenantImageSnapshotsResponse withImageSnapshots(List<V2ImageSnapshotInfo> imageSnapshots) {
        this.imageSnapshots = imageSnapshots;
        return this;
    }

    public ListV2TenantImageSnapshotsResponse addImageSnapshotsItem(V2ImageSnapshotInfo imageSnapshotsItem) {
        if (this.imageSnapshots == null) {
            this.imageSnapshots = new ArrayList<>();
        }
        this.imageSnapshots.add(imageSnapshotsItem);
        return this;
    }

    public ListV2TenantImageSnapshotsResponse withImageSnapshots(
        Consumer<List<V2ImageSnapshotInfo>> imageSnapshotsSetter) {
        if (this.imageSnapshots == null) {
            this.imageSnapshots = new ArrayList<>();
        }
        imageSnapshotsSetter.accept(this.imageSnapshots);
        return this;
    }

    /**
     * **参数解释**：镜像快照列表。 
     * @return imageSnapshots
     */
    public List<V2ImageSnapshotInfo> getImageSnapshots() {
        return imageSnapshots;
    }

    public void setImageSnapshots(List<V2ImageSnapshotInfo> imageSnapshots) {
        this.imageSnapshots = imageSnapshots;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2TenantImageSnapshotsResponse that = (ListV2TenantImageSnapshotsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.imageSnapshots, that.imageSnapshots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, imageSnapshots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2TenantImageSnapshotsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    imageSnapshots: ").append(toIndentedString(imageSnapshots)).append("\n");
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
