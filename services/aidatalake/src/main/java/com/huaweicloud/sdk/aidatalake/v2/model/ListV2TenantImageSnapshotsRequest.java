package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListV2TenantImageSnapshotsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ImageSnapshotStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListV2TenantImageSnapshotsRequest withStatus(ImageSnapshotStatus status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：镜像快照状态。 **约束限制**：不涉及。 **取值范围**：   - Creating：创建中。   - Available：可用。   - Unavailable：不可用。 **默认取值**：不涉及。 
     * @return status
     */
    public ImageSnapshotStatus getStatus() {
        return status;
    }

    public void setStatus(ImageSnapshotStatus status) {
        this.status = status;
    }

    public ListV2TenantImageSnapshotsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：偏移量，表示从此偏移量开始查询。 **约束限制**：不涉及。 **取值范围**：0~1000000000。 **默认取值**：0。
     * minimum: 0
     * maximum: 1000000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListV2TenantImageSnapshotsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：分页大小。 **约束限制**：不涉及。 **取值范围**：1~1000。 **默认取值**：100。 
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2TenantImageSnapshotsRequest that = (ListV2TenantImageSnapshotsRequest) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2TenantImageSnapshotsRequest {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
