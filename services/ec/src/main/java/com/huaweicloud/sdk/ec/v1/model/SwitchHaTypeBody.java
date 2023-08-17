package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SwitchHaTypeBody
 */
public class SwitchHaTypeBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_equipment_id")

    private String activeEquipmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_equipment_id")

    private String standbyEquipmentId;

    public SwitchHaTypeBody withActiveEquipmentId(String activeEquipmentId) {
        this.activeEquipmentId = activeEquipmentId;
        return this;
    }

    /**
     * 主设备ID
     * @return activeEquipmentId
     */
    public String getActiveEquipmentId() {
        return activeEquipmentId;
    }

    public void setActiveEquipmentId(String activeEquipmentId) {
        this.activeEquipmentId = activeEquipmentId;
    }

    public SwitchHaTypeBody withStandbyEquipmentId(String standbyEquipmentId) {
        this.standbyEquipmentId = standbyEquipmentId;
        return this;
    }

    /**
     * 备设备ID
     * @return standbyEquipmentId
     */
    public String getStandbyEquipmentId() {
        return standbyEquipmentId;
    }

    public void setStandbyEquipmentId(String standbyEquipmentId) {
        this.standbyEquipmentId = standbyEquipmentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchHaTypeBody that = (SwitchHaTypeBody) obj;
        return Objects.equals(this.activeEquipmentId, that.activeEquipmentId)
            && Objects.equals(this.standbyEquipmentId, that.standbyEquipmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeEquipmentId, standbyEquipmentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchHaTypeBody {\n");
        sb.append("    activeEquipmentId: ").append(toIndentedString(activeEquipmentId)).append("\n");
        sb.append("    standbyEquipmentId: ").append(toIndentedString(standbyEquipmentId)).append("\n");
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
