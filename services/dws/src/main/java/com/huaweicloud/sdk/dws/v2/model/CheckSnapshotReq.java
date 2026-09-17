package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckSnapshotReq
 */
public class CheckSnapshotReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_name")

    private String snapshotName;

    public CheckSnapshotReq withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    /**
     * **参数解释**： 快照名称。 **约束限制**： 不涉及。 **取值范围**： 非空字符串。 **默认取值**： 不涉及。
     * @return snapshotName
     */
    public String getSnapshotName() {
        return snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckSnapshotReq that = (CheckSnapshotReq) obj;
        return Objects.equals(this.snapshotName, that.snapshotName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckSnapshotReq {\n");
        sb.append("    snapshotName: ").append(toIndentedString(snapshotName)).append("\n");
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
