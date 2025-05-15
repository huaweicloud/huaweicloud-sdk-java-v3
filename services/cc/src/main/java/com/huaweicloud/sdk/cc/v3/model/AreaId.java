package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Area ID。
 */
public class AreaId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_id")

    private AreaIdDef areaId;

    public AreaId withAreaId(AreaIdDef areaId) {
        this.areaId = areaId;
        return this;
    }

    /**
     * Get areaId
     * @return areaId
     */
    public AreaIdDef getAreaId() {
        return areaId;
    }

    public void setAreaId(AreaIdDef areaId) {
        this.areaId = areaId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AreaId that = (AreaId) obj;
        return Objects.equals(this.areaId, that.areaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AreaId {\n");
        sb.append("    areaId: ").append(toIndentedString(areaId)).append("\n");
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
