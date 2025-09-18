package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 本端大区ID。
 */
public class LocalAreaId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_area_id")

    private LocalAreaIdDef localAreaId;

    public LocalAreaId withLocalAreaId(LocalAreaIdDef localAreaId) {
        this.localAreaId = localAreaId;
        return this;
    }

    /**
     * Get localAreaId
     * @return localAreaId
     */
    public LocalAreaIdDef getLocalAreaId() {
        return localAreaId;
    }

    public void setLocalAreaId(LocalAreaIdDef localAreaId) {
        this.localAreaId = localAreaId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LocalAreaId that = (LocalAreaId) obj;
        return Objects.equals(this.localAreaId, that.localAreaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localAreaId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalAreaId {\n");
        sb.append("    localAreaId: ").append(toIndentedString(localAreaId)).append("\n");
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
