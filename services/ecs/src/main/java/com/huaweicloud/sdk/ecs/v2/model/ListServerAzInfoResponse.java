package com.huaweicloud.sdk.ecs.v2.model;

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
public class ListServerAzInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zones")

    private List<ListServerAzInfo> availabilityZones = null;

    public ListServerAzInfoResponse withAvailabilityZones(List<ListServerAzInfo> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    public ListServerAzInfoResponse addAvailabilityZonesItem(ListServerAzInfo availabilityZonesItem) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        this.availabilityZones.add(availabilityZonesItem);
        return this;
    }

    public ListServerAzInfoResponse withAvailabilityZones(Consumer<List<ListServerAzInfo>> availabilityZonesSetter) {
        if (this.availabilityZones == null) {
            this.availabilityZones = new ArrayList<>();
        }
        availabilityZonesSetter.accept(this.availabilityZones);
        return this;
    }

    /**
     * az详情信息
     * @return availabilityZones
     */
    public List<ListServerAzInfo> getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(List<ListServerAzInfo> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServerAzInfoResponse that = (ListServerAzInfoResponse) obj;
        return Objects.equals(this.availabilityZones, that.availabilityZones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerAzInfoResponse {\n");
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
