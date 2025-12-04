package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDedicatedHostAllTypesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    public ListDedicatedHostAllTypesRequest withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ListDedicatedHostAllTypesRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Get availabilityZone
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ListDedicatedHostAllTypesRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get limit
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListDedicatedHostAllTypesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListDedicatedHostAllTypesRequest withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * Get hostType
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDedicatedHostAllTypesRequest that = (ListDedicatedHostAllTypesRequest) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.hostType, that.hostType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, availabilityZone, limit, marker, hostType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDedicatedHostAllTypesRequest {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
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
