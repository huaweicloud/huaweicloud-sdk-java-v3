package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteEquipmentLanConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ieg_id")

    private String iegId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "equipment_id")

    private String equipmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface_name")

    private String interfaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vlan_id")

    private String vlanId;

    public DeleteEquipmentLanConfigRequest withIegId(String iegId) {
        this.iegId = iegId;
        return this;
    }

    /**
     * 智能企业网关ID
     * @return iegId
     */
    public String getIegId() {
        return iegId;
    }

    public void setIegId(String iegId) {
        this.iegId = iegId;
    }

    public DeleteEquipmentLanConfigRequest withEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
        return this;
    }

    /**
     * 智能企业网关设备ID
     * @return equipmentId
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public DeleteEquipmentLanConfigRequest withInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }

    /**
     * 接口名字
     * @return interfaceName
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public DeleteEquipmentLanConfigRequest withVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * VlanID
     * @return vlanId
     */
    public String getVlanId() {
        return vlanId;
    }

    public void setVlanId(String vlanId) {
        this.vlanId = vlanId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteEquipmentLanConfigRequest that = (DeleteEquipmentLanConfigRequest) obj;
        return Objects.equals(this.iegId, that.iegId) && Objects.equals(this.equipmentId, that.equipmentId)
            && Objects.equals(this.interfaceName, that.interfaceName) && Objects.equals(this.vlanId, that.vlanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iegId, equipmentId, interfaceName, vlanId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEquipmentLanConfigRequest {\n");
        sb.append("    iegId: ").append(toIndentedString(iegId)).append("\n");
        sb.append("    equipmentId: ").append(toIndentedString(equipmentId)).append("\n");
        sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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
