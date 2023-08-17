package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateUpdateVrrpConfigRequestBody
 */
public class CreateUpdateVrrpConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_ip")

    private String virtualIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_equipment_id")

    private String activeEquipmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_interface_name")

    private String activeInterfaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_equipment_id")

    private String standbyEquipmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_interface_name")

    private String standbyInterfaceName;

    public CreateUpdateVrrpConfigRequestBody withVirtualIp(String virtualIp) {
        this.virtualIp = virtualIp;
        return this;
    }

    /**
     * 虚IP
     * @return virtualIp
     */
    public String getVirtualIp() {
        return virtualIp;
    }

    public void setVirtualIp(String virtualIp) {
        this.virtualIp = virtualIp;
    }

    public CreateUpdateVrrpConfigRequestBody withActiveEquipmentId(String activeEquipmentId) {
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

    public CreateUpdateVrrpConfigRequestBody withActiveInterfaceName(String activeInterfaceName) {
        this.activeInterfaceName = activeInterfaceName;
        return this;
    }

    /**
     * 主设备接口名字
     * @return activeInterfaceName
     */
    public String getActiveInterfaceName() {
        return activeInterfaceName;
    }

    public void setActiveInterfaceName(String activeInterfaceName) {
        this.activeInterfaceName = activeInterfaceName;
    }

    public CreateUpdateVrrpConfigRequestBody withStandbyEquipmentId(String standbyEquipmentId) {
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

    public CreateUpdateVrrpConfigRequestBody withStandbyInterfaceName(String standbyInterfaceName) {
        this.standbyInterfaceName = standbyInterfaceName;
        return this;
    }

    /**
     * 备设备接口名字
     * @return standbyInterfaceName
     */
    public String getStandbyInterfaceName() {
        return standbyInterfaceName;
    }

    public void setStandbyInterfaceName(String standbyInterfaceName) {
        this.standbyInterfaceName = standbyInterfaceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUpdateVrrpConfigRequestBody that = (CreateUpdateVrrpConfigRequestBody) obj;
        return Objects.equals(this.virtualIp, that.virtualIp)
            && Objects.equals(this.activeEquipmentId, that.activeEquipmentId)
            && Objects.equals(this.activeInterfaceName, that.activeInterfaceName)
            && Objects.equals(this.standbyEquipmentId, that.standbyEquipmentId)
            && Objects.equals(this.standbyInterfaceName, that.standbyInterfaceName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(virtualIp, activeEquipmentId, activeInterfaceName, standbyEquipmentId, standbyInterfaceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUpdateVrrpConfigRequestBody {\n");
        sb.append("    virtualIp: ").append(toIndentedString(virtualIp)).append("\n");
        sb.append("    activeEquipmentId: ").append(toIndentedString(activeEquipmentId)).append("\n");
        sb.append("    activeInterfaceName: ").append(toIndentedString(activeInterfaceName)).append("\n");
        sb.append("    standbyEquipmentId: ").append(toIndentedString(standbyEquipmentId)).append("\n");
        sb.append("    standbyInterfaceName: ").append(toIndentedString(standbyInterfaceName)).append("\n");
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
