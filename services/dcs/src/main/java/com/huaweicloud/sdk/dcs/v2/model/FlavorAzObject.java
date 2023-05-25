package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FlavorAzObject
 */
public class FlavorAzObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private String capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zones")

    private List<String> availableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_codes")

    private List<String> azCodes = null;

    public FlavorAzObject withCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * 缓存容量（G Byte）。
     * @return capacity
     */
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public FlavorAzObject withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 缓存容量单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public FlavorAzObject withAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public FlavorAzObject addAvailableZonesItem(String availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public FlavorAzObject withAvailableZones(Consumer<List<String>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用区信息。
     * @return availableZones
     */
    public List<String> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<String> availableZones) {
        this.availableZones = availableZones;
    }

    public FlavorAzObject withAzCodes(List<String> azCodes) {
        this.azCodes = azCodes;
        return this;
    }

    public FlavorAzObject addAzCodesItem(String azCodesItem) {
        if (this.azCodes == null) {
            this.azCodes = new ArrayList<>();
        }
        this.azCodes.add(azCodesItem);
        return this;
    }

    public FlavorAzObject withAzCodes(Consumer<List<String>> azCodesSetter) {
        if (this.azCodes == null) {
            this.azCodes = new ArrayList<>();
        }
        azCodesSetter.accept(this.azCodes);
        return this;
    }

    /**
     * 有资源的可用区编码。
     * @return azCodes
     */
    public List<String> getAzCodes() {
        return azCodes;
    }

    public void setAzCodes(List<String> azCodes) {
        this.azCodes = azCodes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlavorAzObject flavorAzObject = (FlavorAzObject) o;
        return Objects.equals(this.capacity, flavorAzObject.capacity) && Objects.equals(this.unit, flavorAzObject.unit)
            && Objects.equals(this.availableZones, flavorAzObject.availableZones)
            && Objects.equals(this.azCodes, flavorAzObject.azCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, unit, availableZones, azCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorAzObject {\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    azCodes: ").append(toIndentedString(azCodes)).append("\n");
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
