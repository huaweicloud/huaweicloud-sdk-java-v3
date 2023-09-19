package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 主备版的多AZ可用区详情
 */
public class AvailabilityZoneDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_availability_zone")

    private String primaryAvailabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_availability_zone")

    private String secondaryAvailabilityZone;

    public AvailabilityZoneDetail withPrimaryAvailabilityZone(String primaryAvailabilityZone) {
        this.primaryAvailabilityZone = primaryAvailabilityZone;
        return this;
    }

    /**
     * 主可用区，应为单可用区且和备可用区不同
     * @return primaryAvailabilityZone
     */
    public String getPrimaryAvailabilityZone() {
        return primaryAvailabilityZone;
    }

    public void setPrimaryAvailabilityZone(String primaryAvailabilityZone) {
        this.primaryAvailabilityZone = primaryAvailabilityZone;
    }

    public AvailabilityZoneDetail withSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
        return this;
    }

    /**
     * 备可用区，应为单可用区且和主可用区不同
     * @return secondaryAvailabilityZone
     */
    public String getSecondaryAvailabilityZone() {
        return secondaryAvailabilityZone;
    }

    public void setSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvailabilityZoneDetail that = (AvailabilityZoneDetail) obj;
        return Objects.equals(this.primaryAvailabilityZone, that.primaryAvailabilityZone)
            && Objects.equals(this.secondaryAvailabilityZone, that.secondaryAvailabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryAvailabilityZone, secondaryAvailabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailabilityZoneDetail {\n");
        sb.append("    primaryAvailabilityZone: ").append(toIndentedString(primaryAvailabilityZone)).append("\n");
        sb.append("    secondaryAvailabilityZone: ").append(toIndentedString(secondaryAvailabilityZone)).append("\n");
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
