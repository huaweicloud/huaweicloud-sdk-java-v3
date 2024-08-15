package com.huaweicloud.sdk.cdm.v1.model;

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
public class ShowAvailabilityZonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regionId")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultAZ")

    private String defaultAZ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availableZones")

    private List<CdmClusterAvailabilityZone> availableZones = null;

    public ShowAvailabilityZonesResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowAvailabilityZonesResponse withDefaultAZ(String defaultAZ) {
        this.defaultAZ = defaultAZ;
        return this;
    }

    /**
     * 默认可用区。
     * @return defaultAZ
     */
    public String getDefaultAZ() {
        return defaultAZ;
    }

    public void setDefaultAZ(String defaultAZ) {
        this.defaultAZ = defaultAZ;
    }

    public ShowAvailabilityZonesResponse withAvailableZones(List<CdmClusterAvailabilityZone> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    public ShowAvailabilityZonesResponse addAvailableZonesItem(CdmClusterAvailabilityZone availableZonesItem) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ShowAvailabilityZonesResponse withAvailableZones(
        Consumer<List<CdmClusterAvailabilityZone>> availableZonesSetter) {
        if (this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用区。
     * @return availableZones
     */
    public List<CdmClusterAvailabilityZone> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<CdmClusterAvailabilityZone> availableZones) {
        this.availableZones = availableZones;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAvailabilityZonesResponse that = (ShowAvailabilityZonesResponse) obj;
        return Objects.equals(this.regionId, that.regionId) && Objects.equals(this.defaultAZ, that.defaultAZ)
            && Objects.equals(this.availableZones, that.availableZones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionId, defaultAZ, availableZones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvailabilityZonesResponse {\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    defaultAZ: ").append(toIndentedString(defaultAZ)).append("\n");
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
