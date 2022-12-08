package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAvailableZoneInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zones")

    private AvailabilityZones availabilityZones;

    public ShowAvailableZoneInfoResponse withAvailabilityZones(AvailabilityZones availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public ShowAvailableZoneInfoResponse withAvailabilityZones(Consumer<AvailabilityZones> availabilityZonesSetter) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new AvailabilityZones();
            availabilityZonesSetter.accept(this.availabilityZones);
        }

        return this;
    }

    /**
     * Get availabilityZones
     * @return availabilityZones
     */
    public AvailabilityZones getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(AvailabilityZones availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAvailableZoneInfoResponse showAvailableZoneInfoResponse = (ShowAvailableZoneInfoResponse) o;
        return Objects.equals(this.availabilityZones, showAvailableZoneInfoResponse.availabilityZones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvailableZoneInfoResponse {\n");
        sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
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
