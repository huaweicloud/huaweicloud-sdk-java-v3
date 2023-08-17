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
public class ShowEquipmentSpecificConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model")

    private String model;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wan_interfaces")

    private List<String> wanInterfaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lte_interfaces")

    private List<String> lteInterfaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lan_interfaces")

    private List<String> lanInterfaces = null;

    public ShowEquipmentSpecificConfigResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 设备类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowEquipmentSpecificConfigResponse withModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 设备型号
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ShowEquipmentSpecificConfigResponse withWanInterfaces(List<String> wanInterfaces) {
        this.wanInterfaces = wanInterfaces;
        return this;
    }

    public ShowEquipmentSpecificConfigResponse addWanInterfacesItem(String wanInterfacesItem) {
        if (this.wanInterfaces == null) {
            this.wanInterfaces = new ArrayList<>();
        }
        this.wanInterfaces.add(wanInterfacesItem);
        return this;
    }

    public ShowEquipmentSpecificConfigResponse withWanInterfaces(Consumer<List<String>> wanInterfacesSetter) {
        if (this.wanInterfaces == null) {
            this.wanInterfaces = new ArrayList<>();
        }
        wanInterfacesSetter.accept(this.wanInterfaces);
        return this;
    }

    /**
     * WAN口列表
     * @return wanInterfaces
     */
    public List<String> getWanInterfaces() {
        return wanInterfaces;
    }

    public void setWanInterfaces(List<String> wanInterfaces) {
        this.wanInterfaces = wanInterfaces;
    }

    public ShowEquipmentSpecificConfigResponse withLteInterfaces(List<String> lteInterfaces) {
        this.lteInterfaces = lteInterfaces;
        return this;
    }

    public ShowEquipmentSpecificConfigResponse addLteInterfacesItem(String lteInterfacesItem) {
        if (this.lteInterfaces == null) {
            this.lteInterfaces = new ArrayList<>();
        }
        this.lteInterfaces.add(lteInterfacesItem);
        return this;
    }

    public ShowEquipmentSpecificConfigResponse withLteInterfaces(Consumer<List<String>> lteInterfacesSetter) {
        if (this.lteInterfaces == null) {
            this.lteInterfaces = new ArrayList<>();
        }
        lteInterfacesSetter.accept(this.lteInterfaces);
        return this;
    }

    /**
     * LTE口列表
     * @return lteInterfaces
     */
    public List<String> getLteInterfaces() {
        return lteInterfaces;
    }

    public void setLteInterfaces(List<String> lteInterfaces) {
        this.lteInterfaces = lteInterfaces;
    }

    public ShowEquipmentSpecificConfigResponse withLanInterfaces(List<String> lanInterfaces) {
        this.lanInterfaces = lanInterfaces;
        return this;
    }

    public ShowEquipmentSpecificConfigResponse addLanInterfacesItem(String lanInterfacesItem) {
        if (this.lanInterfaces == null) {
            this.lanInterfaces = new ArrayList<>();
        }
        this.lanInterfaces.add(lanInterfacesItem);
        return this;
    }

    public ShowEquipmentSpecificConfigResponse withLanInterfaces(Consumer<List<String>> lanInterfacesSetter) {
        if (this.lanInterfaces == null) {
            this.lanInterfaces = new ArrayList<>();
        }
        lanInterfacesSetter.accept(this.lanInterfaces);
        return this;
    }

    /**
     * LAN口列表
     * @return lanInterfaces
     */
    public List<String> getLanInterfaces() {
        return lanInterfaces;
    }

    public void setLanInterfaces(List<String> lanInterfaces) {
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
        ShowEquipmentSpecificConfigResponse that = (ShowEquipmentSpecificConfigResponse) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.model, that.model)
            && Objects.equals(this.wanInterfaces, that.wanInterfaces)
            && Objects.equals(this.lteInterfaces, that.lteInterfaces)
            && Objects.equals(this.lanInterfaces, that.lanInterfaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, model, wanInterfaces, lteInterfaces, lanInterfaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEquipmentSpecificConfigResponse {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    wanInterfaces: ").append(toIndentedString(wanInterfaces)).append("\n");
        sb.append("    lteInterfaces: ").append(toIndentedString(lteInterfaces)).append("\n");
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
