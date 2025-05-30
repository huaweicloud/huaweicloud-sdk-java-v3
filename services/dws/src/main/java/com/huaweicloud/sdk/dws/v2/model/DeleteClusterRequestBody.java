package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 删除集群请求信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class DeleteClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_last_manual_snapshot")

    private Integer keepLastManualSnapshot;

    public DeleteClusterRequestBody withKeepLastManualSnapshot(Integer keepLastManualSnapshot) {
        this.keepLastManualSnapshot = keepLastManualSnapshot;
        return this;
    }

    /**
     * **参数解释**： 集群需要保留的快照数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return keepLastManualSnapshot
     */
    public Integer getKeepLastManualSnapshot() {
        return keepLastManualSnapshot;
    }

    public void setKeepLastManualSnapshot(Integer keepLastManualSnapshot) {
        this.keepLastManualSnapshot = keepLastManualSnapshot;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteClusterRequestBody that = (DeleteClusterRequestBody) obj;
        return Objects.equals(this.keepLastManualSnapshot, that.keepLastManualSnapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepLastManualSnapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteClusterRequestBody {\n");
        sb.append("    keepLastManualSnapshot: ").append(toIndentedString(keepLastManualSnapshot)).append("\n");
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
