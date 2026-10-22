package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 快照回滚信息。
 */
public class RollbackSnapshotRequestBodyNew {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_id")

    private String volumeId;

    public RollbackSnapshotRequestBodyNew withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释** 回滚的目标云硬盘名称。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RollbackSnapshotRequestBodyNew withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * **参数解释** 回滚的目标云硬盘UUID。 **约束限制** 不涉及。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RollbackSnapshotRequestBodyNew that = (RollbackSnapshotRequestBodyNew) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.volumeId, that.volumeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, volumeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RollbackSnapshotRequestBodyNew {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
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
