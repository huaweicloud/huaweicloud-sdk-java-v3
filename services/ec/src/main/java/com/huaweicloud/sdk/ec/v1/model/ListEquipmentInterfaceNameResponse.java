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
public class ListEquipmentInterfaceNameResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface_names")

    private List<String> interfaceNames = null;

    public ListEquipmentInterfaceNameResponse withInterfaceNames(List<String> interfaceNames) {
        this.interfaceNames = interfaceNames;
        return this;
    }

    public ListEquipmentInterfaceNameResponse addInterfaceNamesItem(String interfaceNamesItem) {
        if (this.interfaceNames == null) {
            this.interfaceNames = new ArrayList<>();
        }
        this.interfaceNames.add(interfaceNamesItem);
        return this;
    }

    public ListEquipmentInterfaceNameResponse withInterfaceNames(Consumer<List<String>> interfaceNamesSetter) {
        if (this.interfaceNames == null) {
            this.interfaceNames = new ArrayList<>();
        }
        interfaceNamesSetter.accept(this.interfaceNames);
        return this;
    }

    /**
     * 设备接口名字列表
     * @return interfaceNames
     */
    public List<String> getInterfaceNames() {
        return interfaceNames;
    }

    public void setInterfaceNames(List<String> interfaceNames) {
        this.interfaceNames = interfaceNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEquipmentInterfaceNameResponse that = (ListEquipmentInterfaceNameResponse) obj;
        return Objects.equals(this.interfaceNames, that.interfaceNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interfaceNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEquipmentInterfaceNameResponse {\n");
        sb.append("    interfaceNames: ").append(toIndentedString(interfaceNames)).append("\n");
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
