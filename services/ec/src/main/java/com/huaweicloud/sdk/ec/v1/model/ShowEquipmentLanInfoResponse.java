package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowEquipmentLanInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lan_interfaces")

    private List<EquipmentLanItem> lanInterfaces = null;

    public ShowEquipmentLanInfoResponse withLanInterfaces(List<EquipmentLanItem> lanInterfaces) {
        this.lanInterfaces = lanInterfaces;
        return this;
    }

    public ShowEquipmentLanInfoResponse addLanInterfacesItem(EquipmentLanItem lanInterfacesItem) {
        if (this.lanInterfaces == null) {
            this.lanInterfaces = new ArrayList<>();
        }
        this.lanInterfaces.add(lanInterfacesItem);
        return this;
    }

    public ShowEquipmentLanInfoResponse withLanInterfaces(Consumer<List<EquipmentLanItem>> lanInterfacesSetter) {
        if (this.lanInterfaces == null) {
            this.lanInterfaces = new ArrayList<>();
        }
        lanInterfacesSetter.accept(this.lanInterfaces);
        return this;
    }

    /**
     * 设备LAN口配置列表
     * @return lanInterfaces
     */
    public List<EquipmentLanItem> getLanInterfaces() {
        return lanInterfaces;
    }

    public void setLanInterfaces(List<EquipmentLanItem> lanInterfaces) {
        this.lanInterfaces = lanInterfaces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEquipmentLanInfoResponse that = (ShowEquipmentLanInfoResponse) obj;
        return Objects.equals(this.lanInterfaces, that.lanInterfaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lanInterfaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEquipmentLanInfoResponse {\n");
        sb.append("    lanInterfaces: ").append(toIndentedString(lanInterfaces)).append("\n");
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
