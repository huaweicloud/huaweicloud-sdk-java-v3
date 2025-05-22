package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 规格变更请求信息。 **取值范围**： 不涉及。
 */
public class SpecResizeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_flavor_id")

    private String targetFlavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_backup")

    private Boolean forceBackup;

    public SpecResizeRequest withTargetFlavorId(String targetFlavorId) {
        this.targetFlavorId = targetFlavorId;
        return this;
    }

    /**
     * **参数解释**： 目标规格ID。 **取值范围**： 不涉及。
     * @return targetFlavorId
     */
    public String getTargetFlavorId() {
        return targetFlavorId;
    }

    public void setTargetFlavorId(String targetFlavorId) {
        this.targetFlavorId = targetFlavorId;
    }

    public SpecResizeRequest withForceBackup(Boolean forceBackup) {
        this.forceBackup = forceBackup;
        return this;
    }

    /**
     * **参数解释**： 强制备份。字段已废弃，不再生效。 **取值范围**： 不涉及。
     * @return forceBackup
     */
    public Boolean getForceBackup() {
        return forceBackup;
    }

    public void setForceBackup(Boolean forceBackup) {
        this.forceBackup = forceBackup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpecResizeRequest that = (SpecResizeRequest) obj;
        return Objects.equals(this.targetFlavorId, that.targetFlavorId)
            && Objects.equals(this.forceBackup, that.forceBackup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetFlavorId, forceBackup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecResizeRequest {\n");
        sb.append("    targetFlavorId: ").append(toIndentedString(targetFlavorId)).append("\n");
        sb.append("    forceBackup: ").append(toIndentedString(forceBackup)).append("\n");
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
