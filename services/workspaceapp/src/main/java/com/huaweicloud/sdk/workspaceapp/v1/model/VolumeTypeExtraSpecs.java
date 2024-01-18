package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VolumeTypeExtraSpecs
 */
public class VolumeTypeExtraSpecs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sold_out_availability_zone")

    private String soldOutAvailabilityZone;

    public VolumeTypeExtraSpecs withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 该类型磁盘对应的可用分区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public VolumeTypeExtraSpecs withSoldOutAvailabilityZone(String soldOutAvailabilityZone) {
        this.soldOutAvailabilityZone = soldOutAvailabilityZone;
        return this;
    }

    /**
     * 已售罄的磁盘可用区。
     * @return soldOutAvailabilityZone
     */
    public String getSoldOutAvailabilityZone() {
        return soldOutAvailabilityZone;
    }

    public void setSoldOutAvailabilityZone(String soldOutAvailabilityZone) {
        this.soldOutAvailabilityZone = soldOutAvailabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeTypeExtraSpecs that = (VolumeTypeExtraSpecs) obj;
        return Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.soldOutAvailabilityZone, that.soldOutAvailabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone, soldOutAvailabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeTypeExtraSpecs {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    soldOutAvailabilityZone: ").append(toIndentedString(soldOutAvailabilityZone)).append("\n");
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
