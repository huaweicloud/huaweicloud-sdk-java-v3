package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteEquipmentStaticRouteConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ieg_id")

    private String iegId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "equipment_id")

    private String equipmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_hop")

    private String nextHop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface_name")

    private String interfaceName;

    public DeleteEquipmentStaticRouteConfigRequest withIegId(String iegId) {
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

    public DeleteEquipmentStaticRouteConfigRequest withEquipmentId(String equipmentId) {
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

    public DeleteEquipmentStaticRouteConfigRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 目标网络
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public DeleteEquipmentStaticRouteConfigRequest withNextHop(String nextHop) {
        this.nextHop = nextHop;
        return this;
    }

    /**
     * 下一跳地址
     * @return nextHop
     */
    public String getNextHop() {
        return nextHop;
    }

    public void setNextHop(String nextHop) {
        this.nextHop = nextHop;
    }

    public DeleteEquipmentStaticRouteConfigRequest withInterfaceName(String interfaceName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteEquipmentStaticRouteConfigRequest that = (DeleteEquipmentStaticRouteConfigRequest) obj;
        return Objects.equals(this.iegId, that.iegId) && Objects.equals(this.equipmentId, that.equipmentId)
            && Objects.equals(this.prefix, that.prefix) && Objects.equals(this.nextHop, that.nextHop)
            && Objects.equals(this.interfaceName, that.interfaceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iegId, equipmentId, prefix, nextHop, interfaceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEquipmentStaticRouteConfigRequest {\n");
        sb.append("    iegId: ").append(toIndentedString(iegId)).append("\n");
        sb.append("    equipmentId: ").append(toIndentedString(equipmentId)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    nextHop: ").append(toIndentedString(nextHop)).append("\n");
        sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
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
