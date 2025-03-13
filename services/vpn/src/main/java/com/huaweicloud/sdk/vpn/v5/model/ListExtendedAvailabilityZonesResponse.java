package com.huaweicloud.sdk.vpn.v5.model;

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
public class ListExtendedAvailabilityZonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zones")

    private List<ExtendedAvailabilityZone> availabilityZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListExtendedAvailabilityZonesResponse withAvailabilityZones(
        List<ExtendedAvailabilityZone> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public ListExtendedAvailabilityZonesResponse addAvailabilityZonesItem(
        ExtendedAvailabilityZone availabilityZonesItem) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        this.availabilityZones.add(availabilityZonesItem);
        return this;
    }

    public ListExtendedAvailabilityZonesResponse withAvailabilityZones(
        Consumer<List<ExtendedAvailabilityZone>> availabilityZonesSetter) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        availabilityZonesSetter.accept(this.availabilityZones);
        return this;
    }

    /**
     * Get availabilityZones
     * @return availabilityZones
     */
    public List<ExtendedAvailabilityZone> getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(List<ExtendedAvailabilityZone> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public ListExtendedAvailabilityZonesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListExtendedAvailabilityZonesResponse that = (ListExtendedAvailabilityZonesResponse) obj;
        return Objects.equals(this.availabilityZones, that.availabilityZones)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZones, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExtendedAvailabilityZonesResponse {\n");
        sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
