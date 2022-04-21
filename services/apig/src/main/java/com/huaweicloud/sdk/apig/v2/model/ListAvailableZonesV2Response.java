package com.huaweicloud.sdk.apig.v2.model;

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
public class ListAvailableZonesV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<AvailableZone> availableZones = null;

    public ListAvailableZonesV2Response withAvailableZones(List<AvailableZone> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ListAvailableZonesV2Response addAvailableZonesItem(AvailableZone availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ListAvailableZonesV2Response withAvailableZones(Consumer<List<AvailableZone>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用区列表
     * @return availableZones
     */
    public List<AvailableZone> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<AvailableZone> availableZones) {
        this.availableZones = availableZones;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAvailableZonesV2Response listAvailableZonesV2Response = (ListAvailableZonesV2Response) o;
        return Objects.equals(this.availableZones, listAvailableZonesV2Response.availableZones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableZones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableZonesV2Response {\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
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
