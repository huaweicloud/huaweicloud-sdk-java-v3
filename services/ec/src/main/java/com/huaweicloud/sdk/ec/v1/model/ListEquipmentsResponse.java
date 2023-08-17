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
public class ListEquipmentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "equipments")

    private List<EquipmentItem> equipments = null;

    public ListEquipmentsResponse withEquipments(List<EquipmentItem> equipments) {
        this.equipments = equipments;
        return this;
    }

    public ListEquipmentsResponse addEquipmentsItem(EquipmentItem equipmentsItem) {
        if (this.equipments == null) {
            this.equipments = new ArrayList<>();
        }
        this.equipments.add(equipmentsItem);
        return this;
    }

    public ListEquipmentsResponse withEquipments(Consumer<List<EquipmentItem>> equipmentsSetter) {
        if (this.equipments == null) {
            this.equipments = new ArrayList<>();
        }
        equipmentsSetter.accept(this.equipments);
        return this;
    }

    /**
     * 设备基本信息列表
     * @return equipments
     */
    public List<EquipmentItem> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<EquipmentItem> equipments) {
        this.equipments = equipments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEquipmentsResponse that = (ListEquipmentsResponse) obj;
        return Objects.equals(this.equipments, that.equipments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEquipmentsResponse {\n");
        sb.append("    equipments: ").append(toIndentedString(equipments)).append("\n");
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
