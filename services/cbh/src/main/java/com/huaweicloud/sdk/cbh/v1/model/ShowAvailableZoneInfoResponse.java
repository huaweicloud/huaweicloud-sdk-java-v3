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
    @JsonProperty(value = "availability_zone")

    private AvailabilityZones availabilityZone;

    public ShowAvailableZoneInfoResponse withAvailabilityZone(AvailabilityZones availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public ShowAvailableZoneInfoResponse withAvailabilityZone(Consumer<AvailabilityZones> availabilityZoneSetter) {
        if (this.availabilityZone == null) {
            this.availabilityZone = new AvailabilityZones();
            availabilityZoneSetter.accept(this.availabilityZone);
        }

        return this;
    }

    /**
     * Get availabilityZone
     * @return availabilityZone
     */
    public AvailabilityZones getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(AvailabilityZones availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAvailableZoneInfoResponse that = (ShowAvailableZoneInfoResponse) obj;
        return Objects.equals(this.availabilityZone, that.availabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvailableZoneInfoResponse {\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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
