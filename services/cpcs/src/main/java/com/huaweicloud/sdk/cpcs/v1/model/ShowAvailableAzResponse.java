package com.huaweicloud.sdk.cpcs.v1.model;

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
public class ShowAvailableAzResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private List<ShowAvailableAzResponsebodyAvailabilityZone> availabilityZone = null;

    public ShowAvailableAzResponse withAvailabilityZone(
        List<ShowAvailableAzResponsebodyAvailabilityZone> availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public ShowAvailableAzResponse addAvailabilityZoneItem(
        ShowAvailableAzResponsebodyAvailabilityZone availabilityZoneItem) {
        if (this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        this.availabilityZone.add(availabilityZoneItem);
        return this;
    }

    public ShowAvailableAzResponse withAvailabilityZone(
        Consumer<List<ShowAvailableAzResponsebodyAvailabilityZone>> availabilityZoneSetter) {
        if (this.availabilityZone == null) {
            this.availabilityZone = new ArrayList<>();
        }
        availabilityZoneSetter.accept(this.availabilityZone);
        return this;
    }

    /**
     * 可用区列表
     * @return availabilityZone
     */
    public List<ShowAvailableAzResponsebodyAvailabilityZone> getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(List<ShowAvailableAzResponsebodyAvailabilityZone> availabilityZone) {
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
        ShowAvailableAzResponse that = (ShowAvailableAzResponse) obj;
        return Objects.equals(this.availabilityZone, that.availabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAvailableAzResponse {\n");
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
